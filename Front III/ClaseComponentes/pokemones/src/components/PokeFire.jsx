import React from "react";
import Tarjeta from "./Tarjeta";
import { pokemonData } from "../Data";

const Fire = () => {
    return (
      <div>
        {pokemonData.fire.map((item) => (
          <Tarjeta name={item.pokemonName} avatar={item.avatar} />
        ))}
      </div>
    );
  };
  
  export default Fire;