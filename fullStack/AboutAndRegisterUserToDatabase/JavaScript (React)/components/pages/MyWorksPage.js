import './../../styles/pages/MyWorksPage.scss'

const MyWorksPage = (props) => {

  return (
    <section className={props.isOnLight ? 'my_projectSection activeComponent' : 'my_projectSection'}>
      <div className='wrapper'>
        <a href="https://www.google.pl/">
          <div>
            <p>Project2</p>
          </div>
        </a>
        <a href="https://www.google.pl/">
          <div>
            <p>Project3</p>
          </div>
        </a>
      </div>
    </section>
  );
}

export default MyWorksPage;