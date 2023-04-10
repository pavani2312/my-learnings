import React from 'react'

function ObjectRendering({person}) {
  return (
    <div>
      <h2>I am {person.name}. My age is {person.age} and my skills are {person.skill}.</h2>
    </div>
  )
}

export default ObjectRendering
