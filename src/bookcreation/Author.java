package bookcreation;
public class Author {
    private final String name;
    private final char gender;
    private String email;


    Author(String name, char gender, String email){
    this.name = name;
    this.gender = gender;
    this.email = email;
    }
    public String getName(){
    return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public void setEmail(String email){
        this.email = email;
    }
}

