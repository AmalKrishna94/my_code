

def my_function(a, b):
    if a > b:
        print("{0} is greater than {1}".format(a, b))
        return True
    elif b > a:
        print("{1} is greater than {0}".format(a, b))
        return True
    else:
        print("{0} is equal to {1}".format(a, b))
        return False


my_function(12, 12)
