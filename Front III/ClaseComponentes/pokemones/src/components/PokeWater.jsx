import React from "react";
import Tarjeta from "./Tarjeta";
import { pokemonData } from "../Data";

const Water = () => {
    return (
      <div>
        {pokemonData.water.map((item) => (
          <Tarjeta name={item.pokemonName} avatar={item.avatar} />
        ))}
      </div>
    );
  };
  
  export default Water;