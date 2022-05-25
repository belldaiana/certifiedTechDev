import React from "react";
import Tarjeta from "./Tarjeta";
import { pokemonData } from "../Data";

const Electric = () => {
    return (
      <div>
        {pokemonData.electric.map((item) => (
          <Tarjeta name={item.pokemonName} avatar={item.avatar} />
        ))}
      </div>
    );
  };
  
  export default Electric;