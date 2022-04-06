// const { test, expect } = require("@jest/globals");
const { describe } = require("yargs");
const {suma, resta, multiplicacion, division} = require("../calculadora");

 
test("Suma de números enteros", () =>{
    expect(suma(1,2)).toBe(3);
})

test("Suma de números negativos", () =>{
    expect(suma(-1,-2)).toBe(-3);
})

test("Suma no númerica", () =>{
      expect(suma("f","c")).toBe(0);
})

test("Resta de números enteros", () =>{
     expect(resta(2,1)).toBe(1);
})

test("Resta de textos", () =>{
    expect(resta("hola","daiana")).toBe(0);
})

test("Multiplicación de textos", () =>{
    expect(multiplicacion("hola","daiana")).toBe(0);
})

test("Multiplicación de numeros enteros", () =>{
    expect(multiplicacion(3,1)).toBe(3);
})

test("Multiplicación de numeros negativos", () =>{
    expect(multiplicacion(-3,-1)).toBe(3);
})

test("Division de numeros enteros", () =>{
    expect(division(4,1)).toBe(4);
})

test("Division de textos", () =>{
    expect(division("Hola","mundo")).toBe(0);
})