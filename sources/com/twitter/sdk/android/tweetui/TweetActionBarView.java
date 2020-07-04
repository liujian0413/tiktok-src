package com.twitter.sdk.android.tweetui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.twitter.sdk.android.core.C46821b;
import com.twitter.sdk.android.core.models.C46959o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class TweetActionBarView extends LinearLayout {

    /* renamed from: a */
    final C47002a f120596a;

    /* renamed from: b */
    ToggleImageButton f120597b;

    /* renamed from: c */
    ImageButton f120598c;

    /* renamed from: d */
    C46821b<C46959o> f120599d;

    /* renamed from: com.twitter.sdk.android.tweetui.TweetActionBarView$a */
    static class C47002a {
        C47002a() {
        }

        /* renamed from: a */
        static C47029aq m146944a() {
            return C47029aq.m147040a();
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m146943a();
    }

    /* renamed from: a */
    private void m146943a() {
        this.f120597b = (ToggleImageButton) findViewById(R.id.e5y);
        this.f120598c = (ImageButton) findViewById(R.id.e61);
    }

    /* access modifiers changed from: 0000 */
    public void setOnActionCallback(C46821b<C46959o> bVar) {
        this.f120599d = bVar;
    }

    /* access modifiers changed from: 0000 */
    public void setTweet(C46959o oVar) {
        setLike(oVar);
        setShare(oVar);
    }

    public TweetActionBarView(Context context) {
        this(context, null, new C47002a());
    }

    /* access modifiers changed from: 0000 */
    public void setLike(C46959o oVar) {
        C47029aq a = C47002a.m146944a();
        if (oVar != null) {
            this.f120597b.setToggledOn(oVar.f120433g);
            this.f120597b.setOnClickListener(new C47089p(oVar, a, this.f120599d));
        }
    }

    /* access modifiers changed from: 0000 */
    public void setShare(C46959o oVar) {
        C47029aq a = C47002a.m146944a();
        if (oVar != null) {
            this.f120598c.setOnClickListener(new C47006aa(oVar, a));
        }
    }

    public TweetActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, new C47002a());
    }

    TweetActionBarView(Context context, AttributeSet attributeSet, C47002a aVar) {
        super(context, attributeSet);
        this.f120596a = aVar;
    }
}
