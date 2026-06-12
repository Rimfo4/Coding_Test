function solution(food) {
    var answer = '';
    let foods = [food[0]];
    for(let i = food.length-1; i > 0; i--){
        foods.push(food[i]);
    }
    console.log(foods);
    for(let i = 0; i < foods.length; i++){
        if(i === 0){
            answer += i;   
        }
        else if(foods[i] != 1){
            if(foods[i] % 2 != 0){
                foods[i] = foods[i]-1;
            }
            for(let j = 0; j < foods[i]; j++){
                if(j < foods[i] / 2){
                    answer = (foods.length-i) + answer;
                }
                else {
                    answer += (foods.length-i);
                }
            }
        }
    }
    return answer;
}