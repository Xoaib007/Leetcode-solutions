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
| 1  | 43 | [Multiply Strings](#-multiply-strings) | [➔](Solutions/0043.java) |
| 2  | 73 | [Set Matrix Zeroes](#-set-matrix-zeroes) | [➔](Solutions/0073.java) |
| 3  | 1041 | [Robot Bounded In Circle](#-robot-bounded-in-circle) | [➔](Solutions/1041.java) |
| 4  | 1780 | [Check if Number is a Sum of Powers of Three](#-check-if-number-is-a-sum-of-powers-of-three) | [➔](Solutions/1780.java) |
| 5  | 2161 | [Partition Array According to Given Pivot](#-partition-array-according-to-given-pivot) | [➔](Solutions/2161.java) |
| 6  | 2523 | [Closest Prime Numbers in Range](#-closest-prime-numbers-in-range) | [➔](Solutions/2523.java) |
| 7  | 2579 | [Count Total Number of Colored Cells](#-count-total-number-of-colored-cells) | [➔](Solutions/2579.java) |


</br>

## 📝 Problem Descriptions

### ✅ Multiply Strings  
**Difficulty:** 🟠 Medium  

**Problem Statement:**  
Given two non-negative integers `num1` and `num2` represented as strings, return their product as a string.  

**Note:**  
- You **must not** use any built-in BigInteger library.  
- You **cannot** convert the inputs to integers directly.  

**Example:**  

**Input:**  num1 = `"2", num2 = "3"`   
**Output:**  `"6"`

**Input:**  num1 = `"123", num2 = "456"`   
**Output:**  `"56088"`

**Constraints:**  
- `1 <= num1.length, num2.length <= 200`  
- `num1` and `num2` consist of **digits only**.  
- Both `num1` and `num2` do **not** contain leading zeros, except for `"0"` itself.  

[📂 Solution](Solutions/0043.java)  

[⬆️ Go to top](#top)  

---

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

[📂 Solution](Solutions/1041.java)  

[⬆️ Go to top](#top)  

---
### ✅ Set Matrix Zeroes  
**Difficulty:** 🟠 Medium  

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

[📂 Solution](Solutions/0073.java)  

[⬆️ Go to top](#top)  

---

### 🔷 Check if Number is a Sum of Powers of Three  
**Difficulty:** 🟠 Medium  

**Problem Statement:**  
Given an integer `n`, return `true` if it is possible to represent `n` as the sum of distinct powers of three. Otherwise, return `false`.  

An integer `y` is a power of three if there exists an integer `x` such that `y == 3^x`.  

**Example:**  

Input: `n = 12`  
Output: `true`  
Explanation: `12 = 3^1 + 3^2`  

Input: `n = 91`  
Output: `true`  
Explanation: `91 = 3^0 + 3^2 + 3^4`  

Input: `n = 21`  
Output: `false`  

**Constraints:**  
- `1 <= n <= 10^7`  

**Hints:**  
1. The maximum power of `3` needed in the solution is `3^16`.  
2. A number cannot be represented as a sum of distinct powers of `3` if its ternary representation contains a `2`.  

[📂 Solution](Solutions/1780.java)  

[⬆️ Go to top](#top)  

---

### 🔷 Partition Array According to Given Pivot  
**Difficulty:** 🟠 Medium  

**Problem Statement:**  
You are given a `0`-indexed integer array `nums` and an integer `pivot`. Rearrange `nums` such that the following conditions are satisfied:  

1. Every element **less than** `pivot` appears **before** every element **greater than** `pivot`.  
2. Every element **equal to** `pivot` appears **in between** the elements less than and greater than `pivot`.  
3. The **relative order** of the elements less than `pivot` and the elements greater than `pivot` is **maintained**.  

More formally, consider every `pi`, `pj` where `pi` is the new position of the `i`-th element and `pj` is the new position of the `j`-th element. If `i < j` and both elements are smaller (or larger) than `pivot`, then `pi < pj`.  

Return `nums` after the rearrangement.  

**Example:**  

Input: `nums = [9,12,5,10,14,3,10]`, `pivot = 10`  
Output: `[9,5,3,10,10,12,14]`  
Explanation:  
- The elements `{9, 5, 3}` are **less than** `pivot` and appear on the **left**.  
- The elements `{12, 14}` are **greater than** `pivot` and appear on the **right**.  
- The relative ordering of `{9, 5, 3}` and `{12, 14}` is preserved.  

Input: `nums = [-3,4,3,2]`, `pivot = 2`  
Output: `[-3,2,4,3]`  
Explanation:  
- The element `-3` is **less than** `pivot` and appears on the **left**.  
- The elements `{4, 3}` are **greater than** `pivot` and appear on the **right**.  
- The relative ordering of `[-3]` and `[4, 3]` is maintained.  

**Constraints:**  
- `1 <= nums.length <= 10^5`  
- `-10^6 <= nums[i] <= 10^6`  
- `pivot` is guaranteed to be an element of `nums`.  

**Hints:**  
1. Can you store the elements **smaller** than `pivot` and **greater** than `pivot` in separate lists while maintaining order?  
2. Once you have the separate lists, can you concatenate them to get the final result?  

[📂 Solution](Solutions/2161.java)  

[⬆️ Go to top](#top)  

---


### 🔷 Count Total Number of Colored Cells  
**Difficulty:** 🟠 Medium  

**Problem Statement:**  
There exists an infinitely large two-dimensional grid of uncolored unit cells. You are given a positive integer `n`, indicating that you must perform the following routine for `n` minutes:  

1. At the first minute, color any arbitrary unit cell blue.  
2. Every minute thereafter, color blue every uncolored cell that touches a blue cell.  

Below is a pictorial representation of the state of the grid after minutes `1`, `2`, and `3`.
</br><img src="https://github.com/user-attachments/assets/6dd7879a-ab01-4de8-be48-3cb8cb4d3310" alt="drawing" width="400" align='center'/></br>

**Example:**  

Input: `n = 1`   
Output: `1`   
Explanation: `After 1 minute, there is only 1 blue cell, so we return 1.`  

Input: `n = 2`  
Output: `5`  
Explanation: `After 2 minutes, there are 4 colored cells on the boundary and 1 in the center, so we return 5. `  
 

**Constraints:**  
- `1 <= n <= 10^4`  

**Hints:**  
1. Observe the pattern of expansion in each step.  
2. Consider deriving a formula based on the number of cells added per minute.  

[📂 Solution](Solutions/2579.java)  

[⬆️ Go to top](#top)  

---






