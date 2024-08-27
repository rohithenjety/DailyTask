#checking the palindromes
string_name=input("enter the string")
if string_name[::1] == string_name[::-1]:
    print("True")
else:
    print("false")
