function solution(polynomial) {
    var answer = '';
    let xCnt = 0;
    let num = 0;
    let arr = polynomial.split(' + ');
    for(x of arr){
        if(x.indexOf('x') != -1){
            if(x.length === 1){
                xCnt++;
                continue;
            }
            xCnt += parseInt(x.slice(0, x.indexOf('x')));
        }
        else num += parseInt(x);
    }
    console.log(num);
    if(xCnt == 1) answer += 'x';
    else if(xCnt > 1) answer += xCnt + 'x';
    if(num > 0 && xCnt == 0) answer += num;
    else if(num > 0 && xCnt > 0) answer += " + " + num;
    return answer;
}