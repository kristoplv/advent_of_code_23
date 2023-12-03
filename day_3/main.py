

f = open("C:/Users/KristoMarleen/Documents/advent_of_code_23/day_3/input.txt", "r")
lines = []
numbers = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "0"]
symbols =  '*'
summa = 0


for line in f:
    lines.append(line)
for i in range(len(lines)):
    try:
        holder = ""
        numbers_list = []
        for a in range(len(lines[i])):
            if lines[i][a] in numbers:
                if(i == 139): print("siia saime")
                holder += lines[i][a]
            else:
                hold_len = len(holder)
                if hold_len >0:
                    try:
                        if(i<139):
                            if lines[i][a] in symbols or lines[i+1][a] in symbols or lines[i-1][a] in symbols or lines[i][a-hold_len-1] in symbols or lines[i+1][a-hold_len-1] in symbols or lines[i-1][a-hold_len-1] in symbols or lines[i+1][a-hold_len] in symbols or lines[i+1][a-hold_len+1] in symbols or lines[i+1][a-1] in symbols or lines[i-1][a-1] in symbols or lines[i-1][a-hold_len] in symbols or lines[i-1][a-hold_len+1] in symbols:
                                summa += int(holder)
                        else:
                            if lines[i][a] in symbols or lines[i-1][a] in symbols or lines[i][a-hold_len-1] in symbols or lines[i-1][a-hold_len-1] in symbols or lines[i-1][a-1] in symbols or lines[i-1][a-hold_len] in symbols or lines[i-1][a-hold_len+1] in symbols:
                                summa += int(holder)
                    except:
                        print("murekoht line: "+i+"  indeksil: "+a)
                    holder = ""
    except:
        print("error")
print(summa)