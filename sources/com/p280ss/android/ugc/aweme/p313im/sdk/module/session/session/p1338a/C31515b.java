package com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.p1338a;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.C6425b;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C7018d;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.ChatSession;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.IMBaseSession;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31877aw;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.session.a.b */
public final class C31515b implements C31514a {

    /* renamed from: a */
    private C7102a f82512a;

    /* renamed from: c */
    public final String mo82225c() {
        return C31877aw.m103572a(C6399b.m19921a(), this.f82512a.f19945i);
    }

    /* renamed from: b */
    public final String mo82224b() {
        if (this.f82512a.mo18115b() != 2) {
            return this.f82512a.f19944h;
        }
        C7018d dVar = (C7018d) this.f82512a;
        StringBuilder sb = new StringBuilder();
        sb.append(m102474a(dVar.f19943g));
        sb.append("：");
        sb.append(dVar.f19944h);
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo82223a() {
        String str;
        int b = this.f82512a.mo18115b();
        if (b == 0) {
            IMUser b2 = C6961d.m21657a().mo18029b(String.valueOf(C6425b.m20074a(((ChatSession) this.f82512a).bf_())));
            if (b2 != null) {
                str = b2.getDisplayName();
            } else {
                str = null;
            }
        } else if (b == 2) {
            return C6399b.m19921a().getString(R.string.bpw);
        } else {
            str = this.f82512a.f19943g;
        }
        return str;
    }

    /* renamed from: d */
    public final Drawable mo82226d() {
        int b = this.f82512a.mo18115b();
        Drawable drawable = null;
        if (b == 0 || b == 20) {
            IMBaseSession iMBaseSession = (IMBaseSession) this.f82512a;
            switch (iMBaseSession.f19802c) {
                case FAILED:
                    drawable = C6399b.m19921a().getResources().getDrawable(R.drawable.azq);
                    break;
                case SENDING:
                    drawable = C6399b.m19921a().getResources().getDrawable(R.drawable.azr);
                    break;
            }
            return drawable;
        } else if (this.f82512a.f19947k == 1) {
            return C6399b.m19921a().getResources().getDrawable(R.drawable.aun);
        } else {
            return null;
        }
    }

    public C31515b(C7102a aVar) {
        this.f82512a = aVar;
    }

    /* renamed from: a */
    private static String m102474a(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 6) {
            return str;
        }
        String substring = str.substring(0, 6);
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append("...");
        return sb.toString();
    }
}
