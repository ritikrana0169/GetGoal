document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();

    // Retrieve username and password values
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

    // Check credentials (this is just a basic example, replace it with your authentication logic)
    if (username === 'example' && password === 'password') {
        alert('Login successful!');
    } else {
        document.getElementById('error-message').innerText = 'Invalid username or password';
    }
});
