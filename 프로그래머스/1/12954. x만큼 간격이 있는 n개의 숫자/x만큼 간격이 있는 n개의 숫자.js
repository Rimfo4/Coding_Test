function solution(x, n) {
    var answer = [];
    let a = x;
    for(i = 0; i < n; i++){
        answer.push(x);
        x += a;
    }
    return answer;
}