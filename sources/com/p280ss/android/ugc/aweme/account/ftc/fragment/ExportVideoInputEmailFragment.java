package com.p280ss.android.ugc.aweme.account.ftc.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p280ss.android.ugc.aweme.account.ftc.api.Api;
import com.p280ss.android.ugc.aweme.account.ftc.model.SetEmailResponse;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.views.AutoRTLImageView;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment */
public final class ExportVideoInputEmailFragment extends AmeBaseFragment {

    /* renamed from: e */
    private HashMap f56958e;

    /* renamed from: com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$a */
    static final class C21182a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ExportVideoInputEmailFragment f56959a;

        /* renamed from: b */
        final /* synthetic */ AgeGateResponse f56960b;

        C21182a(ExportVideoInputEmailFragment exportVideoInputEmailFragment, AgeGateResponse ageGateResponse) {
            this.f56959a = exportVideoInputEmailFragment;
            this.f56960b = ageGateResponse;
        }

        public final void onClick(View view) {
            int i;
            ClickInstrumentation.onClick(view);
            String str = "export_video_finish_input";
            C21102b a = C21102b.m71165a().mo56946a("enter_method", "pop_up");
            String str2 = "pass_gate";
            AgeGateResponse ageGateResponse = this.f56960b;
            if (ageGateResponse == null || !ageGateResponse.is_eligible()) {
                i = 0;
            } else {
                i = 1;
            }
            C6907h.m21524a(str, (Map) a.mo56944a(str2, i).f56672a);
            C10741a a2 = new C10741a(this.f56959a.getActivity()).mo25649a((int) R.string.b_x);
            ExportVideoInputEmailFragment exportVideoInputEmailFragment = this.f56959a;
            DmtEditText dmtEditText = (DmtEditText) this.f56959a.mo57114a((int) R.id.ad9);
            C7573i.m23582a((Object) dmtEditText, "emailInput");
            a2.mo25660b(exportVideoInputEmailFragment.getString(R.string.b_w, String.valueOf(dmtEditText.getText()))).mo25658b((int) R.string.ve, (DialogInterface.OnClickListener) null).mo25650a((int) R.string.vj, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C21182a f56961a;

                {
                    this.f56961a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    DmtEditText dmtEditText = (DmtEditText) this.f56961a.f56959a.mo57114a((int) R.id.ad9);
                    C7573i.m23582a((Object) dmtEditText, "emailInput");
                    if (!ExportVideoInputEmailFragment.m71353a(String.valueOf(dmtEditText.getText()))) {
                        C10761a.m31399c((Context) this.f56961a.f56959a.getActivity(), (int) R.string.ba2).mo25750a();
                        return;
                    }
                    String str = "export_video_address_confirm";
                    C21102b a = C21102b.m71165a().mo56946a("enter_method", "pop_up");
                    String str2 = "pass_gate";
                    AgeGateResponse ageGateResponse = this.f56961a.f56960b;
                    int i2 = 1;
                    if (ageGateResponse == null || !ageGateResponse.is_eligible()) {
                        i2 = 0;
                    }
                    C6907h.m21524a(str, (Map) a.mo56944a(str2, i2).f56672a);
                    ((DmtStatusView) this.f56961a.f56959a.mo57114a((int) R.id.daj)).mo25942f();
                    DmtEditText dmtEditText2 = (DmtEditText) this.f56961a.f56959a.mo57114a((int) R.id.ad9);
                    C7573i.m23582a((Object) dmtEditText2, "emailInput");
                    Api.emailForExportVideo(String.valueOf(dmtEditText2.getText())).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<SetEmailResponse, Void>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C211831 f56962a;

                        {
                            this.f56962a = r1;
                        }

                        /* access modifiers changed from: private */
                        /* JADX WARNING: Removed duplicated region for block: B:16:0x0093  */
                        /* JADX WARNING: Removed duplicated region for block: B:18:0x009d  */
                        /* renamed from: a */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public java.lang.Void then(bolts.C1592h<com.p280ss.android.ugc.aweme.account.ftc.model.SetEmailResponse> r5) {
                            /*
                                r4 = this;
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$a$1 r0 = r4.f56962a
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$a r0 = r0.f56961a
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment r0 = r0.f56959a
                                boolean r0 = r0.isViewValid()
                                r1 = 0
                                if (r0 == 0) goto L_0x00a5
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$a$1 r0 = r4.f56962a
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$a r0 = r0.f56961a
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment r0 = r0.f56959a
                                android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                                if (r0 != 0) goto L_0x001b
                                goto L_0x00a5
                            L_0x001b:
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$a$1 r0 = r4.f56962a
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$a r0 = r0.f56961a
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment r0 = r0.f56959a
                                r2 = 2131301776(0x7f091590, float:1.822162E38)
                                android.view.View r0 = r0.mo57114a(r2)
                                com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = (com.bytedance.ies.dmt.p262ui.widget.DmtStatusView) r0
                                r3 = -1
                                r0.setStatus(r3)
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$a$1 r0 = r4.f56962a
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$a r0 = r0.f56961a
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment r0 = r0.f56959a
                                android.view.View r0 = r0.mo57114a(r2)
                                com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = (com.bytedance.ies.dmt.p262ui.widget.DmtStatusView) r0
                                java.lang.String r2 = "statusView"
                                kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                                r2 = 8
                                r0.setVisibility(r2)
                                java.lang.String r0 = "task"
                                kotlin.jvm.internal.C7573i.m23582a(r5, r0)
                                boolean r0 = r5.mo6887c()
                                if (r0 != 0) goto L_0x00a0
                                boolean r5 = r5.mo6889d()
                                if (r5 != 0) goto L_0x00a0
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$a$1 r5 = r4.f56962a
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$a r5 = r5.f56961a
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment r5 = r5.f56959a
                                r0 = 2131297771(0x7f0905eb, float:1.8213496E38)
                                android.view.View r5 = r5.mo57114a(r0)
                                com.bytedance.ies.dmt.ui.widget.DmtEditText r5 = (com.bytedance.ies.dmt.p262ui.widget.DmtEditText) r5
                                com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils.m77057c(r5)
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$a$1 r5 = r4.f56962a
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$a r5 = r5.f56961a
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment r5 = r5.f56959a
                                android.support.v4.app.FragmentActivity r5 = r5.getActivity()
                                if (r5 == 0) goto L_0x007e
                                android.support.v4.app.j r5 = r5.getSupportFragmentManager()
                                if (r5 == 0) goto L_0x007e
                                android.support.v4.app.q r5 = r5.mo2645a()
                                goto L_0x007f
                            L_0x007e:
                                r5 = r1
                            L_0x007f:
                                com.ss.android.ugc.aweme.account.ftc.fragment.OperatorCompleteFragment r0 = new com.ss.android.ugc.aweme.account.ftc.fragment.OperatorCompleteFragment
                                r0.<init>()
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$a$1 r2 = r4.f56962a
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$a r2 = r2.f56961a
                                com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment r2 = r2.f56959a
                                android.os.Bundle r2 = r2.getArguments()
                                r0.setArguments(r2)
                                if (r5 == 0) goto L_0x009b
                                r2 = 2131298204(0x7f09079c, float:1.8214375E38)
                                android.support.v4.app.Fragment r0 = (android.support.p022v4.app.Fragment) r0
                                r5.mo2599b(r2, r0)
                            L_0x009b:
                                if (r5 == 0) goto L_0x00a0
                                r5.mo2604c()
                            L_0x00a0:
                                r5 = 0
                                com.p280ss.android.ugc.aweme.account.util.C22345t.m73977h(r5)
                                return r1
                            L_0x00a5:
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment.C21182a.C211831.C211841.then(bolts.h):java.lang.Void");
                        }
                    }, C1592h.f5958b);
                }
            }).mo25656a().mo25637a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$b */
    static final class C21185b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ExportVideoInputEmailFragment f56963a;

        C21185b(ExportVideoInputEmailFragment exportVideoInputEmailFragment) {
            this.f56963a = exportVideoInputEmailFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            KeyboardUtils.m77057c((DmtEditText) this.f56963a.mo57114a((int) R.id.ad9));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ftc.fragment.ExportVideoInputEmailFragment$c */
    static final class C21186c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ExportVideoInputEmailFragment f56964a;

        C21186c(ExportVideoInputEmailFragment exportVideoInputEmailFragment) {
            this.f56964a = exportVideoInputEmailFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f56964a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* renamed from: a */
    private void m71352a() {
        if (this.f56958e != null) {
            this.f56958e.clear();
        }
    }

    /* renamed from: a */
    public final View mo57114a(int i) {
        if (this.f56958e == null) {
            this.f56958e = new HashMap();
        }
        View view = (View) this.f56958e.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f56958e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m71352a();
    }

    /* renamed from: a */
    public static boolean m71353a(String str) {
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        return Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", 2).matcher(charSequence).matches();
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
        if (ageGateResponse != null && ageGateResponse.is_eligible() && ageGateResponse.is_prompt()) {
            ((DmtTextView) mo57114a((int) R.id.a7e)).setText(R.string.ba4);
        } else if (ageGateResponse != null && !ageGateResponse.is_eligible()) {
            ((DmtTextView) mo57114a((int) R.id.a7e)).setText(R.string.ba5);
        }
        ((DmtStatusView) mo57114a((int) R.id.daj)).setBuilder(C10803a.m31631a(getContext()));
        ((DmtTextView) mo57114a((int) R.id.d2v)).setOnClickListener(new C21182a(this, ageGateResponse));
        ((FrameLayout) mo57114a((int) R.id.cwj)).setOnClickListener(new C21185b(this));
        ((AutoRTLImageView) mo57114a((int) R.id.ahc)).setOnClickListener(new C21186c(this));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.o3, viewGroup, false);
    }
}
