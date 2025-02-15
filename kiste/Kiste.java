package kiste;

import java.util.ArrayList;
import java.util.List;

public class Kiste {
    private List<Sache> sachen=new ArrayList<>();
    public void add(Sache s) {
        sachen.add(s);
    };
    public List<Sache> schneidenSache(){
        List<Sache> things=new ArrayList<>();
        for(Sache s:sachen){
            if(s.canCut())
            {
                things.add(s);
            }
        }
        return things;
    }
    public List<Sache> heavySachen(){
        List<Sache> things=new ArrayList<>();
        for(Sache s:sachen){
            if(s.getWeight()>1){
                things.add(s);
            }
        }
        return things;
    }

}
