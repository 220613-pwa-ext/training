const URL = 'ec2-18-116-32-53.us-east-2.compute.amazonaws.com';

window.addEventListener('load', () => {
    let loginBtn = document.querySelector('#login-btn');

    loginBtn.addEventListener('click', async () => { // async-await

        let usernameInput = document.querySelector('#username');
        let passwordInput = document.querySelector('#password');
    
        let username = usernameInput.value;
        let password = passwordInput.value;
    
        let res = await fetch(`http://${URL}:8080/login`, {
            credentials: 'include',
            method: 'POST',
            body: JSON.stringify({
                'username': username,
                'password': password
            })
        })
    
        if (res.status == 200) {
            // let loggedInUser = await res.json();
            // sessionStorage.setItem('user', JSON.stringify(loggedInUser)) // JSON.stringify (Object to String), JSON.parse (String to Object)
            window.location.href = '/success.html';
        } else if (res.status == 400) {
            let errorMessage = await res.text();
            let pElement = document.createElement('p');
            pElement.innerHTML = errorMessage;
            pElement.style.color = 'red';
    
            document.querySelector('#error-message').appendChild(pElement);
        }
    
    })
})





