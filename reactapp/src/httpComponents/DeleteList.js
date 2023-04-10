import React, { Component } from 'react'
import axios from 'axios'

class DeleteList extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         userId : '234535',
         title : 'Delete Http',
         body : 'This for deleting the data using http delete in the server'
      }
    }
     
    deleteHandler = () => {
        axios.delete('https://jsonplaceholder.typicode.com/posts/1', this.state)
        .then(response => {
            console.log(response)
        })
    }
  render() {
    return (
      <div>
        <button onClick = {this.deleteHandler}>Delete</button>
      </div>
    )
  }
}

export default DeleteList
