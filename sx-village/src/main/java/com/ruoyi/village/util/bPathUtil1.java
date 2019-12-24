package com.ruoyi.village.util;

import com.ruoyi.common.config.Global;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * 说明：路径工具类
 * 创建人：FH Q313596790
 * 修改时间：2014年9月20日
 * @version
 */
public class bPathUtil1 {

    /**
     * 图片访问路径
     * @param pathType
     *            图片类型 visit-访问；save-保存
     * @param pathCategory
     *            图片类别，如：话题图片-topic、话题回复图片-reply、商家图片
     * @return
     */
    public static String getPicturePath(String pathType, String pathCategory) {
        String strResult = "";
        StringBuffer strBuf = new StringBuffer();
        if ("visit".equals(pathType)) {
        } else if ("save".equals(pathType)) {
            String projectPath = bPublicUtil1.getPorjectPath().replaceAll("\\\\",
                    "/");
            projectPath = splitString(projectPath, "bin/");
            strBuf.append(projectPath);
            strBuf.append("webapps/ROOT/");
        }
        strResult = strBuf.toString();
        return strResult;
    }

    private static String splitString(String str, String param) {
        String result = str;

        if (str.contains(param)) {
            int start = str.indexOf(param);
            result = str.substring(0, start);
        }

        return result;
    }

    /**获取classpath1
     * @return
     */
    public static String getClasspath(){
//        String path = (String.valueOf(Thread.currentThread().getContextClassLoader().getResource(""))+"../../../").replaceAll("file:/", "").replaceAll("%20", " ").trim();
       /*文件上传到本地用户路径底下*/
        //String path = System.getProperty("user.home");
        String path = Global.getProfile();
        /*if(path.indexOf(":") != 1){
            path = File.separator + path;
        }*/
        return path;

    }

    /**获取classpath2
     * @return
     */
    public static String getClassResources(){
        String path =  (String.valueOf(Thread.currentThread().getContextClassLoader().getResource(""))).replaceAll("file:/", "").replaceAll("%20", " ").trim();
        if(path.indexOf(":") != 1){
            path = File.separator + path;
        }
        return path;
    }
    public static void main(String[] args) {
        System.out.println(getClassResources());
    }
    public static String PathAddress() {
        String strResult = "";
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getRequest();

        StringBuffer strBuf = new StringBuffer();
        strBuf.append(request.getScheme() + "://");
        strBuf.append(request.getServerName() + ":");
        strBuf.append(request.getServerPort() + "");
        strBuf.append(request.getContextPath() + "/");
        strResult = strBuf.toString();// +"ss/";//加入项目的名称
        return strResult;
    }

}
