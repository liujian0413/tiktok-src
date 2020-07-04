package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.setting.model.RestrictInfo;
import com.p280ss.android.ugc.aweme.setting.model.RestrictInfoModel;
import com.p280ss.android.ugc.aweme.setting.p1520h.C37638d;
import com.p280ss.android.ugc.aweme.setting.p1520h.C37641g;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.RestrictTextView */
public class RestrictTextView extends DmtTextView implements C37638d {

    /* renamed from: b */
    private C37641g f98529b;

    /* renamed from: c */
    private String f98530c;

    /* renamed from: a */
    private void m120953a() {
        this.f98529b = new C37641g(new RestrictInfoModel(), this);
    }

    public RestrictTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo95237a(String str) {
        this.f98530c = str;
        this.f98529b.mo94936a(str);
    }

    /* renamed from: a */
    public final void mo94934a(RestrictInfo restrictInfo) {
        if (TextUtils.equals(restrictInfo.awemeId, this.f98530c)) {
            setVisibility(0);
            setText(C1642a.m8034a("Review time:%s \nReview AllFriends:%s ", new Object[]{restrictInfo.reviewTime, restrictInfo.reviewResult}));
        }
    }

    public RestrictTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public RestrictTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m120953a();
    }
}
