import React from 'react'

function Button({handlerClick, children}) {
    console.log('Rendering button - ', children)
  return (
    <div>
      <button onClick= {handlerClick}>
          {children}
      </button>
    </div>
  )
}

export default React.memo(Button)
