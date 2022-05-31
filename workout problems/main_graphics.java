import graphics.*;

public class main_graphics {
    public static void main(String []args){
        package_graphics testObj = new package_graphics();
        System.out.println("the area of the rectangle is:"+testObj.recArea(11,23));
        System.out.println("the area of circle is:"+testObj.cirArea(5));
        System.out.println("the area of square is:"+testObj.squArea(25));
        System.out.println("the area of  triangle is: "+testObj.triArea(11,6));
    }
}