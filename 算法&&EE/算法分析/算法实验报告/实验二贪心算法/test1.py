from heapq import heappop,heapify,heappush
class HeapNode:
    def __init__(self, char, freq):
        self.char = char
        self.freq = freq
    def __lt__(self, other):
        return self.freq < other.freq
    def __eq__(self, other):
        if(other == None):
            return False
        if(not isinstance(other, HeapNode)):
            return False
        return self.freq == other.freq


#创建最初极小堆
def create_heap(frequency, data_set):
    if(len(frequency) != len(data_set)):
        raise Exception('数据和标签不匹配!')
    nodes = []#极小堆
    for i in range(len(data_set)):
        heappush(nodes,HeapNode(data_set[i],frequency[i]) )
    return nodes

# 求最少比较次数
import copy
def best_merge(nodes):
    global min_count
    tree_nodes = nodes.copy()
    while len(tree_nodes) > 1:
        new_left = heappop(tree_nodes)
        new_right = heappop(tree_nodes)
        min_count = min_count + new_left.freq + new_right.freq - 1
        new_node = HeapNode(None, (new_left.freq + new_right.freq))
        heappush(tree_nodes,new_node)

if __name__ == '__main__':
    min_count = 0
    data_set =  ['s1','s2','s3','s4']
    frequency = [5,12,11,2]
    nodes = create_heap(frequency,data_set)#创建初始堆
    best_merge(nodes)#求最少比较次数
    print("最少比较次数为：",min_count)
