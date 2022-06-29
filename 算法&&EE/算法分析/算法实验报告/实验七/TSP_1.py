import queue

class Node:
    def __init__(self, cl, level, x):  # cl:当前路径长度，level：当前节点层次，g_n：问题规模
        self.cl = cl  # 当前路径长度
        self.level = level  # 节点的层次
        self.x = x  # 部分解

def traveling(a, start, g_n):
    que = queue.Queue()
    node = Node(0, 2, [i for i in range(g_n + 1)])  #
    que.put(node)
    bestx = None  # 最大价值
    bestl = NoEdge
    while (not que.empty()):
        current_node = que.get()
        level = current_node.level
        cl = current_node.cl
        if level == g_n:  # 叶子表示找到了一个比当前解更好的一个解，记录
            if (a[current_node.x[g_n - 1]][current_node.x[g_n]] != NoEdge and a[current_node.x[g_n]][1] != NoEdge and (
                    cl + a[current_node.x[g_n - 1]][current_node.x[g_n]] + a[current_node.x[g_n]][
                1] < bestl or bestl == NoEdge)):
                bestx = current_node.x[:]
                bestl = cl + a[current_node.x[g_n - 1]][current_node.x[g_n]] + a[current_node.x[g_n]][1]
        else:
            for j in range(level, g_n + 1):
                if (a[current_node.x[level - 1]][current_node.x[j]] != NoEdge and (cl < bestl or bestl == NoEdge)):
                    current_node.x[level], current_node.x[j] = current_node.x[j], current_node.x[level]
                    que.put(
                        Node(cl + a[current_node.x[level - 1]][current_node.x[level]], level + 1, current_node.x[:]))
                    current_node.x[level], current_node.x[j] = current_node.x[j], current_node.x[level]
    return bestx, bestl

if __name__ == '__main__':
    import sys
    NoEdge = sys.maxsize

    a = [[NoEdge, NoEdge, NoEdge, NoEdge, NoEdge, NoEdge],
         [NoEdge, NoEdge, 10, NoEdge, 4, 12],
         [NoEdge, 10, NoEdge, 15, 8, 5],
         [NoEdge, NoEdge, 15, NoEdge, 7, 30],
         [NoEdge, 4, 8, 7, NoEdge, 6],
         [NoEdge, 12, 5, 30, 6, NoEdge]]

    g_n = len(a) - 1
    bestx, bestl = traveling(a, 1, g_n)
    print("最短路径长度为：", bestl)
    print("最优旅行路线为：", bestx)
