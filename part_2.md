# assignment-3 part 2

Pick a language from this list and explain its object model (like I did with Java and Javascript); how is each pillar expressed in the language you picked? What forms of polymorphism does it allow?

Python
-Class-based
-Everything in Python is an object

Encapsulation
-Classes contain attributes and methods which can be made protected (_) or private (__) to control access by naming conventions, although are not enforced. This differs from Java which requires access modifiers to control class members.

    class Person:
        def __init__(self, name, age):
            self._name = name  # Protected attribute
            self.__age = age   # Private attribute

Abstraction
-Python “Abstract Base Classes” (abc module) and Metaclasses are features of python to create abstraction. ABC’s are similar to Java’s interfaces and create a template for the attributes and methods in its classes. 

    class Dog(ABC): # Inherit from ABC(Abstract base class)
        @abstractmethod  # Decorator to define an abstract method
          def feed(self):
              pass

Inheritance 
-Multiple inheritance - Python supports multiple inheritance which allows a class to inherit from multiple parent classes. This differs from Java which only allows single inheritance.

    class Animal:
        def speak(self):
            pass
    
    class Cat(Animal):
        def speak(self):
            return "Meow!"

Polymorphism
-Dynamic Typing - the interpreter checks type when the code runs; variables types can be changed.
-Duck Typing - unique type where objects are not evaluated explicitly, rather based on their signatures and attributes. The type itself doesn’t matter, rather it must just support all of the methods and attributes that get called on it. "If it walks like a duck and it quacks like a duck, then it must be a duck"
-Method Overloading and Overriding
-Dynamic dispatch - Python uses dynamic polymorphism for calling methods, meaning methods are called at runtime. The execution is determined based on the type of the object at runtime. 

