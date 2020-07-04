package com.p280ss.android.ugc.aweme.discover.presenter;

import com.p280ss.android.ugc.aweme.app.api.C22832g;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import com.p280ss.android.ugc.aweme.discover.p1185ui.C27005aj;
import com.p280ss.android.ugc.aweme.discover.presenter.C26826h;

/* renamed from: com.ss.android.ugc.aweme.discover.presenter.i */
public class C26827i<T extends C26826h> extends C25674b<T> {

    /* renamed from: a */
    public boolean f70792a;

    /* renamed from: d */
    public C27005aj f70793d;

    /* renamed from: b */
    public void mo56977b() {
        this.f70792a = true;
        super.mo56977b();
        if (((C26826h) this.f67571b).mListQueryType == 1) {
            C26612d.f70187a.mo68308c(((C26826h) this.f67571b).getItems().size()).mo68305b().mo68304a(((C26826h) this.f67571b).f70790f).mo68303a((C22832g) (SearchApiResult) ((C26826h) this.f67571b).getData()).mo68306b(0);
            if (((C26826h) this.f67571b).isDataEmpty()) {
                C26612d.m87397c();
            }
            if (this.f70793d != null) {
                this.f70793d.mo69689a(((C26826h) this.f67571b).mo69491d());
                this.f70793d.mo69466a(((C26826h) this.f67571b).mo69494g());
                this.f70793d.mo69691a(((C26826h) this.f67571b).mo69492e());
                this.f70793d.mo69685a(((C26826h) this.f67571b).mo69493f());
                this.f70793d.mo69690a((SearchApiResult) ((C26826h) this.f67571b).getData());
                return;
            }
            if (this.f67572c instanceof C27005aj) {
                ((C27005aj) this.f67572c).mo69689a(((C26826h) this.f67571b).mo69491d());
                ((C27005aj) this.f67572c).mo69466a(((C26826h) this.f67571b).mo69494g());
                ((C27005aj) this.f67572c).mo69691a(((C26826h) this.f67571b).mo69492e());
                ((C27005aj) this.f67572c).mo69685a(((C26826h) this.f67571b).mo69493f());
                ((C27005aj) this.f67572c).mo69690a((SearchApiResult) ((C26826h) this.f67571b).getData());
            }
        }
    }

    /* renamed from: b */
    public final void mo69495b(int i) {
        if (this.f67571b != null) {
            ((C26826h) this.f67571b).f70789e = i;
        }
    }

    /* renamed from: a */
    public void mo57296a(Exception exc) {
        this.f70792a = false;
        super.mo57296a(exc);
        C26612d.f70187a.mo68305b().mo68306b(1).mo68307b(exc.getMessage());
        C26612d.m87397c();
    }
}
