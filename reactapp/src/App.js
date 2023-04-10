//import logo from './logo.svg';
import './App.css';
import Name from './components/Name'
import ClassComp from './components/ClassComp'
import Welcome from './components/Welcome'
import Counter from './components/Counter'
import FunctionClick from './components/FunctionClick';
import ClassClick from './components/ClassClick';
import EventBinding from './components/EventBinding';
import ParentComponent from './components/ParentComponent';
import ConditionalRendering from './components/ConditionalRendering';
import ListRendering from './components/ListRendering';
import Styling from './components/Styling';
import styles from './components/Styling.module.css'
import FormComponent from './components/FormComponent';
import ParentOfLifeCycle from './components/ParentOfLifeCycle';
import TableFragments from './advancedComponents/TableFragments';
import ParentNormAndPure from './advancedComponents/ParentNormAndPure';
import RefsDemo from './advancedComponents/RefsDemo';
import ParentRef from './advancedComponents/ParentRef';
import ReactPortal from './advancedComponents/ReactPortal';
import Handler from './advancedComponents/Handler';
import ErrorHandling from './advancedComponents/ErrorHandling';
import ClickCounter from './advancedComponents/ClickCounter';
import HoverCounter from './advancedComponents/HoverCounter';
import CounterTwo from './advancedComponents/CounterTwo';
import HoverCountTwo from './advancedComponents/HoverCountTwo';
import ClickCountTwo from './advancedComponents/ClickCountTwo';
import ComponentA from './contextComponents/ComponentA';
import { UserProvider } from './contextComponents/userContext';
import GetList from './httpComponents/GetList';
import PostList from './httpComponents/PostList';
import PutList from './httpComponents/PutList';
import DeleteList from './httpComponents/DeleteList'
function App() {
   return (
      <div className="App">
         <DeleteList/>
         {/*<PutList/>
          <PostList/>
         <GetList/>
        <UserProvider value = "Satya">
         <ComponentA/>
         </UserProvider>
          <CounterTwo render = {(count, incrementCount) => 
               <HoverCountTwo
                  count={count}
                  incrementCount={incrementCount}></HoverCountTwo>}>
      </CounterTwo>
      <CounterTwo render = {(count, incrementCount) => 
               <ClickCountTwo
                  count={count}
                  incrementCount={incrementCount}></ClickCountTwo>}>
      </CounterTwo> 
         <ClickCounter name = 'Satya'/>
         <HoverCounter/>
         <ErrorHandling>
            <Handler heroName="Superman" />
         </ErrorHandling>
         <ErrorHandling>
            <Handler heroName="Batman" />
         </ErrorHandling>
         <ErrorHandling>
            <Handler heroName="Joker" />
         </ErrorHandling>
         <ReactPortal/>
          <ParentRef/>
         <RefsDemo/>
         <ParentNormAndPure/>
           <TableFragments/>  */}
         {/*<ParentOfLifeCycle/>
           <FormComponent/>
           <h1 className = {styles.success}>Success</h1>
           <Styling/>
           <ListRendering/>
           <ConditionalRendering/>
           <ParentComponent/>
           <EventBinding/>
           <FunctionClick/>
           <ClassClick/>
           <Counter></Counter>
           <Name name = "Ravi" >
              <p>This is for dynamic data usage</p>
           </Name>
           <Name name = "Rahul">
              <button>Submit</button>
           </Name>
           <Name name = "Ram">
              <div>This is a Div Tag</div>
           </Name>
           <ClassComp/> 
           <Welcome></Welcome>*/}
      </div>
   )
}
export default App;
