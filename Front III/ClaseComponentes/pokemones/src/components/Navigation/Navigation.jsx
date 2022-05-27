const Navigation = ({poke}) => {
    return (
        <div className="botones">
            <button onClick={() => poke(1)} >Fire</button>
            <button onClick={() => poke(2)} >Water</button>
            <button onClick={() => poke(3)} >Rock</button>
            <button onClick={() => poke(4)} >Electric</button>
        </div>
    );
}

export default Navigation;