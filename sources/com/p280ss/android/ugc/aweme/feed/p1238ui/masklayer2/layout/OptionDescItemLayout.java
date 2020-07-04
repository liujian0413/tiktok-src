package com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer2.layout;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.layout.OptionDescItemLayout */
public final class OptionDescItemLayout extends LinearLayout {

    /* renamed from: a */
    private TextView f76333a;

    /* renamed from: b */
    private ImageView f76334b;

    /* renamed from: a */
    public final void mo74258a(C28985f fVar) {
        C7573i.m23587b(fVar, "vo");
        ImageView imageView = this.f76334b;
        if (imageView != null) {
            imageView.setImageResource(fVar.f76353a);
        }
        TextView textView = this.f76333a;
        if (textView != null) {
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            textView.setText(context.getResources().getText(fVar.f76354b));
        }
    }

    public OptionDescItemLayout(Context context) {
        super(context);
        View.inflate(getContext(), R.layout.xg, this);
        if (C6399b.m19944t()) {
            int b = (int) C9738o.m28708b(getContext(), 12.0f);
            setPadding(b, b, b, b);
        } else {
            int b2 = (int) C9738o.m28708b(getContext(), 16.0f);
            int b3 = (int) C9738o.m28708b(getContext(), 14.0f);
            setPadding(b3, b2, b3, b2);
        }
        setGravity(16);
        this.f76333a = (TextView) findViewById(R.id.a7e);
        TextView textView = this.f76333a;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
        this.f76334b = (ImageView) findViewById(R.id.ax9);
    }

    public OptionDescItemLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), R.layout.xg, this);
        if (C6399b.m19944t()) {
            int b = (int) C9738o.m28708b(getContext(), 12.0f);
            setPadding(b, b, b, b);
        } else {
            int b2 = (int) C9738o.m28708b(getContext(), 16.0f);
            int b3 = (int) C9738o.m28708b(getContext(), 14.0f);
            setPadding(b3, b2, b3, b2);
        }
        setGravity(16);
        this.f76333a = (TextView) findViewById(R.id.a7e);
        TextView textView = this.f76333a;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
        this.f76334b = (ImageView) findViewById(R.id.ax9);
    }

    public OptionDescItemLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(getContext(), R.layout.xg, this);
        if (C6399b.m19944t()) {
            int b = (int) C9738o.m28708b(getContext(), 12.0f);
            setPadding(b, b, b, b);
        } else {
            int b2 = (int) C9738o.m28708b(getContext(), 16.0f);
            int b3 = (int) C9738o.m28708b(getContext(), 14.0f);
            setPadding(b3, b2, b3, b2);
        }
        setGravity(16);
        this.f76333a = (TextView) findViewById(R.id.a7e);
        TextView textView = this.f76333a;
        if (textView != null) {
            TextPaint paint = textView.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(true);
            }
        }
        this.f76334b = (ImageView) findViewById(R.id.ax9);
    }
}
