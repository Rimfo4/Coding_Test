function solution(absolutes, signs) {
    var answer = 0;
    let arr = absolutes.map((item, index) => {
        if(!signs[index]){
            return item*-1;
        }
        return item;
    });
    for(x of arr){
        answer += x;
    }
    return answer;
}