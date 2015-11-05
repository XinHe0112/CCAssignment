package ch6;

public class Solution02 {
/* For Game 1:
 * The probability of winning game is p1 = p.
 * For Game 2:
 * There are three cases:
 * P(make tree shots)= p^3
 * P(make two of three shots) = 3*(1-p)*p^2
 * Adding these together, we get:
 * p2 = p^3 + 3*(1-p)*p^2 = 3p^2 - 2P^3
 * 
 *We should play game1 if p1 > p2, that is:
 *p > 3p^2 - 2P^3
 *P< 0.5
 *
 *In conclusion, we should play game1 if 0 < p < 0.5
 *we should play game2 if p > 0.5
 *If p = 0.5, it doesn't matter which game we play.
 */
}
