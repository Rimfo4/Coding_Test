function solution(arr) {
    var answer = [];
    let min = arr[0];
    for(let x of arr){
        if(min > x) min = x;
    }
    for(let x of arr){
        if(min === x){
            continue;
        }
        answer.push(x);
    }
    return answer.length === 0 ? [-1] : answer;
}