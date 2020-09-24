class ParentA:
  def __init__(self):
    print("ParentA init()")

  def f(self):
    print("ParentA.f()")

class ParentB:
  def __init__(self):
    print("ParentB init()")

  def f(self):
    print("ParentB.f()")

#class ChildBoth(ParentA, ParentB):
class ChildBoth(ParentB, ParentA):
  #def __init__(self):
    #super.something()
  
  def debug(self):
    print("ChildBoth.debug()")

## main app
obj = ParentA()
obj.f()
obj = ParentB()
obj.f()
obj = ChildBoth()
obj.f()
obj.debug()