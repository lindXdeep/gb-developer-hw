n, m = map(int, input().split())

list_n = list(map(int, input().split()))[:n]
list_m = list(map(int, input().split()))[:m]

i = 0
while i < n - 1:
  if list_n[i] in list_n[i + 1:]:
    list_n.pop(i)
    n -= 1
  else:
    i += 1

i = 0
while i < m:
  if list_m[i] not in list_n:
    list_m.pop(i)
    m -= 1
  else:
    i += 1

print(*sorted(list_m))
