t=int(input())
for i in range(t):
    n=int(input())
    k=int(input())
    x=2**k
    y=n
    if((x&y)!=0):
        print("Yes")
    else:
        print("No")