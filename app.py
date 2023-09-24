one = ['A', 'E', 'I', 'O', 'U', 'L', 'N', 'S', 'T', 'R', 'А', 'В', 'Е', 'И', 'Н', 'О', 'Р', 'С', 'Т']
two = ['D', 'G', 'Д', 'К', 'Л', 'М', 'П', 'У']
three = ['B', 'C', 'M', 'P', 'Б', 'Г', 'Ё', 'Ь', 'Я']
fore = ['F', 'H', 'V', 'W', 'Y', 'Й', 'Ы']
five = ['K', 'Ж', 'З', 'Х', 'Ц', 'Ч']
eight = ['J', 'X','Ш', 'Э', 'Ю']
ten = ['Q', 'Z', 'Ф', 'Щ', 'Ъ']

k = 'ноутбук'

cost = 0

for i in k:
  if i.capitalize() in one:
    cost += 1    
  elif i.capitalize() in two:
    cost += 2
  elif i.capitalize() in three:
    cost += 3
  elif i.capitalize() in fore:
    cost += 4
  elif i.capitalize() in five:
    cost += 5
  elif i.capitalize() in eight:
    cost += 8
  elif i.capitalize() in ten:
    cost += 10

print(cost)