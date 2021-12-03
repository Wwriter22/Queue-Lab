import javax.xml.bind.Element;

public class QueueObject<T> {

        private QueueNode<T> headNode;
        private int size;
        private QueueNode<T> tailNode;

        public QueueObject(){
            size = 0;
            headNode = new QueueNode<>();
            tailNode = headNode;
        }
        public boolean isEmpty(){
//returns if there is nothing in the stack
            return size==0;
        }
        public int size(){
//returns number of Queues
            return size;
        }
        public T peek(){//look at the top element without removing


          return headNode.getNext().get_data();

        }
        public void enqueue(T element){ //add a new node to the bottom of the queue
            QueueNode<T> newNode = new QueueNode<T>(element);

            if(headNode == null){
                headNode = newNode;
                tailNode = headNode;
            }else {
                tailNode.set_next(newNode);
                tailNode = newNode;
            }
            size++;
        }
        public T dequeue(){//remove the top node of the queue and return it
            QueueNode<T> currNode = headNode;
            headNode=currNode.getNext();
            size--;

            return currNode.getNext().get_data();
        }

}
