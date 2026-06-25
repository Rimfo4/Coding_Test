function solution(s) {
    var answer = s.split("");
    for(let i = 0; i < answer.length-1; i++){
        for(let j = 0; j < answer.length-1-i; j++){
            if(answer[j] < answer[j+1]){
                let temp = answer[j+1];
                answer[j+1] = answer[j];
                answer[j] = temp;
            }
        }
    }

    return answer.join("");
}