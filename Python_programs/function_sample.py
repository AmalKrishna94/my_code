def f1(*value):
    print("first:{0}, second: {1}".format(value[0],value[1]))
    sum = value[0]+value[1]+value[2]+value[3]
    return sum


res=f1(2,3,4,5)
print(res)
