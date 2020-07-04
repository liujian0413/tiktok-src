package kotlin;

public class NoWhenBranchMatchedException extends RuntimeException {
    public NoWhenBranchMatchedException() {
    }

    public NoWhenBranchMatchedException(String str) {
        super(str);
    }

    public NoWhenBranchMatchedException(Throwable th) {
        super(th);
    }

    public NoWhenBranchMatchedException(String str, Throwable th) {
        super(str, th);
    }
}
