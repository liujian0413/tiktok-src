package com.p280ss.android.ugc.aweme.detail.operators;

import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am.C26136b;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28447b;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28454h;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28467s;
import com.p280ss.android.ugc.aweme.feed.param.FeedParam;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.ag */
public final class C26124ag extends C26117a<C28447b, C28454h> implements C26136b {
    /* renamed from: b */
    private static int m85846b(int i) {
        if (i == 4) {
            return 2;
        }
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 3;
            default:
                return 1;
        }
    }

    /* renamed from: a */
    public final int mo67682a(int i) {
        return 2;
    }

    /* renamed from: a */
    public final void mo67694a(C28467s sVar) {
        ((C28454h) this.f68942b).f75038a = sVar;
    }

    /* renamed from: a */
    public final void mo67695a(boolean z) {
        ((C28454h) this.f68942b).f75039d = true;
    }

    public C26124ag(C25673a aVar) {
        C28447b bVar;
        if (aVar instanceof C28447b) {
            bVar = (C28447b) aVar;
        } else {
            bVar = new C28447b(6);
        }
        this.f68941a = bVar;
    }

    /* renamed from: a */
    public final boolean mo67686a(Fragment fragment) {
        this.f68942b = new C28454h(fragment);
        return true;
    }

    /* renamed from: a */
    public final void mo67684a(int i, FeedParam feedParam, int i2, boolean z) {
        ((C28454h) this.f68942b).mo56976a(Integer.valueOf(i), Integer.valueOf(2), Integer.valueOf(m85846b(i)));
    }
}
