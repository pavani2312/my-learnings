import React from 'react'
//import './style.css'
function Styling() {
    
    //Inline CSS
    const heading = {
        fontSize : '72px',
        color : 'blue'
    }
    return(
        <div>
            <h2 style = {heading}>Welcome to Inline Styling</h2>
        </div>
    )
    //CSS StyleSheets
//   return (
//     <div>
//        <h2 className = {`primary font`}>Styling in CSS</h2>
//     </div>
//   )
}

export default Styling
