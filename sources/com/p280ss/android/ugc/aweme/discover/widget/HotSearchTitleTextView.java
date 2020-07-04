package com.p280ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.common.C10773a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.discover.hotspot.C26688a.C26689a;
import com.p280ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.HotSearchTitleTextView */
public final class HotSearchTitleTextView extends DmtTextView {

    /* renamed from: b */
    public boolean f71845b;

    /* renamed from: c */
    private HotSearchItem f71846c;

    /* renamed from: d */
    private boolean f71847d;

    /* renamed from: e */
    private boolean f71848e;

    /* renamed from: f */
    private boolean f71849f;

    public HotSearchTitleTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public HotSearchTitleTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final boolean getNoDrawable() {
        return this.f71849f;
    }

    public final boolean getOld() {
        return this.f71848e;
    }

    public final boolean getSmall() {
        return this.f71847d;
    }

    public final void setInSpot(boolean z) {
        this.f71845b = z;
    }

    public final void setNoDrawable(boolean z) {
        this.f71849f = z;
    }

    public final void setOld(boolean z) {
        this.f71848e = z;
    }

    public final void setSmall(boolean z) {
        this.f71847d = z;
    }

    public final void setHotSearchItem(HotSearchItem hotSearchItem) {
        float f;
        float f2;
        int i;
        boolean z;
        int i2;
        boolean z2;
        C7573i.m23587b(hotSearchItem, "item");
        this.f71846c = hotSearchItem;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (hotSearchItem.getType() == 1) {
            spannableStringBuilder.append("#");
            String word = hotSearchItem.getWord();
            if (word == null) {
                C7573i.m23580a();
            }
            CharSequence charSequence = word;
            int length = charSequence.length() - 1;
            int i3 = 0;
            boolean z3 = false;
            while (i3 <= length) {
                if (!z3) {
                    i2 = i3;
                } else {
                    i2 = length;
                }
                if (charSequence.charAt(i2) <= ' ') {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z3) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (!z2) {
                    z3 = true;
                } else {
                    i3++;
                }
            }
            spannableStringBuilder.append(charSequence.subSequence(i3, length + 1).toString());
        } else if (hotSearchItem.getType() == 0) {
            String word2 = hotSearchItem.getWord();
            if (word2 == null) {
                C7573i.m23580a();
            }
            CharSequence charSequence2 = word2;
            int length2 = charSequence2.length() - 1;
            int i4 = 0;
            boolean z4 = false;
            while (i4 <= length2) {
                if (!z4) {
                    i = i4;
                } else {
                    i = length2;
                }
                if (charSequence2.charAt(i) <= ' ') {
                    z = true;
                } else {
                    z = false;
                }
                if (z4) {
                    if (!z) {
                        break;
                    }
                    length2--;
                } else if (!z) {
                    z4 = true;
                } else {
                    i4++;
                }
            }
            spannableStringBuilder.append(charSequence2.subSequence(i4, length2 + 1).toString());
            Drawable drawable = null;
            if (!this.f71845b) {
                switch (hotSearchItem.getLabel()) {
                    case 1:
                        drawable = getResources().getDrawable(R.drawable.a9f);
                        break;
                    case 2:
                        drawable = getResources().getDrawable(R.drawable.a9e);
                        break;
                    case 3:
                        drawable = getResources().getDrawable(R.drawable.a9d);
                        break;
                }
            } else {
                drawable = m89310a(hotSearchItem.getLabel(), false);
            }
            if (drawable != null) {
                if (this.f71845b) {
                    f = 16.0f;
                } else {
                    f = 13.0f;
                }
                if (C26689a.m87668a(hotSearchItem.getLabel(), this.f71845b, false) > 0.0f) {
                    f2 = C26689a.m87668a(hotSearchItem.getLabel(), this.f71845b, false);
                } else {
                    f2 = f;
                }
                drawable.setBounds(0, 0, (int) C9738o.m28708b(getContext(), f2), (int) C9738o.m28708b(getContext(), f));
                C10773a aVar = new C10773a(drawable);
                spannableStringBuilder.append(" *");
                spannableStringBuilder.setSpan(aVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            }
        }
        setText(spannableStringBuilder);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Drawable m89310a(int i, boolean z) {
        if (this.f71849f && !z) {
            return null;
        }
        boolean z2 = this.f71848e;
        boolean z3 = this.f71847d;
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        return C26689a.m87670a(z2, z3, i, context);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        C7573i.m23582a((Object) layout, "layout");
        if (layout.getEllipsisCount(layout.getLineCount() - 1) > 0 && this.f71846c != null) {
            HotSearchItem hotSearchItem = this.f71846c;
            if (hotSearchItem == null) {
                C7573i.m23580a();
            }
            if (hotSearchItem.getType() == 0) {
                CharSequence text = getText();
                HotSearchItem hotSearchItem2 = this.f71846c;
                if (hotSearchItem2 == null) {
                    C7573i.m23580a();
                }
                if (!TextUtils.equals(text, hotSearchItem2.getWord())) {
                    HotSearchItem hotSearchItem3 = this.f71846c;
                    if (hotSearchItem3 == null) {
                        C7573i.m23580a();
                    }
                    setText(hotSearchItem3.getWord());
                }
            }
        }
    }

    public HotSearchTitleTextView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ HotSearchTitleTextView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
