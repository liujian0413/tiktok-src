package com.p280ss.android.ugc.aweme.share.improve.p1539b;

import android.content.Context;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams.C36995a;
import com.p280ss.android.ugc.aweme.share.ShareDependService;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.b.d */
public final class C38147d extends C38146c {

    /* renamed from: a */
    public static final C38148a f99256a = new C38148a(null);

    /* renamed from: b */
    private final Aweme f99257b;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.d$a */
    public static final class C38148a {
        private C38148a() {
        }

        public /* synthetic */ C38148a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo95736a() {
        return R.drawable.att;
    }

    /* renamed from: a */
    public final boolean mo95737a(Context context, C38354f fVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(fVar, C38347c.f99553h);
        return true;
    }

    /* renamed from: b */
    public final String mo95739b() {
        return "qr_code";
    }

    /* renamed from: c */
    public final String mo95740c() {
        String b = C23481i.m77091b(R.string.d_w);
        C7573i.m23582a((Object) b, "ResUtils.getString(R.string.qr_code)");
        return b;
    }

    public C38147d(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        this.f99257b = aweme;
    }

    /* renamed from: a */
    public final boolean mo71406a(C38354f fVar, Context context) {
        C7573i.m23587b(fVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        ShareDependService a = C37950a.m121238a();
        QRCodeParams qRCodeParams = new C36995a().mo93428a(1, this.f99257b.getAid(), "video").mo93432a(C33230ac.m107242q(this.f99257b), C43122ff.m136765b(this.f99257b)).f96920a;
        C7573i.m23582a((Object) qRCodeParams, "QRCodeParams.Builder()\n …                 .build()");
        a.startQrCodeActivity(context, qRCodeParams);
        return true;
    }
}
