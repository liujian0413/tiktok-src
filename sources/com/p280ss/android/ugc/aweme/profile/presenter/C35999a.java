package com.p280ss.android.ugc.aweme.profile.presenter;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.profile.experiment.UploadAvatarSwitch2TTUpload;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.util.C36749q;
import com.p280ss.android.ugc.aweme.profile.util.C36749q.C36758a;
import java.io.FileNotFoundException;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.a */
public class C35999a implements C6310a, C36758a {

    /* renamed from: a */
    private C6309f f94181a = new C6309f(this);

    /* renamed from: b */
    protected C36749q f94182b;

    /* renamed from: c */
    public C36039m f94183c;

    /* renamed from: d */
    protected int f94184d;

    /* renamed from: e */
    protected String f94185e;

    /* renamed from: f */
    private List<C19565e> f94186f;

    /* renamed from: b */
    public final void mo64751b() {
        this.f94184d = 0;
    }

    /* renamed from: e */
    public final void mo91615e() {
        mo91613a(this.f94185e, null);
    }

    /* renamed from: f */
    public final void mo91616f() {
        if (this.f94182b != null) {
            this.f94182b.mo93084d();
        }
    }

    /* renamed from: g */
    public final void mo91617g() {
        if (this.f94182b != null) {
            this.f94182b.mo93085e();
        }
    }

    /* renamed from: a */
    public final void mo91611a(int i) {
        if (this.f94182b != null) {
            this.f94182b.mo93080b(i);
        }
    }

    /* renamed from: b */
    public final void mo91614b(int i) {
        if (this.f94182b != null) {
            this.f94182b.mo93083c(i);
        }
    }

    /* renamed from: a */
    public final void mo64749a(String str) {
        this.f94185e = str;
        if (this.f94183c != null) {
            this.f94183c.mo61681a(str);
        }
    }

    public void handleMsg(Message message) {
        String str;
        String str2;
        if (this.f94183c != null) {
            if (message.obj instanceof Exception) {
                Exception exc = (Exception) message.obj;
                if (this.f94182b == null || !m115953a(exc, this.f94184d)) {
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
                    C6877n.m21444a(str3, 1, a2.mo16887a(str5, str2).mo16887a("imageUrl", this.f94185e).mo16888b());
                    C6921a.m21559a((Throwable) (Exception) message.obj);
                    this.f94183c.mo61680a((Exception) message.obj);
                    return;
                }
                this.f94184d++;
                this.f94182b.mo93077a((this.f94184d << 1) * 1000, this.f94185e, this.f94186f);
            } else if (message.obj instanceof AvatarUri) {
                this.f94183c.mo61679a((AvatarUri) message.obj);
                C6877n.m21444a("aweme_avartar_upload_error_rate", 0, (JSONObject) null);
            }
        }
    }

    /* renamed from: b */
    public void mo80250b(Activity activity, Fragment fragment) {
        this.f94182b = new C36749q(activity, fragment, new C6309f(this), this);
    }

    /* renamed from: a */
    private static boolean m115953a(Exception exc, int i) {
        String str;
        if ((exc instanceof ApiServerException) || (exc instanceof FileNotFoundException) || (exc instanceof NullPointerException) || C6384b.m19835a().mo15292a(UploadAvatarSwitch2TTUpload.class, true, "upload_avatar_switch_to_ttupload", C6384b.m19835a().mo15295d().upload_avatar_switch_to_ttupload, false) || i > 3) {
            return false;
        }
        if (exc.getMessage() != null) {
            str = exc.getMessage();
        } else {
            str = "";
        }
        if (str.contains("Content-Length") || (str.contains("expected") && str.contains("received"))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo91613a(String str, List<C19565e> list) {
        this.f94185e = str;
        this.f94186f = list;
        if (this.f94182b != null) {
            this.f94182b.mo93079a(str, list);
        }
    }

    /* renamed from: a */
    public boolean mo80249a(int i, int i2, Intent intent) {
        if (this.f94182b == null) {
            return false;
        }
        return this.f94182b.mo80258a(i, i2, intent);
    }

    /* renamed from: a */
    public final void mo91612a(int i, Activity activity, View view, User user) {
        String uri;
        if (this.f94182b != null) {
            C36749q qVar = this.f94182b;
            if (TextUtils.isEmpty(this.f94185e)) {
                uri = null;
            } else {
                StringBuilder sb = new StringBuilder("file://");
                sb.append(this.f94185e);
                uri = Uri.parse(sb.toString()).toString();
            }
            qVar.mo93076a(0, activity, view, user, uri);
        }
    }
}
