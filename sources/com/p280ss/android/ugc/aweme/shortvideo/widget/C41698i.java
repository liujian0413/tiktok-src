package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35558as;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.p280ss.android.ugc.aweme.services.sticker.UnLockSticker;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40496bh;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40969m;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.CurUseStickerViewModel;
import com.p280ss.android.ugc.aweme.sticker.C41847c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.i */
public final class C41698i {

    /* renamed from: a */
    FragmentActivity f108540a;

    /* renamed from: b */
    C41847c f108541b;

    /* renamed from: c */
    OnUnlockShareFinishListener f108542c = new OnUnlockShareFinishListener() {
        public final void onVKShareSucceed(Effect effect) {
        }

        public final void onShareAppFailed() {
            C35563c.f93226H.mo90374a(C41698i.this.f108540a);
        }

        public final void onShareAppSucceed(Effect effect) {
            C40969m mVar = new C40969m();
            mVar.f106497a = UnLockSticker.STICKER_UNLOCKED;
            mVar.f106498b = effect;
            mVar.f106500d = true;
            C7705c.m23799a().mo20396f(mVar);
        }
    };

    /* renamed from: a */
    public final boolean mo102474a() {
        Effect a = m132805a(this.f108540a);
        if (!C6399b.m19944t() || !C40496bh.m129464i(a) || C40496bh.m129471p(a)) {
            return false;
        }
        this.f108541b.mo101265a(a);
        this.f108541b.mo101264a();
        return true;
    }

    /* renamed from: a */
    private static Effect m132805a(FragmentActivity fragmentActivity) {
        if (fragmentActivity != null) {
            return (Effect) ((CurUseStickerViewModel) C0069x.m159a(fragmentActivity).mo147a(CurUseStickerViewModel.class)).mo101274a().getValue();
        }
        return null;
    }

    public C41698i(FragmentActivity fragmentActivity) {
        this.f108540a = fragmentActivity;
        Effect a = m132805a(fragmentActivity);
        C35558as asVar = C35563c.f93226H;
        this.f108541b = asVar.mo90372a(asVar.mo90373a(), fragmentActivity, a, this.f108542c, true, false);
    }
}
