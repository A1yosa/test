def bubble_sort(nums):
    for i in range(len(nums) - 1):
        swap_flag = False  # 改进后的冒泡，设置一个交换标志位
        for j in range(len(nums) - i - 1):
            if nums[j] > nums[j + 1]:
                nums[j], nums[j + 1] = nums[j + 1], nums[j]
                swap_flag = True
        if not swap_flag:
            return nums  #若没有元素交换，则表示已经有序
    return nums
num1=[1,9,2,0,0,1,3,5,2,2,1]
print(bubble_sort(num1))