package com.p280ss.android.ugc.aweme.commercialize.p1127g;

import android.app.Activity;
import android.content.Intent;
import android.os.Message;
import android.support.p022v4.app.Fragment;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.presenter.C36039m;
import com.p280ss.android.ugc.aweme.profile.util.C36749q;
import com.p280ss.android.ugc.aweme.profile.util.C36749q.C36758a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.g.a */
public final class C24752a implements C6310a, C36758a {

    /* renamed from: a */
    public C36039m f65202a;

    /* renamed from: b */
    private C36749q f65203b;

    /* renamed from: c */
    private C6309f f65204c = new C6309f(this);

    /* renamed from: d */
    private int f65205d;

    /* renamed from: e */
    private String f65206e;

    /* renamed from: a */
    public final void mo64747a() {
        if (this.f65203b != null) {
            this.f65203b.mo93082c();
        }
    }

    /* renamed from: b */
    public final void mo64751b() {
        if (this.f65203b != null) {
            this.f65203b.mo93084d();
        }
        this.f65205d = 0;
    }

    /* renamed from: c */
    public final void mo64753c() {
        if (this.f65203b != null) {
            this.f65203b.mo93085e();
        }
    }

    /* renamed from: b */
    public final void mo64752b(String str) {
        if (this.f65203b != null) {
            this.f65203b.mo93081b(str);
        }
    }

    /* renamed from: a */
    public final void mo64749a(String str) {
        if (this.f65202a != null) {
            this.f65202a.mo61681a(str);
        }
        this.f65206e = str;
    }

    public final void handleMsg(Message message) {
        String str;
        String str2;
        if (this.f65202a != null) {
            if (message.obj instanceof Exception) {
                if (this.f65205d >= 4 || this.f65203b == null || (message.obj instanceof ApiServerException)) {
                    Exception exc = (Exception) message.obj;
                    String str3 = "aweme_avartar_upload_error_rate";
                    C6869c a = C6869c.m21381a();
                    String str4 = "errorDesc";
                    boolean z = exc instanceof ApiServerException;
                    if (z) {
                        str = ((ApiServerException) exc).getErrorMsg();
                    } else {
                        str = exc.getMessage();
                    }
                    C6869c a2 = a.mo16887a(str4, str);
                    String str5 = "errorCode";
                    if (z) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(((ApiServerException) exc).getErrorCode());
                        str2 = sb.toString();
                    } else {
                        str2 = "-1";
                    }
                    C6877n.m21444a(str3, 1, a2.mo16887a(str5, str2).mo16888b());
                    this.f65202a.mo61680a((Exception) message.obj);
                    return;
                }
                this.f65205d++;
                this.f65203b.mo93089h((this.f65205d << 1) * 1000);
            } else if (message.obj instanceof AvatarUri) {
                this.f65202a.mo61679a((AvatarUri) message.obj);
                C6877n.m21444a("aweme_avartar_upload_error_rate", 0, (JSONObject) null);
            }
        }
    }

    /* renamed from: a */
    public final void mo64748a(Activity activity, Fragment fragment) {
        this.f65203b = new C36749q(activity, fragment, new C6309f(this), this);
    }

    /* renamed from: a */
    public final boolean mo64750a(int i, int i2, Intent intent) {
        return this.f65203b.mo80258a(i, i2, intent);
    }
}
