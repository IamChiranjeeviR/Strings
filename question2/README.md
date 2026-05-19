# Reverse Words in a String

## Problem Statement

Given an input string `s` containing upper-case letters, lower-case letters, digits, and spaces (`' '`).

A **word** is defined as a sequence of non-space characters.

The words in the string are separated by at least one space.

Your task is to return a string with the words in **reverse order**, concatenated by a **single space**.

The output string should:

- Not contain leading or trailing spaces
- Contain only one space between words

---

## Example 1

### Input

```text
s = "welcome to the jungle"
```

### Output

```text
"jungle the to welcome"
```

### Explanation

The words in the input string are:

```text
"welcome", "to", "the", "jungle"
```

Reversing the order gives:

```text
"jungle", "the", "to", "welcome"
```

So the final output becomes:

```text
"jungle the to welcome"
```

---

## Example 2

### Input

```text
s = " amazing coding skills "
```

### Output

```text
"skills coding amazing"
```

### Explanation

The input string contains:

- Leading spaces
- Trailing spaces
- Multiple spaces between words

After removing extra spaces, the words become:

```text
"amazing", "coding", "skills"
```

Reversing the order gives:

```text
"skills", "coding", "amazing"
```

So the final output becomes:

```text
"skills coding amazing"
```

---

## Constraints

- `1 <= s.length <= 10^4`
- `s` may contain letters, digits, and spaces
- There is at least one word in the string

---

## Expected Time Complexity

```text
O(n)
```

## Expected Space Complexity

```text
O(1) extra space (excluding output string)
```
