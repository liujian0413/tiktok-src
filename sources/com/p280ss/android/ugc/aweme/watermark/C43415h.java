package com.p280ss.android.ugc.aweme.watermark;

import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.C41640a;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.WaterMarkPositionConfig;
import com.p280ss.android.vesdk.VEWaterMarkPosition;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.watermark.h */
public final class C43415h implements C41640a {

    /* renamed from: a */
    private String f112436a;

    /* renamed from: b */
    private int f112437b;

    /* renamed from: c */
    private int f112438c;

    /* renamed from: a */
    public final void mo102262a(boolean z, C22200c cVar) {
    }

    /* renamed from: b */
    public final void mo102263b() {
    }

    /* renamed from: a */
    public final WaterMarkPositionConfig mo102261a() {
        float f = ((float) this.f112437b) / 720.0f;
        int i = (int) (26.0f * f);
        int i2 = (int) (f * 28.0f);
        WaterMarkPositionConfig waterMarkPositionConfig = new WaterMarkPositionConfig();
        waterMarkPositionConfig.xOffset = i;
        waterMarkPositionConfig.yOffset = i2;
        waterMarkPositionConfig.position = VEWaterMarkPosition.BR;
        return waterMarkPositionConfig;
    }

    /* renamed from: b */
    public final String[] mo102264b(boolean z, C22200c cVar) {
        String str;
        boolean z2;
        String a = C6306c.m19561a(this.f112436a);
        if (TextUtils.isEmpty(cVar.mo58558a())) {
            str = cVar.mo58559b();
        } else {
            str = cVar.mo58558a();
        }
        if (TextUtils.isEmpty(str)) {
            C6921a.m21559a((Throwable) new IllegalArgumentException("userId is empty"));
            return null;
        }
        if (!C6399b.m19944t()) {
            str = C35563c.f93238a.getString(R.string.og, new Object[]{str});
        }
        String str2 = str;
        File file = new File(C39811er.f103476l);
        if (file.exists() || file.mkdirs()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f112437b == 0 || this.f112438c == 0) {
            return null;
        }
        if (!z2) {
            StringBuilder sb = new StringBuilder("provide error ");
            sb.append(false);
            sb.append(" ");
            sb.append(this.f112437b);
            sb.append(" ");
            sb.append(this.f112438c);
            C6921a.m21559a((Throwable) new IllegalStateException(sb.toString()));
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C39811er.f103476l);
        sb2.append(File.separator);
        sb2.append(a);
        sb2.append(".png");
        String sb3 = sb2.toString();
        new C43425p().mo105347a(this.f112437b, this.f112438c, str2, (int) R.drawable.bko, z).mo105351a(sb3);
        return new String[]{sb3};
    }

    public C43415h(String str, int i, int i2) {
        this.f112436a = str;
        this.f112437b = i;
        this.f112438c = i2;
    }
}
