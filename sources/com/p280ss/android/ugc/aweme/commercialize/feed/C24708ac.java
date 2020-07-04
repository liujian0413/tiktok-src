package com.p280ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.io.Serializable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.ac */
public final class C24708ac implements C6310a {

    /* renamed from: a */
    public static final C24708ac f65157a;

    /* renamed from: b */
    private static final C6309f f65158b;

    /* renamed from: c */
    private static C24709a f65159c;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.ac$a */
    static final class C24709a implements Runnable {

        /* renamed from: a */
        private final Aweme f65160a;

        /* renamed from: b */
        private final String f65161b;

        public final void run() {
            C24976t.m82204e(C6399b.m19921a(), this.f65160a, this.f65161b);
        }

        public C24709a(Aweme aweme, String str) {
            this.f65160a = aweme;
            this.f65161b = str;
        }
    }

    private C24708ac() {
    }

    /* renamed from: a */
    public static final void m81053a() {
        f65158b.removeMessages(1048577);
        f65159c = null;
    }

    /* renamed from: b */
    public static final void m81055b() {
        C24709a aVar = f65159c;
        if (aVar != null) {
            aVar.run();
        }
        f65159c = null;
    }

    static {
        C24708ac acVar = new C24708ac();
        f65157a = acVar;
        f65158b = new C6309f(acVar);
    }

    public final void handleMsg(Message message) {
        if (message != null && message.what == 1048577) {
            Bundle data = message.getData();
            if (data != null) {
                try {
                    String string = data.getString("refer");
                    Serializable serializable = data.getSerializable("aweme_raw_data");
                    if (serializable != null) {
                        C24976t.m82060a(C6399b.m19921a(), (AwemeRawAd) serializable, string);
                        message.setData(null);
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.model.AwemeRawAd");
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m81054a(Context context, Aweme aweme, String str) {
        Integer num;
        int i;
        if (context != null && aweme != null && aweme.isAd()) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd != null) {
                num = Integer.valueOf(awemeRawAd.getLeftSlideClickType());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                C24976t.m82204e(context, aweme, str);
                return;
            }
            if (num == null || num.intValue() != 1) {
                if (num != null && num.intValue() == 2) {
                    AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                    if (awemeRawAd2 != null) {
                        i = awemeRawAd2.getLeftSlideClickDuration();
                    } else {
                        i = 0;
                    }
                    if (i >= 10 && C6399b.m19928c()) {
                        C10761a.m31410e(context, "delay more than 10s, are u sure?").mo25750a();
                    }
                    f65158b.removeMessages(1048577);
                    try {
                        Message obtain = Message.obtain();
                        obtain.what = 1048577;
                        C7573i.m23582a((Object) obtain, "msg");
                        Bundle bundle = new Bundle();
                        bundle.putString("refer", str);
                        bundle.putSerializable("aweme_raw_data", aweme.getAwemeRawAd());
                        obtain.setData(bundle);
                        f65158b.sendMessageDelayed(obtain, ((long) i) * 1000);
                    } catch (Throwable unused) {
                    }
                } else {
                    if (num != null && num.intValue() == 3) {
                        f65159c = new C24709a(aweme, str);
                        return;
                    }
                    C24976t.m82204e(context, aweme, str);
                }
            }
        }
    }
}
