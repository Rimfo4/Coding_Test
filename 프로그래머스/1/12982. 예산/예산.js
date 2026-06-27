function solution(d, budget) {
    var answer = 0;
    d = d.sort((a, b) => a-b);
    console.log(d);
    for(x of d){
        if(budget <= 0) break;
        budget -= x;
        if(budget < 0) break;
        answer++;
    }
    return answer;
}