import static java.lang.System.out;

import java.util.ArrayList;
import java.util.Scanner;

public class MicroBlog2 {

    static Scanner keyboard = new Scanner(System.in);
    int item;

    static ArrayList<User> existingUsers = new ArrayList<User>();//array list
    static int choosenUser;
    static ArrayList<PostedInfo> postedInfos = new ArrayList<PostedInfo>();
    static int orderPosted;

    public static boolean isInteger(String s) {
        boolean isValidInteger = false;
        try {
            Integer.parseInt(s);

            // s is a valid integer

            isValidInteger = true;
        } catch (NumberFormatException ex) {
            // s is not an integer
        }

        return isValidInteger;
    }

    public static void main(String[] args) {
        display_menu();


    }

    public static void display_menu() {

        for (int i = 0; i == i; i++) {//or put the word true instead of = =
            System.out.println("Main Menu");
            System.out.println("1) Create a new user");
            System.out.println("2) Become an existing user");
            System.out.println("3) Create a post as the current user");
            System.out.println("4) Print all posts");
            System.out.println("5) Print all users");


            //PSEUDO CODE
            //PROMPT USER FOR WHAT THEY WOULD LIKE TO DO....
            //IF USER ENTERS NUMBER 1)


            //THEN PROMPT FOR USERNAME
            //THEN PROMPT FOR FIRST
            //THEN PROMPT FOR LAST NAME
            //THEM PROMPT FOR EMAIL ADDRESS
            //THEN PROMPT FOR WEB-ADDRESS
            //THEN CREATE NEW USER FROM ENTERED INFORMATION
            //THEN ADD NEW USER TO USERS ARRAY
            String item;

            item = keyboard.nextLine();

            if (item.equals("1")) {
                System.out.println("What is your userName");
                String userName = keyboard.nextLine();
                System.out.println("What is your firstName?");
                String firstName = keyboard.nextLine();
                System.out.println("What is your lastName?");
                String lastName = keyboard.nextLine();
                System.out.println("What is your email address?");
                String emailAddress = keyboard.nextLine();
                System.out.println("What is  your webAddress?");
                String webAddress = keyboard.nextLine();
                Name name = new Name(firstName, lastName);

                User newUser = new User(webAddress, userName, emailAddress, name);
                existingUsers.add(newUser);

            }
            if (item.equals("2")) {
                System.out.println("Become an existing user");
                for (int j = 0; j < existingUsers.size(); j++) {
                    System.out.println(j + " " + existingUsers.get(j).getUserName());
                }

                System.out.println("Which user do you want to be?");
                String userAnswer = keyboard.nextLine();
                if (!isInteger(userAnswer)) {
                    System.out.println("Enter value between 0 and 2");
                }
                choosenUser = new Integer(userAnswer).intValue();

            }
            if (item.equals("3")) {
                System.out.println("What do you want to post?");
                String postedMessage = keyboard.nextLine();
                System.out.println("What is the site address?");
                String siteAddress = keyboard.nextLine();


                PostedInfo newPost = new PostedInfo(postedMessage, siteAddress, existingUsers.get(choosenUser), orderPosted);
                postedInfos.add(newPost);

            }
            if (item.equals("4")) {
                System.out.println("Print all posts");
                for (int j = 0; j < postedInfos.size(); j++) {
                    System.out.println(j + " " + postedInfos.get(j).getContentPosted());
                }
            }
            if (item.equals("5")) {
                System.out.println("Print all users");
                for (int j = 0; j < existingUsers.size(); j++) {
                    System.out.println(j + " " + existingUsers.get(j).getUserName());
                }
            }
            //System.out.println("Create a new user");
            //System.out.println("Become an existing user");
            //System.out.println("Please enter your first name");
            //System.out.println("Please enter your last name");
            //System.out.println("Please enter your email address");
        }
    }

    public PostedInfo getPostedInfo(int choosenUser) {
        PostedInfo latestPost = null;

        for (int i = 0; i < postedInfos.size(); i++) {
            if (existingUsers.get(choosenUser) == postedInfos.get(i).getPostedUser()) {
                latestPost = postedInfos.get(i);

            }

        }
        return latestPost;
    }

        }












