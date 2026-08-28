def solution(score):
    answer = []
    rank = []
    
    for i, j in score:
        avg = (i + j)/2;
        rank.append(avg)
    
    for i in range(len(rank)):
        cnt = len(rank);
        for j in range(len(rank)):
            if i == j : continue;
            if rank[i] < rank[j] : cnt -= 1
        answer.append(len(rank) - cnt+1)
    return answer