import java.util.*;
public class IdentifyPossibleWords {
    public static List<String> possible(String chars, List<String> dict){
        List<String> out=new ArrayList<>();
        for(String w:dict){
            boolean ok=true;
            for(char c:w.toCharArray()){
                if(!chars.contains(String.valueOf(c))) {ok=false;break;}
            }
            if(ok) out.add(w);
        }
        return out;
    }
    public static void main(String[] args){
        List<String> d=Arrays.asList("cat","bat","tap");
        System.out.println(possible("atcb",d));
    }
}
