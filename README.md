# ASS_3_SHS

# Assignment 3 DecoratorPattern

In this task, I created a Decorator pattern that works with an object, we can say that it complements it. This pattern helps to extend an object, that is, 
extends its functionality by adding or modifying methods on the object.   

To begin with, I created the Component-EndDevice interface in which there is a certain action and the ConcreateComponent-EndDeviceClass class which contains the main, 
basic actions. It implements this Component-And Device interface and its methods. Further, the functions that in the ConcreateComponent-EndDeviceClass class can be 
changed using another DecoratorClass class. We can change and add functions to the object. This our DecoratorClass stores a link to a nested object, a link to the 
Component-EndDevice interface. Thus, it binds to the ConcreateComponent-EndDeviceClass class, it kind of wraps around the ConcreateComponent-EndDeviceClass and when we 
access the EndDeviceClass class, in fact, we are referring to the DecoratorClass. This is how we call the implementation of some action that is in the EndDeviceClass 
and add our new methods. The base Decorator is our DecoratorClass delegates all its operations to the nested main object. But we are not limited only to this base class,
that is why it is the base one. I also created additional Concrete Decorators classes: RAM, Video Card, SSD. Concrete decorators, these classes can be called variants 
of decorators that contain additional behavior for an object.

There is one very good example of this pattern that helped me a lot in mastering how it works, the structure of the decorator pattern, and creating my own example. 
Here is a link to this example: https://www.youtube.com/watch?v=X7-3wQElWd4.


