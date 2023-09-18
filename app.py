n = 385916

x = str(n)
s = int(len(x) / 2)

l = x[:s]
r = x[s:]

a = 0
for i in l:
  a += int(i)

b = 0
for i in r:
  b += int(i)

print(('no','yes')[a == b])