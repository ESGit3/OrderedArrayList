# OrderedArrayList

### Important notes
-Remember that you still have access to parent class methods when overriding them.

-There are many methods in the ArrayList that can break the NoNullArrayList and OrderedArrayList. We will ignore this because I don't want you overriding a bunch of methods to fix that.

-DO NOT use any built in sort methods except for testing purposes (Sort commands should ONLY exist in your tester program, not the classes you are writing)

You may access parent class methods using super.

Comparable compares 2 objects, and returns the following:
-1 if element is less than compared element
0 if equals
1 if larger

thus when testing, check to see if a.comparesTo(b) <= 0

for loop doesnt work for some weird reason, and so i used a while loop which fixed the issues in OrderedArrayList.


