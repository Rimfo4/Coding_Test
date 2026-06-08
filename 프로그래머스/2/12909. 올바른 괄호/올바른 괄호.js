function solution(s){
    let stack = [];
    for(x of s){
        if(x == '('){
            stack.push(x);
        }
        else if(stack[stack.length-1] == '('){
            stack.pop();
        } 
        else return false;

    }
    return stack.length == 0;
}