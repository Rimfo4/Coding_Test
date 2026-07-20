function solution(keymap, targets) {
    var answer = [];
    let obj = {};
    for(let x of keymap){
        let deepX = x.split("");
        for(let i = 0; i < deepX.length; i++){
            if(obj[deepX[i]] === undefined || obj[deepX[i]] > i){
                obj[deepX[i]] = i;
            }
        }
    }
    for(let x of targets){
        let deepX = x.split("");
        let cnt = 0;
        for(let i = 0; i < deepX.length; i++){
            if(obj[deepX[i]] !== undefined){
                cnt += obj[deepX[i]]+1;
            }
            else {
                cnt = -1;
                break;
            }
        }
        answer.push(cnt);
    }
    return answer;
}