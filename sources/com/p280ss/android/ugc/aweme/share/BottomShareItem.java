package com.p280ss.android.ugc.aweme.share;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.StringTokenizer;

/* renamed from: com.ss.android.ugc.aweme.share.BottomShareItem */
public class BottomShareItem extends LinearLayout {

    /* renamed from: a */
    protected ImageView f98808a = ((ImageView) findViewById(R.id.d4k));

    /* renamed from: b */
    protected TextView f98809b = ((TextView) findViewById(R.id.d4l));

    /* renamed from: c */
    protected View f98810c = findViewById(R.id.o9);

    public int getLayoutResource() {
        return R.layout.hr;
    }

    public ImageView getShareImageView() {
        return this.f98808a;
    }

    public TextView getShareTextView() {
        return this.f98809b;
    }

    public void setIcon(int i) {
        this.f98808a.setImageResource(i);
    }

    public void setIconAlpha(float f) {
        this.f98808a.setAlpha(f);
    }

    public void setText(int i) {
        this.f98809b.setText(i);
    }

    public void setTextAlpha(float f) {
        this.f98809b.setAlpha(f);
    }

    public void setTextSize(float f) {
        this.f98809b.setTextSize(f);
    }

    /* renamed from: a */
    private void m121223a(boolean z) {
        if (this.f98810c != null) {
            this.f98810c.setVisibility(8);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f98808a.setImageDrawable(drawable);
    }

    public void setTextColor(int i) {
        this.f98809b.setTextColor(getResources().getColor(i));
    }

    public void setText(String str) {
        int i;
        TextView textView = this.f98809b;
        if (str.contains(" ")) {
            i = 2;
        } else {
            i = 1;
        }
        textView.setMaxLines(i);
        this.f98809b.setText(m121222a(str));
    }

    /* renamed from: a */
    private static String m121222a(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
        StringBuilder sb = new StringBuilder();
        sb.append(stringTokenizer.nextToken());
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.length() >= 8) {
                sb.append(" \n");
                sb.append(nextToken);
            } else {
                sb.append(" ");
                sb.append(nextToken);
            }
        }
        return sb.toString();
    }

    public BottomShareItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        m121223a(false);
        setClipChildren(false);
        setClipToPadding(false);
        setOrientation(1);
        setGravity(1);
    }
}
