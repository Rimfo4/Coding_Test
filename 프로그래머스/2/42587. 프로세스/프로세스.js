function solution(priorities, location) {
    var answer = 0;
    let queue = [];
    for(let i = 0; i < priorities.length; i++){
        queue.push(i);
    }
    let result = [];
    while(priorities.length !== 0){
        let max = Math.max(...priorities);
        let num = priorities.shift();
        if(max === num){
            result.push(queue[0]);
            queue.splice(0, 1);
        }
        else{
            priorities.push(num);
            queue.push(queue.shift());
        }
    }
    answer = result.indexOf(location)+1;
    return answer;
}