package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.MessageViewType;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.AudioContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30931f.C30933a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31870ap;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.a */
public final class C6946a extends C6948d {

    /* renamed from: f */
    private static C31870ap<C6946a> f19645f = new C31870ap<C6946a>() {
        /* renamed from: c */
        private static C6946a m21614c() {
            return new C6946a();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo18004a() {
            return m21614c();
        }
    };

    /* renamed from: a */
    protected Thread f19646a = new C30924aa("download_thread", this.f19647b, this.f19648c);

    /* renamed from: b */
    private Queue<C30925ab> f19647b = new LinkedBlockingQueue();

    /* renamed from: c */
    private Map<String, C30925ab> f19648c = new HashMap();

    /* renamed from: a */
    public static C6946a m21606a() {
        return (C6946a) f19645f.mo82721b();
    }

    /* renamed from: b */
    public final boolean mo18002b() {
        File c = m21609c();
        if (!c.exists()) {
            return false;
        }
        C7276d.m22810b(c);
        return true;
    }

    public C6946a() {
        this.f19646a.start();
    }

    /* renamed from: c */
    public static File m21609c() {
        StringBuilder sb = new StringBuilder(C7276d.m22809b(C6399b.m19921a()).toString());
        sb.append("/");
        sb.append(C7074e.m22069b());
        sb.append("/im/audio/download/");
        return new File(sb.toString());
    }

    /* renamed from: d */
    public final void mo18003d() {
        super.mo18003d();
        if (this.f19648c != null) {
            for (Entry value : this.f19648c.entrySet()) {
                C30930e eVar = (C30930e) value.getValue();
                if (eVar != null) {
                    eVar.mo81286a((C30933a) null);
                }
            }
        }
    }

    /* renamed from: a */
    private void m21608a(C30930e eVar) {
        this.f19647b.offer(eVar);
        synchronized (this.f19647b) {
            this.f19647b.notify();
        }
    }

    /* renamed from: a */
    public final boolean mo18001a(Message message) {
        BaseContent content = MessageViewType.content(message);
        if (content == null) {
            return false;
        }
        C30930e a = m21607a(message, content);
        if (a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.mo81285a());
            sb.append("/");
            sb.append(a.mo81289c("download"));
            File file = new File(sb.toString());
            if (file.exists()) {
                file.delete();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private C30930e m21607a(Message message, BaseContent baseContent) {
        if (baseContent instanceof AudioContent) {
            return new C30943o(this.f19650e, this.f19649d, (AudioContent) baseContent, message);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo18000a(String str, Message message, C30933a aVar) {
        if (message != null) {
            BaseContent content = MessageViewType.content(message);
            if (content != null) {
                if (content instanceof AudioContent) {
                    UrlModel url = ((AudioContent) content).getUrl();
                    if (url == null || url.getUrlList() == null || url.getUrlList().isEmpty()) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("tag", "AudioMsgDownloadProcessor");
                        StringBuilder sb = new StringBuilder(" audioContent url parse is null , message id is ");
                        sb.append(message.getMsgId());
                        sb.append(", conversation id : ");
                        sb.append(message.getConversationId());
                        sb.append(" , ");
                        sb.append(message.getContent());
                        String sb2 = sb.toString();
                        hashMap.put("error", sb2);
                        C7074e.m22070b("audio_message_download_error", hashMap);
                        StringBuilder sb3 = new StringBuilder("log_message_audio_error");
                        sb3.append(sb2);
                        C6921a.m21555a(sb3.toString());
                        return;
                    }
                }
                C30930e a = m21607a(message, content);
                if (a != null) {
                    a.mo81286a(aVar);
                    m21608a(a);
                }
            }
        }
    }
}
