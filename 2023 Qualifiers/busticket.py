single,period,duration,total=input().split()
single=int(single)
period=int(period)
duration=int(duration)
total=int(total)
line=[]

line = list(map(int,input().split()))

periodCounter=0
while(True):
    intervals=[]
    start=-1
    end=-1
    index=-1
    for num in range(len(line)):
        end = line[num]+duration

        if line[num] == -1:
            pass
        elif index==-1:
            for i in range(len(line)):
                if line[i]>=end:
                    break
                index=i
        else:
            for i in range(index,len(line)):
                if line[i]>=end:
                    break
                index=i
        intervals.append((num, index))
    max = -1
    maxIndex = -1
        
    for i in range(len(intervals)):
        a, b = intervals[i][0], intervals[i][1]
        if (b-a) > max:
            max = b-a
            maxIndex = i
    

    if (max*single>period):
        periodCounter+=1
        for i in range(intervals[maxIndex][0],intervals[maxIndex][1]+1):
            line.pop(intervals[maxIndex][1]-i)
    else:
        break

singleCounter=0
for i in range(len(line)):
    if line[i] != -1:
        singleCounter+=1

print(singleCounter*single+periodCounter*period)