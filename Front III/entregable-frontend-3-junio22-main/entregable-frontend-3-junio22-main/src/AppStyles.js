import styled from "styled-components";

export const Contenedor = styled.div`
  min-height: 100vh;
  position: relative;
  .page {
    position: absolute;
    transition: all 1s ease;
    top: 0%;
    left: 0;
    width: 100%;
    height: 100%;
    background-color: #16537e;
    opacity: 0.8;
  }
  .shop {
    transition: all 1s ease;
    position: absolute;
    top: 0;
    left: 0;
    z-index: 2;
  }
}
`;