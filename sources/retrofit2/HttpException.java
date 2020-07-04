package retrofit2;

public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient C48516l<?> response;

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public C48516l<?> response() {
        return this.response;
    }

    public HttpException(C48516l<?> lVar) {
        super(getMessage(lVar));
        this.code = lVar.mo123307a();
        this.message = lVar.mo123308b();
        this.response = lVar;
    }

    private static String getMessage(C48516l<?> lVar) {
        C48522o.m150306a(lVar, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(lVar.mo123307a());
        sb.append(" ");
        sb.append(lVar.mo123308b());
        return sb.toString();
    }
}
