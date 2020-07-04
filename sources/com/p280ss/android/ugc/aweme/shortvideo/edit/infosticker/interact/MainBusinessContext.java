package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.ShareContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.MainBusinessContext */
public class MainBusinessContext implements Serializable {
    public InteractStickerTracksContext mInteractStickerContext;
    private ShareContext mShareContext;

    public InteractStickerTracksContext getInteractStickerContext() {
        return this.mInteractStickerContext;
    }

    public ShareContext getShareContext() {
        return this.mShareContext;
    }

    public String toBusinessData() {
        return C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15979b((Object) this);
    }

    public void setInteractStickerContext(InteractStickerTracksContext interactStickerTracksContext) {
        this.mInteractStickerContext = interactStickerTracksContext;
    }

    public void setShareContext(ShareContext shareContext) {
        this.mShareContext = shareContext;
    }

    public static String getShareContext(MainBusinessContext mainBusinessContext) {
        if (mainBusinessContext == null || mainBusinessContext.getShareContext() == null) {
            return null;
        }
        return C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15979b((Object) mainBusinessContext.getShareContext());
    }

    public static String getShareContext(String str) {
        if (C6319n.m19593a(str)) {
            return null;
        }
        MainBusinessContext mainBusinessContext = (MainBusinessContext) C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15974a(str, MainBusinessContext.class);
        if (mainBusinessContext == null || mainBusinessContext.getShareContext() == null) {
            return null;
        }
        return C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15979b((Object) mainBusinessContext.getShareContext());
    }

    public static String updateSDKShareContextWhenSaveOrPost(boolean z, String str) {
        if (C6399b.m19944t() || C6319n.m19593a(str)) {
            return str;
        }
        MainBusinessContext mainBusinessContext = (MainBusinessContext) C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15974a(str, MainBusinessContext.class);
        if (mainBusinessContext == null || mainBusinessContext.getShareContext() == null) {
            return str;
        }
        if (z) {
            mainBusinessContext.getShareContext().mNeedShowDialog = false;
        }
        return C35574k.m114859a().mo70078L().getRetrofitFactoryGson().mo15979b((Object) mainBusinessContext);
    }
}
