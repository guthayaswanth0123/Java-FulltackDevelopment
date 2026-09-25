// function login(){
//     let mail=document.getElementById("email").value;
//     let password=document.getElementById("password").value;
//     if(mail=== "" || password===""){
//         document.getElementById("msg").innerText="All feilds are required";
//     }else{
//         document.getElementById("msg").innerText="Login Sucessfull";
//     }
// }


let buttons = document.querySelectorAll("button");
let message = document.getElementById("message");

buttons.forEach(function(button) {
    button.addEventListener("click", function() {
        message.textContent = this.textContent;
    });
});