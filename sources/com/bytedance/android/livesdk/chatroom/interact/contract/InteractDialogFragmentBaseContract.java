package com.bytedance.android.livesdk.chatroom.interact.contract;

import android.arch.lifecycle.Lifecycle.Event;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.core.rxutils.C3296e;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.autodispose.C3233a;
import com.bytedance.android.live.core.rxutils.autodispose.C3246ae;
import com.bytedance.android.live.core.rxutils.autodispose.C3255e;
import com.bytedance.android.live.core.rxutils.autodispose.C3274m;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.contract.C4520b.C4522b;

public final class InteractDialogFragmentBaseContract {

    public static abstract class View<T extends C4508a> extends BaseFragment {

        /* renamed from: a */
        public C4522b f13116a;

        /* renamed from: b */
        public final String f13117b = getClass().getSimpleName();

        /* renamed from: c */
        public T f13118c;

        /* renamed from: d */
        protected final LinkCrossRoomDataHolder f13119d = LinkCrossRoomDataHolder.m13782a();

        /* renamed from: b */
        public abstract String mo12279b();

        /* renamed from: c */
        public abstract float mo12280c();

        /* renamed from: d */
        public android.view.View mo12281d() {
            return null;
        }

        /* renamed from: e */
        public android.view.View mo12282e() {
            return null;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public final <S> C3274m<S> mo12283f() {
            return C3255e.m12293a(this.f13116a.mo12153d());
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final <R> C3274m<R> mo12284g() {
            return C3255e.m12298a((C3246ae) C3233a.m12259a(this.f13116a.mo12153d(), Event.ON_DESTROY), (C3296e<T>) C3303k.m12366a());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract$a */
    public static abstract class C4508a<V extends View> {

        /* renamed from: a */
        final String f13120a = getClass().getSimpleName();

        /* renamed from: b */
        protected V f13121b;

        /* renamed from: c */
        protected final LinkCrossRoomDataHolder f13122c = LinkCrossRoomDataHolder.m13782a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final <S> C3274m<S> mo12285a() {
            return this.f13121b.mo12283f();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final <R> C3274m<R> mo12287b() {
            return this.f13121b.mo12284g();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo12286a(Throwable th) {
            C3166a.m11955a(6, this.f13120a, th.getStackTrace());
        }

        public C4508a(V v) {
            this.f13121b = v;
        }
    }
}
