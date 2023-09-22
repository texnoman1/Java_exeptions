/*Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. 
Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
если вместо массива пришел null, метод вернет -3
придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.
Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, этот метод запросит искомое число у пользователя, 
вызовет первый, обработает возвращенное значение и покажет читаемый результат пользователю. Например, если вернулся -2, 
пользователю выведется сообщение: “Искомый элемент не найден”. */

import java.util.Scanner;

public class Task2 {
public static void main(String[] args) {

int[] array = {2, 59, 23, 2, 45, 34, 75, 23};

userInterface(array);

}

public static void userInterface(int[] array) {
System.out.println("Введите число:");
Scanner scanner = new Scanner(System.in);
int num = scanner.nextInt();
scanner.close();

int result = checkArray(array, num);

switch (result) {
case -3:
System.out.println("Массив не задан");
break;
case -2:
System.out.println("Искомый элемент не найден");
break;
case -1:
System.out.println("Длина массива меньше заданного минимума");
break;
default:
System.out.println("Индекс: " + result);
break;
}
}

public static int checkArray(int[] array, int number) {
int minArrayLength = 5;
if (array == null) {
return -3;
}
if (array.length < minArrayLength) {
return -1;
}

for (int i = 0; i < array.length; i++) {
if (array[i] == number) {
return i;
}
}
return -2;
}
}