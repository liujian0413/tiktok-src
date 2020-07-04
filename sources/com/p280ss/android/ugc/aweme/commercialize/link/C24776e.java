package com.p280ss.android.ugc.aweme.commercialize.link;

import android.content.Context;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.commercialize.link.C24773c.C24774a;
import com.p280ss.android.ugc.aweme.commercialize.model.C24999h;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.p280ss.android.ugc.aweme.profile.model.LinkUserInfoStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.PublishSettingItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7579l;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.e */
public final class C24776e extends PublishSettingItem implements C24774a {

    /* renamed from: a */
    public boolean f65267a;

    /* renamed from: b */
    private String f65268b = "";

    /* renamed from: k */
    private boolean f65269k;

    /* renamed from: l */
    private boolean f65270l;

    /* renamed from: m */
    private C24999h f65271m;

    public final C24999h getCommerceDataContainer() {
        return this.f65271m;
    }

    public final boolean getHasGoods() {
        return this.f65270l;
    }

    public final boolean getHasMicroApp() {
        return this.f65269k;
    }

    public final String getLinkData() {
        return this.f65268b;
    }

    /* renamed from: a */
    private final void m81307a() {
        boolean z;
        if (this.f65269k || this.f65270l) {
            z = false;
        } else {
            z = true;
        }
        setEnabled(z);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C24773c.m81299a((C24774a) this);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (C7573i.m23585a((Object) C24773c.m81298a(), (Object) this)) {
            C24773c.m81299a((C24774a) null);
        }
    }

    public final void setHasGoods(boolean z) {
        this.f65270l = z;
        m81307a();
    }

    public final void setHasMicroApp(boolean z) {
        this.f65269k = z;
        m81307a();
    }

    public final void setCommerceDataContainer(C24999h hVar) {
        boolean z;
        this.f65271m = hVar;
        if (hVar != null) {
            z = hVar.mo64823b();
        } else {
            z = false;
        }
        setHasMicroApp(z);
    }

    public final void setEnabled(boolean z) {
        boolean z2;
        float f;
        setEnable(z);
        if (!this.f65267a || !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        setAuthEnabled(z2);
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        setAlpha(f);
    }

    public final void setAuthEnabled(boolean z) {
        boolean z2;
        this.f65267a = z;
        if (!this.f65267a || !isEnabled()) {
            z2 = false;
        } else {
            z2 = true;
        }
        setSubtitle(C24769b.m81282a(z2));
        C24999h commerceDataContainer = getCommerceDataContainer();
        if (commerceDataContainer != null) {
            C25006o b = C25006o.m82327b(commerceDataContainer.mo64821a());
            C7573i.m23582a((Object) b, "model");
            b.f65938a = z;
            commerceDataContainer.mo64822a(C25006o.m82326a(b));
        }
    }

    public C24776e(Context context) {
        super(context);
        setDrawableLeft((int) R.drawable.af2);
        setTitle((int) R.string.d9d);
        setAuthEnabled(C24769b.m81288c());
        if (C24769b.m81288c()) {
            String b = new C6600e().mo15979b((Object) C7507ae.m23385a(C7579l.m23633a("commerce_ad_link", Boolean.valueOf(true))));
            C7573i.m23582a((Object) b, "Gson().toJson(\n         …          )\n            )");
            setLinkData(b);
        }
    }

    public final void setLinkData(String str) {
        C7573i.m23587b(str, "value");
        this.f65268b = str;
        switch (C24773c.m81301b(str)) {
            case 1:
                setAuthEnabled(false);
                setVisibility(8);
                IAccountUserService a = C21115b.m71197a();
                if (a != null) {
                    User curUser = a.getCurUser();
                    if (curUser != null) {
                        CommerceUserInfo commerceUserInfo = curUser.getCommerceUserInfo();
                        if (commerceUserInfo != null) {
                            LinkUserInfoStruct linkUserInfo = commerceUserInfo.getLinkUserInfo();
                            if (linkUserInfo != null) {
                                linkUserInfo.authStatus = 1;
                                break;
                            }
                        }
                    }
                }
                break;
            case 2:
                setAuthEnabled(false);
                break;
            case 3:
                setAuthEnabled(true);
                break;
        }
        C24999h commerceDataContainer = getCommerceDataContainer();
        if (commerceDataContainer != null) {
            C25006o b = C25006o.m82327b(commerceDataContainer.mo64821a());
            C7573i.m23582a((Object) b, "model");
            b.f65939b = C24773c.m81303c(str);
            commerceDataContainer.mo64822a(C25006o.m82326a(b));
        }
    }
}
