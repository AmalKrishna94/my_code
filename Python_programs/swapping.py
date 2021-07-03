number1 = int(input("Enter num1: "))
number2 = int(input("Enter num2: "))

temp = number1
number1 = number2
number2 = temp

print("The swapped numbers are num1: {0}, num2: {1}".format(number1, number2))
