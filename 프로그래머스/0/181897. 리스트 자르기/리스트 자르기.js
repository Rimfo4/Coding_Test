function solution(n, slicer, num_list) {
    var answer = [];
    let a = 0;
    let b = 0;
    let c = 0;

    if(n === 1){
        a = 0;
        b = slicer[1];
        c = 1;
    }
    else if(n === 2){
        a = slicer[0];
        b = num_list.length-1;
        c = 1;
    }        
    else if(n === 3){
        a = slicer[0];
        b = slicer[1];
        c = 1;
    }
    else {
        a = slicer[0];
        b = slicer[1];
        c = slicer[2];
    }
    for(i = a; i <= b; i += c){
        answer.push(num_list[i]);
    }
    return answer;
}