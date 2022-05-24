const state = {
    personalData: {
        name: "Johnny",
        lastname: "Depp",
        age: 44,
        nationality: "American",
        residence: "France",
        occupation: "Actor / Producer",
        avatar: "https://m.media-amazon.com/images/M/MV5BMTM0ODU5Nzk2OV5BMl5BanBnXkFtZTcwMzI2ODgyNQ@@._V1_.jpg"
    },
    experience: [
        { id: 1, movie: "Pirates of the Caribbean"},
        { id: 2, movie: "Edward Scissors hand"},
        { id: 3, movie: "Johnny Brasco"}
    ],
    education: [
        { id: 1, institute: "University of Arts."},
        { id: 2, institute: "University UCLA"},
        { id: 3, institute: "University of Paris"}
    ],
    bio: "I am a person like everyone else, trying to have a normal life whilst doing the things that make me happy"
}

const Header =()=>{
    return (
        <header className="header">
            <nav className="header_nav">
                <ul className="header_ul">
                    <li className="header_li" >Home</li>
                    <li className="header_li">About</li>
                    <li className="header_li">experience</li>
                    <li className="header_li">Movies</li>
                </ul>
            </nav>
        </header>
    )
};

const Info = ({ name, nationality, age, occupation, avatar})=>{
    return (
        <main className="main">
            <section>
                <h1>Name: {name}</h1>
                <p>Nationality: {nationality}</p>
                <p>Age: {age} years old</p>
                <p>Occupation: {occupation}</p>
            </section>
            <section>
                <img className="imagen"
                    src={avatar} alt="profile picture"/>
            </section>
        </main>
    )
};

const Education = ({ institute })=>{
    return(
        <li className="educacion_li">{institute}</li>
    )
}

const Bio = () => {
    return (
        <p className="bio_p">Bio: {state.bio}</p>
    )
}

const { education } = state;
const App = (
    <div>
        <Header/>
        <Info
            name={state.personalData.name}
            nationality={state.personalData.nationality}
            age={state.personalData.age}
            occupation={state.personalData.occupation}
            avatar={state.personalData.avatar}
        />
        <ul>
            {
                education.map(item =>
                    <Education 
                        key={item.id}
                        institute={item.institute}
                    
                    />
                )
            }
        </ul>
        <Bio/>
    </div>
);

const htmlElement = document.getElementById("root");

ReactDOM.render(App, htmlElement);