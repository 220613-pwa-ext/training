let usernameInput = document.getElementById('username-input');
let passwordInput = document.getElementById('password-input');
let firstNameInput = document.getElementById('firstname-input');
let lastNameInput = document.getElementById('lastname-input');
let phoneInput = document.getElementById('phone-input');
let emailInput = document.getElementById('email-input');
let genderButtons = document.querySelectorAll('input[name="gender"]');
let registrationSubmitButton = document.getElementById('register-submit-btn');


registrationSubmitButton.addEventListener('click', () => {
    let selectedRadioButton;
    for (let radioBtn of genderButtons) {
        if (radioBtn.checked) {
            selectedRadioButton = radioBtn
            break;
        }
    }

    fetch('http://127.0.0.1:8080/users', {
        'method': 'POST',
        'headers': {
            'Content-Type': 'application/json'
        },
        'body': JSON.stringify({
            "username": usernameInput.value,
            "password": passwordInput.value,
            "first_name": firstNameInput.value,
            "last_name": lastNameInput.value,
            "gender": selectedRadioButton.value,
            "phone_number": phoneInput.value,
            "email_address": emailInput.value
        })
    }).then((res) => {
        if (res.status == 201) {

            window.location.href = '/success.html'
        
        } else if (res.status == 400) {

            res.json().then((data) => {
                let registrationErrorMessagesDiv = document.getElementById('registration-error-messages')
                registrationErrorMessagesDiv.innerHTML = '';

                let errorMessages = data.messages;
                for (let errorMessage of errorMessages) {
                    let errorElement = document.createElement('p');
                    errorElement.innerHTML = errorMessage;
                    errorElement.style.color = 'red';
                    errorElement.style.fontWeight = 'bold';

                    registrationErrorMessagesDiv.appendChild(errorElement);
                }

            });

        }
    })
});