//window.onload = standardColor();

//document.onload = standardColor();

function standardColor() {
    //alert('test1')
    var i;
    var divElements = document.getElementsByTagName("div");
    for (i = 0; i < divElements.length; i++) {
        
        divElements[i].style.backgroundColor = "blue";
    }

	//document.querySelectorAll("div").style.backgroundColor = "blue";
    
    //document.getElementsByTagName("div")[0].style.backgroundColor = "blue";
    //document.getElementsByTagName("div")[1].style.backgroundColor = "blue";
    //document.getElementsByTagName("div")[2].style.backgroundColor = "blue";
          
    //alert('test2');
}

function divColor() {
    document.getElementById("div1").style.backgroundColor = "red";
    document.getElementById("div2").style.backgroundColor = "yellow";
    document.getElementById("div3").style.backgroundColor = "green";
}