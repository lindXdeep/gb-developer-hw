a = 21

n = 0

f1 = 1
f2 = 1
while f1 < a - 1 > 0:
  f1, f2 = f2, f1 + f2
  a -= 1 
  n += 1

print(n + 2)

