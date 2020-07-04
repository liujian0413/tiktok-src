package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Attachment;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.AudioContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.squareup.okhttp.OkHttpClient;
import java.io.File;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.o */
public final class C30943o extends C30930e {

    /* renamed from: d */
    public AudioContent f81031d;

    /* renamed from: e */
    public Message f81032e;

    /* renamed from: h */
    private C6309f f81033h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo81285a() {
        if (TextUtils.isEmpty(this.f81009b)) {
            StringBuilder sb = new StringBuilder(C7276d.m22809b(C6399b.m19921a()).toString());
            sb.append("/");
            sb.append(C7074e.m22069b());
            sb.append("/im/audio/download/");
            sb.append(this.f81032e.getConversationShortId());
            this.f81009b = sb.toString();
        }
        return this.f81009b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo81289c(String str) {
        if (this.f81031d != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f81031d.getMd5());
            sb.append(".m4a");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".m4a");
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo81288b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/");
        sb.append(this.f81031d.getMd5());
        sb.append(".m4a");
        String sb2 = sb.toString();
        if (!this.f81032e.isSelf()) {
            return sb2;
        }
        List attachments = this.f81032e.getAttachments();
        if (attachments != null && attachments.size() > 0) {
            Attachment attachment = (Attachment) attachments.get(0);
            if (this.f81032e.getMsgStatus() == 3) {
                return attachment.getLocalPath();
            }
        }
        return sb2;
    }

    /* renamed from: a */
    public final void mo80606a(Throwable th) {
        String str;
        super.mo80606a(th);
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "MessageAudioDownloadItem");
        if (th != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f81009b);
            sb.append(mo81289c("download"));
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(th.toString());
            sb3.append(", message id is ");
            if (this.f81032e != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(this.f81032e.getMsgId());
                sb4.append(" ; ");
                sb4.append(this.f81032e.getConversationId());
                str = sb4.toString();
            } else {
                str = "";
            }
            sb3.append(str);
            sb3.append(" , ");
            sb3.append(sb2);
            String sb5 = sb3.toString();
            hashMap.put("error", sb5);
            StringBuilder sb6 = new StringBuilder("log_message_audio_error");
            sb6.append(sb5);
            C6921a.m21555a(sb6.toString());
        }
        C7074e.m22065a("audio_message_download", hashMap);
        C7074e.m22070b("audio_message_download_error", hashMap);
        if (!this.f81032e.isSelf()) {
            this.f81032e.setMsgStatus(3);
        }
        this.f81033h.post(new Runnable() {
            public final void run() {
                C31863ai.m103533b(C30943o.this.f81032e);
            }
        });
        mo81276e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo81287a(String str) {
        File file;
        if (this.f81032e.getMsgStatus() == 2) {
            file = new File(this.f81009b, mo81289c(str));
        } else {
            file = new File(str);
        }
        if (file.exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo80605a(final String str, final UrlModel urlModel) {
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "MessageAudioDownloadItem");
        hashMap.put("message", str);
        C7074e.m22065a("audio_message_download", hashMap);
        this.f81032e.setContent(C31913m.m103668a(this.f81031d));
        this.f81033h.post(new Runnable() {
            public final void run() {
                if (!C30943o.this.f81032e.isSelf()) {
                    C30943o.this.f81032e.setMsgStatus(2);
                }
                C31863ai.m103533b(C30943o.this.f81032e);
                if (C30943o.this.f81010c != null) {
                    C30943o.this.f81010c.mo80605a(str, urlModel);
                }
            }
        });
        mo81276e();
    }

    public C30943o(OkHttpClient okHttpClient, C6309f fVar, AudioContent audioContent, Message message) {
        super(okHttpClient);
        this.f81033h = fVar;
        this.f81031d = audioContent;
        this.f81032e = message;
        this.f81008a = audioContent.getUrl();
        this.f81000f = m100677a(this.f81032e);
    }
}
