package com.p280ss.android.ugc.aweme.app;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.live.feedpage.C32518c;
import com.p280ss.android.ugc.aweme.live.feedpage.C32523f;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.story.live.C41990e;
import com.p280ss.android.ugc.aweme.story.live.C41990e.C41991a;
import java.util.Map;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.app.an */
public final class C22792an {

    /* renamed from: a */
    public boolean f60482a;

    /* renamed from: b */
    public String f60483b;

    /* renamed from: c */
    public long f60484c;

    /* renamed from: d */
    public Context f60485d;

    /* renamed from: e */
    private String f60486e;

    /* renamed from: f */
    private String f60487f;

    public C22792an(Context context) {
        this.f60485d = context;
    }

    /* renamed from: a */
    public final void mo59827a(String str, String str2, long j) {
        this.f60487f = str;
        this.f60486e = str2;
        this.f60484c = j;
    }

    /* renamed from: b */
    public final void mo59829b(String str, String str2, long j) {
        if (!TextUtils.equals(this.f60487f, C22912d.f60641a) && !TextUtils.isEmpty("jsbridge")) {
            C41989d.m133469a(C6399b.m19921a(), 1, str2, str, j);
        }
        if (!TextUtils.isEmpty(this.f60486e)) {
            C6907h.m21524a("live_play", (Map) C22984d.m75611a().mo59973a("enter_from", this.f60486e).mo59973a("anchor_id", str).f60753a);
        }
    }

    /* renamed from: a */
    public final void mo59828a(final String str, String str2, String str3, boolean z) {
        this.f60483b = str3;
        this.f60482a = z;
        if (z) {
            C41989d.m133496c(String.valueOf(this.f60484c), str);
        }
        C32518c.m105318a().f84793f.liveStates(str).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C7326g<C32523f>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(C32523f fVar) throws Exception {
                boolean z;
                String str;
                long j;
                Long l = (Long) fVar.mo83755a().get(Long.valueOf(Long.parseLong(str)));
                if (!(l instanceof Long) || l.longValue() == 0) {
                    z = true;
                    l = Long.valueOf(C22792an.this.f60484c);
                } else {
                    z = false;
                }
                User user = new User();
                user.setUid(str);
                user.roomId = l.longValue();
                if (z) {
                    str = "live_finish";
                } else {
                    str = "live_on";
                }
                if (C22792an.this.f60482a) {
                    String uid = user.getUid();
                    if (user.roomId > 0) {
                        j = user.roomId;
                    } else {
                        j = C22792an.this.f60484c;
                    }
                    C41989d.m133478a(uid, j, str);
                }
                C22792an.this.mo59829b(str, fVar.getRequestId(), l.longValue());
                C41991a c = new C41991a(C22792an.this.f60485d, user).mo103120a(C22792an.this.f60483b).mo103122b("push").mo103117a(4).mo103123c("push");
                if (C22792an.this.f60482a) {
                    c.mo103121a("livesdk_live_push_status", str);
                }
                C41990e.m133503a(c);
            }
        }, (C7326g<? super Throwable>) new C7326g<Throwable>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                if (C22792an.this.f60482a) {
                    C41989d.m133478a(str, 0, "live_query_api_error");
                }
                User user = new User();
                user.setUid(str);
                user.roomId = C22792an.this.f60484c;
                C41991a c = new C41991a(C22792an.this.f60485d, user).mo103120a(C22792an.this.f60483b).mo103122b("push").mo103117a(4).mo103123c("push");
                if (C22792an.this.f60482a) {
                    c.mo103121a("livesdk_live_push_status", "live_query_api_error");
                }
                C41990e.m133503a(c);
            }
        });
    }
}
