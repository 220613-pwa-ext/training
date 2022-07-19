let divA = document.querySelector('#A');
let divB = document.querySelector('#B');
let divC = document.querySelector('#C');

let htmlElement = document.querySelector('html');
let bodyElement = document.querySelector('body');

// Event listeners by default listen for events happening in the bubbling phase
divA.addEventListener('click', (e) => {
    alert('A was clicked');
    e.stopPropagation();
    console.log(e);
    // e.preventDefault(); // useful for disabling default "form submission" behaviors that the browser might do
})

divB.addEventListener('click', (e) => {
    alert('B was clicked');
    e.stopPropagation();
})

divC.addEventListener('click', (e) => {
    alert('C was clicked');
    e.stopPropagation();
})

htmlElement.addEventListener('click', (e) => {
    alert('html was clicked');
    e.stopPropagation();
})

bodyElement.addEventListener('click', (e) => {
    alert('body was clicked');
    e.stopPropagation();
})

// Here we set up event listeners that listen in the "capturing phase"
divA.addEventListener('click', () => {
    alert('A was clicked');
}, true)

divB.addEventListener('click', () => {
    alert('B was clicked');
}, true)

divC.addEventListener('click', () => {
    alert('C was clicked');
}, true)

htmlElement.addEventListener('click', () => {
    alert('html was clicked');
}, true)

bodyElement.addEventListener('click', () => {
    alert('body was clicked');
}, true)
