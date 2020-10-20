
public class Heap {

    public static void main(String[] args) {

        int[] heap = new int[]{1,4,5,6,3};

        MaxHeap maxHeap = new MaxHeap(heap,3,4);
    }
}

class MaxHeap{
    int[] heap;
    int MaxSize;
    int HeapSize;

    public MaxHeap(int[] heap, int maxSize, int heapSize) {
        this.heap = heap;
        MaxSize = maxSize;
        HeapSize = heapSize;
    }
}