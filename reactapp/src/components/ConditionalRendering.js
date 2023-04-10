import React, { Component } from 'react'

export class ConditionalRendering extends Component {
    constructor(props) {
        super(props)
        this.state = {
            isLoggedIn: true
        }
    }

    render() {
        //4.Short circuit Operator
        return this.state.isLoggedIn && <div>Welcome Satya</div>

        //3.Ternary Operator 
        // return (
        //     this.state.isLoggedIn ? <div>Welcome Satya</div> : <div>Welcome Guest</div>
        // )
        //2.Element variable
        // let message
        // if (this.state.isLoggedIn) {
        //     message = <div>Welcome Satya</div> 
        // }else{
        //     message = <div>Welcome Guest</div> 
        // }
        // return(
        //     <div>{message}</div>
        // )
        //1.If-else()
        // if (this.state.isLoggedIn) {
        //     return <div>Welcome Satya</div> 
        // }else {
        //     return <div>Welcome Guest</div> 
        // }

    }
}

export default ConditionalRendering
