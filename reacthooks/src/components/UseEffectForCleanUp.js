import React, { useState } from 'react'
import UseEffectMousePointer from './UseEffectMousePointer'
//This is used for cleaning up the code from other component 
function UseEffectForCleanUp() {
    const [display, setDisplay] = useState(true)
  return (
    <div>
      <button onClick = {()=> setDisplay(!display)}>Toggle Display</button>
      {display && <UseEffectMousePointer/>}
    </div>
  )
}

export default UseEffectForCleanUp
