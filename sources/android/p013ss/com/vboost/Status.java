package android.p013ss.com.vboost;

/* renamed from: android.ss.com.vboost.Status */
public enum Status {
    BEGIN(1),
    END(2);
    
    private int status;

    public final int getStatus() {
        return this.status;
    }

    private Status(int i) {
        this.status = i;
    }
}
