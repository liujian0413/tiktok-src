package com.p280ss.android.ugc.aweme.base.component;

import android.arch.lifecycle.C0053p;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.story.api.C41975g;
import com.p280ss.android.ugc.aweme.story.api.IAVStoryService;
import com.p280ss.android.ugc.aweme.story.api.model.LifeStory;

/* renamed from: com.ss.android.ugc.aweme.base.component.h */
public final class C23306h {

    /* renamed from: c */
    private static LifeStory f61361c;

    /* renamed from: a */
    C0053p<C41975g> f61362a;

    /* renamed from: b */
    private AbsActivity f61363b;

    /* renamed from: a */
    public final void mo60598a() {
        if (this.f61362a == null) {
            this.f61362a = new C23307i(this);
            IAVStoryService iAVStoryService = (IAVStoryService) ServiceManager.get().getService(IAVStoryService.class);
            if (iAVStoryService != null) {
                iAVStoryService.getPublishState().observe(this.f61363b, this.f61362a);
            }
        }
    }

    public C23306h(AbsActivity absActivity) {
        this.f61363b = absActivity;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo60599a(C41975g gVar) {
        if (gVar != null && gVar.f109039d == 4) {
            m76477b(gVar);
        }
    }

    /* renamed from: b */
    private void m76477b(C41975g gVar) {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).storySettingService().setFirstPublishSuccStatus();
        if (gVar.f109041f != null && gVar.f109041f.getLifeActivityInfo() != null && gVar.f109041f.getLifeActivityInfo().getCardType() > 0 && f61361c != gVar.f109041f && !this.f61363b.isFinishing()) {
            f61361c = gVar.f109041f;
        }
    }
}
