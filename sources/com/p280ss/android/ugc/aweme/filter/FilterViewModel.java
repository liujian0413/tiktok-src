package com.p280ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterViewModel */
public class FilterViewModel extends C0063u {

    /* renamed from: a */
    private C0052o<Object> f77073a;

    /* renamed from: b */
    private C0052o<C29296g> f77074b;

    /* renamed from: c */
    private C0052o<C29296g> f77075c;

    /* renamed from: d */
    private C0052o<Boolean> f77076d;

    /* renamed from: d */
    private C0052o<C29296g> m95789d() {
        if (this.f77075c == null) {
            this.f77075c = new C0052o<>();
        }
        return this.f77075c;
    }

    /* renamed from: a */
    public final C0052o<Object> mo74770a() {
        if (this.f77073a == null) {
            this.f77073a = new C0052o<>();
        }
        return this.f77073a;
    }

    /* renamed from: b */
    public final C0052o<C29296g> mo74771b() {
        if (this.f77074b == null) {
            this.f77074b = new C0052o<>();
        }
        return this.f77074b;
    }

    /* renamed from: c */
    public final C0052o<Boolean> mo74772c() {
        if (this.f77076d == null) {
            this.f77076d = new C0052o<>();
            this.f77076d.setValue(Boolean.valueOf(C35574k.m114859a().mo70091f().mo93342a(Property.DisableFilter)));
        }
        return this.f77076d;
    }

    /* renamed from: a */
    public static void m95782a(AppCompatActivity appCompatActivity) {
        ((FilterViewModel) C0069x.m159a((FragmentActivity) appCompatActivity).mo147a(FilterViewModel.class)).mo74770a().setValue(null);
    }

    /* renamed from: b */
    public static void m95786b(AppCompatActivity appCompatActivity, C0053p<C29296g> pVar) {
        ((FilterViewModel) C0069x.m159a((FragmentActivity) appCompatActivity).mo147a(FilterViewModel.class)).m95789d().observe(appCompatActivity, pVar);
    }

    /* renamed from: c */
    public static void m95788c(AppCompatActivity appCompatActivity, C0053p<Boolean> pVar) {
        ((FilterViewModel) C0069x.m159a((FragmentActivity) appCompatActivity).mo147a(FilterViewModel.class)).mo74772c().observe(appCompatActivity, pVar);
    }

    /* renamed from: a */
    public static void m95783a(AppCompatActivity appCompatActivity, C0053p<C29296g> pVar) {
        ((FilterViewModel) C0069x.m159a((FragmentActivity) appCompatActivity).mo147a(FilterViewModel.class)).mo74771b().observe(appCompatActivity, pVar);
    }

    /* renamed from: b */
    public static void m95787b(AppCompatActivity appCompatActivity, C29296g gVar) {
        ((FilterViewModel) C0069x.m159a((FragmentActivity) appCompatActivity).mo147a(FilterViewModel.class)).m95789d().postValue(gVar);
    }

    /* renamed from: a */
    public static void m95784a(AppCompatActivity appCompatActivity, C29296g gVar) {
        ((FilterViewModel) C0069x.m159a((FragmentActivity) appCompatActivity).mo147a(FilterViewModel.class)).mo74771b().postValue(gVar);
    }

    /* renamed from: a */
    public static void m95785a(AppCompatActivity appCompatActivity, Boolean bool) {
        ((FilterViewModel) C0069x.m159a((FragmentActivity) appCompatActivity).mo147a(FilterViewModel.class)).mo74772c().setValue(bool);
    }
}
