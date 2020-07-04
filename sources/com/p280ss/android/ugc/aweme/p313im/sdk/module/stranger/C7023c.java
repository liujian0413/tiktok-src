package com.p280ss.android.ugc.aweme.p313im.sdk.module.stranger;

import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C31478i;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.StrangerSessionList;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session.C7020e;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31868an;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.stranger.c */
public final class C7023c implements C6310a {

    /* renamed from: a */
    private C6309f f19808a;

    /* renamed from: b */
    private C7024b f19809b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.stranger.c$b */
    public interface C7024b {
        void onFetch(C7020e eVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.module.stranger.c$a */
    static class C7026a {

        /* renamed from: a */
        public static final C7023c f19814a = new C7023c();
    }

    /* renamed from: a */
    public static C7023c m21847a() {
        return C7026a.f19814a;
    }

    /* renamed from: b */
    public final void mo18124b() {
        this.f19809b = null;
    }

    private C7023c() {
        this.f19808a = new C6309f(this);
    }

    /* renamed from: a */
    public final void mo18122a(C7024b bVar) {
        this.f19809b = bVar;
        m21848a(0, 1, false);
    }

    /* renamed from: a */
    public final void mo18123a(String str) {
        if (str != null) {
            C7077s.m22148a((Handler) this.f19808a, Long.parseLong(str), 6);
        }
        C7705c.m23799a().mo20394d(new C31529a(0, str));
    }

    public final void handleMsg(Message message) {
        Object obj = message.obj;
        int i = message.what;
        if (obj instanceof ApiServerException) {
            C9738o.m28697a(C6399b.m19921a(), ((ApiServerException) obj).getErrorMsg());
        } else if (obj instanceof Exception) {
            C9738o.m28697a(C6399b.m19921a(), C6399b.m19921a().getString(R.string.bnb));
        } else {
            if (i == 1) {
                StrangerSessionList strangerSessionList = (StrangerSessionList) obj;
                if (strangerSessionList != null) {
                    C7024b bVar = this.f19809b;
                    if (bVar != null) {
                        List a = C31478i.m102351a(strangerSessionList.getLastMsg());
                        if (!a.isEmpty()) {
                            bVar.onFetch((C7020e) a.get(0));
                            return;
                        }
                        bVar.onFetch(null);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m21848a(long j, long j2, boolean z) {
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.f19808a;
        C70251 r0 = new Callable(0, 1, false) {
            public final Object call() throws Exception {
                try {
                    return C7077s.m22141a(0, 1, false);
                } catch (ExecutionException e) {
                    throw C31868an.m103554a(e);
                }
            }
        };
        a.mo60807a(fVar, r0, 1);
    }
}
