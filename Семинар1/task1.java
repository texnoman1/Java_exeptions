/*Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
Если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки, иначе - длину массива.*/
public class task1 {
public static void main(String[] args) {
int[] array = {2, 59, 23, 2, 45, 34, 75, 23};

System.out.println(checkArray(array, 30));

}

public static int checkArray(int[] array, int number) {
if (array.length < number) {
return -1;
}
return array.length;
}
}