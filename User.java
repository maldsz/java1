public class User {

    private String name;
    private String cpf;
    private String birthdate; //yyyy-mm-dd
    private static int id_user;

    //constructor method
    public User(String name, String cpf, String birthdate) {
        ++id_user;
        this.name = name;
        this.cpf = cpf;
        this.birthdate = birthdate;
    }

    //toString method is to print the object, because if print the object without the 
    //toString method, it`ll return the memory space that is located, ex: User@251a69d7
    @Override
    public String toString(){
        return "name: "+this.name+", "+"cpf: "+this.cpf+", "+"birthdate: "+this.birthdate;
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    //you can replace all that just for a record, like below:
    //public record User(String name, String cpf, String birthdate){}

}