import React from 'react'

function ReactMemo({name}) {
    console.log('Rendering Memo Component')
  return (
    <div>
       {name}
    </div>
  )
}

export default React.memo(ReactMemo)
