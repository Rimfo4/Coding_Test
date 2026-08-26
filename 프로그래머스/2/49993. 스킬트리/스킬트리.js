function solution(skill, skill_trees) {
    var answer = 0;
    for(let skArr of skill_trees){
        let i = 0;
        let cnt = 0;
        for(let j in skArr){
            let index = skill.indexOf(skArr.charAt(j))
            if(index != -1){
                if(i < index) break; 
                else if(i === index){
                    i++;
                }
            }
            console.log(skArr, index, skArr.charAt(j), i);   
            if(cnt === skArr.length-1) answer++;
            cnt++;
        }
    }
    return answer;
}