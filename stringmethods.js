let name1= "sachin"
let name2= "Pandey"

console.log(name1.toUpperCase())
console.log(name2.toLowerCase())

console.log(name1.slice(2))
console.log(name2.slice(3,6))
console.log(name1.slice(2,4))
console.log(name1.length)

name3= "Supriyo"
console.log(name3.concat(" is a friend of ",name1," ok"))

console.log(name2.replace("Pan","Lun"))
console.log(name2)  //will remain pandey

//strings are immutable
let name4= "       aman  "
console.log(name4.trim())
console.log(name3[3])
console.log(name2[5])
console.log(name1[0])



for(let i=0;i<name1.length;i++)
{
    console.log(name2[i])
}