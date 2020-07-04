package android.support.p029v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p029v7.app.ActionBarDrawerToggle.C1068a;
import android.support.p029v7.view.C1153b;
import android.support.p029v7.view.C1153b.C1154a;
import android.support.p029v7.widget.C1371az;
import android.support.p029v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: android.support.v7.app.c */
public abstract class C1107c {

    /* renamed from: a */
    private static int f3973a = -1;

    C1107c() {
    }

    /* renamed from: k */
    public static int m4901k() {
        return f3973a;
    }

    /* renamed from: a */
    public abstract ActionBar mo4282a();

    /* renamed from: a */
    public abstract C1153b mo4285a(C1154a aVar);

    /* renamed from: a */
    public abstract <T extends View> T mo4286a(int i);

    /* renamed from: a */
    public abstract void mo4288a(Configuration configuration);

    /* renamed from: a */
    public abstract void mo4289a(Bundle bundle);

    /* renamed from: a */
    public abstract void mo4291a(Toolbar toolbar);

    /* renamed from: a */
    public abstract void mo4292a(View view);

    /* renamed from: a */
    public abstract void mo4293a(View view, LayoutParams layoutParams);

    /* renamed from: a */
    public abstract void mo4294a(CharSequence charSequence);

    /* renamed from: b */
    public abstract MenuInflater mo4297b();

    /* renamed from: b */
    public abstract void mo4298b(int i);

    /* renamed from: b */
    public abstract void mo4299b(Bundle bundle);

    /* renamed from: b */
    public abstract void mo4301b(View view, LayoutParams layoutParams);

    /* renamed from: c */
    public abstract void mo4302c();

    /* renamed from: c */
    public abstract void mo4303c(Bundle bundle);

    /* renamed from: c */
    public abstract boolean mo4304c(int i);

    /* renamed from: d */
    public abstract void mo4305d();

    /* renamed from: e */
    public abstract void mo4306e();

    /* renamed from: f */
    public abstract void mo4308f();

    /* renamed from: g */
    public abstract void mo4310g();

    /* renamed from: h */
    public abstract C1068a mo4312h();

    /* renamed from: i */
    public abstract void mo4315i();

    /* renamed from: j */
    public abstract boolean mo4316j();

    /* renamed from: a */
    public static void m4899a(boolean z) {
        C1371az.m6777a(true);
    }

    /* renamed from: d */
    public static void m4900d(int i) {
        switch (i) {
            case -1:
            case 0:
            case 1:
            case 2:
                f3973a = i;
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public static C1107c m4897a(Activity activity, C1106b bVar) {
        return new AppCompatDelegateImpl(activity, activity.getWindow(), bVar);
    }

    /* renamed from: a */
    public static C1107c m4898a(Dialog dialog, C1106b bVar) {
        return new AppCompatDelegateImpl(dialog.getContext(), dialog.getWindow(), bVar);
    }
}
