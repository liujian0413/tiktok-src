package com.p280ss.android.ugc.aweme.p313im.sdk.notification;

import android.app.Activity;
import android.content.Context;
import android.os.CountDownTimer;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.p263im.core.model.C11438g;
import com.bytedance.p263im.core.model.Conversation;
import com.bytedance.p263im.core.p584a.C11202d.C11203a;
import com.bytedance.p263im.core.p584a.p585a.C11195b;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.c */
public final class C31594c {

    /* renamed from: f */
    public static final C31595a f82709f = new C31595a(null);

    /* renamed from: a */
    public boolean f82710a;

    /* renamed from: b */
    public ViewGroup f82711b;

    /* renamed from: c */
    public NotificationWidget f82712c;

    /* renamed from: d */
    public final CountDownTimer f82713d;

    /* renamed from: e */
    public final Activity f82714e;

    /* renamed from: g */
    private C31593b f82715g;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.c$a */
    public static final class C31595a {
        private C31595a() {
        }

        public /* synthetic */ C31595a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.c$b */
    public static final class C31596b implements C11195b<Conversation> {

        /* renamed from: a */
        final /* synthetic */ C31594c f82716a;

        /* renamed from: a */
        public final void mo18088a(C11438g gVar) {
        }

        C31596b(C31594c cVar) {
            this.f82716a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo18089a(Conversation conversation) {
            C10761a.m31383a((Context) this.f82716a.f82714e, (int) R.string.a1o).mo25750a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.c$c */
    static final class C31597c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31594c f82717a;

        /* renamed from: b */
        final /* synthetic */ C7561a f82718b;

        C31597c(C31594c cVar, C7561a aVar) {
            this.f82717a = cVar;
            this.f82718b = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m102698a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102698a() {
            ViewGroup viewGroup = this.f82717a.f82711b;
            if (viewGroup != null) {
                viewGroup.removeView(this.f82717a.f82712c);
            }
            this.f82717a.f82710a = false;
            C7561a aVar = this.f82718b;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.c$d */
    public static final class C31598d extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ C31594c f82719a;

        public final void onTick(long j) {
        }

        public final void onFinish() {
            this.f82719a.dismiss(null);
            this.f82719a.mo82342c();
        }

        C31598d(C31594c cVar, long j, long j2) {
            this.f82719a = cVar;
            super(DouPlusShareGuideExperiment.MIN_VALID_DURATION, 50);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.c$e */
    static final class C31599e extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31594c f82720a;

        C31599e(C31594c cVar) {
            this.f82720a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102699a(((Number) obj).intValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102699a(int i) {
            switch (i) {
                case 0:
                    this.f82720a.dismiss(new C7561a<C7581n>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C31599e f82721a;

                        {
                            this.f82721a = r1;
                        }

                        public final /* synthetic */ Object invoke() {
                            m102700a();
                            return C7581n.f20898a;
                        }

                        /* renamed from: a */
                        private void m102700a() {
                            this.f82721a.f82720a.mo82340b();
                            this.f82721a.f82720a.mo82338a("click");
                        }
                    });
                    break;
                case 1:
                    this.f82720a.mo82343d();
                    this.f82720a.mo82341b("click");
                    return;
                case 3:
                    this.f82720a.dismiss(null);
                    this.f82720a.mo82338a("slide_up");
                    this.f82720a.mo82342c();
                    return;
                case 4:
                    this.f82720a.f82713d.cancel();
                    this.f82720a.f82713d.start();
                    this.f82720a.mo82338a("slide_down");
                    this.f82720a.mo82341b("show");
                    return;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo82339a() {
        Integer num;
        C31593b bVar = this.f82715g;
        if (bVar != null) {
            int i = bVar.f82699a;
            if (NotificationWidget.f82664c != null) {
                num = Integer.valueOf(4);
            } else {
                num = null;
            }
            if (i == num.intValue()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final void mo82342c() {
        C31593b bVar = this.f82715g;
        if (bVar != null && bVar.f82699a == 4) {
            C6956a a = C6956a.m21632a();
            C7573i.m23582a((Object) a, "AwemeImManager.instance()");
            C7103h f = a.mo18009f();
            if (f != null) {
                f.getLiveProxy();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82343d() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.im.sdk.notification.b r0 = r5.f82715g
            if (r0 == 0) goto L_0x005a
            com.bytedance.im.core.model.a r1 = com.bytedance.p263im.core.model.C6417a.m20015a()
            java.lang.String r2 = r0.f82701c
            com.bytedance.im.core.model.Conversation r1 = r1.mo15530a(r2)
            if (r1 != 0) goto L_0x0011
            goto L_0x005a
        L_0x0011:
            com.bytedance.im.core.model.ConversationSettingInfo r2 = r1.getSettingInfo()
            if (r2 == 0) goto L_0x0022
            java.util.Map r2 = r2.getExt()
            if (r2 == 0) goto L_0x0022
            java.util.Map r2 = kotlin.collections.C7507ae.m23402c(r2)
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r2 == 0) goto L_0x002e
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r3 = 0
            goto L_0x002f
        L_0x002e:
            r3 = 1
        L_0x002f:
            if (r3 == 0) goto L_0x0038
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Map r2 = (java.util.Map) r2
        L_0x0038:
            java.lang.String r3 = "a:s_awe_push_close"
            java.lang.String r4 = "1"
            r2.put(r3, r4)
            com.bytedance.im.core.model.ConversationSettingInfo r1 = r1.getSettingInfo()
            if (r1 == 0) goto L_0x0048
            r1.setExt(r2)
        L_0x0048:
            com.bytedance.im.core.model.b r1 = new com.bytedance.im.core.model.b
            java.lang.String r0 = r0.f82701c
            r1.<init>(r0)
            com.ss.android.ugc.aweme.im.sdk.notification.c$b r0 = new com.ss.android.ugc.aweme.im.sdk.notification.c$b
            r0.<init>(r5)
            com.bytedance.im.core.a.a.b r0 = (com.bytedance.p263im.core.p584a.p585a.C11195b) r0
            r1.mo15569a(r2, r0)
            return
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.notification.C31594c.mo82343d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0084, code lost:
        if (r2 == null) goto L_0x0086;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82340b() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.im.sdk.notification.b r0 = r7.f82715g
            if (r0 == 0) goto L_0x00e2
            int r1 = r0.f82699a
            r2 = 4
            if (r1 != r2) goto L_0x0040
            com.ss.android.ugc.aweme.im.sdk.d.a r0 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a.m21632a()
            java.lang.String r1 = "AwemeImManager.instance()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.im.service.h r0 = r0.mo18009f()
            if (r0 == 0) goto L_0x001b
            r0.getLiveProxy()
        L_0x001b:
            com.ss.android.ugc.aweme.im.sdk.d.a r0 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a.m21632a()
            java.lang.String r1 = "AwemeImManager.instance()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            com.ss.android.ugc.aweme.im.service.h r0 = r0.mo18009f()
            if (r0 == 0) goto L_0x00e2
            com.ss.android.ugc.aweme.im.sdk.notification.NotificationWidget r1 = r7.f82712c
            r2 = 0
            if (r1 == 0) goto L_0x0034
            android.content.Context r1 = r1.getContext()
            goto L_0x0035
        L_0x0034:
            r1 = r2
        L_0x0035:
            com.ss.android.ugc.aweme.im.sdk.notification.b r3 = r7.f82715g
            if (r3 == 0) goto L_0x003b
            java.lang.String r2 = r3.f82706h
        L_0x003b:
            r0.openLiveUrl(r1, r2)
            goto L_0x00e1
        L_0x0040:
            int r1 = r0.f82699a
            r2 = 1
            if (r1 != r2) goto L_0x0060
            com.ss.android.ugc.aweme.router.s r0 = com.p280ss.android.ugc.aweme.router.C7195s.m22438a()
            java.lang.String r1 = "aweme://main"
            com.ss.android.ugc.aweme.router.u r1 = com.p280ss.android.ugc.aweme.router.C7203u.m22460a(r1)
            java.lang.String r2 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB"
            java.lang.String r3 = "NOTIFICATION"
            com.ss.android.ugc.aweme.router.u r1 = r1.mo18694a(r2, r3)
            java.lang.String r1 = r1.mo18695a()
            r0.mo18682a(r1)
            goto L_0x00e2
        L_0x0060:
            com.ss.android.ugc.aweme.im.sdk.notification.a r1 = com.p280ss.android.ugc.aweme.p313im.sdk.notification.C7027a.f19815b
            java.lang.String r2 = r0.f82701c
            r1.mo18128a(r2)
            java.lang.Integer r1 = r0.f82700b
            if (r1 == 0) goto L_0x00e1
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            com.ss.android.ugc.aweme.im.sdk.d.a r2 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a.m21632a()
            java.lang.String r3 = "AwemeImManager.instance()"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            com.ss.android.ugc.aweme.im.service.h r2 = r2.mo18009f()
            if (r2 == 0) goto L_0x0086
            java.lang.String r2 = r2.getInnerPushEnterFrom()
            if (r2 != 0) goto L_0x0088
        L_0x0086:
            java.lang.String r2 = "others"
        L_0x0088:
            int r3 = com.bytedance.p263im.core.p584a.C11202d.C11203a.f30380a
            r4 = 11
            if (r1 != r3) goto L_0x00ba
            java.lang.String r1 = r0.f82701c
            long r5 = com.bytedance.p263im.core.model.C6425b.m20074a(r1)
            com.ss.android.ugc.aweme.im.sdk.d.d r1 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6961d.m21657a()
            java.lang.String r3 = java.lang.String.valueOf(r5)
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = r1.mo18029b(r3)
            if (r1 == 0) goto L_0x00e1
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103406a()
            java.lang.String r0 = r0.f82701c
            java.lang.String r3 = r1.getUid()
            java.lang.String r5 = "private"
            java.lang.String r6 = "inner_push"
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103432a(r0, r3, r5, r6, r2)
            android.app.Activity r0 = r7.f82714e
            android.content.Context r0 = (android.content.Context) r0
            com.p280ss.android.ugc.aweme.p313im.sdk.chat.ChatRoomActivity.m21589a(r0, r1, r4)
            goto L_0x00e2
        L_0x00ba:
            int r3 = com.bytedance.p263im.core.p584a.C11202d.C11203a.f30381b
            if (r1 != r3) goto L_0x00e2
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = "key_enter_from"
            r1.putInt(r3, r4)
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103406a()
            java.lang.String r3 = r0.f82701c
            java.lang.String r4 = ""
            java.lang.String r5 = "group"
            java.lang.String r6 = "inner_push"
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103432a(r3, r4, r5, r6, r2)
            android.app.Activity r2 = r7.f82714e
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = r0.f82701c
            r3 = 3
            com.p280ss.android.ugc.aweme.p313im.sdk.chat.ChatRoomActivity.m21596a(r2, r0, r3, r1)
            goto L_0x00e2
        L_0x00e1:
            return
        L_0x00e2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.notification.C31594c.mo82340b():void");
    }

    public C31594c(Activity activity) {
        C7573i.m23587b(activity, "activity");
        this.f82714e = activity;
        C31598d dVar = new C31598d(this, DouPlusShareGuideExperiment.MIN_VALID_DURATION, 50);
        this.f82713d = dVar;
    }

    public final void dismiss(C7561a<C7581n> aVar) {
        NotificationWidget notificationWidget = this.f82712c;
        if (notificationWidget != null && this.f82710a) {
            notificationWidget.mo82323a((C7561a<C7581n>) new C31597c<C7581n>(this, aVar));
        }
        this.f82713d.cancel();
    }

    /* renamed from: b */
    public final void mo82341b(String str) {
        String str2;
        C31593b bVar = this.f82715g;
        if (bVar != null) {
            if (bVar.f82699a == 2) {
                str2 = "auto";
            } else {
                str2 = "slide_down";
            }
            Integer num = bVar.f82700b;
            int i = C11203a.f30380a;
            if (num != null && num.intValue() == i) {
                C31858ad.m103491j("private", str, str2);
            } else {
                Integer num2 = bVar.f82700b;
                int i2 = C11203a.f30381b;
                if (num2 != null && num2.intValue() == i2) {
                    C31858ad.m103491j("group", str, str2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1 == null) goto L_0x0019;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82338a(java.lang.String r5) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.im.sdk.notification.b r0 = r4.f82715g
            if (r0 == 0) goto L_0x004c
            com.ss.android.ugc.aweme.im.sdk.d.a r1 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a.m21632a()
            java.lang.String r2 = "AwemeImManager.instance()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            com.ss.android.ugc.aweme.im.service.h r1 = r1.mo18009f()
            if (r1 == 0) goto L_0x0019
            java.lang.String r1 = r1.getInnerPushEnterFrom()
            if (r1 != 0) goto L_0x001b
        L_0x0019:
            java.lang.String r1 = "others"
        L_0x001b:
            int r2 = r0.f82699a
            r3 = 1
            if (r2 != r3) goto L_0x0026
            java.lang.String r0 = "aggregate"
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103488i(r0, r5, r1)
            goto L_0x004c
        L_0x0026:
            java.lang.Integer r2 = r0.f82700b
            int r3 = com.bytedance.p263im.core.p584a.C11202d.C11203a.f30380a
            if (r2 != 0) goto L_0x002d
            goto L_0x0039
        L_0x002d:
            int r2 = r2.intValue()
            if (r2 != r3) goto L_0x0039
            java.lang.String r0 = "private"
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103488i(r0, r5, r1)
            goto L_0x004c
        L_0x0039:
            java.lang.Integer r0 = r0.f82700b
            int r2 = com.bytedance.p263im.core.p584a.C11202d.C11203a.f30381b
            if (r0 != 0) goto L_0x0040
            goto L_0x004c
        L_0x0040:
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x004b
            java.lang.String r0 = "group"
            com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad.m103488i(r0, r5, r1)
        L_0x004b:
            return
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.notification.C31594c.mo82338a(java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo82337a(C31593b bVar) {
        ViewGroup viewGroup;
        String str;
        if (bVar != null) {
            this.f82715g = bVar;
            C6956a a = C6956a.m21632a();
            C7573i.m23582a((Object) a, "AwemeImManager.instance()");
            C7103h f = a.mo18009f();
            if (f != null) {
                viewGroup = f.getCurrentDecorView(this.f82714e);
            } else {
                viewGroup = null;
            }
            this.f82711b = viewGroup;
            this.f82713d.cancel();
            this.f82713d.start();
            if (this.f82710a) {
                NotificationWidget notificationWidget = this.f82712c;
                if (notificationWidget != null) {
                    notificationWidget.mo82322a(this.f82715g);
                }
            } else {
                this.f82710a = true;
                NotificationWidget notificationWidget2 = new NotificationWidget(this.f82714e, null, 0, 6, null);
                notificationWidget2.mo82322a(this.f82715g);
                notificationWidget2.mo82321a();
                notificationWidget2.setActionListener(new C31599e(this));
                this.f82712c = notificationWidget2;
                LayoutParams layoutParams = new LayoutParams(-1, -2);
                layoutParams.gravity = 48;
                layoutParams.topMargin = C9738o.m28717e(this.f82714e);
                ViewGroup viewGroup2 = this.f82711b;
                if (viewGroup2 != null) {
                    viewGroup2.addView(this.f82712c, layoutParams);
                }
            }
            mo82338a("show");
            if (bVar.f82699a == 3) {
                Integer num = bVar.f82700b;
                int i = C11203a.f30380a;
                if (num != null && num.intValue() == i) {
                    str = "private";
                } else {
                    str = "group";
                }
                C31858ad.m103508v(str);
            } else {
                if (bVar.f82699a == 2) {
                    mo82341b("show");
                }
            }
        }
    }
}
