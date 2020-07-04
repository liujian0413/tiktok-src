package com.bytedance.android.livesdk.adapter;

import android.app.ProgressDialog;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.model.C4905g.C4906a;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.adapter.b */
final /* synthetic */ class C3879b implements C7326g {

    /* renamed from: a */
    private final C38762 f11593a;

    /* renamed from: b */
    private final ProgressDialog f11594b;

    /* renamed from: c */
    private final C4906a f11595c;

    C3879b(C38762 r1, ProgressDialog progressDialog, C4906a aVar) {
        this.f11593a = r1;
        this.f11594b = progressDialog;
        this.f11595c = aVar;
    }

    public final void accept(Object obj) {
        this.f11593a.mo11415a(this.f11594b, this.f11595c, (C3479d) obj);
    }
}
