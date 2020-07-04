package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.views.C22367e;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.C23808t;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.profile.util.C36725aj;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.UpdateNickNameDialog */
public class UpdateNickNameDialog extends UpdateUserInfoDialog {
    TextView mPolicyDes;

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo92352e() {
        return R.layout.ld;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo92350c() {
        super.mo92350c();
        m117328f();
    }

    /* renamed from: f */
    private void m117328f() {
        String string = C6399b.m19921a().getString(R.string.dkx);
        String g = m117335g();
        int indexOf = g.indexOf(string);
        Spannable newSpannable = Factory.getInstance().newSpannable(g);
        newSpannable.setSpan(new C22367e(C23481i.m77088a(R.color.a79), C23481i.m77088a(R.color.lp)) {
            public final void onClick(View view) {
                C7195s.m22438a().mo18682a((String) SharePrefCache.inst().getJudgementClauseScheme().mo59877d());
            }
        }, indexOf, string.length() + indexOf, 17);
        this.mPolicyDes.setMovementMethod(C23808t.m78017a());
        this.mPolicyDes.setText(newSpannable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo92351d() {
        String str;
        if (this.mNickNameEditText == null || this.mNickNameEditText.getText() == null) {
            str = "";
        } else {
            str = this.mNickNameEditText.getText().toString();
        }
        if (!(m117333b(str) || this.f95271d == null || this.f95270c == null)) {
            if (!TextUtils.equals(str, C21115b.m71197a().getCurUser().getNickname())) {
                this.f95270c.f94395a = str;
            }
            Map a = this.f95270c.mo91866a();
            a.put("target_user", "1");
            this.f95271d.mo91643a(a);
            C6907h.m21524a("profile_update_alert_finish", (Map) C22984d.m75611a().mo59973a("type", C36725aj.m118394a(2)).f60753a);
        }
    }

    public UpdateNickNameDialog(Context context, boolean z) {
        super(context, z);
    }
}
