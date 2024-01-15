# Courses and certifications 🚀

I use this repository as a central archive where I compile all the courses I've completed, along with the projects associated with each and their certifications. 

Here you will find a variety of topics, from web development to data science, reflecting my journey of learning and professional growth.


<div align="center">
  <div class="slider-container">
      <div class="slider">
          <div class="slide"><img src="certifications/backendApis.PNG"></div>
          <div class="slide"><img src="certifications/javascriptAlgorithms.PNG"></div>
          <div class="slide"><img src="certifications/responsiveWebDesign.PNG"></div>
      </div>
  </div>
</div>

<script>
    let currentSlide = 0;

    const certificates = [
        "certifications/backendApis.PNG",
        "certifications/javascriptAlgorithms.PNG",
        "certifications/responsiveWebDesign.PNG"
    ];

    function nextSlide() {
        currentSlide = (currentSlide + 1) % certificates.length;
        showSlide(currentSlide);
    }

    function showSlide(index) {
        const slideElement = document.getElementById('certificate-slide');
        slideElement.innerHTML = `<img src="${certificates[index]}" alt="Certificate ${index + 1}">`;
        currentSlide = index;
    }

    setInterval(nextSlide, 3000); // Cambia de imagen cada 3 segundos, ajusta según tus preferencias
</script>

