def removeDuplicates(nums):
    k = 0
    for i in range(1, len(nums)):
        if nums[i] != nums[k]:
            k += 1
            nums[k] = nums[i]
    return nums, (k+1)

listOfNums, length = removeDuplicates([1,1,1,1,1,2,2,2,2,3,3,4,4,4])

print(listOfNums[:length])