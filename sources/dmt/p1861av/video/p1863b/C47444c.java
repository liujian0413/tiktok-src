package dmt.p1861av.video.p1863b;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: dmt.av.video.b.c */
final /* synthetic */ class C47444c {
    /* renamed from: a */
    public static final boolean m148124a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        if (!C7276d.m22826g()) {
            C41530am.m132283b("record check SD卡不可用");
            C10761a.m31399c((Context) activity, (int) R.string.djg).mo25750a();
            activity.finish();
            return false;
        }
        long b = ((long) C35574k.m114859a().mo70096k().mo93306b(Property.RecordMinDiskAmountMB)) * 1024 * 1024;
        long h = C7276d.m22827h();
        if (h >= b || m148123a(b, h)) {
            return true;
        }
        StringBuilder sb = new StringBuilder("RecordCheck 磁盘空间不足 sdAvailableSize:");
        sb.append(h);
        sb.append(" minDiskAmountByte:");
        sb.append(b);
        C41530am.m132283b(sb.toString());
        C10761a.m31399c(activity.getApplicationContext(), (int) R.string.at0).mo25750a();
        activity.finish();
        return false;
    }

    /* renamed from: a */
    private static final boolean m148123a(long j, long j2) {
        long j3 = j - j2;
        if (j3 > 0) {
            return C35563c.f93240c.mo83134a(j3);
        }
        return true;
    }
}
