package DSA.strings;

public class basics {
    public static void main(String[] args) {
        // String name = "Tony";
        // String fullName = "Tony Stark";
        // String sentence = "My name is heet";

        // taking input
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String names = sc.nextLine();

        //concatenation

        String firstName = "Heet";
        String lastName = "Nandu";
        String fullName = firstName + " " + lastName;
        // System.out.println(firstName.concat(lastName));
        System.out.println(firstName +  " " + lastName);
        System.out.println(fullName.length());




        for(int i =0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }


        // compare

        String name1 = "Tony";
        String name2 = "Tony";
        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("strings are not equal ");
        }
    }
}


