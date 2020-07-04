package p346io.reactivex.exceptions;

/* renamed from: io.reactivex.exceptions.OnErrorNotImplementedException */
public final class OnErrorNotImplementedException extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public OnErrorNotImplementedException(Throwable th) {
        StringBuilder sb = new StringBuilder("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ");
        sb.append(th);
        this(sb.toString(), th);
    }

    public OnErrorNotImplementedException(String str, Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        super(str, th);
    }
}
