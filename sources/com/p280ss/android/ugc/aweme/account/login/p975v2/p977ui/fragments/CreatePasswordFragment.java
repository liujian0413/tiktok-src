package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p645a.p649d.C12730b;
import com.bytedance.sdk.account.p645a.p649d.C12734f;
import com.bytedance.sdk.account.p662f.p664b.C12878t.C12879a;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.C21638v;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22047a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22048b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.InputResultIndicator;
import com.p280ss.android.ugc.aweme.account.p951l.C21237a;
import com.p280ss.android.ugc.aweme.account.p982ui.InputWithIndicator;
import com.p280ss.android.ugc.aweme.account.p982ui.LoadingButton;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CreatePasswordFragment */
public final class CreatePasswordFragment extends BaseI18nLoginFragment {

    /* renamed from: h */
    public static final C22066a f59014h = new C22066a(null);

    /* renamed from: f */
    public boolean f59015f;

    /* renamed from: g */
    public String f59016g = "";

    /* renamed from: i */
    private boolean f59017i = true;

    /* renamed from: k */
    private boolean f59018k;

    /* renamed from: l */
    private boolean f59019l;

    /* renamed from: m */
    private HashMap f59020m;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CreatePasswordFragment$a */
    public static final class C22066a {
        private C22066a() {
        }

        public /* synthetic */ C22066a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CreatePasswordFragment$b */
    public static final class C22067b extends C23467g {

        /* renamed from: a */
        final /* synthetic */ CreatePasswordFragment f59021a;

        C22067b(CreatePasswordFragment createPasswordFragment) {
            this.f59021a = createPasswordFragment;
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            super.afterTextChanged(editable);
            if (this.f59021a.isViewValid()) {
                String text = ((InputWithIndicator) this.f59021a.mo58338b(R.id.a4u)).getText();
                boolean z2 = false;
                if (text.length() > 20) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    InputResultIndicator inputResultIndicator = (InputResultIndicator) this.f59021a.mo58338b(R.id.a4v);
                    String string = this.f59021a.getString(R.string.cet);
                    C7573i.m23582a((Object) string, "getString(R.string.mus_password_too_long)");
                    inputResultIndicator.mo58395a(string);
                } else {
                    ((InputResultIndicator) this.f59021a.mo58338b(R.id.a4v)).mo58394a();
                }
                LoadingButton loadingButton = (LoadingButton) this.f59021a.mo58338b(R.id.a4t);
                C7573i.m23582a((Object) loadingButton, "createPasswordContinueBtn");
                if (text.length() >= 8 && !z) {
                    z2 = true;
                }
                loadingButton.setEnabled(z2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CreatePasswordFragment$c */
    static final class C22068c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreatePasswordFragment f59022a;

        C22068c(CreatePasswordFragment createPasswordFragment) {
            this.f59022a = createPasswordFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            final String text = ((InputWithIndicator) this.f59022a.mo58338b(R.id.a4u)).getText();
            if (!C21638v.m72447a(text)) {
                CreatePasswordFragment createPasswordFragment = this.f59022a;
                String string = this.f59022a.getString(R.string.adb);
                C7573i.m23582a((Object) string, "getString(R.string.commo…istration_password_error)");
                createPasswordFragment.mo58335a(0, string);
                return;
            }
            switch (C22145b.f59177b[this.f59022a.mo58339d().ordinal()]) {
                case 1:
                    C21931e.m73164a((BaseAccountFlowFragment) this.f59022a, text, this.f59022a.f59016g).mo19273b();
                    return;
                case 2:
                    this.f59022a.mo58432a(text);
                    return;
                case 3:
                    C21237a.m71490a(this.f59022a.getContext());
                    C21931e.m73175c(this.f59022a, C21903c.f58624a.mo58352a((Fragment) this.f59022a), text).mo19273b();
                    return;
                case 4:
                    C21931e.m73160a(this.f59022a, text).mo19278c((C7326g<? super T>) new C7326g<C12730b>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C22068c f59023a;

                        {
                            this.f59023a = r1;
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void accept(C12730b bVar) {
                            C21931e.m73172b(this.f59023a.f59022a, text, this.f59023a.f59022a.f59016g).mo19278c((C7326g<? super T>) new C7326g<C12734f>(this) {

                                /* renamed from: a */
                                final /* synthetic */ C220691 f59025a;

                                {
                                    this.f59025a = r1;
                                }

                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public void accept(C12734f fVar) {
                                    C10761a.m31383a(this.f59025a.f59023a.f59022a.getContext(), (int) R.string.zn).mo25750a();
                                }
                            }).mo19273b();
                        }
                    }).mo19273b();
                    break;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CreatePasswordFragment$d */
    static final class C22071d<T> implements C7326g<C12710e<C12879a>> {

        /* renamed from: a */
        final /* synthetic */ CreatePasswordFragment f59026a;

        C22071d(CreatePasswordFragment createPasswordFragment) {
            this.f59026a = createPasswordFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12879a> eVar) {
            this.f59026a.f59015f = true;
            C21671bd.m72522a(13, 1, (Object) null);
            FragmentActivity activity = this.f59026a.getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            activity.finish();
        }
    }

    /* renamed from: b */
    public final View mo58338b(int i) {
        if (this.f59020m == null) {
            this.f59020m = new HashMap();
        }
        View view = (View) this.f59020m.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59020m.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: n */
    public final void mo58347n() {
        if (this.f59020m != null) {
            this.f59020m.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo58347n();
    }

    /* renamed from: p */
    public final int mo58417p() {
        return R.layout.b1e;
    }

    /* renamed from: t */
    public final void mo58429t() {
        this.f59019l = false;
        super.mo58429t();
    }

    /* renamed from: q */
    public final void mo58418q() {
        LoadingButton loadingButton = (LoadingButton) mo58338b(R.id.a4t);
        if (loadingButton != null) {
            loadingButton.mo58680b();
        }
    }

    /* renamed from: r */
    public final void mo58419r() {
        LoadingButton loadingButton = (LoadingButton) mo58338b(R.id.a4t);
        if (loadingButton != null) {
            loadingButton.mo58679a();
        }
    }

    /* renamed from: l */
    public final boolean mo58346l() {
        if (this.f59019l) {
            return true;
        }
        if (!this.f59015f) {
            C21671bd.m72522a(13, 2, (Object) null);
        }
        return false;
    }

    public final void onResume() {
        super.onResume();
        C22048b.m73350a(((InputWithIndicator) mo58338b(R.id.a4u)).getEditText());
    }

    /* renamed from: o */
    public final C22047a mo58416o() {
        String str;
        String str2;
        String str3;
        C22047a aVar = new C22047a(null, null, false, null, null, false, null, false, false, 511, null);
        if (!this.f59018k) {
            str3 = getString(R.string.abj);
            C7573i.m23582a((Object) str3, "getString(R.string.common_login_panel_entry_2)");
            str2 = getString(R.string.add);
            C7573i.m23582a((Object) str2, "getString(R.string.commo…istration_password_title)");
            str = "set_password";
        } else {
            str3 = getString(R.string.ac4);
            C7573i.m23582a((Object) str3, "getString(R.string.common_login_reset_title)");
            str2 = getString(R.string.aby);
            C7573i.m23582a((Object) str2, "getString(R.string.commo…gin_reset_password_title)");
            str = "reset_password";
        }
        aVar.f58963a = str3;
        aVar.f58966d = str2;
        aVar.f58969g = str;
        aVar.f58967e = getString(R.string.adc);
        if (mo58339d() == Step.CREATE_PASSWORD_FOR_PHONE) {
            aVar.f58964b = getString(R.string.dmr);
            this.f59019l = true;
        }
        aVar.f58971i = true;
        return aVar;
    }

    /* renamed from: a */
    public final void mo58432a(String str) {
        C21931e.m73171b(this, str).mo19278c((C7326g<? super T>) new C22071d<Object>(this)).mo19273b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r4 == null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x0011
            java.lang.String r0 = "ticket"
            java.lang.String r4 = r4.getString(r0)
            if (r4 != 0) goto L_0x0013
        L_0x0011:
            java.lang.String r4 = ""
        L_0x0013:
            r3.f59016g = r4
            com.ss.android.ugc.aweme.account.login.v2.base.Step r4 = r3.mo58339d()
            int[] r0 = com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.C22145b.f59176a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            r0 = 1
            switch(r4) {
                case 1: goto L_0x002b;
                case 2: goto L_0x0026;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x0030
        L_0x0026:
            r3.f59018k = r0
            r3.f59017i = r0
            goto L_0x0030
        L_0x002b:
            r3.f59018k = r0
            r4 = 0
            r3.f59017i = r4
        L_0x0030:
            java.lang.String r4 = "set_password_show"
            com.ss.android.ugc.aweme.account.a.b.b r0 = new com.ss.android.ugc.aweme.account.a.b.b
            r0.<init>()
            java.lang.String r1 = "platform"
            boolean r2 = r3.f59017i
            if (r2 == 0) goto L_0x0040
            java.lang.String r2 = "phone"
            goto L_0x0042
        L_0x0040:
            java.lang.String r2 = "email"
        L_0x0042:
            com.ss.android.ugc.aweme.account.a.b.b r0 = r0.mo56946a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56672a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.CreatePasswordFragment.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo58335a(int i, String str) {
        C7573i.m23587b(str, "message");
        ((InputResultIndicator) mo58338b(R.id.a4v)).mo58395a(str);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f59018k) {
            LoadingButton loadingButton = (LoadingButton) mo58338b(R.id.a4t);
            String string = getString(R.string.aaw);
            C7573i.m23582a((Object) string, "getString(R.string.common_login_input_button)");
            loadingButton.setText(string);
        }
        ((InputWithIndicator) mo58338b(R.id.a4u)).getEditText().addTextChangedListener(new C22067b(this));
        mo58425a((LoadingButton) mo58338b(R.id.a4t), new C22068c(this));
    }
}
