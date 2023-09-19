import random

c = 5

coins = list()

i = 0
while i < c:
  i += 1
  coins.append(random.randint(0, 1))

s = ''.join(str(coins))
res = s.count('0')

print(f"{c} -> {coins} \n{res}")

