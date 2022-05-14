package behavioral.chainofresponsability.entities;

public class Request {

    private String ip;
    private String token;
    private String body;

    public String getIp() {
        return ip;
    }

    public Request setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public String getToken() {
        return token;
    }

    public Request setToken(String token) {
        this.token = token;
        return this;
    }

    public String getBody() {
        return body;
    }

    public Request setBody(String body) {
        this.body = body;
        return this;
    }
}
