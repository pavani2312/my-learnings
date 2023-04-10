import React, {useReducer} from 'react';
import { unmountComponentAtNode } from 'react-dom';
import './App.css';
import HookTimerUsingUseRef from './callbackComponents/HookTimerUsingUseRef';
import ParentComponent from './callbackComponents/ParentComponent';
import UseMemo from './callbackComponents/UseMemo';
import UseRefForFocus from './callbackComponents/UseRefForFocus';
import DataFetchigUsingUseEffect from './components/DataFetchigUsingUseEffect';
import PrevStateHook from './components/PrevStateHook';
import UseEffectForCleanUp from './components/UseEffectForCleanUp';
import UseEffecthook from './components/UseEffecthook';
import UseEffectMousePointer from './components/UseEffectMousePointer';
import UseEffectUsingADependency from './components/UseEffectUsingADependency';
import UseEffectWithSecondArrayAsParameter from './components/UseEffectWithSecondArrayAsParameter';
import UseStateHook from './components/UseStateHook';
import UseStateUsingArrays from './components/UseStateUsingArrays';
import UsingSpreadInHooks from './components/UsingSpreadInHooks';
import CountIncrement from './customComponents/CountIncrement';
import CountTitleUpdate from './customComponents/CountTitleUpdate';
import InputFile from './customComponents/InputFile';
import ComponentA from './reducerComponents/ComponentA';
import ComponentB from './reducerComponents/ComponentB';
import ComponentC from './reducerComponents/ComponentC';
import DataFetchingUsinguseReducer from './reducerComponents/DataFetchingUsinguseReducer';
import UseReducerWithSimpleStateAndAction from './reducerComponents/UseReducerWithSimpleStateAndAction';
import UseReducerWithStateAndActionAsObject from './reducerComponents/UseReducerWithStateAndActionAsObject';



export const UserContext = React.createContext() //these must be defined on top of the function 
export const ChannelContext = React.createContext()
const initialState = 0
const reducer = (state, action) => {
    switch (action) {
        case 'increment':
            return state + 1
        case 'decrement':
            return state - 1
        case 'reset':
            return initialState
        default:
            return state

    }
}
export const CountContext = React.createContext()


function App() {
  const [count, dispatch] = useReducer(reducer, initialState)
  return (
    <div className="App">
     <InputFile/>
    </div>
   );
}

export default App;
 {/*
   <CountIncrement/>
  <CountTitleUpdate/>
   <HookTimerUsingUseRef/>
  <UseRefForFocus/>
  <UseMemo/>
   <ParentComponent/>
        <DataFetchingUsinguseReducer/>
        <CountContext.Provider value = {{countState :count, countDispatch: dispatch}}>
      <div className="App">
         <ComponentA/>
         <ComponentB/>
         <ComponentC/>
         </div>
      </CountContext.Provider>
      <UseReducerWithStateAndActionAsObject/>
      <UseReducerWithSimpleStateAndAction/>
      <UserContext.Provider value = {'Satya'}>
        <ChannelContext.Provider value = {'Pavani'}>
        <ComponentA/>
        </ChannelContext.Provider>
       </UserContext.Provider>
       /------------------------/
        <DataFetchigUsingUseEffect/>
        <UseEffectUsingADependency/>
        <UseEffectForCleanUp/>
        <UseEffectMousePointer/>
        <UseEffectWithSecondArrayAsParameter/>  
       <UseEffecthook/>
       <UseStateUsingArrays/>
       <PrevStateHook/>
      <UsingSpreadInHooks/>
      <UseStateHook/> */}
