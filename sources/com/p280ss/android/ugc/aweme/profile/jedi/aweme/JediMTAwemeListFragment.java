package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediMTAwemeListFragment */
public final class JediMTAwemeListFragment extends JediAwemeListFragment {

    /* renamed from: L */
    public static final C35953a f94125L = new C35953a(null);

    /* renamed from: Q */
    private HashMap f94126Q;

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediMTAwemeListFragment$a */
    public static final class C35953a {
        private C35953a() {
        }

        public /* synthetic */ C35953a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static JediMTAwemeListFragment m115892a(int i, int i2, String str, String str2, boolean z, boolean z2) {
            C7573i.m23587b(str, "userID");
            JediMTAwemeListFragment jediMTAwemeListFragment = new JediMTAwemeListFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("type", i2);
            bundle.putString("uid", str);
            bundle.putString("sec_user_id", str2);
            bundle.putBoolean("is_my_profile", z);
            bundle.putInt("bottom_bar_height", i);
            bundle.putBoolean("should_refresh_on_init_data", z2);
            jediMTAwemeListFragment.setArguments(bundle);
            return jediMTAwemeListFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.JediMTAwemeListFragment$b */
    static final class C35954b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ JediMTAwemeListFragment f94127a;

        C35954b(JediMTAwemeListFragment jediMTAwemeListFragment) {
            this.f94127a = jediMTAwemeListFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f94127a.mo90811A();
        }
    }

    /* renamed from: b */
    public static final JediMTAwemeListFragment m115886b(int i, int i2, String str, String str2, boolean z, boolean z2) {
        return C35953a.m115892a(i, i2, str, str2, z, z2);
    }

    /* renamed from: B */
    public final void mo90812B() {
        if (this.f94126Q != null) {
            this.f94126Q.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final int mo90839m() {
        return R.layout.fragment_aweme_list_mus;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo90812B();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo90840n() {
        if (this.f93955s || this.f93954r) {
            mo90846q();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0118  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90845p() {
        /*
            r5 = this;
            boolean r0 = r5.f93955s
            r1 = 2131825014(0x7f111176, float:1.9282872E38)
            r2 = 1
            if (r0 == 0) goto L_0x0076
            int r0 = r5.mo90851w()
            if (r0 != 0) goto L_0x0013
            r1 = 2131822940(0x7f11095c, float:1.9278666E38)
            goto L_0x0083
        L_0x0013:
            int r0 = r5.mo90851w()
            if (r0 != r2) goto L_0x006b
            boolean r0 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136767b()
            if (r0 == 0) goto L_0x0020
            goto L_0x0083
        L_0x0020:
            com.ss.android.ugc.aweme.app.u r0 = com.p280ss.android.ugc.aweme.app.C23060u.m75742a()
            java.lang.String r1 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.app.bl r0 = r0.mo60076f()
            java.lang.String r1 = "CommonSharePrefCache.ins…redLikeSelfVisibleSetting"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.Object r0 = r0.mo59877d()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0042
            r1 = 2131823425(0x7f110b41, float:1.927965E38)
            goto L_0x0083
        L_0x0042:
            com.ss.android.ugc.aweme.app.u r0 = com.p280ss.android.ugc.aweme.app.C23060u.m75742a()
            java.lang.String r1 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.app.bl r0 = r0.mo60075e()
            java.lang.String r1 = "CommonSharePrefCache.ins….whoCanSeeMyLikeListValue"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.Object r0 = r0.mo59877d()
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x005d
            goto L_0x0067
        L_0x005d:
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x0067
            r1 = 2131824244(0x7f110e74, float:1.928131E38)
            goto L_0x0083
        L_0x0067:
            r1 = 2131824245(0x7f110e75, float:1.9281312E38)
            goto L_0x0083
        L_0x006b:
            int r0 = r5.mo90851w()
            r3 = 2
            if (r0 != r3) goto L_0x0083
            r1 = 2131827120(0x7f1119b0, float:1.9287144E38)
            goto L_0x0083
        L_0x0076:
            int r0 = r5.mo90851w()
            if (r0 != 0) goto L_0x0080
            r1 = 2131829283(0x7f112223, float:1.929153E38)
            goto L_0x0083
        L_0x0080:
            r1 = 2131829278(0x7f11221e, float:1.929152E38)
        L_0x0083:
            android.content.Context r0 = r5.getContext()
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r0 = com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a.m31631a(r0)
            r5.f93945i = r0
            r0 = 2131824430(0x7f110f2e, float:1.9281688E38)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.m115887c(r0)
            r5.m115887c(r1)
            boolean r3 = r5.f93955s
            r4 = 0
            if (r3 == 0) goto L_0x00db
            int r3 = r5.mo90851w()
            if (r3 != r2) goto L_0x00db
            boolean r3 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136767b()
            if (r3 != 0) goto L_0x00f4
            com.ss.android.ugc.aweme.app.u r1 = com.p280ss.android.ugc.aweme.app.C23060u.m75742a()
            java.lang.String r3 = "CommonSharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            com.ss.android.ugc.aweme.app.bl r1 = r1.mo60075e()
            java.lang.String r3 = "CommonSharePrefCache.ins….whoCanSeeMyLikeListValue"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            java.lang.Object r1 = r1.mo59877d()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x00c3
            goto L_0x00d2
        L_0x00c3:
            int r1 = r1.intValue()
            if (r1 != 0) goto L_0x00d2
            android.content.Context r1 = r5.getContext()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r5.mo90813a(r1, r4)
            goto L_0x00f8
        L_0x00d2:
            android.content.Context r1 = r5.getContext()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r5.mo90813a(r1, r2)
            goto L_0x00f8
        L_0x00db:
            boolean r3 = r5.f93955s
            if (r3 != 0) goto L_0x00f4
            int r3 = r5.mo90851w()
            if (r3 != r2) goto L_0x00f4
            boolean r2 = com.p280ss.android.ugc.aweme.utils.C43122ff.m136767b()
            if (r2 != 0) goto L_0x00f4
            android.content.Context r1 = r5.getContext()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r5.mo90823b(r1, r4)
            goto L_0x00f8
        L_0x00f4:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r5.m115887c(r1)
        L_0x00f8:
            com.ss.android.ugc.aweme.profile.jedi.aweme.JediMTAwemeListFragment$b r2 = new com.ss.android.ugc.aweme.profile.jedi.aweme.JediMTAwemeListFragment$b
            r2.<init>(r5)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r2 = r5.f93945i
            if (r2 != 0) goto L_0x0109
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0109:
            android.view.View r1 = (android.view.View) r1
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r1 = r2.mo25963b(r1)
            android.view.View r0 = (android.view.View) r0
            r1.mo25966c(r0)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r5.f93944h
            if (r0 != 0) goto L_0x011b
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x011b:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r1 = r5.f93945i
            r0.setBuilder(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.jedi.aweme.JediMTAwemeListFragment.mo90845p():void");
    }

    /* renamed from: c */
    private final DmtTextView m115887c(int i) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.ss));
        dmtTextView.setTextColor(getResources().getColor(R.color.a51));
        dmtTextView.setText(i);
        return dmtTextView;
    }
}
