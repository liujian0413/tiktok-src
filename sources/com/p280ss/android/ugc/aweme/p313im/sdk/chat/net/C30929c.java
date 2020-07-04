package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net;

import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.MessageViewType;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.c */
public class C30929c extends C6948d {

    /* renamed from: a */
    protected Map<String, C30925ab> f81004a = new HashMap();

    /* renamed from: b */
    protected Queue<C30925ab> f81005b = new LinkedBlockingQueue();

    /* renamed from: c */
    protected Thread f81006c = new C30924aa("upload_thread", this.f81005b, this.f81004a);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C30926ac mo81279a(Message message, BaseContent baseContent) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo18003d() {
        super.mo18003d();
    }

    public C30929c() {
        this.f81006c.start();
    }

    /* renamed from: b */
    public final void mo81284b(Message message) {
        BaseContent content = MessageViewType.content(message);
        if (content != null) {
            mo81283a(mo81279a(message, content));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81283a(C30926ac acVar) {
        if (acVar != null) {
            this.f81005b.offer(acVar);
        }
        synchronized (this.f81005b) {
            this.f81005b.notify();
        }
    }
}
