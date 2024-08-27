#Maximum Number In The Array
def maxi(arr):
    print(max(arr))

 
arr=[]
n=int(input("enter the number of integers in the array:"))
for i in range(n):
    ele=int(input("enter the numbers:"))
    arr.append(ele)
maxi(arr)    
     