package org.javabrains;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware,BeanNameAware {
 private List<Point> point;
 private Point pointA;
 private Point pointB;
 private Point pointC;
 ApplicationContext context;
 
 public Triangle(){
   
 }
/* 
 public Triangle(Point pointA,Point pointB,Point pointC) {
  super();
  this.pointA = pointA;
  this.pointB=pointB;
  this.pointC=pointC;
}*/



  /*public List<Point> getPoint() {
  return point;
}



public void setPoint(List<Point> point) {
  this.point = point;
}*/


/*
  public Point getPointA() {
  return pointA;
}


public void setPointA(Point pointA) {
  this.pointA = pointA;
}


public Point getPointB() {
  return pointB;
}


public void setPointB(Point pointB) {
  this.pointB = pointB;
}


public Point getPointC() {
  return pointC;
}


public void setPointC(Point pointC) {
  this.pointC = pointC;
}*/


  public void draw(){
  for(Point p:point)
    System.out.println("Point ="+p.getX()+","+p.getY());
   /* System.out.println("Point A=("+pointA.getX()+","+pointA.getY()+")");
    System.out.println("Point B=("+pointB.getX()+","+pointB.getY()+")");
    System.out.println("Point C=("+pointC.getX()+","+pointC.getY()+")");*/
  }

@Override
public void setBeanName(String arg0) {
  System.out.println("Bean name is: "+arg0);
  
}

@Override
public void setApplicationContext(ApplicationContext context) throws BeansException {
  this.context=context;
  Point B=(Point) context.getBean("pointB");
  System.out.println("X is :"+B.getX()+"Y is:"+B.getY());
}



public List<Point> getPoint() {
  return point;
}



public void setPoint(List<Point> point) {
  this.point = point;
}


 }




