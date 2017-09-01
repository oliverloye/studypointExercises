/* var msgPrinter = function(msg,delay){
    setTimeout(function(){
    console.log(msg);
    },delay);
};
console.log("aaaaaaaaaa");
msgPrinter ("bbbbbbbbbb",2000);
console.log("dddddddddd");
msgPrinter ("eeeeeeeeee",1000);
console.log("ffffffffff");

msgPrinter("result order: a,d,f,e,b",3000); */

//Opgave 1
function Person(name){
    this.name = name;
    console.log("Name: "+ this.name);
    setTimeout(function(){
        console.log("Hi  "+this.name);  //Explain this
    },2000);
}
//call it like this (do it, even if you know it’s silly ;-)
Person("Kurt Wonnegut");  //This calls the function
console.log("I'm global: "+ name);  //Explain this
