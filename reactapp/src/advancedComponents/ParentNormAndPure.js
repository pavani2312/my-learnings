import React, { Component } from 'react'
import NormalComp from './NormalComp'
import PureComp from './PureComp'
import ReactMemo from './ReactMemo'

class ParentNormAndPure extends Component {
  constructor(props) {
    super(props)
  
    this.state = {
       name: 'Satya'
    }
  }
  componentDidMount() {
		setInterval(() => {
			this.setState({
				name: 'Satya'
			})
		}, 2000)
	}
  render() {
    console.log('*********************PARENT COMPONENT*********************')
    return (
      <div>
         ParentComponent
         <ReactMemo name = {this.state.name}></ReactMemo>
         {/* <NormalComp name = {this.state.name}></NormalComp> 
         <PureComp name = {this.state.name}></PureComp> */}
      </div>
    )
  }
}

export default ParentNormAndPure
