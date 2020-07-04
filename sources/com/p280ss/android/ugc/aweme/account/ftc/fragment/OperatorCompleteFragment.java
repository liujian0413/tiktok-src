package com.p280ss.android.ugc.aweme.account.ftc.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21319a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.views.C22364b;
import com.p280ss.android.ugc.aweme.account.views.C22367e;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.main.p1385g.C33023i;
import com.p280ss.android.ugc.aweme.main.p1385g.C33038x;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.account.ftc.fragment.OperatorCompleteFragment */
public final class OperatorCompleteFragment extends AmeBaseFragment implements C21319a {

    /* renamed from: e */
    public static final C21187a f56965e = new C21187a(null);

    /* renamed from: f */
    private HashMap f56966f;

    /* renamed from: com.ss.android.ugc.aweme.account.ftc.fragment.OperatorCompleteFragment$a */
    public static final class C21187a {
        private C21187a() {
        }

        public /* synthetic */ C21187a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ftc.fragment.OperatorCompleteFragment$b */
    static final class C21188b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OperatorCompleteFragment f56967a;

        /* renamed from: b */
        final /* synthetic */ AgeGateResponse f56968b;

        C21188b(OperatorCompleteFragment operatorCompleteFragment, AgeGateResponse ageGateResponse) {
            this.f56967a = operatorCompleteFragment;
            this.f56968b = ageGateResponse;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            String str = "age_gate_complete_click";
            int i = 1;
            C21102b a = C21102b.m71165a().mo56946a("enter_method", "pop_up").mo56944a("pass_export", 1);
            String str2 = "pass_gate";
            AgeGateResponse ageGateResponse = this.f56968b;
            if (ageGateResponse == null || !ageGateResponse.is_eligible()) {
                i = 0;
            }
            C6907h.m21524a(str, (Map) a.mo56944a(str2, i).f56672a);
            FragmentActivity activity = this.f56967a.getActivity();
            if (activity != null) {
                activity.setResult(-1);
            }
            AgeGateResponse ageGateResponse2 = this.f56968b;
            if (ageGateResponse2 == null || ageGateResponse2.is_eligible()) {
                C21671bd.m72538f().notifyFinish();
            } else {
                Intent a2 = ((C33023i) C21671bd.m72521a(C33023i.class)).mo60019a();
                a2.setFlags(268468224);
                this.f56967a.startActivity(a2);
            }
            FragmentActivity activity2 = this.f56967a.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ftc.fragment.OperatorCompleteFragment$c */
    public static final class C21189c extends C22367e {

        /* renamed from: a */
        final /* synthetic */ OperatorCompleteFragment f56969a;

        /* renamed from: b */
        final /* synthetic */ int f56970b;

        /* renamed from: c */
        final /* synthetic */ int f56971c;

        public final void onClick(View view) {
            C7573i.m23587b(view, "view");
            if (this.f56969a.getContext() != null) {
                C33038x xVar = (C33038x) C21671bd.m72521a(C33038x.class);
                Context context = this.f56969a.getContext();
                if (context == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) context, "context!!");
                xVar.mo60007a(context, "https://www.tiktok.com/en/privacy-policy-for-younger-users", true);
            }
        }

        C21189c(OperatorCompleteFragment operatorCompleteFragment, int i, int i2, int i3, int i4) {
            this.f56969a = operatorCompleteFragment;
            this.f56970b = i;
            this.f56971c = i2;
            super(i3, i4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ftc.fragment.OperatorCompleteFragment$d */
    public static final class C21190d extends C22367e {

        /* renamed from: a */
        final /* synthetic */ OperatorCompleteFragment f56972a;

        /* renamed from: b */
        final /* synthetic */ int f56973b;

        /* renamed from: c */
        final /* synthetic */ int f56974c;

        public final void onClick(View view) {
            C7573i.m23587b(view, "view");
            if (this.f56972a.getContext() != null) {
                C33038x xVar = (C33038x) C21671bd.m72521a(C33038x.class);
                Context context = this.f56972a.getContext();
                if (context == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) context, "context!!");
                xVar.mo60007a(context, "https://www.tiktok.com/en/terms-of-use", true);
            }
        }

        C21190d(OperatorCompleteFragment operatorCompleteFragment, int i, int i2, int i3, int i4) {
            this.f56972a = operatorCompleteFragment;
            this.f56973b = i;
            this.f56974c = i2;
            super(i3, i4);
        }
    }

    /* renamed from: a */
    private View m71356a(int i) {
        if (this.f56966f == null) {
            this.f56966f = new HashMap();
        }
        View view = (View) this.f56966f.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f56966f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: e */
    private void m71359e() {
        if (this.f56966f != null) {
            this.f56966f.clear();
        }
    }

    public final boolean ac_() {
        return true;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m71359e();
    }

    /* renamed from: d */
    private final void m71358d() {
        ImageView imageView = (ImageView) m71356a((int) R.id.bvt);
        C7573i.m23582a((Object) imageView, "logoImage");
        imageView.getLayoutParams().width = (C9738o.m28691a(getContext()) * 160) / 375;
        ImageView imageView2 = (ImageView) m71356a((int) R.id.bvt);
        C7573i.m23582a((Object) imageView2, "logoImage");
        LayoutParams layoutParams = imageView2.getLayoutParams();
        ImageView imageView3 = (ImageView) m71356a((int) R.id.bvt);
        C7573i.m23582a((Object) imageView3, "logoImage");
        layoutParams.height = imageView3.getLayoutParams().width;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(3);
            }
        }
    }

    /* renamed from: a */
    private final void m71357a(View view) {
        Spannable newSpannable = Factory.getInstance().newSpannable(getString(R.string.bab));
        String string = getString(R.string.bac);
        C7573i.m23582a((Object) string, "getString(R.string.ftc_s…mail_done_privacy_policy)");
        String string2 = getString(R.string.bad);
        C7573i.m23582a((Object) string2, "getString(R.string.ftc_s…email_done_terms_service)");
        String string3 = getString(R.string.bab);
        C7573i.m23582a((Object) string3, "getString(R.string.ftc_s…l_done_privacy_and_terms)");
        int a = C7634n.m23730a((CharSequence) string3, string, 0, false, 6, (Object) null);
        String string4 = getString(R.string.bab);
        C7573i.m23582a((Object) string4, "getString(R.string.ftc_s…l_done_privacy_and_terms)");
        int a2 = C7634n.m23730a((CharSequence) string4, string2, 0, false, 6, (Object) null);
        int color = getResources().getColor(R.color.lj);
        int color2 = getResources().getColor(R.color.y3);
        int i = color;
        int i2 = color2;
        int i3 = color;
        int i4 = a;
        int i5 = color2;
        C21189c cVar = new C21189c(this, i, i2, i3, i5);
        C21190d dVar = new C21190d(this, i, i2, i3, i5);
        newSpannable.setSpan(cVar, i4, i4 + string.length(), 17);
        newSpannable.setSpan(dVar, a2, string2.length() + a2, 17);
        TextView textView = (TextView) view.findViewById(R.id.cjs);
        C7573i.m23582a((Object) textView, "this");
        textView.setText(newSpannable);
        textView.setVisibility(0);
        textView.setMovementMethod(C22364b.m74059a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("age_gate_response");
        } else {
            serializable = null;
        }
        AgeGateResponse ageGateResponse = (AgeGateResponse) serializable;
        int i = 0;
        if (ageGateResponse != null && ageGateResponse.is_eligible() && ageGateResponse.is_prompt()) {
            ((DmtTextView) m71356a((int) R.id.a7e)).setText(R.string.ba9);
        } else if (ageGateResponse != null && !ageGateResponse.is_eligible()) {
            String string = getString(R.string.baa);
            C7573i.m23582a((Object) string, "getString(R.string.ftc_set_emai_done_desc_1_1)");
            Spannable newSpannable = Factory.getInstance().newSpannable(getString(R.string.ba_, string));
            newSpannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.ab1)), newSpannable.length() - string.length(), newSpannable.length(), 17);
            DmtTextView dmtTextView = (DmtTextView) m71356a((int) R.id.a7e);
            C7573i.m23582a((Object) dmtTextView, "desc");
            dmtTextView.setText(newSpannable);
            m71358d();
            m71357a(view);
        }
        ((DmtTextView) m71356a((int) R.id.a0v)).setOnClickListener(new C21188b(this, ageGateResponse));
        String str = "age_gate_complete";
        C21102b a = C21102b.m71165a().mo56946a("enter_method", "pop_up");
        String str2 = "pass_gate";
        if (ageGateResponse != null && ageGateResponse.is_eligible()) {
            i = 1;
        }
        C6907h.m21524a(str, (Map) a.mo56944a(str2, i).mo56944a("pass_export", 1).f56672a);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.po, viewGroup, false);
    }
}
