function solution(n, arr1, arr2) {
    var answer = [];
    let arr = [];
    
    for(let i in arr1){
        let sum = arr1[i] | arr2[i];
        arr.push(sum);
    }
    for(let bin of arr){
        let code = "";
        while(bin > 0){
            if(bin%2==0) code += " ";            
            else code += "#";
            bin = Math.floor(bin/2);
        }
        let c = code.split("").reverse().join("");
        answer.push(c.padStart(n, " "));
    }
    return answer;
}