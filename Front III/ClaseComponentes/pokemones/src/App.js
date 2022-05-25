import './App.css';
import Navigation from './components/Navigation/Navigation';
import {useState} from 'react';
import Electric from './components/PokeElectric';
import Fire from './components/PokeFire';
import Water from './components/PokeWater';
import Rock from './components/PokeRock';

function App() {
  const [poke, setPoke] = useState('pokemon');

  const handlerPoke = (num) => {
    if(num === 1) {
      setPoke(<Fire />)
    } else if(num === 2) {
      setPoke(<Water />)
    } else if(num === 3) {
      setPoke(<Rock />)
    } else if(num === 4) {
      setPoke(<Electric />)
    }
  }
  
  return (
    <div className="App">
      <Navigation poke={handlerPoke} />
      {
        poke
      }
    </div>
  );
}

export default App;
