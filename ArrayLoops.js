let num1= [23,45,75,64,34,86,23,5]

for(let i=0;i<num1.length;i++)
{
    console.log(num1[i])
}

// for-in
// for(let element in num1)
// {
//     console.log("Element: ",num1[element])
// }

//for each
let fe= num1.forEach((element) =>{
    console.log(element*element)
}) 
// console.log(fe)  //undefined

//for of
let num2=[1,3,5,45]
for(let result of num2)   //if i use IN instead of OF my o/p would be 0,1,2,3 (keys)
{
    console.log(result)  
}


//Array-from
let name1= "supriyo"

let arr = Array.from(name1)
console.log(arr)

