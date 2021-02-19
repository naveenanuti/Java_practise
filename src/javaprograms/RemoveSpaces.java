package javaprograms;

public class RemoveSpaces {

    public static void main(String[] args){

        String str = ("Anuti Naveen Kumar Reddy");
        System.out.println("Before removing spaces:"+str);

        str = str.replaceAll("\\s","");
        System.out.println("After removing spaces:"+str);


    }

}
