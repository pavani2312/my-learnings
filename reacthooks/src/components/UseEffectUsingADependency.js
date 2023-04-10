import React, { useEffect, useState } from 'react'

function UseEffectUsingADependency() {
    const[count, setCount] = useState(0)

    const tick =  () => {
        setCount(prevCount => prevCount + 1) //if we do this then we no need to add a dependecy in the empty array in useEffect()
    }

    useEffect(()=> {
        const interval = setInterval(tick, 1000)
        return ()=> {
            clearInterval(interval)
        }
    }, [])

  return (
    <div>
      {count}
    </div>
  )
}

export default UseEffectUsingADependency
