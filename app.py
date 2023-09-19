import random

n = int(input())

l = list()
i = n
while i > 0:
  l.append(random.randint(-50, 50))
  i -= 1

max = 0
cnt = 0
i = 0
while i < n:
  if l[i] > 0:
    cnt += 1
  else:
    if cnt > max:
      max = cnt
    cnt = 0
  
  i += 1

print(f"{n} -> {l} \n{max}")