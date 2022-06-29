package test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import dao.TestDao;

public class Test {

	//Spring IoC容器的设计主要是基于BeanFactory和ApplicationContext两个接口。
	//创建BeanFactory实例时，需要提供XML文件的绝对路径。
	//例如，可以将第一章ch1应用中main方法的代码修改如下：
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory beanFac = new XmlBeanFactory(
				new FileSystemResource("D:\\EclipseWorkSpace\\JavaEECH02\\src\\applicationContext.xml")
				);
						//通过容器获取test实例
						TestDao tt = (TestDao)beanFac.getBean("test");
						tt.sayHello();


	}*/
	//创建ApplicationContext接口实例通常有三种方法：
	//1．通过ClassPathXmlApplicationContext创建，如第一章的实例所示
	/*public static void main(String[] args) {
		//初始化Spring容器ApplicationContext，加载配置文件
		ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过容器获取test实例
		TestDao tt = (TestDao)appCon.getBean("test");
		tt.sayHello();
	} */
	
	//2．通过FileSystemXmlApplicationContext创建
	public static void main(String[] args) {
		//初始化Spring容器ApplicationContext，加载配置文件
				ApplicationContext appCon = 
		new FileSystemXmlApplicationContext("D:\\EclipseWorkSpace\\JavaEECH02\\src\\applicationContext.xml");
				//通过容器获取test实例
				TestDao tt = (TestDao)appCon.getBean("test");
				tt.sayHello();
	}
	//3．通过Web服务器实例化ApplicationContext容器
	//在Web应用中使用，后续课程中介绍


}
