const prompt = require('prompt-sync')();

let num= prompt("Write a number: ");

num= Number.parseInt(num);
if(num%2==0 && num%3==0)
{
    console.log("Number is divisible by 2 and 3");
}
else
{
    console.log("Number is not divisible by 2 and 3");
}