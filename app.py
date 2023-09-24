list = [1, 2, 3, 4, 5]
k = 3

for i in range(k - 1):
  list.insert(0, list.pop())

  print(list)
