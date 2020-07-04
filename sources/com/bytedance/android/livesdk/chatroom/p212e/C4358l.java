package com.bytedance.android.livesdk.chatroom.p212e;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.text.Spannable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.p212e.C4343b.C4344a;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.i18n.C8317b;
import com.bytedance.android.livesdk.message.C8471f;
import com.bytedance.android.livesdk.message.model.C8489ao;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdkapi.host.C9456c.C9457a;
import com.bytedance.android.livesdkapi.host.C9456c.C9459c;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.android.livesdkapi.message.C9507h;
import com.bytedance.android.livesdkapi.message.PieceType;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.l */
public final class C4358l extends C4343b<C8489ao> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo12066f() {
        return true;
    }

    /* renamed from: e */
    public final User mo12065e() {
        return ((C8489ao) this.f12647a).f23252a;
    }

    /* renamed from: k */
    public final List<Integer> mo12074k() {
        return super.mo12074k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo12069l() {
        String str = null;
        try {
            String a = C8471f.m25743a(((C8489ao) this.f12647a).f23252a);
            String str2 = ((C8489ao) this.f12647a).baseMessage.f25996f;
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(":");
            if (str2.startsWith(sb.toString())) {
                str = str2.substring(a.length() + 1);
            }
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str)) {
            str = ((C8489ao) this.f12647a).baseMessage.f25996f;
        }
        String str3 = str;
        C9178j.m27302j().mo22379h();
        C9178j.m27302j().mo22379h();
        return C4372y.m14745b(((C8489ao) this.f12647a).f23252a, "：", str3, R.color.alu, R.color.alx, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo12070m() {
        String str = null;
        try {
            String a = C8471f.m25743a(((C8489ao) this.f12647a).f23252a);
            String str2 = ((C8489ao) this.f12647a).baseMessage.f25996f;
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(":");
            if (str2.startsWith(sb.toString())) {
                str = str2.substring(a.length() + 1);
            }
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str)) {
            str = ((C8489ao) this.f12647a).baseMessage.f25996f;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("  ");
        return C4372y.m14745b(((C8489ao) this.f12647a).f23252a, "：", sb2.toString(), R.color.aei, R.color.aew, false);
    }

    public C4358l(C8489ao aoVar) {
        super(aoVar);
    }

    /* renamed from: a */
    public final void mo12083a(final C4344a aVar) {
        if (((C8489ao) this.f12647a).baseMessage != null && ((C8489ao) this.f12647a).baseMessage.f26000j != null) {
            C9505f fVar = ((C8489ao) this.f12647a).baseMessage.f26000j;
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
                                    Bitmap copy = bitmap.copy(Config.ARGB_8888, true);
                                    if (aVar != null) {
                                        aVar.mo12078a(copy);
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
