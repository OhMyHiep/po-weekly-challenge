"""Create a function that will recursively count the number of digits of a number. 
Conversion of the number to a string is not allowed, thus, the approach is recursive.
Examples
digits_count(4666) ➞ 4
digits_count(544) ➞ 3
digits_count(121317) ➞ 6
digits_count(0) ➞ 1
digits_count(12345) ➞ 5
digits_count(1289396387328) ➞ 13
Notes
All inputs are integers but some are in exponential form, deal with it accordingly.
You are expected to come up with a solution using the concept of recursion or the so-called recursive approach."""

def countDigits(digit:int):
    if digit==0:
        return 0
    else:
        return countDigits(digit//10)+1 #divide by 10 to remove a digit, incrrement a counter for each digit


if __name__=='__main__':
    print(countDigits(1289396387328))
