list_1 = [2, 4, 1, 6, 8, 2, 9, 3, 2, 5]
k = 10

a = list_1[0]
b = list_1[len(list_1)-1]

for i in list_1:
  if k >= i > a:
    a = i
  elif k < i < b:
    b = i 

print((a, b)[abs(k - a) > abs(b - k)])



