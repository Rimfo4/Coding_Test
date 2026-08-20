function solution(s) {
    var answer = [];
    let map = new Map();
    
    let i = 0;
    for(let x of s){
        answer.push(map.has(x) ? i-map.get(x) : -1);
        map.set(x, i);
        i++
    }
    
    return answer;
}