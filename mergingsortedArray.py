def merge(arr, arm):
    aro=[]
    i,j=0,0
    while i < len(arr) and j< len(arm):
        if arr[i] < arm[j]:
            aro.append(arr[i])
            i+=1
        else:
            aro.append(arm[j])
            j+=1 

    while i< len(arr):
        aro.append(arr[i])
        i+=1

    while j< len(arm):
        aro.append(arm[j])
        j+=1    
    
    return aro

n=int(input("Enter the Size of the array1:"))
m=int(input("Enter the Size of the array2:"))
arr=[]
arm=[]
for i in range(n):
    number=int(input("enter the ArrayElement{i+1}:"))
    arr.append(number)

for i in range(m):
    numbers=int(input("enter the ArrayElement{i+1}:"))
    arm.append(numbers)   

arr.sort()
arm.sort()  

print(merge(arr,arm))    