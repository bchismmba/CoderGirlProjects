import java.util.Scanner;

public class ThankYouMailMerge {

    public static void main(String[] args) {
        boolean keepGoing = true;
        String name = "";
        String donationAmount = "";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Thank You Letters");
        while (keepGoing) {
            System.out.println("name");
            name = keyboard.nextLine();

            if (name.equals("quit")) {
                keepGoing = false;
            }
            else {

                System.out.println("donationAmount");
                donationAmount = keyboard.nextLine();

                System.out.println("Dear "+name+",\n"+


                "Thank you for your donation! We rely on donors like you to keep our \n"+
                "organization effective, and you came through for us.  Your donation of $"+donationAmount+" \n"+
                "will help our efforts to make a difference in the world \n"+

                "As you may know, we are a registered non-profit organization, so your \n"+
                "donation is tax deductible.  You may use this letter as a receipt for tax \n"+
                "purposes. \n"+

                "Thank you again for your support! \n"+
                "               \n"+

                "Sincerely, \n"+
                "               \n"+
                "Betty Chism \n"+
                "YourCharity.org");

            }




        }


    }
}
