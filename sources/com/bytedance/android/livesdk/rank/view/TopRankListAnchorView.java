package com.bytedance.android.livesdk.rank.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.rank.model.C8857f;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class TopRankListAnchorView extends RelativeLayout {

    /* renamed from: a */
    private ImageView f24122a;

    /* renamed from: b */
    private TextView f24123b;

    /* renamed from: c */
    private ImageView f24124c;

    /* renamed from: d */
    private TextView f24125d;

    /* renamed from: e */
    private TextView f24126e;

    /* renamed from: f */
    private View f24127f;

    /* renamed from: a */
    private void m26513a() {
        inflate(getContext(), R.layout.azb, this);
        this.f24122a = (ImageView) findViewById(R.id.dmk);
        this.f24123b = (TextView) findViewById(R.id.dmn);
        this.f24124c = (ImageView) findViewById(R.id.dmx);
        this.f24125d = (TextView) findViewById(R.id.dn0);
        this.f24127f = findViewById(R.id.dmq);
        this.f24126e = (TextView) findViewById(R.id.dmj);
    }

    public TopRankListAnchorView(Context context) {
        super(context);
        m26513a();
    }

    /* renamed from: b */
    private void m26517b(C8857f fVar) {
        if (!TextUtils.isEmpty(fVar.f24100d)) {
            this.f24126e.setText(fVar.f24100d);
        } else {
            this.f24126e.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m26514a(User user) {
        if (user != null) {
            C5343e.m17045b(this.f24124c, user.getAvatarThumb(), this.f24124c.getWidth(), this.f24124c.getHeight(), R.drawable.c4_);
            this.f24125d.setText(user.getNickName());
        }
    }

    /* renamed from: a */
    private void m26515a(C8857f fVar) {
        int i;
        float f;
        Object obj;
        boolean z = false;
        if (fVar.f24099c > 0 || getContext() == null) {
            switch (fVar.f24099c) {
                case 1:
                    this.f24122a.setImageResource(R.drawable.cby);
                    this.f24122a.setVisibility(0);
                    this.f24123b.setVisibility(8);
                    break;
                case 2:
                    this.f24122a.setImageResource(R.drawable.cbz);
                    this.f24122a.setVisibility(0);
                    this.f24123b.setVisibility(8);
                    break;
                case 3:
                    this.f24122a.setImageResource(R.drawable.cc0);
                    this.f24122a.setVisibility(0);
                    this.f24123b.setVisibility(8);
                    break;
                default:
                    TextView textView = this.f24123b;
                    if (fVar.f24099c > 99) {
                        obj = "99+";
                    } else {
                        obj = Integer.valueOf(fVar.f24099c);
                    }
                    textView.setText(String.valueOf(obj));
                    this.f24123b.setVisibility(0);
                    this.f24122a.setVisibility(8);
                    break;
            }
        } else {
            this.f24123b.setText(getContext().getResources().getString(R.string.eyi));
            this.f24123b.setVisibility(0);
            this.f24122a.setVisibility(8);
        }
        if (getContext() != null && getContext().getResources() != null) {
            if (fVar.f24099c > 0) {
                z = true;
            }
            TextView textView2 = this.f24123b;
            Resources resources = getContext().getResources();
            if (z) {
                i = R.color.ars;
            } else {
                i = R.color.art;
            }
            textView2.setTextColor(resources.getColor(i));
            TextView textView3 = this.f24123b;
            if (z) {
                f = 20.0f;
            } else {
                f = 12.0f;
            }
            textView3.setTextSize(1, f);
        }
    }

    private void setDouyinRankStyle(C8857f fVar) {
        Object obj;
        if (fVar != null && getContext() != null) {
            this.f24122a.setVisibility(8);
            this.f24123b.setVisibility(0);
            if (fVar.f24099c <= 0) {
                this.f24123b.setText(getContext().getResources().getString(R.string.eyi));
                this.f24123b.setTextSize(1, 10.0f);
            } else {
                TextView textView = this.f24123b;
                if (fVar.f24099c > 99) {
                    obj = "99+";
                } else {
                    obj = Integer.valueOf(fVar.f24099c);
                }
                textView.setText(String.valueOf(obj));
                this.f24123b.setTextSize(1, 15.0f);
            }
            switch (fVar.f24099c) {
                case 1:
                    this.f24123b.setTextColor(getContext().getResources().getColor(R.color.ahx));
                    return;
                case 2:
                    this.f24123b.setTextColor(getContext().getResources().getColor(R.color.ahy));
                    return;
                case 3:
                    this.f24123b.setTextColor(getContext().getResources().getColor(R.color.ahz));
                    return;
                default:
                    this.f24123b.setTextColor(getContext().getResources().getColor(R.color.ai0));
                    return;
            }
        }
    }

    public TopRankListAnchorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m26513a();
    }

    /* renamed from: a */
    private void m26516a(boolean z, OnClickListener onClickListener) {
        if (z) {
            this.f24127f.setVisibility(8);
        } else {
            this.f24127f.setOnClickListener(onClickListener);
        }
    }

    public TopRankListAnchorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m26513a();
    }

    /* renamed from: a */
    public final void mo21936a(C8857f fVar, OnClickListener onClickListener, boolean z) {
        if (fVar != null) {
            m26515a(fVar);
            m26514a(fVar.f24097a);
            m26517b(fVar);
            m26516a(z, onClickListener);
            setVisibility(0);
        }
    }

    public TopRankListAnchorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m26513a();
    }
}
