function solution(arr, divisor) {
    var answer = arr.filter((item) => {
       if(item%divisor === 0) return item; 
    });
    answer.sort((a, b) => a - b);
    return answer.length === 0 ? [-1] : answer;
}