
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Tasks{
    String task;
    int id;
    Tasks(int id, String task){
        this.task = task;
        this.id = id;
    }
}

public class ClassesAndObjects5 {
    public static void main(String[] args) {

        ArrayList<Tasks> t = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("select choice");
            System.out.println("1. Add a task");
            System.out.println("2. Update a task");
            System.out.println("3. Delete a task");
            System.out.println("4. Show tasks");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Enter the id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter the task: ");
                    String task = sc.nextLine();
                    t.add(new Tasks(id, task));
                    break;
                
                case 2:
                    System.out.println("Enter the id: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new task: ");
                    String updateTask = sc.nextLine();
                    
                    for (Tasks e: t){
                        if (e.id ==  updateId){
                            e.task = updateTask;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter the id to delete: ");
                    int deleteId = sc.nextInt();
                    Iterator<Tasks> it = t.iterator();
                    while (it.hasNext()){
                        if (it.next().id == deleteId){
                            it.remove();
                        }
                    }
                    break;

                case 4:
                    System.out.println("The list of tasks is:");
                    for (Tasks e : t) {
                        System.out.println(e.id +" "+e.task );
                    }
                    break;

                case 5:
                    System.out.println("Exiting");
                
                    return;
            }
        }
    }
}
