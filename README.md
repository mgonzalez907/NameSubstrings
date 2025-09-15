Programs

NameSubstrings

The method main does the following:
Requests the name of an input file and uses it to create a Scanner for that input file. (i.e. last_names_input.txt found in the Lesson 2 Homework file on Canvas). Don’t hardcode the name.
Requests the name of an output file and uses it to create a PrintWriter. Don’t hardcode the name.
Creates a one-dimensional String array with 100 rows.
Reads in first names from the input file into the String Array. You may assume that the file has no more than 100 names. Also assume that each name has at least 3 characters. There could be more than one name on a line.
Calls noFirst with a reference to the String array created, and the number of names read in, to create a set of Strings and return a reference to a different one-dimensional String array as described below.
Prints to the output file on a separate line the String in each row of the original array followed by a space followed by the String created in noFirst. (see last_names_output.txt found in Lesson 2 Homework file on Canvas for the correct outputs


noFirst: 
Accepts the reference to a one-dimensional array and the number of names that were read in from the input file in main. 
Creates a new one-dimensional String array with the length equal the number of the number of names read in (the second parameter in the header).
Obtains a substring that includes all but the first character of the String and place the new substring created into a corresponding row in the new one-dimensional String array.
Returns a reference to the new one-dimensional String array. 
