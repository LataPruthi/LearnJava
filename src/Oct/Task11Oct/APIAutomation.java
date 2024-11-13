package Oct.Task11Oct;

public class APIAutomation {

    public static void main(String[] args) {
        BaseTestAPI obj= new TestCaseAPI();
        obj.setName("latapruthi");
        System.out.println(obj.getName());
        obj.performGET();

    }
}

