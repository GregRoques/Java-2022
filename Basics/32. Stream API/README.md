## Consumer Interface

- represents a function which takes in one argument and produces a result; However it does not return any value.

**The Consumer interface consists of the following two functions:**

1. accept(): This method accepts one value and performs the operation on the given argument

2. andThen() : This method accepts a parameter after which is the Consumer to be applied after the current one. (like a promise in JS)

## Stream Interface

- once you use a stream, you can't reuse it (think a stream of water... it only goes one way)

- the benefit of Stream is its built-in methods: [Methods](https://developer.mozilla.org/en-US/docs/Web/API/Streams_API)
