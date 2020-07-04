package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.ArrayMap;
import com.google.android.gms.internal.p761c.C16359d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class zzc extends Fragment implements C15139g {

    /* renamed from: a */
    private static WeakHashMap<FragmentActivity, WeakReference<zzc>> f39236a = new WeakHashMap<>();

    /* renamed from: b */
    private Map<String, LifecycleCallback> f39237b = new ArrayMap();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f39238c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Bundle f39239d;

    /* renamed from: a */
    public static zzc m44133a(FragmentActivity fragmentActivity) {
        WeakReference weakReference = (WeakReference) f39236a.get(fragmentActivity);
        if (weakReference != null) {
            zzc zzc = (zzc) weakReference.get();
            if (zzc != null) {
                return zzc;
            }
        }
        try {
            zzc zzc2 = (zzc) fragmentActivity.getSupportFragmentManager().mo2644a("SupportLifecycleFragmentImpl");
            if (zzc2 == null || zzc2.mRemoving) {
                zzc2 = new zzc();
                fragmentActivity.getSupportFragmentManager().mo2645a().mo2588a((Fragment) zzc2, "SupportLifecycleFragmentImpl").mo2606d();
            }
            f39236a.put(fragmentActivity, new WeakReference(zzc2));
            return zzc2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    /* renamed from: a */
    public final <T extends LifecycleCallback> T mo38383a(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f39237b.get(str));
    }

    /* renamed from: a */
    public final void mo38384a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f39237b.containsKey(str)) {
            this.f39237b.put(str, lifecycleCallback);
            if (this.f39238c > 0) {
                new C16359d(Looper.getMainLooper()).post(new C15132cy(this, lifecycleCallback, str));
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

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39238c = 1;
        this.f39239d = bundle;
        for (Entry entry : this.f39237b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).mo38278a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f39238c = 2;
        for (LifecycleCallback b : this.f39237b.values()) {
            b.mo38280b();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f39238c = 3;
        for (LifecycleCallback c : this.f39237b.values()) {
            c.mo38282c();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback a : this.f39237b.values()) {
            a.mo38277a(i, i2, intent);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Entry entry : this.f39237b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).mo38281b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStop() {
        super.onStop();
        this.f39238c = 4;
        for (LifecycleCallback d : this.f39237b.values()) {
            d.mo38283d();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f39238c = 5;
        Iterator it = this.f39237b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f39237b.values()) {
            a.mo38279a(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Activity mo38382a() {
        return getActivity();
    }
}
