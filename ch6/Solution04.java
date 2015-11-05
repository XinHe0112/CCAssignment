package ch6;

public class Solution04 {
/*Since each ant can pick two directions: clockwise or counter clockwise,
 * the probability is:
 * p(clockwise) = (1/2)^3
 * p(counter clockwise) = (1/2)^3
 * p(same direction) = (1/2)^3+ (1/2)^3 = (1/4)
 *Therefore,
 *p(collision) = 1-p(same direction) = 1 - (1/4) = 3/4

	
if there are n ants:
* the probability is:
* p(clockwise) = (1/2)^n
* p(counter clockwise) = (1/2)^n
* p(same direction) = (1/2)^n+ (1/2)^n = (1/2)^(n-1)
*p(collision) = 1-p(same direction) = 1 - (1/2)^(n-1) = (1/2)^(n-1)