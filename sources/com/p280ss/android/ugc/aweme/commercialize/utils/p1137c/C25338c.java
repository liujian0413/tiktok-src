package com.p280ss.android.ugc.aweme.commercialize.utils.p1137c;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p280ss.android.ugc.aweme.commercialize.p1128im.C24758a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMAdLog;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.profile.api.C35732h;
import com.p280ss.android.ugc.aweme.profile.model.User;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.c */
public final class C25338c {

    /* renamed from: a */
    public static final C25338c f66728a = new C25338c();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.c.c$a */
    public static final class C25339a extends Handler {

        /* renamed from: a */
        final /* synthetic */ Context f66729a;

        /* renamed from: b */
        final /* synthetic */ IMAdLog f66730b;

        public final void handleMessage(Message message) {
            C7573i.m23587b(message, "msg");
            super.handleMessage(message);
            if (message.obj instanceof User) {
                IIMService a = C30553b.m99808a(false);
                Context context = this.f66729a;
                Object obj = message.obj;
                if (obj != null) {
                    a.startChatWithAdLog(context, IMUser.fromUser((User) obj), this.f66730b);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
            }
        }

        C25339a(Context context, IMAdLog iMAdLog, Looper looper) {
            this.f66729a = context;
            this.f66730b = iMAdLog;
            super(looper);
        }
    }

    private C25338c() {
    }

    /* renamed from: a */
    public static final boolean m83267a(Context context, Aweme aweme) {
        if (context == null || aweme == null || !aweme.isAd()) {
            return false;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) awemeRawAd, "aweme.awemeRawAd!!");
        String openUrl = awemeRawAd.getOpenUrl();
        if (!C24758a.m81251b(openUrl)) {
            return false;
        }
        String c = C24758a.m81252c(openUrl);
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) awemeRawAd2, "aweme.awemeRawAd!!");
        String logExtra = awemeRawAd2.getLogExtra();
        AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
        if (awemeRawAd3 == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) awemeRawAd3, "aweme.awemeRawAd!!");
        C35732h.m115451a().mo90591a(new C25339a(context, new IMAdLog(logExtra, String.valueOf(awemeRawAd3.getCreativeId().longValue())), Looper.getMainLooper()), c, 0);
        return true;
    }
}
