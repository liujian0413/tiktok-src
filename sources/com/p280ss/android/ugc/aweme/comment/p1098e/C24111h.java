package com.p280ss.android.ugc.aweme.comment.p1098e;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.comment.list.C24180f;
import com.p280ss.android.ugc.aweme.comment.list.C24190p;
import com.p280ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p280ss.android.ugc.aweme.comment.p1099f.C24132c;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24147d;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;

/* renamed from: com.ss.android.ugc.aweme.comment.e.h */
public final class C24111h extends C25674b<C24109g> implements C24180f {

    /* renamed from: a */
    public boolean f63753a;

    /* renamed from: a */
    public final /* synthetic */ C25673a mo62524a() {
        return (C25673a) super.mo66539h();
    }

    /* renamed from: e */
    public final int mo62527e() {
        return ((CommentItemList) ((C24109g) mo66539h()).getData()).replyStyle;
    }

    /* renamed from: f */
    public final int mo62528f() {
        if (this.f67571b == null) {
            return 0;
        }
        return ((C24109g) this.f67571b).mo62522b();
    }

    /* renamed from: g */
    public final String mo62529g() {
        if (this.f67571b == null) {
            return "";
        }
        return ((C24109g) this.f67571b).f63744d;
    }

    /* renamed from: b */
    public final void mo56977b() {
        this.f63753a = true;
        super.mo56977b();
        if (this.f67571b != null) {
            C24147d.m79331a(((C24109g) this.f67571b).f63742b, ((C24109g) this.f67571b).mo62522b());
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo62526a(C25675c cVar) {
        super.mo66537a(cVar);
    }

    /* renamed from: a */
    public final void mo62525a(C24190p pVar) {
        ((C24109g) mo66539h()).f63745e = pVar;
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67571b != null && ((C24109g) this.f67571b).mo62521a() && C24112i.m79197a(C6399b.m19921a())) {
            C24132c.m79288a(((C24109g) this.f67571b).f63743c, ((C24109g) this.f67571b).f63742b, ((C24109g) this.f67571b).f63746f, exc);
        }
        this.f63753a = true;
        super.mo57296a(exc);
    }
}
