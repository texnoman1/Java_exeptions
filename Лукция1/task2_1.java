public class task2_1 {
    public static void main(String[] args) {
        System.out.println(devide(10,0));
    }
    public static int devide(int a1, int a2){
        if (a2 == 0) {
           return -1;  // но деление -10 / 10 - тоже даст -1
        }
        return a1/a2; 
        
    }
    
}
