# DynamicProgramming

## 1. Two Sum

Given an array of integers _nums_ and an integer _target_, return indices of the two numbers such that they add up to _target_.

You may assume that each input would have *exactly one solution*, and you may not use the same element twice.

You can return the answer in any order.



**Example 1:**
````
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
````
**Example 2:**
````
Input: nums = [3,2,4], target = 6
Output: [1,2]
````
**Example 3:**
````
Input: nums = [3,3], target = 6
Output: [0,1]
````

**Constraints:**

- 2 <= nums.length <= 10<sup>4</sup>
- -10<sup>9</sup> <= nums[i] <= 10<sup>9</sup>
- -10<sup>9</sup> <= target <= 10<sup>9</sup>
- Only one valid answer exists.


Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

## 2. Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.



**Example 1:**

![Alt text](https://github.com/dineshbusireddy/DynamicProgramming/blob/master/src/main/resources/add_two_numbers.png "Title")
````
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
````
**Example 2:**
````
Input: l1 = [0], l2 = [0]
Output: [0]
````
**Example 3:**
````
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
````

**Constraints:**
- The number of nodes in each linked list is in the range [1, 100].
- 0 <= Node.val <= 9
- It is guaranteed that the list represents a number that does not have leading zeros.

## 3. Longest Substring Without Repeating Characters

Given a string _s_, find the length of the **the longest substring** without repeating characters.

**Example 1:**
````
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
````
**Example 2:**
````
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
````
**Example 3:**
````
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
````

**Constraints:**
- 0 <= s.length <= 5 * 10<sup>4</sup>
- s consists of English letters, digits, symbols and spaces.
## 4. Reverse Integer

Given a signed 32-bit integer _x_, return _x_ with its digits reversed. 
If reversing _x_ causes the value to go outside the signed 32-bit integer range _[-2<sup>31</sup>, 2<sup>31</sup> - 1]_, then return _0_.

**Assume the environment does not allow you to store 64-bit integers (signed or unsigned).**

**Example 1:**
````
Input: x = 123
Output: 321
````
**Example 2:**
````
Input: x = -123
Output: -321
````
**Example 3:**
````
Input: x = 120
Output: 21
````

**Constraints:**
- -2<sup>31</sup> <= x <= 2<sup>31</sup> - 1

## 5. Longest Palindromic Substring

Given a string _s_, return the longest palindromic substring in _s_.

**Example 1:**
````
Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
````
**Example 2:**
````
Input: s = "cbbd"
Output: "bb"
````

**Constraints:**
- 1 <= s.length <= 1000
- s consist of only digits and English letters.

## 6. String to Integer (atoi)

Implement the _myAtoi(string s)_ function, which converts a string to a 32-bit signed integer (similar to C/C++'s _atoi_ function).

The algorithm for _myAtoi(string s)_ is as follows:

1. Read in and ignore any leading whitespace.
2. Check if the next character (if not already at the end of the string) is _'-'_ or _'+'_. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
3. Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
4. Convert these digits into an integer (i.e. _"123" -> 123_, _"0032" -> 32_). If no digits were read, then the integer is _0_. Change the sign as necessary (from step 2).
5. If the integer is out of the 32-bit signed integer range _[-2<sup>31</sup>, 2<sup>31</sup> - 1]_, then clamp the integer so that it remains in the range. Specifically, integers less than -2<sup>31</sup> should be clamped to _-2<sup>31</sup>_, and integers greater than _2<sup>31</sup> - 1_ should be clamped to _2<sup>31</sup> - 1_.
6. Return the integer as the final result.

**Note:**
- Only the space character _' '_ is considered a whitespace character.
- _**Do not ignore**_ any characters other than the leading whitespace or the rest of the string after the digits.


**Example 1:**
````
Input: s = "42"
Output: 42
Explanation: The underlined characters are what is read in, the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
^
Step 3: "42" ("42" is read in)
^
The parsed integer is 42.
Since 42 is in the range [-2<sup>31</sup>, 2<sup>31</sup> - 1], the final result is 42.
````
**Example 2:**
````
Input: s = "   -42"
Output: -42
Explanation:
Step 1: "   -42" (leading whitespace is read and ignored)
^
Step 2: "   -42" ('-' is read, so the result should be negative)
^
Step 3: "   -42" ("42" is read in)
^
The parsed integer is -42.
Since -42 is in the range [-2<sup>31</sup>, 2<sup>31</sup> - 1], the final result is -42.
````
**Example 3:**
````
Input: s = "4193 with words"
Output: 4193
Explanation:
Step 1: "4193 with words" (no characters read because there is no leading whitespace)
^
Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
^
Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
^
The parsed integer is 4193.
Since 4193 is in the range [-2<sup>31</sup>, 2<sup>31</sup> - 1], the final result is 4193.
````

**Constraints:**
- 0 <= s.length <= 200
- s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.

## 7. Palindrome Number

Given an integer _x_, return _true_ if _x_ is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, _121_ is a palindrome while _123_ is not.

**Example 1:**
````
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
````

**Example 2:**
````
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
````

**Example 3:**
````
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
````

**Constraints:**
- -2<sup>31</sup> <= x <= 2<sup>31</sup> - 1

**Follow up:** Could you solve it without converting the integer to a string?

## 8. Container With Most Water

You are given an integer array _height_ of length _n_. There are _n_ vertical lines drawn such that the two endpoints of the _i<sup>th</sup>_ line are _(i, 0)_ and _(i, height[i])_.

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the _maximum amount of water a container can store._

**Notice** that you may not slant the container.

**Example 1:**

![Alt text](https://github.com/dineshbusireddy/DynamicProgramming/blob/master/src/main/resources/container_with_most_water.png "Title")
````
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
````
**Example 2:**
````
Input: height = [1,1]
Output: 1
````

**Constraints:**
- n == height.length
- 2 <= n <= 10<sup>5</sup>
- 0 <= height[i] <= 10<sup>4</sup>

## 9. Integer to Roman

Roman numerals are represented by seven different symbols: _I, V, X, L, C, D_ and _M_.
````
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
````
For example, _2_ is written as _II_ in Roman numeral, just two one's added together. _12_ is written as _XII_, which is simply _X + II_. The number _27_ is written as _XXVII_, which is _XX + V + II_.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for _four_ is not _IIII_. Instead, the number four is written as _IV_. Because the one is before the five we subtract it making four. The same principle applies to the number _nine_, which is written as _IX_. There are six instances where subtraction is used:

- _I_ can be placed before _V_ (5) and _X_ (10) to make 4 and 9.
- _X_ can be placed before _L_ (50) and _C_ (100) to make 40 and 90.
- _C_ can be placed before _D_ (500) and _M_ (1000) to make 400 and 900. 

Given an integer, convert it to a roman numeral.

**Example 1:**
````
Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
````
**Example 2:**
````
Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
````
**Example 3:**
````
Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
````

**Constraints:**

- 1 <= num <= 3999

## 10. Roman to Integer

Roman numerals are represented by seven different symbols: _I, V, X, L, C, D_ and _M_.
````
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
````
For example, _2_ is written as _II_ in Roman numeral, just two one's added together. _12_ is written as _XII_, which is simply _X + II_. The number _27_ is written as _XXVII_, which is _XX + V + II_.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for _four_ is not _IIII_. Instead, the number _four_ is written as _IV_. Because the one is before the five we subtract it making four. The same principle applies to the number _nine_, which is written as _IX_. There are six instances where subtraction is used:

- _I_ can be placed before _V_ (5) and _X_ (10) to make 4 and 9.
- _X_ can be placed before _L_ (50) and _C_ (100) to make 40 and 90.
- _C_ can be placed before _D_ (500) and _M_ (1000) to make 400 and 900.

Given a roman numeral, convert it to an integer.

**Example 1:**
````
Input: s = "III"
Output: 3
Explanation: III = 3.
````
**Example 2:**
````
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
````
**Example 3:**
````
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
````

**Constraints:**

- 1 <= s.length <= 15
- s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
- It is guaranteed that s is a valid roman numeral in the range [1, 3999].


## 11. Longest Common Prefix
**_Easy_**

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string _""_.

**Example 1:**
````
Input: strs = ["flower","flow","flight"]
Output: "fl"
````
**Example 2:**
````
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
````

**Constraints:**

- 1 <= strs.length <= 200
- 0 <= strs[i].length <= 200
- strs[i] consists of only lower-case English letters.

#11. 3Sum

**_Medium_**

Given an integer array _nums_, return all the triplets [_nums[i], nums[j], nums[k]]_ such that _i != j, i != k, and j != k_, and _nums[i] + nums[j] + nums[k] == 0_.

Notice that the solution set must not contain duplicate triplets.

**Example 1:**
````
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
````
**Example 2:**
````
Input: nums = []
Output: []
````
**Example 3:**
````
Input: nums = [0]
Output: []
````

**Constraints:**
- 0 <= nums.length <= 3000
- -10<sup>5</sup> <= nums[i] <= 10<sup>5</sup>






## 100. Median of Two Sorted Arrays

Given two sorted arrays _nums1_ and _nums2_ of size _m_ and _n_ respectively, return _**the median**_ of the two sorted arrays.

The overall run time complexity should be _O(log (m+n))_.



**Example 1:**
````
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
````

**Example 2:**
````
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
````

**Constraints:**

- nums1.length == m
- nums2.length == n
- 0 <= m <= 1000
- 0 <= n <= 1000
- 1 <= m + n <= 2000
- -10<sup>6</sup> <= nums1[i], nums2[i] <= 10<sup>6</sup>
