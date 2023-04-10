import React, { Component } from 'react'

 class ClassClick extends Component {
    clickingfunction(){
        console.log('Button Clicked using Class Event')
    }
  render() {
    return (
      <div>
        <h1>Class Event Handler</h1>
       <button onClick = {this.clickingfunction}>Click</button>
      </div>
    )
  }
}

export default ClassClick
