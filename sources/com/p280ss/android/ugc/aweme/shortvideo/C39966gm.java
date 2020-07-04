package com.p280ss.android.ugc.aweme.shortvideo;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.C23268a;
import com.p280ss.android.ugc.aweme.base.api.C6891b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gm */
public final class C39966gm extends C23268a {
    @C6593c(mo15949a = "captionAppKey")

    /* renamed from: A */
    public String f103810A;
    @C6593c(mo15949a = "captionAuthorization")

    /* renamed from: B */
    public String f103811B;
    @C6593c(mo15949a = "userStoreRegion")

    /* renamed from: C */
    public String f103812C;
    @C6593c(mo15949a = "aiCutAuthorization")

    /* renamed from: D */
    public String f103813D;
    @C6593c(mo15949a = "aiCutAppKey")

    /* renamed from: E */
    public String f103814E;
    @C6891b
    @C6593c(mo15949a = "appKey")

    /* renamed from: a */
    public String f103815a;
    @C6891b
    @C6593c(mo15949a = "fileHostName")

    /* renamed from: b */
    public String f103816b;
    @C6891b
    @C6593c(mo15949a = "videoHostName")

    /* renamed from: c */
    public String f103817c;
    @C6593c(mo15949a = "sliceTimeout")

    /* renamed from: d */
    public int f103818d;
    @C6593c(mo15949a = "sliceRetryCount")

    /* renamed from: e */
    public int f103819e;
    @C6593c(mo15949a = "sliceSize")

    /* renamed from: f */
    public int f103820f;
    @C6593c(mo15949a = "fileRetryCount")

    /* renamed from: g */
    public int f103821g;
    @C6593c(mo15949a = "maxFailTime")

    /* renamed from: h */
    public int f103822h;
    @C6891b
    @C6593c(mo15949a = "authorization")

    /* renamed from: i */
    public String f103823i;
    @C6593c(mo15949a = "enableHttps")

    /* renamed from: j */
    public int f103824j;
    @C6593c(mo15949a = "enableExternDNS")

    /* renamed from: k */
    public int f103825k;
    @C6593c(mo15949a = "aliveMaxFailTime")

    /* renamed from: l */
    public int f103826l = 6;
    @C6593c(mo15949a = "enableTTNetDNS")

    /* renamed from: m */
    public int f103827m;
    @C6593c(mo15949a = "enablePostMethod")

    /* renamed from: n */
    public int f103828n;
    @C6593c(mo15949a = "openTimeOut")

    /* renamed from: o */
    public int f103829o = 5000;
    @C6593c(mo15949a = "uploadRegion")

    /* renamed from: p */
    public String f103830p;
    @C6593c(mo15949a = "enableExternNet")

    /* renamed from: q */
    public int f103831q;
    @C6593c(mo15949a = "enableQuic")

    /* renamed from: r */
    public int f103832r;
    @C6593c(mo15949a = "enableMutitask")

    /* renamed from: s */
    public int f103833s;
    @C6593c(mo15949a = "ttnetConfigValue")

    /* renamed from: t */
    public int f103834t;
    @C6593c(mo15949a = "enable_tt_uploader_log_callback")

    /* renamed from: u */
    public boolean f103835u;
    @C6593c(mo15949a = "is_stream_upload_enable")

    /* renamed from: v */
    public int f103836v;
    @C6593c(mo15949a = "enable_client_network_judgement")

    /* renamed from: w */
    public boolean f103837w;
    @C6593c(mo15949a = "enable_tt_uploader_ev_state")

    /* renamed from: x */
    public boolean f103838x;
    @C6593c(mo15949a = "testSpeedAppKey")

    /* renamed from: y */
    public String f103839y;
    @C6593c(mo15949a = "testSpeedAuthorization")

    /* renamed from: z */
    public String f103840z;

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadVideoConfig{appKey='");
        sb.append(this.f103815a);
        sb.append('\'');
        sb.append(", fileHostName='");
        sb.append(this.f103816b);
        sb.append('\'');
        sb.append(", videoHostName='");
        sb.append(this.f103817c);
        sb.append('\'');
        sb.append(", sliceTimeout=");
        sb.append(this.f103818d);
        sb.append(", sliceRetryCount=");
        sb.append(this.f103819e);
        sb.append(", sliceSize=");
        sb.append(this.f103820f);
        sb.append(", fileRetryCount=");
        sb.append(this.f103821g);
        sb.append(", maxFailTime=");
        sb.append(this.f103822h);
        sb.append(", authorization='");
        sb.append(this.f103823i);
        sb.append('\'');
        sb.append(", enableHttps=");
        sb.append(this.f103824j);
        sb.append(", enableExternDNS=");
        sb.append(this.f103825k);
        sb.append(", aliveMaxFailTime=");
        sb.append(this.f103826l);
        sb.append(", enableTTNetDNS=");
        sb.append(this.f103827m);
        sb.append(", enablePostMethod=");
        sb.append(this.f103828n);
        sb.append(", openTimeOut=");
        sb.append(this.f103829o);
        sb.append(", uploadRegion='");
        sb.append(this.f103830p);
        sb.append('\'');
        sb.append(", enableExternNet=");
        sb.append(this.f103831q);
        sb.append(", enableQuic=");
        sb.append(this.f103832r);
        sb.append(", enableMutitask=");
        sb.append(this.f103833s);
        sb.append(", ttnetConfigValue=");
        sb.append(this.f103834t);
        sb.append(", enableTTUploaderLogCallback=");
        sb.append(this.f103835u);
        sb.append(", isStreamUploadEnable=");
        sb.append(this.f103836v);
        sb.append(", enableClientNetworkJudgement=");
        sb.append(this.f103837w);
        sb.append(", testSpeedAppKey='");
        sb.append(this.f103839y);
        sb.append('\'');
        sb.append(", testSpeedAuthorization='");
        sb.append(this.f103840z);
        sb.append('\'');
        sb.append(", captionAppKey='");
        sb.append(this.f103810A);
        sb.append('\'');
        sb.append(", captionAuthorization='");
        sb.append(this.f103811B);
        sb.append('\'');
        sb.append(", aiCutAuthorization='");
        sb.append(this.f103813D);
        sb.append('\'');
        sb.append(", aiCutAppKey='");
        sb.append(this.f103814E);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
