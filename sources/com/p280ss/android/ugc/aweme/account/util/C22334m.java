package com.p280ss.android.ugc.aweme.account.util;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;

/* renamed from: com.ss.android.ugc.aweme.account.util.m */
public final class C22334m {

    /* renamed from: com.ss.android.ugc.aweme.account.util.m$a */
    public static class C22336a {

        /* renamed from: a */
        private Class<? extends Fragment> f59603a;

        /* renamed from: b */
        private Bundle f59604b;

        /* renamed from: a */
        public final Fragment mo58753a() {
            try {
                Fragment fragment = (Fragment) this.f59603a.newInstance();
                if (!this.f59604b.isEmpty()) {
                    fragment.setArguments(this.f59604b);
                }
                return fragment;
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final C22336a mo58754a(String str, int i) {
            this.f59604b.putInt(str, i);
            return this;
        }

        /* renamed from: a */
        public final C22336a mo58755a(String str, long j) {
            this.f59604b.putLong(str, 60);
            return this;
        }

        private C22336a(Class<? extends Fragment> cls, Bundle bundle) {
            Bundle bundle2;
            this.f59603a = cls;
            if (bundle == null) {
                bundle2 = new Bundle();
            } else {
                bundle2 = (Bundle) bundle.clone();
            }
            this.f59604b = bundle2;
        }

        /* renamed from: a */
        public final C22336a mo58756a(String str, String str2) {
            this.f59604b.putString(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C22336a mo58757a(String str, boolean z) {
            this.f59604b.putBoolean(str, z);
            return this;
        }
    }

    /* renamed from: a */
    public static C22336a m73937a(Class<? extends Fragment> cls) {
        return new C22336a(cls, null);
    }

    /* renamed from: a */
    public static C22336a m73938a(Class<? extends Fragment> cls, Bundle bundle) {
        return new C22336a(cls, bundle);
    }
}
