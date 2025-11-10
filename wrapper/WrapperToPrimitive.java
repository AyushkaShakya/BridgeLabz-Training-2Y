
public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double obj = 45.67;  // Wrapper object

        double d = obj.doubleValue(); // Wrapper → primitive
        int i = (int) obj.doubleValue(); // Casting

        System.out.println("Double value: " + d);
        System.out.println("Integer (casted) value: " + i);
    }
}
