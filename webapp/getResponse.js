$(document).ready(function () {
    $('#submitForm').submit(function (e) {

        $.ajax({
            method: "POST",
            url: 'ControllerServlet',
            dataType: 'json',
            data: $(this).serialize(),
            success: function (response) {
                if (response != "") {
                    removeData();
                    let arrayData = response;
                    console.log(arrayData);
                    let responseValue;
                    for (let i = 0; i < arrayData.response.length; i++) {
                        responseValue = arrayData.response[i];

                        console.log(responseValue);

                        let allData = [];
                        allData[0] = responseValue.x;
                        allData[1] = responseValue.y;
                        allData[2] = responseValue.r;
                        allData[3] = responseValue.time + "ms";
                        allData[4] = responseValue.result;

                        createTableLine(allData);
                    }
                    if (document.getElementById("point") != undefined) {
                        document.getElementById("point").remove();
                    }
                    drawPoint(responseValue.x,
                        responseValue.y,
                        responseValue.r);

                    // let responseValue = arrayData.response[arrayData.response.length - 1];
                    // let allData = [];
                    // allData[0] = responseValue.x;
                    // allData[1] = responseValue.y;
                    // allData[2] = responseValue.r;
                    // allData[3] = responseValue.time + "ms";
                    // allData[4] = responseValue.result;

                    // createTableLine(allData);
                    // drawPoint(responseValue.x, responseValue.y);
                }
            }
        });
    });
});

var rowID = 0;

function createTableLine(data) {
    let table = document.getElementById('answers');

    let row = table.insertRow(-1);
    row.setAttribute('id', 'row' + rowID);
    rowID++;

    let xCell = row.insertCell(0);
    let yCell = row.insertCell(1);
    let rCell = row.insertCell(2);
    let timeCell = row.insertCell(3);
    let resCell = row.insertCell(4);

    xCell.innerText = data[0];
    yCell.innerText = data[1];
    rCell.innerText = data[2];
    timeCell.innerText = data[3];
    resCell.innerText = data[4];
}


function drawPoint(x, y, r) {
    const point = document.createElementNS('http://www.w3.org/2000/svg', 'circle');
    point.setAttribute('r', '2');
    point.setAttribute('cx', new String(x * 100 + 150));
    point.setAttribute('cy', new String(-(y * 100 - 150)));
    point.setAttribute('fill', 'black');
    point.setAttribute('id', 'point');
    console.log(point);
    document.getElementById('graphic').appendChild(point);

    // point.setAttribute("cx", xCoordinate);
    // point.setAttribute("cy", yCoordinate);
}