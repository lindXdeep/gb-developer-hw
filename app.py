import random

n = int(input())

l = list()

i = 0
while i < n:
  l.append(random.randint(1, 20))
  i += 1

min = l[0] 
max = l[1]

i = 0
while i < n:
  if l[i] > max:
    max = l[i]
  else:
    if min > l[i]:
      min = l[i]
  i += 1

print(f"{n} -> {l}\n{min} {max}")
