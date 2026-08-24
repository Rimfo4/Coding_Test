function solution(t, p) {
    var answer = 0;
    let arr = [];
    for(let i = 0; i <= t.length - p.length; i++){
        arr.push(t.slice(i, i+p.length));
    }
    for(let x of arr){
        if(+x <= +p) answer++;
    }
    return answer;
}