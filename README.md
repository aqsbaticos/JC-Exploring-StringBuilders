# Laboratory: Exploring Java `StringBuilder`
Developed by: Baticos, Andric Quinn S.

## Screenshot of Proof

---
### Exercise 1: `append()` - Finding the  String's Size

**Code Snippet**

![Screenshot Proof](/ss/e1-cs.png?raw=true "exercise-1-code-snippet")

**Prediction**: _This code will output "Hello, Cadets!"._ 

**Output**

![Screenshot Proof](/ss/e1-o.png?raw=true "exercise-1-output")

**Observation**: _As expected, the program appended ", Cadets!" and outputted "Hello, Cadets!"._

---
### Exercise 2: `insert()` - Inserting a Content at a Position

**Code Snippet**

![Screenshot Proof](/ss/e2-cs.png?raw=true "exercise-2-code-snippet")

**Prediction**: _This code will output "Java is really great!"._

**Output**

![Screenshot Proof](/ss/e2-o.png?raw=true "exercise-2-output")

**Observation**: _As expected, the program inserted "really" at index 8 and outputted "Java is really great!"._

---
### Exercise 3: `delete()` - Deleting Content

**Code Snippet**

![Screenshot Proof](/ss/e3-cs.png?raw=true "exercise-3-code-snippet")

**Prediction**: _This code will output "This is sentence." and "Thisis sentence" after._

**Output**

![Screenshot Proof](/ss/e3-o.png?raw=true "exercise-3-output")

**Observation**: _Apart from the miscount to include 's' to the deleted characters, as expected, the program deleted all characters starting from index 8 to index (16 minus 1) and deleted the character at index 4 as well, resulting to the final string "Thisis entence"._

---
### Exercise 4: `replace()` - Replacing a Section

**Code Snippet**

![Screenshot Proof](/ss/e4-cs.png?raw=true "exercise-4-code-snippet")

**Prediction**: _This code will output "I like programming in Java"._

**Output**

![Screenshot Proof](/ss/e4-o.png?raw=true "exercise-4-output")

**Observation**: _I miscounted the index start again so the resulting string was "I like programming in PyJava". Also, even if the given index was out of range, the resulting string resized._

---
### Exercise 5: Method Chaining

**Code Snippet**

![Screenshot Proof](/ss/e5-cs.png?raw=true "exercise-5-code-snippet")

**Prediction**: _This code will output "Ready, Set, rt..."._

**Output**

![Screenshot Proof](/ss/e5-o.png?raw=true "exercise-5-output")

**Observation**: _As expected, the program appended "...", inserted "Ready, Set, " at index 0, and deleted "Sta" near the end of the string._

---
### Exercise 6: `substring()`, `indexOf()`, and Non-Existing Words

**Code Snippet**

![Screenshot Proof](/ss/e6-cs.png?raw=true "exercise-6-code-snippet")

**Prediction**: _This code will output 'fox', 16, and -1._

**Output**

![Screenshot Proof](/ss/e6-o.png?raw=true "exercise-6-output")

**Observation**: _As expected, the program outputted fox, 16 & -1._

---
### Exercise 7: `toString()` - Converting back to String

**Code Snippet**

![Screenshot Proof](/ss/e7-cs.png?raw=true "exercise-7-code-snippet")

**Prediction**: _This code will output "Status: Pending" for both println._

**Output**

![Screenshot Proof](/ss/e7-o.png?raw=true "exercise-7-output")

**Observation**: _As expected, the program outputted "Status: Pending" for both._
