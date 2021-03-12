# Chain of responsibility: A chain of objects
[![](https://img.shields.io/badge/GOF-blue.svg?style=flat)](https://github.com/janbarari/chainofresponsibilitypattern)
[![](https://img.shields.io/badge/Behavioral-green.svg?style=flat)](https://github.com/janbarari/chainofresponsibilitypattern)

It helps to build a chain of objects. A request enters from one end and keeps going from an object to another until it finds a suitable handler.

Wikipedia Says
-------
In object-oriented design, the chain-of-responsibility pattern is a design pattern consisting of a source of command objects and a series of processing objects. Each processing object contains logic that defines the types of command objects that it can handle; the rest are passed to the next processing object in the chain.

How it works
------
Chain of responsibility means handling a request by a chain of handlers. The handlers in the chain can act two types of action
1- Could assign the request to the next handler in the chain when it didn't execute by the handler.
2- Can drop the request and avoid assign it to the next handler in the chain when it's not accepted by the handler.

To make it simple understandable for you I will explain two different scenarios:

1- Imagine you created a Logger which has three handlers (debug, info, error). 
Then to log a message, You will choose the type of your message and send it. The message(request) will walk in the chain to do by a handler.
it will move between the handlers sequentially until one handler in the chain accepts that and do it.

⬇️ Let me describe with an example
------
![](image.png)


 