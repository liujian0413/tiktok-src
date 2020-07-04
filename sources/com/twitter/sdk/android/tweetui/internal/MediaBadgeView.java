package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.twitter.sdk.android.core.internal.C46937t;
import com.twitter.sdk.android.core.models.C46947d;
import com.twitter.sdk.android.core.models.MediaEntity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class MediaBadgeView extends FrameLayout {

    /* renamed from: a */
    TextView f120700a;

    /* renamed from: b */
    ImageView f120701b;

    /* renamed from: a */
    private void m147084a() {
        this.f120700a.setVisibility(8);
        this.f120701b.setVisibility(8);
    }

    public MediaBadgeView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    public void setBadge(Drawable drawable) {
        this.f120701b.setVisibility(0);
        this.f120700a.setVisibility(8);
        this.f120701b.setImageDrawable(drawable);
    }

    public void setCard(C46947d dVar) {
        if (C46937t.m146806a(dVar)) {
            setBadge(getResources().getDrawable(R.drawable.cln));
        } else {
            m147084a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void setText(long j) {
        this.f120700a.setVisibility(0);
        this.f120701b.setVisibility(8);
        this.f120700a.setText(C47071e.m147169a(j));
    }

    /* renamed from: a */
    private void m147085a(Context context) {
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.b0m, this, true);
        this.f120700a = (TextView) inflate.findViewById(R.id.e65);
        this.f120701b = (ImageView) inflate.findViewById(R.id.e5o);
    }

    public void setMediaEntity(MediaEntity mediaEntity) {
        long j;
        if ("animated_gif".equals(mediaEntity.type)) {
            setBadge(getResources().getDrawable(R.drawable.cj2));
        } else if ("video".equals(mediaEntity.type)) {
            if (mediaEntity.videoInfo == null) {
                j = 0;
            } else {
                j = mediaEntity.videoInfo.durationMillis;
            }
            setText(j);
        } else {
            m147084a();
        }
    }

    public MediaBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m147085a(context);
    }
}
