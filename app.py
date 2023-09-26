list = input().split()
size = len(list)

i = 0 
while i < size:
  if list[i] in list[i + 1:]:
    j = list[i + 1:].index(list[i])
    print("::", j)
    while j < size:
      print(list)
      list[j] = list[i] + '_' + str(1)
      j = list[j + 1:].index(list[i])


  


   
    






print(list)