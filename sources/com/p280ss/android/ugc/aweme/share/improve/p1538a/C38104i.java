package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.feed.C28206aj;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.C28897g;
import com.p280ss.android.ugc.aweme.qrcode.view.C37121a;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38156a;
import com.p280ss.android.ugc.aweme.share.p1536f.C38037a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import p346io.reactivex.C7329e;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.i */
public final class C38104i extends C38090d {

    /* renamed from: b */
    public final Aweme f99176b;

    /* renamed from: c */
    public final boolean f99177c;

    /* renamed from: d */
    public final int f99178d;

    /* renamed from: e */
    private final String f99179e;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.i$a */
    static final class C38105a<V> implements Callable<T> {

        /* renamed from: a */
        final /* synthetic */ C38104i f99180a;

        C38105a(C38104i iVar) {
            this.f99180a = iVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String call() {
            return C28206aj.m92712a(this.f99180a.f99176b.getShareInfo(), "copy_link", true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.i$b */
    static final class C38106b<T> implements C7326g<String> {

        /* renamed from: a */
        final /* synthetic */ C38104i f99181a;

        /* renamed from: b */
        final /* synthetic */ C37121a f99182b;

        /* renamed from: c */
        final /* synthetic */ SharePackage f99183c;

        /* renamed from: d */
        final /* synthetic */ Context f99184d;

        C38106b(C38104i iVar, C37121a aVar, SharePackage sharePackage, Context context) {
            this.f99181a = iVar;
            this.f99182b = aVar;
            this.f99183c = sharePackage;
            this.f99184d = context;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(String str) {
            boolean z;
            String str2;
            C37121a aVar = this.f99182b;
            if (aVar != null) {
                aVar.dismiss();
            }
            ShareInfo shareInfo = this.f99181a.f99176b.getShareInfo();
            C7573i.m23582a((Object) shareInfo, "aweme.shareInfo");
            String shareLinkDesc = shareInfo.getShareLinkDesc();
            C7573i.m23582a((Object) shareLinkDesc, "copyUrlText");
            if (shareLinkDesc.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C7573i.m23582a((Object) str, "url");
                str2 = C7634n.m23711a(shareLinkDesc, "%s", str, false);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f99183c.f20184j);
                sb.append(" ");
                sb.append(this.f99183c.f20185k);
                str2 = sb.toString();
            }
            this.f99181a.mo95724a(str2, this.f99184d);
            if (!this.f99181a.f99177c) {
                C10761a.m31383a(this.f99184d, this.f99181a.f99178d).mo25750a();
            }
        }
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        if (C38037a.m121403a() || TextUtils.equals(this.f99179e, "fromWeb")) {
            return this.f99176b.getAwemeControl().canShare();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        if (!C38037a.m121403a() && !TextUtils.equals(sharePackage.f20181g, "web")) {
            C10761a.m31410e(context, context.getString(R.string.ae8, new Object[]{C38037a.m121404b()})).mo25750a();
        } else if (!C38156a.m121902a(this, context, this.f99176b, this.f99179e) || !this.f99176b.getAwemeControl().canShare() || C6903bc.m21484c().mo59241a((int) R.string.e6_)) {
        } else {
            if ((this.f99176b.getAwemeType() != 13 || C38082aj.m121570a(this.f99176b, context)) && C28897g.m95082a(this.f99176b)) {
                C37121a a = C37121a.m119327a(context, context.getResources().getString(R.string.awk));
                a.mo93590a();
                C7329e.m22975a((Callable<? extends T>) new C38105a<Object>(this)).mo19159b(C7333a.m23044b()).mo19152a(C47549a.m148327a()).mo19163d(new C38106b(this, a, sharePackage, context));
            }
        }
    }

    public C38104i(Aweme aweme, String str, boolean z, int i) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "enterFrom");
        super(str, false, false);
        this.f99176b = aweme;
        this.f99179e = str;
        this.f99177c = z;
        this.f99178d = i;
    }

    public /* synthetic */ C38104i(Aweme aweme, String str, boolean z, int i, int i2, C7571f fVar) {
        this(aweme, "", true, R.string.ahh);
    }
}
