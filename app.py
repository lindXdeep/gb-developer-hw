dic = {"V": "S001", "V": "S002", "VI": "S001", "VI": "S005", "VII": "S005", "V":"S009", "VIII ":"S007"}

dic_unique = {}

for i in dic:
  if i not in dic_unique:
    dic_unique[i] = dic[i]
    print(dic_unique[i])

