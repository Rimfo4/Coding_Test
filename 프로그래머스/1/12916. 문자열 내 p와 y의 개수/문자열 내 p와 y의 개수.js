function solution(s){
    var answer = true;
    let cntP = 0;
    let cntY = 0;
    
    for(c of s){
        if(c.toUpperCase() == 'P'){
            cntP++;
        }
        else if(c.toUpperCase() == 'Y'){
            cntY++;
        }
    }
    return cntP === cntY;
}