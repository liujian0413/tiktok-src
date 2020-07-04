package com.p280ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25256b.C25257a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.web.jsbridge.C43464a.C43465a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.SelectAdCardAction */
public final class SelectAdCardAction extends AbsAdCardAction {

    /* renamed from: h */
    private C43465a f67292h;

    /* renamed from: f */
    public final void mo66294f() {
        mo66291c("show");
        C25257a d = new C25257a().mo65856a("othershow").mo65858b("card").mo65860d("choose");
        Aweme aweme = this.f67267c;
        C7573i.m23582a((Object) aweme, "mAweme");
        mo66288a(d.mo65855a(aweme).mo65857a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60992b() {
        /*
            r4 = this;
            java.lang.String r0 = "close"
            r4.mo66291c(r0)
            com.ss.android.ugc.aweme.commercialize.utils.b$a r0 = new com.ss.android.ugc.aweme.commercialize.utils.b$a
            r0.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.f67267c
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.commercialize.utils.b$a r0 = r0.mo65855a(r1)
            java.lang.String r1 = "close"
            com.ss.android.ugc.aweme.commercialize.utils.b$a r0 = r0.mo65856a(r1)
            java.lang.String r1 = "card"
            com.ss.android.ugc.aweme.commercialize.utils.b$a r0 = r0.mo65858b(r1)
            com.ss.android.ugc.aweme.web.jsbridge.a$a r1 = r4.f67292h
            if (r1 == 0) goto L_0x0033
            org.json.JSONObject r1 = r1.f112572a
            if (r1 == 0) goto L_0x0033
            java.lang.String r2 = "card_type"
            java.lang.String r3 = "choose"
            java.lang.String r1 = r1.optString(r2, r3)
            if (r1 != 0) goto L_0x0035
        L_0x0033:
            java.lang.String r1 = "choose"
        L_0x0035:
            com.ss.android.ugc.aweme.commercialize.utils.b$a r0 = r0.mo65860d(r1)
            com.ss.android.ugc.aweme.commercialize.utils.b r0 = r0.mo65857a()
            r4.mo66288a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.views.cards.SelectAdCardAction.mo60992b():void");
    }

    @C7709l
    public final void userChooseEvent(C43465a aVar) {
        C7573i.m23587b(aVar, "chooseLogAdExtraData");
        this.f67292h = aVar;
    }

    /* renamed from: a */
    public final void mo66289a(String str) {
        StringBuilder sb = new StringBuilder("show fail: ");
        sb.append(str);
        mo66291c(sb.toString());
        C25257a d = new C25257a().mo65856a("othershow_fail").mo65858b("card").mo65859c(String.valueOf(str)).mo65860d("choose");
        Aweme aweme = this.f67267c;
        C7573i.m23582a((Object) aweme, "mAweme");
        mo66288a(d.mo65855a(aweme).mo65857a());
    }

    public SelectAdCardAction(Context context, Aweme aweme, C25568n nVar) {
        C7573i.m23587b(nVar, "adHalfWebPage");
        super(context, aweme, nVar);
        this.f67263a = R.drawable.aoa;
    }
}
