package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.AccountKeyBoardHelper;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22047a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22153l;
import com.p280ss.android.ugc.aweme.account.p951l.C21242e;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment */
public abstract class BaseI18nLoginFragment extends BaseAccountFlowFragment implements C22153l {

    /* renamed from: f */
    private AccountKeyBoardHelper f59006f;

    /* renamed from: g */
    private HashMap f59007g;

    /* renamed from: j */
    public C22047a f59008j;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment$a */
    public static final class C22063a implements C10797a {

        /* renamed from: a */
        final /* synthetic */ BaseI18nLoginFragment f59009a;

        C22063a(BaseI18nLoginFragment baseI18nLoginFragment) {
            this.f59009a = baseI18nLoginFragment;
        }

        /* renamed from: a */
        public final void mo25895a(View view) {
            this.f59009a.mo58429t();
        }

        /* renamed from: b */
        public final void mo25896b(View view) {
            String str;
            C22047a aVar = this.f59009a.f59008j;
            if (aVar != null) {
                str = aVar.f58969g;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C21242e.m71499a(this.f59009a.getActivity(), str, this.f59009a.mo58341f());
                return;
            }
            throw new IllegalStateException("请传pageName".toString());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment$b */
    static final class C22064b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f59010a;

        C22064b(View view) {
            this.f59010a = view;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            KeyboardUtils.m77057c(this.f59010a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment$c */
    static final class C22065c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseI18nLoginFragment f59011a;

        /* renamed from: b */
        final /* synthetic */ View f59012b;

        /* renamed from: c */
        final /* synthetic */ OnClickListener f59013c;

        C22065c(BaseI18nLoginFragment baseI18nLoginFragment, View view, OnClickListener onClickListener) {
            this.f59011a = baseI18nLoginFragment;
            this.f59012b = view;
            this.f59013c = onClickListener;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C27326a.m89578a(this.f59012b) && this.f59011a.mo58428s()) {
                if (C6405d.m19984g() == null) {
                    C6405d.m19967a((Activity) this.f59011a.getActivity());
                }
                this.f59013c.onClick(view);
            }
        }
    }

    public void ad_() {
    }

    /* renamed from: b */
    public View mo58338b(int i) {
        if (this.f59007g == null) {
            this.f59007g = new HashMap();
        }
        View view = (View) this.f59007g.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59007g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: c */
    public void mo58427c() {
    }

    /* renamed from: l */
    public boolean mo58346l() {
        return false;
    }

    /* renamed from: n */
    public void mo58347n() {
        if (this.f59007g != null) {
            this.f59007g.clear();
        }
    }

    /* renamed from: o */
    public abstract C22047a mo58416o();

    /* renamed from: p */
    public abstract int mo58417p();

    /* renamed from: q */
    public abstract void mo58418q();

    /* renamed from: r */
    public abstract void mo58419r();

    public void onDestroyView() {
        mo58418q();
        super.onDestroyView();
        mo58347n();
    }

    public void onPause() {
        super.onPause();
        AccountKeyBoardHelper accountKeyBoardHelper = this.f59006f;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.f58913b = null;
        }
    }

    public void onResume() {
        super.onResume();
        AccountKeyBoardHelper accountKeyBoardHelper = this.f59006f;
        if (accountKeyBoardHelper != null) {
            accountKeyBoardHelper.f58913b = this;
        }
    }

    /* renamed from: t */
    public void mo58429t() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    /* renamed from: s */
    public final boolean mo58428s() {
        if (C22144a.m73593a(getContext())) {
            return true;
        }
        String string = getString(R.string.cjs);
        C7573i.m23582a((Object) string, "getString(R.string.network_unavailable)");
        mo58335a(0, string);
        return false;
    }

    /* renamed from: a */
    private void mo57299a() {
        this.f59008j = mo58416o();
        if (VERSION.SDK_INT >= 19) {
            NormalTitleBar normalTitleBar = (NormalTitleBar) mo58338b(R.id.kq);
            C7573i.m23582a((Object) normalTitleBar, "baseI18nTitleBar");
            ImageView endBtn = normalTitleBar.getEndBtn();
            C7573i.m23582a((Object) endBtn, "baseI18nTitleBar.endBtn");
            Drawable drawable = endBtn.getDrawable();
            C7573i.m23582a((Object) drawable, "baseI18nTitleBar.endBtn.drawable");
            drawable.setAutoMirrored(false);
        }
        if (this.f59008j == null) {
            NormalTitleBar normalTitleBar2 = (NormalTitleBar) mo58338b(R.id.kq);
            C7573i.m23582a((Object) normalTitleBar2, "baseI18nTitleBar");
            normalTitleBar2.setVisibility(8);
            DmtTextView dmtTextView = (DmtTextView) mo58338b(R.id.kp);
            C7573i.m23582a((Object) dmtTextView, "baseI18nContentTitle");
            dmtTextView.setVisibility(8);
            DmtTextView dmtTextView2 = (DmtTextView) mo58338b(R.id.ko);
            C7573i.m23582a((Object) dmtTextView2, "baseI18nContentDesc");
            dmtTextView2.setVisibility(8);
            return;
        }
        C22047a aVar = this.f59008j;
        if (aVar == null) {
            C7573i.m23580a();
        }
        if (TextUtils.isEmpty(aVar.f58963a)) {
            NormalTitleBar normalTitleBar3 = (NormalTitleBar) mo58338b(R.id.kq);
            C7573i.m23582a((Object) normalTitleBar3, "baseI18nTitleBar");
            normalTitleBar3.setVisibility(8);
        } else {
            NormalTitleBar normalTitleBar4 = (NormalTitleBar) mo58338b(R.id.kq);
            C22047a aVar2 = this.f59008j;
            if (aVar2 == null) {
                C7573i.m23580a();
            }
            normalTitleBar4.setTitle((CharSequence) aVar2.f58963a);
            C22047a aVar3 = this.f59008j;
            if (aVar3 == null) {
                C7573i.m23580a();
            }
            if (!TextUtils.isEmpty(aVar3.f58964b)) {
                NormalTitleBar normalTitleBar5 = (NormalTitleBar) mo58338b(R.id.kq);
                C22047a aVar4 = this.f59008j;
                if (aVar4 == null) {
                    C7573i.m23580a();
                }
                normalTitleBar5.setStartText(aVar4.f58964b);
                ((NormalTitleBar) mo58338b(R.id.kq)).setStartTextSize((float) getResources().getDimensionPixelSize(R.dimen.l0));
            } else {
                C22047a aVar5 = this.f59008j;
                if (aVar5 == null) {
                    C7573i.m23580a();
                }
                if (aVar5.f58965c) {
                    ((NormalTitleBar) mo58338b(R.id.kq)).setStartBtnIcon(R.drawable.al0);
                } else {
                    NormalTitleBar normalTitleBar6 = (NormalTitleBar) mo58338b(R.id.kq);
                    C7573i.m23582a((Object) normalTitleBar6, "baseI18nTitleBar");
                    ImageView startBtn = normalTitleBar6.getStartBtn();
                    C7573i.m23582a((Object) startBtn, "baseI18nTitleBar.startBtn");
                    startBtn.setVisibility(8);
                }
            }
            ((NormalTitleBar) mo58338b(R.id.kq)).setOnTitleBarClickListener(new C22063a(this));
            C22047a aVar6 = this.f59008j;
            if (aVar6 == null) {
                C7573i.m23580a();
            }
            if (!aVar6.f58970h) {
                NormalTitleBar normalTitleBar7 = (NormalTitleBar) mo58338b(R.id.kq);
                C7573i.m23582a((Object) normalTitleBar7, "baseI18nTitleBar");
                ImageView endBtn2 = normalTitleBar7.getEndBtn();
                C7573i.m23582a((Object) endBtn2, "baseI18nTitleBar.endBtn");
                endBtn2.setVisibility(8);
            }
        }
        C22047a aVar7 = this.f59008j;
        if (aVar7 == null) {
            C7573i.m23580a();
        }
        if (TextUtils.isEmpty(aVar7.f58966d)) {
            DmtTextView dmtTextView3 = (DmtTextView) mo58338b(R.id.kp);
            C7573i.m23582a((Object) dmtTextView3, "baseI18nContentTitle");
            dmtTextView3.setVisibility(8);
        } else {
            DmtTextView dmtTextView4 = (DmtTextView) mo58338b(R.id.kp);
            C7573i.m23582a((Object) dmtTextView4, "baseI18nContentTitle");
            C22047a aVar8 = this.f59008j;
            if (aVar8 == null) {
                C7573i.m23580a();
            }
            dmtTextView4.setText(aVar8.f58966d);
        }
        C22047a aVar9 = this.f59008j;
        if (aVar9 == null) {
            C7573i.m23580a();
        }
        if (TextUtils.isEmpty(aVar9.f58967e)) {
            DmtTextView dmtTextView5 = (DmtTextView) mo58338b(R.id.ko);
            C7573i.m23582a((Object) dmtTextView5, "baseI18nContentDesc");
            dmtTextView5.setVisibility(8);
        } else {
            DmtTextView dmtTextView6 = (DmtTextView) mo58338b(R.id.ko);
            C7573i.m23582a((Object) dmtTextView6, "baseI18nContentDesc");
            C22047a aVar10 = this.f59008j;
            if (aVar10 == null) {
                C7573i.m23580a();
            }
            dmtTextView6.setText(aVar10.f58967e);
        }
        ((NormalTitleBar) mo58338b(R.id.kq)).mo25857a(false);
    }

    /* renamed from: a */
    public final void mo58334a(int i) {
        if (i == 0) {
            if (isViewValid()) {
                mo58418q();
            }
        } else if (i == 1 && isViewValid()) {
            mo58419r();
        }
    }

    /* renamed from: a */
    public final void mo58425a(View view, OnClickListener onClickListener) {
        C7573i.m23587b(onClickListener, "onClickListener");
        if (view != null) {
            view.setOnClickListener(new C22065c(this, view, onClickListener));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            super.onViewCreated(r4, r5)
            r3.mo57299a()
            r5 = 2131296679(0x7f0901a7, float:1.8211281E38)
            android.view.View r5 = r3.mo58338b(r5)
            com.bytedance.ies.dmt.ui.titlebar.NormalTitleBar r5 = (com.bytedance.ies.dmt.p262ui.titlebar.NormalTitleBar) r5
            java.lang.String r0 = "baseI18nTitleBar"
            kotlin.jvm.internal.C7573i.m23582a(r5, r0)
            int r5 = r5.getVisibility()
            r0 = 1
            r1 = 8
            if (r5 == r1) goto L_0x003d
            com.ss.android.ugc.aweme.account.login.v2.ui.a r5 = r3.f59008j
            if (r5 == 0) goto L_0x003d
            boolean r5 = r5.f58970h
            if (r5 != r0) goto L_0x003d
            com.ss.android.ugc.aweme.account.login.v2.ui.a r5 = r3.f59008j
            if (r5 == 0) goto L_0x0031
            java.lang.String r5 = r5.f58969g
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r5 = 0
            goto L_0x003e
        L_0x003d:
            r5 = 1
        L_0x003e:
            if (r5 == 0) goto L_0x007c
            com.ss.android.ugc.aweme.account.login.v2.ui.a r5 = r3.f59008j
            if (r5 == 0) goto L_0x0062
            boolean r5 = r5.f58968f
            if (r5 != r0) goto L_0x0062
            com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper r5 = new com.ss.android.ugc.aweme.account.login.v2.ui.AccountKeyBoardHelper
            r1 = 2131299820(0x7f090dec, float:1.8217652E38)
            android.view.View r1 = r3.mo58338b(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            java.lang.String r2 = "login_root_view"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            android.view.View r1 = (android.view.View) r1
            r2 = r3
            android.support.v4.app.Fragment r2 = (android.support.p022v4.app.Fragment) r2
            r5.<init>(r1, r2)
            r3.f59006f = r5
        L_0x0062:
            com.ss.android.ugc.aweme.account.login.v2.ui.a r5 = r3.f59008j
            if (r5 == 0) goto L_0x007b
            boolean r5 = r5.f58971i
            if (r5 != r0) goto L_0x007a
            boolean r5 = com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.AccountKeyBoardHelper.C22035a.m73321a()
            if (r5 != 0) goto L_0x007a
            com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment$b r5 = new com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment$b
            r5.<init>(r4)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r4.setOnClickListener(r5)
        L_0x007a:
            return
        L_0x007b:
            return
        L_0x007c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "请传pageName"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.BaseI18nLoginFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.b1d, viewGroup, false);
        if (inflate != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            linearLayout.addView(layoutInflater.inflate(mo58417p(), linearLayout, false));
            return linearLayout;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout");
    }
}
