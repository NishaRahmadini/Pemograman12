package Contoh1;

public class Account {
    protected String emailAddress;
    protected String name;

    public String getEmailAddress(){
        return this.emailAddress;
    }
    public String getName(){
        return this.name;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public void setName(String name){
        this.name = name;
    }
}