function solution(s) {
    var answer = true;
    if(s.length !== 4 && s.length !== 6) return false;
    for(let i = 0; i < s.length; i++){
        let a = s.charAt(i);
        if(!(a >= "0" && a <= "9")) return false;
    }
    return answer;
}