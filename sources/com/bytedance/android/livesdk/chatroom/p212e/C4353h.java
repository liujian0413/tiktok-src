package com.bytedance.android.livesdk.chatroom.p212e;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.message.model.C8695y;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdk.widget.C9243g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.h */
public final class C4353h extends C4343b<C8695y> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo12066f() {
        return true;
    }

    /* renamed from: e */
    public final User mo12065e() {
        return ((C8695y) this.f12647a).f23698d;
    }

    /* renamed from: k */
    public final List<Integer> mo12074k() {
        return super.mo12074k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo12069l() {
        Bitmap a = C9243g.m27498a(C3358ac.m12528e(), ((C8695y) this.f12647a).f23699e);
        String a2 = C8695y.m26002a();
        if (a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("  ");
            a2 = sb.toString();
        }
        String str = a2;
        C9178j.m27302j().mo22379h();
        return C4372y.m14741a(C4372y.m14745b(((C8695y) this.f12647a).f23698d, " ", str, R.color.alu, R.color.alz, false), a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo12070m() {
        Context e = C3358ac.m12528e();
        Bitmap a = C9243g.m27497a(e, C9051ar.m27032a(((C8695y) this.f12647a).f23697c), e.getResources().getDimensionPixelSize(R.dimen.ra), e.getResources().getDimensionPixelSize(R.dimen.r_));
        String a2 = C8695y.m26002a();
        if (a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("  ");
            a2 = sb.toString();
        }
        return C4372y.m14741a(C4372y.m14745b(((C8695y) this.f12647a).f23698d, "：", a2, R.color.aei, R.color.as5, false), a);
    }

    public C4353h(C8695y yVar) {
        super(yVar);
    }
}
