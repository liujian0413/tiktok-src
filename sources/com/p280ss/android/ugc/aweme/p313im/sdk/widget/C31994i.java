package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.widget.ImageView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C6425b;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.ChatSession;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.ChatSession.VerifyType;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31889bb;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31915n;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.i */
public final class C31994i {

    /* renamed from: a */
    public ImageView f83687a = this.f82452i;

    /* renamed from: a */
    public final void mo82924a(IMUser iMUser) {
        m103916a(this.f83687a, iMUser);
    }

    /* renamed from: a */
    public final void mo82923a(C7102a aVar) {
        this.f83687a.setVisibility(8);
        if (aVar.bg_() != 1) {
            boolean z = aVar instanceof ChatSession;
            if (!z || !((ChatSession) aVar).f19794b) {
                if (z) {
                    long a = C6425b.m20074a(aVar.bf_());
                    if (a > 0) {
                        IMUser b = C6961d.m21657a().mo18029b(String.valueOf(a));
                        if (C31889bb.m103603b(b)) {
                            ((ChatSession) aVar).f19793a = VerifyType.MUSICIAN;
                        } else if (C31889bb.m103604c(b)) {
                            ((ChatSession) aVar).f19793a = VerifyType.ENTERPRISE;
                        } else if (C31889bb.m103602a(b)) {
                            ((ChatSession) aVar).f19793a = VerifyType.OTHER;
                        } else {
                            ((ChatSession) aVar).f19793a = VerifyType.NONE;
                        }
                        if (!C6399b.m19944t()) {
                            C31889bb.m103600a(this.f83687a, ((ChatSession) aVar).f19793a);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        if (!C31915n.m103671a()) {
            this.f83687a.setVisibility(0);
            this.f83687a.setImageResource(R.drawable.b5t);
        }
    }

    /* renamed from: a */
    private static void m103916a(ImageView imageView, IMUser iMUser) {
        VerifyType verifyType;
        if (C31889bb.m103603b(iMUser)) {
            verifyType = VerifyType.MUSICIAN;
        } else if (C31889bb.m103604c(iMUser)) {
            verifyType = VerifyType.ENTERPRISE;
        } else if (C31889bb.m103602a(iMUser)) {
            verifyType = VerifyType.OTHER;
        } else {
            verifyType = VerifyType.NONE;
        }
        C31889bb.m103600a(imageView, verifyType);
    }
}
