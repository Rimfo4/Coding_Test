function solution(k, score) {
    var answer = [];
    let result = [];
    for(let s of score){
        if(answer.length < k){
            if(answer.length === 0){
                answer.unshift(s);
            }
            else{
                let i = 0;
                for(; i < answer.length; i++){
                    if(s >= answer[i]) break;
                }
                answer.splice(i, 0, s);
            }
            result.push(answer[answer.length-1]);
        }
        else{
            let i = 0;
            for(; i < answer.length; i++){
                if(s >= answer[i]) break;
            }
            answer.splice(i, 0, s);
            result.push(answer[k-1]);
        }
    }
    return result;
}