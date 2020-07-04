package com.p280ss.android.ugc.aweme.emoji.smallemoji;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.p280ss.android.ugc.aweme.emoji.base.C27517a;
import com.p280ss.android.ugc.aweme.emoji.base.C27518b;
import com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27606a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.smallemoji.c */
public final class C27611c extends C27518b {

    /* renamed from: b */
    protected int f72772b;

    /* renamed from: c */
    private Context f72773c;

    /* renamed from: d */
    private C27606a f72774d;

    /* renamed from: a */
    public final int mo70715a() {
        return -1;
    }

    /* renamed from: g */
    public final int mo70733g() {
        return 20;
    }

    /* renamed from: j */
    public final int mo70734j() {
        m90518l();
        return this.f72772b;
    }

    /* renamed from: l */
    private void m90518l() {
        if (this.f72772b == 0) {
            this.f72772b = this.f72774d.mo70928a();
        }
    }

    /* renamed from: c */
    public final Drawable mo70731c() {
        return this.f72774d.mo70929a(this.f72773c);
    }

    /* renamed from: f */
    public final int mo70719f() {
        m90518l();
        if (this.f72772b == 0) {
            return 1;
        }
        return ((this.f72772b - 1) / 20) + 1;
    }

    /* renamed from: k */
    public final String mo70722k() {
        return String.valueOf(mo70721i());
    }

    public C27611c(Context context) {
        this.f72774d = C27606a.m90489b(context);
        this.f72773c = context;
    }

    /* renamed from: b */
    public final List<C27517a> mo70716b(int i) {
        List<C27517a> a = this.f72774d.mo70931a(i * 20, 20);
        C27517a aVar = new C27517a();
        aVar.f72556a = R.drawable.zz;
        a.add(aVar);
        return a;
    }
}
