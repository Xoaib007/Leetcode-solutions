# 🚀 LeetCode Solutions - Easy 🟢

This folder contains my solutions for **Easy** LeetCode problems. Each problem includes a description, examples, constraints, and a link to the solution file.

## ⚡ How to Use This Folder

1. Find the problem in the **Table of Contents**.
2. Click the solution link to open the corresponding `.java` file.
3. Run the solution in a Java environment:
   ```sh
   javac 0001.java && java TwoSum
4. Modify and test with your own input.

|   | # | Problem | Solution |  |
|---|---|---------|----------|--|
| 1  | 1  | [Two Sum](#-two-sum)  | [➔](Solutions/0001.java) | ✔ |
| 2  | 9  | [Palindrome Number](#-palindrome-number)  | [➔](Solutions/0009.java) | ✔ |
| 3  | 13 | [Roman to Integer](#-roman-to-integer)  | [➔](Solutions/0013.java) |  |
| 4  | 14 | [Longest Common Prefix](#-longest-common-prefix)  | [➔](Solutions/0014.java) |  |
| 5  | 20 | [Valid Parentheses](#-valid-parentheses)  | [➔](Solutions/0020.java) |  |
| 6  | 26 | [Remove Duplicates from Sorted Array](#-remove-duplicates-from-sorted-array)  | [➔](Solutions/0026.java) |  |
| 7  | 27 | [Remove Element](#-remove-element)  | [➔](Solutions/0027.java) |  |
| 8  | 28 | [Find the Index of the First Occurrence in a String](#-find-the-index-of-the-first-occurrence-in-a-string)  | [➔](Solutions/0028.java) |  |
| 9  | 35 | [Search Insert Position](#-search-insert-position)  | [➔](Solutions/0035.java) |  |
| 10 | 58 | [Length of Last Word](#-length-of-last-word)  | [➔](Solutions/0058.java) |  |
| 11 | 66 | [Plus One](#-plus-one)  | [➔](Solutions/0066.java) |  |
| 12 | 67 | [Add Binary](#-add-binary)  | [➔](Solutions/0067.java) |  |
| 13 | 69 | [Sqrt(x)](#-sqrtx)  | [➔](Solutions/0069.java) |  |
| 14 | 70 | [Climbing Stairs](#-climbing-stairs)  | [➔](Solutions/0070.java) |  |
| 15 | 242 | [Valid Anagram](#-valid-anagram)  | [➔](Solutions/0242.java) |  |
| 16 | 283 | [Move Zeroes](#-move-zeroes)  | [➔](Solutions/0283.java) |  |
| 17 | 383 | [Ransom Note](#-ransom-note)  | [➔](Solutions/0383.java) |  |
| 18 | 389 | [Find the Difference](#-find-the-difference)  | [➔](Solutions/0389.java) |  |
| 19 | 412 | [Fizz Buzz](#-fizz-buzz)  | [➔](Solutions/0412.java) |  |
| 20 | 459 | [Repeated Substring Pattern](#-repeated-substring-pattern)  | [➔](Solutions/0459.java) |  |
| 21 | 657 | [Robot Return to Origin](#-robot-return-to-origin)  | [➔](Solutions/0657.java) |  |
| 22 | 682 | [Baseball Game](#-baseball-game)  | [➔](Solutions/0682.java) |  |
| 23 | 709 | [To Lower Case](#-to-lower-case)  | [➔](Solutions/0709.java) |  |
| 24 | 896 | [Monotonic Array](#-monotonic-array)  | [➔](Solutions/0896.java) |  |
| 25 | 1275 | [Find Winner on a Tic Tac Toe Game](#-find-winner-on-a-tic-tac-toe-game)  | [➔](Solutions/1275.java) |  |
| 26 | 1342 | [Number of Steps to Reduce a Number to Zero](#-number-of-steps-to-reduce-a-number-to-zero)  | [➔](Solutions/1342.java) |  |
| 27 | 1480 | [Running Sum of 1d Array](#-running-sum-of-1d-array)  | [➔](Solutions/1480.java) |  |
| 28 | 1502 | [Can Make Arithmetic Progression From Sequence](#-can-make-arithmetic-progression-from-sequence)  | [➔](Solutions/1502.java) |  |
| 29 | 1523 | [Count Odd Numbers in an Interval Range](#-count-odd-numbers-in-an-interval-range)  | [➔](Solutions/1523.java) |  |
| 30 | 1572 | [Matrix Diagonal Sum](#-matrix-diagonal-sum)  | [➔](Solutions/1572.java) |  |
| 31 | 1672 | [Richest Customer Wealth](#-richest-customer-wealth)  | [➔](Solutions/1672.java) |  |
| 32 | 1768 | [Merge Strings Alternately](#-merge-strings-alternately)  | [➔](Solutions/1768.java) |  |
| 33 | 1822 | [Sign of the Product of an Array](#-sign-of-the-product-of-an-array)  | [➔](Solutions/1822.java) |  |


## 📝 Problem Descriptions

### ✅ Two Sum
**Difficulty:** 🟢 Easy

**Problem Statement:**  
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.  

You may assume that each input would have exactly one solution, and you may not use the same element twice.  
You can return the answer in any order.  

**Example:**  

Input: `nums = [2,7,11,15]`, target = `9`  
Output: `[0,1]`  
Explanation: Because `nums[0] + nums[1] == 9`, we return `[0, 1]`.  

Input: `nums = [3,2,4]`, target = `6`  
Output: `[1,2]`  

Input: `nums = [3,3]`, target = `6`  
Output: `[0,1]`  

**Constraints:**  
- `2 <= nums.length <= 10^4`  
- `-10^9 <= nums[i] <= 10^9`  
- `-10^9 <= target <= 10^9`  
- Only one valid answer exists.  

**Hints:**  
1. A really brute force way would be to search for all possible pairs of numbers, but that would be too slow. Again, it's best to try out brute force solutions just for completeness. It is from these brute force solutions that you can come up with optimizations.  
2. So, if we fix one of the numbers, say `x`, we have to scan the entire array to find the next number `y` which is `target - x`. Can we change our array somehow so that this search becomes faster?  
3. The second train of thought is, without changing the array, can we use additional space somehow? Like maybe a hash map to speed up the search?  

[📂 Solution](Solutions/0001.java)

[⬆️ Go to top](#top)

---

### ✅ Palindrome Number 
**Difficulty:** 🟢 Easy

**Problem Statement:**  
Given an integer `x`, return `true` if `x` is a palindrome, and `false` otherwise.  

**Example:**  

Input: `x = 121`  
Output: `true`  
Explanation: `121` reads as `121` from left to right and from right to left.  

Input: `x = -121`  
Output: `false`  
Explanation: From left to right, it reads `-121`. From right to left, it becomes `121-`. Therefore, it is not a palindrome.  

Input: `x = 10`  
Output: `false`  
Explanation: Reads `01` from right to left. Therefore, it is not a palindrome.  

**Constraints:**  
- `-2^31 <= x <= 2^31 - 1`  

**Hints:**  
1. Beware of overflow when you reverse the integer.  

[📂 Solution](Solutions/0009.java)

[⬆️ Go to top](#top)

---

### ✅ Roman to Integer 
**Difficulty:** 🟢 Easy

**Problem Statement:**  
Roman numerals are represented by seven different symbols:  

| Symbol | Value |
|--------|-------|
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

For example, `2` is written as `II` in Roman numerals, just two ones added together. `12` is written as `XII`, which is simply `X + II`. The number `27` is written as `XXVII`, which is `XX + V + II`.  

Roman numerals are usually written from largest to smallest from left to right. However, there are six instances where subtraction is used:  

- `I` can be placed before `V` (5) and `X` (10) to make `4` and `9`.  
- `X` can be placed before `L` (50) and `C` (100) to make `40` and `90`.  
- `C` can be placed before `D` (500) and `M` (1000) to make `400` and `900`.  

Given a Roman numeral `s`, convert it to an integer.  

**Example:**  

Input: `s = "III"`  
Output: `3`  
Explanation: `III = 3`.  

Input: `s = "LVIII"`  
Output: `58`  
Explanation: `L = 50`, `V = 5`, `III = 3`.  

Input: `s = "MCMXCIV"`  
Output: `1994`  
Explanation: `M = 1000`, `CM = 900`, `XC = 90` and `IV = 4`.  

**Constraints:**  
- `1 <= s.length <= 15`  
- `s` contains only the characters `('I', 'V', 'X', 'L', 'C', 'D', 'M')`.  
- It is guaranteed that `s` is a valid Roman numeral in the range `[1, 3999]`.  

**Hints:**  
1. The problem is simpler to solve by working through the string from back to front and using a map.  

[📂 Solution](Solutions/0013.java)

[⬆️ Go to top](#top)  

---
### ✅ Longest Common Prefix  
**Difficulty:** 🟢 Easy  
**Problem Statement:**  
Write a function to find the **longest common prefix** string amongst an array of strings.  

If there is **no common prefix**, return an **empty string** `""`.  

**Example:**  

Input: `strs = ["flower","flow","flight"]`  
Output: `"fl"`  

Input: `strs = ["dog","racecar","car"]`  
Output: `""`  
Explanation: There is no common prefix among the input strings.  

**Constraints:**  
- `1 <= strs.length <= 200`  
- `0 <= strs[i].length <= 200`  
- `strs[i]` consists of only lowercase English letters.  

**Hints:**  
1. The **horizontal scanning** method compares prefixes of each word one by one.  
2. The **vertical scanning** method compares each character position across all words.  
3. A **binary search** method can be used to find the longest prefix efficiently.  

[📂 Solution](Solutions/0014.java)  

[⬆️ Go to top](#top)  

---

### ✅ Valid Parentheses  
**Difficulty:** 🟢 Easy  
**Problem Statement:**  
Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['`, and `']'`, determine if the input string is **valid**.  

A string is **valid** if:  
- Open brackets must be closed by the same type of brackets.  
- Open brackets must be closed in the correct order.  
- Every closing bracket has a corresponding open bracket of the same type.  

**Example:**  

Input: `s = "()"`  
Output: `true`  

Input: `s = "()[]{}"`  
Output: `true`  

Input: `s = "(]"`  
Output: `false`  

Input: `s = "([])"`  
Output: `true`  

**Constraints:**  
- `1 <= s.length <= 10^4`  
- `s` consists only of `()[]{}`  

**Hints:**  
1. Use a **stack** to keep track of open brackets.  
2. When encountering an **opening bracket**, push it onto the stack.  
3. When encountering a **closing bracket**, check if it matches the **top of the stack**. If it does, pop the stack; otherwise, return `false`.  

[📂 Solution](Solutions/0020.java)  

[⬆️ Go to top](#top)  

---

### ✅ Remove Duplicates from Sorted Array
**Difficulty:** 🟢 Easy

**Problem Statement:**  
Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in `nums`.  

Consider the number of unique elements of `nums` to be `k`. To get accepted, you need to do the following:  

- Modify the array `nums` such that the first `k` elements contain the unique elements in the order they appeared in `nums` initially.  
- The remaining elements of `nums` are not important.  
- Return `k`.  

**Example:**  

Input: `nums = [1,1,2]`  
Output: `2, nums = [1,2,_]`  
Explanation: Your function should return `k = 2`, with the first two elements of `nums` being `1` and `2` respectively.  

Input: `nums = [0,0,1,1,1,2,2,3,3,4]`  
Output: `5, nums = [0,1,2,3,4,_,_,_,_,_]`  
Explanation: Your function should return `k = 5`, with the first five elements of `nums` being `0, 1, 2, 3, and 4` respectively.  

**Constraints:**  
- `1 <= nums.length <= 3 * 10^4`  
- `-100 <= nums[i] <= 100`  
- `nums` is sorted in non-decreasing order.  

**Hints:**  
1. The key point to focus on is that the input array is sorted. Consider the positioning of duplicate elements in the sorted array.
</br><img src="https://github.com/user-attachments/assets/f7503246-a798-4c55-829d-2677429734a6" alt="drawing" width="400" align='center'/></br>
2. We need to modify the array in-place, so a two-pointer approach is useful: one pointer to track the current element in the original array and another for unique elements.  
3. Once an element is encountered, bypass its duplicates and move to the next unique element.  

[📂 Solution](Solutions/0026.java) 

[⬆️ Go to top](#top)

---

### ✅ Remove Element  
**Difficulty:** 🟢 Easy

**Problem Statement:**  
Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` in-place. The order of the elements may be changed. Then return the number of elements in `nums` which are not equal to `val`.  

Consider the number of elements in `nums` that are not equal to `val` as `k`. To get accepted, you need to do the following:  

- Modify the array `nums` such that the first `k` elements contain the elements which are not equal to `val`.  
- The remaining elements of `nums` are not important.  
- Return `k`.  

**Example:**  

Input: `nums = [3,2,2,3]`, `val = 3`  
Output: `2, nums = [2,2,_,_]`  
Explanation: Your function should return `k = 2`, with the first two elements of `nums` being `2`.  
It does not matter what you leave beyond the returned `k` (hence they are underscores).  

Input: `nums = [0,1,2,2,3,0,4,2]`, `val = 2`  
Output: `5, nums = [0,1,4,0,3,_,_,_]`  
Explanation: Your function should return `k = 5`, with the first five elements of `nums` being `0, 1, 4, 0, and 3`.  
The five elements can be returned in any order.  
It does not matter what you leave beyond the returned `k` (hence they are underscores).  

**Constraints:**  
- `0 <= nums.length <= 100`  
- `0 <= nums[i] <= 50`  
- `0 <= val <= 100`  

**Hints:**  
1. The problem asks us to modify the array in-place, but elements beyond the new length can be anything.  
2. We can move all occurrences of `val` to the end of the array using two pointers.
</br><img src="https://github.com/user-attachments/assets/990e3ed1-bf53-4b1d-b4ca-3053aaf626d1" alt="drawing" width="400" align='center'/></br>
3. Another approach is to copy the non-`val` elements in-place in a single pass.  

[📂 Solution](Solutions/0027.java)  

[⬆️ Go to top](#top)  

---

### ✅ Find the Index of the First Occurrence in a String  
**Difficulty:** 🟢 Easy

**Problem Statement:**  
Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.  

**Example:**  

Input: `haystack = "sadbutsad"`, `needle = "sad"`  
Output: `0`  
Explanation: `"sad"` occurs at index `0` and `6`.  
The first occurrence is at index `0`, so we return `0`.  

Input: `haystack = "leetcode"`, `needle = "leeto"`  
Output: `-1`  
Explanation: `"leeto"` did not occur in `"leetcode"`, so we return `-1`.  

**Constraints:**  
- `1 <= haystack.length, needle.length <= 10^4`  
- `haystack` and `needle` consist of only lowercase English characters.  

[📂 Solution](Solutions/0028.java)  

[⬆️ Go to top](#top)  

---

### ✅ Search Insert Position  
**Difficulty:** 🟢 Easy

**Problem Statement:**  
Given a sorted array of **distinct** integers and a `target` value, return the index if the `target` is found.  
If not, return the index where it would be if it were inserted in order.  

You must write an algorithm with **O(log n)** runtime complexity.  

**Example:**  

Input: `nums = [1,3,5,6]`, `target = 5`  
Output: `2`  

Input: `nums = [1,3,5,6]`, `target = 2`  
Output: `1`  

Input: `nums = [1,3,5,6]`, `target = 7`  
Output: `4`  

**Constraints:**  
- `1 <= nums.length <= 10^4`  
- `-10^4 <= nums[i] <= 10^4`  
- `nums` contains **distinct** values sorted in **ascending order**.  
- `-10^4 <= target <= 10^4`  

[📂 Solution](Solutions/0035.java)  

[⬆️ Go to top](#top)  

---

### ✅ Length of Last Word  
**Difficulty:** 🟢 Easy 

**Problem Statement:**  
Given a string `s` consisting of words and spaces, return the **length** of the **last word** in the string.  

A **word** is a maximal substring consisting of **non-space** characters only.  

**Example:**  

Input: `s = "Hello World"`  
Output: `5`  
Explanation: The last word is `"World"` with length `5`.  

Input: `s = "   fly me   to   the moon  "`  
Output: `4`  
Explanation: The last word is `"moon"` with length `4`.  

Input: `s = "luffy is still joyboy"`  
Output: `6`  
Explanation: The last word is `"joyboy"` with length `6`.  

**Constraints:**  
- `1 <= s.length <= 10^4`  
- `s` consists of only **English letters** and **spaces (' ')**.  
- There will be at least **one word** in `s`.  

[📂 Solution](Solutions/0058.java)  

[⬆️ Go to top](#top)  

---

### ✅ Plus One  
**Difficulty:** 🟢 Easy  

**Problem Statement:**  
You are given a **large integer** represented as an integer array `digits`, where each `digits[i]` is the `i`-th digit of the integer. The digits are ordered from **most significant** to **least significant** in left-to-right order. The large integer does **not** contain any leading `0`s.  

Increment the large integer by **one** and return the resulting array of digits.  

**Example:**  

Input: `digits = [1,2,3]`  
Output: `[1,2,4]`  
Explanation: The array represents the integer `123`.  
Incrementing by one gives `123 + 1 = 124`.  
Thus, the result should be `[1,2,4]`.  

Input: `digits = [4,3,2,1]`  
Output: `[4,3,2,2]`  
Explanation: The array represents the integer `4321`.  
Incrementing by one gives `4321 + 1 = 4322`.  
Thus, the result should be `[4,3,2,2]`.  

Input: `digits = [9]`  
Output: `[1,0]`  
Explanation: The array represents the integer `9`.  
Incrementing by one gives `9 + 1 = 10`.  
Thus, the result should be `[1,0]`.  

**Constraints:**  
- `1 <= digits.length <= 100`  
- `0 <= digits[i] <= 9`  
- `digits` does **not** contain any leading `0`s.  

[📂 Solution](Solutions/0066.java)  

[⬆️ Go to top](#top)  

---

### ✅ Add Binary  
**Difficulty:** 🟢 Easy 

**Problem Statement:**  
Given two **binary strings** `a` and `b`, return **their sum** as a binary string.  

**Example:**  

Input: `a = "11"`, `b = "1"`  
Output: `"100"`  

Input: `a = "1010"`, `b = "1011"`  
Output: `"10101"`  

**Constraints:**  
- `1 <= a.length, b.length <= 10^4`  
- `a` and `b` consist only of `'0'` or `'1'` characters.  
- Each string does not contain **leading zeros** except for the zero itself.  

[📂 Solution](Solutions/0067.java)  
 
[⬆️ Go to top](#top)  

---

### ✅ Sqrt(x)  
**Difficulty:** 🟢 Easy

**Problem Statement:**  
Given a **non-negative integer** `x`, return the **square root** of `x` **rounded down** to the nearest integer.  
The returned integer should be **non-negative** as well.  

🚨 **You must not use any built-in exponent function** or operator like `pow(x, 0.5)` or `x ** 0.5`.  

**Example:**  

Input: `x = 4`  
Output: `2`  
Explanation: The square root of 4 is `2`, so we return `2`.  

Input: `x = 8`  
Output: `2`  
Explanation: The square root of 8 is `2.82842...`, and since we round it **down** to the nearest integer, `2` is returned.  

**Constraints:**  
- `0 <= x <= 2^31 - 1`  

**Hints:**  
1. Try **exploring all integers**.  
2. Use the **sorted property** of integers to reduce the search space (consider binary search).  

[📂 Solution](Solutions/0069.java)  

[⬆️ Go to top](#top)  

---

### ✅ Climbing Stairs  
**Difficulty:** 🟢 Easy  
**Problem Statement:**  
You are climbing a staircase. It takes `n` steps to reach the top.  

Each time you can either climb **1** or **2** steps. In how many distinct ways can you reach the top?  

**Example:**  

Input: `n = 2`  
Output: `2`  
Explanation: There are two ways to climb to the top:  
1. `1 step + 1 step`  
2. `2 steps`  

Input: `n = 3`  
Output: `3`  
Explanation: There are three ways to climb to the top:  
1. `1 step + 1 step + 1 step`  
2. `1 step + 2 steps`  
3. `2 steps + 1 step`  

**Constraints:**  
- `1 <= n <= 45`  

**Hints:**  
1. To reach the `n`th step, you must have come from either `(n-1)`th step (1 step) or `(n-2)`th step (2 steps).  
2. This forms a **Fibonacci sequence** where `f(n) = f(n-1) + f(n-2)`, with base cases `f(1) = 1`, `f(2) = 2`.  

[📂 Solution](Solutions/0070.java)  

[⬆️ Go to top](#top)  

---

### ✅ Valid Anagram  
**Difficulty:** 🟢 Easy  
**Problem Statement:**  
Given two strings `s` and `t`, return `true` if `t` is an **anagram** of `s`, and `false` otherwise.  

**Example:**  

Input: `s = "anagram"`, `t = "nagaram"`  
Output: `true`  

Input: `s = "rat"`, `t = "car"`  
Output: `false`  

**Constraints:**  
- `1 <= s.length, t.length <= 5 * 10^4`  
- `s` and `t` consist of **lowercase English letters**.  

**Follow-up:**  
- What if the inputs contain **Unicode characters**? How would you adapt your solution to handle this case?  

[📂 Solution](Solutions/0242.java)  

[⬆️ Go to top](#top)  

---

### ✅ Move Zeroes  
**Difficulty:** 🟢 Easy  
**Problem Statement:**  
Given an integer array `nums`, move all `0`s to the **end** of it while maintaining the **relative order** of the non-zero elements.  

**Note:**  
- You must do this **in-place** without making a copy of the array.  

**Example:**  

Input: `nums = [0,1,0,3,12]`  
Output: `[1,3,12,0,0]`  

Input: `nums = [0]`  
Output: `[0]`  

**Constraints:**  
- `1 <= nums.length <= 10^4`  
- `-2^31 <= nums[i] <= 2^31 - 1`  

**Hints:**  
1. **In-place** means we **cannot** allocate extra space. But as a first step, try solving it using an **additional array**, then work on optimizing it.  
2. A **two-pointer** approach can be useful. One pointer iterates through the array, while the other keeps track of the position to place the next non-zero element.  

[📂 Solution](Solutions/0283.java)  

[⬆️ Go to top](#top)  

---

### ✅ Ransom Note  
**Difficulty:** 🟢 Easy  
**Problem Statement:**  
Given two strings `ransomNote` and `magazine`, return `true` if `ransomNote` **can be constructed** by using the letters from `magazine` and `false` otherwise.  

Each letter in `magazine` can **only be used once** in `ransomNote`.  

**Example:**  

Input: `ransomNote = "a", magazine = "b"`  
Output: `false`  

Input: `ransomNote = "aa", magazine = "ab"`  
Output: `false`  

Input: `ransomNote = "aa", magazine = "aab"`  
Output: `true`  

**Constraints:**  
- `1 <= ransomNote.length, magazine.length <= 10^5`  
- `ransomNote` and `magazine` consist of **lowercase English letters**.  

**Hints:**  
1. Count the frequency of each letter in both strings.  
2. Use a hash map (or an array of size 26) to track available letters.  
3. If any letter in `ransomNote` exceeds its count in `magazine`, return `false`.  

[📂 Solution](Solutions/0383.java)  

[⬆️ Go to top](#top)  

---

### ✅ Find the Difference  
**Difficulty:** 🟢 Easy  
**Problem Statement:**  
You are given two strings `s` and `t`.  

String `t` is generated by randomly shuffling string `s` and then adding **one more letter** at a random position.  

Return the letter that was added to `t`.  

**Example:**  

Input: `s = "abcd"`, `t = "abcde"`  
Output: `"e"`  
Explanation: `'e'` is the letter that was added.  

Input: `s = ""`, `t = "y"`  
Output: `"y"`  

**Constraints:**  
- `0 <= s.length <= 1000`  
- `t.length == s.length + 1`  
- `s` and `t` consist of **lowercase English letters**.  

**Hints:**  
1. Use frequency counting (hash map or array of size 26).  
2. XOR all characters from both `s` and `t`, the result will be the extra letter.  

[📂 Solution](Solutions/0389.java)  

[⬆️ Go to top](#top)  

---

### ✅ Fizz Buzz  
**Difficulty:** 🟢 Easy  
**Problem Statement:**  
Given an integer `n`, return a string array `answer` (1-indexed) where:  

- `answer[i] == "FizzBuzz"` if `i` is divisible by **3 and 5**.  
- `answer[i] == "Fizz"` if `i` is divisible by **3**.  
- `answer[i] == "Buzz"` if `i` is divisible by **5**.  
- `answer[i] == i` (as a string) if none of the above conditions are true.  

**Example:**  

Input: `n = 3`  
Output: `["1","2","Fizz"]`  

Input: `n = 5`  
Output: `["1","2","Fizz","4","Buzz"]`  

Input: `n = 15`  
Output: `["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]`  

**Constraints:**  
- `1 <= n <= 10^4`  

**Hints:**  
1. Loop from `1` to `n` and check divisibility conditions.  
2. Use `if-else` statements to construct the result dynamically.  

[📂 Solution](Solutions/0412.java)  

[⬆️ Go to top](#top)  

---

### ✅ Repeated Substring Pattern  
**Difficulty:** 🟢 Easy  
**Problem Statement:**  
Given a string `s`, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.  

**Example:**  

Input: `s = "abab"`  
Output: `true`  
Explanation: It is the substring `"ab"` twice.  

Input: `s = "aba"`  
Output: `false`  

Input: `s = "abcabcabcabc"`  
Output: `true`  
Explanation: It is the substring `"abc"` four times or the substring `"abcabc"` twice.  

**Constraints:**  
- `1 <= s.length <= 10^4`  
- `s` consists of lowercase English letters.  

**Hints:**  
1. Consider concatenating `s` with itself and removing the first and last character.  
2. Check if `s` exists as a substring within this new string.  

[📂 Solution](Solutions/0459.java)  

[⬆️ Go to top](#top)  

---



<p align='center'>
   </br>  </br>  </br>  </br>
   <a href='#top'>↿ Go to top ↾
</p>
