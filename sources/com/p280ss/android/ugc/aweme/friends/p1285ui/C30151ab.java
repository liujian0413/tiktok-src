package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.common.C10774c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.util.C36769z;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.ab */
public final class C30151ab extends C30179z {

    /* renamed from: k */
    private final LinearLayout f79372k = ((LinearLayout) findViewById(R.id.dg3));

    /* renamed from: l */
    private final RelativeUserAvatarListView f79373l = ((RelativeUserAvatarListView) findViewById(R.id.crf));

    /* renamed from: m */
    private final int f79374m = (C9738o.m28691a(getContext()) - ((int) C9738o.m28708b(getContext(), 185.0f)));

    /* renamed from: n */
    private final C36769z f79375n = new C36769z(this.f79372k, this.f79374m);

    /* renamed from: o */
    private boolean f79376o;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo76631a(User user) {
        C7573i.m23587b(user, "user");
    }

    /* access modifiers changed from: protected */
    public final int getLayoutId() {
        return R.layout.a1l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo76633a() {
        if (this.f79411j == 0 || this.f79411j == 1) {
            return false;
        }
        return true;
    }

    public final void setShowTag(boolean z) {
        this.f79376o = z;
    }

    public final void setData(User user) {
        C7573i.m23587b(user, "user");
        super.setData(user);
        if ((this.f79411j == 0 || this.f79411j == 1) && !this.f79376o) {
            m98808b(user, this.f79406e);
            mo76647a(this.f79404c, user);
            return;
        }
        TextView textView = this.f79406e;
        C7573i.m23582a((Object) textView, "txtDesc");
        mo76632a(user, textView);
        mo76631a(user);
        TextView textView2 = this.f79404c;
        C7573i.m23582a((Object) textView2, "txtFollowInfo");
        textView2.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo76632a(User user, TextView textView) {
        C7573i.m23587b(user, "user");
        C7573i.m23587b(textView, "textView");
        RelativeUserAvatarListView relativeUserAvatarListView = this.f79373l;
        C7573i.m23582a((Object) relativeUserAvatarListView, "mRelativeUserAvatars");
        relativeUserAvatarListView.setVisibility(0);
        textView.setMaxLines(2);
        m98808b(user, this.f79406e);
        this.f79373l.mo76615a(user, textView, false);
    }

    public C30151ab(Context context, HashMap<String, Boolean> hashMap, boolean z) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(hashMap, "followClickMap");
        super(context, null, 0, hashMap, z);
        setBackground(C10774c.m31449e(getContext()));
    }
}
