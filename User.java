public class User {
    private String webAddress;//THIS IS A CLASS VARIABLE ALSO KNOWN AS ATTRIBUTE

    private String userName;

    private String emailAddress;

    //we are using the class name to retrieve or access first and last name
    private Name name;

    // use one constructor with four parameters

    public User(String webAddress, String userName, String emailAddress, Name name) {
        this.webAddress = webAddress;
        this.userName = userName;
        this.emailAddress = emailAddress;
        this.name = name;
        //THIS IS A METHOD----all five lines of code---this is a constructor
        //THE PARAMETER IS (String webAddress)

        //create a constructor for postedinfor;;;;;;;
    }
    public String getWebAddress(){
        return this.webAddress;
    };//this is a get method******write gets for each item in the user class.

    public String getUserName(){
        return this.userName;
    }

    public String getEmailAddress () {
        return this.emailAddress;
    }

    //this is a method
    public Name getName() {
        return this.name;
    }
    //this is method

}












