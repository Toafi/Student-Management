import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);   //scanner for inputing which user want to
        int a,user;
        Input i = new Input();  // creating object of Input class

        //using do-while for inputing from user
        do {
            System.out.println("");
            System.out.println("Welcome to Student Management System Created By Mekail Tushar");
            System.out.println("");
            System.out.println("Which you want to do");
            System.out.println("");
            System.out.println("Enter 1 to add Students ");
            System.out.println("Enter 2 to Search Students");
            System.out.println("Enter 3 to delete Students ");
            System.out.println("Enter 4 to update Students ");
            System.out.println("Enter 0 to Exit System");
            //using swtich case for choising which function user want to
            int ch = s.nextInt();
            switch (ch) {
                case 1:
                System.out.println("Enter The number of entries");
                //from class Input i declare user in constructor and then i put data into user from scanner
                user = s.nextInt();  //put data into user 
                i.add(user); //call add method from Input class 
                    
                    break;
            case 2:
                i.search();
                break;
            case 3:
            i.delete();
            break;
            case 4:
            i.update();
            break;
            case 5:
            System.exit(0);
            }
            //if user take 0 system will exit
            System.out.println("press any key other than 0 to do more operations else press 0 to exit");
            
            a = s.nextInt();   //take input from user and put into variable a
    
        }  
        //if user select 0 then program will be closed
        while(a!=0);
    }
}

