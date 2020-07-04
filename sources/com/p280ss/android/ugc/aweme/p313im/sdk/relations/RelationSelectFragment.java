package com.p280ss.android.ugc.aweme.p313im.sdk.relations;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.p315g.C6993a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31912l;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.service.C7093b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.p324d.C32008b;
import com.p280ss.android.ugc.aweme.p313im.service.p324d.C7095a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedHashSet;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.RelationSelectFragment */
public class RelationSelectFragment extends AmeBaseFragment implements C7095a {

    /* renamed from: e */
    public C6892b<Boolean> f19832e;

    /* renamed from: f */
    private View f19833f;

    /* renamed from: g */
    private C31752d f19834g;

    /* renamed from: h */
    private C31732b f19835h;

    /* renamed from: i */
    private SharePackage f19836i;

    /* renamed from: j */
    private LinkedHashSet<IMContact> f19837j;

    /* renamed from: k */
    private boolean f19838k;

    /* renamed from: l */
    private BaseContent f19839l;

    /* renamed from: m */
    private boolean f19840m;

    /* renamed from: a */
    public final void mo18102a(C32008b bVar) {
    }

    /* renamed from: a */
    public final void mo18103a(String str) {
    }

    /* renamed from: a */
    public final void mo18104a(boolean z) {
    }

    /* renamed from: d */
    public final Fragment mo18105d() {
        return this;
    }

    /* renamed from: g */
    public final void mo18108g() {
    }

    /* renamed from: i */
    private void m21884i() {
        m21885j();
        m21886k();
    }

    /* renamed from: e */
    public final void mo18106e() {
        if (this.f19835h != null) {
            this.f19835h.mo82523b();
        }
    }

    /* renamed from: f */
    public final void mo18107f() {
        if (this.f19834g != null) {
            this.f19834g.mo82561l();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f19835h != null) {
            this.f19835h.mo82524c();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f19834g != null) {
            this.f19834g.mo82556g();
        }
        mo18106e();
    }

    /* renamed from: a */
    public final boolean mo18250a() {
        if (this.f19834g == null || m21887l()) {
            return false;
        }
        this.f19834g.mo82560k();
        return true;
    }

    /* renamed from: l */
    private boolean m21887l() {
        if (getActivity() == null) {
            return false;
        }
        int height = getActivity().getWindow().getDecorView().getHeight();
        Rect rect = new Rect();
        getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        if (height - rect.bottom != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m21885j() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f19836i = (SharePackage) arguments.getParcelable("share_package");
            if (this.f19836i != null) {
                C31858ad.m103406a().mo82716a(this.f19836i, (IMContact) null, true);
            }
            this.f19839l = (BaseContent) arguments.getSerializable("share_content");
            BaseContent.wrapForward(this.f19839l, arguments.getLong("forward_origin_msgid"));
            this.f19838k = arguments.getBoolean("extra_no_title");
            this.f19837j = (LinkedHashSet) arguments.getSerializable("key_selected_contact");
        }
    }

    /* renamed from: k */
    private void m21886k() {
        boolean z;
        if (this.f19840m) {
            this.f19834g = new C31613a(getContext(), this.f19833f, this.f19838k);
        } else {
            this.f19834g = new C31752d(getContext(), this.f19833f, this.f19838k);
        }
        this.f19834g.f83091s = this.f19832e;
        this.f19834g.mo82549a(this.f19836i);
        this.f19834g.f83080h = this.f19839l;
        this.f19834g.mo82552a(this.f19837j);
        C31752d dVar = this.f19834g;
        boolean z2 = this.f19840m;
        if (this.f19836i != null) {
            z = true;
        } else {
            z = false;
        }
        this.f19835h = new C31732b(dVar, z2, z, C31912l.m103665a(this.f19836i));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m21884i();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7093b abInterface = ((IIMService) C6993a.m21773a(IIMService.class)).getAbInterface();
        if (C31915n.m103672b()) {
            this.f19840m = false;
        } else {
            this.f19840m = abInterface.mo18355c();
        }
        if (this.f19840m) {
            this.f19833f = layoutInflater.inflate(R.layout.sa, viewGroup, false);
        } else {
            this.f19833f = layoutInflater.inflate(R.layout.s_, viewGroup, false);
        }
        return this.f19833f;
    }
}
