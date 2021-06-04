import com.magic.datastructures.MyLinkedList;
import com.magic.datastructures.MyNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyNodeTest {

    @Test
    public void givenT3Numbers_WhenLinked_ShouldPassLinkedListTest() {
        MyNode<Integer> firstNode = new MyNode<>(10);
        MyNode<Integer> secondNode = new MyNode<>(20);
        MyNode<Integer> thirdNode = new MyNode<>(30);
        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);
        boolean result = firstNode.getNext().equals(secondNode) && secondNode.getNext().equals(thirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenThreeNumbers_ShouldAddInLinkedList() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.printLinkedList();
        boolean result = myLinkedList.head.data == 30 && myLinkedList.head.getNext().data == 20 && myLinkedList.head.getNext().getNext().data == 10;
        Assertions.assertTrue(result);
    }

    @Test
    public void givenThreeNumbers_ShouldAppendInLinkedList() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(10);
        myLinkedList.append(20);
        myLinkedList.append(30);
        myLinkedList.printLinkedList();
        boolean result = myLinkedList.head.data == 10 && myLinkedList.head.getNext().data == 20 && myLinkedList.head.getNext().getNext().data == 30;
        Assertions.assertTrue(result);
    }

    @Test
    public void given2Number_ShouldInsertAfterFirstGivenNumber() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(10);
        myLinkedList.append(20);
        myLinkedList.append(50);
        myLinkedList.printLinkedList();
        myLinkedList.insert(20, 40);
        boolean result = myLinkedList.head.data == 10 && myLinkedList.head.getNext().data == 20 && myLinkedList.head.getNext().getNext().data == 40 &&
                myLinkedList.head.getNext().getNext().getNext().data == 50;
        Assertions.assertTrue(result);
    }

    @Test
    public void shouldDeleteFromBeginning() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(10);
        myLinkedList.append(20);
        myLinkedList.append(50);
        myLinkedList.printLinkedList();
        myLinkedList.deleteFirstElement();
        myLinkedList.printLinkedList();
        boolean result = myLinkedList.head.data == 20 && myLinkedList.head.getNext().data == 50;
        Assertions.assertTrue(result);

    }


}
