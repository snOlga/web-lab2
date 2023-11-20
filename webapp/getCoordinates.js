function getCoordinates(event) {
    let elementR = document.getElementById("selectR");
    let x = Math.round((Math.round(event.offsetX) - 156) / 100); //* elementR.options[elementR.selectedIndex].value;
    let y = -(Math.round(event.offsetY) - 156)/ 100;
    //* elementR.options[elementR.selectedIndex].value;

    if(x > '5')
    {
        x = '5';
    }
    if(x < -3)
    {
        x = '-3';
    }
    if(y > '3')
    {
        y = '3';
    }
    if(y < '-5')
    {
        y = '-5';
    }
    document.getElementById("selectX").value = x;
    document.getElementById("selectY").value = y;
}

document.getElementById("graphic").addEventListener("click", getCoordinates);