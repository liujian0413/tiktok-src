package com.p280ss.android.ugc.aweme.poi.model;

import android.os.Handler;
import android.os.Message;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.newfollow.model.C34146c;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.poi.model.a */
public final class C35104a implements C1591g<C35106c, Void> {

    /* renamed from: a */
    Handler f91787a;

    /* renamed from: b */
    int f91788b;

    /* renamed from: c */
    String f91789c;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Void then(C1592h<C35106c> hVar) {
        C34146c cVar;
        if (this.f91787a == null) {
            return null;
        }
        Message obtainMessage = this.f91787a.obtainMessage(this.f91788b);
        if (hVar.mo6887c()) {
            cVar = new C34146c(this.f91789c);
        } else if (hVar.mo6889d()) {
            cVar = new C34146c(this.f91789c);
            cVar.f88986h = hVar.mo6891f();
        } else {
            cVar = new C34146c(this.f91789c);
            C35106c cVar2 = (C35106c) hVar.mo6890e();
            if (cVar2.status_code != 0) {
                cVar.f88986h = new Exception("fail request due to wrong status code");
            } else if (cVar2 != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                cVar.f88982d = cVar2.f91791b;
                cVar.f88980b = (long) cVar2.f91792c;
                cVar.f88981c = (long) cVar2.f91792c;
                if (cVar2.f91790a != null) {
                    for (Aweme aweme : cVar2.f91790a) {
                        if (C21740a.m72694j(aweme)) {
                            FollowFeed followFeed = new FollowFeed(aweme);
                            followFeed.setRequestId(cVar2.getRequestId());
                            arrayList2.add(followFeed);
                        }
                    }
                    arrayList.addAll(arrayList2);
                }
                cVar.f88979a = arrayList;
            }
        }
        obtainMessage.obj = cVar;
        this.f91787a.sendMessage(obtainMessage);
        return null;
    }

    public C35104a(Handler handler, int i, String str) {
        this.f91787a = handler;
        this.f91788b = i;
        this.f91789c = str;
    }
}
