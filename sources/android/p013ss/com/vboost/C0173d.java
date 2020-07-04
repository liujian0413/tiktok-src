package android.p013ss.com.vboost;

import android.os.Bundle;
import android.p013ss.com.vboost.C0170b.C0171a;
import android.p013ss.com.vboost.p014a.C0167a;
import android.p013ss.com.vboost.p014a.C0168b;
import android.p013ss.com.vboost.p014a.C0169c;
import android.util.SparseIntArray;
import com.p280ss.android.agilelogger.ALog;

/* renamed from: android.ss.com.vboost.d */
public class C0173d {

    /* renamed from: a */
    private static volatile C0173d f396a;

    /* renamed from: b */
    private SparseIntArray f397b = new SparseIntArray();

    /* renamed from: c */
    private C0169c f398c = new C0168b();

    /* renamed from: a */
    public final C0171a mo369a() {
        try {
            return this.f398c instanceof C0167a ? null : null;
        } catch (Throwable unused) {
        }
    }

    private C0173d() {
    }

    /* renamed from: b */
    public static C0173d m477b() {
        if (f396a == null) {
            synchronized (C0173d.class) {
                if (f396a == null) {
                    f396a = new C0173d();
                }
            }
        }
        return f396a;
    }

    /* renamed from: a */
    public final boolean mo370a(C0172c cVar, Status status) {
        return m476a(cVar, status, null);
    }

    /* renamed from: a */
    private synchronized boolean m476a(C0172c cVar, Status status, Bundle bundle) {
        if (this.f398c == null) {
            ALog.m20867c("KitManager", "register fail");
            return false;
        }
        try {
            if (this.f397b.get(cVar.mo368a()) != status.getStatus()) {
                this.f397b.put(cVar.mo368a(), status.getStatus());
                return false;
            }
        } catch (Throwable unused) {
        }
        return false;
    }
}
