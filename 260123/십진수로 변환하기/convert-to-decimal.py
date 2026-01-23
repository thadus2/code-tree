binary = input()

result = 0
for i in range(len(binary)):
    result += int(binary[-i - 1]) * (2 ** i)
print(result)

# Please write your code here.