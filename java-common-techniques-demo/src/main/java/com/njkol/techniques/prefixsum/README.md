# Prefix sum

* The Prefix sum technique belongs to a category of algorithm called "Range Minimum Query"

## Basic formulas


* For an array A, the Prefix sum array can be calculated as :

```
for (int i = 1; i < A.length; i++) {
   A[i] = A[i] + A[i - 1];
}
```

* For an array A,  the range sum can be calculated as :

```
A[l,r] = A[r] + A[l - 1];
```

For this to work, it is assumed that the array A in the above formula represents the prefix sum array of the original array A
