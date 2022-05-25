import React from 'react';

const Tarjeta = (props) => {
    return (
        <div>
            <h1>{props.name}</h1>
            <img src={props.avatar}  alt=""/>
        </div>
    );
}

export default Tarjeta;