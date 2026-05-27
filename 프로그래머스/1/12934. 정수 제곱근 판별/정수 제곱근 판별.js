function solution(n) {
    var answer = 1;
    let pow = 1;
    while(n > answer){
        answer = pow ** 2;
        pow++;
    }
    if(n === 1) return 4;
    if(answer != n){
        answer = -1;
    }
    else{
        answer = pow ** 2;
    }
    return answer;
}