/*
primitive: 
N:null,N:number,S:string,S:symbol,B:bigint,B:boolean,U:undefined
*/

let a= null;
let b= 34;
let c= "Raja Raman";
let d= Symbol("Symobol of india is diversity");
let e= BigInt("193027");
let e1= BigInt(427) + BigInt("3");
let f= false;
let g= undefined;
let g1;

console.log(typeof g1);
console.log(typeof g);
console.log(typeof e1);


console.log(a,b,c,d,e,e1,f,g,g1);

/*
Object--> non primitive 
object can be created by using {} or new Object()
*/

const bio= {
    "Name": "Supriyo Ghosh",
    "PID": 13457,
    "Status": false,
    "Grade": 'B',
    "Result": undefined
}
console.log(bio);
console.log(bio["PID"]);


let animals= {
    "Name": "Tiger",
    "lbs": 245,
    "Status": true,
    "Grade": 'A',
    location: "Sunderban"
}
console.log(animals);
