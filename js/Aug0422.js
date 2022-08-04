/*
 JavaScript:
In this challenge you should repeat a specific given char x times. 
Create a function that takes a string and a number as arguments and return a string.
Examples
repeat("-", 3) ➞ "---"
repeat("A", 0) ➞ ""
repeat("c", -1) ➞ ""
Notes
Tests can repeat a char 268435440 times, no more.
Repeat should be fast maximum execution time : 5 ms.
Total maximum execution time : 3800 ms.
Native repeat is forbidden.
Using of an existing repeat polyfill too (that's not the challenge objective).
*/
function repeat(string,times){
    if(times>268435440){
        times=268435440;
    }
    if(times==0){
        return "";
    }
    let multiplier=Math.floor(Math.log2(times));
    if(multiplier==0){
        return string;
    }
    let str=string;
    for(i=0;i<multiplier;i++){
        string+=string;
    }
    return repeat(str,times-Math.pow(2,multiplier))+string;
   
}
console.log(repeat("a",268435437).length);
// console.log("hello");