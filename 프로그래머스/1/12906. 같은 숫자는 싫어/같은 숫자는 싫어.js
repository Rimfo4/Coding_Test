function solution(arr)
{
    var answer = [];
    for(let i of arr){
        if(i === answer[answer.length-1]){
            answer.pop();
        }
        answer.push(i);
    }
    return answer;
}