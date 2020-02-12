# Object-Oriented-Programming

## Learning

### First
* object, class
* atributs, methods
* constructors

## Projects

### First
Create class Car\
6 Attributes:
* name
* doors
* wheels
* color
* speed (current speed)
* state ("go" "stopped")

3 methods:
* showInfo()
    * show info in format
    > $name ($wheels,$doors,$color) $state speed $speed km/h\
    Audi (4,3,black) go speed 110 km/h
* start()
    * set state = "go"
    * set speed = 10
* stop()
    * set state = "stopped"
    * set speed = 0
* accelerated(int howmuch)
    * increase speed with number "howmuch"
* slowdown(int howmuch)
    * decreease speeed with number "howmuch"
    * check that speed is not lower then zero

2 constructors:
* first with input parameter
* second without parameters that calls the first-one and sets
    * state = "stopped"
    * speed = 0
    * all other attributes
 

