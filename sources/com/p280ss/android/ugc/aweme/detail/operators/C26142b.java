package com.p280ss.android.ugc.aweme.detail.operators;

import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.detail.p1164h.C26066a;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26095a;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26097b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.b */
public class C26142b implements C26134am {

    /* renamed from: a */
    protected C26095a f68969a = new C26095a(1);

    /* renamed from: b */
    private String f68970b;

    /* renamed from: c */
    private C26097b f68971c = new C26097b();

    /* renamed from: a */
    public int mo67682a(int i) {
        return i + 3000;
    }

    /* renamed from: a */
    public final boolean mo67686a(Fragment fragment) {
        return true;
    }

    /* renamed from: f */
    public final boolean mo67692f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo67693g() {
        return false;
    }

    /* renamed from: a */
    public final Object mo67683a() {
        return this.f68969a;
    }

    /* renamed from: c */
    public final boolean mo67689c() {
        return this.f68971c.mo66540i();
    }

    /* renamed from: e */
    public final void mo67691e() {
        this.f68971c.mo59134U_();
        this.f68971c.mo66535W_();
    }

    /* renamed from: b */
    public final boolean mo67688b() {
        if (this.f68969a.getData() == null || C6307b.m19566a((Collection<T>) ((C26066a) this.f68969a.getData()).f68878a)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo67685a(C26138ao aoVar) {
        this.f68971c.mo66537a(aoVar);
        this.f68971c.mo66536a(this.f68969a);
    }

    public C26142b(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder("[");
            sb.append(str);
            sb.append("]");
            str2 = sb.toString();
        }
        this.f68970b = str2;
    }

    /* renamed from: a */
    public final boolean mo67687a(String str) {
        Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str);
        if (awemeById == null) {
            awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getProfileSelfSeeAweme(str);
        }
        if (awemeById == null) {
            return false;
        }
        return this.f68971c.mo67675a((Object) awemeById);
    }

    /* renamed from: a */
    public void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        this.f68971c.mo56976a(this.f68970b, feedParam.getPushParams(), feedParam.getEventType());
    }
}
