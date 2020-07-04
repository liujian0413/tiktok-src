package com.p280ss.android.ugc.aweme.commercialize.p1122e;

import android.graphics.Color;
import com.p280ss.android.ugc.aweme.main.story.live.C33102c;
import com.p280ss.android.ugc.aweme.main.story.live.p1388a.C33093a;
import com.p280ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.p280ss.android.ugc.aweme.story.model.StoryResponse.C41999a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.Collections;

/* renamed from: com.ss.android.ugc.aweme.commercialize.e.c */
public final class C24624c extends C33102c {
    /* renamed from: a */
    public final void mo64479a(C41999a aVar) {
        if (aVar == null || aVar.f109087a == null) {
            this.f86115a.setVisibility(8);
            return;
        }
        if (this.f86116b != null) {
            this.f86116b.mo84814a(Collections.singletonList(aVar.f109087a));
            if (this.f86116b instanceof C24622a) {
                int parseColor = Color.parseColor(aVar.f109093g);
                C24622a aVar2 = (C24622a) this.f86116b;
                aVar2.mo64471a(parseColor, parseColor);
                aVar2.mo64473a(aVar.f109094h);
                aVar2.mo64475b(aVar.f109088b);
            }
            this.f86117c = true;
            this.f86115a.setVisibility(0);
            if (aVar.f109092f) {
                C42961az.m136380a(new C24627f());
            }
        } else {
            this.f86115a.setVisibility(8);
        }
    }

    public C24624c(AbsLiveStoryItemView absLiveStoryItemView, C33093a aVar) {
        super(absLiveStoryItemView, aVar);
    }
}
