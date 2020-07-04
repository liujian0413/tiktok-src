package com.p280ss.android.ugc.aweme.base.component;

import android.widget.PopupWindow.OnDismissListener;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p280ss.android.ugc.aweme.share.C37992at;
import com.p280ss.android.ugc.aweme.share.SilentShareChannel;
import com.p280ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39328f;

/* renamed from: com.ss.android.ugc.aweme.base.component.d */
final /* synthetic */ class C23302d implements OnDismissListener {

    /* renamed from: a */
    private final C39328f f61356a;

    /* renamed from: b */
    private final SilentShareChannel f61357b;

    /* renamed from: c */
    private final AVUploadSaveModel f61358c;

    /* renamed from: d */
    private final AbsActivity f61359d;

    C23302d(C39328f fVar, SilentShareChannel silentShareChannel, AVUploadSaveModel aVUploadSaveModel, AbsActivity absActivity) {
        this.f61356a = fVar;
        this.f61357b = silentShareChannel;
        this.f61358c = aVUploadSaveModel;
        this.f61359d = absActivity;
    }

    public final void onDismiss() {
        C37992at.m121308a(((CreateAwemeResponse) this.f61356a.f102154h).aweme, this.f61357b, this.f61358c.getLocalFinalPath(), this.f61359d);
    }
}
