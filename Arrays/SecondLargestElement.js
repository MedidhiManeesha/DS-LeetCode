const arr = [23,34,25,66,78];
let first = -Infinity;
let second = -Infinity;
for(let i = 0; i< arr.length; i++){
    if(arr[i]> first){
        second = first
        first = arr[i];
    }else if(arr[i] > second && arr[i]!= first){
        second = arr[i];
    }
}
if( second === -Infinity){
    console.log("no 2 ele");
}
