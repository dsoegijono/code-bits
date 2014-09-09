## Equilibrium

    Equilibrium.java

#### Description

In an array of size `n`, an equlibirum index is any integer `i` such that `0 ≤ i ≤ n` and the sum of elements of lower indices is equal to the sum of elements of higher indices.

    A[0] + A[1] + ... + A[i−1] = A[i+1] + ... + A[n−2] + A[n−1]

Sum of zero elements is assumed to be equal to 0. This can happen if i = 0 or if i = n−1.

#### Input & Output

An array A consisting of n integers. It should return any of its equilibrium indices, or -1 if no equilibrium index exists.

---

## Number Contains

    number_contains.py

#### Description

`x` = number to be searched. `n` = maximum number. Between 1 and `n`, find how many numbers contain `x`.

#### Notes & Issues

- Doesn't work on large `n`

---

## Twenty Four

    twentyfour.py

#### Description

Deck of cards is generated, and 4 cards are randomly drawn. Try to find 24 using the values of the 4 cards. Ace has a value of 1, and face cards are discarded.

    Ranks: Ace = 1, 2-10 normal, JQK not used
    Suits: 'c' = Clubs, 'd' = Diamonds, 'h' = Hearts, 's' = Spades

#### Notes & Issues

- Displays same but rearranged solutions
- **Moved [here](https://github.com/dsoegijono/twentyfour) to build a project page.**
