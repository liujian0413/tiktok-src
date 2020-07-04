package kotlin;

public final class UninitializedPropertyAccessException extends RuntimeException {
    public UninitializedPropertyAccessException() {
    }

    public UninitializedPropertyAccessException(String str) {
        super(str);
    }

    public UninitializedPropertyAccessException(Throwable th) {
        super(th);
    }

    public UninitializedPropertyAccessException(String str, Throwable th) {
        super(str, th);
    }
}
