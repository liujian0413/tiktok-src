package com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.feed.netdetector.C28548b;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.FeedTopNoticeView */
public final class FeedTopNoticeView extends FrameLayout {

    /* renamed from: a */
    public static final C28575a f75240a = new C28575a(null);

    /* renamed from: b */
    private final View f75241b;

    /* renamed from: c */
    private final FrameLayout f75242c;

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.FeedTopNoticeView$a */
    public static final class C28575a {
        private C28575a() {
        }

        public /* synthetic */ C28575a(C7571f fVar) {
            this();
        }
    }

    public FeedTopNoticeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final FrameLayout getContent() {
        return this.f75242c;
    }

    public final View getRoot() {
        return this.f75241b;
    }

    /* renamed from: b */
    public final void mo73285b() {
        FrameLayout frameLayout = this.f75242c;
        C7573i.m23582a((Object) frameLayout, C38347c.f99553h);
        frameLayout.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo73284a() {
        if (C28548b.m93760b()) {
            FrameLayout frameLayout = this.f75242c;
            C7573i.m23582a((Object) frameLayout, C38347c.f99553h);
            frameLayout.setVisibility(0);
        }
    }

    /* renamed from: c */
    private final void m93816c() {
        if (C28548b.m93760b()) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.abm, this.f75242c, true);
            View findViewById = inflate.findViewById(R.id.cuw);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.b_a);
            DmtTextView dmtTextView = (DmtTextView) inflate.findViewById(R.id.dsf);
            C7573i.m23582a((Object) imageView, "mIvIcon");
            imageView.setVisibility(8);
            C7573i.m23582a((Object) dmtTextView, "mTvContent");
            dmtTextView.setText(getContext().getString(R.string.cjs));
            findViewById.setBackgroundColor(getContext().getResources().getColor(R.color.aya));
            C7573i.m23582a((Object) findViewById, "mRootView");
            LayoutParams layoutParams = findViewById.getLayoutParams();
            if (layoutParams != null) {
                ((LinearLayout.LayoutParams) layoutParams).setMargins(0, ((int) C9738o.m28708b(getContext(), 52.0f)) + C9738o.m28717e(getContext()), 0, 0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
    }

    public FeedTopNoticeView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f75241b = LayoutInflater.from(context).inflate(R.layout.mi, this, true);
        this.f75242c = (FrameLayout) this.f75241b.findViewById(R.id.ca6);
        m93816c();
    }

    private /* synthetic */ FeedTopNoticeView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
