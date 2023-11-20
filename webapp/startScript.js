window.onload = function () {
    document.getElementById("submitButton").addEventListener("click", submit);
};



const submit = function (event) { if (!validateY()) event.preventDefault(); }