function solution(myStr) {
    var answer = [];
    let temp = "";
    for(x of myStr){
        if(x === "a" || x === "b" || x === "c"){
            temp.length === 0 ? null : answer.push(temp);
            temp = "";
            continue;
        }
        temp += x;
    }
    temp ? answer.push(temp) : null;
    if(answer.length === 0){
         answer.push("EMPTY")
    }
    return answer;
}