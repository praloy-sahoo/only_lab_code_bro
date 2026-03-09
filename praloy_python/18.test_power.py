""""
name -> praloy sahoo 
roll -> 002410501095
18. Use parameterized or nose_parameterized to compute power of following values:
(2, 2, 4),
(2, 3, 8),
(1, 9, 1),
(0, 9, 0). Use pytest to check errors.
"""

""""
Pytest is a popular, open-source Python testing
 framework that simplifies the process of writing 
 and running various types of software tests, from
simple unit tests to complex functional and end-to-end tests
"""
import pytest

def power(a,b):
     return a**b

## @pytest.mark.parametrize("arg1, arg2, arg3", [ list_of_tuples ])     
@pytest.mark.parametrize("base, exponent, expected",[(2,2,4),(2,3,8),(1,9,1),(0,9,0)])

def test_power(base,exponent,expected):
      assert power(base,exponent)==expected     

## py -m pytest for running the command