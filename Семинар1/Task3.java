/*Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
 и в каждой ячейке может лежать только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке. */




public class Task3 {
public static void main(String[] args) {
int arr[][] = {{1, 2, 3}, {0, 1}};

System.out.println(Sum(arr));
}

public static int Sum(int[][] arr) {
if (arr.length != arr[0].length) {
throw new RuntimeException("Ошибка1: Не квадратный массив");
}

int sum = 0;

for (int i = 0; i < arr.length; i++) {
for (int j = 0; j < arr[0].length; j++) {
if (arr[i][j] != 0 && arr[i][j] != 1) {
throw new RuntimeException("Ошибка2: В ячейке не 0 или 1");
} else {
sum += arr[i][j];
}
}
}

return sum;
}
}