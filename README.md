# DynamicProgramming

##1. Two Sum
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

##2. Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.



**Example 1:**

![Alt text](https://github.com/dineshbusireddy/DynamicProgramming/blob/master/src/main/resources/Add%20Two%20Numbers%20Example.png "Title")
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

##3. Longest Substring Without Repeating Characters
Given a string _s_, find the length of the **longest substring** without repeating characters.

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