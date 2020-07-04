package android.support.p022v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.os.Handler;
import android.support.p022v4.util.C0903j;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: android.support.v4.app.FragmentHostCallback */
public abstract class FragmentHostCallback<E> extends C0606h {

    /* renamed from: a */
    private final int f2157a;

    /* renamed from: b */
    public final Activity f2158b;

    /* renamed from: c */
    public final Context f2159c;

    /* renamed from: d */
    public final Handler f2160d;

    /* renamed from: e */
    public final C0612l f2161e;

    /* renamed from: a */
    public View mo2351a(int i) {
        return null;
    }

    /* renamed from: a */
    public void mo2409a(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: a */
    public void mo2410a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: a */
    public boolean mo2352a() {
        return true;
    }

    /* renamed from: a */
    public boolean mo2411a(Fragment fragment) {
        return true;
    }

    /* renamed from: a */
    public boolean mo2412a(String str) {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2414b(Fragment fragment) {
    }

    /* renamed from: c */
    public void mo2415c() {
    }

    /* renamed from: d */
    public boolean mo2416d() {
        return true;
    }

    /* renamed from: e */
    public int mo2417e() {
        return this.f2157a;
    }

    /* renamed from: f */
    public abstract E mo2418f();

    /* renamed from: b */
    public LayoutInflater mo2413b() {
        return LayoutInflater.from(this.f2159c);
    }

    FragmentHostCallback(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, fragmentActivity.mHandler, 0);
    }

    /* renamed from: a */
    public void mo2407a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.f2159c.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    private FragmentHostCallback(Activity activity, Context context, Handler handler, int i) {
        this.f2161e = new C0612l();
        this.f2158b = activity;
        this.f2159c = (Context) C0903j.m3841a(context, "context == null");
        this.f2160d = (Handler) C0903j.m3841a(handler, "handler == null");
        this.f2157a = 0;
    }

    /* renamed from: a */
    public void mo2408a(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws SendIntentException {
        if (i == -1) {
            ActivityCompat.m2239a(this.f2158b, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
    }
}
