function solution(board) {
    var answer = 0;
    // [0, 0, 0, 0, 0],
//     [0, 0, 0, 0, 0],
//     [0, 0, 0, 0, 0],
//     [0, 0, 1, 1, 0],
    // [0, 0, 0, 0, 0]
    
    let dr = [-1, 0, 1, 1, 1, 0, -1, -1];
    let dc = [-1, -1, -1, 0, 1, 1, 1, 0];
    
    for(let i in board){
        for(let j in board[i]){
            if(board[i][j] === 1){
                for(let k = 0; k < 8; k++){
                    let y = +i+dr[k];
                    let x = +j+dc[k];
                    if((y >= 0 && y < board.length) && (x >= 0 && x < board[i].length)){
                        if(board[y][x] === 0) board[y][x] = 2;
                    }
                }
            }
        }
    }
    for(let i in board){
        for(let j in board[i]){
            if(board[i][j] === 0) answer++;   
        }
    }
    return answer;
}