package com.bytedance.android.livesdk.chatroom.interact;

import android.content.Context;
import com.bytedance.android.live.core.utils.C3356aa;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.C4918o;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.aa */
public final class C4466aa {

    /* renamed from: a */
    private String f13005a;

    /* renamed from: b */
    private String f13006b;

    /* renamed from: c */
    private float f13007c;

    /* renamed from: d */
    private long f13008d;

    /* renamed from: e */
    private int f13009e;

    /* renamed from: f */
    private int f13010f;

    /* renamed from: g */
    private int f13011g;

    /* renamed from: h */
    private int f13012h;

    /* renamed from: i */
    private C7321c f13013i;

    /* renamed from: b */
    public final void mo12224b() {
        if (this.f13013i != null && !this.f13013i.isDisposed()) {
            this.f13013i.dispose();
        }
    }

    /* renamed from: a */
    public final void mo12223a() {
        this.f13007c = ((float) C3356aa.m12507a()) / 1024.0f;
        this.f13013i = C9057b.m27053a((long) DouPlusShareGuideExperiment.MIN_VALID_DURATION, TimeUnit.MILLISECONDS).mo19294a(C7333a.m23044b()).mo19317d((C7327h<? super T, ? extends R>) new C4467ab<Object,Object>(this)).mo19290a(C4468ac.f13015a).mo19294a(C47549a.m148327a()).mo19280a(C4469ad.f13016a, C4479ae.f13068a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C4918o mo12222a(Long l) throws Exception {
        JSONObject jSONObject = new JSONObject();
        float a = ((float) C3356aa.m12507a()) / 1024.0f;
        float f = a - this.f13007c;
        String a2 = C3356aa.m12508a(C3358ac.m12528e().getPackageName());
        Context e = C3358ac.m12528e();
        jSONObject.put("vendor", this.f13005a);
        jSONObject.put("server_ip", this.f13006b);
        jSONObject.put("resolution_ratio", this.f13009e * this.f13010f);
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append("MB");
        jSONObject.put("memory", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f);
        sb2.append("MB");
        jSONObject.put("live_push_memory", sb2.toString());
        jSONObject.put("cpu", a2);
        jSONObject.put("room_id", this.f13008d);
        jSONObject.put("video_bitrate", this.f13011g);
        jSONObject.put("video_fps", this.f13012h);
        jSONObject.put("rtmp_type", 2);
        C4918o oVar = new C4918o();
        oVar.f14056a = jSONObject.toString();
        oVar.f14058c = TTLiveSDKContext.getHostService().mo22367h().mo22179b();
        oVar.f14057b = TTLiveSDKContext.getHostService().mo22360a().getServerDeviceId();
        oVar.f14060e = NetworkUtils.getNetworkOperatorCode(e);
        oVar.f14059d = NetworkUtils.getNetworkAccessType(e);
        return oVar;
    }

    public C4466aa(String str, String str2, long j, int i, int i2, int i3, int i4) {
        this.f13005a = str;
        this.f13006b = str2;
        this.f13008d = j;
        this.f13009e = i;
        this.f13010f = i2;
        this.f13011g = i3;
        this.f13012h = i4;
    }
}
