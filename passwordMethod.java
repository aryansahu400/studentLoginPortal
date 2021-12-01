class Password {
   
    public static boolean passwordChecker(String s){
        boolean caps=false;
        boolean small=false;
        boolean cha=false;
        boolean number=false;
        for(char i = 'a' ; i<= 'z' ;i++ ){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==i){
                    small=true;
                    break;
                }
            }
            if(small==true){
                break;
            }
        }
        for(char i = 'A' ; i<= 'Z' ;i++ ){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==i){
                    caps=true;
                    break;
                }
            }
            if(caps==true){
                break;
            }
        }
        for(char i = 33 ; i<= 47 ;i++ ){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==i){
                    cha=true;
                    break;
                }
            }
            if(cha==true){
                break;
            }
        }
        for(char i = '0';i<='9';i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==i){
                    number=true;
                    break;
                }
            }
            if(number==true){
                break;
            }
        }
        if(caps && small && cha && number) return true;
        else return false;
    }

}
