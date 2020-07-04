package com.p280ss.android.ugc.aweme.poi.p335ui.detail.p1475b;

import android.os.Handler;
import android.os.Message;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.model.C34146c;
import com.p280ss.android.ugc.aweme.poi.bean.C35070b;
import com.p280ss.android.ugc.aweme.poi.rate.api.C35208a;
import com.p280ss.android.ugc.aweme.poi.rate.api.C35209b;
import com.p280ss.android.ugc.aweme.poi.rate.api.C35211c;
import java.util.ArrayList;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.b */
public final class C35323b implements C1591g<C35208a, Void> {

    /* renamed from: a */
    private final Handler f92597a;

    /* renamed from: b */
    private final int f92598b = TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN;

    /* renamed from: c */
    private final String f92599c;

    /* renamed from: d */
    private final boolean f92600d;

    /* renamed from: e */
    private final C7561a<C7581n> f92601e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Void then(C1592h<C35208a> hVar) {
        if (this.f92597a == null || hVar == null) {
            return null;
        }
        Message obtainMessage = this.f92597a.obtainMessage(this.f92598b);
        if (hVar.mo6887c()) {
            obtainMessage.obj = null;
        } else if (hVar.mo6889d()) {
            obtainMessage.obj = hVar.mo6891f();
        } else {
            boolean z = false;
            C34146c cVar = new C34146c(this.f92599c);
            C35208a aVar = (C35208a) hVar.mo6890e();
            ArrayList arrayList = new ArrayList();
            cVar.f88982d = aVar.f92191d;
            cVar.f88980b = aVar.f92190c;
            cVar.f88981c = aVar.f92190c;
            cVar.f88983e = aVar.f92193f;
            if (aVar.f92188a != null) {
                for (C35211c cVar2 : aVar.f92188a) {
                    if (cVar2.f92202e != null) {
                        Aweme aweme = cVar2.f92202e;
                        if (aweme == null) {
                            C7573i.m23580a();
                        }
                        aweme.setRateScore(cVar2.f92199b);
                        if (C21740a.m72694j(cVar2.f92202e)) {
                            arrayList.add(new FollowFeed(cVar2.f92202e));
                        }
                    } else {
                        if (!this.f92600d && !z) {
                            C35209b bVar = new C35209b();
                            bVar.f92196b = aVar.f92192e;
                            bVar.f92197c = 2;
                            arrayList.add(new C35070b(bVar));
                            this.f92601e.invoke();
                            z = true;
                        }
                        C35209b bVar2 = new C35209b();
                        bVar2.f92195a = cVar2;
                        bVar2.f92197c = 1;
                        arrayList.add(new C35070b(bVar2));
                    }
                }
            }
            cVar.f88979a = arrayList;
            obtainMessage.obj = cVar;
        }
        this.f92597a.sendMessage(obtainMessage);
        return null;
    }

    public C35323b(Handler handler, int i, String str, boolean z, C7561a<C7581n> aVar) {
        C7573i.m23587b(handler, "handler");
        C7573i.m23587b(str, "requestKey");
        C7573i.m23587b(aVar, "callback");
        this.f92597a = handler;
        this.f92599c = str;
        this.f92600d = z;
        this.f92601e = aVar;
    }
}
