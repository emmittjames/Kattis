numLines = input()
numLines = int(numLines)
map = {}
visited = []

for i in range (numLines):
    name, has, want = input().split()
    map[has] = want

max=-1
for has in map:
    want = map[has]
    if want in visited:
        continue
    else:
        visited.append(has)
        counter = 0
        while(True):
            if want in visited:
                counter+=1
                break
            if want not in map:
                counter = -1
                break
            has = want
            want = map[has]
            counter+=1
            visited.append(has)
        if counter > max:
            max = counter
if max == -1:
    print("No trades possible")
else:
    print(max)