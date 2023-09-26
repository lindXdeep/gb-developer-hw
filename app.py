list = ['a', 'a', 'a', 'b', 'c', 'a', 'a', 'd', 'c', 'd', 'd']

s = len(list)

i = 0
while i < s:
  e = list[i]
  
  if e.find('_') == -1:
    c = 0
    j = i + 1
    if e in list[j:]:
      while j < s:
        if list[j] == e:
          c += 1
          list[j] = list[i] + '_' + str(c)
        j += 1
  i += 1 

print(*list)
