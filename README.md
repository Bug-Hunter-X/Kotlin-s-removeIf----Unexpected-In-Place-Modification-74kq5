# Kotlin's `removeIf()` Gotcha: In-Place Modification

This repository demonstrates a subtle but important aspect of Kotlin's `removeIf()` function: its in-place modification of collections.  While this behavior is documented, it can lead to unexpected results if you're not careful.

The example showcases using `removeIf()` on `MutableList`, `MutableMap`, and `MutableSet`.  The `bug.kt` file shows the unexpected behavior, while `bugSolution.kt` suggests safer alternatives to avoid potential issues.

## How to reproduce

1. Clone this repository.
2. Open `bug.kt` in a Kotlin IDE.
3. Run the code. Observe that the collections are modified directly. 

## Solution

The `bugSolution.kt` demonstrates safer approaches using iterators or creating new collections.