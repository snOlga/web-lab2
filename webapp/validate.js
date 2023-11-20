function validateY()
{
    var validated = true;
    var y_input = document.getElementById("selectY").value.replace(",", ".");

    if(y_input.trim() == "" || !isFinite(y_input))
    {
        validated = false;
        document.getElementById("yWarning").innerText = "Y cannot be empty!"
    }
    else if(!isFinite(y_input))
    {
        validated = false;
        document.getElementById("yWarning").innerText = "Y must be a number!"
    }
    else if(y_input < -5 || y_input > 3)
    {
        validated = false;
        document.getElementById("yWarning").innerText = "Y is out of [-5,3]!"
    }
    else
    {
        document.getElementById("yWarning").innerText = ""
    }
    return validated;
}