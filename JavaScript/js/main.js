export default class Login{
    constructor(name, email){
        this._name = name;
        this._email = email;
    }

    whole(){
        return `hey I am ${this._name} and my email is ${this._email}`;
    }
} 

/* //giving Input data 
function login() {
  let enterName = document.getElementById('username').value;
  let enterPassword = document.getElementById('password').value;
  
  //local storage get data
  var getEmail = localStorage.getItem('userName');
  var getPassword = localStorage.getItem('userpassword');

  if(enterName == getEmail)
  {
    if(enterPassword == getPassword)
    {
      alert("Login Successful");
    }
    else
    {
      alert("Invalid Password");
    }
  }
  else
  {
    alert("Invalid Credentials");
  }


}

//Setting Input for registration
function register(){
    let name = document.getElementById('name').value;
    let email = document.getElementById('email').value;
    let password = document.getElementById('pswrd').value;
  
    //local storage set data
    localStorage.setItem('userName',name);
    localStorage.setItem('useremail',email);
    localStorage.setItem('userpassword', password);
  }*/