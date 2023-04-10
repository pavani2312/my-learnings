import React, { Component } from 'react'
//to understand the flow of  Mounting Lifecycle methods 
class ChildOfLifeCycle extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         name : 'Satya'
      }
      console.log('Child LifeCycle Constructor')
    }

    static getDerivedStateFromProps(props, state){
        console.log('Child LifeCycle getDerivedStateFromProps')
        return null;
    }

    componentDidMount(){
        console.log('Child LifeCycle componnetDidMount')
    }

    shouldComponentUpdate(){
        console.log('Child LifeCyle shouldComponentUpdate')
        return true
    }

    getSnapshotBeforeUpdate(prevProps, prevState){
        console.log('Child LifeCyle getSnapshotBeforeUpdate')
        return null
    }

    componentDidUpdate(prevProps, prevState, snapshot){
        console.log('Child LifeCyle componentDidUpdate')
    }
  render() {
    console.log('Child LifeCycle render')
    return (
       <div>Life Cycle's of Child Component</div>
    )
  }
}

export default ChildOfLifeCycle
