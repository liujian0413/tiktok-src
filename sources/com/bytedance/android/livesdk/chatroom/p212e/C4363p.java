package com.bytedance.android.livesdk.chatroom.p212e;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.livesdk.message.model.C8514bj;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.e.p */
public final class C4363p extends C4343b<C8514bj> {
    /* renamed from: e */
    public final User mo12065e() {
        return ((C8514bj) this.f12647a).f23390b;
    }

    /* renamed from: k */
    public final List<Integer> mo12074k() {
        if (this.f12647a == null || ((int) ((C8514bj) this.f12647a).mo21658a()) != 1) {
            return null;
        }
        return super.mo12074k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo12066f() {
        if (1 == ((C8514bj) this.f12647a).mo21658a() || 2 == ((C8514bj) this.f12647a).mo21658a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Spannable mo12069l() {
        switch ((int) ((C8514bj) this.f12647a).mo21658a()) {
            case 1:
                C9178j.m27302j().mo22379h();
                return C4372y.m14742a(((C8514bj) this.f12647a).f23390b, "  ", ((C8514bj) this.f12647a).mo21662d(), R.color.alu, R.color.adl, false);
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 11:
                String d = ((C8514bj) this.f12647a).mo21662d();
                C9178j.m27302j().mo22379h();
                return C4372y.m14743a(d, (int) R.color.ao6);
            case 8:
                StringBuilder sb = new StringBuilder("Top");
                sb.append(((C8514bj) this.f12647a).mo21659b());
                String sb2 = sb.toString();
                String d2 = ((C8514bj) this.f12647a).mo21662d();
                if (C3519c.m12965a(C3358ac.m12528e())) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(((C8514bj) this.f12647a).mo21659b());
                    sb3.append("Top");
                    sb2 = sb3.toString();
                    d2 = new StringBuffer(d2).reverse().toString();
                }
                String[] split = d2.split(sb2);
                if (split[0].length() == ((C8514bj) this.f12647a).mo21662d().length()) {
                    return C4374z.f12668a;
                }
                SpannableString spannableString = new SpannableString(((C8514bj) this.f12647a).mo21662d());
                C9178j.m27302j().mo22379h();
                int a = C4372y.m14740a((int) R.color.ao6);
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(a);
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(a);
                ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(a);
                spannableString.setSpan(foregroundColorSpan2, 0, split[0].length(), 18);
                spannableString.setSpan(foregroundColorSpan, split[0].length(), split[0].length() + sb2.length(), 18);
                spannableString.setSpan(foregroundColorSpan3, split[0].length() + sb2.length(), ((C8514bj) this.f12647a).mo21662d().length(), 18);
                return spannableString;
            default:
                String d3 = ((C8514bj) this.f12647a).mo21662d();
                C9178j.m27302j().mo22379h();
                C9178j.m27302j().mo22379h();
                return C4372y.m14742a(((C8514bj) this.f12647a).f23390b, "  ", d3, R.color.alu, R.color.alz, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Spannable mo12070m() {
        switch ((int) ((C8514bj) this.f12647a).mo21658a()) {
            case 3:
            case 4:
            case 9:
            case 10:
            case 11:
                return C4372y.m14743a(((C8514bj) this.f12647a).mo21662d(), (int) R.color.aei);
            case 5:
            case 6:
                return C4372y.m14743a(((C8514bj) this.f12647a).mo21662d(), (int) R.color.aei);
            case 8:
                StringBuilder sb = new StringBuilder("Top");
                sb.append(((C8514bj) this.f12647a).mo21659b());
                String sb2 = sb.toString();
                String d = ((C8514bj) this.f12647a).mo21662d();
                if (C3519c.m12965a(C3358ac.m12528e())) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(((C8514bj) this.f12647a).mo21659b());
                    sb3.append("Top");
                    sb2 = sb3.toString();
                    d = new StringBuffer(d).reverse().toString();
                }
                String[] split = d.split(sb2);
                if (split[0].length() == ((C8514bj) this.f12647a).mo21662d().length()) {
                    return C4374z.f12668a;
                }
                SpannableString spannableString = new SpannableString(((C8514bj) this.f12647a).mo21662d());
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C4372y.m14740a((int) R.color.aei));
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(C4372y.m14740a((int) R.color.aei));
                ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(C4372y.m14740a((int) R.color.aei));
                spannableString.setSpan(foregroundColorSpan, 0, split[0].length(), 18);
                spannableString.setSpan(foregroundColorSpan2, split[0].length(), split[0].length() + sb2.length(), 18);
                spannableString.setSpan(foregroundColorSpan3, split[0].length() + sb2.length(), ((C8514bj) this.f12647a).mo21662d().length(), 18);
                return spannableString;
            default:
                return C4372y.m14742a(((C8514bj) this.f12647a).f23390b, "  ", ((C8514bj) this.f12647a).mo21662d(), R.color.aei, R.color.as5, false);
        }
    }

    public C4363p(C8514bj bjVar) {
        super(bjVar);
    }
}
