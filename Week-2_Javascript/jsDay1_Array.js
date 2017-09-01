//Opgave a
var boys = ["Peter", "lars", "Ole"];
var girls = ["Janne", "hanne", "Sanne"];

//Opgave b
var all = boys.concat(girls);
//console.log(all);

//Opgave c
all.join();
//console.log(all);
all.join('-');
//console.log(all);

//Opgave d
all.push("Lone", "Gitte");
//console.log(all);

//Opgave e
all.unshift("Hans", "Kurt");
//console.log(all);

//Opgave f
//all.shift();
//console.log(all);

//Opgave g
//all.pop();
//console.log(all);

//Opgave h
var outcast = all.splice(4,2);
console.log("Outcast array: " + outcast);
//console.log(all);

//Opgave i
all.reverse();
console.log("Reverse array: " + all);

//Opgave j
all.sort();
console.log("Sorted array: " + all);

//Opgave l
var upperArray = all.map(function(x){
    return x.toUpperCase()
})
console.log("Uppercase array: " + upperArray);

//Opgave m
var newFilterArray = upperArray.filter(function(upperArray) {
    if(upperArray.charAt(0) === "l" || upperArray.charAt(0) === "L") {
        return upperArray;
    }
})
console.log("Filtered array: " + newFilterArray);