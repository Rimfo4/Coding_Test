function solution(s) {
    var answer = [0, 0];
    let cnt = 0;
    while(s != "1"){
        for(let x of s){
            if(x == '1') cnt++;
            else answer[1]++;
        }
        let newS = "";
        while(cnt > 1){
            newS += cnt%2;
            cnt = Math.floor(cnt/2);
        }
        newS += cnt;
        s = newS.split("").reverse().join("");
        cnt = 0;
        answer[0]++;
    }
    return answer;
}