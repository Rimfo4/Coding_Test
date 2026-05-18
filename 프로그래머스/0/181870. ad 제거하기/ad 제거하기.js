function solution(strArr) {
    var answer = [];
    let flag = false;
    for(let i = 0; i < strArr.length; i++){
        let str = strArr[i];
        for(let j = 0; j < str.length-1; j++){
            if(str.charAt(j) === 'a'){
                str.charAt(j+1) === 'd' ? flag = true : null;
            }
        }
        if(!flag) answer.push(str);
        flag = false;
    }
    return answer;
}