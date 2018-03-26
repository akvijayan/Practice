Introduction

Scala's package approach is simple to java, but it's more flexible. In addition to using the package statement at the top of a class file, you can use a curly brace package style,
similar to C++ and C# namespaces.

The Scala approach to importing members is also similar to Java, and more flexible. With Scala you can:

In your code, there is a parent-child relationship between objects. However, there is no notion of a parent-child relationship between threads. Once the two threads are running they're basically
peers.

Let's say that thread A starts thread B. Unless there's explicit synchronisation between them, either thread can terminate whenever it pleases without affecting the other thread.

Note that either thread can keep the process alive for as long as the thread lives.

When I create and start a thread inside another thread, will it be child thread? Java has no real concept of child thread it inherits the deamon and priority from the  parent but that's
the end that's the end of the parent/child relationship.

When the thread starts it runs along side it's parent and there is no linkage between the two.

Does it prevent the termination of the parent thread while the child thread is running?

No it does not. However I suspect that you are really wondering if a thread can prevent the  termination of the application. Of the child thread is non-daemon then even if a thread can prevent the
termination

