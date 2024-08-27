#removing the duplicate elements in the array by just using the set()

def duplicates(arr):
    roh=set(arr)
    return list(roh)

n=int(input("Enter the Size of the Array/List"))
arr=[]
for i in range(n):
    element=int(input(f"Enter the Elements:${i+1}"))
    arr.append(element)
print(duplicates(arr))    