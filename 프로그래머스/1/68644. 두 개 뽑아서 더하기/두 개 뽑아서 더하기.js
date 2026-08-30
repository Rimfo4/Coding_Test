function solution(numbers) {
    var answer = [];
    for(let i in numbers){
        for(let j in numbers){ 
            if(i == j) continue;
            if(answer.indexOf(numbers[i]+numbers[j]) === -1){
                answer.push(numbers[i]+numbers[j]);
            }
        }
    }
    return answer.sort((a, b) => a-b);
}