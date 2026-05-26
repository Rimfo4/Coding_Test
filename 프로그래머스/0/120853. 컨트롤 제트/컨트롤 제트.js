function solution(s) {
    var answer = 0;
    let bN = 0;
    let arr = s.split(" ");
    for(x of arr){
        if(x === 'Z'){
            answer -= bN;  
        }  
        else{
            bN = +x;  
            answer += +x;
        } 
        
    }
    return answer;
}