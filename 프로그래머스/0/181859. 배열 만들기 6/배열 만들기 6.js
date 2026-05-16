function solution(arr) {
    var answer = []; //빈 배열 => false
    for(i = 0; i < arr.length; i++){
        if(answer.length === 0){
            answer.push(arr[i]);
            continue;
        }
        else if(answer.length > 0 && answer[answer.length-1] === arr[i]){
            answer.pop();
            continue;
        }
        else {
            answer.push(arr[i]);
        }
        
    }
    return answer.length === 0 ? [-1] : answer;
}