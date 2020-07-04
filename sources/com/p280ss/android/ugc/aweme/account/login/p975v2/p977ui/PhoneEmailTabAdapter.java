package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentStatePagerAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.PhoneEmailTabAdapter */
public final class PhoneEmailTabAdapter extends FragmentStatePagerAdapter {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f58952a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PhoneEmailTabAdapter.class), "tabFragmentsList", "getTabFragmentsList()Ljava/util/List;"))};

    /* renamed from: b */
    private final C7541d f58953b = C7546e.m23569a(C22044b.f58956a);

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.PhoneEmailTabAdapter$a */
    public static final class C22043a {

        /* renamed from: a */
        public final Fragment f58954a;

        /* renamed from: b */
        public final String f58955b;

        public C22043a(Fragment fragment, String str) {
            C7573i.m23587b(fragment, "fragment");
            C7573i.m23587b(str, "title");
            this.f58954a = fragment;
            this.f58955b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.PhoneEmailTabAdapter$b */
    static final class C22044b extends Lambda implements C7561a<List<C22043a>> {

        /* renamed from: a */
        public static final C22044b f58956a = new C22044b();

        C22044b() {
            super(0);
        }

        /* renamed from: a */
        private static List<C22043a> m73340a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m73340a();
        }
    }

    /* renamed from: a */
    private final List<C22043a> m73338a() {
        return (List) this.f58953b.getValue();
    }

    public final int getCount() {
        return m73338a().size();
    }

    public PhoneEmailTabAdapter(C0608j jVar) {
        super(jVar);
    }

    public final Fragment getItem(int i) {
        return ((C22043a) m73338a().get(i)).f58954a;
    }

    public final CharSequence getPageTitle(int i) {
        return ((C22043a) m73338a().get(i)).f58955b;
    }

    /* renamed from: a */
    public final void mo58397a(C22043a aVar) {
        C7573i.m23587b(aVar, "fragment");
        if (!m73338a().contains(aVar)) {
            m73338a().add(aVar);
        }
    }
}
