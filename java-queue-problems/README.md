
# Queues

* A Queue follows the FIFO(First In First Out) Paradigm.
* Queue can be implemented either by a Array or a linked List
* There are two pointers needed
  - one tracking front of the queue
  - one tracking back of the queue

## Operations

- add    : also called enqueue
- remove : also called dequeue
- peek   : get operation at the front of the queue

# Notes

* The front element is always at index *front*
* The back element is always at index *(back - 1)*. Back always points to the next available position in the queue
* When we add an item, the front field never changes, we always add items to the back
* The add method is like the *push* method in stack
* To get the size of the queue, *you subtract front from back*
