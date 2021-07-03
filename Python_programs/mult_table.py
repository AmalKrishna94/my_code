num = int(input("Enter the number: "))
limit = int(input("Enter the limit: "))
for i in range(1, limit+1):
    result = i*num
    print("{0} x {1} = {2}".format(i, num, result))
    i = i+1
