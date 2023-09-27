// function avg(x,y,z)
// {
//     return (x+y+z)/2;
// }

// let a=10;
// let b=20;
// let c=45;

// console.log("Average is "+avg(a,b,c));


function avg(x,y)
{
    let result= Math.round((x+y)/2);
    return result;
}
let m1=20;
let n1=45;

console.log("Average is "+avg(m1,n1));

function random()
{
    console.log("Hello bois");
}

let a=10;
let b=5;
let c=4;
console.log("Average is "+avg(a,b));
console.log("Average is "+avg(b,c));
console.log("Average is "+avg(c,a));
random();

// preferred function to be used

const sum = (p,q,r) =>
{
    return p+q+r;
}
const nil = () =>
{
    console.log("Hii guyzz");
}

let l=10;
let m=5;
let n=4;
console.log("Sum is "+sum(l,m,n));
nil();


const movie = () =>
{
    console.log("Hii SRK");
    return "jawan";
}
let z= movie();
console.log(z);



const sub = (r,s,t) =>
{
    let subt= r-s-t
    return subt;
}
let r1=45;
let s1=20;
let t1= 2;
console.log("Subtract is "+sub(r1,s1,t1));


