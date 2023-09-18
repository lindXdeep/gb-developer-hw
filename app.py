n = 123

i = 0
while n > 0:
  i += n % 10
  n = int(n / 10)

print(i)