# Command Design Pattern -
Command design pattern is a behavioral design pattern that converts a request into an object with all the required information such as what method to call, arguments, etc.

Think of the Command pattern like ordering food at a restaurant. You tell the waiter what dishes you want to order, but you don't need to know how the chef cooks each dish or the ingredients used. The waiter (like a command) carries your order (the action) to the kitchen (receiver), and the chef (receiver) knows how to prepare each dish based on the order given. You control what you want, but you don't have to worry about the cooking process.

## Components of the Command Pattern:
### Command:
Defines an interface for executing an operation (e.g., Command interface with execute() method).
### Concrete Command:
Implements the Command interface and specifies the binding between a receiver object and an action (e.g., TurnOnCommand, TurnOffCommand).
### Receiver:
Knows how to perform the operation associated with a command (e.g., Light, Stereo).
### Invoker:
Asks the command to carry out the request (e.g., RemoteControl).
