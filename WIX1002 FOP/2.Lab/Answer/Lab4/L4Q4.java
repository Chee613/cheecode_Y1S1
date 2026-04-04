import java.util.Scanner;

public class L4Q4{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year= input.nextInt();
        System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday, … , 6 for Saturday): ");
        int firstdayofyear=input.nextInt();
        do{
        System.out.print("Give the month for the calender to display (1 for January etc): ");
        int month=input.nextInt();

        String [] monthname={"January","February","March","April","May","June","July","August","September","November","December"};
        int [] monthday={31,28,31,30,31,30,31,31,30,31,30,31};
        String [] week={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};

        if(Leapyear(year)==true){
            monthday[1]=29;
        }

        System.out.println("\tCalender for "+ monthname[month-1]+" "+year);
        System.out.println("----------------------------------------");
        for(int i=0;i<7;i++){
            System.out.printf("%-5s",week[i]);
        }

        System.out.println();
        int firstday=firstdayofyear;
        for (int i = 0; i < month - 1; i++) {
            firstday = (firstday + monthday[i]) % 7;
        }

        for(int j=0; j<firstday; j++){
            System.out.print("     ");
        }

        for(int k=1; k<=monthday[month-1];k++){
            System.out.printf("%-5d",(k));
            firstday+=1;
            if(firstday%7==0){
                System.out.println();
            }
        }
        System.out.print("\n Do you want to continue with another month (Yes/No): ");
        String answer= input.next();
        if(answer.equalsIgnoreCase("No")){
            System.out.println("Program stopped");
            break;
        }
        else
            System.out.println("You chose to continue!");
    }while(true);
        
    



    }
    private static boolean Leapyear(int year){
        boolean leapyear=true;
        if(year%4==0&& year%100!=0||year%400==0){
            leapyear=true;
        }
        else{
            leapyear=false;
        }
        return leapyear;
    }
}