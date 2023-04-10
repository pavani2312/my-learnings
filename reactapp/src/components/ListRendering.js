import React from 'react'
import ObjectRendering from './ObjectRendering'

function ListRendering() {
    // const names = ['Satya', 'Pavani', 'Chekka']
    // const nameList = names.map(name =><h2>{name}</h2>)
    const persons = [
        {
           id : 1,
           name : 'Bruce',
           age : 25,
           skill : 'Angular'
        },
        {
            id : 2,
           name : 'Clark',
           age : 20,
           skill : 'React'
        },
        {
            id : 3,
            name : 'Diana',
            age : 23,
            skill : 'Vue'
        }
    ]
    const personList = persons.map(person => <ObjectRendering key ={person.id} person = {person}/>)
  return (
    <div>
       {personList} 
    </div>
  )
}

export default ListRendering
