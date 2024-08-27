
def repeat(n):
    name=[]
    i=0
    while i < len(n):
        char=n[i]
        count=int(n[i+1])
        name.append(char*count)
        i+=2
    return ''.join(name)



n=input("enter the String:")
print(repeat(n))