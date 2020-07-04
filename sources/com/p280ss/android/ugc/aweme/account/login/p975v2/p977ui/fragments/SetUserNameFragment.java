package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments;

import android.os.Bundle;
import android.support.p029v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.account.login.p975v2.C21886a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21905e;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21905e.C21906a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21912a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C22025i;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.AccountKeyBoardHelper.C22035a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22047a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22048b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.HintListManager;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.InputResultIndicator;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p982ui.InputWithIndicator;
import com.p280ss.android.ugc.aweme.account.p982ui.LoadingButton;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.p1873k.C47852a;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetUserNameFragment */
public final class SetUserNameFragment extends BaseI18nLoginFragment {

    /* renamed from: f */
    public HintListManager f59161f;

    /* renamed from: g */
    public C22025i f59162g = new C22025i();

    /* renamed from: h */
    public EditText f59163h;

    /* renamed from: i */
    public final C21905e f59164i = new C21905e();

    /* renamed from: k */
    public boolean f59165k;

    /* renamed from: l */
    public String f59166l = "";

    /* renamed from: m */
    public C21912a f59167m;

    /* renamed from: n */
    private boolean f59168n = true;

    /* renamed from: o */
    private HashMap f59169o;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetUserNameFragment$a */
    public static final class C22138a extends C47852a<C21912a> {

        /* renamed from: a */
        final /* synthetic */ SetUserNameFragment f59170a;

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
        }

        C22138a(SetUserNameFragment setUserNameFragment) {
            this.f59170a = setUserNameFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNext(C21912a aVar) {
            C7573i.m23587b(aVar, "t");
            List<String> list = aVar.f58631b;
            if (list != null && (!list.isEmpty())) {
                if (this.f59170a.isViewValid()) {
                    this.f59170a.mo58466a(aVar);
                    return;
                }
                this.f59170a.f59167m = aVar;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetUserNameFragment$b */
    static final class C22139b extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ SetUserNameFragment f59171a;

        C22139b(SetUserNameFragment setUserNameFragment) {
            this.f59171a = setUserNameFragment;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m73590a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m73590a(String str) {
            C7573i.m23587b(str, "it");
            CharSequence charSequence = str;
            if (!TextUtils.isEmpty(charSequence)) {
                this.f59171a.f59165k = true;
                this.f59171a.mo57299a().setText(charSequence);
                C6907h.m21524a("choose_recommend_username", (Map) new C21102b().mo56946a("enter_from", this.f59171a.mo58340e()).mo56946a("enter_method", this.f59171a.mo58341f()).mo56946a("platform", this.f59171a.f59166l).f56672a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetUserNameFragment$c */
    static final class C22140c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SetUserNameFragment f59172a;

        C22140c(SetUserNameFragment setUserNameFragment) {
            this.f59172a = setUserNameFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59172a.f59162g.mo58384a(this.f59172a, this.f59172a.mo57299a().getText().toString(), this.f59172a.f59166l);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetUserNameFragment$d */
    public static final class C22141d implements C21906a {

        /* renamed from: a */
        final /* synthetic */ SetUserNameFragment f59173a;

        /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetUserNameFragment$d$a */
        public static final class C22142a extends C47852a<C21912a> {

            /* renamed from: a */
            final /* synthetic */ C22141d f59174a;

            public final void onComplete() {
            }

            C22142a(C22141d dVar) {
                this.f59174a = dVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onNext(C21912a aVar) {
                C7573i.m23587b(aVar, "t");
                this.f59174a.f59173a.mo58468b(aVar);
            }

            public final void onError(Throwable th) {
                C7573i.m23587b(th, "e");
                this.f59174a.f59173a.mo58467a(th);
            }
        }

        C22141d(SetUserNameFragment setUserNameFragment) {
            this.f59173a = setUserNameFragment;
        }

        /* renamed from: a */
        public final void mo58357a(String str) {
            C7573i.m23587b(str, "s");
            if (!TextUtils.isEmpty(str)) {
                View b = this.f59173a.mo58338b((int) R.id.d3j);
                C7573i.m23582a((Object) b, "setUsernameInclude");
                ((InputWithIndicator) b.findViewById(R.id.b1v)).mo58665a(2);
                this.f59173a.f59162g.mo58385a(str, new C22142a(this));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetUserNameFragment$e */
    public static final class C22143e extends C23467g {

        /* renamed from: a */
        final /* synthetic */ SetUserNameFragment f59175a;

        C22143e(SetUserNameFragment setUserNameFragment) {
            this.f59175a = setUserNameFragment;
        }

        public final void afterTextChanged(Editable editable) {
            String obj = this.f59175a.mo57299a().getText().toString();
            boolean isEmpty = TextUtils.isEmpty(obj);
            if (isEmpty || this.f59175a.f59165k) {
                this.f59175a.f59162g.mo58383a();
                this.f59175a.f59164i.mo58356a("");
            }
            if (this.f59175a.f59165k) {
                this.f59175a.mo57299a().setSelection(obj.length());
                this.f59175a.m73574a(true, 3, null);
                this.f59175a.f59165k = false;
                return;
            }
            HintListManager hintListManager = this.f59175a.f59161f;
            if (hintListManager == null) {
                C7573i.m23580a();
            }
            hintListManager.mo58390a(null);
            this.f59175a.m73574a(false, 1, null);
            if (!isEmpty) {
                this.f59175a.f59164i.mo58356a(obj);
            }
        }
    }

    /* renamed from: b */
    public final View mo58338b(int i) {
        if (this.f59169o == null) {
            this.f59169o = new HashMap();
        }
        View view = (View) this.f59169o.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59169o.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: l */
    public final boolean mo58346l() {
        return this.f59168n;
    }

    /* renamed from: n */
    public final void mo58347n() {
        if (this.f59169o != null) {
            this.f59169o.clear();
        }
    }

    /* renamed from: p */
    public final int mo58417p() {
        return R.layout.b1p;
    }

    /* renamed from: t */
    public final void mo58429t() {
        this.f59168n = false;
        super.mo58429t();
    }

    /* renamed from: a */
    public final EditText mo57299a() {
        EditText editText = this.f59163h;
        if (editText == null) {
            C7573i.m23583a("etUserName");
        }
        return editText;
    }

    /* renamed from: q */
    public final void mo58418q() {
        LoadingButton loadingButton = (LoadingButton) mo58338b((int) R.id.d3k);
        if (loadingButton != null) {
            loadingButton.mo58680b();
        }
    }

    /* renamed from: r */
    public final void mo58419r() {
        LoadingButton loadingButton = (LoadingButton) mo58338b((int) R.id.d3k);
        if (loadingButton != null) {
            loadingButton.mo58679a();
        }
    }

    public final void ad_() {
        super.ad_();
        RecyclerView recyclerView = (RecyclerView) mo58338b((int) R.id.d3l);
        C7573i.m23582a((Object) recyclerView, "setUsernameRv");
        recyclerView.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo58427c() {
        super.mo58427c();
        RecyclerView recyclerView = (RecyclerView) mo58338b((int) R.id.d3l);
        C7573i.m23582a((Object) recyclerView, "setUsernameRv");
        recyclerView.setVisibility(0);
    }

    public final void onDestroyView() {
        this.f59167m = null;
        this.f59162g.mo58383a();
        this.f59164i.mo58354a();
        super.onDestroyView();
        mo58347n();
    }

    public final void onResume() {
        super.onResume();
        if (C22035a.m73321a()) {
            EditText editText = this.f59163h;
            if (editText == null) {
                C7573i.m23583a("etUserName");
            }
            C22048b.m73350a(editText);
            return;
        }
        EditText editText2 = this.f59163h;
        if (editText2 == null) {
            C7573i.m23583a("etUserName");
        }
        editText2.requestFocus();
    }

    /* renamed from: o */
    public final C22047a mo58416o() {
        C22047a aVar = new C22047a(null, null, false, null, null, false, null, false, false, 511, null);
        aVar.f58963a = getString(R.string.adv);
        aVar.f58966d = getString(R.string.ae6);
        aVar.f58967e = getString(R.string.ae5);
        if (C21886a.f58594a.mo58326e()) {
            aVar.f58964b = getString(R.string.dmr);
        } else {
            aVar.f58965c = false;
        }
        aVar.f58968f = true;
        aVar.f58969g = "set_username";
        aVar.f58971i = true;
        return aVar;
    }

    /* renamed from: b */
    public final void mo58468b(C21912a aVar) {
        List list;
        C7573i.m23587b(aVar, "t");
        if (aVar.f58630a) {
            m73574a(true, 3, null);
            return;
        }
        m73574a(false, 1, aVar.status_msg);
        HintListManager hintListManager = this.f59161f;
        if (hintListManager == null) {
            C7573i.m23580a();
        }
        List<String> list2 = aVar.f58631b;
        if (list2 != null) {
            List e = C7525m.m23510e(list2);
            if (e != null) {
                list = C7525m.m23509d((Collection<? extends T>) e);
                hintListManager.mo58390a(list);
            }
        }
        list = null;
        hintListManager.mo58390a(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r4 == null) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            super.onCreate(r4)
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x0013
            java.lang.String r0 = "set_username_platform"
            java.lang.String r1 = ""
            java.lang.String r4 = r4.getString(r0, r1)
            if (r4 != 0) goto L_0x0015
        L_0x0013:
            java.lang.String r4 = ""
        L_0x0015:
            r3.f59166l = r4
            java.lang.String r4 = "set_username_show"
            com.ss.android.ugc.aweme.account.a.b.b r0 = new com.ss.android.ugc.aweme.account.a.b.b
            r0.<init>()
            java.lang.String r1 = "enter_from"
            java.lang.String r2 = r3.mo58340e()
            com.ss.android.ugc.aweme.account.a.b.b r0 = r0.mo56946a(r1, r2)
            java.lang.String r1 = "enter_method"
            java.lang.String r2 = r3.mo58341f()
            com.ss.android.ugc.aweme.account.a.b.b r0 = r0.mo56946a(r1, r2)
            java.lang.String r1 = "platform"
            java.lang.String r2 = r3.f59166l
            com.ss.android.ugc.aweme.account.a.b.b r0 = r0.mo56946a(r1, r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f56672a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r4, r0)
            android.os.Bundle r4 = r3.getArguments()
            if (r4 == 0) goto L_0x005d
            java.lang.String r0 = "new_user_need_get_recommend_username"
            boolean r4 = r4.getBoolean(r0)
            r0 = 1
            if (r4 != r0) goto L_0x005c
            com.ss.android.ugc.aweme.account.login.v2.network.i r4 = r3.f59162g
            java.lang.String r0 = ""
            com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetUserNameFragment$a r1 = new com.ss.android.ugc.aweme.account.login.v2.ui.fragments.SetUserNameFragment$a
            r1.<init>(r3)
            io.reactivex.k.a r1 = (p346io.reactivex.p1873k.C47852a) r1
            r4.mo58385a(r0, r1)
        L_0x005c:
            return
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.SetUserNameFragment.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo58466a(C21912a aVar) {
        List list;
        C7573i.m23587b(aVar, "t");
        List<String> list2 = aVar.f58631b;
        if (list2 != null) {
            List e = C7525m.m23510e(list2);
            if (e != null) {
                list = C7525m.m23509d((Collection<? extends T>) e);
                if (list != null && (!list.isEmpty())) {
                    this.f59165k = true;
                    EditText editText = this.f59163h;
                    if (editText == null) {
                        C7573i.m23583a("etUserName");
                    }
                    editText.setText((CharSequence) list.get(0));
                    HintListManager hintListManager = this.f59161f;
                    if (hintListManager == null) {
                        C7573i.m23580a();
                    }
                    hintListManager.mo58390a(list.subList(1, list.size()));
                    return;
                }
            }
        }
        list = null;
        if (list != null) {
        }
    }

    /* renamed from: a */
    public final void mo58467a(Throwable th) {
        String str;
        Iterable iterable;
        C7573i.m23587b(th, "e");
        if (th instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) th;
            List list = null;
            if (apiServerException.getRawResponse() != null) {
                Object rawResponse = apiServerException.getRawResponse();
                if (rawResponse instanceof C21912a) {
                    C21912a aVar = (C21912a) rawResponse;
                    iterable = aVar.f58631b;
                    str = aVar.status_msg;
                } else {
                    str = null;
                    iterable = null;
                }
                HintListManager hintListManager = this.f59161f;
                if (hintListManager == null) {
                    C7573i.m23580a();
                }
                if (iterable != null) {
                    List e = C7525m.m23510e(iterable);
                    if (e != null) {
                        list = C7525m.m23509d((Collection<? extends T>) e);
                    }
                }
                hintListManager.mo58390a(list);
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                m73574a(false, 1, str);
                return;
            }
        }
        m73574a(true, 1, null);
    }

    /* renamed from: a */
    public final void mo58335a(int i, String str) {
        C7573i.m23587b(str, "message");
        View b = mo58338b((int) R.id.d3j);
        C7573i.m23582a((Object) b, "setUsernameInclude");
        ((InputResultIndicator) b.findViewById(R.id.b1w)).mo58395a(str);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        View b = mo58338b((int) R.id.d3j);
        C7573i.m23582a((Object) b, "setUsernameInclude");
        this.f59163h = ((InputWithIndicator) b.findViewById(R.id.b1v)).getEditText();
        EditText editText = this.f59163h;
        if (editText == null) {
            C7573i.m23583a("etUserName");
        }
        editText.setNextFocusDownId(editText.getId());
        editText.setHint(getString(R.string.ae3));
        RecyclerView recyclerView = (RecyclerView) mo58338b((int) R.id.d3l);
        C7573i.m23582a((Object) recyclerView, "setUsernameRv");
        this.f59161f = new HintListManager(recyclerView, null, new C22139b(this));
        HintListManager hintListManager = this.f59161f;
        if (hintListManager == null) {
            C7573i.m23580a();
        }
        hintListManager.f58926a = true;
        mo58425a((LoadingButton) mo58338b((int) R.id.d3k), new C22140c(this));
        this.f59164i.mo58355a(new C22141d(this), 1000, TimeUnit.MILLISECONDS);
        EditText editText2 = this.f59163h;
        if (editText2 == null) {
            C7573i.m23583a("etUserName");
        }
        editText2.addTextChangedListener(new C22143e(this));
        if (this.f59167m != null) {
            C21912a aVar = this.f59167m;
            if (aVar == null) {
                C7573i.m23580a();
            }
            mo58466a(aVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m73574a(boolean z, int i, String str) {
        LoadingButton loadingButton = (LoadingButton) mo58338b((int) R.id.d3k);
        C7573i.m23582a((Object) loadingButton, "setUsernameNextBtn");
        loadingButton.setEnabled(z);
        if (str == null) {
            View b = mo58338b((int) R.id.d3j);
            C7573i.m23582a((Object) b, "setUsernameInclude");
            ((InputResultIndicator) b.findViewById(R.id.b1w)).mo58394a();
        } else {
            View b2 = mo58338b((int) R.id.d3j);
            C7573i.m23582a((Object) b2, "setUsernameInclude");
            ((InputResultIndicator) b2.findViewById(R.id.b1w)).mo58395a(str);
        }
        View b3 = mo58338b((int) R.id.d3j);
        C7573i.m23582a((Object) b3, "setUsernameInclude");
        ((InputWithIndicator) b3.findViewById(R.id.b1v)).mo58665a(i);
    }
}
