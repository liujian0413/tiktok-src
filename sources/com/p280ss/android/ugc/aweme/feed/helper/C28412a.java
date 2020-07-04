package com.p280ss.android.ugc.aweme.feed.helper;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41842b.C41843a;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.a */
public final class C28412a {

    /* renamed from: a */
    protected static int f74863a;

    /* renamed from: b */
    protected static int f74864b;

    /* renamed from: e */
    private static int f74865e;

    /* renamed from: f */
    private static int f74866f;

    /* renamed from: g */
    private static int f74867g;

    /* renamed from: c */
    public int f74868c = -1;

    /* renamed from: d */
    public int f74869d = -1;

    /* renamed from: a */
    public static int m93381a() {
        return f74865e;
    }

    /* renamed from: b */
    public static int m93390b() {
        return f74866f;
    }

    /* renamed from: a */
    public final void mo72145a(Context context, Aweme aweme, View view, View view2) {
        if (aweme == null) {
            C6921a.m21554a((Exception) new NullPointerException("aweme is null"));
        } else if (aweme.isVr()) {
            m93394b(view, -1, -1);
            m93394b(view2, -1, -1);
        } else if (aweme.getVideo() != null) {
            mo72147a(context, aweme.getVideo(), view, view2);
        }
    }

    /* renamed from: a */
    public final void mo72147a(Context context, Video video, View view, View view2) {
        if (video != null) {
            if (C21085a.m71129c()) {
                StringBuilder sb = new StringBuilder("use V2 adaption, video width is ");
                sb.append(video.getWidth());
                sb.append(", height is ");
                sb.append(video.getHeight());
                C6921a.m21563c(3, "FeedAllScreenHelper", sb.toString());
                m93392b(context, view, video.getWidth(), video.getHeight(), true);
                m93392b(context, view2, video.getWidth(), video.getHeight(), true);
                return;
            }
            StringBuilder sb2 = new StringBuilder("use V1 adaption, video width is ");
            sb2.append(video.getWidth());
            sb2.append(", height is ");
            sb2.append(video.getHeight());
            C6921a.m21563c(3, "FeedAllScreenHelper", sb2.toString());
            m93383a(context, view, video.getWidth(), video.getHeight(), true);
            m93383a(context, view2, video.getWidth(), video.getHeight(), true);
        }
    }

    /* renamed from: a */
    public final void mo72146a(Context context, Video video, View view) {
        if (video != null) {
            if (C21085a.m71129c()) {
                m93392b(context, view, video.getWidth(), video.getHeight(), true);
                return;
            }
            m93383a(context, view, video.getWidth(), video.getHeight(), true);
        }
    }

    /* renamed from: c */
    public final void mo72148c() {
        this.f74869d = -1;
        this.f74868c = -1;
    }

    /* renamed from: e */
    private int m93397e() {
        return m93398f() - C21085a.m71117a().f56616c;
    }

    /* renamed from: d */
    private int m93396d() {
        return (m93398f() - C21085a.m71117a().mo56926b()) - C21085a.m71117a().f56618e;
    }

    /* renamed from: f */
    private static int m93398f() {
        if (VERSION.SDK_INT < 28 || !C21085a.m71117a().f56623j) {
            return f74867g;
        }
        return f74864b;
    }

    /* renamed from: a */
    public static void m93382a(Context context) {
        try {
            f74865e = C9738o.m28717e(context);
            f74866f = C23482j.m77103e();
            m93391b(context);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static void m93391b(Context context) {
        if (VERSION.SDK_INT >= 17) {
            Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f74867g = displayMetrics.heightPixels;
            f74864b = displayMetrics.heightPixels + f74865e;
            f74863a = displayMetrics.widthPixels;
            return;
        }
        int b = C9738o.m28709b(context);
        f74867g = b;
        f74864b = b;
        f74863a = C9738o.m28691a(context);
    }

    /* renamed from: a */
    public final C41843a mo72144a(Context context, Video video) {
        if (video == null) {
            return null;
        }
        C41843a aVar = new C41843a(video.getWidth(), video.getHeight());
        View view = new View(context);
        view.setLayoutParams(new MarginLayoutParams(0, 0));
        if (C21085a.m71129c()) {
            m93393b(context, view, video.getWidth(), video.getHeight(), true, aVar);
        } else {
            m93384a(context, view, video.getWidth(), video.getHeight(), true, aVar);
        }
        return aVar;
    }

    /* renamed from: a */
    private static void m93385a(View view, int i, int i2) {
        if (view != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
            StringBuilder sb = new StringBuilder("final resizeView, width:");
            sb.append(i2);
            sb.append(",height:");
            sb.append(i);
            C6921a.m21563c(3, "FeedAllScreenHelper", sb.toString());
            if (marginLayoutParams.width != i2 || marginLayoutParams.height != i || VERSION.SDK_INT < 19) {
                marginLayoutParams.width = i2;
                marginLayoutParams.height = i;
                view.setLayoutParams(marginLayoutParams);
                view.setRotation(0.0f);
            }
        }
    }

    /* renamed from: b */
    private static void m93394b(View view, int i, int i2) {
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new LayoutParams(0, 0));
        }
        if (view.getLayoutParams().width != -1 || view.getLayoutParams().height != -1) {
            view.getLayoutParams().width = -1;
            view.getLayoutParams().height = -1;
            view.requestLayout();
        }
    }

    /* renamed from: a */
    public static boolean m93389a(int i, int i2, int i3, int i4) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) i3;
        double d5 = (double) i4;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = d4 / d5;
        try {
            double parseDouble = Double.parseDouble(C1642a.m8034a("%.2f", new Object[]{Double.valueOf(d3)}));
            double parseDouble2 = Double.parseDouble(C1642a.m8034a("%.2f", new Object[]{Double.valueOf(d6)}));
            if (d3 <= 0.0d || parseDouble2 <= 0.0d || parseDouble == parseDouble2) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    private void m93387a(View view, int i, int i2, boolean z, int i3) {
        m93385a(view, i, i2);
    }

    /* renamed from: a */
    private void m93383a(Context context, View view, int i, int i2, boolean z) {
        m93384a(context, view, i, i2, true, (C41843a) null);
    }

    /* renamed from: b */
    private void m93392b(Context context, View view, int i, int i2, boolean z) {
        m93393b(context, view, i, i2, true, null);
    }

    /* renamed from: a */
    private void m93386a(View view, int i, int i2, int i3, int i4, C41843a aVar) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        if (d / d2 > 1.0d) {
            if (i <= 0 || i2 <= 0) {
                i4 = i3;
            } else {
                i4 = (i2 * i3) / i;
            }
        } else if (i <= 0 || i2 <= 0) {
            i3 = i4;
        } else {
            i3 = (i * i4) / i2;
        }
        if (aVar != null) {
            aVar.f108837a = i3;
            aVar.f108838b = i4;
        }
        m93385a(view, i4, i3);
    }

    /* renamed from: b */
    private void m93393b(Context context, View view, int i, int i2, boolean z, C41843a aVar) {
        if (VERSION.SDK_INT >= 17) {
            if (f74864b == 0 || f74863a == 0) {
                m93391b(context);
            }
            int i3 = C21085a.m71117a().f56619f;
            double d = (double) f74863a;
            double d2 = (double) f74864b;
            Double.isNaN(d);
            Double.isNaN(d2);
            if (d / d2 <= 0.5d) {
                m93395b(view, i, i2, z, i3, f74863a, aVar);
                return;
            }
            double d3 = (double) f74863a;
            double d4 = (double) f74864b;
            Double.isNaN(d3);
            Double.isNaN(d4);
            if (d3 / d4 >= 0.6666666666666666d) {
                m93386a(view, i, i2, f74863a, f74864b, aVar);
                return;
            }
            m93388a(view, i, i2, z, i3, f74863a, aVar);
        }
    }

    /* renamed from: a */
    private void m93384a(Context context, View view, int i, int i2, boolean z, C41843a aVar) {
        int i3;
        if (VERSION.SDK_INT >= 17) {
            if (f74864b == 0 || f74863a == 0) {
                m93391b(context);
            }
            double d = (double) f74863a;
            double d2 = (double) f74864b;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            int i4 = 0;
            if (d3 <= 0.5d) {
                if (C21085a.m71117a().f56617d != 0) {
                    i3 = C21085a.m71117a().f56619f;
                    if (i3 == 0) {
                        i3 = m93398f() - C21085a.m71117a().f56616c;
                    } else {
                        i4 = 1;
                    }
                } else if (C21085a.m71117a().f56622i) {
                    i3 = m93396d();
                } else {
                    i3 = m93397e();
                }
                if (i4 == 0 && !C21085a.m71117a().f56620g) {
                    i3 -= C21085a.m71117a().f56617d;
                }
                m93395b(view, i, i2, z, i3, f74863a, aVar);
            } else if (d3 >= 0.6666666666666666d) {
                m93386a(view, i, i2, f74863a, f74864b, aVar);
            } else {
                int i5 = f74867g;
                if (C21085a.m71117a().f56622i) {
                    i4 = C21085a.m71117a().mo56926b();
                }
                m93388a(view, i, i2, z, (i5 - i4) - C21085a.m71117a().f56616c, f74863a, aVar);
            }
        }
    }

    /* renamed from: a */
    private void m93388a(View view, int i, int i2, boolean z, int i3, int i4, C41843a aVar) {
        int i5;
        int i6;
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) i4;
        double d5 = (double) i3;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = d4 / d5;
        if (d3 > 0.5625d || d6 > 0.5625d || d3 < 0.4699999988079071d) {
            if (i <= 0 || i2 <= 0) {
                i6 = i4;
            } else {
                i6 = (i2 * i4) / i;
            }
            i5 = i6;
        } else {
            if (i <= 0 || i2 <= 0) {
                i4 = i3;
            } else {
                i4 = (i * i3) / i2;
            }
            i5 = i3;
        }
        int i7 = i4;
        if (aVar != null) {
            aVar.f108837a = i7;
            aVar.f108838b = i5;
        }
        if (view != null) {
            m93387a(view, i5, i7, z, i3);
        }
    }

    /* renamed from: b */
    private void m93395b(View view, int i, int i2, boolean z, int i3, int i4, C41843a aVar) {
        int i5;
        int i6;
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) i4;
        double d5 = (double) i3;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = d4 / d5;
        if (d3 > 0.625d || d6 > 0.625d || d3 < 0.4699999988079071d) {
            if (i <= 0 || i2 <= 0) {
                i6 = i4;
            } else {
                i6 = (i2 * i4) / i;
            }
            i5 = i6;
        } else {
            if (i <= 0 || i2 <= 0) {
                i4 = i3;
            } else {
                i4 = (i * i3) / i2;
            }
            i5 = i3;
        }
        int i7 = i4;
        if (aVar != null) {
            aVar.f108837a = i7;
            aVar.f108838b = i5;
            this.f74868c = i5;
            this.f74869d = i7;
        }
        if (view != null) {
            m93387a(view, i5, i7, z, i3);
        }
    }
}
