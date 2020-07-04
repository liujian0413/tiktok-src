package com.p280ss.android.ugc.aweme.p313im.sdk.relations;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.C30566a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.C31661b;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.C31671c;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.C31692e;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.C31702f;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a.C31641d;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1345d.C31690a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.b */
public final class C31732b extends C30566a<C31752d> implements C31641d<IMContact>, C31661b {

    /* renamed from: b */
    public C31702f f83044b;

    /* renamed from: a */
    public final void mo82521a() {
        this.f83044b.mo82407f();
    }

    /* renamed from: c */
    public final void mo82524c() {
        if (this.f83044b != null) {
            this.f83044b.mo82401b();
            this.f83044b.mo82471i();
        }
    }

    /* renamed from: b */
    public final void mo82523b() {
        if (this.f80275a != null) {
            ((C31752d) this.f80275a).mo82562m();
        }
        List c = this.f83044b.mo82404c();
        if (!c.isEmpty()) {
            mo82400a(c, this.f83044b.mo82405d());
        } else {
            this.f83044b.mo82406e();
        }
    }

    /* renamed from: a */
    public final void mo82399a(Throwable th) {
        C6921a.m21559a(th);
    }

    /* renamed from: b */
    public final void mo82402b(Throwable th) {
        C6921a.m21559a(th);
    }

    /* renamed from: c */
    public final void mo82446c(Throwable th) {
        C6921a.m21559a(th);
    }

    /* renamed from: a */
    public final void mo82522a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f83044b.mo82470a(charSequence.toString());
        }
    }

    /* renamed from: a */
    public final void mo82445a(List<IMContact> list, String str) {
        ((C31752d) this.f80275a).mo82394a(list, (CharSequence) str);
    }

    /* renamed from: b */
    public final void mo82403b(List<IMContact> list, boolean z) {
        ((C31752d) this.f80275a).mo82393a(this.f83044b.mo82404c());
    }

    /* renamed from: a */
    public final void mo82400a(List<IMContact> list, boolean z) {
        ((C31752d) this.f80275a).mo82393a(list);
    }

    public C31732b(C31752d dVar, boolean z, boolean z2, boolean z3) {
        int i;
        super(dVar);
        if (z2) {
            i = 2;
        } else {
            i = 0;
        }
        C31690a aVar = new C31690a(i, z3);
        if (z) {
            this.f83044b = new C31692e(aVar);
        } else {
            this.f83044b = new C31671c(aVar);
        }
        this.f83044b.mo82398a((C31641d<IMContact>) this);
        this.f83044b.mo82469a((C31661b) this);
    }
}
