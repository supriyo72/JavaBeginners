let num1= [24,54,65,25,21]

let a= num1.toString()

console.log(a)
console.log(typeof a)

let b= num1.pop()
console.log(b,num1);

let c= num1.push(100)
console.log(c,num1)

let d = num1.shift()
console.log(d,num1)

let e = num1.unshift(65)
console.log(e,num1)

let f = delete num1[4]
console.log(f,num1)
console.log(num1.length)  //length remains same


let num2= [4,2,41,1,5]
let res= num2.join(" & ")
console.log(res)