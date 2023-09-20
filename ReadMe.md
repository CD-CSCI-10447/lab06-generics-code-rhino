# **Java Generics: A Simple Guide**

Imagine you're organizing a party. You're handing out bags to your guests, and you want to specify what should go into each bag.

**Without Generics**:
It's like giving out bags with no label. Guests can put in toys, candies, or even shoes. There's no control, and there can be surprises.

**With Generics**:
You can label bags like "Toys Only" or "Candies Only". Now, guests know exactly what to put in. No unexpected surprises!

### **1. What Are Generics?**

Generics allow you to specify the type of objects you're dealing with. Instead of saying "This is a bag", you can say "This is a toy bag".

### **2. How Do You Use Generics?**

In Java, the angle brackets `<>` are used to define the type. For example:

- **ArrayList without Generics**:

```java
ArrayList list = new ArrayList();
```

This is a bag where you can put anything!

- **ArrayList with Generics**:

```java
ArrayList<String> list = new ArrayList<>();
```

This is a bag only for strings!

### **3. Why Use Generics?**

1. **Safety**: By labeling our bags, we make sure no one accidentally puts in the wrong item.
2. **Clear Code**: Just by reading the code, you'll know what kind of items are expected.
3. **Flexibility**: You can decide which type of items you want to work with.

### **4. Let's Try It Out!**

Let's create a simple box that can store one item.

**Without Generics**:
```java
public class Box {
    private Object item;

    public void put(Object item) {
        this.item = item;
    }

    public Object get() {
        return item;
    }
}

Box box = new Box();
box.put("Hello"); // It works!
box.put(123);     // This works too, but it can be confusing!
```

**With Generics**:
```java
public class Box<T> {
    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }
}

Box<String> box = new Box<>();
box.put("Hello");  // Perfect!
// box.put(123);   // This will give an error. Numbers don't go in a string box!
```

### **5. Quick Tips:**
- The letter inside `<>` can be anything (e.g., `T`, `E`, `K`, `V`), but it should make sense. For instance, `T` usually stands for "Type".
- Generics can be used with classes, interfaces, and methods.
- Remember, Generics provide type safety. They help avoid errors by catching them during compile-time, not when the program is running.

### **Wrap Up**

Generics are like labels on bags, guiding you on what should go inside. They make your Java code safer, clearer, and more professional. So next time you're coding, think about what "labels" you can use to make things smoother!

Happy coding! 🎉

## Part 01

**Lab Challenge: Make Your Own 'Pair'!**

**Getting Started**:  
Before you dive into this challenge, watch this helpful video to understand Java Generics better: [Introduction to Java Generics](https://www.youtube.com/watch?v=jUcAyZ5OUm0).

**What You're Building**:  
You're going to make a simple tool that sticks two things together, kind of like pairing socks! But here, you can pair any two things, like a name with an ID or a product with its price.

**Steps**:

1. **Make a Pair Tool**:
    - Create a tool called `Pair<First, Second>`.
    - This tool should have two parts:
        - `FirstPart`: Anything you want to be the first item.
        - `SecondPart`: Anything you want to be the second item.

   And the tool should be able to:
    - Show the `FirstPart`.
    - Show the `SecondPart`.
    - Change the `FirstPart`.
    - Change the `SecondPart`.

2. **Try Out Your Tool**:
    - Stick a name (like "Alice") with a number (like 10).
    - Stick a product name (like "Shoes") with a price (like 49.99).
    - Show these pairs to make sure your tool works.

**Things to Keep in Mind**:
- Make sure your tool knows what kind of things you're sticking together. So it should know if you're pairing a word with a number or a word with a price.

**Extra Fun Challenge**:

1. **Switcheroo!**: Make a helper that can switch the two parts of the pair. So, if you have a name paired with a number, it can switch them to have the number paired with the name.

**How We'll Know You Did Awesome**:

1. You used what you learned from the video!
2. Your Pair tool works just like we talked about.
3. Everything looks neat and organized.
4. If you did the extra fun challenge, that's a bonus!

---

Ready, set, code!

## Part 02

This class provides a collection of methods to perform various string manipulations.

## Location
Package: `edu.desu.part02`

## Methods:

### 1. `wordCount(String input)`

**Description**:  
Takes a string as input and returns the number of words the string contains. Words are separated by single spaces.

**Parameters**:
- `input`: A string whose words are to be counted.

**Example**:  
For the input string "Never eat shredded wheat or cake", the method will return `6`.

### 2. `firstReverse(String input)`

**Description**:  
Takes a string as input and returns the string in reversed order.

**Parameters**:
- `input`: A string to be reversed.

**Example**:  
For the input string "Hello World and Coders", the method will return `sredoC dna dlroW olleH`.

### 3. `longestWord(String input)`

**Description**:  
Takes a string as input and returns the largest word in the string. If there are two or more words that are the same length, it returns the first word from the string with that length. The method ignores punctuation and assumes input will not be empty.

**Parameters**:
- `input`: A string from which the longest word is to be extracted.

### 4. `swapCase(String input)`

**Description**:  
Takes a string as input and swaps the case of each character. Numbers and symbols remain unchanged.

**Parameters**:
- `input`: A string whose case for each character is to be swapped.

**Example**:  
For the input string "Hello World", the method will return `hELLO wORLD`.

---

