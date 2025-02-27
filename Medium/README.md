# 🚀 LeetCode Solutions - Medium 🟠

This folder contains my solutions for **Medium** LeetCode problems. Each problem includes a description, examples, constraints, and a link to the solution file.

## ⚡ How to Use This Folder

1. Find the problem in the **Table of Contents**.
2. Click the solution link to open the corresponding `.java` file.
3. Run the solution in a Java environment:
   ```sh
   javac 0001.java && java TwoSum
Modify and test with your own input.

</br>

|   | # | Problem | Solution |
|---|---|---------|----------|
| 1  | 1041 | [Robot Bounded In Circle](#-robot-bounded-in-circle) | [➔](Solutions/1041.java) |

</br>

## 📝 Problem Descriptions

### ✅ Robot Bounded In Circle  
**Difficulty:** 🟠 Medium  

**Problem Statement:**  
On an infinite plane, a robot starts at `(0,0)` facing north. It can receive three instructions:  
- `"G"`: Move forward 1 unit.  
- `"L"`: Turn 90° left (anti-clockwise).  
- `"R"`: Turn 90° right (clockwise).  

The robot executes the given instructions repeatedly. Return `true` if the robot remains within a circle, otherwise return `false`.  

**Example:**  

**Input:** `instructions = "GGLLGG"`  
**Output:** `true`  
**Explanation:** The robot returns to `(0,0)` after one cycle.  

**Input:** `instructions = "GG"`  
**Output:** `false`  
**Explanation:** The robot moves straight indefinitely.  

**Input:** `instructions = "GL"`  
**Output:** `true`  
**Explanation:** The robot follows a cycle and returns to `(0,0)`.  

**Constraints:**  
- `1 <= instructions.length <= 100`  
- `instructions[i]` is `"G"`, `"L"`, or `"R"`.  

**Hints:**  
1. Track the final position and direction after one execution of instructions.  
2. The robot is bounded if it changes direction or returns to `(0,0)`.  

[📂 Solution](1041.java)  

[⬆️ Go to top](#top)  

---




