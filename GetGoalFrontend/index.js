let adminButton=document.getElementById("adminPannel");
let studentButton=document.getElementById("studentPannel");


adminButton.addEventListener("click",()=>{
    window.location='./Admin/admin.html';
    console.log("s")
})


studentButton.addEventListener("click",()=>{
    window.location='./student/student.html';
    console.log("s")
})