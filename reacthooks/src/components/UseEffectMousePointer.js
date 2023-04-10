import React, { useEffect, useState } from 'react'
//This function is to learn how to use useEffect without rerendering and to use only once 
function UseEffectMousePointer() {
    const [x, setX] = useState(0)
    const [y, setY] = useState(0)

    const mouseMovePositon = e => {
      setX(e.clientX)
      setY(e.clientY)
    }
    useEffect( () => {
        console.log("Use Effect - Mouse Movement")
      window.addEventListener('mousemove', mouseMovePositon)

      return () => {
          console.log("Component unmounting ")
          window.removeEventListener('mousemove', mouseMovePositon)
      }
    }, [])
  return (
     <div>
        Hooks X -{x} Y -{y}
    </div>
  )
}

export default UseEffectMousePointer
