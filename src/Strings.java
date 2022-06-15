public class Strings {
    public static void main(String[] args) {
        String s1 ="Aman";
        String s2 ="Verma";
        String s3 =s1.concat(s2);  //add
        String s4 ="AmanVerma";
        System.out.println(s3);
        System.out.println(s3.length()); // 9


        System.out.println(s3.charAt(4)); // V
         // if  s==0 --> equall
        // if  s>0 --> greater  positive Numbers
        // if  s<0 --> smaller  Negative Numbers

        if(s3.compareTo(s4)==0){
            System.out.println("Equally Strings");
        }else{
            System.out.println("Not Equally");
        }
        //Substring
        System.out.println(s4.substring(4,s4.length())); //Verma



    }
}
