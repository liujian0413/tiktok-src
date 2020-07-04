package com.bytedance.android.livesdkapi;

import android.content.Context;
import android.support.p022v4.app.Fragment;
import java.util.HashMap;

/* renamed from: com.bytedance.android.livesdkapi.f */
public interface C9402f {

    /* renamed from: com.bytedance.android.livesdkapi.f$a */
    public interface C9403a {
        /* renamed from: a */
        void mo9613a();

        /* renamed from: b */
        C9404b mo9614b();
    }

    /* renamed from: com.bytedance.android.livesdkapi.f$b */
    public static class C9404b {

        /* renamed from: a */
        public Context f25878a;

        /* renamed from: b */
        public Fragment f25879b;

        /* renamed from: c */
        public HashMap<String, String> f25880c = new HashMap<>();

        public C9404b(Context context, Fragment fragment) {
            this.f25878a = context;
            this.f25879b = null;
        }
    }

    /* renamed from: a */
    void mo9615a(C9403a aVar);
}
