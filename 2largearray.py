#second largest number
def secondLargest(arr):
    arr.sort(reverse=True)
    return arr[1]

n=int(input("enter the size of the array"))
arr=[]
for i in range(n):
    element=int(input(f"Enter the element of {i+1} "))
    arr.append(element)
print(secondLargest(arr))