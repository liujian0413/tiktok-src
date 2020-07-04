package android.support.p022v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: android.support.v4.app.h */
public abstract class C0606h {
    /* renamed from: a */
    public abstract View mo2351a(int i);

    /* renamed from: a */
    public abstract boolean mo2352a();

    /* renamed from: a */
    public Fragment mo2350a(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }
}
