import com.magic.datastructures.MyLinkedList;
import com.magic.datastructures.MyNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyNodeTest {

    @Test
    public void givenT3Numbers_WhenLinked_ShouldPassLinkedListTest()
    {
        MyNode<Integer> firstNode = new MyNode<>(10);
        MyNode<Integer> secondNode = new MyNode<>(20);
        MyNode<Integer> thirdNode = new MyNode<>(30);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenThreeNumbers_ShouldAddInLinkedList()
    {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.printLinkedList();
        boolean result = myLinkedList.head.data == 30 && myLinkedList.head.getNext().data == 20 && myLinkedList.head.getNext().getNext().data == 10;
        Assertions.assertTrue(result);
    }

    

}
