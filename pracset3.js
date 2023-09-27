//1
let marks = 
{
    "Aman" : 45,
    Raj: 34,
    Kalpesh: 65
}

// for(let key in marks)
// {
//     console.log("The marks of "+key+" is "+marks[key])
// }

//2
for(let i=0;i<Object.keys(marks).length;i++)
{
    console.log("The marks of "+(Object.keys(marks))[i]+" is "+marks[(Object.keys(marks))[i]])
}

//3- print till u guess correct no:
// const prompt= require('prompt-sync')()
// let ans= 15
// let i=prompt("Enter a number")
// while(i!=ans)
// {
//     console.log("Try again");
//     i= prompt("Enter a number")
// }
// console.log("Correct Answer")



// const prompt= require('prompt-sync')()
// let ans= 15
// let i
// while(i!=ans)
// {
//     console.log("Try again");
//     i= prompt("Enter a number")
// }
// console.log("Correct Answer")




// const prompt= require('prompt-sync')()
// let ans= 15
// let i=0
// while(i!=ans)
// {
//     console.log("Try again");
//     i= prompt("Enter a number")
// }
// console.log("Correct Answer")


//4-mean

const mean = (p,q,r,s) =>
{
    // let res = (p+q+r+s)/4;
    // return res;
    return (p+q+r+s)/4;
}
let a=54;
let b=51;
let c=24;
let d=21;

console.log(mean(a,b,c,d))