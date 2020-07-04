package com.p280ss.android.ugc.aweme.recommend.widget;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0065w;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.recommend.widget.BaseRecommendCommonView */
public abstract class BaseRecommendCommonView extends FrameLayout implements C0053p<C23083a> {

    /* renamed from: a */
    private final View f97296a;

    /* renamed from: b */
    private final DataCenter f97297b;

    /* renamed from: c */
    private final ViewStub f97298c;

    /* renamed from: d */
    private HashMap f97299d;

    public BaseRecommendCommonView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BaseRecommendCommonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public View mo93679a(int i) {
        if (this.f97299d == null) {
            this.f97299d = new HashMap();
        }
        View view = (View) this.f97299d.get(Integer.valueOf(R.id.cp8));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.cp8);
        this.f97299d.put(Integer.valueOf(R.id.cp8), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public void onChanged(C23083a aVar) {
    }

    public abstract int getContentLayoutResId();

    /* access modifiers changed from: protected */
    public final DataCenter getMDataCenter() {
        return this.f97297b;
    }

    /* access modifiers changed from: protected */
    public final View getMRootView() {
        return this.f97296a;
    }

    /* renamed from: a */
    private final void mo93678a() {
        this.f97298c.setLayoutResource(getContentLayoutResId());
        this.f97298c.inflate();
    }

    /* access modifiers changed from: protected */
    public final Context getMContext() {
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        return context;
    }

    /* access modifiers changed from: protected */
    public final FragmentActivity getMActivity() {
        Context context = getContext();
        if (context != null) {
            return (FragmentActivity) context;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public BaseRecommendCommonView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        View inflate = View.inflate(context, R.layout.b45, this);
        C7573i.m23582a((Object) inflate, "View.inflate(context, R.…mmon_user_vertical, this)");
        this.f97296a = inflate;
        C0065w a = C0069x.m159a(getMActivity());
        FragmentActivity mActivity = getMActivity();
        if (mActivity != null) {
            this.f97297b = DataCenter.m75849a(a, (C0043i) mActivity);
            View findViewById = this.f97296a.findViewById(R.id.a20);
            C7573i.m23582a((Object) findViewById, "mRootView.findViewById(R.id.content_container)");
            this.f97298c = (ViewStub) findViewById;
            mo93678a();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    public /* synthetic */ BaseRecommendCommonView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
