package com.p280ss.android.ugc.aweme.account.login.p975v2.base;

import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p660d.C12798d;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene.C21899a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step.C21900a;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment */
public abstract class BaseAccountFlowFragment extends AmeBaseFragment {

    /* renamed from: e */
    static final /* synthetic */ C7595j[] f58600e = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BaseAccountFlowFragment.class), "step", "getStep()Lcom/ss/android/ugc/aweme/account/login/v2/base/Step;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BaseAccountFlowFragment.class), "childPage", "getChildPage()Lcom/ss/android/ugc/aweme/account/login/v2/base/Step;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BaseAccountFlowFragment.class), "enterFrom", "getEnterFrom()Ljava/lang/String;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BaseAccountFlowFragment.class), "enterMethod", "getEnterMethod()Ljava/lang/String;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BaseAccountFlowFragment.class), "enterType", "getEnterType()Ljava/lang/String;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BaseAccountFlowFragment.class), "lastPage", "getLastPage()Lcom/ss/android/ugc/aweme/account/login/v2/base/Step;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BaseAccountFlowFragment.class), "passportApi", "getPassportApi()Lcom/bytedance/sdk/account/api/IBDAccountAPI;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(BaseAccountFlowFragment.class), "scene", "getScene()Lcom/ss/android/ugc/aweme/account/login/v2/base/Scene;"))};

    /* renamed from: f */
    private final C7541d f58601f = C7546e.m23569a(new C21896h(this));

    /* renamed from: g */
    private final C7541d f58602g = C7546e.m23569a(new C21889a(this));

    /* renamed from: h */
    private final C7541d f58603h = C7546e.m23569a(new C21890b(this));

    /* renamed from: i */
    private final C7541d f58604i = C7546e.m23569a(new C21891c(this));

    /* renamed from: j */
    private final C7541d f58605j = C7546e.m23569a(new C21892d(this));

    /* renamed from: k */
    private final C7541d f58606k = C7546e.m23569a(new C21893e(this));

    /* renamed from: l */
    private final C7541d f58607l = C7546e.m23569a(new C21894f(this));

    /* renamed from: m */
    private final C7541d f58608m = C7546e.m23569a(new C21895g(this));

    /* renamed from: n */
    private ArrayList<C12706a<? extends C12707b>> f58609n;

    /* renamed from: o */
    private HashMap f58610o;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment$a */
    static final class C21889a extends Lambda implements C7561a<Step> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58611a;

        C21889a(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58611a = baseAccountFlowFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Step invoke() {
            int i;
            Bundle arguments = this.f58611a.getArguments();
            if (arguments != null) {
                i = arguments.getInt("child_page", Step.NONE.getValue());
            } else {
                i = Step.NONE.getValue();
            }
            return C21900a.m73110a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment$b */
    static final class C21890b extends Lambda implements C7561a<String> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58612a;

        C21890b(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58612a = baseAccountFlowFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String invoke() {
            Bundle arguments = this.f58612a.getArguments();
            if (arguments != null) {
                String string = arguments.getString("enter_from");
                if (string != null) {
                    return string;
                }
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment$c */
    static final class C21891c extends Lambda implements C7561a<String> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58613a;

        C21891c(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58613a = baseAccountFlowFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String invoke() {
            Bundle arguments = this.f58613a.getArguments();
            if (arguments != null) {
                String string = arguments.getString("enter_method");
                if (string != null) {
                    return string;
                }
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment$d */
    static final class C21892d extends Lambda implements C7561a<String> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58614a;

        C21892d(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58614a = baseAccountFlowFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String invoke() {
            Bundle arguments = this.f58614a.getArguments();
            if (arguments != null) {
                String string = arguments.getString("enter_type");
                if (string != null) {
                    return string;
                }
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment$e */
    static final class C21893e extends Lambda implements C7561a<Step> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58615a;

        C21893e(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58615a = baseAccountFlowFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Step invoke() {
            int i;
            Bundle arguments = this.f58615a.getArguments();
            if (arguments != null) {
                i = arguments.getInt("previous_page", Step.NONE.getValue());
            } else {
                i = Step.NONE.getValue();
            }
            return C21900a.m73110a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment$f */
    static final class C21894f extends Lambda implements C7561a<C12728d> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58616a;

        C21894f(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58616a = baseAccountFlowFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C12728d invoke() {
            return C12798d.m37186a(this.f58616a.getContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment$g */
    static final class C21895g extends Lambda implements C7561a<Scene> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58617a;

        C21895g(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58617a = baseAccountFlowFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Scene invoke() {
            int i;
            Bundle arguments = this.f58617a.getArguments();
            if (arguments != null) {
                i = arguments.getInt("current_scene", Scene.NONE.getValue());
            } else {
                i = Scene.NONE.getValue();
            }
            return C21899a.m73109a(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment$h */
    static final class C21896h extends Lambda implements C7561a<Step> {

        /* renamed from: a */
        final /* synthetic */ BaseAccountFlowFragment f58618a;

        C21896h(BaseAccountFlowFragment baseAccountFlowFragment) {
            this.f58618a = baseAccountFlowFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Step invoke() {
            int i;
            Bundle arguments = this.f58618a.getArguments();
            if (arguments != null) {
                i = arguments.getInt("current_page", Step.NONE.getValue());
            } else {
                i = Step.NONE.getValue();
            }
            return C21900a.m73110a(i);
        }
    }

    /* renamed from: m */
    public static String m73083m() {
        return "";
    }

    /* renamed from: a */
    public abstract void mo58334a(int i);

    /* renamed from: a */
    public abstract void mo58335a(int i, String str);

    /* renamed from: b */
    public View mo58338b(int i) {
        if (this.f58610o == null) {
            this.f58610o = new HashMap();
        }
        View view = (View) this.f58610o.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f58610o.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: d */
    public final Step mo58339d() {
        return (Step) this.f58601f.getValue();
    }

    /* renamed from: e */
    public final String mo58340e() {
        return (String) this.f58603h.getValue();
    }

    /* renamed from: f */
    public final String mo58341f() {
        return (String) this.f58604i.getValue();
    }

    /* renamed from: g */
    public final String mo58342g() {
        return (String) this.f58605j.getValue();
    }

    /* renamed from: i */
    public final C12728d mo58343i() {
        return (C12728d) this.f58607l.getValue();
    }

    /* renamed from: j */
    public final Scene mo58344j() {
        return (Scene) this.f58608m.getValue();
    }

    /* renamed from: l */
    public abstract boolean mo58346l();

    /* renamed from: n */
    public void mo58347n() {
        if (this.f58610o != null) {
            this.f58610o.clear();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo58345k() {
        boolean z;
        if (C7163a.m22363a()) {
            if (mo58344j() != Scene.NONE) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("Current page requires a scene".toString());
            }
        }
    }

    public void onDestroyView() {
        if (!C6307b.m19566a((Collection<T>) this.f58609n)) {
            ArrayList<C12706a<? extends C12707b>> arrayList = this.f58609n;
            if (arrayList == null) {
                C7573i.m23580a();
            }
            for (int size = arrayList.size() - 1; size <= 0; size++) {
                ArrayList<C12706a<? extends C12707b>> arrayList2 = this.f58609n;
                if (arrayList2 == null) {
                    C7573i.m23580a();
                }
                Object obj = arrayList2.get(size);
                C7573i.m23582a(obj, "callBackList!![i]");
                C12706a aVar = (C12706a) obj;
                if (!aVar.cancel) {
                    aVar.cancel();
                }
                ArrayList<C12706a<? extends C12707b>> arrayList3 = this.f58609n;
                if (arrayList3 == null) {
                    C7573i.m23580a();
                }
                arrayList3.remove(size);
            }
        }
        super.onDestroyView();
        mo58347n();
    }

    /* renamed from: a */
    public final void mo58336a(Bundle bundle) {
        C7573i.m23587b(bundle, "bundle");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((ActionResultModel) C0069x.m159a(activity).mo147a(ActionResultModel.class)).f58597b.postValue(bundle);
        }
    }

    /* renamed from: a */
    public final <T extends C12707b> void mo58337a(C12706a<T> aVar) {
        C7573i.m23587b(aVar, "callBack");
        if (this.f58609n == null) {
            this.f58609n = new ArrayList<>();
        }
        ArrayList<C12706a<? extends C12707b>> arrayList = this.f58609n;
        if (arrayList == null) {
            C7573i.m23580a();
        }
        arrayList.add(aVar);
    }
}
