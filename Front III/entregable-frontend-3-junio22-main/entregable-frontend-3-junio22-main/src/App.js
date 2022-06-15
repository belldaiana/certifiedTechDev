import { useState } from "react";
import Cabecera from "./components/Cabecera";
import Listado from "./components/Listado";
import GlobalStyle from './Styles';
import { Contenedor } from './AppStyles';

function App() {
  const [count, setCount] = useState(0);

  return (
    <Contenedor className="App">
      <GlobalStyle />
      <div className="page">
      </div>
      <div className="shop">
        <Cabecera count={count} />
        <Listado setCount={setCount} />
      </div>
    </Contenedor>
  );
}

export default App;
