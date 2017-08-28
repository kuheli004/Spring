package org.javabrains;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {

  public static void main(String[] args) {
  //BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
  @SuppressWarnings("resource")
  ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
  Triangle triangle=(Triangle) context.getBean("myTriangle");
  triangle.draw();

  }

}
