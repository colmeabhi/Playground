val = input()
li = list(val) 

output = []

final = ""

for elements in val:
  if li[-1] != elements:
    output.append(elements);
  else:
    li.pop(-1)
print(final.join(output)[::-1])
    