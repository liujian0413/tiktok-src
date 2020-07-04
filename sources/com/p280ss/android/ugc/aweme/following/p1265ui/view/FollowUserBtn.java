package com.p280ss.android.ugc.aweme.following.p1265ui.view;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p022v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.common.rebranding.C10779a;
import com.bytedance.ies.dmt.p262ui.common.rebranding.C10779a.C10780a;
import com.bytedance.ies.dmt.p262ui.common.rebranding.C10781b;
import com.bytedance.ies.dmt.p262ui.common.rebranding.C10782c;
import com.bytedance.ies.dmt.p262ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.legacy.business.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.following.ui.view.FollowUserBtn */
public class FollowUserBtn extends RelativeLayout implements C10781b, C29778b {

    /* renamed from: a */
    protected NiceWidthTextView f78313a;

    /* renamed from: b */
    protected int f78314b;

    /* renamed from: c */
    protected int f78315c;

    /* access modifiers changed from: protected */
    public int getFollowedTextColorResId() {
        return R.color.a4z;
    }

    /* access modifiers changed from: protected */
    public int getLayout() {
        return R.layout.b3_;
    }

    /* access modifiers changed from: protected */
    public int getUnFollowBgResId() {
        return R.drawable.lv;
    }

    /* access modifiers changed from: protected */
    public int getUnFollowTextColorResId() {
        return R.color.lt;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public C0043i getLifeCycleOwner() {
        return (FragmentActivity) C23487o.m77158e(this);
    }

    /* access modifiers changed from: protected */
    public int getFollowedBgResId() {
        if (C6399b.m19946v()) {
            return R.drawable.ma;
        }
        return R.drawable.bg_followed;
    }

    public FollowUserBtn(Context context) {
        this(context, null);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f78313a.setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: protected */
    public void setFollowButtonStyle(int i) {
        if (i == -1) {
            this.f78313a.setPadding(0, 0, 0, 0);
            this.f78313a.setGravity(17);
            this.f78313a.setCompoundDrawables(null, null, null, null);
            return;
        }
        Drawable drawable = getContext().getResources().getDrawable(i);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        this.f78313a.setCompoundDrawables(drawable, null, null, null);
        this.f78313a.setGravity(16);
    }

    /* renamed from: a */
    public int mo25768a(TextView textView) {
        if (this.f78315c != -1) {
            return this.f78315c;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.string.b92));
        arrayList.add(Integer.valueOf(R.string.aua));
        arrayList.add(Integer.valueOf(R.string.b8v));
        arrayList.add(Integer.valueOf(R.string.auc));
        return C10782c.m31460a(textView, arrayList, (int) C9738o.m28708b(getContext(), 60.0f), (int) C9738o.m28708b(getContext(), 120.0f));
    }

    public void setFollowStatus(int i) {
        if (this.f78314b != i) {
            this.f78314b = i;
            int followedBgResId = getFollowedBgResId();
            setVisibility(0);
            switch (i) {
                case 0:
                    this.f78313a.setText(getResources().getText(R.string.b7r));
                    this.f78313a.setTextColor(getResources().getColor(getUnFollowTextColorResId()));
                    this.f78313a.setBackground(getResources().getDrawable(getUnFollowBgResId()));
                    return;
                case 1:
                    this.f78313a.setText(getResources().getText(R.string.b92));
                    this.f78313a.setTextColor(getResources().getColor(getFollowedTextColorResId()));
                    this.f78313a.setBackground(getResources().getDrawable(followedBgResId));
                    return;
                case 2:
                    this.f78313a.setText(getResources().getText(R.string.aua));
                    this.f78313a.setTextColor(getResources().getColor(getFollowedTextColorResId()));
                    this.f78313a.setBackground(getResources().getDrawable(followedBgResId));
                    return;
                case 3:
                    setVisibility(8);
                    break;
                case 4:
                    this.f78313a.setText(getResources().getText(R.string.b8v));
                    this.f78313a.setTextColor(getResources().getColor(getFollowedTextColorResId()));
                    this.f78313a.setBackground(getResources().getDrawable(followedBgResId));
                    return;
            }
        }
    }

    public FollowUserBtn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void mo75747a(int i, int i2) {
        int followedBgResId = getFollowedBgResId();
        setVisibility(0);
        switch (i) {
            case 0:
                setFollowButtonStyle(-1);
                this.f78313a.setText(getResources().getText(R.string.b7r));
                this.f78313a.setTextColor(getResources().getColor(getUnFollowTextColorResId()));
                this.f78313a.setBackground(getResources().getDrawable(getUnFollowBgResId()));
                break;
            case 1:
                setFollowButtonStyle(-1);
                this.f78313a.setText(getResources().getText(R.string.b92));
                this.f78313a.setTextColor(getResources().getColor(getFollowedTextColorResId()));
                this.f78313a.setBackground(getResources().getDrawable(followedBgResId));
                break;
            case 2:
                setFollowButtonStyle(-1);
                this.f78313a.setText(getResources().getText(R.string.aua));
                this.f78313a.setTextColor(getResources().getColor(getFollowedTextColorResId()));
                this.f78313a.setBackground(getResources().getDrawable(followedBgResId));
                break;
            case 3:
                setVisibility(8);
                break;
            case 4:
                setFollowButtonStyle(-1);
                this.f78313a.setText(getResources().getText(R.string.b8v));
                this.f78313a.setTextColor(getResources().getColor(getFollowedTextColorResId()));
                this.f78313a.setBackground(getResources().getDrawable(followedBgResId));
                break;
        }
        this.f78314b = i;
    }

    public FollowUserBtn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f78315c = -1;
        mo75748a(context, attributeSet, i);
    }

    /* renamed from: a */
    public void mo75748a(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.FollowUserBtn);
        this.f78315c = (int) obtainStyledAttributes.getDimension(0, -1.0f);
        obtainStyledAttributes.recycle();
        this.f78313a = (NiceWidthTextView) LayoutInflater.from(context).inflate(getLayout(), this, true).findViewById(R.id.q7);
        this.f78313a.mo25767a(this);
        C10779a.m31458a(getClass(), new C10780a(mo25768a(this.f78313a)));
        this.f78314b = 0;
    }
}
