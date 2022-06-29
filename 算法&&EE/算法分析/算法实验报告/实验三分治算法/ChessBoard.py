def chess(board, tr, tc, pr, pc, size):  # tr,tc：棋盘左上角的位置，即棋盘位置。pr,pc:特殊方格的位置，size为棋盘大小。
    global mark
    # global table
    if size == 1:
        return
    mark = mark + 1
    count = mark
    half = size // 2
    if pr < tr + half and pc < tc + half:
        chess(board,tr, tc, pr, pc, half)
    else:
        board[tr + half - 1][tc + half - 1] = count
        chess(board, tr, tc, tr + half - 1, tc + half - 1, half)
    if pr < tr + half and pc >= tc + half:
        chess(board, tr, tc + half, pr, pc, half)
    else:
        board[tr + half - 1][tc + half] = count
        chess(board, tr, tc + half, tr + half - 1, tc + half, half)
    if pr >= tr + half and pc < tc + half:
        chess(board, tr + half, tc, pr, pc, half)
    else:
        board[tr + half][tc + half - 1] = count
        chess(board, tr + half, tc, tr + half, tc + half - 1, half)
    if pr >= tr + half and pc >= tc + half:
        chess(board, tr + half, tc + half, pr, pc, half)
    else:
        board[tr + half][tc + half] = count
        chess(board, tr + half, tc + half, tr + half, tc + half, half)

def Print(board):
    for i in range(len(board)):
        for j in range(len(board[i])):
            print(board[i][j], end = ' ')
        print()

mark = 0
if __name__ == '__main__':
    k = int(input().strip())
    s = 1
    for i in range(k):
        s *= 2
    line = input().strip().split()
    x = int(line[0]) - 1
    y = int(line[1]) - 1
    board = [[0 for i in range(s)] for j in range(s)]
    board[x][y] = -1
    chess(board, 0, 0, x, y, len(board))
    Print(board)
