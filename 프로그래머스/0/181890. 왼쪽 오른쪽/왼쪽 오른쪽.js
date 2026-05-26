function solution(str_list) {
    var answer = [];
    let riF = false;
    for(x of str_list){
        if(x === "l" || x === "r"){  
            riF = x === "r" ? true : false; 
            break;
        }
        answer.push(x);
    }
    if(answer.length === str_list.length){
        return [];
    }
    if(riF){
        let cnt = answer.length+1;
        answer = [];
        for(i = cnt; i < str_list.length; i++){
            answer.push(str_list[i]);
        }
    }
    return answer;
}