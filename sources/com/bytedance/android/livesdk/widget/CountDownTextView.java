package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public final class CountDownTextView extends TextView {

    /* renamed from: a */
    public C9192a f24994a;

    /* renamed from: b */
    private C7321c f24995b;

    /* renamed from: com.bytedance.android.livesdk.widget.CountDownTextView$a */
    public static abstract class C9192a {
        /* renamed from: a */
        public static void m27344a(TextView textView, long j) {
            C7573i.m23587b(textView, "view");
        }

        /* renamed from: b */
        public static void m27345b(TextView textView) {
            C7573i.m23587b(textView, "view");
        }

        /* renamed from: a */
        public void mo21173a(TextView textView) {
            C7573i.m23587b(textView, "view");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.CountDownTextView$b */
    static final class C9193b<T> implements C7326g<Long> {

        /* renamed from: a */
        final /* synthetic */ CountDownTextView f24996a;

        /* renamed from: b */
        final /* synthetic */ int f24997b;

        /* renamed from: c */
        final /* synthetic */ long f24998c;

        /* renamed from: d */
        final /* synthetic */ long f24999d;

        C9193b(CountDownTextView countDownTextView, int i, long j, long j2) {
            this.f24996a = countDownTextView;
            this.f24997b = i;
            this.f24998c = j;
            this.f24999d = j2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Long l) {
            if (!(l == null || l.longValue() != 0 || this.f24996a.f24994a == null)) {
                C9192a.m27345b(this.f24996a);
            }
            CountDownTextView countDownTextView = this.f24996a;
            Resources resources = this.f24996a.getResources();
            int i = this.f24997b;
            long j = this.f24998c;
            C7573i.m23582a((Object) l, "aLong");
            countDownTextView.setText(resources.getString(i, new Object[]{C9048ao.m27017a(j - l.longValue())}));
            if (this.f24996a.f24994a != null) {
                C9192a.m27344a(this.f24996a, this.f24998c - l.longValue());
            }
            if (l.longValue() == this.f24998c - this.f24999d) {
                C9192a aVar = this.f24996a.f24994a;
                if (aVar != null) {
                    aVar.mo21173a(this.f24996a);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.CountDownTextView$c */
    static final class C9194c<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C9194c f25000a = new C9194c();

        C9194c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    public CountDownTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CountDownTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C7321c cVar = this.f24995b;
        if (cVar != null && !cVar.isDisposed()) {
            C7321c cVar2 = this.f24995b;
            if (cVar2 != null) {
                cVar2.dispose();
            }
        }
    }

    public final void setCountDownListener(C9192a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f24994a = aVar;
    }

    public CountDownTextView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo22433a(int i, long j, long j2) {
        long j3 = (j - 0) + 1;
        if (j3 > 0) {
            C7492s a = C9057b.m27050a(0, 1, TimeUnit.SECONDS).mo19305c(j3).mo19294a(C47549a.m148327a());
            C9193b bVar = new C9193b(this, R.string.et7, j, 0);
            this.f24995b = a.mo19280a((C7326g<? super T>) bVar, (C7326g<? super Throwable>) C9194c.f25000a);
        }
    }

    public /* synthetic */ CountDownTextView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
