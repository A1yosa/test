def heap_sort(array):
    first = len(array) // 2 - 1
    for start in range(first, -1, -1):
        # 从下到上，从右到左对每个非叶节点进行调整，循环构建成大顶堆
        big_heap(array, start, len(array) - 1)
    for end in range(len(array) - 1, 0, -1):
        # 交换堆顶和堆尾的数据
        array[0], array[end] = array[end], array[0]
        # 重新调整完全二叉树，构造成大顶堆
        big_heap(array, 0, end - 1)
    return array


def big_heap(array, start, end):
    root = start
    # 左孩子的索引
    child = root * 2 + 1
    while child <= end:
        # 节点有右子节点，并且右子节点的值大于左子节点，则将child变为右子节点的索引
        if child + 1 <= end and array[child] < array[child + 1]:
            child += 1
        if array[root] < array[child]:
            # 交换节点与子节点中较大者的值
            array[root], array[child] = array[child], array[root]
            # 交换值后，如果存在孙节点，则将root设置为子节点，继续与孙节点进行比较
            root = child
            child = root * 2 + 1
        else:
            break


if __name__ == '__main__':
    array = [1,9,2,0,0,1,3,5,2,2,1]
    print(heap_sort(array))