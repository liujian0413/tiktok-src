package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.content.Context;
import android.view.View;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.NullValueException;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.panel.C28648x;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.UgNewUser;
import com.p280ss.android.ugc.aweme.main.guide.C33040a.C33041a;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.w */
public final class C29021w implements C29027y {

    /* renamed from: a */
    public final UgAwemeActivitySetting f76449a;

    /* renamed from: b */
    public FissionFeedPendantView f76450b;

    /* renamed from: c */
    public final View f76451c;

    /* renamed from: d */
    public final C28648x f76452d;

    /* renamed from: e */
    public int f76453e;

    /* renamed from: f */
    public int f76454f = 3;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.w$a */
    static final class C29022a<V> implements Callable<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C29021w f76455a;

        /* renamed from: b */
        final /* synthetic */ Context f76456b;

        C29022a(C29021w wVar, Context context) {
            this.f76455a = wVar;
            this.f76456b = context;
        }

        /* renamed from: a */
        private boolean m95264a() {
            return this.f76455a.mo74349a(this.f76456b);
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(m95264a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.w$b */
    static final class C29023b<TTaskResult, TContinuationResult> implements C1591g<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ C29021w f76457a;

        /* renamed from: b */
        final /* synthetic */ Context f76458b;

        C29023b(C29021w wVar, Context context) {
            this.f76457a = wVar;
            this.f76458b = context;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x007f A[Catch:{ NullValueException -> 0x0090 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void then(bolts.C1592h<java.lang.Boolean> r9) {
            /*
                r8 = this;
                java.lang.String r0 = "task"
                kotlin.jvm.internal.C7573i.m23582a(r9, r0)
                java.lang.Object r9 = r9.mo6890e()
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                java.lang.String r0 = "shouldShow"
                kotlin.jvm.internal.C7573i.m23582a(r9, r0)
                boolean r9 = r9.booleanValue()
                r0 = 0
                if (r9 == 0) goto L_0x0090
                com.ss.android.ugc.aweme.feed.ui.w r9 = r8.f76457a
                com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView r7 = new com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView
                android.content.Context r2 = r8.f76458b
                r3 = 0
                r4 = 0
                r5 = 6
                r6 = 0
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                r9.f76450b = r7
                com.ss.android.ugc.aweme.feed.ui.w r9 = r8.f76457a
                android.view.View r9 = r9.f76451c
                boolean r9 = r9 instanceof android.widget.FrameLayout
                if (r9 == 0) goto L_0x003e
                com.ss.android.ugc.aweme.feed.ui.w r9 = r8.f76457a
                android.view.View r9 = r9.f76451c
                android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
                com.ss.android.ugc.aweme.feed.ui.w r1 = r8.f76457a
                com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView r1 = r1.f76450b
                android.view.View r1 = (android.view.View) r1
                r9.addView(r1)
            L_0x003e:
                com.ss.android.ugc.aweme.feed.ui.w r9 = r8.f76457a
                com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView r9 = r9.f76450b
                if (r9 == 0) goto L_0x004e
                com.ss.android.ugc.aweme.feed.ui.w$b$1 r1 = new com.ss.android.ugc.aweme.feed.ui.w$b$1
                r1.<init>(r8)
                kotlin.jvm.a.a r1 = (kotlin.jvm.p357a.C7561a) r1
                r9.setOnImageClickListener(r1)
            L_0x004e:
                com.ss.android.ugc.aweme.feed.ui.w r9 = r8.f76457a
                com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView r9 = r9.f76450b
                if (r9 == 0) goto L_0x005e
                com.ss.android.ugc.aweme.feed.ui.w$b$2 r1 = new com.ss.android.ugc.aweme.feed.ui.w$b$2
                r1.<init>(r8)
                kotlin.jvm.a.a r1 = (kotlin.jvm.p357a.C7561a) r1
                r9.setOnImageLoadedListener(r1)
            L_0x005e:
                com.ss.android.ugc.aweme.feed.ui.w r9 = r8.f76457a     // Catch:{ NullValueException -> 0x0090 }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting r9 = r9.f76449a     // Catch:{ NullValueException -> 0x0090 }
                if (r9 == 0) goto L_0x006f
                com.ss.android.ugc.aweme.global.config.settings.pojo.UgNewFeedPendant r9 = r9.getNewFeedPendant()     // Catch:{ NullValueException -> 0x0090 }
                if (r9 == 0) goto L_0x006f
                java.util.List r9 = r9.getResourceUrl()     // Catch:{ NullValueException -> 0x0090 }
                goto L_0x0070
            L_0x006f:
                r9 = r0
            L_0x0070:
                if (r9 == 0) goto L_0x0090
                int r1 = r9.size()     // Catch:{ NullValueException -> 0x0090 }
                r2 = 2
                if (r1 != r2) goto L_0x0090
                com.ss.android.ugc.aweme.feed.ui.w r1 = r8.f76457a     // Catch:{ NullValueException -> 0x0090 }
                com.ss.android.ugc.aweme.feed.ui.FissionFeedPendantView r1 = r1.f76450b     // Catch:{ NullValueException -> 0x0090 }
                if (r1 == 0) goto L_0x0090
                r2 = 0
                java.lang.Object r2 = r9.get(r2)     // Catch:{ NullValueException -> 0x0090 }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r2 = (com.p280ss.android.ugc.aweme.global.config.settings.pojo.UrlModel) r2     // Catch:{ NullValueException -> 0x0090 }
                r3 = 1
                java.lang.Object r9 = r9.get(r3)     // Catch:{ NullValueException -> 0x0090 }
                com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel r9 = (com.p280ss.android.ugc.aweme.global.config.settings.pojo.UrlModel) r9     // Catch:{ NullValueException -> 0x0090 }
                r1.mo73855a(r2, r9)     // Catch:{ NullValueException -> 0x0090 }
            L_0x0090:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.C29021w.C29023b.then(bolts.h):java.lang.Void");
        }
    }

    /* renamed from: b */
    private final void m95258b() {
        if (this.f76450b != null) {
            FissionFeedPendantView fissionFeedPendantView = this.f76450b;
            if (fissionFeedPendantView != null) {
                fissionFeedPendantView.mo73856b();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo74348a() {
        Aweme aj = this.f76452d.mo71904aj();
        if (C25352e.m83220c(aj) || C25352e.m83221d(aj)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo74350b(Context context) {
        if (context != null) {
            C1592h.m7853a((Callable<TResult>) new C29022a<TResult>(this, context)).mo6876a((C1591g<TResult, TContinuationResult>) new C29023b<TResult,TContinuationResult>(this, context), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public final boolean mo74349a(Context context) {
        if (context == null || this.f76449a == null || this.f76450b != null || C33041a.m106716a().mo84733c(context)) {
            return false;
        }
        try {
            if (!this.f76449a.getOverallSwitch().booleanValue() || !this.f76449a.getIsNewUser().booleanValue()) {
                return false;
            }
            UgNewFeedPendant newFeedPendant = this.f76449a.getNewFeedPendant();
            C7573i.m23582a((Object) newFeedPendant, "mActivitySetting.newFeedPendant");
            UgNewUser newUser = newFeedPendant.getNewUser();
            C7573i.m23582a((Object) newUser, "mActivitySetting.newFeedPendant.newUser");
            Integer downloadTimeLimit = newUser.getDownloadTimeLimit();
            if (downloadTimeLimit == null) {
                C7573i.m23580a();
            }
            int intValue = downloadTimeLimit.intValue();
            UgNewFeedPendant newFeedPendant2 = this.f76449a.getNewFeedPendant();
            C7573i.m23582a((Object) newFeedPendant2, "mActivitySetting.newFeedPendant");
            UgNewUser newUser2 = newFeedPendant2.getNewUser();
            C7573i.m23582a((Object) newUser2, "mActivitySetting.newFeedPendant.newUser");
            Integer activeTimeLimit = newUser2.getActiveTimeLimit();
            if (activeTimeLimit == null) {
                C7573i.m23580a();
            }
            int intValue2 = activeTimeLimit.intValue();
            Integer disappearAfter = this.f76449a.getNewFeedPendant().getDisappearAfter();
            C7573i.m23582a((Object) disappearAfter, "mActivitySetting.getNewF…ant().getDisappearAfter()");
            this.f76454f = disappearAfter.intValue();
            if (!C33041a.m106716a().mo84731a(context, intValue, intValue2)) {
                return false;
            }
            return true;
        } catch (NullValueException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo74347a(int i, int i2) {
        if (!mo74348a()) {
            m95259b(i, i2);
        } else {
            m95258b();
        }
    }

    /* renamed from: b */
    private final void m95259b(int i, int i2) {
        FissionFeedPendantView fissionFeedPendantView = this.f76450b;
        if (fissionFeedPendantView != null && !fissionFeedPendantView.getClosed()) {
            fissionFeedPendantView.mo73854a();
        }
        if (i2 > i && this.f76450b != null) {
            FissionFeedPendantView fissionFeedPendantView2 = this.f76450b;
            if (fissionFeedPendantView2 != null && fissionFeedPendantView2.getVisibility() == 0) {
                this.f76453e++;
            }
        }
        if (this.f76453e >= this.f76454f && this.f76450b != null) {
            FissionFeedPendantView fissionFeedPendantView3 = this.f76450b;
            if (fissionFeedPendantView3 != null) {
                fissionFeedPendantView3.mo73857c();
            }
        }
    }

    public C29021w(View view, C28648x xVar, UgAwemeActivitySetting ugAwemeActivitySetting) {
        C7573i.m23587b(view, "layout");
        C7573i.m23587b(xVar, "fllFeedFragmentPanel");
        this.f76449a = ugAwemeActivitySetting;
        this.f76451c = view;
        this.f76452d = xVar;
    }
}
