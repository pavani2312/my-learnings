import React from 'react';

// function Name(){
//     return <h1>Hello World!!</h1>
// }

//Arrow Function using props 
export const Name = (props) =>{
 return(
     <div>
    <h1>Hello {props.name}</h1> 
    {props.children}
    </div>
 )
}
export default Name;