function toggleText() {
    let text = document.getElementById("text");
    let button = document.getElementById("toggleBtn");

    if (text.style.display === "none") {
        text.style.display = "block";
        button.textContent = "Hide Text";
    } else {
        text.style.display = "none";
        button.textContent = "Show Text";
    }
}