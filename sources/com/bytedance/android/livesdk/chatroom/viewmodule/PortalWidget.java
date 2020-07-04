package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.graphics.Color;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.C3306n;
import com.bytedance.android.live.core.setting.C3338l;
import com.bytedance.android.live.core.utils.p158a.C3342a;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.api.PortalApi;
import com.bytedance.android.livesdk.chatroom.api.PortalApi.PingType;
import com.bytedance.android.livesdk.chatroom.model.C4878ak;
import com.bytedance.android.livesdk.chatroom.model.C4879al;
import com.bytedance.android.livesdk.chatroom.model.C4880am;
import com.bytedance.android.livesdk.chatroom.model.C4881an;
import com.bytedance.android.livesdk.chatroom.model.C4882ao;
import com.bytedance.android.livesdk.chatroom.model.C4917n;
import com.bytedance.android.livesdk.chatroom.model.PortalStatsResult;
import com.bytedance.android.livesdk.chatroom.model.PortalStatsResult.C4847a;
import com.bytedance.android.livesdk.chatroom.model.p219a.C4860k;
import com.bytedance.android.livesdk.chatroom.widget.AnimationLayer;
import com.bytedance.android.livesdk.chatroom.widget.C5786ai;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.message.model.C8522bp;
import com.bytedance.android.livesdk.message.model.C8522bp.C8523a;
import com.bytedance.android.livesdk.message.model.C8522bp.C8524b;
import com.bytedance.android.livesdk.message.model.C8522bp.C8526d;
import com.bytedance.android.livesdk.p427v.C9097a;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.user.C8984e;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.bytedance.android.livesdk.viewmodel.C9145h;
import com.bytedance.android.livesdk.viewmodel.C9145h.C9146a;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p280ss.ugc.live.sdk.message.data.IMessage;
import com.p280ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p280ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.p356e.C7551d;
import kotlin.reflect.C7585d;
import kotlin.text.C7634n;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

public final class PortalWidget extends LiveRecyclableWidget implements OnMessageListener {

    /* renamed from: f */
    public static C4879al f16348f;

    /* renamed from: g */
    public static final C5503a f16349g = new C5503a(null);

    /* renamed from: a */
    public Room f16350a;

    /* renamed from: b */
    public User f16351b;

    /* renamed from: c */
    public boolean f16352c;

    /* renamed from: d */
    public boolean f16353d;

    /* renamed from: e */
    public C9145h f16354e;

    /* renamed from: h */
    private C47562b f16355h = new C47562b();

    /* renamed from: i */
    private C47562b f16356i = new C47562b();

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$a */
    public static final class C5503a {
        private C5503a() {
        }

        public /* synthetic */ C5503a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m17785a(int i) {
            int i2 = i / 60;
            int i3 = i % 60;
            StringBuilder sb = new StringBuilder();
            sb.append(C7634n.m23737a(String.valueOf(i2), 2, '0'));
            sb.append(':');
            sb.append(C7634n.m23737a(String.valueOf(i3), 2, '0'));
            return sb.toString();
        }

        /* renamed from: b */
        public static String m17787b(int i) {
            if (i < 1000) {
                String a = C1642a.m8034a("%d人", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                C7573i.m23582a((Object) a, "java.lang.String.format(this, *args)");
                return a;
            }
            String a2 = C1642a.m8034a("%.1fk人", Arrays.copyOf(new Object[]{Float.valueOf(((float) i) / 1000.0f)}, 1));
            C7573i.m23582a((Object) a2, "java.lang.String.format(this, *args)");
            return a2;
        }

        /* renamed from: a */
        public static String m17786a(String str) {
            C7573i.m23587b(str, "s");
            if (str.length() <= 4) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C7634n.m23741a(str, C7551d.m23565b(0, 3)));
            sb.append("…");
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$b */
    static final class C5504b<T> implements C7326g<C3479d<PortalStatsResult>> {

        /* renamed from: a */
        final /* synthetic */ PortalWidget f16357a;

        /* renamed from: b */
        final /* synthetic */ User f16358b;

        /* renamed from: c */
        final /* synthetic */ C9145h f16359c;

        /* renamed from: d */
        final /* synthetic */ Room f16360d;

        C5504b(PortalWidget portalWidget, User user, C9145h hVar, Room room) {
            this.f16357a = portalWidget;
            this.f16358b = user;
            this.f16359c = hVar;
            this.f16360d = room;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
            if (r9 == null) goto L_0x000c;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(com.bytedance.android.live.network.response.C3479d<com.bytedance.android.livesdk.chatroom.model.PortalStatsResult> r9) {
            /*
                r8 = this;
                if (r9 == 0) goto L_0x000c
                java.lang.Object r9 = r9.data
                com.bytedance.android.livesdk.chatroom.model.PortalStatsResult r9 = (com.bytedance.android.livesdk.chatroom.model.PortalStatsResult) r9
                if (r9 == 0) goto L_0x000c
                java.util.List<com.bytedance.android.livesdk.chatroom.model.PortalStatsResult$a> r9 = r9.f13833a
                if (r9 != 0) goto L_0x0010
            L_0x000c:
                java.util.List r9 = kotlin.collections.C7525m.m23461a()
            L_0x0010:
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget r0 = r8.f16357a
                boolean r0 = r0.f16352c
                com.bytedance.android.live.base.model.user.User r1 = r8.f16358b
                long r1 = r1.getId()
                java.util.List r9 = com.bytedance.android.livesdk.viewmodel.C9145h.C9146a.m27222a(r9, r0, r1)
                java.util.Collection r9 = (java.util.Collection) r9
                boolean r9 = r9.isEmpty()
                r9 = r9 ^ 1
                if (r9 == 0) goto L_0x0047
                com.bytedance.android.livesdk.viewmodel.h r9 = r8.f16359c
                com.bytedance.android.livesdk.chatroom.model.am r7 = new com.bytedance.android.livesdk.chatroom.model.am
                com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r8.f16360d
                long r1 = r0.getId()
                com.bytedance.android.live.base.model.user.User r0 = r8.f16358b
                long r3 = r0.getId()
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget r0 = r8.f16357a
                boolean r5 = r0.f16352c
                com.bytedance.android.live.base.model.user.User r6 = r8.f16358b
                r0 = r7
                r0.<init>(r1, r3, r5, r6)
                com.bytedance.android.livesdk.chatroom.model.n r7 = (com.bytedance.android.livesdk.chatroom.model.C4917n) r7
                r9.mo22348a(r7)
            L_0x0047:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.C5504b.accept(com.bytedance.android.live.network.response.d):void");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$c */
    static final class C5505c<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C5505c f16361a = new C5505c();

        C5505c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m17789a((Throwable) obj);
        }

        /* renamed from: a */
        private static void m17789a(Throwable th) {
            C8444d.m25673b();
            C7573i.m23582a((Object) th, "t");
            C8444d.m11969a(5, th.getStackTrace());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$d */
    static final class C5506d<T> implements C7326g<C5704er> {

        /* renamed from: a */
        final /* synthetic */ PortalWidget f16362a;

        C5506d(PortalWidget portalWidget) {
            this.f16362a = portalWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C5704er erVar) {
            if (this.f16362a.f16353d) {
                erVar.f16796a.invoke(this.f16362a.f16354e, this.f16362a.f16350a);
            } else {
                erVar.f16796a.invoke(null, null);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$e */
    static final class C5507e<T> implements C7326g<IUser> {

        /* renamed from: a */
        final /* synthetic */ PortalWidget f16363a;

        C5507e(PortalWidget portalWidget) {
            this.f16363a = portalWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(IUser iUser) {
            this.f16363a.f16351b = User.from(iUser);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$f */
    static final class C5508f<T> implements C7326g<Pair<? extends C4917n, ? extends C4917n>> {

        /* renamed from: a */
        final /* synthetic */ C9145h f16364a;

        /* renamed from: b */
        final /* synthetic */ PortalWidget f16365b;

        C5508f(C9145h hVar, PortalWidget portalWidget) {
            this.f16364a = hVar;
            this.f16365b = portalWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Pair<? extends C4917n, ? extends C4917n> pair) {
            C4917n nVar = (C4917n) pair.component1();
            C4917n nVar2 = (C4917n) pair.component2();
            PortalWidget portalWidget = this.f16365b;
            C9145h hVar = this.f16364a;
            View view = this.f16365b.contentView;
            if (view != null) {
                portalWidget.mo13984a(hVar, (ViewGroup) view, nVar, nVar2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$g */
    static final class C5509g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9145h f16366a;

        /* renamed from: b */
        final /* synthetic */ PortalWidget f16367b;

        C5509g(C9145h hVar, PortalWidget portalWidget) {
            this.f16366a = hVar;
            this.f16367b = portalWidget;
        }

        public final void onClick(View view) {
            this.f16367b.mo13983a(this.f16366a);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$h */
    public static final class C5510h extends C5786ai {

        /* renamed from: a */
        final /* synthetic */ View f16368a;

        /* renamed from: b */
        final /* synthetic */ C4917n f16369b;

        /* renamed from: c */
        final /* synthetic */ String f16370c;

        /* renamed from: d */
        final /* synthetic */ View f16371d;

        /* renamed from: e */
        final /* synthetic */ PortalWidget f16372e;

        /* renamed from: f */
        final /* synthetic */ ViewGroup f16373f;

        /* renamed from: g */
        final /* synthetic */ C9145h f16374g;

        /* renamed from: h */
        final /* synthetic */ C4917n f16375h;

        /* renamed from: i */
        final /* synthetic */ C4917n f16376i;

        public final void onAnimationEnd(Animator animator) {
            AnimationLayer a = this.f16372e.mo13981a();
            if (a != null) {
                a.removeView(this.f16368a);
            }
            View view = this.f16371d;
            C7573i.m23582a((Object) view, "view");
            view.setVisibility(0);
        }

        C5510h(View view, C4917n nVar, String str, View view2, PortalWidget portalWidget, ViewGroup viewGroup, C9145h hVar, C4917n nVar2, C4917n nVar3) {
            this.f16368a = view;
            this.f16369b = nVar;
            this.f16370c = str;
            this.f16371d = view2;
            this.f16372e = portalWidget;
            this.f16373f = viewGroup;
            this.f16374g = hVar;
            this.f16375h = nVar2;
            this.f16376i = nVar3;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$i */
    public static final class C5511i extends C5786ai {

        /* renamed from: a */
        final /* synthetic */ View f16377a;

        /* renamed from: b */
        final /* synthetic */ C4917n f16378b;

        /* renamed from: c */
        final /* synthetic */ View f16379c;

        /* renamed from: d */
        final /* synthetic */ PortalWidget f16380d;

        /* renamed from: e */
        final /* synthetic */ ViewGroup f16381e;

        /* renamed from: f */
        final /* synthetic */ C9145h f16382f;

        /* renamed from: g */
        final /* synthetic */ C4917n f16383g;

        /* renamed from: h */
        final /* synthetic */ C4917n f16384h;

        public final void onAnimationEnd(Animator animator) {
            AnimationLayer a = this.f16380d.mo13981a();
            if (a != null) {
                a.removeView(this.f16377a);
            }
            View view = this.f16379c;
            C7573i.m23582a((Object) view, "view");
            view.setVisibility(0);
        }

        C5511i(View view, C4917n nVar, View view2, PortalWidget portalWidget, ViewGroup viewGroup, C9145h hVar, C4917n nVar2, C4917n nVar3) {
            this.f16377a = view;
            this.f16378b = nVar;
            this.f16379c = view2;
            this.f16380d = portalWidget;
            this.f16381e = viewGroup;
            this.f16382f = hVar;
            this.f16383g = nVar2;
            this.f16384h = nVar3;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$j */
    public static final class C5512j extends C5786ai {

        /* renamed from: a */
        final /* synthetic */ View f16385a;

        /* renamed from: b */
        final /* synthetic */ C4917n f16386b;

        /* renamed from: c */
        final /* synthetic */ View f16387c;

        /* renamed from: d */
        final /* synthetic */ PortalWidget f16388d;

        /* renamed from: e */
        final /* synthetic */ ViewGroup f16389e;

        /* renamed from: f */
        final /* synthetic */ C9145h f16390f;

        /* renamed from: g */
        final /* synthetic */ C4917n f16391g;

        /* renamed from: h */
        final /* synthetic */ C4917n f16392h;

        public final void onAnimationEnd(Animator animator) {
            AnimationLayer a = this.f16388d.mo13981a();
            if (a != null) {
                a.removeView(this.f16385a);
            }
            View view = this.f16387c;
            C7573i.m23582a((Object) view, "view");
            view.setVisibility(0);
        }

        C5512j(View view, C4917n nVar, View view2, PortalWidget portalWidget, ViewGroup viewGroup, C9145h hVar, C4917n nVar2, C4917n nVar3) {
            this.f16385a = view;
            this.f16386b = nVar;
            this.f16387c = view2;
            this.f16388d = portalWidget;
            this.f16389e = viewGroup;
            this.f16390f = hVar;
            this.f16391g = nVar2;
            this.f16392h = nVar3;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$k */
    static final class C5513k extends Lambda implements C7562b<Pair<? extends Long, ? extends Long>, String> {

        /* renamed from: a */
        public static final C5513k f16393a = new C5513k();

        C5513k() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m17793a((Pair) obj);
        }

        /* renamed from: a */
        private static String m17793a(Pair<Long, Long> pair) {
            C7573i.m23587b(pair, "it");
            StringBuilder sb = new StringBuilder();
            sb.append((int) ((Number) pair.getFirst()).longValue());
            sb.append('s');
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$l */
    static final class C5514l extends Lambda implements C7562b<Pair<? extends Long, ? extends Long>, String> {

        /* renamed from: a */
        public static final C5514l f16394a = new C5514l();

        C5514l() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m17794a((Pair) obj);
        }

        /* renamed from: a */
        private static String m17794a(Pair<Long, Long> pair) {
            C7573i.m23587b(pair, "it");
            StringBuilder sb = new StringBuilder();
            sb.append((int) ((Number) pair.getFirst()).longValue());
            sb.append('s');
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$m */
    static final class C5515m extends Lambda implements C7562b<Integer, String> {

        /* renamed from: a */
        public static final C5515m f16395a = new C5515m();

        C5515m() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m17795a((Integer) obj);
        }

        /* renamed from: a */
        private static String m17795a(Integer num) {
            return String.valueOf(num.intValue());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$n */
    static final /* synthetic */ class C5516n extends FunctionReference implements C7562b<Integer, C7581n> {
        C5516n(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(TextView.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        /* renamed from: a */
        private void m17796a(int i) {
            ((TextView) this.receiver).setVisibility(i);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m17796a(((Number) obj).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$o */
    static final /* synthetic */ class C5517o extends FunctionReference implements C7562b<Integer, C7581n> {
        C5517o(View view) {
            super(1, view);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(View.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        /* renamed from: a */
        private void m17797a(int i) {
            ((View) this.receiver).setVisibility(i);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m17797a(((Number) obj).intValue());
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$p */
    static final class C5518p extends Lambda implements C7562b<Integer, Integer> {

        /* renamed from: a */
        public static final C5518p f16396a = new C5518p();

        C5518p() {
            super(1);
        }

        /* renamed from: a */
        private static int m17798a(Integer num) {
            if (C7573i.m23576a(num.intValue(), 1) > 0) {
                return 0;
            }
            return 8;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Integer.valueOf(m17798a((Integer) obj));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$q */
    static final class C5519q extends Lambda implements C7562b<List<? extends C4847a>, String> {

        /* renamed from: a */
        public static final C5519q f16397a = new C5519q();

        C5519q() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m17799a((List) obj);
        }

        /* renamed from: a */
        private static String m17799a(List<? extends C4847a> list) {
            Object obj;
            int i;
            C7573i.m23587b(list, "portals");
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                obj = null;
            } else {
                obj = it.next();
                if (it.hasNext()) {
                    long j = ((C4847a) obj).f13834a;
                    do {
                        Object next = it.next();
                        long j2 = ((C4847a) next).f13834a;
                        if (j > j2) {
                            obj = next;
                            j = j2;
                        }
                    } while (it.hasNext());
                }
            }
            C4847a aVar = (C4847a) obj;
            if (aVar != null) {
                i = (int) aVar.f13835b;
            } else {
                i = 0;
            }
            return C5503a.m17787b(i);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$r */
    static final class C5520r extends Lambda implements C7562b<Pair<? extends Long, ? extends Long>, String> {

        /* renamed from: a */
        public static final C5520r f16398a = new C5520r();

        C5520r() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m17800a((Pair) obj);
        }

        /* renamed from: a */
        private static String m17800a(Pair<Long, Long> pair) {
            C7573i.m23587b(pair, "it");
            return C5503a.m17785a((int) ((Number) pair.getFirst()).longValue());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$s */
    static final class C5521s<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C5521s f16399a = new C5521s();

        C5521s() {
        }

        /* renamed from: a */
        private static int m17801a(List<? extends C4847a> list) {
            C7573i.m23587b(list, "it");
            return list.size();
        }

        public final /* synthetic */ Object apply(Object obj) {
            return Integer.valueOf(m17801a((List) obj));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$t */
    static final class C5522t<T> implements C7326g<C3479d<C4860k>> {

        /* renamed from: a */
        public static final C5522t f16400a = new C5522t();

        C5522t() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m17802a((C3479d) obj);
        }

        /* renamed from: a */
        private static void m17802a(C3479d<C4860k> dVar) {
            C8444d.m25673b();
            C8444d.m11971b("ttlive_portal", "CLICK_INVITATION ping success");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$u */
    static final class C5523u<T> implements C7326g<Throwable> {

        /* renamed from: a */
        public static final C5523u f16401a = new C5523u();

        C5523u() {
        }

        public final /* synthetic */ void accept(Object obj) {
            m17803a((Throwable) obj);
        }

        /* renamed from: a */
        private static void m17803a(Throwable th) {
            C8444d.m25673b();
            C7573i.m23582a((Object) th, "t");
            C8444d.m11969a(5, th.getStackTrace());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$v */
    static final class C5524v<T> implements C7326g<C3479d<C4860k>> {

        /* renamed from: a */
        final /* synthetic */ PortalWidget f16402a;

        /* renamed from: b */
        final /* synthetic */ C4879al f16403b;

        C5524v(PortalWidget portalWidget, C4879al alVar) {
            this.f16402a = portalWidget;
            this.f16403b = alVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C3479d<C4860k> dVar) {
            long j;
            C3479d<C4860k> dVar2 = dVar;
            if (((C4860k) dVar2.data).f13905c) {
                C9145h hVar = this.f16402a.f16354e;
                if (hVar != null) {
                    long a = C9146a.m27221a();
                    long j2 = ((C4860k) dVar2.data).f13904b;
                    long j3 = this.f16403b.f13968c;
                    User user = this.f16403b.f13969d;
                    User user2 = this.f16403b.f13970e;
                    Room room = this.f16402a.f16350a;
                    if (room != null) {
                        j = room.getId();
                    } else {
                        j = 0;
                    }
                    C4882ao aoVar = new C4882ao(a, j2, j3, user, user2, j, this.f16403b.f13972g);
                    hVar.mo22348a((C4917n) aoVar);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$w */
    static final class C5525w<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ PortalWidget f16404a;

        /* renamed from: b */
        final /* synthetic */ C4879al f16405b;

        /* renamed from: c */
        final /* synthetic */ int f16406c;

        C5525w(PortalWidget portalWidget, C4879al alVar, int i) {
            this.f16404a = portalWidget;
            this.f16405b = alVar;
            this.f16406c = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C8444d.m25673b();
            C7573i.m23582a((Object) th, "t");
            C8444d.m11969a(5, th.getStackTrace());
            if (this.f16406c > 0) {
                PortalWidget portalWidget = this.f16404a;
                C7321c f = C7492s.m23295b(5, TimeUnit.SECONDS).mo19294a(C47549a.m148327a()).mo19325f((C7326g<? super T>) new C7326g<Long>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C5525w f16407a;

                    {
                        this.f16407a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public void accept(Long l) {
                        this.f16407a.f16404a.mo13982a(this.f16407a.f16405b, this.f16407a.f16406c - 1);
                    }
                });
                C7573i.m23582a((Object) f, "Observable.timer(INITIAL…                        }");
                portalWidget.mo13985a(f);
            }
        }
    }

    public final int getLayoutId() {
        return R.layout.ayd;
    }

    /* renamed from: c */
    private final void m17776c() {
        C7321c f = C9097a.m27146a().mo22266a(C5704er.class).mo19325f((C7326g<? super T>) new C5506d<Object>(this));
        C7573i.m23582a((Object) f, "RxBus.getInstance().regi…)\n            }\n        }");
        m17775b(f);
    }

    /* renamed from: a */
    public final AnimationLayer mo13981a() {
        View view = this.contentView;
        if (view != null) {
            View rootView = view.getRootView();
            if (rootView != null) {
                return (AnimationLayer) rootView.findViewById(R.id.ge);
            }
        }
        return null;
    }

    public final void onPause() {
        C8444d.m25673b();
        C8444d.m11971b("ttlive_portal", "widget onPause");
        super.onPause();
        this.f16353d = false;
    }

    public final void onResume() {
        C8444d.m25673b();
        C8444d.m11971b("ttlive_portal", "widget onResume");
        super.onResume();
        this.f16353d = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r0 == null) goto L_0x0008;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17779f() {
        /*
            r3 = this;
            com.bytedance.android.livesdk.viewmodel.h r0 = r3.f16354e
            if (r0 == 0) goto L_0x0008
            com.bytedance.android.livesdk.chatroom.model.n r0 = r0.f24849a
            if (r0 != 0) goto L_0x000f
        L_0x0008:
            com.bytedance.android.livesdk.chatroom.model.ak r0 = new com.bytedance.android.livesdk.chatroom.model.ak
            r0.<init>()
            com.bytedance.android.livesdk.chatroom.model.n r0 = (com.bytedance.android.livesdk.chatroom.model.C4917n) r0
        L_0x000f:
            boolean r1 = r0 instanceof com.bytedance.android.livesdk.chatroom.model.C4879al
            if (r1 != 0) goto L_0x001e
            boolean r1 = r0 instanceof com.bytedance.android.livesdk.chatroom.model.C4882ao
            if (r1 != 0) goto L_0x001e
            boolean r0 = r0 instanceof com.bytedance.android.livesdk.chatroom.model.C4881an
            if (r0 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r3.dataCenter
            java.lang.String r2 = "data_allow_send_portal_gift"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.lambda$put$1$DataCenter(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.m17779f():void");
    }

    /* renamed from: b */
    private final void m17774b() {
        this.f16350a = (Room) this.dataCenter.get("data_room", null);
        C8984e user = ((C3592a) C3596c.m13172a(C3592a.class)).user();
        C7573i.m23582a((Object) user, "userService");
        this.f16351b = User.from(user.mo22165a());
        C7321c f = user.mo22186f().mo19325f((C7326g<? super T>) new C5507e<Object>(this));
        C7573i.m23582a((Object) f, "userService.observeCurre…= User.from(it)\n        }");
        m17775b(f);
        Object obj = this.dataCenter.get("data_is_anchor", Boolean.valueOf(false));
        C7573i.m23582a(obj, "dataCenter.get(WidgetCon…nt.DATA_IS_ANCHOR, false)");
        this.f16352c = ((Boolean) obj).booleanValue();
        this.f16354e = (C9145h) this.dataCenter.get("data_portal_view_model", null);
        if (this.f16354e == null) {
            this.f16354e = new C9145h();
            this.dataCenter.lambda$put$1$DataCenter("data_portal_view_model", this.f16354e);
        }
    }

    /* renamed from: d */
    private final boolean m17777d() {
        Object obj;
        Object obj2;
        C4879al alVar = f16348f;
        boolean z = true;
        if (alVar != null) {
            Long l = (Long) this.dataCenter.get("data_from_portal_id", Long.valueOf(0));
            C4879al alVar2 = f16348f;
            if (alVar2 != null) {
                obj = Long.valueOf(alVar2.f13972g);
            } else {
                obj = null;
            }
            if (C7573i.m23585a((Object) l, obj)) {
                mo13982a(alVar, 5);
                f16348f = null;
                C8444d.m25673b();
                StringBuilder sb = new StringBuilder("invitation accepted, fromPortalId=");
                sb.append(l);
                C8444d.m11970a("ttlive_portal", sb.toString());
            } else {
                C9145h hVar = this.f16354e;
                if (hVar != null) {
                    obj2 = hVar.f24849a;
                } else {
                    obj2 = null;
                }
                if (!C7573i.m23585a(obj2, (Object) f16348f)) {
                    f16348f = null;
                    C8444d.m25673b();
                    StringBuilder sb2 = new StringBuilder("invitation dropped, fromPortalId=");
                    sb2.append(l);
                    C8444d.m11973d("ttlive_portal", sb2.toString());
                }
                return false;
            }
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: e */
    private final void m17778e() {
        Room room = this.f16350a;
        if (room != null) {
            User user = this.f16351b;
            if (user != null) {
                C9145h hVar = this.f16354e;
                if (hVar != null) {
                    C7321c a = ((PortalApi) C3458e.m12798a().mo10440a(PortalApi.class)).stats(room.getId()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C5504b<Object>(this, user, hVar, room), (C7326g<? super Throwable>) C5505c.f16361a);
                    C7573i.m23582a((Object) a, "LiveClient.get().getServ…ce.WARN, t.stackTrace) })");
                    mo13985a(a);
                }
            }
        }
    }

    public final void onUnload() {
        C8444d.m25673b();
        C8444d.m11971b("ttlive_portal", "widget onUnload");
        View view = this.contentView;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            IMessageManager iMessageManager = (IMessageManager) this.dataCenter.get("data_message_manager", null);
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(this);
            }
            this.f16350a = null;
            this.f16351b = null;
            this.f16352c = false;
            this.f16353d = false;
            this.f16354e = null;
            this.f16355h.dispose();
            this.f16356i.dispose();
            this.f16355h = new C47562b();
            this.f16356i = new C47562b();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: b */
    private final boolean m17775b(C7321c cVar) {
        return this.f16355h.mo119661a(cVar);
    }

    /* renamed from: a */
    public final boolean mo13985a(C7321c cVar) {
        return this.f16356i.mo119661a(cVar);
    }

    public final void onInit(Object[] objArr) {
        C8444d.m25673b();
        C8444d.m11971b("ttlive_portal", "widget onInit");
    }

    public final void onLoad(Object[] objArr) {
        C8444d.m25673b();
        C8444d.m11971b("ttlive_portal", "widget onLoad");
        m17774b();
        m17776c();
        IMessageManager iMessageManager = (IMessageManager) this.dataCenter.get("data_message_manager", null);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(MessageType.PORTAL_MESSAGE.getIntType(), this);
        }
        C9145h hVar = this.f16354e;
        if (hVar != null) {
            hVar.mo22349a(this.f16356i);
            C7321c f = hVar.mo22347a().mo19325f((C7326g<? super T>) new C5508f<Object>(hVar, this));
            C7573i.m23582a((Object) f, "stateChanged.subscribe {…as ViewGroup, from, to) }");
            m17775b(f);
            this.contentView.setOnClickListener(new C5509g(hVar, this));
        }
        if (!m17777d()) {
            m17778e();
        }
    }

    public final void onMessage(IMessage iMessage) {
        IMessage iMessage2 = iMessage;
        C8444d.m25673b();
        StringBuilder sb = new StringBuilder("widget onMessage=");
        sb.append(iMessage2);
        C8444d.m11971b("ttlive_portal", sb.toString());
        Room room = this.f16350a;
        if (room != null) {
            User user = this.f16351b;
            if (user != null) {
                C9145h hVar = this.f16354e;
                if (hVar != null && (iMessage2 instanceof C8522bp)) {
                    C8522bp bpVar = (C8522bp) iMessage2;
                    C8523a aVar = bpVar.f23432g;
                    if (aVar instanceof C8524b) {
                        long id = room.getId();
                        long id2 = user.getId();
                        boolean z = this.f16352c;
                        User user2 = ((C8524b) aVar).f23433a;
                        C7573i.m23582a((Object) user2, "payload.sugarDaddy");
                        C4880am amVar = new C4880am(id, id2, z, user2);
                        hVar.mo22348a((C4917n) amVar);
                    } else if ((aVar instanceof C8526d) && !this.f16352c) {
                        long a = C9146a.m27221a();
                        C8526d dVar = (C8526d) aVar;
                        long j = dVar.f23435a;
                        long j2 = dVar.f23436b;
                        User user3 = dVar.f23437c;
                        C7573i.m23582a((Object) user3, "payload.sugarDaddy");
                        User user4 = dVar.f23438d;
                        C7573i.m23582a((Object) user4, "payload.anchor");
                        C4879al alVar = new C4879al(a, j, j2, user3, user4, room.getId(), bpVar.f23427b, bpVar.f23428c);
                        hVar.mo22348a((C4917n) alVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13983a(C9145h hVar) {
        String str;
        C4917n nVar = hVar.f24849a;
        if (nVar instanceof C4880am) {
            if (((C4880am) nVar).f13976c) {
                C3338l<String> lVar = LiveConfigSettingKeys.PORTAL_ANCHOR_URI;
                C7573i.m23582a((Object) lVar, "LiveConfigSettingKeys.PORTAL_ANCHOR_URI");
                str = (String) lVar.mo10240a();
            } else {
                C3338l<String> lVar2 = LiveConfigSettingKeys.PORTAL_SENDER_URI;
                C7573i.m23582a((Object) lVar2, "LiveConfigSettingKeys.PORTAL_SENDER_URI");
                str = (String) lVar2.mo10240a();
            }
        } else if (nVar instanceof C4879al) {
            C4879al alVar = (C4879al) nVar;
            C8443c.m25663a().mo21606a("invitation_click", C7507ae.m23393a(C7579l.m23633a("from_room_id", String.valueOf(alVar.f13973h)), C7579l.m23633a("from_user_id", String.valueOf(alVar.f13969d.getId())), C7579l.m23633a("from_anchor_id", String.valueOf(alVar.f13970e.getId()))), C8438j.class, Room.class);
            C7321c a = ((PortalApi) C3458e.m12798a().mo10440a(PortalApi.class)).ping(alVar.f13971f, alVar.f13972g, PingType.CLICK_INVITATION).mo19280a((C7326g<? super T>) C5522t.f16400a, (C7326g<? super Throwable>) C5523u.f16401a);
            C7573i.m23582a((Object) a, "LiveClient.get().getServ…                       })");
            mo13985a(a);
            C3338l<String> lVar3 = LiveConfigSettingKeys.PORTAL_INVITATION_URI;
            C7573i.m23582a((Object) lVar3, "LiveConfigSettingKeys.PORTAL_INVITATION_URI");
            str = (String) lVar3.mo10240a();
        } else if ((nVar instanceof C4882ao) || (nVar instanceof C4881an)) {
            if (nVar instanceof C4881an) {
                C8443c.m25663a().mo21607a("openpacket_click", new Object[0]);
            }
            C3338l<String> lVar4 = LiveConfigSettingKeys.PORTAL_REWARD_URI;
            C7573i.m23582a((Object) lVar4, "LiveConfigSettingKeys.PORTAL_REWARD_URI");
            str = (String) lVar4.mo10240a();
        } else {
            str = "";
        }
        try {
            Boolean.valueOf(C9178j.m27302j().mo22380i().handle(this.context, Uri.parse(str)));
        } catch (Throwable th) {
            C8444d.m25673b();
            C8444d.m11969a(5, th.getStackTrace());
        }
    }

    /* renamed from: a */
    public final void mo13982a(C4879al alVar, int i) {
        long j;
        C8444d.m25673b();
        StringBuilder sb = new StringBuilder("initial ping, retriesLeft=");
        sb.append(i);
        C8444d.m11970a("ttlive_portal", sb.toString());
        PortalApi portalApi = (PortalApi) C3458e.m12798a().mo10440a(PortalApi.class);
        Room room = this.f16350a;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        C7321c a = portalApi.ping(j, alVar.f13972g, PingType.WAIT_REWARD).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C5524v<Object>(this, alVar), (C7326g<? super Throwable>) new C5525w<Object>(this, alVar, i));
        C7573i.m23582a((Object) a, "LiveClient.get().getServ…     }\n                })");
        m17775b(a);
    }

    /* renamed from: a */
    private final <S, T> boolean m17773a(C7492s<S> sVar, C7498y<T> yVar, C7562b<? super S, ? extends T> bVar) {
        return this.f16356i.mo119661a(C3306n.m12380a(sVar, yVar, bVar));
    }

    /* renamed from: a */
    public final void mo13984a(C9145h hVar, ViewGroup viewGroup, C4917n nVar, C4917n nVar2) {
        int i;
        ViewGroup viewGroup2 = viewGroup;
        C4917n nVar3 = nVar2;
        hVar.mo22349a(this.f16356i);
        viewGroup.removeAllViews();
        View view = this.contentView;
        C7573i.m23582a((Object) view, "contentView");
        boolean z = nVar3 instanceof C4878ak;
        if (!z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (!z) {
            if (nVar3 instanceof C4879al) {
                View inflate = LayoutInflater.from(this.context).inflate(R.layout.aya, viewGroup2, false);
                C7573i.m23582a((Object) inflate, "view");
                inflate.setVisibility(4);
                C7492s c = hVar.mo22352c();
                View findViewById = inflate.findViewById(R.id.a3e);
                C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.count_down)");
                m17773a(c, C3306n.m12382a((TextView) findViewById), C5513k.f16393a);
                C4879al alVar = (C4879al) nVar3;
                String nickName = alVar.f13969d.getNickName();
                if (nickName == null) {
                    nickName = "";
                }
                String str = nickName;
                View findViewById2 = inflate.findViewById(R.id.e9m);
                C7573i.m23582a((Object) findViewById2, "view.findViewById<TextView>(R.id.user_name)");
                ((TextView) findViewById2).setText(C5503a.m17786a(str));
                viewGroup2.addView(inflate);
                AnimationLayer a = mo13981a();
                if (a != null) {
                    View a2 = a.mo14186a(R.layout.aya);
                    long j = alVar.f13967b;
                    View findViewById3 = a2.findViewById(R.id.e9m);
                    C7573i.m23582a((Object) findViewById3, "animView.findViewById<TextView>(R.id.user_name)");
                    ((TextView) findViewById3).setText(C5503a.m17786a(str));
                    View findViewById4 = a2.findViewById(R.id.a3e);
                    C7573i.m23582a((Object) findViewById4, "animView.findViewById<TextView>(R.id.count_down)");
                    TextView textView = (TextView) findViewById4;
                    StringBuilder sb = new StringBuilder();
                    sb.append((int) j);
                    sb.append('s');
                    textView.setText(sb.toString());
                    View view2 = this.contentView;
                    C7573i.m23582a((Object) view2, "contentView");
                    a.mo14187a(a2, view2);
                    AnimatorSet a3 = C5693ei.m18049a(a2, true, 330);
                    C5510h hVar2 = new C5510h(a2, nVar2, str, inflate, this, viewGroup, hVar, nVar, nVar2);
                    a3.addListener(hVar2);
                    a3.start();
                }
                f16348f = alVar;
                C8443c.m25663a().mo21606a("invitation_show", C7507ae.m23393a(C7579l.m23633a("from_room_id", String.valueOf(alVar.f13973h)), C7579l.m23633a("from_user_id", String.valueOf(alVar.f13969d.getId())), C7579l.m23633a("from_anchor_id", String.valueOf(alVar.f13970e.getId()))), C8438j.class, Room.class);
            } else if (nVar3 instanceof C4880am) {
                View inflate2 = LayoutInflater.from(this.context).inflate(R.layout.ayg, viewGroup2, false);
                TextView textView2 = (TextView) inflate2.findViewById(R.id.ddj);
                View findViewById5 = inflate2.findViewById(R.id.ddk);
                TextView textView3 = (TextView) inflate2.findViewById(R.id.af4);
                C7573i.m23582a((Object) textView2, "superscript");
                textView2.setText("0");
                C7573i.m23582a((Object) textView3, "enterCount");
                textView3.setText(C5503a.m17787b(0));
                C7492s d = hVar.mo22350b().mo19317d((C7327h<? super T, ? extends R>) C5521s.f16399a);
                C7573i.m23582a((Object) d, "portalCountChanged");
                m17773a(d, C3306n.m12382a(textView2), C5515m.f16395a);
                m17773a(d, C3306n.m12384a((C7498y<T>[]) new C7498y[]{C3306n.m12383a((C7562b<? super T, C7581n>) new C5516n<Object,C7581n>(textView2)), C3306n.m12383a((C7562b<? super T, C7581n>) new C5517o<Object,C7581n>(findViewById5))}), C5518p.f16396a);
                m17773a(hVar.mo22350b(), C3306n.m12382a(textView3), C5519q.f16397a);
                viewGroup2.addView(inflate2);
                if ((!C7573i.m23585a((Object) nVar, (Object) nVar2)) || ((C4880am) nVar3).f13976c) {
                    C7573i.m23582a((Object) inflate2, "view");
                    inflate2.setVisibility(4);
                    AnimationLayer a4 = mo13981a();
                    if (a4 != null) {
                        View a5 = a4.mo14186a(R.layout.aye);
                        View findViewById6 = a5.findViewById(R.id.e9m);
                        C7573i.m23582a((Object) findViewById6, "animView.findViewById<TextView>(R.id.user_name)");
                        TextView textView4 = (TextView) findViewById6;
                        C4880am amVar = (C4880am) nVar3;
                        String nickName2 = amVar.f13977d.getNickName();
                        C7573i.m23582a((Object) nickName2, "sugarDaddy.nickName");
                        textView4.setText(C5503a.m17786a(nickName2));
                        C3342a.m12468a(a4.getContext()).mo10254a(Color.parseColor("#fe2c55"), C9051ar.m27035b(a4.getContext(), 1.0f)).mo10252a().mo10257a(amVar.f13977d.getAvatarThumb()).mo10261a((ImageView) a5.findViewById(R.id.e8m));
                        View findViewById7 = a5.findViewById(R.id.af4);
                        C7573i.m23582a((Object) findViewById7, "animView.findViewById<TextView>(R.id.enter_count)");
                        ((TextView) findViewById7).setText(a4.getContext().getString(R.string.f_u));
                        View view3 = this.contentView;
                        C7573i.m23582a((Object) view3, "contentView");
                        a4.mo14187a(a5, view3);
                        AnimatorSet a6 = C5693ei.m18049a(a5, false, 3000);
                        C5511i iVar = new C5511i(a5, nVar2, inflate2, this, viewGroup, hVar, nVar, nVar2);
                        a6.addListener(iVar);
                        a6.start();
                    }
                }
            } else if (nVar3 instanceof C4882ao) {
                View inflate3 = LayoutInflater.from(this.context).inflate(R.layout.ayc, viewGroup2, false);
                C7573i.m23582a((Object) inflate3, "view");
                inflate3.setVisibility(4);
                C7492s c2 = hVar.mo22352c();
                View findViewById8 = inflate3.findViewById(R.id.a3e);
                C7573i.m23582a((Object) findViewById8, "view.findViewById(R.id.count_down)");
                m17773a(c2, C3306n.m12382a((TextView) findViewById8), C5520r.f16398a);
                viewGroup2.addView(inflate3);
                AnimationLayer a7 = mo13981a();
                if (a7 != null) {
                    View a8 = a7.mo14186a(R.layout.ayc);
                    View findViewById9 = a8.findViewById(R.id.efk);
                    C7573i.m23582a((Object) findViewById9, "animView.findViewById<TextView>(R.id.wait_hint)");
                    TextView textView5 = (TextView) findViewById9;
                    String string = a7.getContext().getString(R.string.f_v);
                    C7573i.m23582a((Object) string, "context.getString(R.stri….ttlive_portal_wait_hint)");
                    C4882ao aoVar = (C4882ao) nVar3;
                    double d2 = (double) aoVar.f13985b;
                    Double.isNaN(d2);
                    String a9 = C1642a.m8034a(string, Arrays.copyOf(new Object[]{Integer.valueOf((int) Math.ceil(d2 / 60.0d))}, 1));
                    C7573i.m23582a((Object) a9, "java.lang.String.format(this, *args)");
                    textView5.setText(a9);
                    View findViewById10 = a8.findViewById(R.id.a3e);
                    C7573i.m23582a((Object) findViewById10, "animView.findViewById<TextView>(R.id.count_down)");
                    ((TextView) findViewById10).setText(C5503a.m17785a((int) aoVar.f13985b));
                    View view4 = this.contentView;
                    C7573i.m23582a((Object) view4, "contentView");
                    a7.mo14187a(a8, view4);
                    AnimatorSet a10 = C5693ei.m18049a(a8, true, 330);
                    C5512j jVar = new C5512j(a8, nVar2, inflate3, this, viewGroup, hVar, nVar, nVar2);
                    a10.addListener(jVar);
                    a10.start();
                }
            } else if (nVar3 instanceof C4881an) {
                View inflate4 = LayoutInflater.from(this.context).inflate(R.layout.ayb, viewGroup2, false);
                C7492s c3 = hVar.mo22352c();
                View findViewById11 = inflate4.findViewById(R.id.a3e);
                C7573i.m23582a((Object) findViewById11, "view.findViewById(R.id.count_down)");
                m17773a(c3, C3306n.m12382a((TextView) findViewById11), C5514l.f16394a);
                viewGroup2.addView(inflate4);
                AnimatorSet animatorSet = new AnimatorSet();
                Animator loadAnimator = AnimatorInflater.loadAnimator(this.context, R.animator.m);
                Animator clone = loadAnimator.clone();
                C7573i.m23582a((Object) clone, "shake.clone()");
                loadAnimator.setTarget(inflate4);
                clone.setTarget(inflate4);
                clone.setStartDelay(1000);
                animatorSet.playSequentially(new Animator[]{loadAnimator, clone});
                animatorSet.start();
                C8443c.m25663a().mo21607a("openpacket_show", new Object[0]);
            }
        }
        m17779f();
    }
}
