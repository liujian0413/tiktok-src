package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarWithBorderView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.commercialize.p1115ad.C24509a;
import com.p280ss.android.ugc.aweme.hotsearch.p1295c.C30355b.C30356a;
import com.p280ss.android.ugc.aweme.i18n.C30537o;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.ProfileStarRankView */
public class ProfileStarRankView extends FrameLayout {

    /* renamed from: a */
    List<AvatarWithBorderView> f96094a;

    /* renamed from: b */
    private ViewStub f96095b;

    /* renamed from: c */
    private boolean f96096c;

    /* renamed from: d */
    private RemoteImageView f96097d;

    /* renamed from: e */
    private LinearLayout f96098e;

    /* renamed from: f */
    private LinearLayout f96099f;

    /* renamed from: g */
    private DmtTextView f96100g;

    /* renamed from: h */
    private DmtTextView f96101h;

    /* renamed from: i */
    private DmtTextView f96102i;

    /* renamed from: j */
    private ImageView f96103j;

    /* renamed from: k */
    private AvatarWithBorderView f96104k;

    /* renamed from: l */
    private AvatarWithBorderView f96105l;

    /* renamed from: m */
    private AvatarWithBorderView f96106m;

    public ViewGroup getHitRankView() {
        m118160b();
        return this.f96099f;
    }

    public ViewGroup getStarRankView() {
        m118160b();
        return this.f96098e;
    }

    /* renamed from: a */
    private void m118159a() {
        this.f96095b = new ViewStub(getContext());
        this.f96095b.setLayoutResource(R.layout.b3y);
        addView(this.f96095b);
    }

    /* renamed from: b */
    private void m118160b() {
        if (!this.f96096c) {
            this.f96095b.inflate();
            this.f96096c = true;
            this.f96097d = (RemoteImageView) findViewById(R.id.b6k);
            this.f96098e = (LinearLayout) findViewById(R.id.bsj);
            this.f96099f = (LinearLayout) findViewById(R.id.brk);
            this.f96100g = (DmtTextView) findViewById(R.id.e28);
            this.f96101h = (DmtTextView) findViewById(R.id.dvn);
            this.f96102i = (DmtTextView) findViewById(R.id.e29);
            this.f96103j = (ImageView) findViewById(R.id.bce);
            this.f96104k = (AvatarWithBorderView) findViewById(R.id.b_1);
            this.f96105l = (AvatarWithBorderView) findViewById(R.id.b_2);
            this.f96106m = (AvatarWithBorderView) findViewById(R.id.b_3);
            this.f96094a.add(this.f96104k);
            this.f96094a.add(this.f96105l);
            this.f96094a.add(this.f96106m);
            for (AvatarWithBorderView avatarWithBorderView : this.f96094a) {
                avatarWithBorderView.setBorderColor(R.color.a3r);
                avatarWithBorderView.setBorderWidth(1);
            }
        }
    }

    public ProfileStarRankView(Context context) {
        this(context, null);
    }

    public void setBackgroundImage(String str) {
        if (!TextUtils.isEmpty(str)) {
            m118160b();
            C23323e.m76514a(this.f96097d, str);
        }
    }

    public void setVisibility(int i) {
        if (i == 0) {
            m118160b();
        }
        super.setVisibility(i);
    }

    public void setHitRankPeopleNumber(int i) {
        m118160b();
        this.f96101h.setText(getResources().getString(R.string.be_, new Object[]{C30537o.m99738a((long) i)}));
    }

    public void setHitRankUsers(List<User> list) {
        if (list != null) {
            int min = Math.min(list.size(), 3);
            for (int i = 0; i < min; i++) {
                User user = (User) list.get(i);
                if (user != null) {
                    C23323e.m76524b((RemoteImageView) this.f96094a.get(i), user.getAvatarThumb());
                }
            }
        }
    }

    public void setRank(int i) {
        String str;
        if (i > 0) {
            m118160b();
            if (i <= 30) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                str = sb.toString();
                this.f96103j.setImageResource(C30356a.m99183a(i));
                this.f96103j.setVisibility(0);
                this.f96102i.setVisibility(8);
            } else {
                str = "30+";
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" T");
                spannableStringBuilder.setSpan(new C24509a(getContext(), R.drawable.a67), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
                this.f96102i.setText(spannableStringBuilder);
                this.f96102i.setVisibility(0);
                this.f96103j.setVisibility(8);
            }
            this.f96100g.setText(getResources().getString(R.string.e11, new Object[]{str}));
        }
    }

    public ProfileStarRankView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f96094a = new ArrayList();
        m118159a();
    }
}
