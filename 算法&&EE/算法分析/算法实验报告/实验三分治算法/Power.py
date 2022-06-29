def power(a,n):
    if a == 1:
        return 1
    if a == 0:
        return 0
    if n == 1:
        return a
    if n % 2 == 0:
        b = power(a,n//2)
        return b*b
    else:
        b = power(a,(n-1)//2)
        return b * b * a

if __name__ == '__main__':
    a=int(input("a=").strip())
    n=int(input("n=").strip())
    res=power(a,n)
    print("a^n =",res)