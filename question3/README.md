# Largest Odd Number in a String

## Problem Statement

Given a string `s` representing a large integer, return the **largest-valued odd integer** (as a string) that is a substring of the given string `s`.

The returned number:

- Must be odd
- Must not contain leading zeroes
- Can be formed using a contiguous substring of `s`

The input string may contain leading zeroes.

If no odd number exists, return an empty string `""`.

---

## Example 1

### Input

```text
s = "5347"
```

### Output

```text
"5347"
```

### Explanation

The odd numbers formed from the string are:

```text
5, 3, 53, 347, 5347
```

The largest odd number is:

```text
5347
```

---

## Example 2

### Input

```text
s = "0214638"
```

### Output

```text
"21463"
```

### Explanation

Possible odd substrings are:

```text
1, 3, 21, 63, 463, 1463, 21463
```

We cannot use numbers starting with `0`.

The largest valid odd number is:

```text
21463
```

---

## Example 3

### Input

```text
s = "2468"
```

### Output

```text
""
```

### Explanation

There are no odd digits in the string, so no odd number can be formed.

---

## Constraints

- `1 <= s.length <= 10^5`
- `s` contains only digits (`0-9`)

---

## Expected Time Complexity

```text
O(n)
```

## Expected Space Complexity

```text
O(1)
```
