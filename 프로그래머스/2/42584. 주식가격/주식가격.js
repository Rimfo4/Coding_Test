function solution(prices) {
    var answer = 0;
    while(answer < prices.length-1){
        let cnt = 0;
        let p = prices[answer];
        for(let i = answer+1; i < prices.length; i += 1){
            cnt += 1;
            if(p > prices[i]) break;
        }
        prices[answer] = cnt;
        answer++;
    }
    prices[prices.length-1] = 0;
    return prices;
}