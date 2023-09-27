//concat
let num1= [25,86,48,2,56,65]
let num2=[651,455,412,755,444]

// let res = num1.concat(num2)
// console.log(res)

// let num= [1,2,3]
// let conc= num.concat(num1,num2)
// console.log(conc)


//sort
let num3= [451,124,10,56,34,75,852,85,82,98,999]
let sortres= num3.sort();  //will sort alphabetically
console.log(num3)
// console.log(sortres) //same o/p




//compare method-> asc&desc
let compare =(a,b) =>
{
    return a-b  //will sort ascending
    //return b-a  //will sort descending
}
let sortRes= num3.sort(compare)
// console.log(sortRes)   //same o/p
console.log(num3)


//reverse
num3.reverse()
console.log(num3)


//splice&slice

// splice: start,count of nos i.e 2,no1,no2

let deletedvalues= num3.splice(3,2,1000,2000)
console.log(num3)
console.log(deletedvalues)