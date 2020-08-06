---
layout: post
title: "LeetCode 3. Longest Substring Without Repeating Characters"
date: 2020-08-06 21:00:00 +0800
---

分析下[Leetcode 第 3 题 Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)。

```
Given a string, find the length of the longest substring without repeating characters.

Example 1:
Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.

Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

我的题解。

```java
class Solution {
  public int lengthOfLongestSubstring(String s) {
    if (s.length() == 0) {
      return 0;
    }
    if (s.length() == 1) {
      return 1;
    }
    int startIndex = 0;
    int endIndex = 1;
    int result = 0;
    for (; endIndex < s.length(); endIndex++) {
      char c = s.charAt(endIndex);
      String sub = s.substring(startIndex, endIndex);
      int indexOf = sub.indexOf(c);
      if (indexOf >= 0) {
        result = Math.max(result, endIndex - startIndex);
        startIndex += indexOf + 1;
      }
      result = Math.max(result, endIndex - startIndex);
    }
    result = Math.max(result, endIndex - startIndex);
    return result;
  }
}
```

没想到过了几天，我竟然连自己写的东西都看不懂了，好歹也是速度超过了 90%的解答。嗯。。。我想想。

其实就是两个指针一前一后，不断迭代。判断新的子字符串里有没有重复的，如果有，前指针就跳到这个重复字符串的下个字符。时间复杂度是 O(n^2)，一层是 for 循环，一层是`string.indexOf`。

好了，让我们看看官方题解的思路。

方案一。

```java
public class Solution {
  public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int ans = 0;
    for (int i = 0; i < n; i++)
      for (int j = i + 1; j <= n; j++)
        if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
    return ans;
  }

  public boolean allUnique(String s, int start, int end) {
    Set<Character> set = new HashSet<>();
    for (int i = start; i < end; i++) {
      Character ch = s.charAt(i);
      if (set.contains(ch)) return false;
      set.add(ch);
    }
    return true;
  }
}
```

这种是硬算，一看三层 for 循环，O(n^3)时间复杂度。

方案二。

```java
public class Solution {
  public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    Set<Character> set = new HashSet<>();
    int ans = 0, i = 0, j = 0;
    while (i < n && j < n) {
      // try to extend the range [i, j]
      if (!set.contains(s.charAt(j))){
        set.add(s.charAt(j++));
        ans = Math.max(ans, j - i);
      }
      else {
        set.remove(s.charAt(i++));
      }
    }
    return ans;
  }
}
```

这方案和我的方案是思路是一样的，也是扩展一个区间。不过它巧妙了使用了`Set<T>`，我本来也可以用，但我给忘了，我以为刷题不可以用`Set`，是我的错。

i 和 j 全都迭代到 n，时间复杂度 O(2n)，化成 O(n)。

方案三。

```java
public class Solution {
  public int lengthOfLongestSubstring(String s) {
    int n = s.length(), ans = 0;
    Map<Character, Integer> map = new HashMap<>(); // current index of character
    // try to extend the range [i, j]
    for (int j = 0, i = 0; j < n; j++) {
      if (map.containsKey(s.charAt(j))) {
        i = Math.max(map.get(s.charAt(j)), i);
      }
      ans = Math.max(ans, j - i + 1);
      map.put(s.charAt(j), j + 1);
    }
    return ans;
  }
}
```

```java
public class Solution {
  public int lengthOfLongestSubstring(String s) {
    int n = s.length(), ans = 0;
    int[] index = new int[128]; // current index of character
    // try to extend the range [i, j]
    for (int j = 0, i = 0; j < n; j++) {
      i = Math.max(index[s.charAt(j)], i);
      ans = Math.max(ans, j - i + 1);
      index[s.charAt(j)] = j + 1;
    }
    return ans;
  }
}
```

Solution 上写了两种，不过思路都是一样的，都是对方案二的优化。

方案二的常数项为 2，而这里只需要迭代一遍，所以常数项下降为 1，时间复杂度 O(n)。
