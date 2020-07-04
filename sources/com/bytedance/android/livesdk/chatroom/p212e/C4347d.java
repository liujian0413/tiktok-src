package com.bytedance.android.livesdk.chatroom.p212e;

import android.text.Spannable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.C8680m;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.d */
public final class C4347d extends C4343b<C8680m> {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo12066f() {
        return true;
    }

    /* renamed from: e */
    public final User mo12065e() {
        return ((C8680m) this.f12647a).f23626c;
    }

    /* renamed from: k */
    public final List<Integer> mo12074k() {
        return super.mo12074k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo12070m() {
        return C4372y.m14745b(((C8680m) this.f12647a).f23626c, "：", ((C8680m) this.f12647a).f23625b, R.color.aei, R.color.as5, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo12069l() {
        C9178j.m27302j().mo22379h();
        C9178j.m27302j().mo22379h();
        String str = "：";
        char[] charArray = ((C8680m) this.f12647a).f23625b.toCharArray();
        int length = charArray.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char c = charArray[i];
            if (1536 <= c && c <= 1791) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("‏");
            str = sb.toString();
        }
        return C4372y.m14745b(((C8680m) this.f12647a).f23626c, str, ((C8680m) this.f12647a).f23625b, R.color.alu, R.color.alv, false);
    }

    public C4347d(C8680m mVar) {
        super(mVar);
    }
}
