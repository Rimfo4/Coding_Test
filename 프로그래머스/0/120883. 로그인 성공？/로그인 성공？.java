class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        int cnt = 0;
        boolean idPass = false;
        for(String[] s : db){
            if(s[0].equals(id_pw[0])) idPass = true;
        }
        if(idPass){
            for(int i = 0; i < db.length; i++){
                if(id_pw[1].equals(db[i][1]) && id_pw[0].equals(db[i][0])){
                    return "login";
                }
                else cnt++;
            }
        }
        if(idPass) return "wrong pw";
        return answer;
    }
}