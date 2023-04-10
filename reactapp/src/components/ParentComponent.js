import React, { Component } from 'react'
import ChildComponent from './ChildComponent'
//using this to send a method as a props in child component 
class ParentComponent extends Component {

    constructor(props) {
      super(props)
    
      this.state = {
          parentName : "Parent"
        }
        this.greetingParent = this.greetingParent.bind(this)
    }

    greetingParent(childName){
        alert(`Hello ${this.state.parentName} from your ${childName}`)
    }
    
  render() {
    return (
      <div>
        <ChildComponent greetHandler = {this.greetingParent}></ChildComponent>
      </div>
    )
  }
}

export default ParentComponent
