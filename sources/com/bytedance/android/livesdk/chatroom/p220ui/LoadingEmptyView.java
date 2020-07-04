package com.bytedance.android.livesdk.chatroom.p220ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.LiveTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LoadingEmptyView */
public final class LoadingEmptyView extends FrameLayout {

    /* renamed from: a */
    private TextView f15086a;

    /* renamed from: b */
    private HashMap f15087b;

    public LoadingEmptyView(Context context) {
        this(context, null, 0, 6, null);
    }

    /* renamed from: a */
    private View m16677a(int i) {
        if (this.f15087b == null) {
            this.f15087b = new HashMap();
        }
        View view = (View) this.f15087b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f15087b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    private final void m16678a() {
        LayoutInflater.from(getContext()).inflate(R.layout.auj, this, true);
        this.f15086a = (TextView) findViewById(R.id.btr);
    }

    /* renamed from: b */
    public final LoadingEmptyView mo13380b(String str) {
        LiveTextView liveTextView = (LiveTextView) m16677a((int) R.id.bts);
        C7573i.m23582a((Object) liveTextView, "loading_empty_title");
        liveTextView.setText(str);
        LiveTextView liveTextView2 = (LiveTextView) m16677a((int) R.id.bts);
        C7573i.m23582a((Object) liveTextView2, "loading_empty_title");
        liveTextView2.setVisibility(0);
        return this;
    }

    /* renamed from: a */
    public final LoadingEmptyView mo13379a(String str) {
        if (((LiveTextView) m16677a((int) R.id.btq)) != null) {
            LiveTextView liveTextView = (LiveTextView) m16677a((int) R.id.btq);
            C7573i.m23582a((Object) liveTextView, "loading_empty_text");
            liveTextView.setText(str);
        }
        return this;
    }

    public LoadingEmptyView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        m16678a();
    }

    public /* synthetic */ LoadingEmptyView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
