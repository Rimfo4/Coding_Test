function solution(arr, k) {
    var answer = [];
    for(x of arr){
        if(answer.indexOf(x) === -1){
            answer.push(x);
        }
    }
    if(answer.length > k){
        answer.length = k;
    }
    else{
        while(answer.length < k){
            answer.push(-1);
        }
    }
    return answer;
}