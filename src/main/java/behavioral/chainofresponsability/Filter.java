package behavioral.chainofresponsability;

import behavioral.chainofresponsability.entities.Request;

public abstract class Filter {

    private Filter nextFilter;

    public Filter(){}

    public Filter(Filter nextFilter){
        this.nextFilter = nextFilter;
    }

    public abstract boolean check(Request request);
    protected boolean checkNext(Request request){
        if(nextFilter == null)
            return true;
        return nextFilter.check(request);
    };



}
