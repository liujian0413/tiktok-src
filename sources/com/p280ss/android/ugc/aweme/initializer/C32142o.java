package com.p280ss.android.ugc.aweme.initializer;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.photomovie.edit.music.C34913g;
import com.p280ss.android.ugc.aweme.port.p1479in.C35557ar;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.shortvideo.festival.C39881n;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.initializer.o */
public final class C32142o implements C35557ar {
    /* renamed from: a */
    public final void mo83285a(Context context, C27311c cVar) {
        new C34913g(context, cVar).mo88459a();
    }

    /* renamed from: a */
    public final String[] mo83286a(String str, int i, int i2, int i3) {
        String str2;
        boolean z;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        String a = C6306c.m19561a(str);
        if (TextUtils.isEmpty(iUserService.getCurrentUser().getUniqueId())) {
            str2 = iUserService.getCurrentUser().getShortId();
        } else {
            str2 = iUserService.getCurrentUser().getUniqueId();
        }
        if (!C6399b.m19944t()) {
            str2 = AwemeApplication.m21341a().getString(R.string.og, new Object[]{str2});
        }
        new File(C39811er.f103476l).mkdirs();
        if (C6399b.m19944t()) {
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            String str3 = C39811er.f103476l;
            if (i3 == 2) {
                z = true;
            } else {
                z = false;
            }
            return iAVService.createWaterMarkImages(i, i2, str2, str3, a, true, z, C39881n.m127622a().mo99303c(), true);
        }
        return ((IWaterMarkService) ServiceManager.get().getService(IWaterMarkService.class)).createWaterMarkImages(str2, C39811er.f103476l, a, C39881n.m127622a().mo99303c(), true);
    }
}
