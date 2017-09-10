package com.intlgds.fare.amadeus.booking.client;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/** 
 * 属性文件的key-value 
 */  
public class PropertiesUtil {  
	private static InputStream in ;
    private static Properties prop = null; 
    
    private PropertiesUtil(){
    	
    }
    /**
     * 
     * @param fileName
     * @throws IOException
     */
    private static void LoadProperties(String fileName) throws IOException{
    	try{
            //读取属性文件
        	in=new BufferedInputStream (new FileInputStream(fileName));
            prop = new Properties(); 
            prop.load(in);     ///加载属性列表
    	}catch(Exception e){
            throw new IOException();
         }
    }
    /**
     * 
     * @param fileName
     * @param key
     * @return
     * @throws IOException
     */
    public static String getPropertiesContextByKey(String fileName,String key) throws IOException{
        	LoadProperties(fileName);
        	String value="";
            Iterator<String> it=prop.stringPropertyNames().iterator();
            while(it.hasNext()){
                if (key.equals(it.next())) {
                	//System.out.println(prop.getProperty(key));
                	value=prop.getProperty(key);
                	break;
				}
                
            }
            in.close();
		
		return value;
    }
    /**
     * 
     * @param fileName
     * @return
     * @throws IOException
     */
    public static Set<String> getstringPropertyNames(String fileName) throws IOException{
    	LoadProperties(fileName);
    	Set<String> vlues=prop.stringPropertyNames();
		return vlues;
    }
    
    /**
     * 
     * @param fileName
     * @return
     * @throws IOException
     */
    
    public static Properties getProperties(String fileName) throws IOException{
    	LoadProperties(fileName);
    	return prop;
    }

}