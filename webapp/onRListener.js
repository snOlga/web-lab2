let fieldR = document.getElementById('selectR');

let triangle = document.getElementById('triangle');
let square = document.getElementById('square');
let round = document.getElementById('round');

fieldR.onchange = function()
{
    let rValue = fieldR.value;
    let numValue = parseInt(rValue);

    //figures
    let stringForTriangle = "150," + new String(150-20*numValue) + " 150,150 " + new String(10*numValue+150) +",150";
    let funcForSqyare = new String(20*numValue + 150);
    let stringForSquare = "150," + funcForSqyare + " 150,150 " + funcForSqyare + ",150 " + funcForSqyare + "," + funcForSqyare;
    let stringForRound = "M " + new String(150-20*numValue) + " 150 " + 
                        "C " + new String(150-20*numValue) + " "
                            + funcForSqyare + ", 150 " +  funcForSqyare + ", 150 " + funcForSqyare + 
                        "L 150 150 Z";

    triangle.setAttribute("points", stringForTriangle);
    square.setAttribute("points", stringForSquare);
    round.setAttribute("d", stringForRound);
}