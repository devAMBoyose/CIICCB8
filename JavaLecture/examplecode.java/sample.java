import java.util.*;

public class sample {
    public static void main(String[] balance) {
        Scanner pymnt = new Scanner(System.in);
        String expectedInput = ("thanks");
        
      //  String payment ="";

    while(true){

        System.out.println(" YOUR ACCOUNT "); 


        System.out.println("\nMenu:");
        System.out.println("1.Cash out(cancel & payment)");
        System.out.println("2.Cash in(cancel & payment)");
        System.out.print("Please choise option 1 & 2: ");
    
        String choice = pymnt.nextLine();///.trim().toLowerCase();

        switch (choice) {
            case "1":

                System.out.print("cash out: ");
                String casout = pymnt.nextLine();//.trim().toLowerCase();
                ///String pay = pymt.nextLine().trim().toLowerCase();
                if (casout.equals("payment")) {
                    System.out.println(" succesfull payment " + expectedInput);
                    
                } else if(casout.equals("cancel")){
                    System.out.println("your payment not success please try again");
                    
                }
                break;

            case "2":

              System.out.print("cash in:");
              String casin = pymnt.nextLine();//.trim().toLowerCase();
               if ( casin.equals("payment")) {
              System.out.println("succes cash in " +expectedInput );

             } else if (casin.equals("cancel")){
                System.out.println(" cash in not succes please try again");
                
            }
                break;
            case "3":
                    
                break;
            default:
                System.out.println("kupal dadayain mo pa di kana nga pumili ng number"+pymnt);
                break;

        
            }

         }

    }   
}