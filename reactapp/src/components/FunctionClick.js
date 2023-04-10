import React from 'react'

function FunctionClick() {
    function Clickingfunction(){
        console.log('Button Clicked using Function Event')
    }
  return (
    <div>
      <h1>Function Event Handler</h1>
      <button onClick = {Clickingfunction}>Click</button>
    </div>
  )
}

export default FunctionClick
