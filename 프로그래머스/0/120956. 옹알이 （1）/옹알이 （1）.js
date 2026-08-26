function solution(babbling) {
    var answer = 0;
    const bArr = ["aya", "ye", "woo", "ma"];
    for(let ong of babbling){
        if(bArr.indexOf(ong) !== -1){
            answer++;
            continue;
        }
        let fOng = ong;
        for(let talk of bArr){
            let index = fOng.indexOf(talk);
            if(index !== -1){
                fOng = fOng.replace(talk, "0");
                index = fOng.indexOf(talk);
            }
        }
        let cnt = 0;
        for(let x of fOng){
            if(x !== '0') cnt++;
        }
        if(cnt === 0) answer++;
    }
    return answer;
}