'use strict';
// This is a comment in JavaScript
// It allows us to have the browser ignore whatever we are typing

/* 

We can also have multiline
comments such as this

*/

console.log("hello world"); // Log a message to the console

// 6 most commonly used datatypes
/*

    1. string (primitive)
    2. number (primitive)
    3. boolean (primitive)
    4. null (technically an object that indicates the lack of an object)
    5. undefined (you have declared a variable but have not yet assigned a value to it)
    6. object (similar to dictionaries in Python, key-value pairs (keys = properties, values = values of those properties))
        - Objects are stored in the heap, primitives in the stack (unless they are part of an object)
*/

function addition(a, b) {
    return a + b;
}

var a_string; // declare a variable (create the variable)
a_string = 'I am a string'; // assignment

var a_string_2 = "I am another string"; // double quotes
var a_string_3 = `I am a template string. 2 + 2 is ${addition(2, 2)}`; // ${ <expression> }

console.log(a_string);
console.log(a_string_2);
console.log(a_string_3);

// There is only ONE number type
// Unlike Python, which has int and float, numbers are all treated the same in JS
var a_number = 10; 
var a_number_2 = 3.1415;

console.log(a_number);
console.log(a_number_2);
console.log(typeof(a_number));
console.log(typeof(a_number_2));

var a_boolean = true;
var a_boolean_2 = false;

var a_variable;
console.log(a_variable); // undefined (because we have not assigned a value yet)

var person_1 = null; // this variable has no object associated with it
console.log(person_1);

person_1 = {
    'id': 1,
    'first_name': 'John',
    'last_name': 'Doe'
};
console.log(person_1);

/*

    Functions

    Functions are blocks of reusable code that can be invoked/executed over and over again
    - Functions can take inputs (parameters)
    - Functions can return a value (return)

    3 types of functions
    1. Named functions
    2. Anonymous functions
    3. Arrow functions
*/

// Named function
function a_named_function() {
    console.log("Hi, I am a console.log inside of a named function")
}

a_named_function();

// Anonymous functions
var a_variable_2 = function() {
    console.log("Hi, I am a console.log inside of an anonymous function");
}
a_variable_2(); // a_variable_2 is the name of the variable pointing to the anonymous function, not the name of the function
// itself

(function() { // anonymous function
    console.log("Immediately invoked function expression (IIFE) demo")
})();

// Arrow function
var a_variable_3 = (a, b) => {
    console.log(`${a} + ${b} is ${a + b}`);
}

a_variable_3(3, 4);

(() => {
    console.log("IIFE (arrow function)")
})();

/*

    Objects
    - Objects are similar to dictionaries in Python
    - Are composed of key-value pairs

*/

// p1 does not contain the person object itself, it contains the location (memory address) of where that object
// exists in the heap
let p1 = { // Object literal syntax
    'first_name': 'John',
    'last_name': 'Doe'
};
p1.age = 30; // Add an additional key-value pair ('age': 30)

console.log(p1)

let p2 = p1;
p2.age = 100; // p2 points to the same object in the heap as p1

console.log(p1); // age: 100, first_name: 'John', last_name: 'Doe'

// Function constructor
// A function where we utilize the "this" keyword to set the properties of some newly created object
// Naming convention is to capitalize the first letter of the function name for a function constructor
function Person(age, first_name, last_name) {
    this.age = age
    this.first_name = first_name
    this.last_name = last_name
}

let p3 = new Person(24, "Bach", "Tran"); 
// 1. The new keyword creates a new object
// 2. The Person(... ,..., ...) function constructor is invoked
// 3. The new object is represented using the "this" keyword
// 4. We set 3 new properties for that object
// 5. Object then gets referred to by p3
console.log(p3)

// ES6 classes
// Not "real" classes, just "syntactic-sugar"
class Employee {

    constructor(age, first_name, last_name) {
        this.age = age;
        this.first_name = first_name;
        this.last_name = last_name;
    }

}

let e1 = new Employee(40, "John", "Doe");
console.log(e1);
console.log(e1.age);
console.log(e1.first_name);
console.log(e1.last_name);
