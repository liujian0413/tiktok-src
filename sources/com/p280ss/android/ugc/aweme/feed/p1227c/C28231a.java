package com.p280ss.android.ugc.aweme.feed.p1227c;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.comment.abtest.C24033a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.feed.c.a */
public class C28231a implements C28249j {

    /* renamed from: b */
    protected Activity f74355b;

    /* renamed from: c */
    protected Fragment f74356c;

    /* renamed from: d */
    public String f74357d;

    /* renamed from: e */
    public int f74358e;

    /* renamed from: f */
    protected String f74359f;

    /* renamed from: g */
    public String f74360g = "click";

    /* renamed from: h */
    public boolean f74361h;

    /* renamed from: c */
    public void mo71836c() {
        this.f74355b = null;
    }

    /* renamed from: d */
    public Activity mo71837d() {
        return this.f74355b;
    }

    /* renamed from: e */
    public Context mo71838e() {
        return this.f74355b;
    }

    /* renamed from: f */
    public Fragment mo71839f() {
        return this.f74356c;
    }

    /* renamed from: g */
    public String mo71840g() {
        return this.f74359f;
    }

    /* renamed from: n */
    public String mo71843n() {
        return this.f74357d;
    }

    /* renamed from: l */
    public final boolean mo71841l() {
        AbsFragment absFragment = (AbsFragment) mo71839f();
        if (absFragment != null) {
            return absFragment.isViewValid();
        }
        if (this.f74355b == null || this.f74355b.isFinishing()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final C0608j mo71842m() {
        AbsFragment absFragment = (AbsFragment) mo71839f();
        if (absFragment == null && (this.f74355b instanceof FragmentActivity)) {
            return ((FragmentActivity) this.f74355b).getSupportFragmentManager();
        }
        if (absFragment == null) {
            return null;
        }
        return absFragment.getChildFragmentManager();
    }

    /* renamed from: a_ */
    public void mo71835a_(String str) {
        this.f74359f = str;
    }

    /* renamed from: a */
    protected static boolean m92777a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author != null) {
            return TextUtils.equals(author.getUid(), C6861a.m21337f().getCurUser().getUid());
        }
        return false;
    }

    public C28231a(String str, int i) {
        this.f74357d = str;
        this.f74358e = i;
    }

    /* renamed from: a */
    public void mo71834a(Activity activity, Fragment fragment) {
        if (activity == null) {
            C24033a.m78868b("ATTACH ACTIVITY == NULL");
        }
        this.f74355b = activity;
        this.f74356c = fragment;
    }
}
