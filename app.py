list = [0, -1, 5, 2, 3]

count = 0
i = 0
while i < len(list) - 1:
  if list[i] < list[i + 1]:
    count += 1
  i += 1

print(count)

  