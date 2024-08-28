def rotated(n):
    str_n=str(n)
    
    dict={'1':'1','6':'9','8':'8','9':'6','0':'0'}
    strs=""
    for i in str_n:
         if  i in dict:
            strs += dict[i]
    strs= strs[::-1]        
    return strs


n=int(input("Enter the number to turn the 180 degreees : " ))
print(rotated(n)) 