import java.util.Objects;

public class QueueNode<T> {
        private T data;
        private QueueNode<T> prev;
        private QueueNode<T> next;

        public QueueNode(){
            prev = null;
            next = null;
        }
        public QueueNode(T Data){
            this.data =Data;
        }
        public QueueNode(T data, QueueNode<T> prev, QueueNode<T> next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
        public T get_data(){
            return data;
        }
        public QueueNode<T> getPrev(){
            return prev;
        }
        public QueueNode<T> getNext(){
            return next;
        }
        public void set_data(T data){
            this.data = data;
        }
        public void set_prev(QueueNode<T> prev){
            this.prev = prev;
        }
        public void set_next(QueueNode<T> next){
            this.next = next;
        }

        public String toString(){
            return "QueueNode: "+ data;
        }

        @Override // Inteli J did this for me, but it is overriding the .equals method
        public boolean equals(Object o) {
            if (this == o) return true; // if they have the same memory location
            if (o == null || getClass() != o.getClass()) return false;
            QueueNode<?> queueNode = (QueueNode<?>) o;
            return Objects.equals(data, queueNode.data) &&
                    Objects.equals(prev, queueNode.prev) &&
                    Objects.equals(next, queueNode.next);
        }
        @Override
        public int hashCode() {
            return Objects.hash(data, prev, next);
        }
}

