package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Median {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(3);
        System.out.println(medianFinder.findMedian());
    }
}

class MedianFinder {
    PriorityQueue<Integer> lMaxHeap;
    PriorityQueue<Integer> rMinHeap;
    public MedianFinder() {
        lMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        rMinHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        lMaxHeap.add(num);
        if (lMaxHeap.size() != 0 && rMinHeap.size() != 0 && lMaxHeap.peek() > rMinHeap.peek()) {
            rMinHeap.add(lMaxHeap.poll());
        }
        if (lMaxHeap.size() - rMinHeap.size() > 1) {
            rMinHeap.add(lMaxHeap.poll());
        }

        if (rMinHeap.size() - lMaxHeap.size() > 1) {
            lMaxHeap.add(rMinHeap.poll());
        }
    }

    public double findMedian() {
        if (lMaxHeap.size() > rMinHeap.size()) {
            return lMaxHeap.peek();
        }
        if (rMinHeap.size() > lMaxHeap.size()) {
            return rMinHeap.peek();
        }
        return (lMaxHeap.peek() + rMinHeap.peek())/2.0;
    }
}

