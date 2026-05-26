function solution(numbers, k) {
    var answer = 0;
    let cnt = 0;
    for(i = 0; i < k; i++){
        answer = numbers[cnt % numbers.length];
        cnt += 2;
    }
    return answer;
}