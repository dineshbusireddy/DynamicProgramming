# Programming Practice
# Leetcode

## Two Sum

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

## Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.



**Example 1:**

![Alt text](https://github.com/dineshbusireddy/DynamicProgramming/blob/master/src/main/resources/add_two_numbers.png "Add Two Numbers")
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

## Longest Substring Without Repeating Characters

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

## Reverse Integer

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

## Longest Palindromic Substring

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

## String to Integer (atoi)

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

## Palindrome Number

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

## Container With Most Water

You are given an integer array _height_ of length _n_. There are _n_ vertical lines drawn such that the two endpoints of the _i<sup>th</sup>_ line are _(i, 0)_ and _(i, height[i])_.

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the _maximum amount of water a container can store._

**Notice** that you may not slant the container.

**Example 1:**

![Alt text](https://github.com/dineshbusireddy/DynamicProgramming/blob/master/src/main/resources/container_with_most_water.png "Container with more water")
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

## Integer to Roman

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

## Roman to Integer

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


## Longest Common Prefix
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

# 3Sum

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

## Letter Combinations of a Phone Number

**_Medium_**

Given a string containing digits from **_2-9_** inclusive, return all possible letter combinations that the number could represent. Return the answer in **any order**.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

![Alt text](https://github.com/dineshbusireddy/DynamicProgramming/blob/master/src/main/resources/telephone_keypad.png "Telephone Keypad")

**Example 1:**
````
Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
````
**Example 2:**
````
Input: digits = ""
Output: []
````
**Example 3:**
````
Input: digits = "2"
Output: ["a","b","c"]
````

Constraints:

- 0 <= digits.length <= 4
- digits[i] is a digit in the range ['2', '9'].

## Remove Nth Node From End of List

**_Medium_**

Given the **_head_** of a linked list, remove the **_nth_** node from the end of the list and return its head.

**Example 1:**

![Alt text](https://github.com/dineshbusireddy/DynamicProgramming/blob/master/src/main/resources/remove_nth_node.jpeg "Remove Nth Node")

````
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
````
**Example 2:**
````
Input: head = [1], n = 1
Output: []
````
**Example 3:**
````
Input: head = [1,2], n = 1
Output: [1]
````

**Constraints:**
- The number of nodes in the list is sz.
- 1 <= sz <= 30
- 0 <= Node.val <= 100
- 1 <= n <= sz


**Follow up:** Could you do this in one pass?


## Valid Parentheses

**_Easy_**

Given a string **_s_** containing just the characters _'(', ')', '{', '}', '[' and ']'_, determine if the input string is valid.

An input string is valid if:
- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.

**Example 1:**
````
Input: s = "()"
Output: true
````
**Example 2:**
````
Input: s = "()[]{}"
Output: true
````
**Example 3:**
````
Input: s = "(]"
Output: false
````

**Constraints:**
- _1 <= s.length <= 10<sup>4</sup>_
- _s_ consists of parentheses only _'()[]{}'_.

## Merge Two Sorted Lists

**_Easy_**

You are given the heads of two sorted linked lists _list1_ and _list2_.

Merge the two lists in a one **_sorted_** list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

**Example 1:**

![Alt text](https://github.com/dineshbusireddy/DynamicProgramming/blob/master/src/main/resources/merge_two_sorted_lists.jpeg "Merge Two Sorted Lists")

````
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
````
**Example 2:**
````
Input: list1 = [], list2 = []
Output: []
````
**Example 3:**
````
Input: list1 = [], list2 = [0]
Output: [0]
````

**Constraints:**
- The number of nodes in both lists is in the range [0, 50].
- -100 <= Node.val <= 100
- Both list1 and list2 are sorted in non-decreasing order.

## Fibonacci Number

**_Easy_**

The **_Fibonacci numbers_**, commonly denoted _F(n)_ form a sequence, called the **_Fibonacci sequence_**, such that each number is the sum of the two preceding ones, starting from _0_ and _1_. That is,

````
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
````

Given _n_, calculate _F(n)_.

**Example 1:**
````
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
````

**Example 2:**
````
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
````

**Example 3:**
````
Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
````

**Constraints:**
- 0 <= n <= 30

## Remove Duplicates from Sorted Array

**_Easy_**

Given an integer array _nums_ sorted in **non-decreasing order**, remove the duplicates **_in-place_** such that each unique element appears only **once**. The **relative order** of the elements should be kept the **same**.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the **first part** of the array _nums_. More formally, if there are _k_ elements after removing the duplicates, then the first _k_ elements of _nums_ should hold the final result. It does not matter what you leave beyond the first _k_ elements.

Return _k_ after placing the final result in the first _k_ slots of _nums_.

Do **not** allocate extra space for another array. You must do this by **modifying the input array** in-place with O(1) extra memory.

**Custom Judge:**

The judge will test your solution with the following code:
````
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
assert nums[i] == expectedNums[i];
}
````
If all assertions pass, then your solution will be **accepted**.

**Example 1:**
````
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
````
**Example 2:**
````
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
````

**Constraints:**
- 0 <= _nums_.length <= 3 * 10<sup>4</sup>
- -100 <= _nums[i]_ <= 100 
- _nums_ is sorted in **non-decreasing order**.

## Remove Element

**_Easy_**

Given an integer array _nums_ and an integer _val_, remove all occurrences of _val_ in _nums_ **_in-place_**. The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the **first part** of the array _nums_. More formally, if there are _k_ elements after removing the duplicates, then the first _k_ elements of _nums_ should hold the final result. It does not matter what you leave beyond the first _k_ elements.

Return _k_ after placing the final result in the first _k_ slots of _nums_.

Do **not** allocate extra space for another array. You must do this by **modifying the input** array in-place with O(1) extra memory.

**Custom Judge:**

The judge will test your solution with the following code:
````
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
// It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be **accepted**.
````

**Example 1:**
````
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
````

**Example 2:**
````
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
````

**Constraints:**
- 0 <= _nums.length_ <= 100
- 0 <= _nums[i]_ <= 50
- 0 <= _val_ <= 100

## Implement strStr()

**_Easy_**

Implement _strStr()_.

Return the index of the first occurrence of needle in haystack, or _-1_ if _needle_ is not part of _haystack_.

**Clarification:**

What should we return when _needle_ is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when _needle_ is an empty string. This is consistent to C's _strstr()_ and Java's _indexOf()_.

**Example 1:**
````
Input: haystack = "hello", needle = "ll"
Output: 2
````

**Example 2:**
````
Input: haystack = "aaaaa", needle = "bba"
Output: -1
````

**Example 3:**
````
Input: haystack = "", needle = ""
Output: 0
````

**Constraints:**
- _0 <= haystack.length, needle.length <= 5 * 10<sup>4</sup>_
- _haystack_ and _needle_ consist of only lower-case English characters.


## Search Insert Position
**_Easy_**

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with _O(log n)_ runtime complexity.

**Example 1:**
````
Input: nums = [1,3,5,6], target = 5
Output: 2
````
**Example 2:**
````
Input: nums = [1,3,5,6], target = 2
Output: 1
````
**Example 3:**
````
Input: nums = [1,3,5,6], target = 7
Output: 4
````

**Constraints:**
- _1 <= nums.length <= 10<sup>4</sup>_
- _-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>_
- _nums_ contains distinct values sorted in ascending order.
- _-10<sup>4</sup> <= target <= 10<sup>4</sup>_

## Maximum Sub Array
**_Easy_**

Given an integer array _nums_, find the contiguous subarray (containing at least one number) which has the largest sum and return its _sum_.

A **subarray** is a **contiguous** part of an array.

**Example 1:**
````
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
````
**Example 2:**
````
Input: nums = [1]
Output: 1
````
**Example 3:**
````
Input: nums = [5,4,-1,7,8]
Output: 23
````
**Constraints:**

- _1 <= nums.length <= 10<sup>5</sup>_
- _-10<sup>4</sup> <= nums[i] <= 10<sup>4</sup>_


**Follow up:** If you have figured out the _O(n)_ solution, try coding another solution using the **divide and conquer** approach, which is more subtle.

## Length of Last Word
**_Easy_**

Given a string _s_ consisting of some words separated by some number of spaces, return the length of the **last** word in the string.

A **word** is a maximal substring consisting of non-space characters only.

**Example 1:**
````
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
````
**Example 2:**
````
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
````
**Example 3:**
````
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
````
**Constraints:**
- _1 <= s.length <= 10<sup>4</sup>_
- _s_ consists of only English letters and spaces ' '.
- There will be at least one word in _s_.

## Plus One
**_Easy_**

You are given a **_large integer_** represented as an integer array _digits_, where each _digits[i]_ is the _i<sup>th</sup>_ digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading _0_'s.

Increment the large integer by one and return the resulting array of digits.

**Example 1:**
````
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
````
**Example 2:**
````
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
````
**Example 3:**
````
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
````

**Constraints:**
- _1 <= digits.length <= 100_
- _0 <= digits[i] <= 9_
- _digits_ does not contain any leading _0_'s.

## Valid Perfect Square
**_Easy_**

Given a **_positive_** integer _num_, write a function which returns True if num is a perfect square else False.

**Follow up:** Do not use any built-in library function such as _sqrt_.

**Example 1:**
````
Input: num = 16
Output: true
````
**Example 2:**
````
Input: num = 14
Output: false
````

**Constraints:**
- _1 <= num <= 2<sup>31</sup> - 1_


### Add Binary
Given two binary strings _a_ and _b_, return their sum as a binary string.

![Alt text](https://github.com/dineshbusireddy/DynamicProgramming/blob/master/src/main/resources/add_binary_0.png "Add Binary")

**Example 1:**

![Alt text](https://github.com/dineshbusireddy/DynamicProgramming/blob/master/src/main/resources/add_binary_1.png "Add Binary")
````
Input: a = "11", b = "1"
Output: "100"
````
**Example 2:**

![Alt text](https://github.com/dineshbusireddy/DynamicProgramming/blob/master/src/main/resources/add_binary_2.png "Add Binary")
````
Input: a = "1010", b = "1011"
Output: "10101"
````
**Constraints:**
- _1 <= a.length, b.length <= 10<sup>4</sup>_
- _a_ and _b_ consist only of '_0_' or '_1_' characters.
- Each string does not contain leading zeros except for the zero itself.


### Sqrt(x)
**_Easy_**

Given a non-negative integer _x_, compute and return the square root of _x_.

Since the return type is an integer, the decimal digits are **_truncated_**, and only the **_integer part_** of the result is returned.

**Note**: You are not allowed to use any built-in exponent function or operator, such as _pow(x, 0.5)_ or _x ** 0.5_.

**Example 1:**
````
Input: x = 4
Output: 2
````
**Example 2:**
````
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
````
**Constraints:**
- _0 <= x <= 2<sup>31</sup> - 1_




















































## Median of Two Sorted Arrays

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
