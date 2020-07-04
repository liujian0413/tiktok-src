package com.p280ss.android.ugc.aweme.main.story.live;

import android.view.View;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.main.p1382d.C32952a;
import com.p280ss.android.ugc.aweme.main.story.live.p1388a.C33093a;
import com.p280ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.p280ss.android.ugc.aweme.main.story.live.view.C33105a.C33106a;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.main.story.live.c */
public class C33102c implements C33092a {

    /* renamed from: a */
    protected AbsLiveStoryItemView f86115a;

    /* renamed from: b */
    protected C33093a f86116b;

    /* renamed from: c */
    protected boolean f86117c;

    /* renamed from: d */
    private C33106a f86118d = new C33106a() {
        /* renamed from: a */
        public final void mo84823a() {
            C33102c.this.f86116b.mo64474b();
        }

        /* renamed from: a */
        public final void mo84824a(int i) {
            if (!C33102c.this.f86117c) {
                C33102c.this.f86115a.setVisibility(8);
            } else if (i == 0) {
                C33102c.this.mo84812b();
            } else if (i == 4) {
                C33102c.this.f86116b.mo64476c();
            } else {
                if (i == 8) {
                    C33102c.this.mo84809a();
                }
            }
        }
    };

    /* renamed from: c */
    public final View mo84813c() {
        return this.f86115a;
    }

    /* renamed from: a */
    public final void mo84809a() {
        this.f86116b.mo64474b();
    }

    /* renamed from: b */
    public final void mo84812b() {
        this.f86116b.mo64470a();
    }

    /* renamed from: a */
    public final void mo84811a(String str) {
        this.f86115a.f86124h = str;
    }

    /* renamed from: a */
    public final void mo84810a(C33104d dVar) {
        if (dVar == null || C6307b.m19566a((Collection<T>) dVar.f86120a)) {
            this.f86115a.setVisibility(8);
        } else if (!dVar.f86121b || this.f86116b == null) {
            this.f86115a.setVisibility(8);
        } else {
            this.f86116b.mo84814a(dVar.f86120a);
            this.f86117c = true;
            this.f86115a.setVisibility(0);
            this.f86115a.setRequestId(dVar.getRequestId());
            m106844a("LiveEvent", "2");
        }
    }

    public C33102c(AbsLiveStoryItemView absLiveStoryItemView, C33093a aVar) {
        this.f86115a = absLiveStoryItemView;
        this.f86116b = aVar;
        this.f86115a.setListener(this.f86118d);
    }

    /* renamed from: a */
    private static void m106844a(String str, String... strArr) {
        if (FollowStatus.class.getSimpleName().equals(str)) {
            C42961az.m136380a(new FollowStatus());
            return;
        }
        if (!C6399b.m19944t() && "LiveEvent".equals(str) && strArr[0].equals("2")) {
            C42961az.m136380a(new C32952a(2));
        }
    }
}
