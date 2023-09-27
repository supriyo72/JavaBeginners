// for(let i=0;i<6;i++)
// {
//     console.log(i);
// }

const prompt= require('prompt-sync')()
let n= prompt("Enter the value of n: ")
n= Number.parseInt(n)
let sum=0

for(let i=1;i<=n;i++) 
{
    sum+=i
}
console.log(sum)
// console.log(i)  //ERROR....but if we use var we get i=5 


// for-in

let obj=
{
    aman: 25,
    harry: 45,
    supriyo: 78,
    raman: 24
}

for(let res in obj)
{
    console.log("The marks of "+res+" is "+obj[res])
}

//for-of

let name1= "Supriyo"
for(let result of name1)
{
    console.log(result)
}

