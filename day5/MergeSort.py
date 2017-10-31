"""
Merge Sort
==========

Time Complexity: O(nlogn)
In-Place : No (needs O(n) auxiliary space)
Stable : Yes
"""

def merge(a, b):
    out = []
    while len(a) > 0 and len(b) > 0:
        if a[0] < b[0]:
            out.append(a[0])
            a.remove(a[0])
        else:
            out.append(b[0])
            b.remove(b[0])
    if len(a) == 0:
        out += b
    else:
        out += a
    return out


def merge_sort(a):
    if len(a) == 0 or len(a) == 1:
        return a
    else:
        m = len(a) // 2
        l = a[:m]
        r = a[m:]

        a = merge_sort(l)
        b = merge_sort(r)
        return merge(a, b)


def main():
    a = [9, 3, 1, 4, 8, 5, 100, 99, 101]
    print('Before sorting:')
    print(a)
    a = merge_sort(a)
    print('\nSorted List:')
    print(a)


if __name__ == '__main__':
    main()
