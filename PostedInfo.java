public class PostedInfo {
    private User postedUser;
    private int orderPosted;
    private String contentPosted;
    private String siteAddress;

    public PostedInfo (String contentPosted, String siteAddress, User postedUser, int orderPosted) {
        this.postedUser = postedUser;
        this.orderPosted = orderPosted;
        this.contentPosted = contentPosted;
        this.siteAddress = siteAddress;
    }

    public String getContentPosted(){
        return this.contentPosted;
    };//this is a get method

    public String getSiteAddress(){
        return this.siteAddress;

    }
    public int getOrderPosted() {
        return this.orderPosted;
    }

    public User getPostedUser(){
        return this.postedUser;

    }
}


