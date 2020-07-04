package com.p280ss.android.ugc.aweme.p1685ug.praise;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ug.praise.a */
public final class C42727a {

    /* renamed from: a */
    public static final C42727a f111027a = new C42727a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C42736c f111028b = new C42736c(true);

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.a$a */
    static final class C42728a<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ String f111029a;

        /* renamed from: b */
        final /* synthetic */ String f111030b;

        C42728a(String str, String str2) {
            this.f111029a = str;
            this.f111030b = str2;
        }

        public final /* synthetic */ Object call() {
            m135639a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m135639a() {
            Context a = C6399b.m19921a();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f111029a);
            sb.append(this.f111030b);
            C10761a.m31387a(a, sb.toString()).mo25750a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.a$b */
    static final class C42729b implements OnClickListener {

        /* renamed from: a */
        public static final C42729b f111031a = new C42729b();

        C42729b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C42727a.f111028b.mo104347c(!C42727a.f111028b.f111045f);
            C10761a.m31387a(C6399b.m19921a(), "debug 开关状态切换成功").mo25750a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ug.praise.a$c */
    static final class C42730c implements OnClickListener {

        /* renamed from: a */
        public static final C42730c f111032a = new C42730c();

        C42730c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C42727a.m135635a();
            C10761a.m31387a(C6399b.m19921a(), "清除数据成功").mo25750a();
        }
    }

    private C42727a() {
    }

    /* renamed from: a */
    public static void m135635a() {
        new C42736c(true).mo104341a();
        new C42736c(false).mo104341a();
    }

    /* renamed from: a */
    public static void m135636a(Context context) {
        C10741a aVar = new C10741a(context);
        aVar.mo25653a("好评引导弹窗测试");
        StringBuilder sb = new StringBuilder("当前debug开关状态：");
        sb.append(f111028b.f111045f);
        sb.append("\n 清除缓存数据将清除弹窗展示记录、按钮点击记录、App首次打开时间");
        aVar.mo25660b(sb.toString());
        aVar.mo25661b("重置debug开关", (OnClickListener) C42729b.f111031a);
        aVar.mo25654a("清除缓存数据", (OnClickListener) C42730c.f111032a);
        aVar.mo25656a().mo25638b();
    }

    /* renamed from: b */
    public final void mo104335b(boolean z, String str) {
        C7573i.m23587b(str, "msg");
        StringBuilder sb = new StringBuilder("tryShow But:");
        sb.append(str);
        m135637a(z, sb.toString());
    }

    /* renamed from: a */
    public static void m135637a(boolean z, String str) {
        String str2;
        C7573i.m23587b(str, "msg");
        if (f111028b.f111045f) {
            if (z) {
                str2 = "活跃度弹窗 ";
            } else {
                str2 = "点赞后弹窗 ";
            }
            C1592h.m7855a((Callable<TResult>) new C42728a<TResult>(str2, str), C1592h.f5958b);
        }
    }
}
