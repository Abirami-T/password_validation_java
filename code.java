import java.util.regex.*;
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int x=0;
         int l=password.length();
        String regex ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-+]).{8,}$";
 
        Pattern p = Pattern.compile(regex);
        if (password == null || l<8 ) {
            return false;
        }

        Matcher m = p.matcher(password);
 
        x= m.matches()?1:0;
    
        for(int i=1;i<l-1;i++){
            if(password.charAt(i)==password.charAt(i-1)){
                x=0;
            }
        }
        return x==1? true:false;
    }
}
