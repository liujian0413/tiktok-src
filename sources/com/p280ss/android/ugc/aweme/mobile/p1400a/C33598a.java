package com.p280ss.android.ugc.aweme.mobile.p1400a;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;

/* renamed from: com.ss.android.ugc.aweme.mobile.a.a */
public final class C33598a {

    /* renamed from: com.ss.android.ugc.aweme.mobile.a.a$a */
    public static class C33600a {

        /* renamed from: a */
        private Class<? extends Fragment> f87710a;

        /* renamed from: b */
        private Bundle f87711b;

        /* renamed from: a */
        public final Fragment mo85932a() {
            try {
                Fragment fragment = (Fragment) this.f87710a.newInstance();
                if (!this.f87711b.isEmpty()) {
                    fragment.setArguments(this.f87711b);
                }
                return fragment;
            } catch (Exception unused) {
                return null;
            }
        }

        private C33600a(Class<? extends Fragment> cls) {
            this.f87710a = cls;
            this.f87711b = new Bundle();
        }

        /* renamed from: a */
        public final C33600a mo85933a(String str, int i) {
            this.f87711b.putInt(str, i);
            return this;
        }

        /* renamed from: a */
        public final C33600a mo85934a(String str, boolean z) {
            this.f87711b.putBoolean(str, z);
            return this;
        }
    }

    /* renamed from: a */
    public static C33600a m108487a(Class<? extends Fragment> cls) {
        return new C33600a(cls);
    }
}
