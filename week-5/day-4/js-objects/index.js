// ways of defining a string
// 1. "" literals
// 2. '' literals
// 3. `2 + 2 is ${2 + 2}` template literals

// 3 ways of creating an object
// 1. {} object literal syntax
// 2. Using function constructors
// 3. ES6 classes

let p1 = {
    "id": 1,
    "first_name": "John",
    "last_name": "Doe"
};

let x = p1; // p2 and p1 are referring to the same object
x.age = 34;
console.log(p1.age); // 34

function Person(id, first_name, last_name, age) {
    this.id = id;
    this.first_name = first_name;
    this.last_name = last_name;
    this.age = age;
}

// new keyword will create a new object
// the new object will be referred to by p2
// the function constructor will be invoked
// the "this" keyword in the function constructor will refer to the newly created object
let p2 = new Person(2, "Jane", "Doe", 35);
console.log(p2);

// Equivalent
let p3 = {}
p3.id = 3;
p3.first_name = "Bach";
p3.last_name = "Tran";
p3.age = 24;

// ES6 classes
// Syntactic sugar
class Employee {
    constructor(id, first_name, last_name, age) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }
}

let e1 = new Employee(1, "John", "Doe", 50);
console.log(e1);

// Technically, in JS, objects are just key-value pairs
// key identifies a property
// value is a value of the property
// Because functions are first-class citizens in JS (just like in Python), a value can be a function

let dog1 = {
    "dog_name": "Fido",
    "age": 2,
    "make_noise": function() { // 1. named functions, 2. anonymous functions, 3. arrow functions
        // here we are using an anonymous function that is being referenced by the make_noise property
        console.log(`${this.dog_name} says bark!`)
    }
}

dog1.make_noise(); // Fido says bark!

let variable_1 = dog1.make_noise;
variable_1(); // undefined says bark! (Window doesn't have a name property)

/*
    For anonymous and named functions, the "this" keyword depends on the object that is calling the function
*/
let dog2 = {
    "dog_name": "Sparky"
}

dog2.x = dog1.make_noise;
dog2.x(); // Sparky says bark!

/*
    Arrow functions treat the "this" keyword differently

    Arrow functions use the "this" object from its lexical scope
*/
console.log(this); // Window object
let a = () => {
    console.log(this);
}

a();

let dog3 = {
    "dog_name": "Hoss",
    "make_noise": () => { // the lexical scope of this arrow function is the global scope
        console.log(`${this.dog_name} says bark!`)
    }
}

dog3.make_noise(); // undefined says bark!
// -> ${window.dog_name} says bark!

let dog4 = {
    "dog_name": "Hoss",
    "make_noise": function() {
        console.log(this); // dog4 Object

        let arrow_func = () => { // lexical scope of this arrow function is the function scope
            console.log(`${this.dog_name} says bark!`);
        }

        arrow_func();
    }
}

dog4.make_noise(); // Hoss says bark!

// Takeaway: anonymous functions and arrow functions are not the same

let b = function() {
}

let c = () => {
}