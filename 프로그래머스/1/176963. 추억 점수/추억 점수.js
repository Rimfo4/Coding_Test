function solution(name, yearning, photo) {
    var answer = [];
    let obj = {}
    for(let i = 0; i < name.length; i++){
        obj[name[i]] = yearning[i];
    }
    for(let x of photo){
        let sum = 0;
        for(let y of name){
            if(obj[x[x.indexOf(y)]] !== undefined){
                sum += obj[x[x.indexOf(y)]];    
            }
        }
        answer.push(sum);
    }
    return answer;
}