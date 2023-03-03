body {
    background-color: #83388f;
    text-align: center;
    
}

table {
    margin: 150px 600px;
    background-color: #be2cdb;
    width: 295px;
    height: 325px;
    text-align: center;
    border-radius: 4px;
}

#calculator {
    position: absolute;
    text-align: center;
    max-width: 60%;
    left: 58%;
    top: 10%;
}

input {
    outline: 0;
    position: relative;
    left: 5px;
    top: 5px;
    border: 0;
    color: #000000;
    background-color: rgb(39, 202, 213);
    border-radius: 4px;
    width: 60px;
    height: 50px;
    float: left;
    margin: 5px;
    font-size: 20px;
    box-shadow: 0 4px rgba(206, 72, 72, 0.2);
}

input:hover {
    border: 0 solid #000;
    color: #3196b1;
    background-color: #5b5b5b;
    border-radius: 4px;
    width: 60px;
    height: 50px;
    float: left;
    margin: 5px;
    font-size: 20px;
    box-shadow: 0 4px #644294;
}

input:active {
    top: 4px;
    border: 0 solid #000;
    color: #495069;
    background-color: #8F5FD4;
    border-radius: 4px;
    width: 60px;
    height: 50px;
    float: left;
    margin: 5px;
    font-size: 20px;
    box-shadow: none;
}

#answer {
    width: 270px;
    font-size: 26px;
    text-align: center;
    background-color: #F1FAEB;
    float: left;
}

#answer:hover {
    width: 270px;
    font-size: 26px;
    text-align: center;
    background-color: #F1FAEB;
    box-shadow: 0 4px rgba(0, 0, 0, 0.2);
}

#answer:active {
    top: 5px;
    width: 270px;
    font-size: 26px;
    text-align: center;
    background-color: #88ee44;
    box-shadow: 0 4px rgba(0, 0, 0, 0.2);
}

.operator {
    background-color: #1d2538;
    position: relative;
}

.operator:hover {
    background-color: #df67df;
    box-shadow: 0 4px #df67df;
}

.operator:active {
    top: 4px;
    box-shadow: none;
}

#clear {
    float: left;
    position: relative;
    display: block;
    background-color: #0b0d8a;
    margin-bottom: 15px;
}

#clear:hover {
    float: left;
    display: block;
    background-color: #0b0d8a;
    margin-bottom: 15px;
    box-shadow: 0 4px #0b0d8a;
}

#clear:active {
    float: left;
    top: 4px;
    display: block;
    background-color: #0b0d8a;
    margin-bottom: 15px;
    box-shadow: none;
}