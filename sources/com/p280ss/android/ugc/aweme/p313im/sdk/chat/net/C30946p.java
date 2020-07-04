package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Attachment;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.AudioContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31911k;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.squareup.okhttp.OkHttpClient;
import java.io.File;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.p */
public final class C30946p extends C30942n {

    /* renamed from: b */
    public static int f81038b;

    /* renamed from: c */
    public AudioContent f81039c;

    /* renamed from: d */
    public Message f81040d;

    /* renamed from: e */
    public String f81041e;

    /* renamed from: h */
    private C6309f f81042h;

    /* renamed from: b */
    private String m100725b() {
        List attachments = this.f81040d.getAttachments();
        if (attachments == null || attachments.size() <= 0) {
            return null;
        }
        return ((Attachment) attachments.get(0)).getLocalPath();
    }

    /* renamed from: c */
    private String m100727c() {
        StringBuilder sb = new StringBuilder(C7276d.m22809b(C6399b.m19921a()).toString());
        sb.append("/");
        sb.append(C7074e.m22069b());
        sb.append("/im/audio/download/");
        sb.append(this.f81040d.getConversationShortId());
        return sb.toString();
    }

    /* renamed from: b */
    private static String m100726b(Throwable th) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(th.toString());
        sb.append("\n");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace.length > 5) {
            i = 6;
        } else {
            i = stackTrace.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(stackTrace[i2]);
            sb3.append("\n");
            sb2.append(sb3.toString());
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public final void mo18259a(String str) {
        this.f81040d.setMsgStatus(3);
        f81038b++;
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "MessageAudioUploadItem");
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder("onFailed : ");
            sb.append(str);
            hashMap.put("error", sb.toString());
        }
        C7074e.m22065a("audio_message_send", hashMap);
        C7074e.m22070b("message_upload_audio_error", hashMap);
        C31858ad.m103406a().mo82715a(this.f81040d);
        this.f81042h.post(new Runnable() {
            public final void run() {
                C31863ai.m103533b(C30946p.this.f81040d);
            }
        });
        super.mo18259a(str);
        mo81276e();
    }

    /* renamed from: a */
    public final void mo18261a(Throwable th) {
        this.f81040d.setMsgStatus(3);
        f81038b++;
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "MessageAudioUploadItem");
        if (th != null) {
            StringBuilder sb = new StringBuilder("onError : ");
            sb.append(m100726b(th));
            hashMap.put("error", sb.toString());
        }
        C7074e.m22065a("audio_message_send", hashMap);
        C7074e.m22070b("message_upload_audio_error", hashMap);
        C31858ad.m103406a().mo82715a(this.f81040d);
        this.f81042h.post(new Runnable() {
            public final void run() {
                C31863ai.m103533b(C30946p.this.f81040d);
            }
        });
        super.mo18261a(th);
        mo81276e();
    }

    /* renamed from: a */
    public final void mo81299a(final String str, final UrlModel urlModel) {
        super.mo81299a(str, urlModel);
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "MessageAudioUploadItem");
        hashMap.put("message", str);
        C7074e.m22065a("audio_message_send", hashMap);
        this.f81042h.post(new Runnable() {
            public final void run() {
                String str;
                StringBuilder sb = new StringBuilder();
                sb.append(C30946p.this.f81041e);
                sb.append("/");
                sb.append(C30946p.this.f81039c.getMd5());
                sb.append(".m4a");
                String sb2 = sb.toString();
                List attachments = C30946p.this.f81040d.getAttachments();
                if (attachments != null) {
                    Attachment attachment = (Attachment) attachments.get(0);
                    if (!sb2.equals(attachment.getLocalPath())) {
                        File file = new File(C30946p.this.f81041e);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        C31911k.m103664a(str, sb2);
                        File file2 = new File(str);
                        if (file2.exists()) {
                            file2.delete();
                        }
                        attachment.setLocalPath(sb2);
                    }
                }
                C30946p.this.f81039c.setUrl(urlModel);
                HashMap hashMap = new HashMap();
                hashMap.put("tag", "MessageAudioUploadItem");
                if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
                    StringBuilder sb3 = new StringBuilder(" audio upload success, url is null ");
                    if (C30946p.this.f81040d != null) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(C30946p.this.f81040d.getMsgId());
                        sb4.append(", ");
                        sb4.append(C30946p.this.f81040d.getConversationId());
                        str = sb4.toString();
                    } else {
                        str = "";
                    }
                    sb3.append(str);
                    String sb5 = sb3.toString();
                    hashMap.put("error", sb5);
                    StringBuilder sb6 = new StringBuilder("log_message_audio_error");
                    sb6.append(sb5);
                    C6921a.m21555a(sb6.toString());
                    C7074e.m22065a("audio_message_send", hashMap);
                    C7074e.m22070b("message_upload_audio_error", hashMap);
                }
                C30946p.this.f81040d.setContent(C31913m.m103668a(C30946p.this.f81039c));
                C30946p.this.f81040d.setMsgStatus(1);
                C31863ai.m103535c(C30946p.this.f81040d);
            }
        });
        mo81276e();
    }

    public C30946p(OkHttpClient okHttpClient, C6309f fVar, AudioContent audioContent, Message message) {
        super(okHttpClient);
        this.f81042h = fVar;
        this.f81039c = audioContent;
        this.f81040d = message;
        this.f81000f = m100663a(message);
        this.f81028a = m100725b();
        this.f81041e = m100727c();
    }
}
