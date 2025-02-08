# 🚀 LeetCode Solutions - Easy

This folder contains my solutions for **Easy** LeetCode problems. Each problem includes a description, examples, constraints, and a link to the solution file.

## 📂 Table of Contents

| # | Problem | Solution |
|---|---------|----------|
| 0001 | [Two Sum](#two-sum)  | [➔](Solutions/Two_Sum.java) |
| 0009 | [Palindrome Number](#palindrome-number)  | [➔](Solutions/Palindrome_Number.java) |
| 0013 | [Roman to Integer](#roman-to-integer)  | [➔](Solutions/Roman_to_Integer.java) |
| 0014 | [Longest Common Prefix](#longest-common-prefix)  | [➔](Solutions/Longest_Common_Prefix.java) |
| 0020 | [Valid Parentheses](#valid-parentheses)  | [➔](Solutions/Valid_Parentheses.java) |
| 0028 | [Find the Index of the First Occurrence in a String](#find-the-index-of-the-first-occurrence-in-a-string)  | [➔](Solutions/Find_the_Index_of_the_First_Occurrence_in_a_String.java) |
| 0066 | [Plus One](#plus-one)  | [➔](Solutions/Plus_One.java) |
| 0242 | [Valid Anagram](#valid-anagram)  | [➔](Solutions/Valid_Anagram.java) |
| 0283 | [Move Zeroes](#move-zeroes)  | [➔](Solutions/Move_Zeroes.java) |
| 0383 | [Ransom Note](#ransom-note)  | [➔](Solutions/Ransom_Note.java) |
| 0389 | [Find the Difference](#find-the-difference)  | [➔](Solutions/Find_the_Difference.java) |
| 0412 | [Fizz Buzz](#fizz-buzz)  | [➔](Solutions/Fizz_Buzz.java) |
| 0459 | [Repeated Substring Pattern](#repeated-substring-pattern)  | [➔](Solutions/Repeated_Substring_Pattern.java) |
| 0896 | [Monotonic Array](#monotonic-array)  | [➔](Solutions/Monotonic_Array.java) |
| 1342 | [Number of Steps to Reduce a Number to Zero](#number-of-steps-to-reduce-a-number-to-zero)  | [➔](Solutions/Number_of_Steps_to_Reduce_a_Number_to_Zero.java) |
| 1480 | [Running Sum of 1d Array](#running-sum-of-1d-array)  | [➔](Solutions/Running_Sum_of_1d_Array.java) |
| 1502 | [Can Make Arithmetic Progression From Sequence](#can-make-arithmetic-progression-from-sequence)  | [➔](Solutions/Can_Make_Arithmetic_Progression_From_Sequence.java) |
| 1672 | [Richest Customer Wealth](#richest-customer-wealth)  | [➔](Solutions/Richest_Customer_Wealth.java) |
| 1768 | [Merge Strings Alternately](#merge-strings-alternately)  | [➔](Solutions/Merge_Strings_Alternately.java) |
| 1822 | [Sign of the Product of an Array](#sign-of-the-product-of-an-array)  | [➔](Solutions/Sign_of_the_Product_of_an_Array.java) |


---

## 📝 Problem Descriptions

### 1️⃣ Two Sum  
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

### 2️⃣ Palindrome Number  
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

### 3️⃣ Roman to Integer  
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

### 4️⃣ Longest Common Prefix  
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