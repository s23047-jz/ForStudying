
const HomePage = (props) => {

  const educationArticle = {
    margin: '40px auto 0',
    width: '80%',
    height: '12vh',
    backgroundColor: '#FFF89A',
    borderRadius: '20px',
    textAlign: 'center',
  }
  const educationArticle2 = {
    margin: '20px auto 0',
    width: '80%',
    height: '12vh',
    backgroundColor: '#FFF89A',
    borderRadius: '20px',
    textAlign: 'center',
  }

  return (
    <section className={props.isDarkModeOnForComponents} style={{ backgroundColor: '#FFC900', minHeight: '26vh', }}>
      <article style={educationArticle}>
        <h1 style={{ fontSize: '30px' }}>Education</h1>
        <p style={{ fontSize: '15px' }}>Right now I am a second-year student at Polish-Japanese Academy of Information Technology</p>
      </article>
      <article style={educationArticle2}>
        <h1 style={{ fontSize: '30px' }}>Hobbies</h1>
        <p style={{ fontSize: '15px' }}>My the most favorite hobby is creating a websites. Why? I like looking for some animations, some effects, transtions.
          I also likes listing music, playing video games with friends and cooking.
        </p>
      </article>
    </section>
  );
}

export default HomePage;