package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.p022v4.util.ArrayMap;
import com.google.android.gms.internal.p761c.C16359d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.common.api.internal.cw */
public final class C15130cw extends Fragment implements C15139g {

    /* renamed from: a */
    private static WeakHashMap<Activity, WeakReference<C15130cw>> f39132a = new WeakHashMap<>();

    /* renamed from: b */
    private Map<String, LifecycleCallback> f39133b = new ArrayMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f39134c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Bundle f39135d;

    /* renamed from: a */
    public static C15130cw m43955a(Activity activity) {
        WeakReference weakReference = (WeakReference) f39132a.get(activity);
        if (weakReference != null) {
            C15130cw cwVar = (C15130cw) weakReference.get();
            if (cwVar != null) {
                return cwVar;
            }
        }
        try {
            C15130cw cwVar2 = (C15130cw) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (cwVar2 == null || cwVar2.isRemoving()) {
                cwVar2 = new C15130cw();
                activity.getFragmentManager().beginTransaction().add(cwVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            f39132a.put(activity, new WeakReference(cwVar2));
            return cwVar2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo38383a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f39133b.get(str));
    }

    /* renamed from: a */
    public final void mo38384a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f39133b.containsKey(str)) {
            this.f39133b.put(str, lifecycleCallback);
            if (this.f39134c > 0) {
                new C16359d(Looper.getMainLooper()).post(new C15131cx(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final Activity mo38382a() {
        return getActivity();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39134c = 1;
        this.f39135d = bundle;
        for (Entry entry : this.f39133b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo38278a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f39134c = 2;
        for (LifecycleCallback b : this.f39133b.values()) {
            b.mo38280b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f39134c = 3;
        for (LifecycleCallback c : this.f39133b.values()) {
            c.mo38282c();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.f39133b.values()) {
            a.mo38277a(i, i2, intent);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f39133b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo38281b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStop() {
        super.onStop();
        this.f39134c = 4;
        for (LifecycleCallback d : this.f39133b.values()) {
            d.mo38283d();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f39134c = 5;
        Iterator it = this.f39133b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f39133b.values()) {
            a.mo38279a(str, fileDescriptor, printWriter, strArr);
        }
    }
}
