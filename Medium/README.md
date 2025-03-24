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
| 1  | 11 | [Container With Most Water](#-container-with-most-water) | [➔](Solutions/0011.java) |
| 2  | 43 | [Multiply Strings](#-multiply-strings) | [➔](Solutions/0043.java) |
| 3  | 73 | [Set Matrix Zeroes](#-set-matrix-zeroes) | [➔](Solutions/0073.java) |
| 4  | 151 | [Reverse Words in a String](#-reverse-words-in-a-string) | [➔](Solutions/0151.java) |
| 5  | 238 | [Product of Array Except Self](#-product-of-array-except-self) | [➔](Solutions/0238.java) |
| 6  | 1041 | [Robot Bounded In Circle](#-robot-bounded-in-circle) | [➔](Solutions/1041.java) |
| 7  | 1358 | [Number of Substrings Containing All Three Characters](#-number-of-substrings-containing-all-three-characters) | [➔](Solutions/1358.java) |
| 8  | 1657 | [Determine if Two Strings Are Close](#-determine-if-two-strings-are-close) | [➔](Solutions/1657.java) |
| 9  | 1679 | [Max Number of K-Sum Pairs](#-max-number-of-k-sum-pairs) | [➔](Solutions/1679.java) |
| 10  | 1780 | [Check if Number is a Sum of Powers of Three](#-check-if-number-is-a-sum-of-powers-of-three) | [➔](Solutions/1780.java) |
| 11  | 2161 | [Partition Array According to Given Pivot](#-partition-array-according-to-given-pivot) | [➔](Solutions/2161.java) |
| 12  | 2300 | [Successful Pairs of Spells and Potions](#-successful-pairs-of-spells-and-potions) | [➔](Solutions/2300.java) |
| 13  | 2352 | [Equal Row and Column Pairs](#-equal-row-and-column-pairs) | [➔](Solutions/2352.java) |
| 14  | 2523 | [Closest Prime Numbers in Range](#-closest-prime-numbers-in-range) | [➔](Solutions/2523.java) |
| 15  | 2579 | [Count Total Number of Colored Cells](#-count-total-number-of-colored-cells) | [➔](Solutions/2579.java) |
| 16  | 3208 | [Alternating Groups II](#-alternating-groups-ii) | [➔](Solutions/3208.java) |
| 17  | 3306 | [Count of Substrings Containing Every Vowel and K Consonants II](#-count-of-substrings-containing-every-vowel-and-k-consonants-ii) | [➔](Solutions/3306.java) |


</br>


## 📝 Problem Descriptions

### 🔶 Container With Most Water  
**Difficulty:** 🟠 Medium  

**Problem Statement:**  
You are given an integer array `height` of length `n`. There are `n` vertical lines drawn such that the two endpoints of the `i`th line are `(i, 0)` and `(i, height[i])`.  

Find two lines that, together with the x-axis, form a container that can store the most water.  

Return the maximum amount of water a container can store.  

**Note:** You may not slant the container.  

**Example:**  

**Input:**  
`height = [1,8,6,2,5,4,8,3,7]`  
**Output:**  
`49`  

</br><img src="https://github.com/user-attachments/assets/e9345a29-f959-4e52-9356-6fb1c3e05cd9" alt="drawing" width="400" align='center'/></br>

**Explanation:**  
The above vertical lines are represented by the array `[1,8,6,2,5,4,8,3,7]`. The maximum area of water the container can contain is `49`.  

**Input:**  
`height = [1,1]`  
**Output:**  
`1`  

**Constraints:**  
- `n == height.length`  
- `2 <= n <= 10^5`  
- `0 <= height[i] <= 10^4`  

**Hints:**  
1. A brute force approach (checking all pairs) would take `O(n^2)`, which is inefficient.  
2. Use the **two-pointer** technique: Start with one pointer at the left end and one at the right end of the array. Always move the pointer pointing to the shorter line.  
3. The area at each step is calculated as:  
   \[
   \text{area} = \min(\text{height}[left], \text{height}[right]) \times (\text{right} - \text{left})
   \]  

[📂 Solution](Solutions/0011.java)  

[⬆️ Go to top](#top)  

---

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

### ✅ Reverse Words in a String  
**Difficulty:** 🟠 Medium  

**Problem Statement:**  
Given an input string `s`, reverse the order of the words.  

A word is defined as a sequence of non-space characters. The words in `s` will be separated by at least one space.  

Return a string of the words in reverse order concatenated by a single space.  

**Note:**  
- `s` may contain leading or trailing spaces or multiple spaces between two words.  
- The returned string should only have a single space separating the words.  
- Do not include any extra spaces.  

**Example 1:**  
**Input:** s = "the sky is blue"  
**Output:** "blue is sky the"  

**Example 2:**  
**Input:** s = "  hello world  "  
**Output:** "world hello"  
**Explanation:** The reversed string should not contain leading or trailing spaces.  

**Example 3:**  
**Input:** s = "a good   example"  
**Output:** "example good a"  
**Explanation:** Multiple spaces between words should be reduced to a single space.  

**Constraints:**  
- 1 <= s.length <= 10⁴  
- `s` contains English letters (upper-case and lower-case), digits, and spaces `' '`.  
- There is at least one word in `s`.  

**Follow-up:**  
- If the string data type is mutable in your language, can you solve it in-place with **O(1)** extra space?  

[📂 Solution](Solutions/0151.java)  

[⬆️ Go to top](#top)  

---

### ✅ Product of Array Except Self  
**Difficulty:** 🟠 Medium  

**Problem Statement:**  
Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.  

The product of any prefix or suffix of `nums` is guaranteed to fit in a **32-bit integer**.  

You must write an algorithm that runs in **O(n)** time and **without using the division operation**.  

**Example 1:**  
**Input:** nums = [1,2,3,4]  
**Output:** [24,12,8,6]  

**Example 2:**  
**Input:** nums = [-1,1,0,-3,3]  
**Output:** [0,0,9,0,0]  

**Constraints:**  
- 2 <= nums.length <= 10⁵  
- -30 <= nums[i] <= 30  
- The input is generated such that `answer[i]` is guaranteed to fit in a 32-bit integer.  

**Follow-up:**  
- Can you solve the problem in **O(1)** extra space complexity? *(The output array does not count as extra space for space complexity analysis.)*  

**Hints:**  
1. Use **prefix** and **suffix** products to calculate the result efficiently in **O(n)** time.  
2. Try reusing memory or modifying the input array to store intermediate results to minimize additional space usage.  

[📂 Solution](Solutions/0238.java)  

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

### ✅ Number of Substrings Containing All Three Characters  
**Difficulty:** 🟠 Medium  

**Problem Statement:**  
Given a string `s` consisting only of characters `'a'`, `'b'`, and `'c'`, return the number of substrings containing at least one occurrence of all these characters.  

**Example 1:**  
**Input:** s = "abcabc"  
**Output:** 10  
**Explanation:** The substrings containing at least one occurrence of `'a'`, `'b'`, and `'c'` are:  
- "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc", and "abc" (again).  

**Example 2:**  
**Input:** s = "aaacb"  
**Output:** 3  
**Explanation:** The substrings containing at least one occurrence of `'a'`, `'b'`, and `'c'` are:  
- "aaacb", "aacb", and "acb".  

**Example 3:**  
**Input:** s = "abc"  
**Output:** 1  

**Constraints:**  
- 3 <= s.length <= 5 × 10⁴  
- `s` consists only of `'a'`, `'b'`, or `'c'`.  

**Hints:**  
1. For each position, find the first occurrence of `'a'`, `'b'`, and `'c'` on or after this position.  
2. Precompute three linked lists of indices for each `'a'`, `'b'`, and `'c'`.  

[📂 Solution](Solutions/1358.java)  

[⬆️ Go to top](#top)  

---

### 🔶 Determine if Two Strings Are Close  
**Difficulty:** 🟠 Medium  

**Problem Statement:**  
Two strings are considered **close** if you can attain one from the other using the following operations:  

- **Operation 1:** Swap any two existing characters.  
  - Example: `"abcde"` → `"aecdb"`  
- **Operation 2:** Transform every occurrence of one existing character into another existing character, and do the same with the other character.  
  - Example: `"aacabb"` → `"bbcbaa"` (all `'a'`s turn into `'b'`, and all `'b'`s turn into `'a'`)  

You can use the operations on either string as many times as necessary.  

Given two strings `word1` and `word2`, return `true` if they are **close**, or `false` otherwise.  

**Example:**  

**Input:**  
`word1 = "abc"`, `word2 = "bca"`  
**Output:**  
`true`  
**Explanation:**  
- Apply **Operation 1**: `"abc"` → `"acb"`  
- Apply **Operation 1**: `"acb"` → `"bca"`  

**Input:**  
`word1 = "a"`, `word2 = "aa"`  
**Output:**  
`false`  
**Explanation:**  
- It is impossible to attain `"aa"` from `"a"`, or vice versa, in any number of operations.  

**Input:**  
`word1 = "cabbba"`, `word2 = "abbccc"`  
**Output:**  
`true`  
**Explanation:**  
- Apply **Operation 1**: `"cabbba"` → `"caabbb"`  
- Apply **Operation 2**: `"caabbb"` → `"baaccc"`  
- Apply **Operation 2**: `"baaccc"` → `"abbccc"`  

**Constraints:**  
- `1 <= word1.length, word2.length <= 10^5`  
- `word1` and `word2` contain only lowercase English letters.  

**Hints:**  
1. **Operation 1** allows you to freely reorder the string.  
2. **Operation 2** allows you to freely reassign letter frequencies.  

[📂 Solution](Solutions/1657.java)  

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

### 🔶 Max Number of K-Sum Pairs  
**Difficulty:** 🟠 Medium  

**Problem Statement:**  
You are given an integer array `nums` and an integer `k`.  

In one operation, you can pick two numbers from the array whose sum equals `k` and remove them from the array.  

Return the maximum number of operations you can perform on the array.  

**Example:**  

**Input:**  
`nums = [1,2,3,4]`, `k = 5`  
**Output:**  
`2`  
**Explanation:**  
Starting with `nums = [1,2,3,4]`:  
- Remove numbers `1` and `4`, then `nums = [2,3]`  
- Remove numbers `2` and `3`, then `nums = []`  
There are no more pairs that sum up to `5`, hence a total of `2` operations.  

**Input:**  
`nums = [3,1,3,4,3]`, `k = 6`  
**Output:**  
`1`  
**Explanation:**  
Starting with `nums = [3,1,3,4,3]`:  
- Remove the first two `3`s, then `nums = [1,4,3]`  
There are no more pairs that sum up to `6`, hence a total of `1` operation.  

**Constraints:**  
- `1 <= nums.length <= 10^5`  
- `1 <= nums[i] <= 10^9`  
- `1 <= k <= 10^9`  

**Hints:**  
1. The problem requires counting the number of disjoint pairs that sum up to `k`.  
2. For each possible value `x`, it can be paired with `k - x`.  
3. The number of such pairs equals `min(count(x), count(k-x))`, unless `x = k / 2`, where the number of such pairs will be `floor(count(x) / 2)`.  

[📂 Solution](Solutions/1679.java)  

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

### 🔶 Equal Row and Column Pairs  
**Difficulty:** 🟠 Medium  

**Problem Statement:**  
Given a `0`-indexed `n x n` integer matrix `grid`, return the number of pairs `(rᵢ, cⱼ)` such that row `rᵢ` and column `cⱼ` are **equal**.  

A row and column pair is considered **equal** if they contain the same elements in the same order (i.e., an identical array).  

**Example:**  

**Input:**  
`grid = [[3,2,1],[1,7,6],[2,7,7]]`  
**Output:**  
`1`  

</br><img src="https://github.com/user-attachments/assets/153abf90-336c-46a4-9fb2-fead375f1e5b" alt="drawing" width="200" align='center'/></br>

**Explanation:**  
There is **1** equal row and column pair:  
- `(Row 2, Column 1)`: `[2,7,7]`  


</br>

**Input:**  
`grid = [[3,1,2,2],[1,4,4,5],[2,4,2,2],[2,4,2,2]]`  
**Output:**  
`3`

</br><img src="https://github.com/user-attachments/assets/5acec47a-40eb-45f9-8a25-932c494c8c7e" alt="drawing" width="200" align='center'/></br>

**Explanation:**  
There are **3** equal row and column pairs:  
- `(Row 0, Column 0)`: `[3,1,2,2]`  
- `(Row 2, Column 2)`: `[2,4,2,2]`  
- `(Row 3, Column 2)`: `[2,4,2,2]`  

**Constraints:**  
- `n == grid.length == grid[i].length`  
- `1 <= n <= 200`  
- `1 <= grid[i][j] <= 10^5`  

**Hints:**  
1. Use nested loops to compare every row against every column.  
2. Another loop is necessary to compare the row and column **element by element**.  
3. A more efficient approach is to **hash the arrays** and compare their hashed values.  

[📂 Solution](Solutions/2352.java)  

[⬆️ Go to top](#top)  

---

### 🔷 Closest Prime Numbers in Range  
**Difficulty:** 🟠 Medium  

**Problem Statement:**  
Given two positive integers `left` and `right`, find two integers `num1` and `num2` such that:  

1. `left <= num1 < num2 <= right`
2. Both `num1` and `num2` are **prime numbers**.
3. `num2 - num1` is the **minimum** among all other pairs satisfying the above conditions.  

Return the array `ans = [num1, num2]`. If there are **multiple** pairs with the same minimum gap, return the one with the smallest `num1`. If no such pair exists, return `[-1, -1]`.  

**Example:**  

Input: `left = 10, right = 19`  
Output: `[11,13]`  
Explanation:  
The prime numbers between `10` and `19` are `[11, 13, 17, 19]`.  
The closest gap is `2`, which can be achieved by `[11,13]` or `[17,19]`.  
Since `11` is the smallest starting number, we return `[11,13]`.  

Input: `left = 4, right = 6`  
Output: `[-1,-1]`  
Explanation:  
Only one prime (`5`) exists in the range, so no valid pair can be formed.  

**Constraints:**  
- `1 <= left <= right <= 10^6`  

**Hints:**  
1. Use the **Sieve of Eratosthenes** to efficiently find prime numbers.  
2. Iterate through the primes in the given range to find the closest pair.  

[📂 Solution](Solutions/2523.java)  

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

### 🔶 Alternating Groups II  
**Difficulty:** 🟠 Medium  

**Problem Statement:**  
There is a circle of **red** and **blue** tiles. You are given an array `colors` and an integer `k`. The color of tile `i` is represented by `colors[i]`:  

- `colors[i] == 0` means that tile `i` is **red**.
- `colors[i] == 1` means that tile `i` is **blue**.  

An **alternating group** is a contiguous subarray of `k` tiles in the circle where the tiles alternate in color (each tile in the group except the first and last one must have a different color from its left and right tiles).

Return the number of alternating groups.  

**Note:**  
Since `colors` represents a **circle**, the first and last tiles are considered to be next to each other.  

**Example:**  

Input: `colors = [0,1,0,1,0], k = 3`  
Output: `3`  
Explanation:  
![image](https://github.com/user-attachments/assets/734ee222-770a-4a96-ba19-ad1ad19093a8)

There are 3 alternating groups of size 3 in the circle:  
- Group 1: `[0, 1, 0]`

![image](https://github.com/user-attachments/assets/5854d7ef-9303-452f-b655-ad2539624146)
- Group 2: `[1, 0, 1]`

![image](https://github.com/user-attachments/assets/80f2f2ee-7d7d-41fb-8ade-2ab761461092)
- Group 3: `[0, 1, 0]`
  
![image](https://github.com/user-attachments/assets/c3aa7812-b5e9-4eb7-b8c7-2a0a5f50c4b7)  

</br>

Input: `colors = [0,1,0,0,1,0,1], k = 6`  
Output: `2`  
Explanation:  
![image](https://github.com/user-attachments/assets/61862f92-20fe-4761-ac7e-17a080f9dd29)

There are 2 alternating groups of size 6 in the circle:  
- Group 1: `[0, 1, 0, 0, 1, 0]`

![image](https://github.com/user-attachments/assets/6eb256d2-122f-4044-b0d7-f6a89d499f3e)
- Group 2: `[1, 0, 1, 0, 0, 1]`

![image](https://github.com/user-attachments/assets/e3acc0de-52c7-44e1-9df4-1f093b8e479d)

</br>

Input: `colors = [1,1,0,1], k = 4`  
Output: `0`  
Explanation:  
![image](https://github.com/user-attachments/assets/28a3f36f-4eb0-44f6-b201-4217f230065b)

There are no alternating groups of size 4 in the circle.  

**Constraints:**  
- `3 <= colors.length <= 10^5`  
- `0 <= colors[i] <= 1`  
- `3 <= k <= colors.length`  

[📂 Solution](Solutions/3208.java)  

[⬆️ Go to top](#top)  

---

### ✅ Count of Substrings Containing Every Vowel and K Consonants II  
**Difficulty:** 🟠 Medium

**Problem Statement:**  
You are given a string `word` and a non-negative integer `k`.  
Return the total number of substrings of `word` that contain every vowel ('a', 'e', 'i', 'o', and 'u') at least once and exactly `k` consonants.

**Example 1:**  
**Input:** word = "aeioqq", k = 1  
**Output:** 0  
**Explanation:** There is no substring with every vowel.

**Example 2:**  
**Input:** word = "aeiou", k = 0  
**Output:** 1  
**Explanation:** The only substring with every vowel and zero consonants is word[0..4], which is "aeiou".

**Example 3:**  
**Input:** word = "ieaouqqieaouqq", k = 1  
**Output:** 3  
**Explanation:** The substrings with every vowel and one consonant are:  
- word[0..5], which is "ieaouq".  
- word[6..11], which is "qieaou".  
- word[7..12], which is "ieaouq".  

**Constraints:**  
- 5 <= word.length <= 2 * 10^5  
- word consists only of lowercase English letters.  
- 0 <= k <= word.length - 5.  

**Hints:**  
1. We can use sliding window and binary search.  
2. For each index `r`, find the maximum `l` such that both conditions are satisfied using binary search.

[📂 Solution](Solutions/3306.java)

[⬆️ Go to top](#top)

---





