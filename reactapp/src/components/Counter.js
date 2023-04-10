import React, { Component } from 'react' //shortcut to get the default body is rec

export class Counter extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         count : 0
      }
    }
    incrementing(){
        // this.setState({
        //     count : this.state.count + 1
        // },
        // () => {console.log('Callback Value :' +this.state.count)}
        // )
        this.setState(prevState => ({
            count: prevState.count + 1}))
    }

    incrementFive(){
        this.incrementing()
        this.incrementing()
        this.incrementing()
        this.incrementing()
        this.incrementing()
    }
    
  render() {
    return (
      <div>
          <h2>Count - {this.state.count}</h2>
      <button onClick ={() => this.incrementFive()}>Increment</button>
      </div>
    )
  }
}

export default Counter
