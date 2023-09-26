n = int(input())

sum = 0
x = n - 3
while n > x:
  sum += n
  n -= 1

print(sum)