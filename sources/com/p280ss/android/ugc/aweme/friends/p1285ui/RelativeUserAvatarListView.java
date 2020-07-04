package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.LeadingMarginSpan.Standard;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.profile.model.RelativeUserInfo;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RelativeUserAvatarListView */
public final class RelativeUserAvatarListView extends FrameLayout {

    /* renamed from: a */
    private int f79343a;

    /* renamed from: b */
    private int f79344b;

    /* renamed from: c */
    private final int f79345c;

    public RelativeUserAvatarListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public RelativeUserAvatarListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    private static int m98756a(boolean z) {
        return z ? R.layout.a27 : R.layout.a26;
    }

    /* renamed from: a */
    public final void mo76614a(int i, int i2) {
        if (!(i == this.f79344b && i2 == this.f79343a) && getChildCount() > 0) {
            removeAllViews();
        }
        this.f79344b = i;
        this.f79343a = i2;
    }

    public RelativeUserAvatarListView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f79343a = (int) C9738o.m28708b(context, 16.0f);
        this.f79344b = (int) C9738o.m28708b(context, 20.0f);
        this.f79345c = (int) C9738o.m28708b(context, 1.0f);
    }

    /* renamed from: a */
    private final View m98757a(RelativeUserInfo relativeUserInfo, int i, boolean z) {
        View inflate = LayoutInflater.from(getContext()).inflate(m98756a(z), null);
        LayoutParams layoutParams = new LayoutParams(this.f79344b, this.f79344b);
        layoutParams.setMargins(this.f79343a * i, 0, 0, 0);
        inflate.setLayoutParams(layoutParams);
        C23323e.m76524b((RemoteImageView) inflate.findViewById(R.id.ic), relativeUserInfo.getAvatar());
        C7573i.m23582a((Object) inflate, "itemView");
        return inflate;
    }

    /* renamed from: a */
    public final void mo76615a(User user, TextView textView, boolean z) {
        int i;
        C7573i.m23587b(user, "user");
        setVisibility(8);
        List relativeUserInfos = user.getRelativeUserInfos();
        if (relativeUserInfos != null && !relativeUserInfos.isEmpty()) {
            setVisibility(0);
            removeAllViews();
            for (int size = relativeUserInfos.size() - 1; size >= 0; size--) {
                Object obj = relativeUserInfos.get(size);
                C7573i.m23582a(obj, "this[i]");
                addView(m98757a((RelativeUserInfo) obj, size, z));
            }
        }
        if (textView != null) {
            textView.setMaxLines(2);
            if (user.getRelativeUserInfos() == null) {
                i = 0;
            } else {
                i = user.getRelativeUserInfos().size();
            }
            if (!TextUtils.isEmpty(textView.getText())) {
                if (i > 0) {
                    textView.setPadding(0, (int) C9738o.m28708b(getContext(), 1.0f), 0, 0);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append(textView.getText());
                    spannableStringBuilder.setSpan(new Standard(this.f79344b + (this.f79343a * (i - 1)) + this.f79345c, 0), 0, spannableStringBuilder.length(), 17);
                    textView.setText(spannableStringBuilder);
                } else {
                    textView.setPadding(0, 0, 0, 0);
                }
            }
        }
    }

    public /* synthetic */ RelativeUserAvatarListView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
