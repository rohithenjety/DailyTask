#Kth  largest number
def KthLargest(arr,k):
    arr.sort(reverse=True)
    return arr[k-1]

n=int(input("enter the size of the array"))
k=int(input("enter the position at which you need the element to want:"))
arr=[]
for i in range(n):
    element=int(input(f"Enter the element of {i+1} "))
    arr.append(element)
print(KthLargest(arr,k))