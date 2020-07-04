package com.p280ss.android.ugc.aweme.main.story.live.view;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.view.View.OnClickListener;
import com.p280ss.android.ugc.aweme.main.story.live.view.C33105a.C33106a;

/* renamed from: com.ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView */
public abstract class AbsLiveStoryItemView extends ConstraintLayout implements OnClickListener, C33105a {

    /* renamed from: g */
    protected String f86123g;

    /* renamed from: h */
    public String f86124h = "toplist_homepage_hot";

    /* renamed from: i */
    private View f86125i;
    protected C33106a mListener;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo64480a(Context context, boolean z);

    public View getRootView() {
        return this.f86125i;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mListener != null) {
            this.mListener.mo84823a();
        }
    }

    public void setListener(C33106a aVar) {
        this.mListener = aVar;
    }

    public void setRequestId(String str) {
        this.f86123g = str;
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (this.mListener != null) {
            this.mListener.mo84824a(i);
        }
    }

    public AbsLiveStoryItemView(Context context, boolean z) {
        super(context);
        this.f86125i = mo64480a(context, z);
        setOnClickListener(this);
        setVisibility(8);
    }
}
