package com.bytedance.android.live.broadcast.widget;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.android.livesdkapi.depend.p442e.C9312a;

/* renamed from: com.bytedance.android.live.broadcast.widget.ag */
final /* synthetic */ class C3088ag implements OnClickListener {

    /* renamed from: a */
    private final C3135v f9560a;

    /* renamed from: b */
    private final C9312a f9561b;

    C3088ag(C3135v vVar, C9312a aVar) {
        this.f9560a = vVar;
        this.f9561b = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9560a.mo9964a(this.f9561b, dialogInterface, i);
    }
}
