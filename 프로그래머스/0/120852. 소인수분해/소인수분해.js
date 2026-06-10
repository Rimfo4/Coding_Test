function solution(n) {
    var answer = [];
    let nF = n;
    //1부터 10까지 모듈러로 연산.
    for(i = 2; i <= 10000; i++){
        if(nF % i == 0){
            nF = Math.trunc(nF/i);
            answer.push(i);
            i = 1;
        }
    }
    if(nF === n) answer.push(nF);
    answer = [...new Set(answer)];
    return answer;
}