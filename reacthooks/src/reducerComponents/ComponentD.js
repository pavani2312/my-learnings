import React, {useContext} from 'react'
import { CountContext } from '../App'

function ComponentD() {
  const count = useContext(CountContext)
  return (
    
    <div>
      Component D - {count.countState}
      <button onClick = {()=>count.countDispatch('increment')}>Increment</button>
      <button onClick = {()=>count.countDispatch('decrement')}>Decrement</button>
      <button onClick = {()=>count.countDispatch('reset')}>Reset</button>
    </div>
    
  )
}

export default ComponentD
