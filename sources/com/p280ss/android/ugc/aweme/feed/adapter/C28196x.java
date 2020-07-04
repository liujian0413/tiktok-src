package com.p280ss.android.ugc.aweme.feed.adapter;

import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnTouchListener;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.helper.C28412a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28254o;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.C32891b;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.p280ss.android.ugc.aweme.services.superentrance.SuperEntranceEvent;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.x */
public class C28196x extends VideoViewHolder {
    /* renamed from: d */
    public void mo71533d(boolean z) {
        if (TextUtils.equals(mo71648U(), "homepage_follow") && C6903bc.m21482a().mo84633c()) {
            z = C32891b.m106468a().f85832b;
        }
        super.mo71533d(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo71693d(Aweme aweme) {
        if (this.f74133m != 0 && C6861a.m21337f() != null) {
            if (!C6861a.m21337f().isLogin() || !TextUtils.equals(this.f74130g.getAuthorUid(), C6861a.m21337f().getCurUserId())) {
                ISuperEntranceService superEntranceService = ((IAVService) ServiceManager.get().getService(IAVService.class)).getSuperEntranceService();
                if (superEntranceService != null && superEntranceService.shouldShowSuperEntranceRecord(mo71647T())) {
                    List superEntranceEffectList = superEntranceService.getSuperEntranceEffectList();
                    NewFaceStickerBean stickerEntranceInfo = aweme.getStickerEntranceInfo();
                    if (stickerEntranceInfo != null && !C6307b.m19566a((Collection<T>) superEntranceEffectList) && superEntranceEffectList.contains(stickerEntranceInfo.f108868id)) {
                        C42961az.m136380a(new SuperEntranceEvent(true));
                        ((IAVService) ServiceManager.get().getService(IAVService.class)).getSuperEntranceService().setShowedSuperEntranceTab();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo71658a(View view, boolean z) {
        if (TextUtils.equals(mo71648U(), "homepage_follow") && C6903bc.m21482a().mo84633c()) {
            z = C32891b.m106468a().f85832b;
        }
        super.mo71658a(view, z);
    }

    public C28196x(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams, C28254o oVar, C28412a aVar) {
        super(view, zVar, onTouchListener, fragment, baseFeedPageParams, oVar, aVar);
    }
}
