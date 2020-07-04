package android.support.p022v4.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.p022v4.content.C0683b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v4.app.ah */
public final class C0595ah implements Iterable<Intent> {

    /* renamed from: a */
    private final ArrayList<Intent> f2356a = new ArrayList<>();

    /* renamed from: b */
    private final Context f2357b;

    /* renamed from: android.support.v4.app.ah$a */
    public interface C0596a {
        Intent getSupportParentActivityIntent();
    }

    public final Iterator<Intent> iterator() {
        return this.f2356a.iterator();
    }

    /* renamed from: a */
    public final void mo2577a() {
        m2479a((Bundle) null);
    }

    /* renamed from: a */
    public static C0595ah m2477a(Context context) {
        return new C0595ah(context);
    }

    private C0595ah(Context context) {
        this.f2357b = context;
    }

    /* renamed from: a */
    private C0595ah m2478a(Intent intent) {
        this.f2356a.add(intent);
        return this;
    }

    /* renamed from: a */
    private C0595ah m2476a(ComponentName componentName) {
        int size = this.f2356a.size();
        try {
            Intent a = C0652w.m2820a(this.f2357b, componentName);
            while (a != null) {
                this.f2356a.add(size, a);
                a = C0652w.m2820a(this.f2357b, a.getComponent());
            }
            return this;
        } catch (NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    private void m2479a(Bundle bundle) {
        if (!this.f2356a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f2356a.toArray(new Intent[this.f2356a.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            C0683b.m2906a(this.f2357b, intentArr, (Bundle) null);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    /* renamed from: a */
    public final C0595ah mo2576a(Activity activity) {
        Intent supportParentActivityIntent = ((C0596a) activity).getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C0652w.m2819a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f2357b.getPackageManager());
            }
            m2476a(component);
            m2478a(supportParentActivityIntent);
        }
        return this;
    }
}
