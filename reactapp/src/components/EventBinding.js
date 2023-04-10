import React, { Component } from 'react'
//Four types of event binding
export class EventBinding extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         message : 'Hello!' 
      }
      //this.clickHandler = this.clickHandler.bind(this)
    }
    // clickHandler(){
    //     this.setState({
    //         message : 'Good Bye!!' 
    //     })
    //     console.log(this)
    // }
    clickHandler = () => {
        this.setState ({
            message : 'Good Bye!'
        })
    }
    
  render() {
    return (
      <div>
          {/* Approach 1 */}
         <div>{this.state.message}</div>
        {/* <button onClick = {this.clickHandler.bind(this)}>Submit</button>  */}
        {/* Approach 2 
        <button onClick = {() => this.clickHandler()}>Submit</button>*/}
        {/* Approach 3 usng constructor binding (imp)
         <button onClick = {this.clickHandler}>Submit</button> */}
         {/* Approach 4 by creating a arrow function in class */}
         <button onClick = {this.clickHandler}>Submit</button>
      </div>
    )
  }
}

export default EventBinding
