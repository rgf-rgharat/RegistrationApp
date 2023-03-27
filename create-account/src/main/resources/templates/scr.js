function checkpassword(){

    let password= document.getElementById("passwordh").value;
    let confirmpassword= document.getElementById("confirmpasswordh").value;
    let errmsg=document.getElementById("errormsg").value;

    if(password.length !=0){
        if(password==confirmpassword){
            errmsg.textContent="Password Match";

        }else {
            errmsg.textContent="password dont match";
        }
    }
}

//checking 1
//learning
// document.querySelector('btn btn-success').onclick=function(){

//     var password=document.querySelector('.passwordh').value,
//         confirmpassword=document.querySelector('confirmpasswordh').value;

//         if(password==confirmpassword){
//             alert("matched");
//         }

// }