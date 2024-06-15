public class 实训任务六3 {
    private String[] hanArr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    private String[] unitArr ={"仟", "", "拾", "佰"};
    private String[] tag = {"元","万","亿"};
    public String toHanStr(double num){
        String result = "";
        long zheng = (long) num;
        long xiao = (long)((num-zheng)*100);
        String zhengStr = String.valueOf(zheng);
        int len = zhengStr.length();
        int tempLen = 0;
        for (int i = 0; i <len ; i++) {
            int temp = zhengStr.charAt(i) - 48;
            int part = (len - i - 1) / 4;
            int location = (len - i - 1) % 4;
            if(location!=0){
                if(temp!=0){
                    result += hanArr[temp] + unitArr[(len - i) % 4];
                    continue;
                }
                else{
                    tempLen = result.length();
                    if(3 == location) {
                        result += "零"; continue;
                    } else {
                        tempLen = result.length();
                        if(result.charAt(tempLen - 1) == '零') {
                            continue;
                        }
                        else {
                            result += "零"; continue;
                        }
                    }
                }
            }
            else {
                if(temp != 0) {
                    result += hanArr[temp] + tag[part]; continue;
                }
                else
                {
                    tempLen = result.length();
                    if(result.charAt(tempLen - 1) != '零') {
                        result += tag[part]; continue;
                    }
                    else {
                        if(result.charAt(tempLen - 2) == '亿' || result.charAt(tempLen - 2) == '万') {
                            continue;
                        }
                        else {
                            result = result.substring(0, tempLen - 1) + tag[part]; continue;
                        }
                    }
                }
            }
        }
        int jiao = (int)(xiao / 10);
        int fen = (int)(xiao % 10);
        if(jiao != 0) {
            result += hanArr[jiao] + "角";
        }
        if(fen != 0) {
            result += hanArr[fen] + "分";
        }
        tempLen = result.length();
        if(result.charAt(tempLen - 1) == '零') {
            result = result.substring(0, tempLen - 1);
        }

        tempLen = result.length();
        if(result.charAt(tempLen - 1) == '元') {
            result += "整";
        }
        if(result.charAt(tempLen - 1) == '万' || result.charAt(tempLen - 1) == '亿') {
            result += "元整";
        }
        return result;
    }
    public static void main(String[] args) {
        实训任务六3 ntr = new 实训任务六3();
        System.out.println(ntr.toHanStr(600100.11));
    }
}
