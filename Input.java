import java.util.Scanner;

public class Input extends StudentProject{
    int user;
    Scanner s = new Scanner(System.in);
    int i=0,c=0,r=0;
    Input(){
        //array declaration for roll and name variable
        roll = new int[10];
        name = new String[10];
        age = new int[10];
        gender= new String[10];
    }
    public void add(int user){
        this.user=user;
        for(i=0;i<user;i++){  //using loop for taking students name and roll . its depend on the user input when USER give a number it takes these numbers of students name and roll
            System.out.println("Enter Student's Name ,Roll Number, Age and Gender");
            name[i]=s.next();  //put students Name into 'name' 
            roll[i]=s.nextInt(); //put roll into 'roll'
            age[i]=s.nextInt();
            gender[i]=s.next();
        }
        display();

    }
    public void search(){
        System.out.println("Enter The Roll Which you want to Search");
        r = s.nextInt();  //take the number into r 
        for(i=0;i<roll.length;i++){  // using for loop for equalation to r 
            if(roll[i]==r){
                break;
            }
        }
        //when r is equal to adding roll then it print out the details of students
        System.out.println("");
        System.out.println("");
        System.out.println("---DETAILS OF THE SPECIFIED STUDENT IS---");
        System.out.println("NAME       ROLL NO       Age        Gender");
        System.out.print(name[i]+"       ");
        System.out.print(roll[i]+"       ");
        System.out.print(age[i]+"      ");
        System.out.print(gender[i]);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");    
    }
    public void delete(){
        System.out.println("Enter the Roll Number to be delete");
        r=s.nextInt(); // to delete take number from user put into r variable
        for(i=0;i<roll.length;i++){
            if(roll[i]==r){  
                roll[i]=0; //if any of the roll is equal to r then it is totally zero
                name[i]="";  //then name is empty 
                age[i]=0;
                gender[i]="";

            }
        }
        display();
    }
    public void update(){
        System.out.println("Enter the Roll Number to be update");
        r=s.nextInt();  // to update roll and name take number of roll for update
        for(i=0;i<roll.length;i++){
            //if any of roll is equal to r then its update roll and name
            if(roll[i]==r){ 
                System.out.println("Enter New Name, Roll ,Age and Gender");
                name[i]=s.next();
                roll[i]=s.nextInt();
                age[i]=s.nextInt();
                gender[i]=s.next();
            }
            
        }
        display();
    }
    @Override
    //call display method
    void display(){
        System.out.println("The Updated Students Are :");
        System.out.println("Name       Roll      Age      Gender");
        //if all the roll is not 0 then print students name and roll
        for(i=0;i<roll.length;i++){
            if(roll[i]!=0){
            System.out.print(name[i]+"      ");
            System.out.print(roll[i]+"      ");
            System.out.print(age[i]+"      ");
            System.out.print(gender[i]);
            System.out.println(" "); //for line break
            }
        }
    }
}
