Expression-Evaluator
====================

## How To Use This Project On Your System :-

* Extract the provided `expression-evaluator-0.1.zip`

* Create an environment variable as `EVALUATOR_HOME` with the address to your unzipped directory.

* Put this environment variable to your path as :- `%EVALUATOR_HOME%/bin`

* Run shell-script on command :-
    eg. `sh EVALUATOR.sh 2+5`

### Release 0.7

#### Evaluator handles caret and negative operator.
* Evaluator handles negative operator for first operand only.
    eg. `-1-1`

* Evaluator handles caret operator.
    eg. `2^4`

* Any number of operands are allowed.


### Release 0.6

#### Evaluator allows user to specify the precedence in expression by giving multiple and/or nested brackets.
* Evaluator handles nested round brackets.
    eg. `12*10+(10*4+(20+(10)))`

* Evaluator handles multiple round brackets.
    eg. `12*10+(10*4)+(30+10)`

* Any number of operands are allowed.

* Evaluator works for positive integers including zero.


### Release 0.5

#### Evaluator allows user to specify the precedence in expression by giving multiple(not nested) round brackets.
* Evaluator gives precedence for round brackets.
    eg. `12*10+(20*4)`

* Evaluator handles multiple round brackets.
    eg. `12*10+(10*4)+(30+10)`

* multiple brackets are allowed, nested brackets not allowed.

* Any number of operands are allowed.

* Space is not allowed in expression.
    eg. `12*10 (-20* 2- 75)+ 25`

* Evaluator works for positive integers including zero.


### Release 0.4

#### Evaluator allows user to specify the precedence in expression by giving round brackets.
* Evaluator gives precedence for round brackets.
    eg. `12*10+(20*4)`

* Only single brackets are allowed.

* Any number of operands are allowed.

* User has to give operands and operator.
    eg. `12*10-(20*2-75)+25`

* Space is not allowed in expression.
    eg. `12*10 (-20* 2- 75)+ 25`

* Evaluator works for positive integers including zero.


### Release 0.3

#### Evaluator allows user to perform four basic arithmetic operations on any number of operands(positive integers) including zero.
* Evaluator can perform addition, subtraction, multiplication, division.

* Any number of operands are allowed.

* User has to give operands and operator.
    eg. `12*10-20*2-75+25`

* Space is not allowed in expression.
    eg. `12*10 -20* 2- 75+ 25`

* Evaluator works for positive integers including zero.

* NOTE : Evaluator does not handle any special symbol.


### Release 0.2

#### Evaluator allows user to perform addition on any number of operands(positive integers) including zero.
* Evaluator can perform only addition.

* Any number of operands are allowed.

* User has to give operands and addition operator.
    eg. `75+75+25+15+10`

* Space is not allowed in expression.
    eg. `34+ 87 +20`

* Evaluator works for positive integers including zero.

* NOTE : Evaluator does not handle any special symbol.

### Release 0.1

#### Evaluator allows user to perform addition of two positive integers including zero.
* Evaluator can perform only addition.

* User has to give two operands and addition operator.
    eg. `34+87`

* Space is not allowed in expression.
    eg. `34+ 87`

* Evaluator works for positive integers including zero.

* NOTE : Evaluator does not handle any special symbol.

#### Bugs fixed :-
* Works for 22
* Gives proper error messages for unsupported expression.