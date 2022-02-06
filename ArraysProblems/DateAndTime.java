import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class DateAndTime {
    public static void main(String[] args) {
        int Mdn = 1234567;
        String ProductType="";
        String str = "PROMOTION1_TYPE";
        Map<String , Object> req = new HashMap<>();
        req.put("PROMOTION1_TYPE","WSPROMO");
        ProductType = String.valueOf(req.get("PROMOTION1_TYPE2"));
         req.computeIfAbsent("PROMOTION1_TYPE2" , k -> null);
        if(String.valueOf(req.get("PROMOTION1_TYPE2"))!="null"){
            System.out.println("null case 1");
        }
       else if(String.valueOf(req.get("PROMOTION1_TYPE2")).equals(null)){
            ProductType = ProductType+"_TrafficType";
            //System.out.println(ProductType+"   nulll");
            System.out.println("null 2");
        }
        else System.out.println(" value is null");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMddHHmmss");
        LocalDateTime now = LocalDateTime.now();
    //   String str =  dtf.format(now);
        System.out.println(dtf.format(now));
        String str1 = Mdn+dtf.format(now);
        System.out.println(str1);
        System.out.println(ProductType);


    }
}
