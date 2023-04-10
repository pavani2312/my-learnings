import React from 'react'
import ParentComponent from './ParentComponent'
function ChildComponent(props) {
  return (
    <div>
      <button onClick = {() => props.greetHandler('child')}>Greet to Click</button>
    </div>
  )
}

export default ChildComponent
