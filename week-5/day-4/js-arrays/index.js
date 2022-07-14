// Arrays are very similar to lists in Python
// It's a collection of elements where we can access individual elements using indices
// Indices start at 0
// An array can store whatever datatypes you want it to

let myArray = [ 10, "a string", true, false, { "first_name": "John" } ]

myArray.push(1000); // Add an element to the end of an array (very right side)
let value = myArray.pop(); // removes element from end of array and returns it
myArray.unshift(123); // Add an element to the beginning of an array (very left side)
value = myArray.shift(); // removes element from beginning of array and returns it

// Traverse an array and print out all the elements
for (let i = 0; i < myArray.length; i++) {
    console.log(myArray[i]);
}

// for .. of: iterates over values of an "iterable" object
for (let element of myArray) {
    console.log(element);
}

// for .. in: iterates over keys of an object (or indices of an array)
let p1 = {
    "first_name": "Bach",
    "last_name": "Tran"
}

for (key in p1) {
    console.log(key);
}

for (i in myArray) {
    console.log(i);
}