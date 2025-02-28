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
| 1  | 73 | [Set Matrix Zeroes](#-set-matrix-zeroes) | [➔](Solutions/0073.java) |
| 2  | 1041 | [Robot Bounded In Circle](#-robot-bounded-in-circle) | [➔](Solutions/1041.java) |

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
### ✅ Set Matrix Zeroes  
**Difficulty:** 🔵 Medium  

**Problem Statement:**  
Given an `m x n` integer matrix, if an element is `0`, set its entire row and column to `0`s.  

You must do it **in place** without using extra space.  

**Example:**  

**Input:**  matrix = `[[1,1,1],[1,0,1],[1,1,1]]`    
**Output:**  `[[1,0,1],[0,0,0],[1,0,1]]`
</br><img src="https://github.com/user-attachments/assets/350651b7-04c9-4623-b0a6-5c6bb17733b4" alt="drawing" width="400" align='center'/></br>

**Input:** matrix = `[[0,1,2,0],[3,4,5,2],[1,3,1,5]]`   
**Output:**  `[[0,0,0,0],[0,4,5,0],[0,3,1,0]]`
</br><img src="https://github.com/user-attachments/assets/29b7dae0-8378-46fb-9a67-b695b97313fd" alt="drawing" width="400" align='center'/></br>


**Constraints:**  
- `1 <= m, n <= 200`  
- `-2^31 <= matrix[i][j] <= 2^31 - 1`  

**Hints:**  
1. Use extra memory to track rows and columns that need to be zeroed.  
2. Avoid modifying the matrix while iterating; use a marker value instead.  
3. Instead of extra memory, use the first row and column to store flags.  
4. The first cell of each row/column can indicate if it should be zeroed.  

[📂 Solution](0073.java)  

[⬆️ Go to top](#top)  

---




