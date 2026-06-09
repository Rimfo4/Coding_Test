function solution(arr) {
    var answer = 0;
    let oldArr = arr;
    
    let cnt = 0;
    while(cnt !== oldArr.length){
        cnt = 0;
        let newArr = oldArr.map((item) => {
            if(item >= 50 && item % 2 === 0){
                item /= 2;
            }
            else if(item < 50 && item % 2 === 1){
                item *= 2;
                item++;
            }
            return item;
        });
        for(i = 0; i < arr.length; i++){
            if(oldArr[i] === newArr[i]) cnt++;
            else break;
        }
        answer++;
        oldArr = newArr;
    }
    return answer-1;
}