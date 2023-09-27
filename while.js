const prompt= require('prompt-sync')()
let n= prompt("Enter the value of n: ")
n= Number.parseInt(n)

//while
// let i=0;
// while(i<n)
// {
//     console.log(i);
//     i++;
// }


//do while

let i=0;
do
{
    console.log(i);
    i++;
}while(i<n)