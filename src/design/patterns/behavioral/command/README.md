Command Design Pattern -
Command design pattern is a behavioral design pattern that converts a request into an object with all the required information such as what method to call, arguments, etc.

Components of the Command Pattern:
Command:

Defines an interface for executing an operation (e.g., Command interface with execute() method).
Concrete Command:

Implements the Command interface and specifies the binding between a receiver object and an action (e.g., TurnOnCommand, TurnOffCommand).
Receiver:

Knows how to perform the operation associated with a command (e.g., Light, Stereo).
Invoker:

Asks the command to carry out the request (e.g., RemoteControl).