package Oct.Task11Oct;

public class TestCaseAPI extends BaseTestAPI{

    public TestCaseAPI(){
        super("lata",28);
        this.performPOST();
        super.performGET();
    }

    @Override
    public void performGET() {

        System.out.println(" i am overriding performGET");
    }

    @Override
    public void performPOST() {
        System.out.println(" i am overriding performPOST");

    }

    public void performPATCH(int a){

        System.out.println("I am integer patch");

    }

    // Method Overloading
    public void performPATCH(String s){
        System.out.println("I am String patch");
    }
}
