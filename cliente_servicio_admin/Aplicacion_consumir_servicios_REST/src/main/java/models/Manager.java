package models;

public class Manager {
    private String name;
    private String lastname;
    private String username;
    private String password;

    public Manager(){

    }
    
    public Manager(String name,String lastname, String username, String password){
        super();
        this.name =name;
        this.lastname = lastname;
        this.username =username;
        this.password =password;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname =lastname;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
