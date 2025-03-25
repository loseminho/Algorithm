import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("mm:ss");  
        
        LocalTime timeVideo_len = LocalTime.parse("00:" + video_len, formatter);
        LocalTime timePos = LocalTime.parse("00:" + pos, formatter);
        LocalTime timeOp_start = LocalTime.parse("00:" + op_start, formatter);
        LocalTime timeOp_end = LocalTime.parse("00:" + op_end, formatter);
        

        for(int i=0; i<commands.length; i++){
            switch (commands[i]){
                case "next" : 
                    if(!timePos.isBefore(timeOp_start) && timePos.isBefore(timeOp_end)){
                        timePos = timeOp_end;// 현재 영상 위치가 오프닝 사이일때,
                    }
                    timePos = timePos.plusSeconds(10);//현재 타임에 10초 추가
                    if(!timePos.isBefore(timeOp_start) && timePos.isBefore(timeOp_end)){
                        timePos = timeOp_end;//만약 바뀐 값이 오프닝 사이라면, 오프닝이 끝난 위치로 이동
                    }else if(timePos.isAfter(timeVideo_len)){
                        timePos = timeVideo_len;//바뀐 값이 총 영상의 길이보다 크다면 끝나는 시간으로 변경
                    }
                    break;
                case "prev" : 
                    if(!timePos.isBefore(timeOp_start) && timePos.isBefore(timeOp_end)){
                        timePos = timeOp_end;// 현재 영상 위치가 오프닝 사이일때,
                    }
                    if(timePos.isAfter(LocalTime.parse("00:00:10", formatter))){
                    timePos = timePos.minusSeconds(10);//현재 타임에 10초 제거
                    if(!timePos.isBefore(timeOp_start) && timePos.isBefore(timeOp_end)){
                        timePos = timeOp_end;//만약 바뀐 값이 오프닝 사이라면, 오프닝이 끝난 위치로 이동
                    }
                }else{
                    timePos = LocalTime.parse("00:00:00", formatter);//현재 시간을 00:00초로 변경
                }
                break;
            }
        }


        // HH를 뺀 형식으로 변환하여 반환
        return answer = timePos.format(outputFormatter);
    }
}