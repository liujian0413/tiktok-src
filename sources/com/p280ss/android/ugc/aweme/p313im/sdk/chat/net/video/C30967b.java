package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.video;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p263im.core.model.Attachment;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.EncryptedVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30926ac;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30981y;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.C30957a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.EncryptUrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.p1329b.C31353d;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31913m;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7074e;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService.CompileParam;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService.CompileResult;
import java.util.HashMap;
import kotlin.C7581n;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.video.b */
public final class C30967b extends C30926ac implements C30966a {

    /* renamed from: a */
    public StoryVideoContent f81080a;

    /* renamed from: b */
    public C30966a f81081b;

    /* renamed from: c */
    private C6309f f81082c;

    /* renamed from: d */
    private Message f81083d;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo81358c() {
        C31863ai.m103535c(this.f81083d);
    }

    /* renamed from: f */
    private void m100773f() {
        if (this.f81083d != null) {
            this.f81082c.post(new C30971e(this));
        }
    }

    /* renamed from: a */
    public final void mo18257a() {
        if (this.f81081b != null) {
            this.f81081b.mo18257a();
        }
        mo81276e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo81357b() {
        this.f81083d.setMsgStatus(3);
        C31863ai.m103533b(this.f81083d);
    }

    /* renamed from: d */
    private void m100772d() {
        if (!C30972f.m100787a(C6399b.m19921a())) {
            mo18259a("99");
            return;
        }
        Attachment attachment = null;
        final Attachment attachment2 = null;
        for (Attachment attachment3 : this.f81083d.getAttachments()) {
            if (attachment3 != null) {
                if (attachment == null && attachment3.getIndex() == 0) {
                    attachment = attachment3;
                } else if (attachment2 == null && attachment3.getIndex() == 1) {
                    attachment2 = attachment3;
                }
                if (!(attachment == null || attachment2 == null)) {
                    break;
                }
            }
        }
        if (attachment == null || TextUtils.isEmpty(attachment.getLocalPath())) {
            mo18259a("96");
        } else if (attachment2 == null || TextUtils.isEmpty(attachment2.getLocalPath())) {
            mo18259a("102");
        } else {
            C30957a.m100742a().mo81328a(attachment.getLocalPath(), 1, (C30981y) new C30981y() {
                /* renamed from: a */
                public final void mo18257a() {
                }

                /* renamed from: a */
                public final void mo18258a(double d) {
                }

                /* renamed from: a */
                public final void mo18259a(String str) {
                    C30967b.this.mo18259a(str);
                }

                /* renamed from: a */
                public final void mo18261a(Throwable th) {
                    C30967b.this.mo18261a(th);
                }

                /* renamed from: a */
                public final void mo18260a(String str, UrlModel urlModel) {
                    if (urlModel != null) {
                        C30967b.this.f81080a.getCheckPicList().add(urlModel.getUri());
                        C30957a.m100742a().mo81329a(attachment2.getLocalPath(), C30967b.this, false);
                    }
                }
            }, false);
        }
    }

    public final void run() {
        super.run();
        if (this.f81083d.getAttachments() == null || this.f81083d.getAttachments().size() < 3) {
            mo18259a("96");
            return;
        }
        for (Attachment attachment : this.f81083d.getAttachments()) {
            if (attachment != null && attachment.getStatus() < 0 && attachment.getIndex() == 1) {
                m100771b(attachment.getLocalPath());
                return;
            }
        }
        m100772d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C7581n mo81356a(CompileResult compileResult) {
        if (compileResult != null) {
            StoryVideoContent.updateAfterVECompile(this.f81080a, this.f81083d, compileResult);
            m100772d();
            return null;
        }
        C6921a.m21555a("EncryptedVideoUploadItem compileVideoAndUpload compile failed");
        mo18259a("105");
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30967b)) {
            return false;
        }
        return this.f81000f.equals(((C30967b) obj).f81000f);
    }

    /* renamed from: b */
    private void m100771b(String str) {
        if (TextUtils.isEmpty(str)) {
            C6921a.m21555a("EncryptedVideoUploadItem compileVideoAndUpload path empty");
            mo18259a("102");
            return;
        }
        C31353d.m102072a(new CompileParam(str, this.f81080a.getWidth(), this.f81080a.getHeight()), new C30969c(this));
    }

    /* renamed from: a */
    public final void mo18258a(double d) {
        if (this.f81081b != null) {
            this.f81081b.mo18258a(d);
        }
    }

    /* renamed from: a */
    public final void mo18259a(String str) {
        if (this.f81081b != null) {
            this.f81081b.mo18259a(str);
        }
        m100773f();
        mo81276e();
        m100770a(str, true);
    }

    /* renamed from: a */
    public final void mo18261a(Throwable th) {
        if (this.f81081b != null) {
            this.f81081b.mo18261a(th);
        }
        m100773f();
        mo81276e();
        m100770a(th, true);
    }

    /* renamed from: a */
    private void m100770a(Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("tag", "EncryptedVideoUploadItem");
        if (obj != null) {
            if (z) {
                hashMap.put("error", obj);
            } else {
                hashMap.put("success", obj);
            }
        }
        hashMap.put("message", this.f81083d);
        C7074e.m22065a("message_upload_video", hashMap);
        if (z) {
            C7074e.m22070b("message_upload_video_error", hashMap);
        }
    }

    public C30967b(C6309f fVar, StoryVideoContent storyVideoContent, Message message) {
        this.f81082c = fVar;
        this.f81083d = message;
        this.f81080a = storyVideoContent;
        this.f81000f = m100663a(this.f81083d);
    }

    /* renamed from: a */
    public final void mo81355a(String str, EncryptedVideoContent encryptedVideoContent, EncryptUrlModel encryptUrlModel) {
        if (encryptedVideoContent != null) {
            this.f81080a.setPoster(encryptUrlModel);
            this.f81080a.setVideo(encryptedVideoContent);
            if (this.f81081b != null) {
                this.f81081b.mo81355a(str, encryptedVideoContent, encryptUrlModel);
            }
            if (this.f81083d != null) {
                this.f81083d.setContent(C31913m.m103668a(this.f81080a));
                this.f81082c.post(new C30970d(this));
            }
        }
        mo81276e();
        m100770a(str, false);
    }
}
