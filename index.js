const alert= require('alert');
const prompt= require('prompt-sync')();

let age= prompt("What's your age");
age= Number.parseInt(age);  //converting string to number
if(age<0)
{
    alert("This is a Invalid age");
}
else if(age>0 && age<=10)
{
    alert("You are not an adult to drive");
}
else if(age>10 && age<=17)
{
    alert("You are not grown up to drive");
}
else
{
    alert("You are an adult to drive");
}

console.log(typeof age);
console.log("Done");
//Ternary
console.log("you can ", (age<18)? "Not drive":"Drive");



    
        