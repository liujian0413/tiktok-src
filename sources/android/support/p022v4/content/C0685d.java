package android.support.p022v4.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.support.p022v4.util.C0891c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.content.d */
public class C0685d<D> {

    /* renamed from: n */
    public int f2627n;

    /* renamed from: o */
    C0687b<D> f2628o;

    /* renamed from: p */
    public Context f2629p;

    /* renamed from: q */
    public boolean f2630q;

    /* renamed from: r */
    public boolean f2631r;

    /* renamed from: s */
    public boolean f2632s = true;

    /* renamed from: t */
    boolean f2633t;

    /* renamed from: u */
    boolean f2634u;

    /* renamed from: android.support.v4.content.d$a */
    public final class C0686a extends ContentObserver {
        public final boolean deliverSelfNotifications() {
            return true;
        }

        public final void onChange(boolean z) {
            C0685d.this.mo2833u();
        }

        public C0686a() {
            super(new Handler());
        }
    }

    /* renamed from: android.support.v4.content.d$b */
    public interface C0687b<D> {
        /* renamed from: a */
        void mo2488a(C0685d<D> dVar, D d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2775a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo2780b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo2792i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo2793j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo2794k() {
    }

    /* renamed from: n */
    public final void mo2825n() {
        mo2775a();
    }

    /* renamed from: p */
    public final void mo2827p() {
        this.f2631r = true;
    }

    /* renamed from: s */
    public final void mo2830s() {
        this.f2634u = false;
    }

    /* renamed from: m */
    public final boolean mo2824m() {
        return mo2780b();
    }

    /* renamed from: o */
    public final void mo2826o() {
        this.f2630q = false;
        mo2793j();
    }

    /* renamed from: t */
    public final void mo2831t() {
        if (this.f2634u) {
            mo2833u();
        }
    }

    /* renamed from: l */
    public final void mo2823l() {
        this.f2630q = true;
        this.f2632s = false;
        this.f2631r = false;
        mo2792i();
    }

    /* renamed from: q */
    public final void mo2828q() {
        mo2794k();
        this.f2632s = true;
        this.f2630q = false;
        this.f2631r = false;
        this.f2633t = false;
        this.f2634u = false;
    }

    /* renamed from: r */
    public final boolean mo2829r() {
        boolean z = this.f2633t;
        this.f2633t = false;
        this.f2634u |= z;
        return z;
    }

    /* renamed from: u */
    public void mo2833u() {
        if (this.f2630q) {
            mo2825n();
        } else {
            this.f2633t = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        C0891c.m3790a(this, sb);
        sb.append(" id=");
        sb.append(this.f2627n);
        sb.append("}");
        return sb.toString();
    }

    public C0685d(Context context) {
        this.f2629p = context.getApplicationContext();
    }

    /* renamed from: b */
    public void mo2790b(D d) {
        if (this.f2628o != null) {
            this.f2628o.mo2488a(this, d);
        }
    }

    /* renamed from: c */
    public static String m2920c(D d) {
        StringBuilder sb = new StringBuilder(64);
        C0891c.m3790a(d, sb);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo2822a(C0687b<D> bVar) {
        if (this.f2628o == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f2628o == bVar) {
            this.f2628o = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    /* renamed from: a */
    public final void mo2821a(int i, C0687b<D> bVar) {
        if (this.f2628o == null) {
            this.f2628o = bVar;
            this.f2627n = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    /* renamed from: a */
    public void mo2778a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f2627n);
        printWriter.print(" mListener=");
        printWriter.println(this.f2628o);
        if (this.f2630q || this.f2633t || this.f2634u) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f2630q);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f2633t);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f2634u);
        }
        if (this.f2631r || this.f2632s) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f2631r);
            printWriter.print(" mReset=");
            printWriter.println(this.f2632s);
        }
    }
}
