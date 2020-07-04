package com.bytedance.lobby.internal;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import com.bytedance.lobby.C12191a;
import com.bytedance.lobby.C12203b;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class BaseProvider<T> extends BaseViewModel<T> implements C12221b {

    /* renamed from: b */
    public C12203b f32494b;

    /* renamed from: c */
    private final AtomicBoolean f32495c = new AtomicBoolean();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo29949e();

    /* renamed from: f */
    public final C12203b mo29957f() {
        return this.f32494b;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ LiveData mo29959h() {
        return super.mo29959h();
    }

    /* renamed from: g */
    public final void mo29958g() {
        if (this.f32495c.compareAndSet(false, true)) {
            if (C12191a.f32435a) {
                StringBuilder sb = new StringBuilder("Initializing ");
                sb.append(this.f32494b.f32466b);
                sb.append(" (lazy)");
            }
            mo29949e();
        }
    }

    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo29951d() {
        /*
            r4 = this;
            com.bytedance.lobby.b r0 = r4.f32494b
            java.lang.String r0 = r0.f32466b
            int r1 = r0.hashCode()
            r2 = 1
            r3 = 0
            switch(r1) {
                case -1240244679: goto L_0x004a;
                case -916346253: goto L_0x0040;
                case 3765: goto L_0x0036;
                case 3321844: goto L_0x002c;
                case 28903346: goto L_0x0022;
                case 486515695: goto L_0x0018;
                case 497130182: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0054
        L_0x000e:
            java.lang.String r1 = "facebook"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 0
            goto L_0x0055
        L_0x0018:
            java.lang.String r1 = "kakaotalk"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 5
            goto L_0x0055
        L_0x0022:
            java.lang.String r1 = "instagram"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 3
            goto L_0x0055
        L_0x002c:
            java.lang.String r1 = "line"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 2
            goto L_0x0055
        L_0x0036:
            java.lang.String r1 = "vk"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 6
            goto L_0x0055
        L_0x0040:
            java.lang.String r1 = "twitter"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 4
            goto L_0x0055
        L_0x004a:
            java.lang.String r1 = "google"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0054
            r0 = 1
            goto L_0x0055
        L_0x0054:
            r0 = -1
        L_0x0055:
            switch(r0) {
                case 0: goto L_0x0069;
                case 1: goto L_0x0066;
                case 2: goto L_0x0063;
                case 3: goto L_0x0062;
                case 4: goto L_0x005f;
                case 5: goto L_0x005c;
                case 6: goto L_0x0059;
                default: goto L_0x0058;
            }
        L_0x0058:
            return r3
        L_0x0059:
            boolean r0 = com.bytedance.lobby.internal.C12227e.f32519f
            return r0
        L_0x005c:
            boolean r0 = com.bytedance.lobby.internal.C12227e.f32518e
            return r0
        L_0x005f:
            boolean r0 = com.bytedance.lobby.internal.C12227e.f32517d
            return r0
        L_0x0062:
            return r2
        L_0x0063:
            boolean r0 = com.bytedance.lobby.internal.C12227e.f32516c
            return r0
        L_0x0066:
            boolean r0 = com.bytedance.lobby.internal.C12227e.f32514a
            return r0
        L_0x0069:
            boolean r0 = com.bytedance.lobby.internal.C12227e.f32515b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.lobby.internal.BaseProvider.mo29951d():boolean");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo29956b(Object obj) {
        super.mo29956b(obj);
    }

    protected BaseProvider(Application application, C12203b bVar) {
        super(application);
        this.f32494b = bVar;
    }
}
