import React, { Component } from 'react'

class FormComponent extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         userName : '',
         comments : '',
         topic : 'react'
      }
    }
    handlerUserName = (event) =>{
        this.setState ({
            userName : event.target.value
        })   }
    handlerComments = (event) =>{
        this.setState ({
            comments : event.target.value
        })   }
    handlerTopics = (event) =>{
         this.setState ({
            topic : event.target.value
        })   }   
    handlerSubmit = (event) =>{
        alert(`${this.state.userName} ${this.state.comments} ${this.state.topic}`)
        event.preventDefault()
    }
    render() {
    return (
     <form onSubmit = {this.handlerSubmit}>   
         <div>
             <label>UserName</label>
             <input type = 'text' value = {this.state.userName} onChange ={this.handlerUserName} />
         </div>
         <div>
             <label>Comments</label>
             <textarea  value = {this.state.comments} onChange ={this.handlerComments} />
         </div>
         <div>
             <label>Topics</label>
             <select value = {this.state.topic} onChange ={this.handlerTopics} >
                 <option value = 'react'>React</option>
                 <option value = 'angular'>Angular</option>
                 <option value = 'Vue'>Vue</option>
             </select>
         </div>
         <button type ='submit'>Submit</button>
     </form>
    )
  }
}

export default FormComponent
