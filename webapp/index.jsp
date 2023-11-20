<html>

<head>
    <meta charset="utf-8">
    <link rel="icon" type="image/x-icon" href="ico.png">
    <title>2lab</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <div class="navigation">
        <div class="buttons">
            <div class="head">
                Safonova Olga
                <br>
                P3207
            </div>
            <form id="submitForm" method="post" onsubmit="return false">
                <div class="selectors">
                    Select X
                    <select name="selectX" id="selectX">
                        <option value="-3">-3</option>
                        <option value="-2">-2</option>
                        <option value="-1">-1</option>
                        <option value="0">0</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
                </div>
                <div class="selectors">
                    <input type="text" name="selectY" id="selectY" placeholder="Write Y">
                    <div id="yWarning"></div>
                </div>
                <div class="selectors">
                    Select R
                    <select name="selectR" id="selectR">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5" selected>5</option>
                    </select>
                </div>
                <div class="selectors">
                    <div class="actions">
                        <select name="actions" id="actions">
                            <option value="submit">submit</option>
                            <option value="clear">clear</option>
                        </select>
                        <input id="submitButton" type="submit" name="submitButtons" value="do">
                    </div>
                </div>
            </form>
        </div>
        <div class="right">
            <div class="graphic">
                <svg id="graphic" height="300" width="300" xmlns="http://www.w3.org/2000/svg">
 
                    <polygon id="triangle" class="figure" points="150,50 150,150 200,150"></polygon>
                    <polygon id="square" class="figure" points="150,250 150,150 250,150 250,250"></polygon>
                    <path id="round" class="figure" d="M 50 150 C 50 250, 150 250, 150 250 L 150 150 Z"></path>

                    <line stroke="#272829" x1="0" x2="300" y1="150" y2="150"></line>
                    <line stroke="#272829" x1="150" x2="150" y1="0" y2="300"></line>
                    <polygon fill="#272829" stroke="#272829" points="150,0 144,15 156,15"></polygon>
                    <polygon fill="#272829" stroke="#272829" points="300,150 285,156 285,144"></polygon>

                    <line stroke="#272829" x1="200" x2="200" y1="155" y2="145"></line>
                    <line stroke="#272829" x1="250" x2="250" y1="155" y2="145"></line>
                    <line stroke="#272829" x1="50" x2="50" y1="155" y2="145"></line>
                    <line stroke="#272829" x1="100" x2="100" y1="155" y2="145"></line>
                    <line stroke="#272829" x1="145" x2="155" y1="100" y2="100"></line>
                    <line stroke="#272829" x1="145" x2="155" y1="50" y2="50"></line>
                    <line stroke="#272829" x1="145" x2="155" y1="200" y2="200"></line>
                    <line stroke="#272829" x1="145" x2="155" y1="250" y2="250"></line>

                    <!--
                    <text fill="#272829" x="195" y="140">R/2</text>
                    <text fill="#272829" x="250" y="140">R</text>
                    <text fill="#272829" x="40" y="140">-R</text>
                    <text fill="#272829" x="85" y="140">-R/2</text>
                    <text fill="#272829" x="160" y="55">R</text>
                    <text fill="#272829" x="160" y="105">R/2</text>
                    <text fill="#272829" x="160" y="204">-R/2</text>
                    <text fill="#272829" x="160" y="255">-R</text>
                    <text fill="#272829" x="285" y="140">x</text>
                    <text fill="#272829" x="160" y="15">y</text>
                    -->

                    <text class="fives" fill="#272829" x="250" y="170">5</text>
                    <text class="fives" fill="#272829" x="40" y="170">-5</text>
                    <text class="fives" fill="#272829" x="130" y="55">5</text>
                    <text class="fives" fill="#272829" x="130" y="255">-5</text>
                </svg>
            </div>
            <div class="resultDiv">
                <table id="answers">
                    <tr>
                        <th scope="col">X</th>
                        <th scope="col">Y</th>
                        <th scope="col">R</th>
                        <th scope="col">Time</th>
                        <th scope="col">Result</th>
                    </tr>
                    <tbody>
                        
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
<script type="text/javascript" src="onRListener.js"></script>
<script type="text/javascript" src="getCoordinates.js"></script>
<script type="text/javascript" src="validate.js"></script>
<script type="text/javascript" src="subStr.js"></script>
<script type="text/javascript" src="startScript.js"> </script>
<script type="text/javascript" src="getResponse.js"></script>
<script type="text/javascript" src="removeData.js"></script>

</html>
