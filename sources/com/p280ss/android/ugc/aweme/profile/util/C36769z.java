package com.p280ss.android.ugc.aweme.profile.util;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.util.z */
public final class C36769z implements C36768y {

    /* renamed from: a */
    public static final int f96493a = ((int) C9738o.m28708b(C6399b.m19921a(), 4.0f));

    /* renamed from: c */
    private static final int f96494c = ((int) C9738o.m28708b(C6399b.m19921a(), 20.0f));

    /* renamed from: d */
    private static final int f96495d = ((int) C9738o.m28708b(C6399b.m19921a(), 5.0f));

    /* renamed from: b */
    int f96496b;

    /* renamed from: e */
    private final Context f96497e;

    /* renamed from: f */
    private final LinearLayout f96498f;

    /* renamed from: g */
    private boolean f96499g;

    /* renamed from: h */
    private OnClickListener f96500h;

    /* renamed from: i */
    private OnClickListener f96501i;

    /* renamed from: j */
    private OnClickListener f96502j;

    /* renamed from: k */
    private OnClickListener f96503k;

    /* renamed from: l */
    private boolean f96504l;

    /* renamed from: m */
    private boolean f96505m;

    /* renamed from: com.ss.android.ugc.aweme.profile.util.z$a */
    static class C36772a {

        /* renamed from: a */
        int f96510a;

        /* renamed from: b */
        TextView f96511b;
    }

    /* renamed from: a */
    public final void mo93098a(OnClickListener onClickListener) {
        this.f96500h = onClickListener;
    }

    /* renamed from: b */
    public final void mo93100b(OnClickListener onClickListener) {
        this.f96501i = onClickListener;
    }

    /* renamed from: c */
    public final void mo93101c(OnClickListener onClickListener) {
        this.f96502j = onClickListener;
    }

    /* renamed from: d */
    public final void mo93102d(OnClickListener onClickListener) {
        this.f96503k = onClickListener;
    }

    public C36769z(LinearLayout linearLayout) {
        this(linearLayout, Integer.MAX_VALUE);
    }

    /* renamed from: b */
    private static List<C36772a> m118522b(User user) {
        return new ArrayList();
    }

    /* renamed from: c */
    private static List<C36772a> m118523c(User user) {
        return new ArrayList();
    }

    /* renamed from: a */
    public final void mo93099a(User user) {
        List list;
        this.f96498f.removeAllViews();
        if (user != null) {
            if (C6861a.m21332a().userService().isMe(user.getUid())) {
                list = m118522b(user);
            } else {
                list = m118523c(user);
            }
            Collections.sort(list, new Comparator<C36772a>() {
                /* renamed from: a */
                private static int m118529a(C36772a aVar, C36772a aVar2) {
                    return aVar.f96510a - aVar2.f96510a;
                }

                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return m118529a((C36772a) obj, (C36772a) obj2);
                }
            });
            for (int i = 0; i < list.size(); i++) {
                C36772a aVar = (C36772a) list.get(i);
                LayoutParams layoutParams = new LayoutParams(-2, f96494c);
                if (i > 0) {
                    layoutParams.leftMargin = f96493a;
                }
                if (this.f96499g && VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(f96493a);
                }
                this.f96498f.addView(aVar.f96511b, layoutParams);
            }
            this.f96498f.invalidate();
        }
    }

    public C36769z(LinearLayout linearLayout, int i) {
        this(linearLayout, i, false);
    }

    private C36769z(LinearLayout linearLayout, int i, boolean z) {
        this(linearLayout, i, false, true);
    }

    public C36769z(final LinearLayout linearLayout, final int i, boolean z, boolean z2) {
        this.f96496b = Integer.MAX_VALUE;
        this.f96505m = true;
        this.f96504l = z;
        this.f96505m = z2;
        this.f96497e = linearLayout.getContext();
        this.f96498f = linearLayout;
        this.f96496b = i;
        if (i < Integer.MAX_VALUE) {
            this.f96498f.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    int childCount = linearLayout.getChildCount() - 1;
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (i >= linearLayout.getChildCount()) {
                            break;
                        }
                        i2 += ((TextView) linearLayout.getChildAt(i)).getMeasuredWidth();
                        if (i > 0) {
                            i2 += C36769z.f96493a;
                        }
                        if (i2 >= i) {
                            childCount = i - 1;
                            break;
                        }
                        i++;
                    }
                    while (true) {
                        childCount++;
                        if (childCount < linearLayout.getChildCount()) {
                            linearLayout.removeViewAt(childCount);
                        } else {
                            linearLayout.invalidate();
                            return;
                        }
                    }
                }
            });
            this.f96499g = C43127fh.m136806a(linearLayout.getContext());
        }
    }
}
