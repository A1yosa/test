with open('Input.txt', 'rt', encoding='utf-8') as f:
    lines = f.readlines()
line1 = lines[0].strip()
temp = line1.strip().split(' ')
n = int(temp[0])
k = int(temp[1])
distances = []
line2 = lines[1].strip()
temp = line2.strip().split(' ')
for i in temp:
    distances.append(int(i))
isRun = True
for i in range(k):
    if distances[i] > n:
        with open('Output.txt', 'wt', encoding='utf-8') as f:
            f.write("no solution")
        isRun = False
        break
if isRun:
    count = 0
    disMax = 0
    station = ''
    for i in range(k+1):
        disMax += distances[i]
        if disMax >= n:
            disMax = distances[i]
            count += 1
            station += str(i) + ' '
    with open('Output.txt', 'wt', encoding='utf-8') as f:
        f.write(str(count) + '\n')
        f.write(station)