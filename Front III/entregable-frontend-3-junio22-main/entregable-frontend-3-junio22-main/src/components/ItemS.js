import styled from "styled-components";

export const Producto = styled.div`
  border: 1px solid;
  padding: 25px 25px;
  width: 35%;
  border-radius: 10px;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  gap: 10px;
  h3 {
    text-align: center;
  }
  .stock {
    background-color: #000;
    padding: 3px;
    font-weight: bolder;
    color: #2986cc;
    border-radius: 5px;
  }
  button {
    padding: 10px 0;
    text-transform: uppercase;
    font-weight: normal;
  }
  .agotado {
    background-color: #00000;
    color: #000;
  }
  .comprar {
    border: none;
    color: #000;
    background-color: #2986cc;
    :hover{
      background: linear-gradient(45deg, #6a90ac 100%, transparent);
    }
`;