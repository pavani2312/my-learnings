import React, {Component} from 'react'
//using this to show the state usage
class Welcome extends Component{
    constructor (){
        super()
        this.state = {
            message : "Welcome To React JS" //dont use "=" 
        }
    }

    ChangeMessage()  {
        this.setState({
            message : "Thanks for Clicking on this button"
        })
    }
    render(){
        return (
        <div>
        <h1>{this.state.message}</h1>
        <button onClick = {() =>this.ChangeMessage()}>Subscribe</button>
        </div>
        )
    }
}
export default Welcome