package bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CircleCollection implements Comparator<Circle>{
    ArrayList<Circle> a1 =new ArrayList<Circle>();


    public CircleCollection() {
    }


    public CircleCollection(ArrayList<Circle> a1) {
        this.a1 = a1;
    }
    Scanner sc =new Scanner(System.in);
    public void them(Circle cr) {
        System.out.println("nhap ban kinh");
        double a=sc.nextDouble();
        cr =new Circle(a);
        a1.add(cr);
    }
    public Circle getCircle( int pos) {
        if(pos>=0 && pos<a1.size()) {
            return a1.get(pos);
        }else {
            return null;
        }

    }
    public void setCircle(int pos, Circle c) {
        c.nhapthem(c);
        if(pos>=0 && pos<a1.size()) {
            a1.set(pos, c);
        }
    }
    public void in() {
        for (Circle circle : a1) {
            System.out.println(circle.toString());
        }
    }
    public double sumArea() {
        double t=0;
        for (Circle circle : a1) {
            t=t+circle.getArea();
        }
        return t;
    }
    public double minArea() {
        if(a1.isEmpty()) {
            return 0;
        }
        double mina=a1.get(0).getArea();
        for (Circle circle : a1) {
            if(circle.getArea()<mina) {
                mina=circle.getArea();
            }
        }
        return mina;
    }
    public double maxArea() {
        if(a1.isEmpty())
            return 0;
        double ma=a1.get(0).getArea();
        for (Circle circle : a1) {
            if(circle.getArea()>ma) {
                ma=circle.getArea();
            }
        }
        return ma;
    }

    public void xeptang() {
        Collections.sort(a1,this);}
    @Override
    public int compare(Circle o1,Circle o2) {
        if(o1.getRadius()>o2.radius) {
            return 1;
        }else if(o1.getRadius()<o2.radius) {
            return -1;
        }else {
            return 0;}

    }