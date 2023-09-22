public class task3_1 {
    public static void main(String[] args) {
        a();
    }
    public static void a(){
        b();
    }
     public static void b(){
        c();
    }
     public static void c(){
        int[] ints = new int[10];
        System.out.println(ints[1000]);
}
}
/* получаем трэйс
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1000
        at task3_1.c(task3_1.java:13)  самый верх эксепшена это место где произошла наша ошибка]
        at task3_1.b(task3_1.java:9)
        at task3_1.a(task3_1.java:6)
        at task3_1.main(task3_1.java:3)
        */