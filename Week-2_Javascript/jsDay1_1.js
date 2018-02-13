//Opgave 1
//Observe: no return type, no type on parameters
function add(n1, n2) {
    return n1 + n2;
}

var sub = function (n1, n2) {
    return n1 - n2
}

var times = function (n1, n2) {
    return n1 * n2
}

//Opgave 4
var mul1 = function (n1, n2) {
    return n1 + n2
}

//Opgave 4
var mul2 = function (n1, n2) {
    return n1 - n2
}

/* var cb = function(n1,n2, callback) {
 try {
 throw new MyError();
 return "Result from the two numbers: "+n1+"+"+n2+"="+callback(n1,n2);
 } catch (e) {
 if(n1 !== "number" || n2 !== "number"  || callback !== "function") {
 console.log( e.name + ': ' + e.message );
 }
 }
 }; */


var cb = function (n1, n2, callback) {
    try {
        //Opgave 3
        //Jeg kan ikke få min errorhandler til at fungere korrekt og derfor ikke lave opg. 3.. :S
        //throw new Error('Whoops! Something went wrong.. :S ');
        if (callback === sub || callback === mul2) {
            return "Result from the two numbers: " + n1 + " - " + n2 + " = " + callback(n1, n2);
        }
        if (callback === times) {
            return "Result from the two numbers: " + n1 + " * " + n2 + " = " + callback(n1, n2);
        } else {
            return "Result from the two numbers: " + n1 + " + " + n2 + " = " + callback(n1, n2);
        }
    } catch (e) {
        if (n1 !== "number" || n2 !== "number" || callback !== "function") {
            console.log(e.name + ': ' + e.message);
        }
    }
};

/* function MyError(message) {
 this.name = 'MyError';
 this.message = message || 'Default Message';
 this.stack = (new Error()).stack;
 }; */

//Opgave 2
console.log(add(1, 2));
console.log(add(1, 4));
console.log(add(1, 2, 3));
console.log(add(1));

console.log(cb(3, 3, add));
console.log(cb(3, 4, sub));

//Opgave 4
console.log(cb(3, 3, mul1));
console.log(cb(3, 4, mul2));

//Opgave 5
console.log(cb(10, 2, function (n1, n2) {
    return n1 / n2
}))

console.log(cb(7, 7, times));
console.log(cb(3, 3, add));
console.log(cb(3, "hh", add))

