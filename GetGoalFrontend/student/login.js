document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();

    // Retrieve username and password values
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;

var data = {
    username: username,
    password: password
};

fetch('http://localhost:8080/login', {
    method: 'POST',
    headers: {
        'Content-Type': 'application/json'
    },
    body: JSON.stringify(data)
})
    .then(response => response.text())  // Assuming the response is expected as plain text
    .then(data => {
        if (data === 'Login SuccessFull') {
            console.log("e")
            window.location.href = '../AiInteraction/interviewPannel.html';
        } else {
            alert('Wrong Credentials');
        }
    })
    .catch((error) => {
        console.error('Error:', error);
    });

    
});
