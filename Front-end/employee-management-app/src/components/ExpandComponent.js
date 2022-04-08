import React from 'react';
import {useState} from 'react';
import {HiPlus} from "react-icons/hi";
import {HiMinus} from "react-icons/hi";
import profilePic from "../resources/download2.png"
import './Row.css';


function ExpandComponent(props){
    const[count, setCount]=useState(false);
    return (
            <tbody>
        <tr className='previewRow'>
            <td>
                {props.UId}
            </td>
            <td>
                {props.FirstName}
            </td>
            <td>
                {props.LastName}
            </td>
            <td>
                {props.EmailId}
            </td>
            <td className="expandButton">
        <button onClick={()=>setCount(!count)}>{count?(<HiMinus/>):(<HiPlus/>)}</button>
        </td>
        </tr>
        {count && <tr className='expand'>
            <td colspan="5">
                <div>
                    <div className='image'><img src={profilePic} width="250px" height="200px"/></div>
            <div className='details'><span className='firstName'><b>First Name: </b>{props.FirstName}</span>
            <span className='lastName'><b>Last Name: </b>{props.LastName}</span><br/>
            <span className='Tech'><b>Technology: </b>Java, React</span>
            </div>
            </div>
            </td>
        </tr>}
        </tbody>);
}
export default ExpandComponent;