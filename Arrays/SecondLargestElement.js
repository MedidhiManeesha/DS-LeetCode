const arr = [45,54];
let first = -Infinity;
let second = -Infinity;
let third = -Infinity;
for(let i =0;i< arr.length;i++){
    if(arr[i] > first){
        third = second;
        second = first;
        first = arr[i];
    }else if(arr[i] > second && arr[i]!= first){
        third = second;
        second = arr[i];
    }else if(arr[i] > third && arr[i]!= second){
        third = arr[i];
    }
}
console.log(first);
console.log(second)
console.log(third);
if(third == -Infinity){
    console.log("NO 3rd element")
}
