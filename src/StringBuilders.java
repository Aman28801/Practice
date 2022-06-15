public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Aman");
        //to add at end
        sb.append("V");
        sb.append("e");
        sb.append("r");
        sb.append("m");
        sb.append("a");

        //length
        System.out.println(sb.length());  //9

        //delete at particular index
        sb.deleteCharAt(4);
        System.out.println(sb.length()); //8
        System.out.println(sb);

        //traverse at particular index
        System.out.println(sb.charAt(6)); // m

        //update character at a particular index
        sb.setCharAt(6, 'p');

        //insert at a particular index
        sb.insert(0,'p');
        System.out.println(sb);  //pAmanerpa
    }
}
