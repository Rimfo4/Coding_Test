def solution(s):
    answer = 0
    NUMLIST = {
        'zero': 0,'one': 1,
        'two': 2,'three': 3,
        'four': 4,'five': 5,
        'six': 6,'seven': 7,
        'eight': 8,'nine': 9
    }
    m = ""
    for i in list(s):
        index = NUMLIST.get(m, -1)
        if(index != -1):
            m = ""
            answer = (answer * 10) + index
        num = ord(i)
        if 48 <= num <= 57:
            answer = (answer * 10) + int(i)
        else: m += i
        print(answer,m)
    if m:
        index = NUMLIST.get(m, -1)
        if(index != -1):
            m = ""
            answer = (answer * 10) + index
    return answer