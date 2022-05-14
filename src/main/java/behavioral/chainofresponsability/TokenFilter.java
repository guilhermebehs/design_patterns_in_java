package behavioral.chainofresponsability;

import behavioral.chainofresponsability.entities.Request;

import java.util.List;

public class TokenFilter extends Filter {

    private final List<String> validTokens = List.of("123");

    public TokenFilter(){
        super();
    }

    public TokenFilter(Filter filter){
        super(filter);
    }

    @Override
    public boolean check(Request request) {
        if(request.getToken() == null || !validTokens.contains(request.getToken()))
          return false;

        return checkNext(request);
    }
}
