import React, { Component } from 'react'
import axios from 'axios'

class PutList extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         userId : '2345',
         title : 'Update Http',
         body : 'This for updating the data using http put in the server'
      }
    }
     
    updateHandler = () => {
        axios.put('https://jsonplaceholder.typicode.com/posts/1', this.state)
        .then(response => {
            console.log(response)
        })
    }
  render() {
    return (
      <div>
        <button onClick = {this.updateHandler}>Update</button>
      </div>
    )
  }
}

export default PutList
