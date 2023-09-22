import java.io.File;
public class task1{
    public static void main (String[ ] args){
  System.out.println(getFileSize(new File("123")));
    }
   public static long getFileSize(File file){
    return file.length();
   }

}
// результат будет 0 и не понятно это код ошибки или размер пустого файла