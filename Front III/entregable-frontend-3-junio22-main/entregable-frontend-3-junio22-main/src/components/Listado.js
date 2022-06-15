import React from 'react'
import Item from './Item';
import data from './data.json';
import {Contenedor2} from './ListadoS';

export default function Listado({setCount}) {
  return (
    <Contenedor2 className='contenedor2'>    
      {
        data.map(i => 
        <Item
          key={i.id}
          producto={i}
          setCount={setCount}
        />)
      }
    </Contenedor2>
  )
}
