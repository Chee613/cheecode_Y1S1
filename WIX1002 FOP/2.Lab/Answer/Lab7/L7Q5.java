package Lab7;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class L7Q5 {
    private String name;
    private int age;
    private char gender;
    
    public L7Q5(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Tan Chee Keat\\OneDrive\\Documents\\W1002 FOP\\cheecode\\WIX1002\\Lab\\Lab7\\Lab7 File\\person.dat"));
            int TotalNumberofRecord = in.readInt(); 
            ArrayList<L7Q5> people = new ArrayList<>();
            
            for(int ct = 0; ct < TotalNumberofRecord; ct++){
                String Name = in.readUTF();
                int Age = in.readInt();
                char Gender = in.readChar();
                L7Q5 person = new L7Q5(Name, Age, Gender);
                people.add(person);
            }
            in.close();
            
            System.out.println("Before Sort:");
            printPeople(people);
            sortPeople(people);
            
            System.out.println();
            
            System.out.println("After Sort:");
            printPeople(people);
            
        } catch(IOException e){
            System.out.println("Error with file input");
        }
    }
    
    private static void sortPeople(ArrayList<L7Q5> people){
        for (int i = 0; i < people.size(); i++){
            for(int j = 0; j < people.size() - i - 1; j++){
                if(people.get(j).name.compareTo(people.get(j+1).name) > 0){
                    Collections.swap(people, j, j+1);
                }
            }
        }
    }
    
    private static void printPeople(ArrayList<L7Q5> people){
        for (L7Q5 person : people){
            System.out.print(person.name + " ");
            System.out.print(person.age + " ");
            System.out.println(person.gender);
        }
    }
}
