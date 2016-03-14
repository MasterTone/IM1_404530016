import java.util.Random;
class homework1{
     int x;
     int y;
     double height;
     double width;
     double area;
     double perimeter;
    homework1(){
    }
    homework1(int _x, int _y, double _height, double _width)
     {
     this.x = _x;
     this.y = _y;
     this.height = _height;
     this.width = _width;
     this.area = _height * _width;
     this.perimeter = (_height + _width) * 2;
}
     int getx(){
     return this.x;
}
     int gety(){
     return this.y;
}
     double getheight(){
     return this.height;
}
     double getwidth(){
     return this.width;
}
     double getarea(){
     return this.area;
}
     double getperimeter(){
     return this.perimeter;
}
public String toString(){
return"java.Rectangle[x =" + this.x + ",y = " + this.y + ",height = " + this.height + ",width = " + this.width + "]" + "\narea = " + this.area + "\nperimeter =" + this.perimeter;
}
}
public class RectangleTester{
public static void main(String[] args){
homework1 rectangle1 = new homework1(15, 25, 18 , 57);
homework1 rectangle2 = new homework1(0, 12, 47, 60);
System.out.println(rectangle1);
System.out.println(rectangle2);
}
}