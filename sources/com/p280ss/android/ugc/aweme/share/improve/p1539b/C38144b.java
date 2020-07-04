package com.p280ss.android.ugc.aweme.share.improve.p1539b;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.feed.C28205ai;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30192a;
import com.p280ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.p313im.service.IIMService;
import com.p280ss.android.ugc.aweme.p313im.service.model.C32025c;
import com.p280ss.android.ugc.aweme.p313im.service.model.C32026d;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.C32015a;
import com.p280ss.android.ugc.aweme.p313im.service.p1351g.p1353b.C32022b;
import com.p280ss.android.ugc.aweme.p313im.service.p325e.C7099c;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.b.b */
public final class C38144b extends C38146c {

    /* renamed from: c */
    public static final C38145a f99250c = new C38145a(null);

    /* renamed from: a */
    public C32015a f99251a;

    /* renamed from: b */
    public boolean f99252b;

    /* renamed from: d */
    private final SharePackage f99253d;

    /* renamed from: e */
    private final String f99254e;

    /* renamed from: f */
    private final int f99255f;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.b$a */
    public static final class C38145a {
        private C38145a() {
        }

        public /* synthetic */ C38145a(C7571f fVar) {
            this();
        }
    }

    public C38144b(SharePackage sharePackage) {
        this(sharePackage, null, 0, 6, null);
    }

    /* renamed from: b */
    public final String mo95739b() {
        return "chat_merge";
    }

    /* renamed from: e */
    public final int mo95742e() {
        if (C6399b.m19946v()) {
            return R.drawable.azz;
        }
        return R.drawable.azy;
    }

    /* renamed from: a */
    public final int mo95736a() {
        if (C6399b.m19946v()) {
            return R.drawable.at_;
        }
        C6399b.m19947w();
        return R.drawable.at9;
    }

    /* renamed from: c */
    public final String mo95740c() {
        boolean z;
        if (C6399b.m19944t()) {
            String b = C23481i.m77091b(R.string.dt6);
            C7573i.m23582a((Object) b, "ResUtils.getString(R.string.share_to_friend)");
            return b;
        }
        String str = "";
        if (C30553b.m99786b()) {
            SettingsManagerProxy inst = SettingsManagerProxy.inst();
            C7573i.m23582a((Object) inst, "SettingsManagerProxy.inst()");
            C30192a commonSettingsWatcher = inst.getCommonSettingsWatcher();
            C7573i.m23582a((Object) commonSettingsWatcher, "SettingsManagerProxy.ins…   .commonSettingsWatcher");
            C32025c a = commonSettingsWatcher.mo76676a();
            C7573i.m23582a((Object) a, "SettingsManagerProxy.ins…SettingsWatcher.imSetting");
            C32026d dVar = a.f83742e;
            if (dVar != null) {
                str = dVar.f83775u;
            }
        }
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = C6399b.m19921a().getString(R.string.dsm);
        }
        if (str == null) {
            C7573i.m23580a();
        }
        return str;
    }

    /* renamed from: a */
    public final void mo95741a(RemoteImageView remoteImageView, boolean z) {
        C7573i.m23587b(remoteImageView, "imageView");
        if (C6399b.m19944t() || this.f99251a == null || !C30553b.m99786b()) {
            super.mo95741a(remoteImageView, z);
            return;
        }
        C32015a aVar = this.f99251a;
        if (aVar == null) {
            C7573i.m23580a();
        }
        aVar.mo82658a(remoteImageView, z);
    }

    /* renamed from: a */
    public final boolean mo95737a(Context context, C38354f fVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(fVar, C38347c.f99553h);
        if (C30553b.m99808a(false) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo71406a(C38354f fVar, Context context) {
        C7573i.m23587b(fVar, C38347c.f99553h);
        C7573i.m23587b(context, "context");
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        if (!a.isLogin()) {
            C32656f.m105742a(C38157b.m121903a(context), this.f99254e, "click_shareim_button");
            return true;
        } else if (!this.f99252b) {
            C10761a.m31399c(context, (int) R.string.dlr).mo25750a();
            return true;
        } else {
            Bundle bundle = new Bundle();
            if (C30553b.m99787c()) {
                C32015a aVar = this.f99251a;
                if (aVar != null && aVar.mo82659e() == 1) {
                    bundle.putInt("key_share_type", this.f99255f);
                }
            }
            bundle.putParcelable("share_package", this.f99253d);
            C30553b.m99810g().enterChooseContact(context, bundle, null);
            C28205ai.m92704a(mo95739b());
            long j = this.f99253d.f20186l.getLong("ad_id");
            if (j != 0) {
                Aweme rawAdAwemeByAdId = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeByAdId(String.valueOf(j));
                if (C25352e.m83221d(rawAdAwemeByAdId)) {
                    C24976t.m82017W(context, rawAdAwemeByAdId);
                }
            }
            return true;
        }
    }

    public C38144b(SharePackage sharePackage, String str, int i) {
        C32015a aVar;
        C7573i.m23587b(sharePackage, "sharePackage");
        C7573i.m23587b(str, "enterFrom");
        this.f99253d = sharePackage;
        this.f99254e = str;
        this.f99255f = i;
        IIMService g = C30553b.m99810g();
        if (g != null) {
            C7099c shareService = g.getShareService();
            if (shareService != null) {
                C32022b bVar = new C32022b(C6399b.m19921a(), this.f99253d, null, 4, null);
                aVar = shareService.mo18081a(bVar);
                this.f99251a = aVar;
                this.f99252b = true;
            }
        }
        aVar = null;
        this.f99251a = aVar;
        this.f99252b = true;
    }

    public /* synthetic */ C38144b(SharePackage sharePackage, String str, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        if ((i2 & 4) != 0) {
            i = -1;
        }
        this(sharePackage, str, i);
    }
}
