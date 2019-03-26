import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Main {
    public static void print(int index,Object obj)
    {
        System.out.println(String.format("{%d}, %s",index,obj));
    }
    public static void main(String[] args)
    {
        Date date =new Date();
        DateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        print(1,dt.format(date));

        Random rd = new Random();
        print(2,rd.nextInt(800));
    }
}
