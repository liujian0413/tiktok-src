package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.ies.uikit.base.C11008b;
import com.bytedance.ies.uikit.base.C11008b.C11009a;
import com.bytedance.ies.uikit.base.C11008b.C11011c;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7585d;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bl */
public final class C25274bl {

    /* renamed from: a */
    public static final C25274bl f66633a = new C25274bl();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bl$a */
    static final class C25275a extends AbsActivity {

        /* renamed from: a */
        public static final C25275a f66634a = new C25275a();

        private C25275a() {
        }

        /* renamed from: a */
        public static final void m83066a(Activity activity) {
            C7573i.m23587b(activity, "activity");
            C11009a b = C11008b.m32270b();
            if (b != null) {
                b.mo26593b(activity);
            }
        }

        /* renamed from: b */
        public static final void m83067b(Activity activity) {
            C7573i.m23587b(activity, "activity");
            C11009a b = C11008b.m32270b();
            if (b != null) {
                b.mo26592a(activity);
            }
        }

        /* renamed from: c */
        public static final void m83068c(Activity activity) {
            C7573i.m23587b(activity, "activity");
            if (AbsActivity.mStartNum == 0) {
                C11011c d = C11008b.m32272d();
                if (d != null) {
                    d.mo26595a(false);
                }
            }
            AbsActivity.mStartNum++;
        }

        /* renamed from: d */
        public static final void m83069d(Activity activity) {
            C7573i.m23587b(activity, "activity");
            int i = AbsActivity.mStartNum - 1;
            AbsActivity.mStartNum = i;
            if (i == 0) {
                C11011c d = C11008b.m32272d();
                if (d != null) {
                    d.mo26595a(true);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bl$b */
    static final /* synthetic */ class C25276b extends FunctionReference implements C7562b<Activity, C7581n> {
        C25276b(C25275a aVar) {
            super(1, aVar);
        }

        public final String getName() {
            return "proxyPause";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C25275a.class);
        }

        public final String getSignature() {
            return "proxyPause(Landroid/app/Activity;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m83070a((Activity) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m83070a(Activity activity) {
            C7573i.m23587b(activity, "p1");
            C25275a.m83066a(activity);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bl$c */
    static final /* synthetic */ class C25277c extends FunctionReference implements C7562b<Activity, C7581n> {
        C25277c(C25275a aVar) {
            super(1, aVar);
        }

        public final String getName() {
            return "proxyResume";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C25275a.class);
        }

        public final String getSignature() {
            return "proxyResume(Landroid/app/Activity;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m83071a((Activity) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m83071a(Activity activity) {
            C7573i.m23587b(activity, "p1");
            C25275a.m83067b(activity);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bl$d */
    static final /* synthetic */ class C25278d extends FunctionReference implements C7562b<Activity, C7581n> {
        C25278d(C25275a aVar) {
            super(1, aVar);
        }

        public final String getName() {
            return "proxyStart";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C25275a.class);
        }

        public final String getSignature() {
            return "proxyStart(Landroid/app/Activity;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m83072a((Activity) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m83072a(Activity activity) {
            C7573i.m23587b(activity, "p1");
            C25275a.m83068c(activity);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bl$e */
    static final /* synthetic */ class C25279e extends FunctionReference implements C7562b<Activity, C7581n> {
        C25279e(C25275a aVar) {
            super(1, aVar);
        }

        public final String getName() {
            return "proxyStop";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(C25275a.class);
        }

        public final String getSignature() {
            return "proxyStop(Landroid/app/Activity;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m83073a((Activity) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m83073a(Activity activity) {
            C7573i.m23587b(activity, "p1");
            C25275a.m83069d(activity);
        }
    }

    private C25274bl() {
    }

    /* renamed from: a */
    public static final void m83061a(Activity activity) {
        m83062a(activity, new C25276b(C25275a.f66634a));
    }

    /* renamed from: b */
    public static final void m83063b(Activity activity) {
        m83062a(activity, new C25277c(C25275a.f66634a));
    }

    /* renamed from: c */
    public static final void m83064c(Activity activity) {
        m83062a(activity, new C25278d(C25275a.f66634a));
    }

    /* renamed from: d */
    public static final void m83065d(Activity activity) {
        m83062a(activity, new C25279e(C25275a.f66634a));
    }

    /* renamed from: a */
    private static void m83062a(Activity activity, C7562b<? super Activity, C7581n> bVar) {
        if (!(activity instanceof AbsActivity) && activity != null) {
            Class cls = activity.getClass();
            if (cls != null) {
                String canonicalName = cls.getCanonicalName();
                if (canonicalName != null && C7634n.m23721b(canonicalName, "com.rocket.", false)) {
                    bVar.invoke(activity);
                }
            }
        }
    }
}
