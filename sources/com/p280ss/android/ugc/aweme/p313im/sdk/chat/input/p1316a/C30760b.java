package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.p1316a;

import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.emoji.base.C27520d;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30758a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.C30803b;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.C31383b;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.MediaChooseResult;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.p1330a.C31378a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.a.b */
public final class C30760b extends C30758a<C30803b, C27520d> implements C31378a {

    /* renamed from: d */
    private C31383b f80531d;

    /* renamed from: d */
    public final int mo80550d() {
        return R.layout.a57;
    }

    /* renamed from: e */
    public final void mo80551e() {
        super.mo80551e();
        C31383b bVar = this.f80531d;
        if (bVar != null) {
            bVar.mo81947a();
        }
    }

    /* renamed from: a */
    public final void mo80555a(MediaChooseResult mediaChooseResult) {
        C7573i.m23587b(mediaChooseResult, "result");
        ((C30803b) this.f80527a).mo80330a((List<MediaModel>) mediaChooseResult.getSelectedList(), mediaChooseResult.getSendRaw());
    }

    /* renamed from: a */
    private final C31383b m100200a(FragmentActivity fragmentActivity) {
        if (this.f80531d == null) {
            View view = this.f80529c;
            if (view != null) {
                C31383b bVar = new C31383b(fragmentActivity, (ViewGroup) view, this, null, 8, null);
                this.f80531d = bVar;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        C31383b bVar2 = this.f80531d;
        if (bVar2 == null) {
            C7573i.m23580a();
        }
        return bVar2;
    }

    /* renamed from: a */
    public final void mo80554a(FragmentActivity fragmentActivity, boolean z) {
        C7573i.m23587b(fragmentActivity, "context");
        m100200a(fragmentActivity).mo81949a(z);
    }

    public C30760b(C30803b bVar, ViewGroup viewGroup) {
        C7573i.m23587b(bVar, "inputView");
        C7573i.m23587b(viewGroup, "container");
        super(bVar, null, viewGroup);
    }
}
