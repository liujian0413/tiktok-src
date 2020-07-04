package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.DialogInterface;
import com.bytedance.android.live.core.widget.BaseDialogFragment;

class StartLiveSetController$5 implements C0042h {

    /* renamed from: a */
    final /* synthetic */ BaseDialogFragment f9454a;

    /* renamed from: b */
    final /* synthetic */ C3135v f9455b;

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
        this.f9454a.getDialog().setOnDismissListener(new C3090ai(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9854a(DialogInterface dialogInterface) {
        this.f9455b.mo9961a();
    }

    StartLiveSetController$5(C3135v vVar, BaseDialogFragment baseDialogFragment) {
        this.f9455b = vVar;
        this.f9454a = baseDialogFragment;
    }
}
