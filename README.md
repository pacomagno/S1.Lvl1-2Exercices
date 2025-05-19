
# 🎓 Java OOP Exercises – Inheritance, Polymorphism & Interfaces

👨‍💻 **Author:** Alejandro Garcia  
🧠 **Learning Focus:** Object-Oriented Programming (OOP) in Java  
🛠️ **IDE:** IntelliJ IDEA  
💡 **Java SDK:** 23

---

## 📄 Description – Exercise Statement

This repository contains structured Java OOP exercises focused on:

- Inheritance
- Polymorphism
- Interfaces
- Abstract classes
- Static/final field usage
- Method overriding and object interaction

The exercises are organized by level and demonstrate progressive mastery of key OOP concepts.

### 📘 Level 1

#### 🎸 Exercise 1 – Musical Instruments
A music band uses various types of instruments: wind, string, and percussion.

- All instruments share `name` and `price` attributes.
- An abstract method `play()` must be implemented in each subclass.
- Output should vary depending on the instrument type being played.
- Demonstrate how class loading occurs only once, triggered by the creation of the first instance or by accessing a static member.
- Research Java's initialization blocks and static blocks.

#### 🚗 Exercise 2 – Car Attributes & Methods
Create a `Car` class with the following attributes:

- `brand` → `static final`
- `model` → `static`
- `horsepower` → `final`

Demonstrate the differences in usage and which can be initialized in the constructor.  
Add:

- A static method `brake()` → prints `"The vehicle is braking"`
- A non-static method `accelerate()` → prints `"The vehicle is accelerating"`

Call both from the `main()` method in the main class.

---

### 📘 Level 2

#### 📱 Exercise 1 – Smartphone Class
- Create a `Phone` class with `brand`, `model`, and a method `call(String number)`
- Create two interfaces:
  - `Camera` with `takePhoto()`
  - `Clock` with `alarm()`

Then:

- Create a `Smartphone` class that extends `Phone` and implements both interfaces.
- Implement methods with appropriate messages:
  - `"Taking a photo"`
  - `"Alarm is ringing"`
- From the `main()` method, create a `Smartphone` object and test all methods.

---

## 💻 Technologies Used

- ☕ Java 23
- 🧠 IntelliJ IDEA (Community or Ultimate)
- 🗃️ Git & GitHub

---

## 📋 Requirements

Before running this project, ensure you have:

- ✅ Java JDK 23 installed
- ✅ IntelliJ IDEA installed
- ✅ Git installed and configured
- ✅ Internet connection to clone the repository

---

## 🛠️ Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/<your-repository>.git
   ```

2. Open the project in IntelliJ IDEA:
   - **File > Open > [select the cloned folder]**

3. Set the correct SDK:
   - **File > Project Structure > Project SDK > Select JDK 23**

---

## ▶️ Execution

1. Navigate to the `application` package.
2. Open the corresponding `Main` class for the level/exercise you want to run.
3. Right-click the file and select **Run**.
4. View the output in the IntelliJ console.

---

## 🌐 Deployment

This repository is primarily for educational purposes and not intended for production use.

However, to package or deploy:

- You can generate a `.jar` file using IntelliJ’s **Build > Build Artifacts** option.
- To run the JAR via terminal:
  ```bash
  java -jar YourProjectName.jar
  ```

---

## 🤝 Contributions

Contributions are welcome in the future as the project evolves into a broader learning portfolio.  
Currently, this is a personal repository, but you may:

- ⭐ Star the repo if it inspires you
- 🪄 Fork it to try the exercises yourself
- 🛠️ Submit issues for feedback or suggestions

---

## 🎯 Learning Goals

This repository is part of my Java OOP learning journey.  
It demonstrates hands-on understanding of:

- Class hierarchies and abstraction
- Interface implementation
- Static vs instance context
- Method overriding
- Code structure and encapsulation

---

Thanks for visiting! 🚀
