/*
var can be re-declared,change and repeat whereas let cannot be
never use var
*/

var a=10;
var a="aman";
var b= 'D';
var c= undefined;
var d= null;
var a= "supu";

{
    var b= 'A';
    console.log(b);
}
console.log(a); //will print the latest a
console.log(b);  //will print the changed one i.e A


let name1 = "supriyo";
let roll= 27;
// let roll= 67; -->error

console.log(roll)
console.log(name1);
//let roll= 23; //error

{
    let name1= "raj";
    console.log(name1);
}
console.log(name1);  //name1 will not change..will print supriyo

const city= "mumbai";
const pid= 193027;
console.log(pid);
// const city= "delhi"; -->error...constant cannot be redeclared or update
// city= "pune";  -->error...becoz const cannot be reassigned