package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {

    /* renamed from: a */
    protected final C15139g f38934a;

    private static C15139g getChimeraLifecycleFragmentImpl(C15138f fVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    /* renamed from: a */
    public void mo38277a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo38278a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo38279a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: b */
    public void mo38280b() {
    }

    /* renamed from: b */
    public void mo38281b(Bundle bundle) {
    }

    /* renamed from: c */
    public void mo38282c() {
    }

    /* renamed from: d */
    public void mo38283d() {
    }

    /* renamed from: a */
    protected static C15139g m43645a(C15138f fVar) {
        if (fVar.mo38425a()) {
            return zzc.m44133a(fVar.mo38428d());
        }
        if (fVar.mo38426b()) {
            return C15130cw.m43955a(fVar.mo38427c());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    /* renamed from: a */
    public static C15139g m43644a(Activity activity) {
        return m43645a(new C15138f(activity));
    }

    protected LifecycleCallback(C15139g gVar) {
        this.f38934a = gVar;
    }

    /* renamed from: a */
    public final Activity mo38276a() {
        return this.f38934a.mo38382a();
    }
}
