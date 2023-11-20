let field = document.getElementById('selectY');

field.oninput = function()
{
    this.value = this.value.substr(0,17);
}