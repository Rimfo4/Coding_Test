function solution(arr) {
    var stack = [];
    let i = 0;
    while(i != arr.length){
        if(stack.length === 0){
            stack.push(arr[i++]);
        }
        else if(stack[stack.length-1] < arr[i]){
            stack.push(arr[i++]);
        }
        else if(stack[stack.length-1] >= arr[i]){
            stack.pop();
        }
    }
    return stack;
    
}