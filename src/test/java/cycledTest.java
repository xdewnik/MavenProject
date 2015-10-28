import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class cycledTest {
    static interface Node<T>{
        T getValue();
        Node<T> next();
    }

    ArrayList<Node> list = new ArrayList<Node>();
    public <T> boolean isCycled(Node<T> node){
        list.clear();
        if(node == null){
            return false;
        }
        if(node==node.next()){
            return true;
        }
        Node cur = node.next();
        list.add(node);
        while(cur!=null ){
              for (Node item : list)
              {
                  if (item ==cur) {
                      return true;
                  }

              }
            list.add(cur);
            cur = cur.next();

        }
        return false;
    }

     static class NodeImpl implements Node{
         public Object getValue() {
             return value;
         }

         private Object value;

         private Node nextNode;


         public  void setValue(Object value){
             this.value=value;
         }

         public void setNext(Node next){
             this.nextNode=next;
         }
         public Node next() {
             return nextNode;
         }
     }

    public static Node initilisedList(){
        NodeImpl nodeFirst = new NodeImpl();
        NodeImpl nodeTwo = new NodeImpl();
        NodeImpl nodeThree = new NodeImpl();
        NodeImpl nodeFour = new NodeImpl();
        NodeImpl nodeFive = new NodeImpl();


        nodeFirst.setValue(1);
        nodeTwo.setValue(2);
        nodeThree.setValue(3);
        nodeFour.setValue(4);
        nodeFive.setValue(5);


        nodeFirst.setNext(nodeTwo);
        nodeTwo.setNext(nodeThree);
        nodeThree.setNext(nodeFour);
        nodeFour.setNext(nodeFive);
        nodeFive.setNext(nodeTwo);
        return nodeFirst;

    }

    @Test
    public void cycledTest(){
        Node node = initilisedList();
        Assert.assertTrue(isCycled(node));
    }
    @Test
    public void nullTest(){
        Assert.assertFalse(isCycled(null));
    }

}


