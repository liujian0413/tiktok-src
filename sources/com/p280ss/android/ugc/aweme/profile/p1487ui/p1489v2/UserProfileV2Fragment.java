package com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.EnterpriseTransformLayout;
import com.p280ss.android.ugc.aweme.profile.p1487ui.MusUserProfileFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.p1490a.C36581a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.p1490a.p1491a.C36585c;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.p1490a.p1492b.C36589c;
import com.p280ss.android.ugc.aweme.translation.p1682ui.TranslationStatusView;
import com.p280ss.android.ugc.aweme.utils.C43126fg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.UserProfileV2Fragment */
public final class UserProfileV2Fragment extends MusUserProfileFragment {

    /* renamed from: aD */
    public static final C36579a f95985aD = new C36579a(null);

    /* renamed from: aE */
    private View f95986aE;

    /* renamed from: aF */
    private View f95987aF;

    /* renamed from: aG */
    private C36581a f95988aG;

    /* renamed from: aH */
    private HashMap f95989aH;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.UserProfileV2Fragment$a */
    public static final class C36579a {
        private C36579a() {
        }

        public /* synthetic */ C36579a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: R */
    public final void mo92342R() {
        if (this.f95989aH != null) {
            this.f95989aH.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo92342R();
    }

    /* renamed from: z */
    public final int mo91958z() {
        return this.f95988aG.mo92798a();
    }

    /* renamed from: w */
    public final void mo91955w() {
        super.mo91955w();
        TranslationStatusView translationStatusView = this.f94523H;
        if (translationStatusView != null) {
            translationStatusView.mo104217a();
        }
    }

    public UserProfileV2Fragment() {
        C36581a aVar;
        if (ProfileNewStyleExperiment.INSTANCE.getUSE_M_NEW()) {
            aVar = new C36585c(this);
        } else {
            aVar = new C36589c(this);
        }
        this.f95988aG = aVar;
    }

    /* renamed from: c */
    public final void mo91944c(View view) {
        super.mo91944c(view);
        this.f95988aG.mo92807b(view);
    }

    /* renamed from: d */
    public final void mo91717d(User user) {
        super.mo91717d(user);
        EnterpriseTransformLayout enterpriseTransformLayout = this.f94746r;
        if (enterpriseTransformLayout != null) {
            enterpriseTransformLayout.mo91999a();
        }
    }

    /* renamed from: e */
    public final void mo91722e(User user) {
        if (!ProfileNewStyleExperiment.INSTANCE.getUSE_T_NEW() || !isViewValid()) {
            super.mo91722e(user);
        } else {
            this.f95988aG.mo92805a(mo92056l(), user);
        }
        mo92059n(user);
    }

    /* renamed from: p */
    public final void mo92139p(int i) {
        super.mo92139p(i);
        if (i == 0) {
            View view = this.f95987aF;
            if (view != null) {
                view.setBackgroundResource(R.drawable.ber);
            }
        } else if (i == 2) {
            View view2 = this.f95987aF;
            if (view2 != null) {
                view2.setBackgroundResource(R.drawable.bes);
            }
        }
    }

    /* renamed from: a */
    public final void mo91697a(int i) {
        super.mo91697a(i);
        Context context = getContext();
        TextView textView = this.f94520E;
        C7573i.m23582a((Object) textView, "mFollowerCount");
        float c = (float) C9738o.m28714c(context, textView.getTextSize());
        Context context2 = getContext();
        TextView textView2 = this.f94734f;
        C7573i.m23582a((Object) textView2, "mFollowerCountDesc");
        m118011b(c, (float) C9738o.m28714c(context2, textView2.getTextSize()));
    }

    /* renamed from: b */
    public final void mo91705b(int i) {
        super.mo91705b(i);
        Context context = getContext();
        TextView textView = this.f94519D;
        C7573i.m23582a((Object) textView, "mFollowingCount");
        float c = (float) C9738o.m28714c(context, textView.getTextSize());
        Context context2 = getContext();
        TextView textView2 = this.f94733e;
        C7573i.m23582a((Object) textView2, "mFollowingCountDesc");
        m118011b(c, (float) C9738o.m28714c(context2, textView2.getTextSize()));
    }

    /* renamed from: c */
    public final void mo91713c(String str) {
        super.mo91713c(str);
        if (this.f94531Q != null) {
            Context context = getContext();
            User user = this.f94531Q;
            C7573i.m23582a((Object) user, "mUser");
            String customVerify = user.getCustomVerify();
            User user2 = this.f94531Q;
            C7573i.m23582a((Object) user2, "mUser");
            C43126fg.m136801a(context, customVerify, user2.getEnterpriseVerifyReason(), this.f94525K);
        }
    }

    /* renamed from: j */
    public final void mo91926j(User user) {
        String str;
        super.mo91926j(user);
        this.f95988aG.mo92802a(user, this.f94712X, this.f94711W);
        if (user != null) {
            str = user.getBioUrl();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            this.f95988aG.mo92808b(false);
        } else {
            this.f95988aG.mo92808b(true);
        }
    }

    /* renamed from: a */
    public final void mo91700a(long j) {
        super.mo91700a(j);
        Context context = getContext();
        TextView textView = this.f94521F;
        C7573i.m23582a((Object) textView, "mDragCount");
        float c = (float) C9738o.m28714c(context, textView.getTextSize());
        Context context2 = getContext();
        TextView textView2 = this.f94735g;
        C7573i.m23582a((Object) textView2, "mDragCountDesc");
        m118011b(c, (float) C9738o.m28714c(context2, textView2.getTextSize()));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        this.f95988aG.mo92801a(view);
        this.f95988aG.mo92806b();
        this.f95986aE = view.findViewById(R.id.dk3);
        this.f95987aF = view.findViewById(R.id.bs8);
        if (ProfileNewStyleExperiment.INSTANCE.getUSE_T_NEW()) {
            View view2 = this.f95986aE;
            if (view2 != null) {
                view2.setAlpha(0.0f);
            }
            View view3 = this.f95986aE;
            if (view3 != null) {
                view3.setVisibility(4);
            }
        }
    }

    /* renamed from: b */
    private final void m118011b(float f, float f2) {
        while (true) {
            f -= 1.0f;
            f2 -= 1.0f;
            float a = ((float) C9738o.m28691a(getContext())) - C9738o.m28708b(getContext(), 76.0f);
            TextView textView = this.f94733e;
            C7573i.m23582a((Object) textView, "mFollowingCountDesc");
            TextPaint paint = textView.getPaint();
            TextView textView2 = this.f94733e;
            C7573i.m23582a((Object) textView2, "mFollowingCountDesc");
            float measureText = paint.measureText(textView2.getText().toString());
            TextView textView3 = this.f94734f;
            C7573i.m23582a((Object) textView3, "mFollowerCountDesc");
            TextPaint paint2 = textView3.getPaint();
            TextView textView4 = this.f94734f;
            C7573i.m23582a((Object) textView4, "mFollowerCountDesc");
            float measureText2 = paint2.measureText(textView4.getText().toString());
            TextView textView5 = this.f94735g;
            C7573i.m23582a((Object) textView5, "mDragCountDesc");
            TextPaint paint3 = textView5.getPaint();
            TextView textView6 = this.f94735g;
            C7573i.m23582a((Object) textView6, "mDragCountDesc");
            float measureText3 = paint3.measureText(textView6.getText().toString());
            TextView textView7 = this.f94519D;
            C7573i.m23582a((Object) textView7, "mFollowingCount");
            TextPaint paint4 = textView7.getPaint();
            TextView textView8 = this.f94519D;
            C7573i.m23582a((Object) textView8, "mFollowingCount");
            float measureText4 = paint4.measureText(textView8.getText().toString());
            TextView textView9 = this.f94520E;
            C7573i.m23582a((Object) textView9, "mFollowerCount");
            TextPaint paint5 = textView9.getPaint();
            TextView textView10 = this.f94520E;
            C7573i.m23582a((Object) textView10, "mFollowerCount");
            float measureText5 = paint5.measureText(textView10.getText().toString());
            TextView textView11 = this.f94521F;
            C7573i.m23582a((Object) textView11, "mDragCount");
            TextPaint paint6 = textView11.getPaint();
            TextView textView12 = this.f94521F;
            C7573i.m23582a((Object) textView12, "mDragCount");
            if (measureText + measureText2 + measureText3 + measureText4 + measureText5 + paint6.measureText(textView12.getText().toString()) > a) {
                this.f94519D.setTextSize(1, f);
                this.f94520E.setTextSize(1, f);
                this.f94521F.setTextSize(1, f);
                this.f94733e.setTextSize(1, f2);
                this.f94734f.setTextSize(1, f2);
                this.f94735g.setTextSize(1, f2);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo61702b(int i, int i2) {
        super.mo61702b(i, i2);
        if (ProfileNewStyleExperiment.INSTANCE.getUSE_T_NEW() && this.mTitleBar != null) {
            float e = (float) this.f95988aG.mo92811e();
            float f = (float) i;
            float d = (f - e) / (((float) this.f95988aG.mo92810d()) - e);
            float f2 = f / e;
            if (d < 0.0f) {
                this.f95988aG.mo92804a(false);
                d = 0.0f;
            } else if (d > 1.0f) {
                d = 1.0f;
            }
            if (f2 < 0.0f) {
                View view = this.f95986aE;
                if (view != null) {
                    view.setVisibility(4);
                }
                f2 = 0.0f;
            } else if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            if (d > 0.0f) {
                this.f95988aG.mo92804a(true);
                View view2 = this.f95986aE;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
            }
            if (f2 > 0.0f) {
                View view3 = this.f95986aE;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
            }
            float f3 = 1.0f - d;
            if (f3 > 0.0f) {
                View f4 = this.f95988aG.mo92812f();
                if (f4 != null) {
                    f4.setVisibility(0);
                }
            } else if (f3 == 0.0f) {
                View f5 = this.f95988aG.mo92812f();
                if (f5 != null) {
                    f5.setVisibility(4);
                }
            }
            this.f95988aG.mo92799a(d);
            View view4 = this.f95986aE;
            if (view4 != null) {
                view4.setAlpha(f2);
            }
            View f6 = this.f95988aG.mo92812f();
            if (f6 != null) {
                f6.setAlpha(f3);
            }
        }
    }

    /* renamed from: a */
    public final void mo91703a(String str, int i, BlueVBrandInfo blueVBrandInfo, User user) {
        super.mo91703a(str, i, blueVBrandInfo, user);
        if (isViewValid()) {
            this.f95988aG.mo92803a(str);
        }
    }
}
