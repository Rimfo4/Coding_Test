function solution(s, n) {
    var answer = "";
    
    let code = s.split("");
    
    for(let x of code){
        let al = '';
        let i = x.charCodeAt(0);
        if(i == 32){
            answer += " ";
            continue;
        }
        
        if(i+n > 90 && i+n < 97){
            al = (i+n)%90+64;
        }
        else if(i+n > 122){
            al = (i+n)%122+96;
        }
        else{
            if((i >= 65 && i <= 90) && i+n >= 97){
                al = (i+n)%90+64;
            }
            else al = i+n;
        }
        
        answer += String.fromCharCode(al);
    }
    return answer;
}