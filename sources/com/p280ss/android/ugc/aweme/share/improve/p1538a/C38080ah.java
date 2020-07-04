package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.share.C38265v;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38156a;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ah */
public final class C38080ah implements C38389f {

    /* renamed from: a */
    private final Aweme f99136a;

    /* renamed from: b */
    private final String f99137b;

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.au0;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "reuse_mv_template";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.dh4;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        return true;
    }

    /* renamed from: a */
    public final void mo95711a(Context context) {
        C7573i.m23587b(context, "context");
        C38390a.m122628a((C38389f) this, context);
    }

    /* renamed from: a */
    public final void mo95713a(ImageView imageView) {
        C7573i.m23587b(imageView, "iconView");
        C38390a.m122629a((C38389f) this, imageView);
    }

    /* renamed from: a */
    public final void mo95714a(TextView textView) {
        C7573i.m23587b(textView, "textView");
        C38390a.m122630a((C38389f) this, textView);
    }

    public C38080ah(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        this.f99136a = aweme;
        this.f99137b = str;
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        if (C38156a.m121902a(this, context, this.f99136a, this.f99137b)) {
            FaceStickerBean.sCurPropSource = "prop_reuse";
            C6907h.m21524a("mvtheme_reuse_icon", (Map) C22984d.m75611a().mo59973a("mv_id", this.f99136a.getUploadMiscInfoStruct().mvThemeId).mo59973a("action_type", "click").mo59973a("group_id", this.f99136a.getAid()).f60753a);
            IAccountUserService a = C21115b.m71197a();
            C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
            if (a.isLogin() || !((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().needLoginBeforeRecord()) {
                new C38265v(context).mo95891a(this.f99136a.getUploadMiscInfoStruct().mvThemeId);
            } else {
                C32656f.m105742a(C38157b.m121903a(context), this.f99137b, "click_share_button");
            }
        }
    }
}
