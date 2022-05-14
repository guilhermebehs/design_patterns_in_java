package behavioral.chainofresponsability;

import behavioral.chainofresponsability.entities.Request;

public class FilterChainOfResponsability {

    private Filter requestFilter;

    public FilterChainOfResponsability(){
        requestFilter = new TokenFilter(new BlackListedIpFilter());
    }

    public boolean doFilter(Request request){
        return requestFilter.check(request);
    }


}
