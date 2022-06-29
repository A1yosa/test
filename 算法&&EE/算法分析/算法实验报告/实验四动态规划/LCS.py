def LCS(A, B):
    n = len(A)
    m = len(B)
    A.insert(0, '0')
    B.insert(0, '0')
    # 二维表c存放公共子序列的长度
    c = [([0] * (m + 1)) for i in range(n + 1)]
    # 二维表s存放公共子序列的长度步进
    b = [([0] * (m + 1)) for i in range(n + 1)]
    for i in range(0, n + 1):
        for j in range(0, m + 1):
            if (i == 0 or j == 0):
                c[i][j] = 0
            elif A[i] == B[j]:
                c[i][j] = (c[i - 1][j - 1] + 1)
                b[i][j] = 0
            elif c[i - 1][j] >= c[i][j - 1]:
                c[i][j] = c[i - 1][j]
                b[i][j] = 1
            else:
                c[i][j] = c[i][j - 1]
                b[i][j] = -1
    return c, b


def printLCS(s, A, i, j):
    global res
    if (i == 0 or j == 0):
        return 0
    if s[i][j] == 0:
        printLCS(s, A, i - 1, j - 1)
        res.append(A[i])
    elif s[i][j] == 1:
        printLCS(s, A, i - 1, j)
    else:
        printLCS(s, A, i, j - 1)


if __name__ == "__main__":
    A = list(input().strip().split())
    B = list(input().strip().split())
    res=[]
    n = len(A)
    m = len(B)
    c, s = LCS(A, B)
    printLCS(s, A, n, m)
    print(res)
