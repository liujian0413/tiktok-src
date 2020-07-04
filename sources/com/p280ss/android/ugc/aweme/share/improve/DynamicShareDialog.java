package com.p280ss.android.ugc.aweme.share.improve;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33431f;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.C32015a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38371b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38371b.C38372a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.DynamicShareDialog */
public class DynamicShareDialog extends CommonShareDialog {

    /* renamed from: com.ss.android.ugc.aweme.share.improve.DynamicShareDialog$a */
    public static final class C38064a implements C38371b {

        /* renamed from: a */
        final /* synthetic */ C33431f f99113a;

        C38064a(C33431f fVar) {
            this.f99113a = fVar;
        }

        /* renamed from: a */
        public final void mo95707a(SharePackage sharePackage) {
            C7573i.m23587b(sharePackage, "sharePackage");
            this.f99113a.mo85670a(null);
        }

        /* renamed from: b */
        public final boolean mo95709b(SharePackage sharePackage) {
            C7573i.m23587b(sharePackage, "sharePackage");
            return C38372a.m122566a(this, sharePackage);
        }

        /* renamed from: a */
        public final void mo95708a(String str, SharePackage sharePackage) {
            C7573i.m23587b(str, "channel");
            C7573i.m23587b(sharePackage, "sharePackage");
            C38372a.m122565a(this, str, sharePackage);
        }
    }

    /* renamed from: c */
    public final SharePackage mo95706c() {
        return this.f99582e.f99636i;
    }

    /* renamed from: a */
    public final void mo95705a(SharePackage sharePackage, C33431f fVar) {
        C7573i.m23587b(sharePackage, "sharePackage");
        C7573i.m23587b(fVar, "callback");
        mo95940a(this.f99582e.mo95961a().mo95964a(sharePackage).mo95965a((C38371b) new C38064a(fVar)).mo95972a());
        C32015a aVar = this.f99107b;
        if (aVar != null) {
            aVar.mo82653a(this.f99582e);
        }
    }

    public DynamicShareDialog(Activity activity, C38380c cVar, int i) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(cVar, "config");
        super(activity, cVar, R.style.sl);
    }
}
