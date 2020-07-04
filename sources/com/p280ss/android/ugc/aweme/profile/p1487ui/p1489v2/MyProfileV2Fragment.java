package com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.experiment.C27691f;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.EnterpriseTransformLayout;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MusMyProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.p1490a.C36581a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.p1490a.p1491a.C36584b;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.p1490a.p1492b.C36586a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.C36682q;
import com.p280ss.android.ugc.aweme.profile.util.C36728am;
import com.p280ss.android.ugc.aweme.translation.p1682ui.TranslationStatusView;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.MyProfileV2Fragment */
public final class MyProfileV2Fragment extends MusMyProfileFragment {

    /* renamed from: au */
    public static final C36576a f95977au = new C36576a(null);

    /* renamed from: at */
    public boolean f95978at;

    /* renamed from: av */
    private C36682q f95979av;

    /* renamed from: aw */
    private View f95980aw;

    /* renamed from: ax */
    private C36581a f95981ax;

    /* renamed from: ay */
    private HashMap f95982ay;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.MyProfileV2Fragment$a */
    public static final class C36576a {
        private C36576a() {
        }

        public /* synthetic */ C36576a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.MyProfileV2Fragment$b */
    static final class C36577b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MyProfileV2Fragment f95983a;

        C36577b(MyProfileV2Fragment myProfileV2Fragment) {
            this.f95983a = myProfileV2Fragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C36580a.m118033b();
            this.f95983a.f95978at = false;
            MyProfileV2Fragment myProfileV2Fragment = this.f95983a;
            C7573i.m23582a((Object) view, "view");
            myProfileV2Fragment.mo92125j(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.MyProfileV2Fragment$c */
    static final class C36578c implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ MyProfileV2Fragment f95984a;

        C36578c(MyProfileV2Fragment myProfileV2Fragment) {
            this.f95984a = myProfileV2Fragment;
        }

        public final void onDismiss() {
            int i;
            boolean z;
            TextView textView = this.f95984a.f94525K;
            C7573i.m23582a((Object) textView, "txtUserId");
            CharSequence obj = textView.getText().toString();
            int length = obj.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (obj.charAt(i) <= ' ') {
                    z = true;
                } else {
                    z = false;
                }
                if (z2) {
                    if (!z) {
                        break;
                    }
                    length--;
                } else if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            }
            String obj2 = obj.subSequence(i2, length + 1).toString();
            CharSequence charSequence = obj2;
            if (!TextUtils.isEmpty(charSequence) && C7634n.m23723c(obj2, " T", false)) {
                C7634n.m23730a(charSequence, " T", 0, false, 6, (Object) null);
                this.f95984a.mo92790p(R.drawable.a6x);
            }
        }
    }

    /* renamed from: R */
    public final void mo92342R() {
        if (this.f95982ay != null) {
            this.f95982ay.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo92342R();
    }

    /* renamed from: z */
    public final int mo91958z() {
        return this.f95981ax.mo92798a();
    }

    /* renamed from: i */
    public final void mo91877i() {
        super.mo91877i();
        this.f95981ax.mo92800a(getActivity());
    }

    public final void onResume() {
        super.onResume();
        if (this.f94797ar && this.f95978at) {
            C36580a.m118027a();
        }
    }

    /* renamed from: w */
    public final void mo91955w() {
        super.mo91955w();
        TranslationStatusView translationStatusView = this.f94523H;
        if (translationStatusView != null) {
            translationStatusView.mo104217a();
        }
    }

    public MyProfileV2Fragment() {
        C36581a aVar;
        if (ProfileNewStyleExperiment.INSTANCE.getUSE_M_NEW()) {
            aVar = new C36584b(this);
        } else {
            aVar = new C36586a(this);
        }
        this.f95981ax = aVar;
    }

    /* renamed from: s */
    public final void mo92067s() {
        if (ProfileNewStyleExperiment.INSTANCE.getUSE_T_NEW()) {
            this.f95981ax.mo92809c();
        } else {
            super.mo92067s();
        }
    }

    /* renamed from: c */
    public final void mo91944c(View view) {
        super.mo91944c(view);
        this.f95981ax.mo92807b(view);
    }

    /* renamed from: d */
    public final void mo91717d(User user) {
        super.mo91717d(user);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f94746r;
        if (enterpriseTransformLayout != null) {
            enterpriseTransformLayout.mo91999a();
        }
    }

    /* renamed from: e */
    public final void mo91722e(User user) {
        if (!ProfileNewStyleExperiment.INSTANCE.getUSE_T_NEW() || !isViewValid()) {
            super.mo91722e(user);
        } else {
            this.f95981ax.mo92805a(mo92056l(), user);
        }
        mo92059n(user);
    }

    /* renamed from: a */
    public final void mo91697a(int i) {
        super.mo91697a(i);
        Context context = getContext();
        TextView textView = this.f94520E;
        C7573i.m23582a((Object) textView, "mFollowerCount");
        float c = (float) C9738o.m28714c(context, textView.getTextSize());
        Context context2 = getContext();
        TextView textView2 = this.f94734f;
        C7573i.m23582a((Object) textView2, "mFollowerCountDesc");
        m117992b(c, (float) C9738o.m28714c(context2, textView2.getTextSize()));
    }

    /* renamed from: b */
    public final void mo91705b(int i) {
        super.mo91705b(i);
        Context context = getContext();
        TextView textView = this.f94519D;
        C7573i.m23582a((Object) textView, "mFollowingCount");
        float c = (float) C9738o.m28714c(context, textView.getTextSize());
        Context context2 = getContext();
        TextView textView2 = this.f94733e;
        C7573i.m23582a((Object) textView2, "mFollowingCountDesc");
        m117992b(c, (float) C9738o.m28714c(context2, textView2.getTextSize()));
    }

    /* renamed from: c */
    public final void mo91713c(String str) {
        super.mo91713c(str);
        User user = this.f94531Q;
        if (user != null && user.nicknameUpdateReminder() && C6399b.m19947w() && C6903bc.m21473N().mo71141a()) {
            C42961az.m136380a(new C27691f());
        }
    }

    /* renamed from: j */
    public final void mo91926j(User user) {
        String str;
        super.mo91926j(user);
        this.f95981ax.mo92802a(user, this.f94712X, this.f94711W);
        if (user != null) {
            str = user.getBioUrl();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f95981ax.mo92808b(false);
        } else {
            this.f95981ax.mo92808b(true);
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (!z && C6399b.m19947w() && this.f95979av != null) {
            C36682q qVar = this.f95979av;
            if (qVar != null && qVar.isShowing()) {
                C36682q qVar2 = this.f95979av;
                if (qVar2 != null) {
                    qVar2.dismiss();
                }
            }
        }
        if (z && this.f95978at) {
            C36580a.m118027a();
        }
    }

    /* renamed from: j */
    public final void mo92125j(View view) {
        User user = this.f94531Q;
        C7573i.m23582a((Object) user, "mUser");
        if (TextUtils.isEmpty(user.getSignature()) && !C27326a.m89578a(view)) {
            C36590b.m118071a(false);
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).switchToSignature(getActivity());
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.overridePendingTransition(R.anim.c4, R.anim.cc);
            }
        }
    }

    /* renamed from: a */
    public final void mo91700a(long j) {
        super.mo91700a(j);
        Context context = getContext();
        TextView textView = this.f94521F;
        C7573i.m23582a((Object) textView, "mDragCount");
        float c = (float) C9738o.m28714c(context, textView.getTextSize());
        Context context2 = getContext();
        TextView textView2 = this.f94735g;
        C7573i.m23582a((Object) textView2, "mDragCountDesc");
        m117992b(c, (float) C9738o.m28714c(context2, textView2.getTextSize()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0068, code lost:
        if (r8.isShowing() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d3, code lost:
        if (r8.isShowing() == false) goto L_0x00d7;
     */
    @org.greenrobot.eventbus.C7709l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onShowTTChangeUsernameBubble(com.p280ss.android.ugc.aweme.experiment.C27691f r8) {
        /*
            r7 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            boolean r8 = com.bytedance.ies.ugc.appcontext.C6399b.m19947w()
            if (r8 != 0) goto L_0x000c
            return
        L_0x000c:
            com.ss.android.ugc.aweme.profile.c r8 = com.p280ss.android.ugc.aweme.C6903bc.m21473N()
            boolean r8 = r8.mo71141a()
            if (r8 != 0) goto L_0x0017
            return
        L_0x0017:
            android.support.v4.app.FragmentActivity r8 = r7.getActivity()
            if (r8 == 0) goto L_0x00de
            android.view.View r8 = r7.getView()
            if (r8 == 0) goto L_0x00de
            boolean r8 = r7.isViewValid()
            if (r8 == 0) goto L_0x00de
            com.ss.android.ugc.aweme.profile.model.User r8 = r7.f94531Q
            if (r8 != 0) goto L_0x002f
            goto L_0x00de
        L_0x002f:
            com.ss.android.ugc.aweme.profile.model.User r8 = r7.f94531Q
            java.lang.String r0 = "mUser"
            kotlin.jvm.internal.C7573i.m23582a(r8, r0)
            java.lang.String r8 = r8.getUid()
            java.lang.String r0 = "mUser.uid"
            kotlin.jvm.internal.C7573i.m23582a(r8, r0)
            r0 = 0
            long r0 = com.p280ss.android.ugc.aweme.experiment.C27693h.m90844a(r8, r0)
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r2 - r0
            r4 = 604800000(0x240c8400, double:2.988109026E-315)
            r8 = 1
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0055
            r0 = 1
            goto L_0x0056
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x00c7
            boolean r0 = r7.f94797ar
            if (r0 == 0) goto L_0x00b0
            com.ss.android.ugc.aweme.profile.ui.widget.q r8 = r7.f95979av
            if (r8 == 0) goto L_0x006c
            com.ss.android.ugc.aweme.profile.ui.widget.q r8 = r7.f95979av
            if (r8 == 0) goto L_0x006b
            boolean r8 = r8.isShowing()
            if (r8 != 0) goto L_0x00dd
            goto L_0x006c
        L_0x006b:
            return
        L_0x006c:
            com.ss.android.ugc.aweme.profile.ui.widget.q r8 = new com.ss.android.ugc.aweme.profile.ui.widget.q
            android.support.v4.app.FragmentActivity r0 = r7.getActivity()
            if (r0 != 0) goto L_0x0077
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0077:
            java.lang.String r1 = "activity!!"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.app.Activity r0 = (android.app.Activity) r0
            r8.<init>(r0)
            r7.f95979av = r8
            com.ss.android.ugc.aweme.profile.ui.widget.q r8 = r7.f95979av
            if (r8 == 0) goto L_0x0091
            com.ss.android.ugc.aweme.profile.ui.v2.MyProfileV2Fragment$c r0 = new com.ss.android.ugc.aweme.profile.ui.v2.MyProfileV2Fragment$c
            r0.<init>(r7)
            android.widget.PopupWindow$OnDismissListener r0 = (android.widget.PopupWindow.OnDismissListener) r0
            r8.setOnDismissListener(r0)
        L_0x0091:
            com.ss.android.ugc.aweme.profile.ui.widget.q r8 = r7.f95979av
            if (r8 == 0) goto L_0x009c
            android.widget.TextView r0 = r7.f94525K
            android.view.View r0 = (android.view.View) r0
            r8.mo93020a(r0)
        L_0x009c:
            com.ss.android.ugc.aweme.profile.model.User r8 = r7.f94531Q
            java.lang.String r0 = "mUser"
            kotlin.jvm.internal.C7573i.m23582a(r8, r0)
            java.lang.String r8 = r8.getUid()
            java.lang.String r0 = "mUser.uid"
            kotlin.jvm.internal.C7573i.m23582a(r8, r0)
            com.p280ss.android.ugc.aweme.experiment.C27693h.m90845b(r8, r2)
            return
        L_0x00b0:
            com.ss.android.ugc.aweme.profile.ui.widget.q r0 = r7.f95979av
            if (r0 == 0) goto L_0x00c6
            com.ss.android.ugc.aweme.profile.ui.widget.q r0 = r7.f95979av
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r0.isShowing()
            if (r0 != r8) goto L_0x00c6
            com.ss.android.ugc.aweme.profile.ui.widget.q r8 = r7.f95979av
            if (r8 == 0) goto L_0x00c6
            r8.dismiss()
            goto L_0x00dd
        L_0x00c6:
            return
        L_0x00c7:
            com.ss.android.ugc.aweme.profile.ui.widget.q r8 = r7.f95979av
            if (r8 == 0) goto L_0x00d7
            com.ss.android.ugc.aweme.profile.ui.widget.q r8 = r7.f95979av
            if (r8 == 0) goto L_0x00d6
            boolean r8 = r8.isShowing()
            if (r8 != 0) goto L_0x00dd
            goto L_0x00d7
        L_0x00d6:
            return
        L_0x00d7:
            r8 = 2131231967(0x7f0804df, float:1.808003E38)
            r7.mo92790p(r8)
        L_0x00dd:
            return
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.MyProfileV2Fragment.onShowTTChangeUsernameBubble(com.ss.android.ugc.aweme.experiment.f):void");
    }

    /* renamed from: p */
    public final void mo92790p(int i) {
        String str;
        if (!(this.f94531Q == null || !isViewValid() || this.f94525K == null)) {
            if (TextUtils.isEmpty(this.f94531Q.getUniqueId())) {
                str = this.f94531Q.getShortId();
            } else {
                str = this.f94531Q.getUniqueId();
            }
            StringBuilder sb = new StringBuilder("@");
            sb.append(str);
            String sb2 = sb.toString();
            TextView textView = this.f94525K;
            C7573i.m23582a((Object) textView, "txtUserId");
            textView.setText(sb2);
            mo92080L();
            if (this.f94531Q != null) {
                User user = this.f94531Q;
                C7573i.m23582a((Object) user, "mUser");
                if (!user.isSecret() && this.f94531Q.nicknameUpdateReminder()) {
                    String str2 = " T";
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    TextView textView2 = this.f94525K;
                    C7573i.m23582a((Object) textView2, "txtUserId");
                    spannableStringBuilder.append(textView2.getText());
                    spannableStringBuilder.append(str2);
                    spannableStringBuilder.setSpan(new C36728am(getContext(), R.drawable.a6x, 1), (spannableStringBuilder.length() - str2.length()) + 1, spannableStringBuilder.length(), 17);
                    TextView textView3 = this.f94525K;
                    C7573i.m23582a((Object) textView3, "txtUserId");
                    textView3.setText(spannableStringBuilder);
                    this.f94525K.setTextColor(getResources().getColor(R.color.ac9));
                    return;
                }
            }
            this.f94525K.setTextColor(getResources().getColor(R.color.ac8));
        }
    }

    /* renamed from: a */
    public final void mo91699a(int i, String str) {
        TextView textView = this.f94522G;
        if (textView != null) {
            textView.setOnClickListener(null);
        }
        if (C43122ff.m136767b() || !TextUtils.isEmpty(str) || !C36590b.m118072a()) {
            super.mo91699a(i, str);
        } else {
            this.f95978at = true;
            TextView textView2 = this.f94522G;
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setText(getResources().getString(R.string.ct8));
                textView2.setOnClickListener(new C36577b(this));
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        this.f95981ax.mo92801a(view);
        this.f95980aw = view.findViewById(R.id.dk3);
        if (ProfileNewStyleExperiment.INSTANCE.getUSE_T_NEW()) {
            TextView textView = this.mTitle;
            C7573i.m23582a((Object) textView, "mTitle");
            textView.setAlpha(0.0f);
            TextView textView2 = this.mTitle;
            C7573i.m23582a((Object) textView2, "mTitle");
            textView2.setVisibility(4);
            View view2 = this.f95980aw;
            if (view2 != null) {
                view2.setAlpha(0.0f);
            }
            View view3 = this.f95980aw;
            if (view3 != null) {
                view3.setVisibility(4);
            }
        }
    }

    /* renamed from: b */
    private final void m117992b(float f, float f2) {
        while (true) {
            f -= 1.0f;
            f2 -= 1.0f;
            float a = ((float) C9738o.m28691a(getContext())) - C9738o.m28708b(getContext(), 76.0f);
            TextView textView = this.f94733e;
            C7573i.m23582a((Object) textView, "mFollowingCountDesc");
            TextPaint paint = textView.getPaint();
            TextView textView2 = this.f94733e;
            C7573i.m23582a((Object) textView2, "mFollowingCountDesc");
            float measureText = paint.measureText(textView2.getText().toString());
            TextView textView3 = this.f94734f;
            C7573i.m23582a((Object) textView3, "mFollowerCountDesc");
            TextPaint paint2 = textView3.getPaint();
            TextView textView4 = this.f94734f;
            C7573i.m23582a((Object) textView4, "mFollowerCountDesc");
            float measureText2 = paint2.measureText(textView4.getText().toString());
            TextView textView5 = this.f94735g;
            C7573i.m23582a((Object) textView5, "mDragCountDesc");
            TextPaint paint3 = textView5.getPaint();
            TextView textView6 = this.f94735g;
            C7573i.m23582a((Object) textView6, "mDragCountDesc");
            float measureText3 = paint3.measureText(textView6.getText().toString());
            TextView textView7 = this.f94519D;
            C7573i.m23582a((Object) textView7, "mFollowingCount");
            TextPaint paint4 = textView7.getPaint();
            TextView textView8 = this.f94519D;
            C7573i.m23582a((Object) textView8, "mFollowingCount");
            float measureText4 = paint4.measureText(textView8.getText().toString());
            TextView textView9 = this.f94520E;
            C7573i.m23582a((Object) textView9, "mFollowerCount");
            TextPaint paint5 = textView9.getPaint();
            TextView textView10 = this.f94520E;
            C7573i.m23582a((Object) textView10, "mFollowerCount");
            float measureText5 = paint5.measureText(textView10.getText().toString());
            TextView textView11 = this.f94521F;
            C7573i.m23582a((Object) textView11, "mDragCount");
            TextPaint paint6 = textView11.getPaint();
            TextView textView12 = this.f94521F;
            C7573i.m23582a((Object) textView12, "mDragCount");
            if (measureText + measureText2 + measureText3 + measureText4 + measureText5 + paint6.measureText(textView12.getText().toString()) > a) {
                this.f94519D.setTextSize(1, f);
                this.f94520E.setTextSize(1, f);
                this.f94521F.setTextSize(1, f);
                this.f94733e.setTextSize(1, f2);
                this.f94734f.setTextSize(1, f2);
                this.f94735g.setTextSize(1, f2);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo61702b(int i, int i2) {
        super.mo61702b(i, i2);
        if (ProfileNewStyleExperiment.INSTANCE.getUSE_T_NEW()) {
            float e = (float) this.f95981ax.mo92811e();
            float f = (float) i;
            float d = (f - e) / (((float) this.f95981ax.mo92810d()) - e);
            float f2 = f / e;
            if (d < 0.0f) {
                TextView textView = this.mTitle;
                C7573i.m23582a((Object) textView, "mTitle");
                textView.setVisibility(4);
                View view = this.f95980aw;
                if (view != null) {
                    view.setVisibility(4);
                }
                d = 0.0f;
            } else if (d > 1.0f) {
                d = 1.0f;
            }
            if (f2 < 0.0f) {
                View view2 = this.f95980aw;
                if (view2 != null) {
                    view2.setVisibility(4);
                }
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            if (d > 0.0f) {
                TextView textView2 = this.mTitle;
                C7573i.m23582a((Object) textView2, "mTitle");
                textView2.setVisibility(0);
            }
            if (f2 > 0.0f) {
                View view3 = this.f95980aw;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
            }
            float f3 = 1.0f - d;
            if (f3 > 0.0f) {
                View f4 = this.f95981ax.mo92812f();
                if (f4 != null) {
                    f4.setVisibility(0);
                }
            } else if (f3 == 0.0f) {
                View f5 = this.f95981ax.mo92812f();
                if (f5 != null) {
                    f5.setVisibility(4);
                }
            }
            TextView textView3 = this.mTitle;
            C7573i.m23582a((Object) textView3, "mTitle");
            textView3.setAlpha(d);
            View view4 = this.f95980aw;
            if (view4 != null) {
                view4.setAlpha(f2);
            }
            View f6 = this.f95981ax.mo92812f();
            if (f6 != null) {
                f6.setAlpha(f3);
            }
        }
    }

    /* renamed from: a */
    public final void mo91703a(String str, int i, BlueVBrandInfo blueVBrandInfo, User user) {
        super.mo91703a(str, i, blueVBrandInfo, user);
        if (isViewValid()) {
            this.f95981ax.mo92803a(str);
        }
    }
}
