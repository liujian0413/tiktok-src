package android.support.p022v4.app;

/* renamed from: android.support.v4.app.SafeJobIntentService */
public abstract class SafeJobIntentService extends JobIntentService {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public C0564e dequeueWork() {
        try {
            return super.dequeueWork();
        } catch (SecurityException unused) {
            return null;
        }
    }
}
