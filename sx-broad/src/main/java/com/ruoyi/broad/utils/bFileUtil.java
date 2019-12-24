package com.ruoyi.broad.utils;

import com.ruoyi.broad.domain.Program;
import com.ruoyi.common.utils.DateUtil;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class bFileUtil {
    private static Logger logger = LoggerFactory.getLogger(bFileUtil.class);
    /**
     * 图片存储 完整路径（{user.home}/img/coldStone/XXX.jpg）
     * @param file
     * @return 返回相对路径
     */
    public static String saveImg(MultipartFile file,String saveName) {
        //获取文件上传的根目录 C:\Users\wanghao/upload/img
        String  path = bConstant.UPLOAD_PATH + bConstant.MP3_FILE_NAME; //改为bConstant.UPLOAD_PATH

        //拿到文件的后缀名和UUID进行拼接形成新的文件名
        //4ca64e85b1544c96b4a6154bb521476f.jpg
        //String saveName = bCommonUtil.getUuid() + "." + getFileSuffix(file.getOriginalFilename());
        logger.info(" --- 音频保存路径：{}, 音频保存名称：{},文件名称：{} --- ", path, saveName,file.getOriginalFilename());

        // 保存
        try {
            // 保存文件音频
            File targetFile = new File(path);
            if (!targetFile.exists()) {
                targetFile.mkdirs();
            }
            file.transferTo(new File(path + "/" + saveName));  //文件保存，写入内存
        } catch (Exception e) {
            e.printStackTrace();
            logger.debug("--- 音频保存异常：{} ---" + e.getMessage());
            return null;
        }
        String filePath =  bConstant.UPLOAD_PATH;
        //返回相对路径  img/virtual/4ca64e85b1544c96b4a6154bb521476f.jpg
        return saveName; //filePath + "/" + saveName
    }
    /**
     * 返回截取的文件后缀
     * @param path
     * @return
     */
    public static String getFileSuffix(String path) {
        return getFileSuffix(path, "2");
    }

    /**
     * 获取文件名称或后缀(最后一个"."之后内容)
     * @param path
     * @param type 1名称 2后缀
     * @return
     */
    public static String getFileSuffix(String path, String type){
        if(StringUtils.isNotEmpty(path) && path.indexOf(".") > 0) {
            // 名称
            String name = path.substring(0, path.lastIndexOf("."));

            // 后缀
            String suffix = path.substring(path.lastIndexOf(".") + 1);

            return StringUtils.equals("1", type) ? name : suffix;
        } else {
            return null;
        }
    }

    /**
     * 文件上传封装
     * @param maxfileid
     * @param file
     * @param fname
     * @param flenth
     * @param fsize
     * @param year
     * @return Program
     */
    public static Program uplodeFile(String maxfileid,MultipartFile file,String fname,String flenth,String fsize,String year,String uname){
        Program g = new Program();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

        int fileid = 0;
        if(maxfileid!=null&& Integer.parseInt(maxfileid)>10){
            fileid = Integer.parseInt(maxfileid)+1;
        }else{
            fileid = 1;
        }
        int j=0; //上传多个的时候用的
        String filename ="";
        String failfile="";//添加失败的节目
        if(file!=null ){
            filename = fileid+j+"";
            while(filename.length()<5){
                filename = "0"+filename;
            }
            filename = year.substring(2)+filename;
            if (null != file && !file.isEmpty()) {
                filename =filename+"."+bFileUtil.getFileSuffix(file.getOriginalFilename()); //filename字段
                if(flenth!="NaN"&&!flenth.equals("")){
//                    Double lenth = Double.parseDouble(flenth)*1000;
//                    String l = DateUtil.formatLongToTimeStr(lenth.longValue());
//                    g.setFlenth(l);
                    //System.out.println("flenth:--"+flenth);
                    g.setFlenth(flenth);
                }else{
                    failfile = fname+"获取时长信息出错，";
                }
                //System.out.println("fname:--"+fname);
                g.setFname(fname); //fname.substring(0, fname.lastIndexOf("."))
                //String filePath = bPathUtil.getClasspath() + bConst.FILEPATHPER;			//文件上传路径
                String mp3 = saveImg(file,filename);//////////////////////////
                //System.out.println("filename:--"+filename);
                g.setFilename(filename);
                //System.out.println("Userid:--"+bJurisdiction.getUserid()); //有错误///////////////////////////////
                //g.setUserid(bJurisdiction.getUserid());
                //System.out.println("Address:--"+bPathUtil.getClasspath() + bConst.FILEPATHPER+path);
                g.setAddress(bPathUtil.getClasspath() + bConst.FILEPATHPER+mp3);
                //System.out.println("Urls:--"+bConst.FILEPATHPER+path);
                g.setUrls(bConst.FILEPATHPER+mp3);
                g.setUserid(uname);
                //System.out.println("Createdtime:--"+df.format(new Date()));
                g.setCreatedtime(df.format(new Date()));
                g.setIspublic(false);
                g.setIslisten(true);
                if(fsize!=null&&!fsize.equals("")){
                    BigDecimal b   =   new   BigDecimal(fsize);
                    g.setFsize(b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue() );//四舍五入 两位小数
                }
                j++;
            }

        }
        return g;
    }

    /**
     * 删除文件
     * @param filePathAndName
     *            String 文件路径及名称 如c:/fqf.txt
     * @param filePathAndName
     *            String
     * @return boolean
     */
    public static boolean delFile(String filePathAndName) {
        try {
            String filePath = filePathAndName;
            filePath = filePath.toString();
            java.io.File myDelFile = new java.io.File(filePath);
            if(myDelFile.exists()) {
                myDelFile.delete();
                return true;
            }
        } catch (Exception e) {
            System.out.println("删除文件操作出错");
            e.printStackTrace();
        }
        return false;
    }
}