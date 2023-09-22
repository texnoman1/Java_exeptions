//Несколько операторов catch


public class TryCatch1 {
    public static void main(String[] args) {
        try {
           int b = 42 / 0;
           int[] c = {1,2,3};
           c[42] = 99; 
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль:" + e);
        }
        catch( ArrayIndexOutOfBoundsException e) {
             System.out.println("Ошибка индексации массива:" + e);
        }

        
    }
}
