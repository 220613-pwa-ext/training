// Python
// print("2 + 2 is " + str(4))
// in python, for the above example, we can only concatenate a str with a str

console.log("2 + 2 is " + 4); // JS does not complain that we are adding a string with a number
// it "coerces" the number into a string before concatenating them together

console.log(true + true); // 1 + 1 = 2 (here JS cocerces true into 1)
console.log(true + false); // 1 + 0 = 1 (here JS coerces true into 1 and false into 0)

console.log("number" + 15 + 3) // number153, 15 is first coerced into a string, concatenated with "number" to give us
// "number15", then 3 is coerced into "3" and concatenated to give "number153"

console.log("1" == 1) // true
console.log("1" === 1) // false

// === v. == (JS concept)
// === is strict equality (datatypes must be the same, type coercion does not occur)
// == is unstrict equality (it will first attempt to coerce values and then compare)

// Truthy/Falsy

// Falsy values
// false
// 0
// ""
// null
// undefined
// NaN

// Anything else is Truthy

if ("") {
    console.log("This will not run")
}

if (false) {
    console.log("This will not run")
}

if (0) {
    console.log("This will not run")
}

if (null) {
    console.log("This will not run")
}

if (undefined) {
    console.log("This will not run")
}

if (NaN) {
    console.log("This will not run")
}


// Truthy examples
if ("a string") {
    console.log("This will run")
}

if (true) {
    console.log("This will run")
}

if (-10) {
    console.log("This will run")
}

if ({}) {
    console.log("This will run")
}

var a = 10;
if (a) {
    console.log("This will run")
}
