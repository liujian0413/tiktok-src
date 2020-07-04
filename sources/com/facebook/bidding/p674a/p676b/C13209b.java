package com.facebook.bidding.p674a.p676b;

import android.content.Context;
import com.facebook.bidding.p674a.C13204a;
import com.facebook.bidding.p674a.p680f.C13217a;

/* renamed from: com.facebook.bidding.a.b.b */
public final class C13209b {
    /* renamed from: a */
    public static void m38608a(final Context context, final String str) {
        C13204a.m38594a().execute(new Runnable() {
            public final void run() {
                if (str != null) {
                    C13217a.m38625a(context).mo32413a(str, null);
                }
            }
        });
    }

    /* renamed from: a */
    public static void m38609a(final Context context, final String str, final String str2, final String str3) {
        C13204a.m38594a().execute(new Runnable() {
            public final void run() {
                C13217a.m38625a(context).mo32413a("https://www.facebook.com/audiencenetwork/nurl/?partner=${PARTNER_FBID}&app=${APP_FBID}&auction=${AUCTION_ID}&ortb_loss_code=2".replace("${PARTNER_FBID}", str).replace("${APP_FBID}", str2).replace("${AUCTION_ID}", str3), null);
            }
        });
    }

    /* renamed from: b */
    public static void m38610b(final Context context, final String str) {
        C13204a.m38594a().execute(new Runnable() {
            public final void run() {
                if (str != null) {
                    C13217a.m38625a(context).mo32413a(str.replace("${AUCTION_LOSS}", "102"), null);
                }
            }
        });
    }
}
