# LeetCode Solutions

This repository contains my solutions to various LeetCode problems. The problems are categorized into three difficulty levels: **Easy**, **Medium**, and **Hard**.

## 📜 Table of Contents

| # | Problem | Difficulty | Solution |
|---|---------|------------|----------|
| 0001 | 🟢 [Two Sum](#two-sum)  | Easy | [➔](Easy/0001.java) |
| 0009 | 🟢 [Palindrome Number](#palindrome-number)  | Easy | [➔](Easy/0009.java) |
| 0013 | 🟢 [Roman to Integer](#roman-to-integer)  | Easy | [➔](Easy/0013.java) |
| 0014 | 🟢 [Longest Common Prefix](#longest-common-prefix)  | Easy | [➔](Easy/0014.java) |
| 0020 | 🟢 [Valid Parentheses](#valid-parentheses)  | Easy | [➔](Easy/0020.java) |
| 0028 | 🟢 [Find the Index of the First Occurrence in a String](#find-the-index-of-the-first-occurrence-in-a-string)  | Easy | [➔](Easy/0028.java) |
| 0066 | 🟢 [Plus One](#plus-one)  | Easy | [➔](Easy/0066.java) |
| 0242 | 🟢 [Valid Anagram](#valid-anagram)  | Easy | [➔](Easy/0242.java) |
| 0283 | 🟢 [Move Zeroes](#move-zeroes)  | Easy | [➔](Easy/0283.java) |
| 0383 | 🟢 [Ransom Note](#ransom-note)  | Easy | [➔](Easy/0383.java) |
| 0389 | 🟢 [Find the Difference](#find-the-difference)  | Easy | [➔](Easy/0389.java) |
| 0412 | 🟢 [Fizz Buzz](#fizz-buzz)  | Easy | [➔](Easy/0412.java) |
| 0459 | 🟢 [Repeated Substring Pattern](#repeated-substring-pattern)  | Easy | [➔](Easy/0459.java) |
| 0896 | 🟢 [Monotonic Array](#monotonic-array) | Easy | [➔](Easy/0896.java) |
| 1342 | 🟢 [Number of Steps to Reduce a Number to Zero](#number-of-steps-to-reduce-a-number-to-zero) | Easy | [➔](Easy/1342.java) |
| 1480 | 🟢 [Running Sum of 1d Array](#running-sum-of-1d-array) | Easy | [➔](Easy/1480.java) |
| 1502 | 🟢 [Can Make Arithmetic Progression From Sequence](#can-make-arithmetic-progression-from-sequence) | Easy | [➔](Easy/1502.java) |
| 1672 | 🟢 [Richest Customer Wealth](#richest-customer-wealth) | Easy | [➔](Easy/1672.java) |
| 1768 | 🟢 [Merge Strings Alternately](#merge-strings-alternately) | Easy | [➔](Easy/1768.java) |
| 1822 | 🟢 [Sign of the Product of an Array](#sign-of-the-product-of-an-array) | Easy | [➔](Easy/1822.java) |




## 📝 Problem Descriptions

### Two Sum
**Difficulty:** 🟢 Easy  
**Problem Statement:** <br/>

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

**Example:**<br/>
Example 1:<br/>
Input: nums = `[2,7,11,15]`, target = `9`<br/>
Output: `[0,1]`<br/>
Explanation: `Because nums[0] + nums[1] == 9, we return [0, 1].`<br/>

Example 2:<br/>
Input: nums = `[3,2,4]`, target = `6`<br/>
Output: `[1,2]`<br/>

Example 3:<br/>
Input: `nums = [3,3]`, target = `6`<br/>
Output: `[0,1]`<br/>

**Constraints:**<br/>
- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Only one valid answer exists.

[📂 Solution](easy/0001.java)

---

### Palindrome Number
**Difficulty:** 🟢 Easy  
**Problem Statement:** Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.  
**Example:**
Input: x = 121 Output: true Explanation: 121 reads as 121 from left to right and from right to left.

yaml
Copy
Edit
**Constraints:**
- `-2^31 <= x <= 2^31 - 1`

[📂 Solution](easy/0009.java)

---

### Roman to Integer
**Difficulty:** 🟢 Easy  
**Problem Statement:** Convert a Roman numeral to an integer.  
**Example:**
## 📝 Problem Descriptions

### Two Sum
**Difficulty:** 🟢 Easy  
**Problem Statement:** Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.  
**Example:**
Input: nums = [2,7,11,15], target = 9 Output: [0,1] Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

markdown
Copy
Edit
**Constraints:**
- `2 <= nums.length <= 10^4`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Only one valid answer exists.

[📂 Solution](easy/0001.java)

---

### Palindrome Number
**Difficulty:** 🟢 Easy  
**Problem Statement:** Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.  
**Example:**
Input: x = 121 Output: true Explanation: 121 reads as 121 from left to right and from right to left.

yaml
Copy
Edit
**Constraints:**
- `-2^31 <= x <= 2^31 - 1`

[📂 Solution](easy/0009.java)

---

### Roman to Integer
**Difficulty:** 🟢 Easy  
**Problem Statement:** Convert a Roman numeral to an integer.  
**Example:**
Input: s = "III" Output: 3 Explanation: III = 3.

pgsql
Copy
Edit
**Constraints:**
- `1 <= s.length <= 15`
- `s` contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
- It is guaranteed that `s` is a valid Roman numeral in the range [1, 3999].

[📂 Solution](easy/0013.java)

---

### Longest Common Prefix
**Difficulty:** 🟢 Easy  
**Problem Statement:** Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".  
**Example:**
Input: strs = ["flower","flow","flight"] Output: "fl"

ruby
Copy
Edit
**Constraints:**
- `1 <= strs.length <= 200`
- `0 <= strs[i].length <= 200`
- `strs[i]` consists of only lowercase English letters.

[📂 Solution](easy/0014.java)

---

### Valid Parentheses
**Difficulty:** 🟢 Easy  
**Problem Statement:** Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.  
**Example:**
Input: s = "()[]{}" Output: true

yaml
Copy
Edit
**Constraints:**
- `1 <= s.length <= 10^4`
- `s` consists of parentheses only '()[]{}'.

[📂 Solution](easy/0020.java)

---

### Find the Index of the First Occurrence in a String
**Difficulty:** 🟢 Easy  
**Problem Statement:** Given two strings `needle`
::contentReference[oaicite:0]{index=0}
 
