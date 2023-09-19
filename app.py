s, p = map(int, input().split())

y = 0

i = 1
while i < s:
  if p % i == 0:
    y = i
  i += 1

x = s - y

print(x, y)
