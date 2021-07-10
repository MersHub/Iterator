public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java,"," Maven,"," Spring,"," SQL.."};


        JavaDeveloper javaDeveloper = new JavaDeveloper("Egor", skills);

        Iterator iterator = javaDeveloper.getIterator();

        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills: ");

        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
