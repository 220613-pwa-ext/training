let btn1 = document.getElementById('btn-1');

btn1.addEventListener('click', () => {
    if (Math.random() < 0.5) {
        alert('alert pop-up');
    }
})