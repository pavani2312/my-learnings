//console.log("Hello World");


/*//String
myString = "JavaScript"
//<---String Methods--->
console.log(myString);
console.log(myString.charAt(4));
console.log(myString.indexOf("S"));
console.log(myString.lastIndexOf("cr"));
console.log(myString.slice());
console.log(myString.toUpperCase());
console.log(myString.toLowerCase());
console.log(myString.includes("Java"));
console.log(myString.split(""));
console.log(myString.length);*/


/*//Numbers
myNumber = 56
myFloat = 56.123343
myString = "56.143645amdahf"
//<---Number Methods--->
console.log(myNumber);
console.log(myFloat);
console.log(Number(myString) === myFloat);
console.log(myString);
console.log(Number.isInteger(myNumber));
console.log(Number.parseFloat(myString));
console.log(myFloat.toFixed(5));
console.log(Number.parseInt(myFloat));
console.log(myFloat.toString());
//Chaining grp of methods
console.log(Number.parseFloat(myFloat).toFixed(5));
console.log(Number.isNaN(myString));
console.log(isNaN(myString));*/


/*//<---Math Methods--->
myFLoat = 3.9
console.log(Math.PI)
console.log(Math.trunc(Math.PI))
console.log(Math.round(myFLoat))//rounds +1 from .5
console.log(Math.ceil(myFLoat))// rounds +1 from .1
console.log(Math.floor(myFLoat))// rounds same from .1
console.log(Math.pow(2,4))// 2 is num and 4 is power
console.log(Math.min(2,4,6,9))
console.log(Math.max(2,4,6,9))
console.log(Math.random())
console.log(Math.random()*3)
console.log(Math.random() * 3 + 1)*/


//To get a random letter from a name
/*const myName = "SatyaPavani"
console.log(myName.charAt(Math.floor(Math.random() * myName.length)))*/


/*//Ternary Operator
let percenatge = 30 ;
let score = percenatge>=90 ? "Grade A"
: percenatge>=70 ? "Grade B"
: percenatge>=50 ? "Grade C"
:"Fail"
console.log(score)*/


/*//Pop-Up Boxes
//<---Alert Box--->
//alert("Hello there!!!!")
//alert("Hello!!!") //we can have two alerts but it will display one after other
//<---Confirm Box--->
//let bool = confirm("Are you a girl???")
//console.log(bool)
//<---Prompt Box--->
let name = prompt("Enter your name:")
if(name){
    console.log(name.length)
    console.log(name.trim().length)
    console.log(name)
}
else
console.log("You didnt enter your name")*/


//<---Functions--->
/*function sum(a, b){
    return a + b;
}
console.log(sum(2));

//function without name
const getNameFromEmailId = function (email){
    return email.slice(0, email.indexOf("@"));
}
console.log(getNameFromEmailId("rashul@gmail.com"));

//Arrow function 
const getNameEmailId = (email) =>{
    return email.slice(0, email.indexOf("@"));
}
console.log(getNameEmailId("treeee@gmail.com"));*/


/*//<---Global and Local Scopes of var, let, const--->
var x = 1;
let y = 2;
const z = 3;
console.log(`global ${x}`);
console.log(`global ${y}`);
console.log(`global ${z}`);

function myFun() {
    var x = 10;
    const z = 15;
    {
        var x = 20;//function level
        const z = 25;//block level
        console.log(`block ${x}`);
        console.log(`block ${y}`);
        console.log(`block ${z}`);
    }
    console.log(`function ${x}`);
    console.log(`function ${y}`);
    console.log(`function ${z}`);
}
myFun();*/


/*//<---Arrays--->
const arrayA = [];
arrayA[0] = "Pavani"
arrayA[1] = 102
arrayA[2] = false
console.log(arrayA);
console.log(arrayA.length);
console.log(arrayA[arrayA.length - 1]);//gives element value
arrayA.push(432); //adds to last
console.log(arrayA);
arrayA.pop(); // deletes last item
console.log(arrayA);
arrayA.unshift(3726)//adds at first
console.log(arrayA);
console.log(arrayA.shift());//deletes 1st item
console.log(arrayA);
arrayA.splice(1,1)//removes middle item
console.log(arrayA);
arrayA.splice(1,2, "pavs","satya")//replace the items
console.log(arrayA);
const arrayA = ["a", "b", "c"];
const arrayB = ["d", "e", "f"];
console.log(arrayA);
console.log(arrayA.reverse());
console.log(arrayA);
console.log(arrayA.join());
console.log(arrayA.concat(arrayB));
const newArray = [...arrayA, ...arrayB]//spread operator to join 2 arrays
console.log(newArray);
//<--Nested Arrays---> 2 dimensional
const arrayA = ["Satya", "Rashmi", "Tripura"];
const arrayB = ["CH", "M", "V"];

const arrayC = ["Joseph", "Durga", "Sama"];
const arrayD = ["Convent", "Prasad", "Public"];

const arrayComb1 = [arrayA,arrayB]
const arrayComb2 = [arrayC,arrayD]
console.log(arrayComb1[0][1]);
console.log(arrayComb2[1][0]);

//<--- 3 dimensional--->
const array3Dim =[arrayComb1,arrayComb2]
console.log(array3Dim)
console.log(array3Dim[1][0][1])*/
/*//Map(), reduce(), filter()
const myArray = [
    {
        name : "Pavs",
        age : 25,
        role : "developer" 
    },
    {
        name : "sats",
        age : 23,
        role : "tester" 
    },
    {
        name : "pops",
        age : 30,
        role : "hr" 
    }
];

const mapArray = myArray.map(person =>{
    return person.name;
});
console.log(mapArray);

const filterArray = myArray.filter(person =>{
    return person.age <30;
}).map(person=>{
    return person.name;
});
console.log(filterArray);

const reduceArray = myArray.reduce((total,person) =>{
    return total + person.age;
},0);
console.log(reduceArray);*/

/*//<---Objects--->
const plant = {
     seed : 4,
     typesOfSeeds : ["lily", "rose", "sunflower"],
     flower: function() { //another type of Function inside an object
         return "blossom";
    }
};
const carrot = Object.create(plant) 
carrot.bud = 6
carrot.flower = function(){
    return "smell";
}
console.log(carrot.flower())// Inheritance
const carrotSmall = Object.create(carrot)
carrotSmall.flower = function(){
    return "Great smell";
}
console.log(carrotSmall.flower())

const itField ={
    department : "Development",
    designation : "Software Engineer",
    name : "Pavani",
    role : "developing"
};
console.log(itField)

//Destructing Objects
let {name, role } = itField
console.log(name)

let {newName = "Pavani",  newRole = "developing"} = itField
console.log(newRole)*/


/*//<---Classes--->
class Pizza {
    constructor(pizzaSize, pizzaType, pizzaCrust) {
        this.size = pizzaSize
        this.crust = pizzaCrust
        this.type = pizzaType
        this.toppings = [];
    }
    getToppings() {
        return this.toppings;
    }
    setToppings(topping) {
        this.toppings.push(toppings);// because we used an array
    }
    bake() {
        console.log(`I want a ${this.size} ${this.crust} ${this.type} pizza!!!`);
    }
}
const myPizza = new Pizza("medium", "Crust", "ChesseBurst");
myPizza.setToppings("Olives");
myPizza.setToppings("Tomatoes");
myPizza.bake();
console.log(myPizza.getToppings());

class Pizza {
    constructor(pizzaSize, pizzaCrust) {
        this.size = pizzaSize;
        this.crust = pizzaCrust;
    }
    getToppings() {
        return this.toppings;
    }
    setToppings(topping) {
        this.toppings.push(toppings);// because we used an array
    }
}
class TypePizza extends Pizza{
    constructor(pizzaSize, pizzaCrust) {
        super(pizzaSize, pizzaCrust);
        this.type = "The Works";
    }
        slice(){
            console.log(`We have ${this.size } ${this.crust} ${this.type} is of 8 slices`);
        } 
}
const typePi = new TypePizza("medium", "crust" );
typePi.slice();

//<---Factory Function--->
//can be used for multiple objects having the same code
function pizzaFactory(pizzaSize){
    const type = "Original";
    const size = pizzaSize;
    return{
        bake :() => {
          console.log(`We had ${type} ${size} pizza!! `);
        }
    }
}
const pizza = pizzaFactory("Small");
pizza.bake();
//Usage of public and private varaibles
class Pizza {
    crust ="Original" //public
    #sause ;//private
    #size;
    constructor(pizzaSize, pizzaSause){
        this.#size = pizzaSize;
        this.#sause =pizzaSause;
    }
    getCrust(){
        return this.crust;
    }
    setCrust(crust){
        this.crust =crust;
    }
    hereIsPizza(){
        console.log(`Here is your ${this.crust} ${this.#size} ${this.#sause} sause pizza`);
    }
}
const myPi = new Pizza("Small", "Traditional");
myPi.hereIsPizza(); */


/*//<---JSON--->
const myObj = {
    name :"Pavani",
    age : 25,
    hobbies : ["eat", "sleep"]
};
console.log(myObj);

const newJSON = JSON.stringify(myObj)// converts object to string
console.log(newJSON);
console.log(typeof newJSON);

const convertJSON = JSON.parse(newJSON) //converts the converted json to JS object
console.log(convertJSON);
console.log(typeof convertJSON);*/


/*//<---Errors--->
"use strict"; //It will follow strict mode
const createError = () => {
    try{
       throw new customError("This is a Custom Error");
        
    }catch(err){
    console.error(err.name);
    console.error(err.message);
    console.error(err.stack);
    console.table(err)
    }
};
createError();
function customError(message){
    this.name = "custom error";
    this.message = message;
    this.stack = `${this.name} : ${this.message}`;
}*/


/*//<---DOM--->
const view1 = document.getElementById("view1");
console.log(view1);
const view2 = document.querySelector("#view2");
console.log(view2);
view1.style.display = "flex";
view2.style.display = "flex";

const views = document.getElementsByClassName("view")
console.log(views);
const viewBar = document.querySelectorAll(".view")
console.log(viewBar);

const divs = view1.querySelectorAll("div")// when using with the const variable no need to keep . for class name
console.log(divs);
const sameDivs = view1.getElementsByTagName("div")
console.log(sameDivs);

const evenDivs = view1.querySelectorAll("div:nth-of-type(2n)")
console.log(evenDivs)
for( let i=0; i<evenDivs.length; i++){
    evenDivs[i].style.backgroundColor = "darkblue";
}

const navText = document.querySelector("nav h1")
console.log(navText)
navText.textContent = "Hello Page!!!"
const navBar = document.querySelector("nav")
navBar.innerHTML = `<h1> Hello World!!</h1> <p>This is Good</p>`;
navBar.style.justifyContent = "space-between"

//selecting the nodes from div list
console.log(evenDivs[0])
console.log(evenDivs[0].parentElement) 
console.log(evenDivs[0].parentElement.children)
console.log(evenDivs[0].parentElement.childNodes)
console.log(evenDivs[0].parentElement.hasChildNodes())
console.log(evenDivs[0].parentElement.lastChild)
console.log(evenDivs[0].parentElement.lastElementChild)
console.log(evenDivs[0].parentElement.firstChild)
console.log(evenDivs[0].parentElement.firstElementChild)
console.log(evenDivs[0].nextSibling)
console.log(evenDivs[0].nextElementSibling)
console.log(evenDivs[0].previousSibling)
console.log(evenDivs[0].previousElementSibling)

view1.style.display = "none";
view2.style.display = "flex";
view2.style.flexDirection = "row";
view2.style.flexWrap = "wrap";
view2.style.margin = "10px";

while(view2.lastChild){
    view2.lastChild.remove();
}
//creating a flex data from js page
const creatDivs = (parent, iter) =>{
    const navDiv = document.createElement("div");
    navDiv.textContent = iter;
    navDiv.style.backgroundColor = "black";
    navDiv.style.width = "100px";
    navDiv.style.height = "100px";
    navDiv.style.margin = "10px";
    navDiv.style.display = "flex";
    navDiv.style.justifyContent = "center";
    navDiv.style.alignItems = "center";
    parent.append(navDiv);
};
for(let i =1; i<=12; i++ ){
creatDivs(view2, i);
}*/


/*//<--Event Listeners-->
const div = document.getElementById("box")
function doSomething() {
    alert("It is doing something!!")
};
//addEventListener(event, function, userCapture)
div.addEventListener("click", doSomething);
//Event Object 
const div = document.getElementById("box")
div.addEventListener("click", function(e)
{
    console.log(e.target);
    e.target.textContent = "Clicked"
});*/


/*//<---Storage Types--->
const myArr = ["dog", "cat", "bad", "ball"]
const myObj = {
      name : "Satya",
      directions : ["east", "west", "north", "south"],
      ball : function()
      {
        console.log(this.name);
      }
};
//Session Storage
sessionStorage.setItem("mySessionStorage", JSON.stringify(myArr));// Same for localStorgae too
const mySessionData = JSON.parse(sessionStorage.getItem("mySessionStorage"));
console.log(mySessionData);
//Local Storage
localStorage.setItem("mySessionStorage", JSON.stringify(myArr));// Same for localStorgae too
const mySessionData = JSON.parse(localStorage.getItem("mySessionStorage"));
console.log(mySessionData);*/


/*//<---Modules--->
import dancing from "./game.js";
//import {sleeping, playing } from "./game.js"
import {sleeping as doll, playing as cat } from "./game.js"//rename the imported files
import Login from "./main.js";
const newName = new Login("Pavani", "name@gmail.com");
console.log(newName);
console.log(newName.whole());
console.log(dancing());
console.log(doll());
console.log(cat());*/


//<---FETCH API (Callbacks, Promises, Async)--->
/*//Promises
const myPromise = new Promise((myResolve, myReject)=>{
    const error = false;
    if(!error ){
        myResolve("Success");
    }
    else{
        myReject("Failed");
    }
});

const myNextPromise = new Promise((resolve, reject)=>{
    setTimeout(function(){ //This is to set time to get our result
      resolve("This is my Next Promise!!!");
    },3000)
});

//To handle promises we use .then method 
myNextPromise.then(newVal =>{
    console.log(newVal);
})

myPromise.then(val =>{
    console.log(val);
}).catch( err =>{
    console.error(err);
})
//fetch() --- it will be used to get response from server
const users = fetch("https://jsonplaceholder.typicode.com/users")
.then(response =>{
 return response.json();
})
.then(data =>{
    data.forEach(user => {
      console.log(user);
    })
})
console.log(users);
//fetch() with async and await comes together
const myUsersArr ={
    userList: []
}
const users = async()=>{
    const response = await fetch("https://jsonplaceholder.typicode.com/users");
    const jsonResponse = await response.json();
    return jsonResponse;
}
const anotherUser = async() =>{
    const data = await users();
    myUsersArr.userList = data;
    console.log(myUsersArr.userList);
}
anotherUser();
console.log(myUsersArr.userList);
// fetch() with 2 parameters get parameter
const getDadJokes = async ()=>{
 const response = await fetch("https://icanhazdadjoke.com/", {
     method : "GET",
     headers : {
         Accept : "application/json" // text/plain
     }
 });
 const jsonData = await response.json(); //text()
 console.log(jsonData)
}
getDadJokes(); 
//Post data 
const jokeObject = {
    id: '7MZ0LR7UfFd',
    joke: "Why can't your nose be 12 inches long? Because then it'd be a foot!"
}
const postDadJokes = async () => {
    const response = await fetch("https://httpbin.org/post", {
        method: "POST",
        headers: {
            "Content-Type": "application/json" // text/plain
        },
        body: JSON.stringify(jokeObject)
    });
    const jsonData = await response.json(); //text()
    console.log(jsonData.headers)
}
postDadJokes(jokeObject); 
//get particular filtered data from url (this didnt work due to restriction of the office laptop I guess)
const requestJokes = async (id) => {
    const response = await fetch(`https://icanhazdadjoke.com/j?id${id}`);
    const jsonData = await response.json(); //text()
    console.log(jsonData.value)
}
requestJokes("0189hNRf2g");*/


