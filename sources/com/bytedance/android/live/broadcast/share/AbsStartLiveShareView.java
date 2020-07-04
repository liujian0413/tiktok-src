package com.bytedance.android.live.broadcast.share;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.host.IHostShare;

public abstract class AbsStartLiveShareView extends LinearLayout implements OnClickListener {

    /* renamed from: a */
    protected String f9154a;

    /* renamed from: b */
    protected Activity f9155b;

    /* renamed from: c */
    protected IHostShare f9156c;

    /* renamed from: d */
    protected C2934a f9157d;

    /* renamed from: com.bytedance.android.live.broadcast.share.AbsStartLiveShareView$a */
    public interface C2934a {
        /* renamed from: a */
        void mo9493a(String str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo9666a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo9668b();

    public AbsStartLiveShareView(Context context) {
        super(context);
    }

    public void onClick(View view) {
        this.f9157d.mo9493a(this.f9154a);
    }

    public AbsStartLiveShareView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo9667a(Activity activity, C2934a aVar) {
        this.f9155b = activity;
        this.f9157d = aVar;
        this.f9156c = (IHostShare) C3596c.m13172a(IHostShare.class);
        mo9666a();
        mo9668b();
    }

    public AbsStartLiveShareView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
    }
}
