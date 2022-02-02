import { motion } from 'framer-motion';
import { useRef, useEffect, useState } from 'react';

import images from './images';

import './App.css';

function App() {

  const [width, setWidth] = useState(0);
  const slider = useRef();

  useEffect(() => {
    setWidth(slider.current.scrollWidth - slider.current.offsetWidth);
  }, [])

  const allImages = images.map(image => (
    <motion.div key={image} className='imgItem'>
      <img src={image} alt='' />
    </motion.div>)
  );

  return (
    <div className="App">
      <motion.div ref={slider} className='slider' whileTap={{ cursor: 'grabbing' }}>
        <motion.div drag='x' dragConstraints={{ right: 0, left: -width }} className='inner-slider'>
          {allImages}
        </motion.div>
      </motion.div>
    </div>
  );
}

export default App;
