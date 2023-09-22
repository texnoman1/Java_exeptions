import java.io.File;
public class task1_1{
    public static void main (String[ ] args){
  System.out.println(getFileSize(new File("123"))); //  не реальный файл
  System.out.println(getFileSize(new File("C:\\1/1.zip"))); // реальный файл
  System.out.println(getFileSize(new File("C:\\1/2.mdat"))); // реальный файл
    }
   public static long getFileSize(File file){
    if(!file.exists()){   // если файл не существует, возвращаем -1
        return -1;
    }
    return file.length();
   }

}
