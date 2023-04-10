import React, { Component } from 'react'
import axios from 'axios'

class GetList extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         listGet : [],
         errorMsg : ''
      }
    }
    
    componentDidMount(){
        axios.get('https://jsonplaceholder.typicode.com/posts')
        .then(response => {
            this.setState({listGet : response.data})
        })
        .catch(error => {
            this.setState({errorMsg : 'Error Retrieving the data'})
        })
    }
  render() {
      const {listGet, errorMsg} = this.state
    return (
      <div>
        List Of Posts
        {
           listGet.length ? listGet.map(list => <div key = {list.id}>{list.title}</div>) : null
        }
        {
            errorMsg ? <div>{errorMsg}</div> : null
        }

      </div>
    )
  }
}

export default GetList
