package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.event.C28322e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28933a;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28967f;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout.C28980c;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33271m;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.c */
public final class C28943c extends C28955l implements C28951i {

    /* renamed from: a */
    private final C28933a f76287a;

    /* renamed from: a */
    public final void mo74231a(View view) {
        C7573i.m23587b(view, "v");
    }

    /* renamed from: a */
    public final void mo74239a(Exception exc) {
        C7573i.m23587b(exc, "e");
    }

    public C28943c(C28933a aVar) {
        C7573i.m23587b(aVar, "actionsManager");
        super(aVar);
        this.f76287a = aVar;
    }

    /* renamed from: a */
    public final void mo74240a(String str) {
        Context context;
        C7573i.m23587b(str, "reasonId");
        C28967f fVar = this.f76287a.f76270a;
        if (fVar != null) {
            context = fVar.getContext();
        } else {
            context = null;
        }
        C10761a.m31409e((Context) C23487o.m77130a(context), (int) R.string.b5_).mo25750a();
        C42961az.m136380a(new C28322e(this.f76287a.f76271b));
    }

    /* renamed from: a */
    private final void m95169a(C28980c cVar) {
        String str;
        String str2 = "block_videos";
        C22984d a = new C22984d().mo59973a("enter_from", this.f76287a.f76272c);
        String str3 = "group_id";
        Aweme aweme = this.f76287a.f76271b;
        String str4 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        C22984d a2 = a.mo59973a(str3, str);
        String str5 = "author_id";
        Aweme aweme2 = this.f76287a.f76271b;
        if (aweme2 != null) {
            str4 = aweme2.getAuthorUid();
        }
        C6907h.m21524a(str2, (Map) a2.mo59973a(str5, str4).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(this.f76287a.f76271b))).mo59973a("reason_id", cVar.f76345a).mo59973a("reason_text", cVar.f76346b).mo59973a("music_id", C33230ac.m107236k(this.f76287a.f76271b)).mo59973a("enter_method", "long_press").mo59973a("click_method", "button").f60753a);
    }

    /* renamed from: a */
    public final void mo74238a(View view, C28980c cVar) {
        C7573i.m23587b(view, "v");
        C7573i.m23587b(cVar, "dislikeReasonVO");
        m95169a(cVar);
        new C33271m().mo85286a(this.f76287a.f76272c).mo85287b(C33230ac.m107238m(this.f76287a.f76271b)).mo85288c(C33230ac.m107205a(this.f76287a.f76271b)).mo85289d("long_press").mo85290e(C33230ac.m107219c(this.f76287a.f76271b)).mo85252e();
        C28946e eVar = new C28946e();
        eVar.mo66536a(new C28944d());
        eVar.mo66537a(this);
        eVar.mo56976a(this.f76287a.f76271b, cVar.f76345a);
        this.f76287a.mo74230d();
    }
}
