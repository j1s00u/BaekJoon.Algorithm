package com.java.Sort;

import java.util.Scanner;

class Heap {
	private int heapSize;
	private int itemHeap[];

	public Heap() {
		heapSize = 0;
		itemHeap = new int[1000000];
	}

	public void insertHeap(int item) {
		int i = ++heapSize;
		while ((i != 1) && (item > itemHeap[i / 2])) {
			itemHeap[i] = itemHeap[i / 2];
			i /= 2;
		}
		itemHeap[i] = item;
	}

	public int getHeapSize() {
		return this.heapSize;
	}

	public int deleteHeap() {
		int parent, child;
		int item, tmp;
		item = itemHeap[1];
		tmp = itemHeap[heapSize--];
		parent = 1;
		child = 2;
		while (child <= heapSize) {
			if ((child < heapSize) && (itemHeap[child] < itemHeap[child + 1]))
				child++;
			if (tmp >= itemHeap[child])
				break;
		itemHeap[parent] = itemHeap[child];
		parent = child;
		child *=2;
		}
		itemHeap[parent] = tmp;
		return item;
		
		
	}
}

public class No_2751 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int[] arr = new int[input];
		
		for(int i = 0; i < input; i++) {
			arr[i] = scan.nextInt();
		}
		HeapSort(arr);
	}

	public static void HeapSort(int[] arr) {
		Heap heap = new Heap();
		for (int i = 0; i < arr.length; i++) {
			heap.insertHeap(arr[i]);
		}
		for (int i = arr.length - 1; i >= 0; --i) {
			arr[i] = heap.deleteHeap();
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
