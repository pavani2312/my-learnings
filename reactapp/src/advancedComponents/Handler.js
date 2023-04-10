import React from 'react'


function Handler ({ heroName }) {
  if (heroName === 'Joker') {
    throw new Error(' Not a hero!')
  }
  return (<div>{heroName}</div>)
}

export default Handler
