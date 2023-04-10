import React, { useState } from 'react'

function PrevStateHook() {
    const intitalCount = 0
    const [count, setCount] = useState(intitalCount)

    const incrementFive = () => {
        for (let i = 0; i < 5; i++) {
            setCount(prevCount => prevCount + 1)
        }
    }
    return (
        <div>
            Count = {count}
            <div>
                <button onClick={() => setCount(intitalCount)}>Reset</button>
                <button onClick={() => setCount(prevCount => prevCount + 1)}>Increment</button>
                <button onClick={() => setCount(prevCount => prevCount - 1)}>Decrement</button>
                <button onClick={incrementFive}>Increment By 5</button>
            </div>
        </div>
    )
}

export default PrevStateHook
