import React from 'react'
import {UserContext, ChannelContext}  from '../App'
function ComponentC() {
  return (
    <div>
     <UserContext.Consumer>
      {
        user => {
         return (
          <ChannelContext.Consumer>
            {
              channel => {
                return (<div>user context value {user}, channel context value {channel}</div>)
                         }
            }
          </ChannelContext.Consumer>
                 )}
        }
        </UserContext.Consumer>
    </div>)
}

export default ComponentC
