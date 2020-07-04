package com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock;

import android.content.Context;
import android.support.p029v7.app.AppCompatDialog;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.base.C17457s;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35549an.C35550a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35549an.C35551b;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p280ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.p280ss.android.ugc.aweme.sticker.C41847c;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.unlock.i */
public final class C40962i implements C41847c {

    /* renamed from: a */
    Effect f106476a;

    /* renamed from: b */
    public OnUnlockShareFinishListener f106477b;

    /* renamed from: c */
    String f106478c;

    /* renamed from: d */
    public C17457s<IStickerUtilsService> f106479d = new C17457s<IStickerUtilsService>() {

        /* renamed from: a */
        IStickerUtilsService f106487a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public IStickerUtilsService mo44946a() {
            if (this.f106487a == null) {
                this.f106487a = ((IAVService) ServiceManager.get().getService(IAVService.class)).getStickerUtilsService();
            }
            return this.f106487a;
        }
    };

    /* renamed from: e */
    C35550a f106480e = new C35550a() {
    };

    /* renamed from: f */
    private AppCompatDialog f106481f;

    /* renamed from: g */
    private Context f106482g;

    /* renamed from: h */
    private C35551b f106483h = new C35551b() {
    };

    /* renamed from: i */
    private boolean f106484i = false;

    /* renamed from: j */
    private boolean f106485j = false;

    /* renamed from: a */
    public final void mo101264a() {
        String str;
        if (C6399b.m19944t() && !C43122ff.m136767b() && this.f106476a != null) {
            LockStickerTextBean shareString = ((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().getShareString(this.f106476a);
            if (shareString != null && this.f106482g != null) {
                if (this.f106481f == null) {
                    this.f106481f = C40955c.m130818a(this.f106482g, this.f106480e, shareString, this.f106476a, this.f106484i, this.f106485j, this.f106483h);
                }
                if (this.f106481f != null) {
                    String str2 = "locked_prop_share_pop_up_show";
                    C22984d a = C22984d.m75611a().mo59973a("enter_method", this.f106478c).mo59973a("prop_id", this.f106476a.getEffectId());
                    String str3 = "is_visible";
                    if (((IStickerUtilsService) this.f106479d.mo44946a()).isStickerPreviewable(this.f106476a)) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).f60753a);
                    this.f106481f.show();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo101265a(Effect effect) {
        this.f106476a = effect;
    }

    public C40962i(String str, Context context, Effect effect, OnUnlockShareFinishListener onUnlockShareFinishListener, boolean z, boolean z2) {
        this.f106478c = str;
        this.f106482g = context;
        this.f106476a = effect;
        this.f106477b = onUnlockShareFinishListener;
        this.f106484i = z;
        this.f106485j = z2;
    }
}
