class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        
        //행 보고 # 있다 -> 열을 보고 # 있다 -> i, j 위치 지정.
        // ".........."
        // ".....#...."
        // "......##.."
        // "...##....."
        // "....#....."
        
        for(int i = 0; i < wallpaper.length; i++){
            if(wallpaper[i].indexOf("#") != -1){
                LoopCheck: //loop 기능을 이용하여 다중 for문을 break 한 번으로 빠져나오기 가능.
                //boolean 변수 하나 지정해서 탈출 하는 법으로 대체가능.
                for(int j = 0; j < wallpaper[i].length(); j++){
                    for(int k = 0; k < wallpaper.length; k++){
                        if(wallpaper[k].charAt(j) == '#'){
                            answer[0] = i;
                            answer[1] = j;
                            break LoopCheck;
                        }
                    }
                }
                break;
            }
        }
        for(int i = wallpaper.length-1; i >= 0; i--){
            if(wallpaper[i].indexOf("#") != -1){
                LoopCheck:
                for(int j = wallpaper[i].length()-1; j >= 0; j--){
                    for(int k = 0; k < wallpaper.length; k++){
                        if(wallpaper[k].charAt(j) == '#'){
                            answer[2] = i+1;
                            answer[3] = j+1;
                            break LoopCheck;
                        }
                    }
                }
                break;
            }
        }
        return answer;
    }
}