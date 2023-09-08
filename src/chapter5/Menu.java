package chapter5;

public class Menu {
    public static void main(String []args)
        throws java.io .IOException{
        char choice ;
        do {
            System.out.println("Operaor help:");
            System.out.println(" 1 . if");
            System.out.println("2. switch");
            System.out.println("3.while");
            System.out.println("4. do -while");
            System.out.println("5. for\n");
            System.out.println("Select the desired item:");
            choice = (char) System .in.read ();
        }while (choice <'1' || choice >'5');
        System.out.println("\n");
        switch (choice){
            case '1':
                System.out.println("if:\n");
                System.out.println("if operator:");
                System.out.println("else operator:");
                break;
            case '2':
                System.out.println("switch: \n");
                System.out.println("switch:{");
                System.out.println("case константа: ");
                System.out.println("Sequence of statements");
                System.out.println("break;");
                System.out.println("//...");
                System.out.println("}");
                break;
            case'3':
                System.out.println("while :\n");
                System.out.println(" while (conditions)operator");
                break;
            case'4':
                System.out.println("do - while :\n");
                System.out.println("do {");
                System.out.println("     operator");
                System.out.println("} while (conditions)");
                break;
            case '5':
                System.out.println("for :\n");
                System.out.println(" for(Initialization;condition;Iteretion)");
                System.out.println("operation;");
                break;
        }

    }
}
