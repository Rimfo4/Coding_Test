function solution(numbers) {
    var answer = sum = numbers.reduce((acc, cur) => acc + cur);
    return 45-answer;
}