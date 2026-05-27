function solution(n) {
    let str = n.toString().split("");
    let answer = "";
    for(i = 0; i < str.length-1; i++){
        for(j = 0; j < str.length-1-i; j++){
            if(+str[j] < +str[j+1]){
                let temp = str[j+1];
                str[j+1] = str[j];
                str[j] = temp;
            }
        }
    }
    for(x of str){
        answer += x;
    }
    return parseInt(answer);
}