function solution(s) {
    var answer = s.split(" ").
        map((str) => {
            if(str.length != 0){
                let c = str.charCodeAt();
                if(c >= 97 && c <= 122) c -= 32;
                return String.fromCharCode(c) +str.slice(1).toLowerCase();
            }
    }).join(" ");
    return answer;
}