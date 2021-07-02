public class JaCoCoCoverage {


    public boolean isPasswordValid(String str){
        if(str.length() > 5){
            if(str.length() < 8){
                if(str.contains("@")){
                    return true;
                }
                else
                    return false;
            }
            else
                return false;
        }
        else
            return false;
    }


}
