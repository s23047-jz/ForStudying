const clickedImg = document.querySelector('.clickedImg');
const smallImgs = document.querySelectorAll('.gallery img');
const originalImgs = document.querySelector('.clickedImg-fullImg')
const imgText = document.querySelector('.imgName')

smallImgs.forEach(smallImg => {
  smallImg.addEventListener('click', () => {
    clickedImg.classList.add('open');
    originalImgs.classList.add("open");

    const originalSrc = smallImg.getAttribute('data-original');
    originalImgs.src = originalSrc;
    const altText = smallImg.alt
    imgText.textContent = altText;
  })
})

clickedImg.addEventListener('click', event => {
  if (event.target.classList.contains('clickedImg')) {
    clickedImg.classList.remove('open');
    originalImgs.classList.remove("open");
  }
})