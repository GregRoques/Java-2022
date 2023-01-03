# Main... explained!

- The Java Runtime Environment (**JRE**) needs to call "Main" method to run a progam
- **_Main.main(args)_** ... this is essentially what is being called when a program runs

## Explanation of "main" method call anatomy: **public static void main(String[] args)**

1. **public:** needs to be public to be callable by something outside of this class

2. **static:** a static method is a method that can be called on a class without needing an instance of that class to run.

- put another way, the JRE is NOt going to create an object of the class, it is just going to call it directly on this class
- Again, it is calling: **_Main.main(args)_**

3. **void:** void is the return type. Basically, the main method does not need to return anything, so it is void.

4. **main:** this is just the name given to the method that the JRE looks to call... cannot be called anything else.

5. **(String[] args):** this is an "array" of "Strings" that are arguments that can be run by your program.

- to see how _args_ work, take the following example.

  1. Create the following class (see _Main.java_ file in this folder):

  ```
  public class Main{
      public static void main(String[] args){
          System.out.println(args[0])
      }
  }
  ```

  2. In console, compile file; next, pass string argument while running:

  ```
  javac Main.java // will produce file name: Main.class
  java Main CallieTheCat
  ```

  3. Program will print: **CallieTheCat** in console
