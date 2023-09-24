list_1 = [1, 1, 2, 0, -1, 3, 4, 4]

lsit_2 = []

for i in list_1:
  if i not in lsit_2:
    lsit_2.append(i)
  else:
    continue

print(len(lsit_2))
    


