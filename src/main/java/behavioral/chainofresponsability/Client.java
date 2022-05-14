package behavioral.chainofresponsability;

import behavioral.chainofresponsability.entities.Request;

public class Client {

    public static void main(String[] args) {

        var filterCOR = new FilterChainOfResponsability();

        System.out.println(filterCOR.doFilter(createValidRequest()));
        System.out.println(filterCOR.doFilter(createRequestWithInvalidToken()));
        System.out.println(filterCOR.doFilter(createRequestWithBlackListedIp()));

    }


    public static Request createValidRequest(){
        return new Request()
                .setBody("some body")
                .setIp("1.2.4")
                .setToken("123");
    }

    public static Request createRequestWithBlackListedIp(){
        return new Request()
                .setBody("some body")
                .setIp("1.2.3")
                .setToken("123");
    }

    public static Request createRequestWithInvalidToken(){
        return new Request()
                .setBody("some body")
                .setIp("1.2.4")
                .setToken("12");
    }
}
