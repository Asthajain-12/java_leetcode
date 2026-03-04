public class areaoverload {
    public static float area(float side){
        return side*side;
    }
    public static float area(float length,float breadth){
        return length*breadth;
    }
    public static void main(String[] args) {
        System.out.println(area(4));
        System.out.println(area(8,9));
    }
    
}
