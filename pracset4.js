let sentence= "You are born to make history"
let word="history"

console.log(`The word ${word} ${sentence.includes(word) ? "is":"is not"} present`)

let a= "Rajaram has earned rs 5041"
let amount= Number.parseInt(a.slice("Rajaram has earned rs ".length))
console.log(amount)
