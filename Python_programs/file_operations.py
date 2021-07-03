file1 = open("C:\\DTAF\\Memory_golden.log", "w")
file1.write("Hi my name is amal krishna")
file1.close()

file2 = open("C:\\DTAF\\Memory_latest.log", "w")
file2.write("Hi my name is arun krishna")
file2.close()


with open("C:\\DTAF\\Memory_golden.log" , "r") as file1:
    with open("C:\\DTAF\\Memory_latest.log", "r") as file2:
        diff = set(file1).difference(file2)
diff.discard('\n')
with open("C:\\DTAF\\Memory_diff.log", "w") as file_out:
    for line in diff:
        file_out.write(line)

with open("C:\\DTAF\\Memory_diff.log", "r") as f:
    x = f.read()
print(x)

