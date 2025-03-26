public class Stu {
    public static void main(String[] args) {
        String name = "John ";
        int choice = 1;
        
        String course = (choice == 1) ? "Java" : (choice == 2) ? "Python" : (choice == 3) ? "Data Structures" : "Invalid";
        
        if (!course.equals("Invalid")) {
            System.out.println(name + " enrolled in " + course);
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
