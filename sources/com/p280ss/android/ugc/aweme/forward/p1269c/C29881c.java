package com.p280ss.android.ugc.aweme.forward.p1269c;

import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.expriment.FollowFeedShowCommentAB;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29370e;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29371f;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29375i;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29382k;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29870c.C29871a;
import com.p280ss.android.ugc.aweme.forward.p1267a.C29870c.C29872b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.p280ss.android.ugc.aweme.utils.C42975bi;

/* renamed from: com.ss.android.ugc.aweme.forward.c.c */
public class C29881c implements C6310a, C29375i, C29871a {

    /* renamed from: a */
    protected C29872b f78493a;

    /* renamed from: b */
    protected Aweme f78494b;

    /* renamed from: c */
    protected C29376j f78495c;

    /* renamed from: d */
    public String f78496d;

    /* renamed from: e */
    protected String f78497e;

    /* renamed from: f */
    protected boolean f78498f;

    /* renamed from: g */
    protected boolean f78499g;

    /* renamed from: h */
    protected C6309f f78500h;

    /* renamed from: i */
    protected Runnable f78501i = new Runnable() {
        public final void run() {
            if (C29881c.this.f78493a.mo75889c()) {
                C29881c.this.f78493a.mo75892g();
            }
        }
    };

    /* renamed from: j */
    protected C29382k f78502j = new C29382k() {
        /* renamed from: a */
        public final void mo75110a() {
            C29881c.this.mo75110a();
        }

        /* renamed from: b */
        public final void mo75112b() {
            C29881c.this.mo75112b();
        }

        /* renamed from: d */
        public final Rect mo75129d() {
            return C29881c.this.f78493a.mo75891e();
        }

        /* renamed from: a */
        public final void mo75111a(int i) {
            C29881c.this.mo75111a(i);
        }

        /* renamed from: b */
        public final void mo75127b(int i) {
            C29881c.this.mo75924b(i);
        }
    };

    /* renamed from: b */
    public void mo75112b() {
        mo75936n();
    }

    /* renamed from: b */
    public void mo75924b(int i) {
    }

    /* renamed from: d */
    public void mo75883d() {
        this.f78498f = false;
    }

    /* renamed from: g */
    public void mo75886g() {
    }

    public void handleMsg(Message message) {
    }

    /* renamed from: a */
    public void mo75110a() {
        this.f78500h.removeCallbacks(this.f78501i);
    }

    /* renamed from: c */
    public void mo75882c() {
        this.f78498f = true;
        if (!mo75925h()) {
            mo75931l();
        }
    }

    /* renamed from: e */
    public void mo75884e() {
        this.f78499g = true;
        this.f78495c.mo75115a(this.f78502j);
        mo75927j();
    }

    /* renamed from: l */
    private void mo75931l() {
        if (this.f78494b != null) {
            C29370e j = mo75927j();
            if (j != null) {
                j.mo75098b(this.f78496d);
            }
        }
    }

    /* renamed from: n */
    private void mo75936n() {
        if (this.f78494b != null) {
            C29370e j = mo75927j();
            if (j != null) {
                j.mo75092a(this.f78496d);
            }
        }
    }

    /* renamed from: f */
    public void mo75885f() {
        this.f78499g = false;
        this.f78495c.mo75117b(this.f78502j);
        mo75931l();
        this.f78495c.mo75117b(this.f78502j);
        this.f78500h.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo75925h() {
        if (this.f78494b == null) {
            return false;
        }
        C29370e j = mo75927j();
        if (j == null || !j.f77398c.mo104684c(16777216)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final boolean mo75926i() {
        if (this.f78494b == null) {
            return false;
        }
        C29370e j = mo75927j();
        if (j == null || !j.f77398c.mo104684c(256)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo75928k() {
        if (this.f78494b != null) {
            C29371f.m96475a().mo75104b(C29370e.m96465a(this.f78493a.mo75887a().mo58075d(), this.f78494b.getAid()));
        }
    }

    /* renamed from: m */
    private void mo75935m() {
        if (!(this.f78494b == null || this.f78494b.getAuthor() == null || !this.f78494b.getAuthor().isLive())) {
            User author = this.f78494b.getAuthor();
            C41989d.m133490b(this.f78493a.mo75888b(), 0, author.getRequestId(), author.getUid(), author.roomId, "homepage_follow");
        }
    }

    /* renamed from: j */
    public final C29370e mo75927j() {
        C29370e eVar;
        if (this.f78494b != null) {
            eVar = C29371f.m96475a().mo75106c(C29370e.m96465a(this.f78493a.mo75887a().mo58075d(), this.f78494b.getAid()));
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return mo75937o();
        }
        return eVar;
    }

    /* renamed from: o */
    private C29370e mo75937o() {
        C42975bi biVar;
        if (this.f78494b == null) {
            return null;
        }
        if (this.f78493a.mo75896m().mo104684c(1)) {
            biVar = new C42975bi(1);
        } else {
            biVar = new C42975bi(16);
        }
        String a = C29370e.m96465a(this.f78493a.mo75887a().mo58075d(), this.f78494b.getAid());
        C29370e eVar = new C29370e(this.f78494b, biVar, a);
        C29371f.m96475a().mo75103a(a, eVar);
        return eVar;
    }

    /* renamed from: a */
    public void mo75111a(int i) {
        mo75935m();
        mo75936n();
    }

    /* renamed from: a */
    public void mo75923a(long j) {
        if (!this.f78493a.mo75896m().mo104684c(1)) {
            return;
        }
        if (C6399b.m19944t() || C6384b.m19835a().mo15287a(FollowFeedShowCommentAB.class, true, "new_follow_feed_comment", C6384b.m19835a().mo15295d().new_follow_feed_comment, 0) == 1) {
            this.f78500h.postDelayed(this.f78501i, j);
        }
    }

    public C29881c(C29872b bVar, C29376j jVar) {
        this.f78493a = bVar;
        this.f78495c = jVar;
        this.f78500h = new C6309f(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    public void mo75881a(Aweme aweme, String str, String str2) {
        this.f78494b = aweme;
        this.f78496d = str;
        this.f78497e = str2;
        mo75927j();
    }
}
