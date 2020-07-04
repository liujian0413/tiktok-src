package com.p280ss.android.ugc.aweme.following.p1265ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.MtEmptyView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseFragment;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28479b;
import com.p280ss.android.ugc.aweme.following.C29560a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.following.ui.BaseRelationFragment */
public abstract class BaseRelationFragment extends JediBaseFragment implements C29560a {

    /* renamed from: j */
    public static final C29609a f77980j = new C29609a(null);

    /* renamed from: f */
    public String f77981f;

    /* renamed from: g */
    public User f77982g;

    /* renamed from: h */
    public boolean f77983h;

    /* renamed from: i */
    protected C10803a f77984i;

    /* renamed from: k */
    private HashMap f77985k;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.BaseRelationFragment$a */
    public static final class C29609a {
        private C29609a() {
        }

        public /* synthetic */ C29609a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.BaseRelationFragment$b */
    static final class C29610b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BaseRelationFragment f77986a;

        C29610b(BaseRelationFragment baseRelationFragment) {
            this.f77986a = baseRelationFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f77986a.mo75625p();
        }
    }

    /* renamed from: a */
    public View mo60553a(int i) {
        if (this.f77985k == null) {
            this.f77985k = new HashMap();
        }
        View view = (View) this.f77985k.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f77985k.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final boolean aU_() {
        return this.f77983h;
    }

    /* renamed from: g */
    public void mo60554g() {
        if (this.f77985k != null) {
            this.f77985k.clear();
        }
    }

    /* renamed from: j */
    public abstract int mo75619j();

    /* renamed from: l */
    public int mo75621l() {
        return 0;
    }

    /* renamed from: m */
    public String mo75622m() {
        return "";
    }

    /* renamed from: o */
    public boolean mo75624o() {
        return false;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60554g();
    }

    /* renamed from: p */
    public abstract void mo75625p();

    /* renamed from: q */
    public abstract int mo75626q();

    /* renamed from: r */
    public abstract int mo75627r();

    /* renamed from: s */
    public abstract int mo75628s();

    public final void aV_() {
        if (isViewValid()) {
            mo75625p();
            this.f77983h = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C10803a mo69896i() {
        C10803a aVar = this.f77984i;
        if (aVar == null) {
            C7573i.m23583a("mStatusViewBuilder");
        }
        return aVar;
    }

    /* renamed from: n */
    public final String mo75623n() {
        if (mo75620k()) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    /* renamed from: t */
    private final void mo75630t() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f77981f = arguments.getString("uid");
        }
        this.f77982g = C28479b.m93599c();
    }

    /* renamed from: k */
    public final boolean mo75620k() {
        CharSequence charSequence = this.f77981f;
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        return TextUtils.equals(charSequence, a.getCurUserId());
    }

    /* renamed from: a */
    public final void mo75567a(boolean z) {
        this.f77983h = z;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo75630t();
    }

    /* renamed from: a */
    private final C10805b m97144a(String str) {
        int i;
        Context context = getContext();
        if (context == null) {
            C7573i.m23580a();
        }
        C10806a aVar = new C10806a(context);
        if (C6399b.m19944t()) {
            i = R.drawable.awz;
        } else {
            i = R.drawable.b6w;
        }
        C10805b bVar = aVar.mo25985a(i).mo25990b((int) R.string.tl).mo25991b(str).f29135a;
        C7573i.m23582a((Object) bVar, "DmtDefaultStatus.Builder… .desc(errorText).build()");
        return bVar;
    }

    /* renamed from: a */
    private final String m97145a(Exception exc) {
        String str = "";
        if (!(exc instanceof ApiServerException)) {
            return str;
        }
        User user = this.f77982g;
        if (user == null) {
            return str;
        }
        ApiServerException apiServerException = (ApiServerException) exc;
        if (apiServerException.getErrorCode() == 2077 && user.isBlock) {
            String string = getString(R.string.tw);
            C7573i.m23582a((Object) string, "getString(R.string.block_user_empty_info)");
            return string;
        } else if (apiServerException.getErrorCode() == 2078 && user.isBlocked()) {
            String string2 = getString(R.string.bvj);
            C7573i.m23582a((Object) string2, "getString(R.string.is_blocked_empty_info)");
            return string2;
        } else if (apiServerException.getErrorCode() == 2096) {
            String string3 = getString(mo75621l());
            C7573i.m23582a((Object) string3, "getString(getPermissionErrorTextId())");
            return string3;
        } else if (TextUtils.isEmpty(apiServerException.getErrorMsg())) {
            return str;
        } else {
            String errorMsg = apiServerException.getErrorMsg();
            C7573i.m23582a((Object) errorMsg, "exception.errorMsg");
            return errorMsg;
        }
    }

    /* renamed from: a */
    public final void mo75617a(DmtStatusView dmtStatusView) {
        C7573i.m23587b(dmtStatusView, "statusView");
        C10803a b = C10803a.m31631a(getContext()).mo25964b(C43361b.m137644a(getContext(), new C29610b(this)));
        C7573i.m23582a((Object) b, "DmtStatusView.Builder.cr…orViewStatus(errorStatus)");
        this.f77984i = b;
        if (C6399b.m19944t()) {
            MtEmptyView a = MtEmptyView.m31657a(getContext());
            Context context = getContext();
            if (context == null) {
                C7573i.m23580a();
            }
            a.setStatus(new C10806a(context).mo25985a(mo75626q()).mo25990b(mo75628s()).mo25993c(mo75627r()).f29135a);
            C10803a aVar = this.f77984i;
            if (aVar == null) {
                C7573i.m23583a("mStatusViewBuilder");
            }
            aVar.mo25963b((View) a);
        } else {
            Context context2 = getContext();
            if (context2 == null) {
                C7573i.m23580a();
            }
            C10805b bVar = new C10806a(context2).mo25985a(mo75626q()).mo25990b(mo75628s()).mo25993c(mo75627r()).f29135a;
            C10803a aVar2 = this.f77984i;
            if (aVar2 == null) {
                C7573i.m23583a("mStatusViewBuilder");
            }
            aVar2.mo25961a(bVar);
        }
        C10803a aVar3 = this.f77984i;
        if (aVar3 == null) {
            C7573i.m23583a("mStatusViewBuilder");
        }
        dmtStatusView.setBuilder(aVar3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo75618a(DmtStatusView dmtStatusView, Exception exc) {
        C7573i.m23587b(dmtStatusView, "statusView");
        C7573i.m23587b(exc, "e");
        if (!mo75620k() && getContext() != null) {
            String a = m97145a(exc);
            if (!TextUtils.isEmpty(a)) {
                dmtStatusView.mo25939d();
                C10803a aVar = this.f77984i;
                if (aVar == null) {
                    C7573i.m23583a("mStatusViewBuilder");
                }
                aVar.mo25964b(m97144a(a));
                C10803a aVar2 = this.f77984i;
                if (aVar2 == null) {
                    C7573i.m23583a("mStatusViewBuilder");
                }
                dmtStatusView.setBuilder(aVar2);
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(mo75619j(), viewGroup, false);
    }
}
