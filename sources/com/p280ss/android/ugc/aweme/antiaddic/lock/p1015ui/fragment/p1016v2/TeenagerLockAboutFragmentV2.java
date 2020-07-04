package com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.fragment.p1016v2;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22603f;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig;
import com.p280ss.android.ugc.aweme.antiaddic.lock.ParentalPlatformConfig.Role;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.widget.TimeLockDesc;
import com.p280ss.android.ugc.aweme.antiaddic.lock.viewmodel.C22658a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TeenagerLockAboutFragmentV2 */
public class TeenagerLockAboutFragmentV2 extends AbsAboutFragmentV2 {
    TimeLockDesc autoOpenTimelock;
    TimeLockDesc desc1;
    TimeLockDesc desc2;
    TimeLockDesc desc3;
    View mBetaDes;
    TextView mTeenagePolicy;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo59351a() {
        return R.layout.ra;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo59355e() {
        C6907h.m21524a("open_teen_mode", (Map) C22984d.m75611a().f60753a);
        super.mo59355e();
    }

    /* renamed from: k */
    private void m74850k() {
        if (!C6399b.m19944t()) {
            this.mTeenagePolicy.setVisibility(0);
            String string = getString(R.string.aa);
            String string2 = getString(R.string.ad);
            SpannableString spannableString = new SpannableString(string);
            int indexOf = string.indexOf(string2);
            spannableString.setSpan(new ClickableSpan() {
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                }

                public final void onClick(View view) {
                    C22603f.m74714a(TeenagerLockAboutFragmentV2.this.getContext());
                }
            }, indexOf, string2.length() + indexOf, 33);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.a71)), indexOf, string2.length() + indexOf, 33);
            this.mTeenagePolicy.setText(spannableString);
            this.mTeenagePolicy.setMovementMethod(new LinkMovementMethod());
        }
    }

    /* renamed from: l */
    private void m74851l() {
        this.autoOpenTimelock.setVisibility(8);
        if (C6399b.m19944t()) {
            String str = ((C22658a) mo59356i().getValue()).f60316b.f60318b;
            if (!TextUtils.isEmpty(str)) {
                this.f60249e.setText(getString(R.string.b3k, str));
            } else {
                this.f60249e.setText(getString(R.string.b3j));
            }
            this.desc1.setText(getString(R.string.dnz));
            this.desc2.setText(getString(R.string.b3m));
            this.desc3.setVisibility(8);
            return;
        }
        this.f60249e.setText(getString(R.string.b3j));
        this.desc2.setText(getString(R.string.e60));
        this.desc2.setImageDrawable(getResources().getDrawable(R.drawable.b1f));
        this.desc3.setText(getString(R.string.cs7));
        this.desc3.setImageDrawable(getResources().getDrawable(R.drawable.b1g));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!TimeLockRuler.isTeenagerAbEnable()) {
            this.desc3.setVisibility(8);
            this.desc1.setText(getString(R.string.agl));
        }
        if (C6399b.m19944t()) {
            this.desc1.setText(getString(R.string.dnz));
            this.desc2.setText(getString(R.string.do0));
            this.mBetaDes.setVisibility(4);
            C23487o.m77146a(false, this.desc3, this.autoOpenTimelock);
        } else if (ParentalPlatformConfig.f60133a.mo59214b() != Role.PARENT || !C21115b.m71197a().isLogin()) {
            this.desc1.setText(getString(R.string.a7));
        } else {
            this.desc1.setText(getString(R.string.e6f));
        }
        if (mo59357j()) {
            m74851l();
        }
        m74850k();
    }
}
