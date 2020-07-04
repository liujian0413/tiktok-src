package com.p280ss.android.ugc.aweme.profile.presenter;

import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34029b;
import com.p280ss.android.ugc.aweme.profile.model.ShopUserMessage;
import com.p280ss.android.ugc.aweme.profile.model.ShopUserMessageModel;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.af */
public final class C36006af extends C34029b<ShopUserMessageModel, C36044r> implements C25678f {
    /* renamed from: a */
    public final void mo57296a(Exception exc) {
    }

    /* renamed from: a */
    public final void mo91639a() {
        ShopUserMessageModel shopUserMessageModel = (ShopUserMessageModel) this.f88765b;
        if (shopUserMessageModel != null) {
            shopUserMessageModel.getShopUserMessage();
        }
    }

    /* renamed from: b */
    public final void mo56977b() {
        if (((C36044r) this.f88766c) != null) {
            ShopUserMessageModel shopUserMessageModel = (ShopUserMessageModel) this.f88765b;
            if (shopUserMessageModel != null) {
                ShopUserMessage shopUserMessage = (ShopUserMessage) shopUserMessageModel.mData;
                if (shopUserMessage != null) {
                    C36044r rVar = (C36044r) this.f88766c;
                    if (rVar != null) {
                        rVar.mo91733a(shopUserMessage);
                    }
                }
            }
        }
    }

    public C36006af(ShopUserMessageModel shopUserMessageModel, C36044r rVar) {
        super(shopUserMessageModel, rVar);
        ShopUserMessageModel shopUserMessageModel2 = (ShopUserMessageModel) this.f88765b;
        if (shopUserMessageModel2 != null) {
            shopUserMessageModel2.addNotifyListener(this);
        }
    }
}
