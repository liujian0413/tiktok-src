package com.p280ss.android.ugc.aweme.setting.p337ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p022v4.content.C0683b;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.R$styleable;
import com.p280ss.android.ugc.aweme.base.p308ui.MaterialRippleLayout;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.RadioSettingItem */
public class RadioSettingItem extends MaterialRippleLayout {

    /* renamed from: i */
    private TextView f98523i;

    /* renamed from: j */
    private TextView f98524j;

    /* renamed from: k */
    private View f98525k;

    /* renamed from: l */
    private ImageView f98526l;

    /* renamed from: m */
    private C37804a f98527m;

    /* renamed from: n */
    private RadioSettingGroup f98528n;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.RadioSettingItem$a */
    public interface C37804a {
        /* renamed from: a */
        boolean mo59376a(View view);
    }

    /* renamed from: e */
    private boolean m120943e() {
        return this.f98526l.isSelected();
    }

    /* renamed from: d */
    private void m120942d() {
        this.f98525k.setOnClickListener(new C37877ad(this));
    }

    /* renamed from: f */
    private void m120944f() {
        if (this.f98528n == null && (getParent() instanceof RadioSettingGroup)) {
            this.f98528n = (RadioSettingGroup) getParent();
        }
    }

    public void setOnSettingItemClickListener(C37804a aVar) {
        this.f98527m = aVar;
    }

    public RadioSettingItem(Context context) {
        this(context, null);
    }

    public void setStartText(String str) {
        this.f98523i.setText(str);
    }

    public void setStartSubText(String str) {
        if (this.f98524j != null) {
            this.f98524j.setVisibility(0);
            this.f98524j.setText(str);
        }
    }

    public void setStartSubTextColor(int i) {
        if (this.f98524j != null) {
            this.f98524j.setTextColor(i);
        }
    }

    public void setStartTextColor(int i) {
        if (this.f98523i != null) {
            this.f98523i.setTextColor(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95228a(View view) {
        if (this.f98527m == null) {
            setChecked(!m120943e());
            return;
        }
        this.f98527m.mo59376a(this);
        setChecked(!m120943e());
    }

    /* access modifiers changed from: protected */
    public void setSelfChecked(boolean z) {
        this.f98526l.setSelected(z);
        if (z) {
            this.f98526l.setImageDrawable(C23481i.m77092c(R.drawable.aax));
            return;
        }
        this.f98526l.setImageDrawable(null);
    }

    /* renamed from: a */
    private void m120940a(Context context) {
        View inflate = View.inflate(context, R.layout.ajc, this);
        this.f98525k = inflate.findViewById(R.id.cwn);
        this.f98523i = (TextView) inflate.findViewById(R.id.dwq);
        this.f98526l = (ImageView) inflate.findViewById(R.id.blc);
        this.f98524j = (TextView) inflate.findViewById(R.id.dwp);
        m120944f();
    }

    public void setChecked(boolean z) {
        boolean z2;
        if (!m120943e()) {
            m120944f();
            if (this.f98528n != null) {
                for (int i = 0; i < this.f98528n.getChildCount(); i++) {
                    if (this.f98528n.getChildAt(i) instanceof RadioSettingItem) {
                        RadioSettingItem radioSettingItem = (RadioSettingItem) this.f98528n.getChildAt(i);
                        if (equals(radioSettingItem)) {
                            z2 = z;
                        } else if (!z) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        radioSettingItem.setSelfChecked(z2);
                    }
                }
                return;
            }
            setSelfChecked(z);
        }
    }

    public RadioSettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m120941a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SettingItem);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 6) {
                this.f98523i.setText(obtainStyledAttributes.getString(index));
            } else if (index == 10) {
                this.f98523i.setTextSize((float) obtainStyledAttributes.getDimensionPixelSize(index, (int) TypedValue.applyDimension(2, 15.0f, getResources().getDisplayMetrics())));
            } else if (index == 9) {
                this.f98523i.setTextColor(obtainStyledAttributes.getColor(index, C0683b.m2912c(getContext(), R.color.ab0)));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public RadioSettingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m120940a(context);
        m120941a(context, attributeSet);
        m120942d();
    }
}
