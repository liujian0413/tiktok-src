package com.p280ss.android.ugc.aweme.main;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23084b;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.main.CleanModeManager2 */
public final class CleanModeManager2 extends C0063u {

    /* renamed from: d */
    public static final C32819a f85634d = new C32819a(null);

    /* renamed from: a */
    public final C23084b<Boolean> f85635a = new C23084b<>();

    /* renamed from: b */
    public long f85636b = 200;

    /* renamed from: c */
    public boolean f85637c;

    /* renamed from: com.ss.android.ugc.aweme.main.CleanModeManager2$a */
    public static final class C32819a {
        private C32819a() {
        }

        public /* synthetic */ C32819a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private final C23084b<Boolean> m106211a(FragmentActivity fragmentActivity) {
            return m106212b(fragmentActivity).f85635a;
        }

        /* renamed from: a */
        public final boolean mo84350a(Context context) {
            if (context instanceof FragmentActivity) {
                return m106212b((FragmentActivity) context).f85637c;
            }
            return false;
        }

        /* renamed from: b */
        private static CleanModeManager2 m106212b(FragmentActivity fragmentActivity) {
            C7573i.m23587b(fragmentActivity, "context");
            C0063u a = C0069x.m159a(fragmentActivity).mo147a(CleanModeManager2.class);
            C7573i.m23582a((Object) a, "ViewModelProviders\n     …ModeManager2::class.java)");
            return (CleanModeManager2) a;
        }

        /* renamed from: b */
        public final boolean mo84351b(Context context) {
            if (!(context instanceof FragmentActivity)) {
                return false;
            }
            Boolean bool = (Boolean) m106211a((FragmentActivity) context).getValue();
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }

    /* renamed from: a */
    public static final boolean m106209a(Context context) {
        return f85634d.mo84350a(context);
    }

    /* renamed from: b */
    public static final boolean m106210b(Context context) {
        return f85634d.mo84351b(context);
    }
}
