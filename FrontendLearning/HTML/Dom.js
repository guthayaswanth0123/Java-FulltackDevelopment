
const inputText = document.getElementById("input-id");
const taskbutton = document.getElementById("TaskButton");
const tasklist = document.getElementById("tasklist");

taskbutton.addEventListener("click", () => {
    const tasktext = inputText.value.trim();

    if (tasktext === "") {
        alert("Enter the task");
        return;
    }

    const listitem = document.createElement("li");
    const spanitem = document.createElement("span");

    spanitem.textContent = tasktext;

    const deletebutton = document.createElement("button");
    deletebutton.textContent = "Delete";
    deletebutton.style.color = "red";

    deletebutton.addEventListener("click", () => {
        tasklist.removeChild(listitem);
    });

    listitem.appendChild(spanitem);
    listitem.appendChild(deletebutton);
    tasklist.appendChild(listitem);

    inputText.value = "";
});
