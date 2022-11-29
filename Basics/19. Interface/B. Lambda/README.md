- Lambda Expressions **ONLY** possible with **functional Interfaces**

- similar syntax to JavaScript Arrow Function

- Lambda expressions are usually passed as parameters to a function.

- Lambda expressions can be stored in variables if the variable's type is an interface which has only one method. The lambda expression should have the same number of parameters and the same return type as that method.

**Ex:**

```
interface ABC {
    void show();
}

public class Lambda{
    public static void main(String[] args) {
        ABC obj = () -> System.out.println("I'm the best");

        };
        obj.show();
}
```
