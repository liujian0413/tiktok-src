package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.ISDKService;
import com.p280ss.android.ugc.aweme.services.ISDKService.VideoSplitMessage;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VEUtils;
import java.io.File;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7561a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.backgroundvideo.e */
public final class C40416e {

    /* renamed from: e */
    public static final C40417a f105056e = new C40417a(null);

    /* renamed from: a */
    public final String f105057a;

    /* renamed from: b */
    public final String f105058b;

    /* renamed from: c */
    public final String f105059c;

    /* renamed from: d */
    public final String f105060d;

    /* renamed from: f */
    private final String f105061f;

    /* renamed from: g */
    private final C0043i f105062g;

    /* renamed from: h */
    private final FaceStickerBean f105063h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.backgroundvideo.e$a */
    public static final class C40417a {
        private C40417a() {
        }

        public /* synthetic */ C40417a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.backgroundvideo.e$b */
    static final class C40418b<T> implements C0053p<VideoSplitMessage> {

        /* renamed from: a */
        final /* synthetic */ C40416e f105064a;

        /* renamed from: b */
        final /* synthetic */ C48006q f105065b;

        C40418b(C40416e eVar, C48006q qVar) {
            this.f105064a = eVar;
            this.f105065b = qVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(VideoSplitMessage videoSplitMessage) {
            C7276d.m22820d(this.f105064a.f105057a, this.f105064a.f105059c);
            C7276d.m22820d(this.f105064a.f105058b, this.f105064a.f105060d);
            C48006q qVar = this.f105065b;
            boolean z = true;
            if (videoSplitMessage == null || videoSplitMessage.getResult() != 1) {
                z = false;
            }
            qVar.invoke(Boolean.valueOf(z), this.f105064a.f105059c, this.f105064a.f105060d);
        }
    }

    /* renamed from: b */
    private final boolean m129232b() {
        if (!C7276d.m22812b(this.f105061f) || !C7276d.m22812b(this.f105057a) || !C7276d.m22812b(this.f105058b) || VEUtils.getVideoFileInfo(this.f105057a, new int[11]) != 0 || VEUtils.getAudioFileInfo(this.f105058b, new int[10]) != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final String m129231a() {
        try {
            JSONObject optJSONObject = new JSONObject(this.f105063h.getSdkExtra()).optJSONObject("vl");
            StringBuilder sb = new StringBuilder();
            sb.append(this.f105063h.mLocalPath);
            sb.append(optJSONObject.optString("vPath"));
            return sb.toString();
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder("BackgroundVideo, parse sticker extra fail, ");
            sb2.append(this.f105063h);
            sb2.append(".sdkExtra");
            C41530am.m132283b(sb2.toString());
            return "";
        }
    }

    public C40416e(C0043i iVar, FaceStickerBean faceStickerBean) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(faceStickerBean, "faceSticker");
        this.f105062g = iVar;
        this.f105063h = faceStickerBean;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f105063h.mLocalPath);
        sb.append(File.separator);
        sb.append("res_split");
        this.f105061f = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f105061f);
        sb2.append(File.separator);
        sb2.append("background_v");
        this.f105057a = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f105061f);
        sb3.append(File.separator);
        sb3.append("background_a");
        this.f105058b = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C39811er.f103473i);
        sb4.append("background_v");
        this.f105059c = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(C39811er.f103473i);
        sb5.append("background_a");
        this.f105060d = sb5.toString();
    }

    /* renamed from: a */
    public final void mo100429a(C7561a<C7581n> aVar, C48006q<? super Boolean, ? super String, ? super String, C7581n> qVar) {
        C7573i.m23587b(aVar, "startCallback");
        C7573i.m23587b(qVar, "finishCallback");
        aVar.invoke();
        if (!C7276d.m22812b(C39811er.f103473i)) {
            C7276d.m22803a(C39811er.f103473i, false);
        }
        if (m129232b()) {
            C7276d.m22820d(this.f105057a, this.f105059c);
            C7276d.m22820d(this.f105058b, this.f105060d);
            qVar.invoke(Boolean.valueOf(true), this.f105059c, this.f105060d);
            return;
        }
        if (!C7276d.m22812b(this.f105061f)) {
            C7276d.m22803a(this.f105061f, false);
        }
        String a = m129231a();
        if (!C7276d.m22812b(a)) {
            C41530am.m132283b("BackgroundVideo, default video not exist");
            qVar.invoke(Boolean.valueOf(false), this.f105059c, this.f105060d);
            return;
        }
        int[] iArr = new int[11];
        VEUtils.getVideoFileInfo(a, iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        Object service = ServiceManager.get().getService(IAVService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
        ISDKService sDKService = ((IAVService) service).getSDKService();
        C0052o oVar = new C0052o();
        oVar.observe(this.f105062g, new C40418b(this, qVar));
        sDKService.split(this.f105061f, a, this.f105058b, this.f105057a, i, i2, iArr[7], 1000, oVar);
    }
}
