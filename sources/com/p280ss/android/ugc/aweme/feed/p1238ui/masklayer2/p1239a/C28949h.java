package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a;

import android.os.Bundle;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27743a;
import com.p280ss.android.ugc.aweme.favorites.p1212c.C27746c;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.C28933a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.h */
public final class C28949h extends C28955l implements C27746c {

    /* renamed from: a */
    private C27743a f76290a;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.h$a */
    static final class C28950a implements C23305g {

        /* renamed from: a */
        final /* synthetic */ C28949h f76291a;

        C28950a(C28949h hVar) {
            this.f76291a = hVar;
        }

        /* renamed from: a */
        public final void mo58664a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo58663a() {
            this.f76291a.mo74242a();
        }
    }

    /* renamed from: a */
    public final void mo61805a(Exception exc) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r0 == null) goto L_0x000a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m95179b() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f76297e
            if (r0 == 0) goto L_0x000a
            java.lang.String r0 = r0.getAid()
            if (r0 != 0) goto L_0x000c
        L_0x000a:
            java.lang.String r0 = ""
        L_0x000c:
            android.app.Activity r1 = com.bytedance.ies.ugc.appcontext.C6405d.m19984g()
            java.lang.String r2 = r6.f76298f
            java.lang.String r3 = "click_favorite_video"
            com.ss.android.ugc.aweme.utils.ab r4 = com.p280ss.android.ugc.aweme.utils.C42914ab.m136242a()
            java.lang.String r5 = "group_id"
            com.ss.android.ugc.aweme.utils.ab r4 = r4.mo104633a(r5, r0)
            java.lang.String r5 = "log_pb"
            java.lang.String r0 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107234j(r0)
            com.ss.android.ugc.aweme.utils.ab r0 = r4.mo104633a(r5, r0)
            android.os.Bundle r0 = r0.f111445a
            com.ss.android.ugc.aweme.feed.ui.masklayer2.a.h$a r4 = new com.ss.android.ugc.aweme.feed.ui.masklayer2.a.h$a
            r4.<init>(r6)
            com.ss.android.ugc.aweme.base.component.g r4 = (com.p280ss.android.ugc.aweme.base.component.C23305g) r4
            com.p280ss.android.ugc.aweme.login.C32656f.m105744a(r1, r2, r3, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.p1239a.C28949h.m95179b():void");
    }

    /* renamed from: a */
    public final void mo74242a() {
        String str;
        if (this.f76290a == null) {
            this.f76290a = new C27743a();
        }
        C27743a aVar = this.f76290a;
        if (aVar != null) {
            aVar.mo66537a(this);
        }
        C27743a aVar2 = this.f76290a;
        if (aVar2 != null) {
            Object[] objArr = new Object[3];
            int i = 0;
            objArr[0] = Integer.valueOf(2);
            Aweme aweme = this.f76297e;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            objArr[1] = str;
            Aweme aweme2 = this.f76297e;
            if (aweme2 == null || !aweme2.isCollected()) {
                i = 1;
            }
            objArr[2] = Integer.valueOf(i);
            aVar2.mo56976a(objArr);
        }
    }

    public C28949h(C28933a aVar) {
        C7573i.m23587b(aVar, "actionsManager");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo61803a(BaseResponse baseResponse) {
        Aweme aweme = this.f76297e;
        if (aweme != null) {
            aweme.setCollectStatus(aweme.isCollected() ^ true ? 1 : 0);
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateCollectStatus(aweme.getAid(), aweme.getCollectStatus());
        }
    }

    /* renamed from: a */
    public final void mo74231a(View view) {
        String str;
        String str2;
        C7573i.m23587b(view, "v");
        Aweme aweme = this.f76297e;
        if (aweme == null || !aweme.isCollected()) {
            str = "favourite_video";
        } else {
            str = "cancel_favourite_video";
        }
        C22984d a = C22984d.m75611a().mo59973a("enter_from", this.f76298f);
        String str3 = "group_id";
        Aweme aweme2 = this.f76297e;
        String str4 = null;
        if (aweme2 != null) {
            str2 = aweme2.getAid();
        } else {
            str2 = null;
        }
        C22984d a2 = a.mo59973a(str3, str2);
        String str5 = "author_id";
        Aweme aweme3 = this.f76297e;
        if (aweme3 != null) {
            str4 = aweme3.getAuthorUid();
        }
        C6907h.m21524a(str, (Map) a2.mo59973a(str5, str4).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(this.f76297e))).mo59973a("enter_method", "long_press").f60753a);
        if (C25352e.m83220c(this.f76297e)) {
            C10761a.m31399c(view.getContext(), (int) R.string.e4).mo25750a();
            return;
        }
        IAccountUserService a3 = C21115b.m71197a();
        C7573i.m23582a((Object) a3, "AccountUserProxyService.get()");
        if (!a3.isLogin()) {
            m95179b();
        } else {
            mo74242a();
        }
    }
}
