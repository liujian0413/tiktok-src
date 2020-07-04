package com.p280ss.android.ugc.aweme.profile.presenter;

import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.profile.experiment.UploadAvatarSwitch2TTUpload;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.ttuploader.C42636e;
import com.p280ss.android.ugc.aweme.ttuploader.C42636e.C42638b;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.aa */
public final class C36000aa implements C6310a {

    /* renamed from: a */
    public C6309f f94187a = new C6309f(this);

    /* renamed from: b */
    public C36038l f94188b;

    /* renamed from: c */
    private int f94189c;

    /* renamed from: d */
    private String f94190d;

    /* renamed from: a */
    public final void mo91618a(String str) {
        this.f94190d = str;
        m115965a(0, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo91619b(String str) {
        if (C6384b.m19835a().mo15292a(UploadAvatarSwitch2TTUpload.class, true, "upload_avatar_switch_to_ttupload", C6384b.m19835a().mo15295d().upload_avatar_switch_to_ttupload, false)) {
            C42636e.m135451a().mo104251a(str, 2, false, (C42638b) new C42638b() {
                /* renamed from: a */
                public final void mo91621a(String str) {
                    Message obtainMessage = C36000aa.this.f94187a.obtainMessage(111);
                    obtainMessage.obj = new Exception(str);
                    C36000aa.this.f94187a.sendMessage(obtainMessage);
                }

                /* renamed from: a */
                public final void mo91620a(UrlModel urlModel) {
                    Message obtainMessage = C36000aa.this.f94187a.obtainMessage(111);
                    AvatarUri avatarUri = new AvatarUri();
                    avatarUri.uri = urlModel.getUri();
                    avatarUri.urlList = urlModel.getUrlList();
                    obtainMessage.obj = avatarUri;
                    C36000aa.this.f94187a.sendMessage(obtainMessage);
                }
            });
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f60503c);
        sb.append("?uid=");
        sb.append(C21115b.m71197a().getCurUserId());
        C21115b.m71197a().uploadCover(this.f94187a, sb.toString(), 4194304, str);
    }

    public final void handleMsg(Message message) {
        String str;
        String str2;
        if (this.f94188b != null) {
            if (message.obj instanceof Exception) {
                if (this.f94189c >= 4 || (message.obj instanceof ApiServerException)) {
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
                    C6921a.m21559a((Throwable) (Exception) message.obj);
                    this.f94188b.mo91696a((Exception) message.obj);
                    return;
                }
                this.f94189c++;
                m115965a((this.f94189c << 1) * 1000, this.f94190d);
            } else if (message.obj instanceof AvatarUri) {
                this.f94188b.mo91695a((AvatarUri) message.obj);
                C6877n.m21444a("aweme_avartar_upload_error_rate", 0, (JSONObject) null);
            }
        }
    }

    /* renamed from: a */
    private void m115965a(int i, String str) {
        C6726a.m20843a(new C36002ab(this, str), i);
    }
}
