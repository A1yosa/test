def place(t):
    global x
    global a
    OK=True
    for j in range(t):
        if x[j] and a[t][j]=='0':
            OK=False
            break
    return OK

def  backtrack(t):
    global cn,bestn,n,bestx,x
    if (t > n):
        bestx = x[:]
        bestn=cn
        return
    if place(t-1):
        x[t-1]=1
        cn += 1
        backtrack(t+1)
        cn -= 1
    if (cn+n-t>bestn):
        x[t-1]=0
        backtrack(t+1)
if __name__ =="__main__":

    G_list = []
    data = input()
    try:
        while data.split():
            G_list.append(data.split(','))
            data = input()
    except EOFError as e:
        print()
    finally:
        a=G_list
        n = len(a)
        x=[i for i in range(n)]
        bestx =None
        bestn = cn = 0
        backtrack(1)
        print("最大团顶点个数：", bestn)
        print("最大团为：", bestx)

