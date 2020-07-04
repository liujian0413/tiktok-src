package com.p280ss.android.ugc.aweme.p313im.sdk.p1327i;

import android.app.Activity;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.p263im.core.model.Message;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseExtra;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31863ai;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C32003d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Vector;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.i.a */
public class C31331a {

    /* renamed from: c */
    private static volatile C31331a f82105c;

    /* renamed from: a */
    public volatile boolean f82106a;

    /* renamed from: b */
    public List<Message> f82107b = new Vector();

    private C31331a() {
    }

    /* renamed from: a */
    public static C31331a m102015a() {
        if (f82105c == null) {
            synchronized (C31331a.class) {
                if (f82105c == null) {
                    f82105c = new C31331a();
                }
            }
        }
        return f82105c;
    }

    /* renamed from: a */
    public static boolean m102016a(BaseExtra baseExtra) {
        if (baseExtra == null || (baseExtra.getStatusCode() != 7188 && baseExtra.getStatusCode() != 7187)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo81899a(Message message, int i) {
        int i2;
        if (!this.f82107b.contains(message)) {
            this.f82107b.add(message);
        }
        if (!C31333b.m102020a(C6399b.m19921a())) {
            C9738o.m28693a(C6399b.m19921a(), (int) R.string.cjs);
            return;
        }
        if (!this.f82106a) {
            Activity g = C6405d.m19984g();
            if (g != null) {
                this.f82106a = true;
                C7103h f = C6956a.m21632a().mo18009f();
                if (f != null) {
                    if (i == 7188) {
                        i2 = 3059;
                    } else {
                        i2 = 3058;
                    }
                    f.popCaptcha(g, i2, new C32003d() {
                        /* renamed from: a */
                        public final void mo81900a(int i) {
                            C31331a.this.f82106a = false;
                        }

                        /* renamed from: a */
                        public final void mo81901a(boolean z, String str) {
                            if (z) {
                                for (Message c : C31331a.this.f82107b) {
                                    C31863ai.m103535c(c);
                                }
                            }
                            C31331a.this.f82107b.clear();
                        }
                    });
                }
            }
        }
    }
}
