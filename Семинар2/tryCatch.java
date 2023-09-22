public class tryCatch {
    public static void main(String[] args) {
        System.out.println("начало");
        try {
            int a = 0;
            int b = 42 / a;
        } catch (Exception e) {
            e.printStackTrace(); // можно не писать, тогда java.lang.ArithmeticException: / by zero не выведет
        }
        System.out.println("Конец");
    }
}
/*  начало
java.lang.ArithmeticException: / by zero
        at tryCatch.main(tryCatch.java:6)
Конец */