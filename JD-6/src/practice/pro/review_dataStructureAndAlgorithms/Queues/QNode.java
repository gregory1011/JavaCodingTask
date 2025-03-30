package practice.pro.review_dataStructureAndAlgorithms.Queues;

public class QNode<T> {
    T value;
    QNode<T> next;

    public QNode(T value) {
        this.value = value;
    }
}
