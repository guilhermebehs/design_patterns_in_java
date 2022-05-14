package behavioral.chainofresponsability;

import behavioral.chainofresponsability.entities.Request;

import java.util.List;

public class BlackListedIpFilter extends Filter{

    private final List<String> blackListedIps = List.of("1.2.3");

    public BlackListedIpFilter(){
        super();
    }

    public BlackListedIpFilter(Filter filter){
        super(filter);
    }

    @Override
    public boolean check(Request request) {
        if(blackListedIps.contains(request.getIp()))
            return false;

        return checkNext(request);
    }
}
