let loginButton = document.getElementById('login');

loginButton.addEventListener('click', () => {
    let username = document.getElementById('username').value;
    let password = document.getElementById('password').value;

    if (username == 'testing123' && password == 'password123') {
        window.location.href = 'user-profile.html'
    } else {
        alert('Login credentials are incorrect!');
    }
});