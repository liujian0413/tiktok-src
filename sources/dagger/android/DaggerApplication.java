package dagger.android;

import android.app.Application;

public abstract class DaggerApplication extends Application implements C7316d {

    /* renamed from: a */
    private volatile boolean f20391a = true;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C7313b<? extends DaggerApplication> mo19114a();

    public void onCreate() {
        super.onCreate();
        m22903b();
    }

    /* renamed from: b */
    private void m22903b() {
        if (this.f20391a) {
            synchronized (this) {
                if (this.f20391a) {
                    mo19114a().mo19116a(this);
                    if (this.f20391a) {
                        throw new IllegalStateException("The AndroidInjector returned from applicationInjector() did not inject the DaggerApplication");
                    }
                }
            }
        }
    }
}
