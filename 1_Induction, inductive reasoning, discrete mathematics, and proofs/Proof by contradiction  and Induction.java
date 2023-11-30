Proof by contradiction and proof by induction are two common proof techniques used in discrete mathematics. Let's explore each method:

### Proof by Contradiction:

- **Idea:**
  - Assume the negation of what you want to prove.
  - Show that this assumption leads to a logical contradiction.
  - Conclude that the original statement must be true.

- **Steps:**
  1. Assume the negation of the statement to be proven.
  2. Derive logical consequences from this assumption.
  3. Show that these consequences lead to a contradiction.
  4. Conclude that the original statement is true.

- **Example:**
  - **Statement:** There are infinitely many prime numbers.
  - **Contradiction:** Assume there are finitely many primes.
  - **Logical Consequence:** Multiply all primes and add 1.
  - **Contradiction:** The result is either prime (not in the assumed finite set) or not prime (divisible by a new prime).

### Proof by Induction:

- **Idea:**
  - Prove a statement for a base case.
  - Prove that if the statement holds for an arbitrary case, it also holds for the next case.
  - Conclude that the statement holds for all cases.

- **Steps:**
  1. **Base Case:** Prove the statement for the smallest possible case.
  2. **Inductive Step:** Assume the statement holds for an arbitrary case (inductive hypothesis).
  3. Prove that if the statement is true for this case, it must also be true for the next case.
  4. Conclude that the statement holds for all cases.

- **Example:**
  - **Statement:** \(1 + 2 + \ldots + n = \frac{n(n + 1)}{2}\) for all positive integers \(n\).
  - **Base Case:** For \(n = 1\), the left side is 1, and the right side is \(\frac{1(1 + 1)}{2} = 1\).
  - **Inductive Step:** Assume the formula holds for \(n = k\).
  - Show that it also holds for \(n = k + 1\):
    \[1 + 2 + \ldots + k + (k + 1) = \frac{k(k + 1)}{2} + (k + 1) = \frac{(k + 1)(k + 2)}{2}.\]

Both proof techniques are powerful tools in discrete mathematics and are used to establish the validity of mathematical statements and theorems. The choice between proof by contradiction and proof by induction depends on the nature of the statement and the problem at hand.


  
