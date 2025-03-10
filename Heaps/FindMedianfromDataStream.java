package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianfromDataStream {
    private PriorityQueue<Integer> lo;
    private PriorityQueue<Integer> hi;

    public FindMedianfromDataStream() {
        lo = new PriorityQueue<>(Collections.reverseOrder());
        hi = new PriorityQueue<>();
    }

    public void addNum(int num) {
        lo.add(num);
        hi.add(lo.poll());
        if (lo.size() < hi.size()) {
            lo.add(hi.poll());
        }

    }

    public double findMedian() {
        if (lo.size() == hi.size()) {
            return (lo.peek() + hi.peek()) / 2.0;
        } else {
            return lo.peek();
        }

    }

}

// Leetcode question link:
// https://leetcode.com/problems/find-median-from-data-stream/
