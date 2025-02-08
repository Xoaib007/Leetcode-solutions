# 🚀 LeetCode Solutions - Easy

This folder contains my solutions for **Easy** LeetCode problems. Each problem includes a description, examples, constraints, and a link to the solution file.

## 📂 Table of Contents

| # | Problem | Solution |
|---|---------|----------|
| 0001 | [Two Sum](#two-sum)  | [➔](Solutions/0001.java) |
| 0009 | [Palindrome Number](#palindrome-number)  | [➔](Solutions/0009.java) |
| 0013 | [Roman to Integer](#roman-to-integer)  | [➔](Solutions/0013.java) |
| 0014 | [Longest Common Prefix](#longest-common-prefix)  | [➔](Solutions/0014.java) |
| 0020 | [Valid Parentheses](#valid-parentheses)  | [➔](Solutions/0020.java) |
| 0028 | [Find the Index of the First Occurrence in a String](#find-the-index-of-the-first-occurrence-in-a-string)  | [➔](Solutions/0028.java) |
| 0066 | [Plus One](#plus-one)  | [➔](Solutions/0066.java) |
| 0242 | [Valid Anagram](#valid-anagram)  | [➔](Solutions/0242.java) |
| 0283 | [Move Zeroes](#move-zeroes)  | [➔](Solutions/0283.java) |
| 0383 | [Ransom Note](#ransom-note)  | [➔](Solutions/0383.java) |
| 0389 | [Find the Difference](#find-the-difference)  | [➔](Solutions/0389.java) |
| 0412 | [Fizz Buzz](#fizz-buzz)  | [➔](Solutions/0412.java) |
| 0459 | [Repeated Substring Pattern](#repeated-substring-pattern)  | [➔](Solutions/0459.java) |
| 0896 | [Monotonic Array](#monotonic-array)  | [➔](Solutions/0896.java) |
| 1342 | [Number of Steps to Reduce a Number to Zero](#number-of-steps-to-reduce-a-number-to-zero)  | [➔](Solutions/1342.java) |
| 1480 | [Running Sum of 1d Array](#running-sum-of-1d-array)  | [➔](Solutions/1480.java) |
| 1502 | [Can Make Arithmetic Progression From Sequence](#can-make-arithmetic-progression-from-sequence)  | [➔](Solutions/1502.java) |
| 1672 | [Richest Customer Wealth](#richest-customer-wealth)  | [➔](Solutions/1672.java) |
| 1768 | [Merge Strings Alternately](#merge-strings-alternately)  | [➔](Solutions/1768.java) |
| 1822 | [Sign of the Product of an Array](#sign-of-the-product-of-an-array)  | [➔](Solutions/1822.java) |

## 📝 Problem Descriptions

### Two Sum  
**Difficulty:** 🟢 Easy  
**Problem Statement:**  
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.  
You may assume that each input has exactly one solution, and you may not use the same element twice.  
You can return the answer in any order.

**Example:**  
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: nums[0] + nums[1] == 9, so return [0, 1].

markdown
Copy
Edit

**Constraints:**  
- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Only one valid answer exists.

[📂 Solution](0001.java)

---

### Palindrome Number  
**Difficulty:** 🟢 Easy  
**Problem Statement:**  
Determine whether an integer is a palindrome.  
An integer is a palindrome when it reads the same backward as forward.

**Example:**  
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

yaml
Copy
Edit

**Constraints:**  
- `-2^31 <= x <= 2^31 - 1`

[📂 Solution](0009.java)

---

### Roman to Integer  
**Difficulty:** 🟢 Easy  
**Problem Statement:**  
Convert a Roman numeral to an integer.

**Example:**  
Input: s = "III"
Output: 3
Explanation: III = 3.

pgsql
Copy
Edit

**Constraints:**  
- `1 <= s.length <= 15`
- `s` contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
- It is guaranteed that `s` is a valid Roman numeral in the range `[1, 3999]`.

[📂 Solution](0013.java)

---

### Longest Common Prefix  
**Difficulty:** 🟢 Easy  
**Problem Statement:**  
Write a function to find the longest common prefix string amongst an array of strings.  
If there is no common prefix, return an empty string `""`.

**Example:**  
Input: strs = ["flower","flow","flight"]
Output: "fl"

markdown
Copy
Edit

**Constraints:**  
- `1 <= strs.length <= 200`
- `0 <= strs[i].length <= 200`
- `strs[i]` consists of only lowercase English letters.

[📂 Solution](0014.java)

---

## ⚡ How to Use This Folder

1. Find the problem in the **Table of Contents**.
2. Click the solution link to open the corresponding `.java` file.
3. Run the solution in a Java environment:
   ```sh
   javac 0001.java && java TwoSum
Modify and test with your own input.