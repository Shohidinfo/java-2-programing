public class StringConstructorsDemo {
    public static void main( String [] arags ){
        String s1 = new String();
        System.out.println("Default String:  "+ s1);
        String s2 = new String("Hello java");
        System.out.println("From String Literal: " + s2);
        char [] charArray = {'w', 'e', 'x', 'd', 'f','t', 'g'};
        String s3 = new String(charArray);
        System.out.println("From Char Array : "+ s3);
        String s4 = new String(charArray, 3,4);
        System.out.println("From Sub Char Array : " + s4);
        byte[] byteArray ={65,55,44,77};
        String s5 = new String(byteArray);
        System.out.println("From Byte Array : "+ s5);


    }
}
