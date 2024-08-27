def intersections(arr,arm):
    ro1=set(arr)
    ro2=set(arm)
    result=ro1.intersection(ro2)
    return list(result)

n=int(input("Enter the Size of the array:"))
arr=[]
arm=[]
for i in range(n):
    number=int(input("enter the ArrayElement{i+1}:"))
    arr.append(number)

for i in range(n):
    numbers=int(input("enter the ArrayElement{i+1}:"))
    arm.append(numbers)    

print(intersections(arr, arm))    