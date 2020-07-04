package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.C30957a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.EncryptUrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31932z;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.h */
public final class C30935h extends C30926ac implements C30981y {

    /* renamed from: a */
    public StoryPictureContent f81019a;

    /* renamed from: b */
    public C30981y f81020b;

    /* renamed from: c */
    private C6309f f81021c;

    /* renamed from: d */
    private Message f81022d;

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo81294d() {
        C31863ai.m103535c(this.f81022d);
    }

    /* renamed from: a */
    public final void mo18257a() {
        if (this.f81020b != null) {
            this.f81020b.mo18257a();
        }
        mo81276e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo81292b() {
        this.f81022d.setMsgStatus(3);
        C31863ai.m103533b(this.f81022d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo81293c() {
        this.f81022d.setMsgStatus(3);
        C31863ai.m103533b(this.f81022d);
    }

    public final void run() {
        super.run();
        if (!C30940l.m100711a(C6399b.m19921a())) {
            mo18259a("99");
            return;
        }
        List checkPics = this.f81019a.getCheckPics();
        if (checkPics == null || checkPics.size() == 0) {
            mo18259a("96");
            return;
        }
        C30957a.m100742a().mo81328a((String) this.f81019a.getCheckPics().get(0), 1, (C30981y) new C30981y() {
            /* renamed from: a */
            public final void mo18257a() {
            }

            /* renamed from: a */
            public final void mo18258a(double d) {
            }

            /* renamed from: a */
            public final void mo18259a(String str) {
                C30935h.this.mo18259a(str);
            }

            /* renamed from: a */
            public final void mo18261a(Throwable th) {
                C30935h.this.mo18261a(th);
            }

            /* renamed from: a */
            public final void mo18260a(String str, UrlModel urlModel) {
                String str2;
                if (urlModel != null) {
                    C31932z.m103708c(str);
                    C30935h.this.f81019a.getCheckPics().set(0, urlModel.getUri());
                    if (C30935h.this.f81019a.isSendRaw()) {
                        str2 = C30935h.this.f81019a.getPicturePath();
                    } else if (TextUtils.isEmpty(C30935h.this.f81019a.getCompressPath())) {
                        str2 = C30935h.this.f81019a.getPicturePath();
                    } else {
                        str2 = C30935h.this.f81019a.getCompressPath();
                    }
                    C30957a.m100742a().mo81328a(str2, 0, (C30981y) C30935h.this, false);
                }
            }
        }, false);
    }

    /* renamed from: a */
    public final void mo18258a(double d) {
        if (this.f81020b != null) {
            this.f81020b.mo18258a(d);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30935h)) {
            return false;
        }
        return this.f81000f.equals(((C30935h) obj).f81000f);
    }

    /* renamed from: a */
    public final void mo18259a(String str) {
        if (this.f81020b != null) {
            this.f81020b.mo18259a(str);
        }
        if (this.f81022d != null) {
            this.f81021c.post(new C30939k(this));
        }
        mo81276e();
        m100697a((Object) str, true);
        C31858ad.m103406a().mo82715a(this.f81022d);
    }

    /* renamed from: a */
    public final void mo18261a(Throwable th) {
        if (this.f81020b != null) {
            this.f81020b.mo18261a(th);
        }
        if (this.f81022d != null) {
            this.f81021c.post(new C30938j(this));
        }
        mo81276e();
        m100697a((Object) th, true);
        C31858ad.m103406a().mo82715a(this.f81022d);
    }

    /* renamed from: a */
    private void m100697a(Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "EncryptImageUploadItem");
        if (obj != null) {
            if (z) {
                hashMap.put("error", obj);
            } else {
                hashMap.put("success", obj);
            }
        }
        hashMap.put("message", this.f81022d);
        C7074e.m22065a("message_upload_image", hashMap);
        if (z) {
            C7074e.m22070b("message_upload_image_error", hashMap);
        }
    }

    /* renamed from: a */
    public final void mo18260a(String str, UrlModel urlModel) {
        if (urlModel != null) {
            C31932z.m103708c(this.f81019a.getCompressPath());
            this.f81019a.setUrl((EncryptUrlModel) urlModel);
            if (this.f81020b != null) {
                this.f81020b.mo18260a(str, urlModel);
            }
            if (this.f81022d != null) {
                this.f81022d.setContent(C31913m.m103668a(this.f81019a));
                this.f81021c.post(new C30937i(this));
            }
        }
        mo81276e();
        m100697a((Object) str, false);
    }

    public C30935h(C6309f fVar, StoryPictureContent storyPictureContent, Message message) {
        this.f81021c = fVar;
        this.f81019a = storyPictureContent;
        this.f81022d = message;
        this.f81000f = m100663a(this.f81022d);
    }
}
