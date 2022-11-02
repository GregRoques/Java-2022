**Thread:** a sub-processes, running at the same time as the main process.

- In Java, you will always have a **_main_** thread.
- **_Main_** calls the sub-threads.

## Priority

- is on a scale of 1 - 10; 1 is lowest, 10 is highest, 5 is "normal"

## Thread Methods

1. **activeCount()** Returns an estimate of the number of active threads in the current thread’s thread group and its subgroups
2. **checkAccess()** Determines if the currently running thread has permission to modify this thread
3. **clone()** Throws CloneNotSupportedException as a Thread can not be meaningfully cloned
4. **currentThread()** Returns a reference to the currently executing thread object
5. **dumpStack()** Prints a stack trace of the current thread to the standard error stream
6. **enumerate(Thread[] tarray)** Copies into the specified array every active thread in the current thread’s thread group and its subgroups
7. **getAllStackTraces()** Returns a map of stack traces for all live threads 8.
8. **getContextClassLoader()** Returns the context ClassLoader for this Thread
9. **getDefaultUncaughtExceptionHandler()** Returns the default handler invoked when a thread abruptly terminates due to an uncaught exception
10. **getId()** Returns the identifier of this Thread
11. **getName()** Returns this thread’s name
12. **getPriority()** Returns this thread’s priority
13. **getStackTrace()** Returns an array of stack trace elements representing the stack dump of this thread
14. **getState()** Returns the state of this thread
15. **getThreadGroup()** Returns the thread group to which this thread belongs
16. **getUncaughtExceptionHandler()** Returns the handler invoked when this thread abruptly terminates due to an uncaught exception
17. **holdsLock(Object obj)** Returns true if and only if the current thread holds the monitor lock on the specified object
18. **interrupt()** Interrupts this thread
19. **interrupted()** Tests whether the current thread has been interrupted
20. **isAlive()** Tests if this thread is alive
21. **isDaemon()** Tests if this thread is a daemon thread
22. **isInterrupted()** Tests whether this thread has been interrupted
23. **join()** Waits for this thread to die
24. **join(long millis)** Waits at most millis milliseconds for this thread to die
25. **run()** If this thread was constructed using a separate Runnable run object, then that Runnable object’s run method is called; otherwise, this method does nothing and returns
26. **setContextClassLoader(ClassLoader cl)** Sets the context ClassLoader for this Thread
27. **setDaemon(boolean on)** Marks this thread as either a daemon thread or a user thread
28. **setDefaultUncaughtExceptionHandler( Thread.UncaughtExceptionHandler eh)** Set the default handler invoked when a thread abruptly terminates due to an uncaught exception, and no other handler has been defined for that thread
29. **setName(String name)** Changes the name of this thread to be equal to the argument name.
30. **setUncaughtExceptionHandler( Thread.UncaughtExceptionHandler eh)** Set the handler invoked when this thread abruptly terminates due to an uncaught exception
31. **setPriority(int newPriority)** Changes the priority of this thread
32. **sleep(long millis)** Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of milliseconds, subject to the precision and accuracy of system timers and schedulers
33. **start()** Causes this thread to begin execution; the Java Virtual Machine calls the run method of this thread
34. **toString()** Returns a string representation of this thread, including the thread’s name, priority, and thread group
35. **yield()** A hint to the scheduler that the current thread is willing to yield its current use of a processor
