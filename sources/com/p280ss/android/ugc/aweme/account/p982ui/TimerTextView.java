package com.p280ss.android.ugc.aweme.account.p982ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.account.R$styleable;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f.C21867a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.ui.TimerTextView */
public final class TimerTextView extends DmtTextView implements C21867a {

    /* renamed from: b */
    public static final C22273a f59501b = new C22273a(null);

    /* renamed from: c */
    private C21867a f59502c;

    /* renamed from: d */
    private C21866f f59503d;

    /* renamed from: e */
    private long f59504e;

    /* renamed from: f */
    private long f59505f;

    /* renamed from: g */
    private String f59506g;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.TimerTextView$a */
    public static final class C22273a {
        private C22273a() {
        }

        public /* synthetic */ C22273a(C7571f fVar) {
            this();
        }
    }

    public TimerTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo1061a() {
        C21867a aVar = this.f59502c;
        if (aVar != null) {
            aVar.mo57827a();
        }
    }

    /* renamed from: b */
    public final void mo57828b() {
        C21867a aVar = this.f59502c;
        if (aVar != null) {
            aVar.mo57828b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C21866f fVar = this.f59503d;
        if (fVar != null) {
            fVar.mo58291a(null);
        }
        this.f59502c = null;
    }

    /* renamed from: c */
    public final C21866f mo58722c() {
        if (this.f59503d == null) {
            TimerTextView timerTextView = this;
            C21866f fVar = new C21866f(timerTextView.f59504e, timerTextView.f59505f, timerTextView);
            timerTextView.f59503d = fVar;
        }
        C21866f fVar2 = this.f59503d;
        if (fVar2 == null) {
            C7573i.m23580a();
        }
        fVar2.mo58292b();
        C21866f fVar3 = this.f59503d;
        if (fVar3 == null) {
            C7573i.m23580a();
        }
        return fVar3;
    }

    public final void setCallback(C21867a aVar) {
        C7573i.m23587b(aVar, "listener");
        this.f59502c = aVar;
    }

    /* renamed from: a */
    public final void mo58177a(long j) {
        String str = this.f59506g;
        if (str == null) {
            C7573i.m23580a();
        }
        m73836a(j, str);
        C21867a aVar = this.f59502c;
        if (aVar != null) {
            aVar.mo58177a(j);
        }
    }

    /* renamed from: a */
    public final void mo58721a(C21866f fVar) {
        C7573i.m23587b(fVar, "timer");
        this.f59503d = fVar;
        if (fVar.mo58295e()) {
            mo1061a();
            fVar.mo58291a(this);
            return;
        }
        fVar.mo58292b();
    }

    /* renamed from: a */
    private final void m73836a(long j, String str) {
        StringBuilder sb = new StringBuilder(String.valueOf(j / 1000));
        sb.append(str);
        setText(sb.toString());
    }

    public TimerTextView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TimerTextView);
        this.f59504e = (long) obtainStyledAttributes.getInteger(0, 60000);
        String string = obtainStyledAttributes.getString(1);
        if (string == null) {
            string = "";
        }
        this.f59506g = string;
        obtainStyledAttributes.recycle();
        this.f59505f = 1000;
    }

    /* renamed from: a */
    public final void mo58720a(long j, long j2, String str) {
        C7573i.m23587b(str, "suffix");
        mo58719a(60000, 60000, 1000, str);
    }

    /* renamed from: a */
    public final void mo58719a(long j, long j2, long j3, String str) {
        C7573i.m23587b(str, "suffix");
        this.f59506g = str;
        this.f59504e = j2;
        this.f59505f = j3;
        m73836a(j, str);
    }

    public /* synthetic */ TimerTextView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 4) != 0) {
            i = 16842884;
        }
        this(context, attributeSet, i);
    }
}
