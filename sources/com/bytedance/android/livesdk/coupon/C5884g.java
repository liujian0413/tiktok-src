package com.bytedance.android.livesdk.coupon;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.commerce.coupon.C5846b;
import com.bytedance.android.livesdk.commerce.coupon.LiveAlignTextView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.bytedance.android.livesdk.coupon.g */
public final class C5884g {

    /* renamed from: a */
    public ImageView f17417a;

    /* renamed from: b */
    private final long f17418b = 1;

    /* renamed from: c */
    private final long f17419c = 2;

    /* renamed from: d */
    private final long f17420d = 3;

    /* renamed from: e */
    private long f17421e;

    /* renamed from: f */
    private View f17422f;

    /* renamed from: g */
    private TextView f17423g;

    /* renamed from: h */
    private TextView f17424h;

    /* renamed from: i */
    private LiveAlignTextView f17425i;

    /* renamed from: j */
    private Typeface f17426j;

    /* renamed from: a */
    private static float m18393a(long j) {
        return ((float) j) / 100.0f;
    }

    /* renamed from: a */
    private static String m18394a(String str) {
        C7573i.m23587b(str, "value");
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence) || str.length() <= 2 || !C7634n.m23771b(charSequence, '.', false, 2, (Object) null) || '0' != str.charAt(str.length() - 1)) {
            return str;
        }
        String substring = str.substring(0, str.length() - 2);
        C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b */
    private void m18395b(C5871c cVar) {
        String str;
        if (cVar != null && cVar.f17355d == 1) {
            TextView textView = this.f17424h;
            if (textView != null) {
                textView.setText(C3358ac.m12517a((int) R.string.eq2, cVar.f17354c));
            }
        } else if (cVar == null || cVar.f17355d != 2) {
            TextView textView2 = this.f17424h;
            if (textView2 != null) {
                if (cVar != null) {
                    str = cVar.f17371t;
                } else {
                    str = null;
                }
                textView2.setText(str);
            }
        } else {
            TextView textView3 = this.f17424h;
            if (textView3 != null) {
                textView3.setText(C3358ac.m12517a((int) R.string.eq1, Long.valueOf(cVar.f17356e)));
            }
        }
    }

    /* renamed from: a */
    public final void mo14417a(C5871c cVar) {
        C5871c cVar2 = cVar;
        if (cVar2 == null) {
            View view = this.f17422f;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.f17422f;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        if (this.f17421e == this.f17418b) {
            String a = m18394a(String.valueOf(cVar2.f17366o));
            String a2 = C3358ac.m12515a((int) R.string.eso);
            List arrayList = new ArrayList();
            if (a != null) {
                C5846b bVar = new C5846b(a, C3358ac.m12519b(40.0f), C3358ac.m12521b((int) R.color.adb), 0, this.f17426j);
                arrayList.add(bVar);
            }
            if (a2 != null) {
                C5846b bVar2 = new C5846b(a2, C3358ac.m12519b(13.0f), C3358ac.m12521b((int) R.color.adb), 0, Typeface.DEFAULT_BOLD);
                arrayList.add(bVar2);
            }
            LiveAlignTextView liveAlignTextView = this.f17425i;
            if (liveAlignTextView != null) {
                liveAlignTextView.setTextList(C7525m.m23516h((Iterable) arrayList));
            }
            m18395b(cVar);
        } else if (this.f17421e == this.f17419c) {
            String a3 = m18394a(String.valueOf(m18393a(cVar2.f17362k)));
            String a4 = C3358ac.m12515a((int) R.string.esn);
            List arrayList2 = new ArrayList();
            if (a3 != null) {
                C5846b bVar3 = new C5846b(a3, C3358ac.m12519b(40.0f), C3358ac.m12521b((int) R.color.adb), 0, this.f17426j);
                arrayList2.add(bVar3);
            }
            if (a4 != null) {
                C5846b bVar4 = new C5846b(a4, C3358ac.m12519b(13.0f), C3358ac.m12521b((int) R.color.adb), C3358ac.m12510a(4.0f), Typeface.DEFAULT_BOLD);
                arrayList2.add(bVar4);
            }
            LiveAlignTextView liveAlignTextView2 = this.f17425i;
            if (liveAlignTextView2 != null) {
                liveAlignTextView2.setTextList(C7525m.m23516h((Iterable) arrayList2));
            }
            m18395b(cVar);
        } else {
            if (this.f17421e == this.f17420d) {
                String a5 = m18394a(String.valueOf(m18393a(cVar2.f17362k)));
                List arrayList3 = new ArrayList();
                if (a5 != null) {
                    C5846b bVar5 = new C5846b(a5, C3358ac.m12519b(40.0f), C3358ac.m12521b((int) R.color.adb), 0, this.f17426j);
                    arrayList3.add(bVar5);
                }
                LiveAlignTextView liveAlignTextView3 = this.f17425i;
                if (liveAlignTextView3 != null) {
                    liveAlignTextView3.setTextList(C7525m.m23516h((Iterable) arrayList3));
                }
                TextView textView = this.f17423g;
                if (textView != null) {
                    textView.setText(C3358ac.m12517a((int) R.string.esr, m18394a(String.valueOf(m18393a(cVar2.f17361j)))));
                }
                m18395b(cVar);
            }
        }
    }

    public C5884g(long j, FrameLayout frameLayout) {
        ImageView imageView;
        TextView textView;
        TextView textView2;
        C7573i.m23587b(frameLayout, "parent");
        frameLayout.removeAllViews();
        long j2 = j % 10;
        if (j2 == this.f17418b) {
            this.f17422f = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.b0e, frameLayout);
            this.f17421e = this.f17418b;
        } else if (j2 == this.f17419c) {
            this.f17422f = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.b0f, frameLayout);
            this.f17421e = this.f17419c;
        } else if (j2 == this.f17420d) {
            this.f17422f = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.b0g, frameLayout);
            this.f17421e = this.f17420d;
        }
        View view = this.f17422f;
        LiveAlignTextView liveAlignTextView = null;
        if (view != null) {
            imageView = (ImageView) view.findViewById(R.id.ayk);
        } else {
            imageView = null;
        }
        this.f17417a = imageView;
        View view2 = this.f17422f;
        if (view2 != null) {
            textView = (TextView) view2.findViewById(R.id.a4b);
        } else {
            textView = null;
        }
        this.f17423g = textView;
        View view3 = this.f17422f;
        if (view3 != null) {
            textView2 = (TextView) view3.findViewById(R.id.a4d);
        } else {
            textView2 = null;
        }
        this.f17424h = textView2;
        View view4 = this.f17422f;
        if (view4 != null) {
            liveAlignTextView = (LiveAlignTextView) view4.findViewById(R.id.a42);
        }
        this.f17425i = liveAlignTextView;
        this.f17426j = Typeface.DEFAULT_BOLD;
    }
}
