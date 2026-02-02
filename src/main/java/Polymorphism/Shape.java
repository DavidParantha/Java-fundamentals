package Polymorphism;

public class Shape {
    int square(int side){
        return side * side;
    }
    int rectagle(int len,int breadth){
        return len * breadth;
    }
    float traingle(int height,int base){
        return height * base;
    }
    double circle(float radius){
        return 3.14559f * radius *radius;
    }
    float parellelogram(float base, int height){
        return base *height;
    }

}
