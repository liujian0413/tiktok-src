package com.bytedance.android.livesdk.chatroom.p212e;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p212e.C4343b.C4344a;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.i18n.C8317b;
import com.bytedance.android.livesdk.message.model.C8487am;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.host.C9456c.C9457a;
import com.bytedance.android.livesdkapi.host.C9456c.C9459c;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.android.livesdkapi.message.C9507h;
import com.bytedance.android.livesdkapi.message.PieceType;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.k */
public final class C4356k extends C4343b<C8487am> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo12066f() {
        return true;
    }

    /* renamed from: e */
    public final User mo12065e() {
        return ((C8487am) this.f12647a).f23245a;
    }

    /* renamed from: k */
    public final List<Integer> mo12074k() {
        return super.mo12074k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo12069l() {
        String str = ((C8487am) this.f12647a).f23247c;
        C9178j.m27302j().mo22379h();
        C9178j.m27302j().mo22379h();
        return C4372y.m14745b(((C8487am) this.f12647a).f23245a, "：", str, R.color.alu, R.color.alx, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo12070m() {
        String str = ((C8487am) this.f12647a).f23247c;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("  ");
        return C4372y.m14745b(((C8487am) this.f12647a).f23245a, "：", sb.toString(), R.color.aei, R.color.as5, false);
    }

    public C4356k(C8487am amVar) {
        super(amVar);
    }

    /* renamed from: a */
    public final void mo12082a(final C4344a aVar) {
        if (((C8487am) this.f12647a).baseMessage != null && ((C8487am) this.f12647a).baseMessage.f26000j != null) {
            C9505f fVar = ((C8487am) this.f12647a).baseMessage.f26000j;
            String str = null;
            String str2 = fVar.f26014b;
            if (fVar.f26013a != null) {
                str = C8317b.m25387a().mo21482a(fVar.f26013a);
            }
            if (!(str == null && str2 == null)) {
                for (C9507h hVar : fVar.f26016d) {
                    if (hVar.f26020a == PieceType.GIFT.getPieceType() && hVar.f26024e != null) {
                        C8149d findGiftById = ((IGiftService) C3596c.m13172a(IGiftService.class)).findGiftById(hVar.f26024e.f26027a);
                        if (findGiftById != null) {
                            TTLiveSDKContext.getHostService().mo22371l().mo23192a(findGiftById.f22231b, (C9459c) new C9459c() {
                                /* renamed from: a */
                                public final void mo9922a(C9457a aVar) {
                                }

                                /* renamed from: a */
                                public final void mo9921a(Bitmap bitmap) {
                                    if (bitmap != null) {
                                        Bitmap copy = bitmap.copy(Config.ARGB_8888, true);
                                        if (aVar != null) {
                                            aVar.mo12078a(copy);
                                        }
                                    }
                                }
                            });
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }
}
