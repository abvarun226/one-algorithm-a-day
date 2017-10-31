'''

This alogrithm is used to find similarity between two documents

https://ocw.mit.edu/courses/electrical-engineering-and-computer-science/6-006-introduction-to-algorithms-fall-2011/lecture-videos/lecture-2-models-of-computation-document-distance/

'''

import sys
import math
import string


def read_file(filename):
    with open(filename, 'r') as fh:
        return fh.read()


translation_table = string.maketrans(string.punctuation+string.uppercase, ' ' * len(string.punctuation)+string.lowercase)
def get_word_list(text):
    text = text.translate(translation_table)
    word_list = text.split()
    return word_list


def get_word_count_dict(word_list):
    freq = {}
    for word in word_list:
        if word not in freq:
            freq[word] = 0
        freq[word] += 1
    return freq


def get_word_freq(filename):
    text = read_file(filename)
    word_list = get_word_list(text)
    word_freq = get_word_count_dict(word_list)
    return word_freq


def inner_product(V1, V2):
    total = 0.0
    for k in V1:
        if k in V2:
            total += V1[k] * V2[k]
    return total


def vector_angle(V1, V2):
    numerator = inner_product(V1, V2)
    denominator = math.sqrt(inner_product(V1, V1) * inner_product(V2, V2))
    return math.acos(numerator/denominator)


def main():
    if len(sys.argv) != 3:
        print('Incorrect number of arguments.\nUsage: {0} file1 file2'.format(sys.argv[0]))
        sys.exit(1)
    file1 = sys.argv[1]
    file2 = sys.argv[2]
    vector1 = get_word_freq(file1)
    vector2 = get_word_freq(file2)
    distance = vector_angle(vector1, vector2)
    print('The distance between documents: %0.6f (radians)' % (distance))


if __name__ == '__main__':
    # import profile
    # profile.run("main()")
    main()
