//Opgave 1
var persons = ["Lars", "Jan", "Peter", "Bo", "Frederik"];

var shortlist = persons.filter(function(element, idx){ return element.length <= 3});

persons.forEach(function(entry) {
    console.log(entry);
});

console.log("______________");

shortlist.forEach(function(entry) {
    console.log(entry)
});

console.log("______________");

//Opgave 2
var upperPersons = persons.map(function(x) {
    return x.toUpperCase() 
});

upperPersons.forEach(function(entry) {
    console.log(entry)
});

console.log("______________");

//Opgave 3
var newPersons = ["Lars", "Peter", "Jan", "Ian"]
var list = newPersons.map(function(e) {
    return "<li>" + e + "</li>";
})

list.join('');

console.log(newPersons);
console.log(list);

list.unshift("<ul>");
list.push("</ul>");


list.join('');
console.log(list);

console.log("______________");

//Opgave 4
var cars = [
    { id: 1, year: 1997, make: 'Ford', model: 'E350', price: 3000 },
    { id: 2, year: 1999, make: 'Chevy', model: 'Venture', price: 4900 },
    { id: 3, year: 2000, make: 'Chevy', model: 'Venture', price: 5000 },
    { id: 4, year: 1996, make: 'Jeep', model: 'Grand Cherokee', price: 4799 },
    { id: 5, year: 2005, make: 'Volvo', model: 'V70', price: 44799 }
  ];

console.log(cars);

var cars1999 = cars.filter(function(obj) {
    if(obj.year >= 1999) {
        return obj;
    }
})

var volvoCars = cars.filter(function(obj) {
    if(obj.make === "Volvo") {
        return obj;
    }
})

var carPriceLower5000 = cars.filter(function(obj) {
    if(obj.price <= 5000) {
        return obj;
    }
})

function fCars1999(obj) {
    if(obj.year >= 1999) {
        return obj;
    }
}

function fVolvoCars(obj) {
    if(obj.make === "Volvo") {
        return obj;
    }
}

function fCarPriceLower5000(obj) {
    if(obj.price <= 5000) {
        return obj;
    }
}

var newCars1999 = cars.filter(fCars1999);
var newVolvoCars = cars.filter(fVolvoCars);
var newCarPriceLower5000 = cars.filter(fCarPriceLower5000);

console.log("______________");
console.log(cars1999);
console.log("______________");
console.log(volvoCars);
console.log("______________");
console.log(carPriceLower5000);
console.log("______________");
console.log(newCars1999);
console.log("______________");
console.log(newVolvoCars);
console.log("______________");
console.log(newCarPriceLower5000);
console.log("______________");


var cb = function(callback) {
    return cars.filter(callback);
};

console.log("callback funtion: ");
console.log(cb(fVolvoCars));

//Opgave 4a
var carsArray = cars.map(function(obj) {
   return "INSERT INTO cars (id,year,make,model,price) VALUES ( " + obj.id + ", " + obj.year + " '" + obj.make + "','" + obj.model + "', " + obj.price + " );";
});

console.log("______________");
console.log(carsArray);