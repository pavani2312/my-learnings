import React, { Component } from 'react'
import ChildOfLifeCycle from './ChildOfLifeCycle'
//to understand the flow of  Mounting Lifecycle methods 
class ParentOfLifeCycle extends Component {
    constructor(props) {
      super(props)
      this.state = {
         name : 'Satya'
      }
      console.log('Parent LifeCycle Constructor')
    }

    static getDerivedStateFromProps(props, state){
        console.log('Parent LifeCycle getDerivedStateFromProps')
        return null
    }

    componentDidMount(){
        console.log('Parent LifeCycle componnetDidMount')
    }

    shouldComponentUpdate(){
        console.log('Parent LifeCyle shouldComponentUpdate')
        return true
    }

    getSnapshotBeforeUpdate(prevProps, prevState){
        console.log('Parent LifeCyle getSnapshotBeforeUpdate')
        return null
    }

    componentDidUpdate(prevProps, prevState, snapshot){
        console.log('Parent LifeCyle componentDidUpdate')
    }

    changeState = () => {
        this.setState({
            name : 'Reactcode'
        })
    }
    render() {
     console.log('Parent LifeCycle render')
    return (
      <div>
        <div>Life Cycle's of Parent Component</div>
        <button onClick = {this.changeState}>Change State</button>
        <ChildOfLifeCycle/>
      </div>
    )
  }
}
export default ParentOfLifeCycle
