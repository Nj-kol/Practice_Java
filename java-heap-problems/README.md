# Heap

A heap is a complete binary tree

* Types of heap :
  1. Max Heap
  2. Min Heap

* Usually implemented as an array. Heaps can also be implemented using trees with a node class and pointers, but it’s usually easier and more space efficient to use an array.

* All the nodes are ordered according to the rules listed below:
  - A Heap tree must be a Complete Binary Tree.
  - The nodes must be ordered according to the Heap Property.

* Heapify: Process of converting a binary tree into a heap

## Heap property

A heap is built, based on the Heap property, by comparing the parent node key with its child node keys. This comparison is done based on the heap property. 

**For Max Heap**

* This property states that all the parent node keys must be greater than or equal to their child node keys. So the root node, in this case, will always contain the largest element present in the Heap.

* If Node A has a child node B, then, `key(A)>=key(B)`

**For Min Heap**

* In Min Heap, all the parent node keys are less than or equal to their child node keys. This goes without saying that the rule will apply to all children of the node. So the root node, in this case, will always contain the smallest element present in the Heap. 

* If Node A has a child node B, then, `key(A) <= key(B)`

#### Element retrieval

For node at array[i] :

* Left child = 2i + 1
* Right child = 2i + 2
* Parent = floor((i-1)/2)

# Application

**Sorting**
Can be used to implement Heapsort

**Priority Queues**

* Priority queue is usually implemented using a Max heap
* Heap Implemented priority queues are used in Graph algorithms like Prim’s Algorithm and Dijkstra’s algorithm.

**Statistics**

* The Heap data structure can be used to efficiently find the kth smallest (or largest) element in an array.

# Notes

* If you travel from root to leaf, you get all the values are in descending/ascending order
* If you need random access, Heap should not be the preferred data structure. 
* In a Heap, you generally always fetch the parent, which contains the minimum or maximum value. This operation is always constant time