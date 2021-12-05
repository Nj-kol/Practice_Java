# Stack

* A Stack is an Abstract Data Type
* Stack is a linear data structure which follows a particular order in which the operations are performed. 
* The order may be LIFO(Last In First Out)
* A Stack can be implemented by backing it with either an Array or Linked List

## Array

**Operations Time Complexity**

* Push 
  - Best case : O(1)
  - Worst case: O(N) ( Since the Array may need to be resized )
  
* Pop
   - Best case : O(1)
  
* Peek 
  - Always : O(1)
  - Worst case: O(N) ( Since the Array may need to be resized )

## Linked List

* Push 
  - Best case : O(1)
  - Worst case: O(1)
  
* Pop
   - Best case : O(1)
  
* Peek 
  - Always : O(1)
  - Worst case: O(1)
  
# Notes

* If we know the size of the array up front and the memory is tight, a Stack backed by an Array may be a better choice
* Top always points to the next available position on the stack. The top item is actual located at *(top - 1)*