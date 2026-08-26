function solution(number) {
    var answer = 0;
    for(let i = 0; i < number.length; i++){
        for(let j = i+1; j < number.length; j++){
            let index = number.indexOf((number[i]+number[j]) * -1, j+1);
            while(index !== -1){
                answer++;
                index = number.indexOf((number[i]+number[j]) * -1, index+1);
            }
        }
    }
    return answer;
}