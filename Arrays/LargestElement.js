// Traditional approach
const arr = [3,2,1,5,9,4];
let maxElement = arr[0];
for(let i =0;i< arr.length;i++){
    if(maxElement < arr[i]){
        maxElement = arr[i]
    }
}
console.log(maxElement);

// Math.max using spread operator
const arr1 = [89,7,8,4,3];
let maxNum = Math.max(...arr1);
console.log(maxNum);

// Reduce method 
const arr2 = [90,39,343,22,55,98];
let maxVal = arr2.reduce((max,current)=> current > max ? current : max);
console.log(maxVal);