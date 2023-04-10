import React, { Component } from 'react'
import higherOrderComponent from './higherOrderComponent'

class HoverCounter extends Component {
  render() {
      const {count, incrementCount} = this.props
    return (
      <h1 onMouseOver = {incrementCount}>
        Hovered {count} times
      </h1>
    )
  }
}

export default higherOrderComponent(HoverCounter, 6)
