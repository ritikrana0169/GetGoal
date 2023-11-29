document.getElementById('signupForm').addEventListener('submit', function(event) {
    event.preventDefault();

    var name = document.getElementById('name').value;
    var age = document.getElementById('age').value;
    var mobile = document.getElementById('mobile').value;
    var email = document.getElementById('email').value;
    var techstack = document.getElementById('techstack').value;
    var skillLevel = document.getElementById('skillLevel').value;
    var password=document.getElementById('password').value;


    let data={
        name:name,
        age:age,
        mobile:mobile,
        email:email,
        tech:techstack,
        level:skillLevel,
        password:password,
        status:true
    }
    

const apiUrl = 'http://localhost:8080/add';


fetch(apiUrl, {
  method: 'POST',
  headers: {
    'Content-Type': 'application/json',
  },
  body: JSON.stringify(data),
})
  .then(response => {
    if (response.ok) {
      console.log("All Ok")
      alert("User Registered");
    }
    return response.json();
  })
  .catch(error => {
    console.error('Error:', error.message || error);
  });
});
