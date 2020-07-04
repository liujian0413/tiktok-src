package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.bytedance.android.live.core.widget.BaseDialogFragment;

public final class PreviewCommodityWidget$onSelectCommodity$1$1 implements C0042h {

    /* renamed from: a */
    final /* synthetic */ C3005f f9393a;

    /* renamed from: b */
    final /* synthetic */ BaseDialogFragment f9394b;

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewCommodityWidget$onSelectCommodity$1$1$a */
    static final class C3014a implements OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ PreviewCommodityWidget$onSelectCommodity$1$1 f9395a;

        C3014a(PreviewCommodityWidget$onSelectCommodity$1$1 previewCommodityWidget$onSelectCommodity$1$1) {
            this.f9395a = previewCommodityWidget$onSelectCommodity$1$1;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            this.f9395a.f9393a.f9383a.mo9817b();
        }
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void onResume() {
        this.f9394b.getDialog().setOnDismissListener(new C3014a(this));
    }

    PreviewCommodityWidget$onSelectCommodity$1$1(C3005f fVar, BaseDialogFragment baseDialogFragment) {
        this.f9393a = fVar;
        this.f9394b = baseDialogFragment;
    }
}
