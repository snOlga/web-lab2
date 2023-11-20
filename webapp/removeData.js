function removeData()
{
    for(let i = 0; i < rowID; i++)
    {
        document.getElementById("row" + i).remove();
    }
    rowID = 0;
}

$(document).ready(function() {
    $('#submitButton').click(function (e) {
        selectElement = document.getElementById("actions");
        if (selectElement.options[selectElement.selectedIndex].value)
        {
            removeData();
        }
    })
})