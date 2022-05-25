import React from "react";
import Tarjeta from "./Tarjeta";
import { pokemonData } from "../Data";

const Rock = () => {
    return (
      <div>
        {pokemonData.rock.map((item) => (
          <Tarjeta name={item.pokemonName} avatar={item.avatar} />
        ))}
      </div>
    );
  };
  
  export default Rock;