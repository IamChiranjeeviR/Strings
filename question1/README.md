# Remove Outermost Parentheses

## Problem Statement

A valid parentheses string is defined by the following rules:

1. It is the empty string `""`.
2. If `A` is a valid parentheses string, then `"(" + A + ")"` is also valid.
3. If `A` and `B` are valid parentheses strings, then `A + B` is also valid.

A **primitive valid parentheses string** is a non-empty valid string that cannot be split into two or more non-empty valid parentheses strings.

Given a valid parentheses string `s`, your task is to remove the outermost parentheses from every primitive component of `s` and return the resulting string.

---

## Examples

### Example 1

#### Input

```text
s = "((()))"
```

#### Output

```text
"(())"
```

#### Explanation

The input string is a single primitive:

```text
((()))
```

Removing the outermost parentheses gives:

```text
(())
```

---

### Example 2

#### Input

```text
s = "()(()())(())"
```

#### Output

```text
"()()()"
```

#### Explanation

Primitive decomposition:

```text
"()" + "(()())" + "(())"
```

After removing outermost parentheses:

```text
"" + "()()" + "()"
```

Final result:

```text
()()()
```

---

## Constraints

- `1 <= s.length <= 10^5`
- `s[i]` is either `'('` or `')'`
- `s` is a valid parentheses string

---

## Approach

Use a counter to track the depth of parentheses:

- Increment depth when encountering `'('`
- Decrement depth when encountering `')'`
- Skip:
  - the first `'('` of a primitive
  - the last `')'` of a primitive
- Append all remaining characters to the result

---

## Java Solution

```java
class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder result = new StringBuilder();
        int depth = 0;

        for(char ch : s.toCharArray()) {

            if(ch == '(') {
                if(depth > 0) {
                    result.append(ch);
                }
                depth++;
            }
            else {
                depth--;

                if(depth > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}
```

---

## Time Complexity

```text
O(n)
```

## Space Complexity

```text
O(n)
```
