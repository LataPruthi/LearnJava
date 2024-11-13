package Oct.Task11Oct;

public class BaseTestAPI {

    private String name;
    private int id;

    public BaseTestAPI(){
        System.out.println("Base class Direct Call");
    }

    public BaseTestAPI(String name,int id){
         this.name=name;
         this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void performGET(){
        System.out.println("I am BaseClass GET method");
    }

    public void performPOST(){
        System.out.println("I am BaseClass POST method");
    }
    public void performPATCH(){
        System.out.println("I am BaseClass PATCH method");
    }
    public void performPUT(){
        System.out.println("I am BaseClass PUT method");
    }
    public void performDELETE(){
        System.out.println("I am BaseClass DELETE method");
    }
}
