package Projects;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


class InnerTo_List{
    Scanner in = new Scanner(System.in);

    public void addTask(ArrayList<String> list)throws IOException{
        System.out.println("Enter an item to add: ");
        String item = in.next();
        list.add(item);
        saveTasksFile(list);
        System.out.println("Item Added Successful");
    }

    public void viewTask(ArrayList<String> list){
        System.out.println("\n");
        System.out.println("Tasks to complete");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        if(list.isEmpty())
            System.out.println("No Tasks Available");
        else{
            for(int i=0; i<list.size(); i++){
                System.out.println(list.get(i));
            }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        }
    }

    public void removeTask(ArrayList<String> list)throws IOException{
        System.out.println("Enter an item to remove from the tasks: ");
        String item = in.next();
        if(list.remove(item)){
            saveTasksFile(list);
            System.out.println("Item Removed Successfully");
        }
        else
            System.out.println("Item not found!");
    }
    
    public void saveTasksFile(ArrayList<String> list) throws IOException {
        FileWriter writer = new FileWriter("tasks.txt");
        for(String task: list){
            writer.write(task+ "\n");
        }
        writer.close();
    }

    public ArrayList<String> loadTasksFromFile() throws IOException{
        ArrayList<String> list = new ArrayList<>();
        File file = new File("tasks.txt");

        if (file.exists()) {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String task;
            while ((task = reader.readLine()) != null) {
                list.add(task);
            }
            reader.close();
        }
        return list;
    }
}

public class To_List {
    public static void main(String[] args)throws IOException{
        Scanner in = new Scanner(System.in);
        InnerTo_List lst = new InnerTo_List();
        
        System.out.println("Enter your name: ");
        String name = in.next();
        ArrayList<String> list = lst.loadTasksFromFile();

        while (true) {
            
            System.out.println("1] View Tasks");
            System.out.println("2] Add Tasks");
            System.out.println("3] Delete Tasks");
            System.out.println("4] quit");
            int ch = in.nextInt();
            if(ch == 1){
                lst.viewTask(list);
            }
            else if(ch == 2){
                lst.addTask(list);
            }
            else if(ch == 3){
                lst.removeTask(list);
            }
            else if(ch == 4){
                System.out.println("Successfully quit");
                break;
            }
            else{
                System.out.println("Invalid input");
                break;
            }
            System.out.println("\n\n\n");
        }
    }   
}
