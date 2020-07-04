package android.support.p022v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: android.support.v4.app.i */
public final class C0607i {

    /* renamed from: a */
    private final FragmentHostCallback<?> f2390a;

    /* renamed from: a */
    public final boolean mo2624a(Menu menu, MenuInflater menuInflater) {
        return this.f2390a.f2161e.mo2683a(menu, menuInflater);
    }

    /* renamed from: a */
    public final boolean mo2625a(MenuItem menuItem) {
        return this.f2390a.f2161e.mo2684a(menuItem);
    }

    /* renamed from: b */
    public final void mo2626b() {
        this.f2390a.f2161e.mo2704m();
    }

    /* renamed from: e */
    public final void mo2632e() {
        this.f2390a.f2161e.mo2705n();
    }

    /* renamed from: f */
    public final void mo2633f() {
        this.f2390a.f2161e.mo2706o();
    }

    /* renamed from: g */
    public final void mo2634g() {
        this.f2390a.f2161e.mo2709p();
    }

    /* renamed from: h */
    public final void mo2635h() {
        this.f2390a.f2161e.mo2710q();
    }

    /* renamed from: i */
    public final void mo2636i() {
        this.f2390a.f2161e.mo2711r();
    }

    /* renamed from: j */
    public final void mo2637j() {
        this.f2390a.f2161e.mo2712s();
    }

    /* renamed from: k */
    public final void mo2638k() {
        this.f2390a.f2161e.mo2715u();
    }

    /* renamed from: l */
    public final void mo2639l() {
        this.f2390a.f2161e.mo2716v();
    }

    /* renamed from: c */
    public final Parcelable mo2630c() {
        return this.f2390a.f2161e.mo2703l();
    }

    /* renamed from: d */
    public final C0632p mo2631d() {
        return this.f2390a.f2161e.mo2702k();
    }

    /* renamed from: m */
    public final boolean mo2640m() {
        return this.f2390a.f2161e.mo2701j();
    }

    /* renamed from: a */
    public final C0608j mo2617a() {
        return this.f2390a.f2161e;
    }

    private C0607i(FragmentHostCallback<?> fragmentHostCallback) {
        this.f2390a = fragmentHostCallback;
    }

    /* renamed from: a */
    public static C0607i m2538a(FragmentHostCallback<?> fragmentHostCallback) {
        return new C0607i(fragmentHostCallback);
    }

    /* renamed from: a */
    public final Fragment mo2616a(String str) {
        return this.f2390a.f2161e.mo2686b(str);
    }

    /* renamed from: b */
    public final void mo2627b(Menu menu) {
        this.f2390a.f2161e.mo2690b(menu);
    }

    /* renamed from: b */
    public final void mo2628b(boolean z) {
        this.f2390a.f2161e.mo2691b(z);
    }

    /* renamed from: b */
    public final boolean mo2629b(MenuItem menuItem) {
        return this.f2390a.f2161e.mo2693b(menuItem);
    }

    /* renamed from: a */
    public final void mo2619a(Configuration configuration) {
        this.f2390a.f2161e.mo2674a(configuration);
    }

    /* renamed from: a */
    public final void mo2621a(Fragment fragment) {
        this.f2390a.f2161e.mo2678a((FragmentHostCallback) this.f2390a, (C0606h) this.f2390a, (Fragment) null);
    }

    /* renamed from: a */
    public final void mo2622a(boolean z) {
        this.f2390a.f2161e.mo2681a(z);
    }

    /* renamed from: a */
    public final boolean mo2623a(Menu menu) {
        return this.f2390a.f2161e.mo2682a(menu);
    }

    /* renamed from: a */
    public final void mo2620a(Parcelable parcelable, C0632p pVar) {
        this.f2390a.f2161e.mo2675a(parcelable, pVar);
    }

    /* renamed from: a */
    public final View mo2618a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2390a.f2161e.onCreateView(view, str, context, attributeSet);
    }
}
