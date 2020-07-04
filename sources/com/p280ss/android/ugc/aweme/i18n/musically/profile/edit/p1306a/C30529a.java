package com.p280ss.android.ugc.aweme.i18n.musically.profile.edit.p1306a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Message;
import android.os.Parcelable;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.i18n.musically.profile.edit.p1307b.C30530a;
import com.p280ss.android.ugc.aweme.i18n.musically.profile.edit.p1307b.C30530a.C30534a;
import com.p280ss.android.ugc.aweme.i18n.musically.profile.edit.p1308ui.C30536a;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.HeaderDetailActivity;
import com.p280ss.android.ugc.aweme.profile.presenter.C35999a;
import com.p280ss.android.ugc.aweme.utils.C42914ab;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import java.io.Serializable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.profile.edit.a.a */
public final class C30529a extends C35999a implements C30534a {

    /* renamed from: a */
    public boolean f80224a;

    /* renamed from: a */
    public final void mo80245a() {
        if (this.f94182b != null) {
            ((C30530a) this.f94182b).mo80254a();
        }
    }

    /* renamed from: c */
    public final void mo80252c() {
        this.f80224a = true;
        if (this.f94183c != null) {
            ((C30536a) this.f94183c).mo80186e();
        }
    }

    /* renamed from: d */
    public final void mo80253d() {
        if (this.f94182b != null && !TextUtils.isEmpty(this.f94185e)) {
            ((C30530a) this.f94182b).mo80257a(this.f94185e);
        }
    }

    /* renamed from: b */
    public final void mo80251b(String str) {
        if (this.f94183c != null) {
            ((C30536a) this.f94183c).mo80183b(str);
        }
        this.f94185e = str;
    }

    /* renamed from: a */
    public final void mo80248a(View view) {
        if (this.f94182b != null) {
            ((C30530a) this.f94182b).mo80256a(view);
        }
    }

    public final void handleMsg(Message message) {
        String str;
        String str2;
        if (this.f94183c != null) {
            if (message.obj instanceof Exception) {
                if (this.f94184d >= 4 || this.f94182b == null) {
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
                    ((C30536a) this.f94183c).mo80182b((Exception) message.obj);
                    if (this.f94182b != null) {
                        this.f94182b.mo93085e();
                    }
                    return;
                }
                this.f94184d++;
                ((C30530a) this.f94182b).mo80255a((this.f94184d << 1) * 1000);
            } else if (message.obj instanceof AvatarUri) {
                ((C30536a) this.f94183c).mo80181b((AvatarUri) message.obj);
                C6877n.m21444a("aweme_avartar_upload_error_rate", 0, (JSONObject) null);
            }
        }
    }

    /* renamed from: b */
    public final void mo80250b(Activity activity, Fragment fragment) {
        this.f94182b = new C30530a(activity, fragment, new C6309f(this), this);
    }

    /* renamed from: a */
    public final void mo80246a(Activity activity, Fragment fragment) {
        this.f94182b = new C30530a(activity, fragment, new C6309f(this), this);
    }

    /* renamed from: a */
    public final void mo80247a(Activity activity, View view) {
        String[] strArr;
        User curUser = C21115b.m71197a().getCurUser();
        C42914ab a = C42914ab.m136242a().mo104631a("extra_zoom_info", (Parcelable) ZoomAnimationUtils.m136228a(view)).mo104634a("enable_edit_img", false).mo104634a("enable_download_img", true);
        String str = "uri";
        if (TextUtils.isEmpty(this.f94185e)) {
            strArr = C43122ff.m136764a(C43122ff.m136779j(curUser));
        } else {
            StringBuilder sb = new StringBuilder("file://");
            sb.append(this.f94185e);
            strArr = new String[]{Uri.parse(sb.toString()).toString()};
        }
        HeaderDetailActivity.m116635a(activity, a.mo104635a(str, strArr).mo104632a("share_info", (Serializable) curUser).f111445a);
    }

    /* renamed from: a */
    public final boolean mo80249a(int i, int i2, Intent intent) {
        return super.mo80249a(i, i2, intent);
    }
}
