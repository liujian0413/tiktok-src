package com.bytedance.android.livesdk.chatroom.p204a.p206b;

import android.graphics.Path;
import com.p280ss.ugc.live.barrage.BarrageCopyOnWriteArrayList;
import com.p280ss.ugc.live.barrage.p1824a.C46187a;
import com.p280ss.ugc.live.barrage.p1825b.C46198a;
import com.p280ss.ugc.live.barrage.view.BarrageLayout;
import java.util.ArrayList;
import java.util.Random;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.b.a */
public final class C4236a extends C46198a {

    /* renamed from: a */
    public static final C4237a f12377a = new C4237a(null);

    /* renamed from: j */
    private final ArrayList<C4238b> f12378j = new ArrayList<>();

    /* renamed from: k */
    private final Random f12379k = new Random();

    /* renamed from: l */
    private float f12380l = 1.0f;

    /* renamed from: m */
    private final BarrageLayout f12381m;

    /* renamed from: n */
    private final int f12382n = 1400;

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.b.a$a */
    public static final class C4237a {
        private C4237a() {
        }

        public /* synthetic */ C4237a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo11797a() {
        mo114150d();
        for (C4238b a : this.f12378j) {
            a.mo11797a();
        }
        super.mo11797a();
    }

    /* renamed from: b */
    public final int mo11801b() {
        int b = super.mo11801b();
        for (C4238b b2 : this.f12378j) {
            b += b2.mo11801b();
        }
        return b;
    }

    /* renamed from: a */
    public final void mo11800a(C46187a aVar) {
        C7573i.m23587b(aVar, "barrage");
        mo114149c();
    }

    /* renamed from: a */
    public final void mo11798a(Path path) {
        C7573i.m23587b(path, "path");
        C4238b bVar = new C4238b(this.f12381m, path, this.f12382n);
        this.f12378j.add(bVar);
        this.f12381m.m145112a(bVar, this.f12381m.f118801a.size());
    }

    public C4236a(BarrageLayout barrageLayout, int i) {
        C7573i.m23587b(barrageLayout, "barrageView");
        super(barrageLayout);
        this.f12381m = barrageLayout;
    }

    /* renamed from: a */
    public final void mo11799a(BarrageCopyOnWriteArrayList barrageCopyOnWriteArrayList, float f) {
        C7573i.m23587b(barrageCopyOnWriteArrayList, "runBarrageList");
        this.f12380l += f / ((float) this.f12382n);
        if (this.f12380l > 0.32f) {
            C46187a e = mo114151e();
            if (e != null) {
                ((C4238b) this.f12378j.get(this.f12379k.nextInt(this.f12378j.size()))).mo114146a(e, false);
            }
            this.f12380l = 0.0f;
        }
    }
}
