class MySampleClass:
    def hello(self, name):
        self.n = name
    def print_name(self):
        print(self.n)


x = MySampleClass()
y = MySampleClass()
name = "Amal Krishna"
x.hello(name)
x.print_name()

y.hello("Arun Krishna")
y.print_name()

