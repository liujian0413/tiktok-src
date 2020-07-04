package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41540at;
import com.p280ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MTBindAccountView */
public final class MTBindAccountView extends BindAccountView {

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.MTBindAccountView$a */
    static final class C36164a implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ MTBindAccountView f94687a;

        C36164a(MTBindAccountView mTBindAccountView) {
            this.f94687a = mTBindAccountView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C7573i.m23582a((Object) motionEvent, "motionEvent");
            switch (motionEvent.getAction()) {
                case 0:
                    C41540at.m132302a(this.f94687a.f94543b, 1.0f, 0.5f, 150);
                    break;
                case 1:
                    MTBindAccountView mTBindAccountView = this.f94687a;
                    C41540at.m132302a(mTBindAccountView.f94543b, 0.5f, 1.0f, 150);
                    if (mTBindAccountView.f94548g != null) {
                        mTBindAccountView.f94548g.mo91966a();
                        break;
                    }
                    break;
            }
            return false;
        }
    }

    public MTBindAccountView(Context context) {
        this(context, null, 0, 6, null);
    }

    public MTBindAccountView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo91959a(Context context) {
        this.f94542a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.ady, this, true);
        this.f94543b = (LinearLayout) inflate.findViewById(R.id.bke);
        this.f94544c = (TextView) inflate.findViewById(R.id.ckr);
        this.f94545d = (AutoRTLImageView) inflate.findViewById(R.id.axl);
        this.f94546e = (AutoRTLImageView) inflate.findViewById(R.id.axt);
        this.f94547f = (AutoRTLImageView) inflate.findViewById(R.id.axx);
        this.f94543b.setOnTouchListener(new C36164a(this));
    }

    public MTBindAccountView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ MTBindAccountView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
