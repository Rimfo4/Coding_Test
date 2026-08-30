function solution(board, moves) {
    var answer = 0;
    let stack = [];
    
    for(let m of moves){
        for(let i in board){
            if(board[i][m-1] != 0){
                if(stack.length === 0){
                    stack.push(board[i][m-1]);
                }
                else{
                    if(stack[stack.length-1] === board[i][m-1]){
                        answer += 2;
                        stack.pop();
                    }
                    else {
                        stack.push(board[i][m-1]);
                    }
                }
                board[i][m-1] = 0;
                break;
            }
        }
    }
    console.log(board, stack);
    return answer;
}