function solution(quiz) {
    var answer = [];
    //["19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"]
    for(i = 0; i < quiz.length; i++){
        let str = quiz[i].split(" ");
        console.log(str);
        
        if(str[1] === '+'){
            answer.push((+str[0])+(+str[2]) === (+str[4]) ? "O" : "X");
        }
        else{
            answer.push((+str[0])-(+str[2]) === (+str[4]) ? "O" : "X");
        }
    }
    return answer;
}