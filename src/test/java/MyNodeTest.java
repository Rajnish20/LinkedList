import com.magic.datastructures.MyLinkedList;
import com.magic.datastructures.MyNode;
import com.magic.datastructures.SortedLinkedList;
import com.magic.datastructures.Stack;
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

    @Test
    public void shouldDeleteLast() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(10);
        myLinkedList.append(20);
        myLinkedList.append(50);
        myLinkedList.printLinkedList();
        myLinkedList.deleteLastElement();
        myLinkedList.printLinkedList();
        boolean result = myLinkedList.head.data == 10 && myLinkedList.head.getNext().data == 20;
        Assertions.assertTrue(result);
    }

    @Test
    public void givenInteger_WhenPresent_ShouldReturnTrue() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(10);
        myLinkedList.append(20);
        myLinkedList.append(50);
        myLinkedList.printLinkedList();
        boolean result = myLinkedList.search(20);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenInteger_WhenNotPresent_ShouldReturnFalse() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(10);
        myLinkedList.append(20);
        myLinkedList.append(50);
        myLinkedList.printLinkedList();
        boolean result = myLinkedList.search(40);
        Assertions.assertFalse(result);
    }

    @Test
    public void givenInteger_ShouldBeDeletedFromLinkedList() {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.append(10);
        myLinkedList.append(20);
        myLinkedList.append(50);
        myLinkedList.printLinkedList();
        myLinkedList.deleteFromLinkedList(50);
        boolean result = myLinkedList.head.data == 10 && myLinkedList.head.next.data == 20;
        Assertions.assertTrue(result);
    }

    @Test
    public void givenIntegers_ShouldBeAddedInLinkedList_InSortedManner() {
        SortedLinkedList<Integer> sortedLinkedList = new SortedLinkedList<>();
        sortedLinkedList.add(8);
        sortedLinkedList.add(9);
        sortedLinkedList.add(1);
        sortedLinkedList.print();
        boolean result = sortedLinkedList.head.data == 1 && sortedLinkedList.head.next.data == 8 &&
                sortedLinkedList.head.next.next.data == 9;
        Assertions.assertTrue(result);
    }

    @Test
    public void given3Integers_WhenAddedToStack_ShouldHaveLastAddedNode()
    {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(10);
        MyNode<Integer> result = stack.peak();
        Assertions.assertEquals(result.data,10);
    }
}
