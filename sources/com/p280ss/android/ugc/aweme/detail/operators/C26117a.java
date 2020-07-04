package com.p280ss.android.ugc.aweme.detail.operators;

import android.support.p022v4.app.Fragment;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25676d;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.a */
public abstract class C26117a<MODEL extends C25673a, PRESENTER extends C25674b<MODEL>> implements C26134am {

    /* renamed from: a */
    protected MODEL f68941a;

    /* renamed from: b */
    protected PRESENTER f68942b;

    /* renamed from: a */
    public int mo67682a(int i) {
        return -1;
    }

    /* renamed from: a */
    public boolean mo67686a(Fragment fragment) {
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
        return this.f68941a;
    }

    /* renamed from: b */
    public final boolean mo67688b() {
        return this.f68941a.isDataEmpty();
    }

    /* renamed from: c */
    public boolean mo67689c() {
        return this.f68942b.mo66540i();
    }

    /* renamed from: d */
    public final boolean mo67690d() {
        if (this.f68942b == null || this.f68941a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo67691e() {
        this.f68942b.mo59134U_();
        this.f68942b.mo66535W_();
    }

    /* renamed from: a */
    public final void mo67685a(C26138ao aoVar) {
        this.f68942b.mo66537a(aoVar);
        this.f68942b.mo66568a((C25676d) aoVar);
        this.f68942b.mo66536a(this.f68941a);
    }

    /* renamed from: a */
    public final boolean mo67687a(String str) {
        String str2;
        String str3;
        boolean a = this.f68942b.mo66569a((Object) C28482e.m93605a(str));
        String str4 = "DeleteAweme";
        StringBuilder sb = new StringBuilder("delete aweme: ");
        sb.append(str);
        if (a) {
            str2 = " success";
        } else {
            str2 = " failed";
        }
        sb.append(str2);
        if (this.f68942b.mo66539h() == null) {
            str3 = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            str3 = ((C25673a) this.f68942b.mo66539h()).getClass().getName();
        }
        sb.append(str3);
        C6921a.m21552a(6, str4, sb.toString());
        return a;
    }

    /* renamed from: a */
    public void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        this.f68942b.mo56976a(Integer.valueOf(i));
    }
}
