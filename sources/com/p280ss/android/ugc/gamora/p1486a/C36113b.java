package com.p280ss.android.ugc.gamora.p1486a;

import android.arch.lifecycle.C0030aa;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0065w.C0067b;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.jedi.arch.C11664n;
import com.bytedance.jedi.arch.JediViewModel;

/* renamed from: com.ss.android.ugc.gamora.a.b */
public final class C36113b {

    /* renamed from: com.ss.android.ugc.gamora.a.b$a */
    static class C36115a implements C0067b {
        private C36115a() {
        }

        /* renamed from: a */
        static final /* synthetic */ Object m116289a(Object obj) {
            return obj;
        }

        /* renamed from: a */
        public final <T extends C0063u> T mo149a(Class<T> cls) {
            try {
                T t = (C0063u) cls.newInstance();
                if (t instanceof JediViewModel) {
                    JediViewModel jediViewModel = (JediViewModel) t;
                    C11664n a = jediViewModel.f31065b.mo29189a(cls);
                    if (a != null) {
                        a.binding(jediViewModel);
                    }
                    jediViewModel.mo29034a(C36116c.f94417a);
                }
                return t;
            } catch (InstantiationException e) {
                StringBuilder sb = new StringBuilder("Cannot create an instance of ");
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder("Cannot create an instance of ");
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            }
        }
    }

    /* renamed from: a */
    public static C36112a m116288a(FragmentActivity fragmentActivity) {
        if (fragmentActivity.getApplication() != null) {
            return new C36112a(C0030aa.m80a(fragmentActivity), new C36115a());
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }
}
