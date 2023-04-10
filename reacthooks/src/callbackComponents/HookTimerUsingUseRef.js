import React, { useState, useRef, useEffect } from 'react'

function HookTimerUsingUseRef() {
    const [timer, setTimer] = useState(0)
    const intervalRef = useRef()

    useEffect( () => {
        intervalRef.current = setInterval(() => {
            setTimer(timer => timer + 1)
            }, 1000)
            return () => {
                clearInterval(intervalRef.current)
            }
        }, [])
  return (
    <div>
      Hook Timer - {timer}
      <button onClick = { () => clearInterval(intervalRef.current)}>Stop Timer</button>
    </div>
  )
}

export default HookTimerUsingUseRef
