import React, {useState, useEffect} from 'react'

function UseEffectWithSecondArrayAsParameter() {
    const[count, setCount] = useState(0)
    const[name, setName] = useState('')

    useEffect( () => {
        console.log("Use Effect - Updated the document title on count")
        document.title = `Clicked ${count} times`
    }, [count])
  return (
    <div>
        <input type = "text" vlaue = {name} onChange = {e => {setName(e.target.value)}} />
        <button onClick = {() => {setCount(count+ 1)}}>Clicked {count} times</button>
    </div>
  )
}

export default UseEffectWithSecondArrayAsParameter
