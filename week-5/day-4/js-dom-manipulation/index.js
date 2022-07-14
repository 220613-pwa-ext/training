console.log(document);

let html_element = document.getElementsByTagName('html')[0];
console.log(html_element.innerHTML);

let h1_element = document.getElementById('some-id');
console.log(h1_element.innerHTML);
h1_element.innerHTML = 'Hello World!';

// innerHTML: HTML representation of everything inside of that particular element
// - Vulnerable to XSS if what you are displaying on the page is based on user input
// - A malicious user could insert malicious HTML tags that execute custom JavaScript code that might steal information
// for example
let divA = document.querySelector('#a');
console.log(divA.innerHTML);
divA.innerHTML = '<p>testing <strong>123</strong></p>' // HTML tags actually get interpreted as valid HTML

// innerText: only contains visible text within that element, so any text that is not visible will not be part of the value
// of this property
divA.innerText = '<p>testing <strong style="display: none;">123</strong></p>'; // tags are treated as text, not HTML elements

// textContent: displays the full text and all of the formatting of that text
divA.textContent = '<p>testing <strong>123</strong></p>'; // tags are treated as text, not HTML elements

let button = document.getElementById('btn-1');

let counter = 0;

button.addEventListener('click', function() {
    alert('Button clicked!');
    counter++;
    console.log(`Button has been clicked ${counter} times`)
});

/*
    Changing the styling of an element
*/
divA.style.color = 'red';
divA.style.border = '5px solid black';
divA.style.backgroundColor = 'blue';

// background-color property in CSS -> camelCase -> backgroundColor

let button2 = document.querySelector('#div-clear');
button2.addEventListener('click', function() {
    divA.innerHTML = ''; // Clear out all of the content inside of the div
})


/*
    Add paragraph to divA functionality
*/
let button3 = document.querySelector('#text-form button'); // Using descendant CSS selector
let textInput = document.querySelector('#text-form input');

button3.addEventListener('click', function() {
    let paragraphElement = document.createElement('p');
    paragraphElement.textContent = textInput.value;

    divA.appendChild(paragraphElement);
});


/*
    Pokemon
*/
// Fetch is an API built into the web browser that allows for you to write JavaScript code that will send HTTP requests
let pokemonIdInput = document.getElementById('pokemon-input');
let getPokemonBtn = document.getElementById('pokemon-btn');
let pokemonTableBody = document.querySelector('#pokemon-table tbody'); 
getPokemonBtn.addEventListener('click', () => {
    fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonIdInput.value}`, {
        'method': 'GET'
    }).then((res) => {
        return res.json();
    }).then((data) => {
        let tRow = document.createElement('tr');

        let td1 = document.createElement('td');
        td1.innerHTML = data.id;
        let td2 = document.createElement('td');
        td2.innerHTML = data.name;
        let td3 = document.createElement('td');
        td3.innerHTML = `<img src=${data.sprites.front_default} />`

        tRow.appendChild(td1);
        tRow.appendChild(td2);
        tRow.appendChild(td3);

        pokemonTableBody.appendChild(tRow);
    })
})

let pokemonClearTableButton = document.getElementById('pokemon-clear-btn');
pokemonClearTableButton.addEventListener('click', () => {
    pokemonTableBody.innerHTML = '';
})
