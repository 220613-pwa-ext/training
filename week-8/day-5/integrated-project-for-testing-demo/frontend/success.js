window.addEventListener('load', async () => {
    getCurrentlyLoggedInUser();

    let logoutBtn = document.querySelector('#logout')
    logoutBtn.addEventListener('click', async () => {
        let res = await fetch('http://127.0.0.1:8080/logout', {
            credentials: 'include',
            method: 'POST'
        })

        if (res.status == 200) {
            window.location.href = '/index.html';
        }
    })
})

async function getCurrentlyLoggedInUser() {
    let res = await fetch('http://127.0.0.1:8080/current-user', {
        credentials: 'include',
        method: 'GET'
    });

    if (res.status == 200) {
        let loggedInUser = await res.json();

        let loginStatusDiv = document.querySelector('#login-status');

        let pId = document.createElement('p');
        pId.innerHTML = loggedInUser.id;

        let pUsername = document.createElement('p');
        pUsername.innerHTML = loggedInUser.username;

        let pPassword = document.createElement('p');
        pPassword.innerHTML = loggedInUser.password;

        let pEmail = document.createElement('p');
        pEmail.innerHTML = loggedInUser.email;

        loginStatusDiv.appendChild(pId);
        loginStatusDiv.appendChild(pUsername);
        loginStatusDiv.appendChild(pPassword);
        loginStatusDiv.appendChild(pEmail);
    } else if (res.status == 404) {
        window.location.href = '/index.html'
    }

}