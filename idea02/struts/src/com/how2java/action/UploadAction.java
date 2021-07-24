package com.how2java.action;

import java.io.File;
import java.io.IOException;
import java.util.UUID;
 
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class UploadAction {
	File doc;
	String docFileName;
	String docContentType;
	
	public File getDoc(){
		return doc;
	}
	
	public void setDoc(File doc){
		this.doc = doc;
	}
	
	public String getDocFileName() {
        return docFileName;
    }
 
    public void setDocFileName(String docFileName) {
        this.docFileName = docFileName;
    }
 
    public String getDocContentType() {
        return docContentType;
    }
 
    public void setDocContentType(String docContentType) {
        this.docContentType = docContentType;
    }
    
    /**
     * 上传文件
     * @return
     */
    public String upload(){
    	System.out.println(doc);
    	System.out.println(docFileName);
    	System.out.println(docContentType);
    	// 返回的大小写不对 返回的错误 不匹配
    	// upload 返回 success 的界面 配置非常严格 大小写 必须明确。。
    	// 稍微有一点写错。。就会找不到 。。提示的错误信息 也不会那么明确。。不好发现错误。。一定要注意
    	return "success";
    }
 
	
}
