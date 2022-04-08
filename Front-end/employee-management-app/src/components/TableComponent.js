import React, { useState } from 'react';
import './Table.css';
import { VscThreeBars } from "react-icons/vsc";
import ExpandComponent from './ExpandComponent';

function TableComponent(props){
    const columns = ['UID','First Name','Last Name','Email Id'];
    const datas = [{"UId": "abcd",
            "FirstName": "xyz",
            "LastName": "abcd",
            "EmailId": "abcd"},
            {"UId": "abc",
            "FirstName": "ijk",
            "LastName": "abc",
            "EmailId": "abc"
    }];
    const rowFilter=(field)=>{for(let key in field){
        if(field[key].toLowerCase().includes(props.inputVal.toLowerCase()))
        {
            return true;
        }
    }
    return false;
};
    return (
        <table>
        <thead>
        <tr>{columns.map((column)=>(
              <th>
                  {column}
              </th>))}
              <th></th>
            </tr>
        </thead>
            {datas.map(data =>{
                if(props.inputVal===''||rowFilter(data))
                {
                return(<ExpandComponent {...data}
            />)}})}
      </table>
    );
}
export default TableComponent;