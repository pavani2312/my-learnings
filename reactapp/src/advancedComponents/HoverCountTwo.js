import React, { Component } from 'react'
// For Render Props
export class HoverCountTwo extends Component {
  render() {
    const {count, incrementCount} = this.props
    return (
        <h1 onMouseOver={incrementCount}>
        Hovered {count} times
      </h1>
    )
  }
}

export default HoverCountTwo
