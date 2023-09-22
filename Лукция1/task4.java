import javax.management.RuntimeErrorException;

public class task4 {
    public static void main(String[] args) {
        System.out.println(devide(10,0));
    }
    public static int devide(int a1, int a2){
        if (a2 ==0) {
           throw new RuntimeException("Devide by zero is not permited") ; // сами бросаем исключение
        }
        return a1/a2;
    }
}
//
