import React,{useState} from 'react';
import './App.css';
import HeaderComponent from './components/HeaderComponent';
import TableComponent from './components/TableComponent';

function App() {
  const[inputVal,setInputVal]=useState('');
  /*const handleSearch = ()=>{
    if(){

    }
  };*/
  return (
    <div className="App">
      <div><HeaderComponent/></div>
      <div className="EmpList">Employee List</div>
      <div className='Emptable'>
        <div className='search'><input id="search" type="text" value={inputVal} onChange={e=>setInputVal(e.target.value)} placeholder="  Search..."/></div>
        <TableComponent inputVal={inputVal}/>
      </div>
    </div>
  );
}

export default App;
