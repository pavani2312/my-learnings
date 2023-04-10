import React, { Component } from 'react'
import higherOrderComponent from './higherOrderComponent'

class ClickCounter extends Component {
  render() {
    const {count, incrementCount} = this.props
    return (
      <button onClick = {incrementCount}>
        {this.props.name} Clicked {count} times
      </button>
    )
  }
}

export default higherOrderComponent(ClickCounter, 10)
