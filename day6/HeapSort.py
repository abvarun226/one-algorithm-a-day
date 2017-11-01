"""
HEAPS and HEAP SORT
===================

Time Complexity:
    maxHeapify: O(logn)
    buildMaxHeap: O(n)
    sort: O(nlogn)
"""

class Heap:
    def __init__(self, A=[]):
        self.heapSize = len(A)
        self.heapList = [0] + A

    def left(self, i):
        return 2 * i

    def right(self, i):
        return 2 * i + 1

    def parent(self, i):
        return int(i / 2)

    def printHeap(self):
        print(self.heapList[1:])

    def maxElement(self):
        return self.heapList[1]

    def insert(self, i):
        """
        Inserts a new element to the heap and maintains max heap property
        Time Complexity: O(n)
        """
        self.heapList.append(i)
        self.buildMaxHeap()

    def sort(self):
        """
        Sorts the array in-place
        Time Complexity: O(nlogn)
        """
        size = self.heapSize
        while self.heapSize > 0:
            self.heapList[self.heapSize], self.heapList[1] = swap(
                self.heapList[self.heapSize], self.heapList[1]
            )
            self.heapSize -= 1
            self.buildMaxHeap()
        self.heapSize = size

    def maxHeapify(self, i):
        """
        Maintains max heap property
        Time Complexity: O(logn)
        """
        l = self.left(i)
        r = self.right(i)
        if l <= self.heapSize and self.heapList[l] > self.heapList[i]:
            largest = l
        else:
            largest = i
        if r <= self.heapSize and self.heapList[r] > self.heapList[largest]:
            largest = r
        if largest != i:
            self.heapList[i], self.heapList[largest] = swap(
                self.heapList[i], self.heapList[largest]
            )
            self.maxHeapify(largest)

    def buildMaxHeap(self):
        """
        Builds a max heap using maxHeapify
        Time Complexity: O(n)
        """
        for i in range(int(self.heapSize / 2), 0, -1):
            self.maxHeapify(i)


def swap(a, b):
    return b, a


def main():
    A = [14, 16, 9, 8, 7, 3, 10, 2, 4, 1]
    heap1 = Heap(A)
    print('Input list:')
    heap1.printHeap()

    print('\nBuild Max Heap:')
    heap1.buildMaxHeap()
    heap1.printHeap()

    print('\nSorted List:')
    heap1.sort()
    heap1.printHeap()

    print('\nBuild Max Heap:')
    heap1.buildMaxHeap()
    heap1.printHeap()


if __name__ == '__main__':
    main()
