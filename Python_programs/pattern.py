limit = int(input("Enter the limit: "))
i = 0
j = limit
while i<limit:
    print((" "*j)+"* "*(i+1))
    i = i+1
    j = j-1