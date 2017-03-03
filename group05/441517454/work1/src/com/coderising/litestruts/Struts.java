package com.coderising.litestruts;
import java.beans.PropertyDescriptor;

//import java.beans.PropertyDescriptor;

import java.io.File;
import java.lang.reflect.Field;
//import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class Struts {

    public static View runAction(String actionName, Map<String,String> parameters) {
     
	//0. 读取配置文件struts.xml
    	
    	SAXReader saxReader = new SAXReader();
    	View view = new View();
    	Element actionElement = null;
		String classVal="";
 		try {
			Document read = saxReader.read(new File("src/com/coderising/litestruts/struts.xml"));
			//获得根节点
			Element rootElement = read.getRootElement();
			//获得根节点下的一级节点
			List<Element> elements=rootElement.elements();
			for (Element element : elements) {
				Attribute attribute = element.attribute("name");
				//如果等于传递进来的actionName
				if(attribute.getValue().equals(actionName)){
					actionElement = element;
					//获得属性值
					Attribute classAttr = element.attribute("class");
					classVal = classAttr.getValue();
				}
			}
			
//	 	1. 根据actionName找到相对应的class ， 例如LoginAction, 通过反射实例化（创建对象）
//			据parameters中的数据，调用对象的setter方法， 例如parameters中的数据是 
//			("name"="test" ,  "password"="1234") ,     	
//			那就应该调用 setName和setPassword方法
	 		//com.coderising.action.LoginAction
			
			
    

}


