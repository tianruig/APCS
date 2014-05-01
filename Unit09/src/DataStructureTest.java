public class DataStructureTest extends junit.framework.TestCase {
    public void test1() {
        FunWithQueues test = new FunWithQueues();
        test.addToQueue("Cat");
        assertEquals("Cat", test.removeFromQueue());
        test.addToQueue("Dog");
        assertEquals("Dog", test.removeFromQueue());
        assertEquals("The queue is empty.", test.removeFromQueue());
    }

    public void test2() {
        FunWithQueues test = new FunWithQueues();
        test.addToQueue("Cat");
        test.addToQueue("Dog");
        test.addToQueue("Fish");
        test.addVIPToQueue("Horse");
        assertEquals("Horse", test.removeFromQueue());
        assertEquals("Cat", test.removeFromQueue());
    }

    public void test3() {
        FunWithQueues test = new FunWithQueues();
        test.addToQueue("Cat");
        test.addToQueue("Dog");
        test.addToQueue("Fish");
        test.addVIPToQueue("Horse");
        test.addVIPToQueue("Rabbit");
        test.addToQueue("Turtle");
        assertEquals("Rabbit", test.removeFromQueue());
        assertEquals("Horse", test.removeFromQueue());
        assertEquals("Cat", test.removeFromQueue());
    }


    public void test4() {
        FunWithStacks test = new FunWithStacks();
        test.push("Cat");
        test.push("Dog");
        test.push("Fish");
        assertEquals("Fish", test.pop());
        assertEquals("Dog", test.pop());
        assertEquals("Cat", test.pop());
        assertEquals("The stack is empty.", test.pop());
    }

    public void test5() {
        FunWithStacks test = new FunWithStacks();
        test.push("Cat");
        test.push("Dog");
        test.push("Fish");
        test.push("Horse");
        assertEquals("Horse", test.peek());
        assertEquals("Horse", test.pop());
    }


}