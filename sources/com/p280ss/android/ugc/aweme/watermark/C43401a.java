package com.p280ss.android.ugc.aweme.watermark;

import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.IFestivalService;
import com.p280ss.android.ugc.aweme.shortvideo.C39799ej;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.C41640a;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.WaterMarkPositionConfig;
import com.p280ss.android.ugc.aweme.watermark.C43404d.C43405a;
import com.p280ss.android.vesdk.VEWaterMarkPosition;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.watermark.a */
public final class C43401a implements C41640a {

    /* renamed from: a */
    private String f112404a;

    /* renamed from: b */
    private int f112405b;

    /* renamed from: c */
    private int f112406c;

    /* renamed from: d */
    private int f112407d;

    /* renamed from: e */
    private Map<String, String[]> f112408e = new HashMap();

    /* renamed from: b */
    public final void mo102263b() {
        this.f112408e.clear();
    }

    /* renamed from: a */
    public final WaterMarkPositionConfig mo102261a() {
        float f = ((float) this.f112405b) / 720.0f;
        int i = (int) (16.0f * f);
        int i2 = (int) (f * 20.0f);
        WaterMarkPositionConfig waterMarkPositionConfig = new WaterMarkPositionConfig();
        waterMarkPositionConfig.xOffset = i;
        waterMarkPositionConfig.yOffset = i2;
        waterMarkPositionConfig.position = VEWaterMarkPosition.TL_BR;
        return waterMarkPositionConfig;
    }

    /* renamed from: b */
    private static boolean m137728b(C22200c cVar) {
        return TextUtils.equals(C35563c.f93260w.mo57091d(), cVar.mo58560c());
    }

    /* renamed from: a */
    private String m137727a(C22200c cVar) {
        String str;
        if (cVar == null) {
            str = "";
        } else if (TextUtils.isEmpty(cVar.mo58558a())) {
            str = cVar.mo58559b();
        } else {
            str = cVar.mo58558a();
        }
        if (C6399b.m19944t()) {
            return str;
        }
        if (cVar == null || !m137728b(cVar)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C29960a.m98230a().getString(R.string.bfo));
            sb.append(str);
            return sb.toString();
        }
        return C29960a.m98230a().getString(R.string.dlt, new Object[]{str});
    }

    /* renamed from: a */
    public final void mo102262a(boolean z, C22200c cVar) {
        mo102264b(z, cVar);
    }

    /* renamed from: b */
    public final String[] mo102264b(boolean z, C22200c cVar) {
        String str;
        boolean z2;
        String[] strArr;
        String str2;
        String str3;
        if (TextUtils.isEmpty(cVar.mo58558a())) {
            str = cVar.mo58559b();
        } else {
            str = cVar.mo58558a();
        }
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(z);
        String sb2 = sb.toString();
        String[] strArr2 = (String[]) this.f112408e.get(sb2);
        if (strArr2 != null && strArr2.length > 0) {
            return strArr2;
        }
        String a = C6306c.m19561a(this.f112404a);
        if (TextUtils.isEmpty(str)) {
            C6921a.m21559a((Throwable) new IllegalArgumentException("userId is empty"));
            return null;
        }
        File file = new File(C39811er.f103476l);
        if (file.exists() || file.mkdirs()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f112405b == 0 || this.f112406c == 0) {
            return null;
        }
        if (!z2) {
            StringBuilder sb3 = new StringBuilder("provide error ");
            sb3.append(z2);
            sb3.append(" ");
            sb3.append(this.f112405b);
            sb3.append(" ");
            sb3.append(this.f112406c);
            C6921a.m21559a((Throwable) new IllegalStateException(sb3.toString()));
            return null;
        }
        String a2 = m137727a(cVar);
        if (C6399b.m19944t()) {
            C43405a aVar = new C43405a();
            aVar.mo105313a(((IFestivalService) ServiceManager.get().getService(IFestivalService.class)).getWaterPicDir());
            C43403c[] a3 = C43406e.m137743a(this.f112405b, this.f112406c, a2, m137728b(cVar), C39799ej.m127420a(this.f112407d), z, aVar.mo105314a());
            String str4 = C39811er.f103476l;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(a);
            if (z) {
                str3 = "_leftalign";
            } else {
                str3 = "_rightalign";
            }
            sb4.append(str3);
            strArr = C43406e.m137745a(a3, str4, sb4.toString());
        } else {
            C43425p[] a4 = C43426q.m137815a(a2, z);
            String str5 = C39811er.f103476l;
            StringBuilder sb5 = new StringBuilder();
            sb5.append(a);
            if (z) {
                str2 = "_leftalign";
            } else {
                str2 = "_rightalign";
            }
            sb5.append(str2);
            strArr = C43426q.m137817a(a4, str5, sb5.toString());
        }
        this.f112408e.put(sb2, strArr);
        return strArr;
    }

    public C43401a(String str, int i, int i2, int i3) {
        this.f112404a = str;
        this.f112405b = i;
        this.f112406c = i2;
        this.f112407d = i3;
    }
}
