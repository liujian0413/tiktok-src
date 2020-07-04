package com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session;

import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.session.IMBaseSession */
public abstract class IMBaseSession extends C7102a {

    /* renamed from: c */
    public Status f19802c = Status.SUCCESS;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.session.IMBaseSession$Status */
    public enum Status {
        SENDING,
        FAILED,
        SUCCESS
    }

    public String bf_() {
        return this.f19941e;
    }

    /* renamed from: d */
    public final void mo18120d() {
    }

    /* renamed from: a */
    public static Status m21834a(int i) {
        Status status = Status.SUCCESS;
        if (i != 5) {
            switch (i) {
                case 0:
                case 1:
                    return Status.SENDING;
                case 2:
                    break;
                case 3:
                    return Status.FAILED;
                default:
                    return status;
            }
        }
        return Status.SUCCESS;
    }
}
