t=int(input())
for i in range(t):
    n=int(input())
    
    if(n!=0 and n&(n-1)==0):
        print("YES")
    else:
        print("NO")