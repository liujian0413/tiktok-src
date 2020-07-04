package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.commercialize.log.C24932ae;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteApi;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.api.VoteApi.C40713a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.VoteResponse;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p1609b.C40717a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView.C40762a;
import com.p280ss.android.ugc.aweme.sticker.C41850e;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p280ss.android.ugc.aweme.sticker.p1633a.C41844c;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C47562b;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h */
public final class C40787h extends RelativeLayout implements C40780d {

    /* renamed from: l */
    public static final C40789b f106054l = new C40789b(null);

    /* renamed from: A */
    private C40788a f106055A;

    /* renamed from: B */
    private final C40790c f106056B;

    /* renamed from: a */
    public final DispathTouchEventView f106057a;

    /* renamed from: b */
    public final DmtTextView f106058b;

    /* renamed from: c */
    public final DmtTextView f106059c;

    /* renamed from: d */
    public final DispathTouchEventView f106060d;

    /* renamed from: e */
    public final DmtTextView f106061e;

    /* renamed from: f */
    public final DmtTextView f106062f;

    /* renamed from: g */
    public String f106063g = "";

    /* renamed from: h */
    public final C47562b f106064h = new C47562b();

    /* renamed from: i */
    public long f106065i;

    /* renamed from: j */
    public VoteStruct f106066j;

    /* renamed from: k */
    public C41844c f106067k;

    /* renamed from: m */
    private final DmtTextView f106068m;

    /* renamed from: n */
    private final ViewGroup f106069n;

    /* renamed from: o */
    private final ViewGroup f106070o;

    /* renamed from: p */
    private boolean f106071p;

    /* renamed from: q */
    private final VoteApi f106072q = C40713a.m130173a();

    /* renamed from: r */
    private final float f106073r = 101.0f;

    /* renamed from: s */
    private final String f106074s = "方正兰亭特黑简体";

    /* renamed from: t */
    private C41850e f106075t;

    /* renamed from: u */
    private int f106076u;

    /* renamed from: v */
    private float[] f106077v;

    /* renamed from: w */
    private final Paint f106078w = new Paint();

    /* renamed from: x */
    private final Path f106079x = new Path();

    /* renamed from: y */
    private final FrameLayout f106080y;

    /* renamed from: z */
    private InteractStickerStruct f106081z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$a */
    public final class C40788a implements C40762a {
        public C40788a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
            if (r0 == null) goto L_0x0037;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a6, code lost:
            if (r0 == null) goto L_0x01a8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x02b4  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0100  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x011f  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0142  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0272  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0291  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo101001a(int r14) {
            /*
                r13 = this;
                r0 = 1
                r2 = 0
                r3 = 1120403456(0x42c80000, float:100.0)
                r4 = 0
                r6 = 0
                r7 = 1
                r8 = 2131303288(0x7f091b78, float:1.8224686E38)
                if (r14 != r8) goto L_0x017a
                com.ss.android.ugc.aweme.IAccountUserService r14 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
                java.lang.String r8 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.C7573i.m23582a(r14, r8)
                boolean r14 = r14.isLogin()
                if (r14 != 0) goto L_0x0047
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                android.content.Context r14 = r14.getContext()
                if (r14 == 0) goto L_0x003f
                android.app.Activity r14 = (android.app.Activity) r14
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.sticker.e r0 = r0.getInteractStickerParams()
                if (r0 == 0) goto L_0x0037
                com.ss.android.ugc.aweme.sticker.d r0 = r0.f108861n
                if (r0 == 0) goto L_0x0037
                java.lang.String r0 = r0.f108842b
                if (r0 != 0) goto L_0x0039
            L_0x0037:
                java.lang.String r0 = ""
            L_0x0039:
                java.lang.String r1 = ""
                com.p280ss.android.ugc.aweme.login.C32656f.m105742a(r14, r0, r1)
                return
            L_0x003f:
                kotlin.TypeCastException r14 = new kotlin.TypeCastException
                java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
                r14.<init>(r0)
                throw r14
            L_0x0047:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r8 = r8.f106066j
                if (r8 == 0) goto L_0x0062
                java.util.List r8 = r8.getOptions()
                if (r8 == 0) goto L_0x0062
                java.lang.Object r8 = r8.get(r6)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r8 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r8
                if (r8 == 0) goto L_0x0062
                long r8 = r8.getOptionId()
                goto L_0x0063
            L_0x0062:
                r8 = r4
            L_0x0063:
                r14.f106065i = r8
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                float r14 = r14.mo101029a(r6, r7)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.f106059c
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "%.0f"
                java.lang.Object[] r11 = new java.lang.Object[r7]
                java.lang.Float r12 = java.lang.Float.valueOf(r14)
                r11[r6] = r12
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r7)
                java.lang.String r10 = com.C1642a.m8034a(r10, r11)
                java.lang.String r11 = "java.lang.String.format(format, *args)"
                kotlin.jvm.internal.C7573i.m23582a(r10, r11)
                r9.append(r10)
                java.lang.String r10 = "%"
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                r8.setText(r9)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.f106062f
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "%.0f"
                java.lang.Object[] r11 = new java.lang.Object[r7]
                float r3 = r3 - r14
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r11[r6] = r3
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r11, r7)
                java.lang.String r3 = com.C1642a.m8034a(r10, r3)
                java.lang.String r10 = "java.lang.String.format(format, *args)"
                kotlin.jvm.internal.C7573i.m23582a(r3, r10)
                r9.append(r3)
                java.lang.String r3 = "%"
                r9.append(r3)
                java.lang.String r3 = r9.toString()
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r8.setText(r3)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r3 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r8 = r8.f106057a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r9 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = r9.f106058b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r10 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r10 = r10.f106059c
                int r14 = (int) r14
                r3.mo101032a(r8, r9, r10, r14)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r3 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r8 = r8.f106060d
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r9 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = r9.f106061e
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r10 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r10 = r10.f106062f
                int r14 = 100 - r14
                r3.mo101037b(r8, r9, r10, r14)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                r14.setStatus(r7)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r3 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r3 = r3.f106066j
                if (r3 == 0) goto L_0x0116
                java.util.List r3 = r3.getOptions()
                if (r3 == 0) goto L_0x0116
                java.lang.Object r3 = r3.get(r6)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r3 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r3
                if (r3 == 0) goto L_0x0116
                long r2 = r3.getOptionId()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
            L_0x0116:
                r14.mo101034a(r2)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r14 = r14.f106066j
                if (r14 == 0) goto L_0x013c
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r2 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r2.f106066j
                if (r2 == 0) goto L_0x0138
                java.util.List r2 = r2.getOptions()
                if (r2 == 0) goto L_0x0138
                java.lang.Object r2 = r2.get(r6)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
                if (r2 == 0) goto L_0x0138
                long r2 = r2.getOptionId()
                goto L_0x0139
            L_0x0138:
                r2 = r4
            L_0x0139:
                r14.setSelectOptionId(r2)
            L_0x013c:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r14 = r14.f106066j
                if (r14 == 0) goto L_0x016d
                java.util.List r14 = r14.getOptions()
                if (r14 == 0) goto L_0x016d
                java.lang.Object r14 = r14.get(r6)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r14 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r14
                if (r14 == 0) goto L_0x016d
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r2 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r2.f106066j
                if (r2 == 0) goto L_0x0168
                java.util.List r2 = r2.getOptions()
                if (r2 == 0) goto L_0x0168
                java.lang.Object r2 = r2.get(r6)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
                if (r2 == 0) goto L_0x0168
                long r4 = r2.getVoteCount()
            L_0x0168:
                r2 = 0
                long r4 = r4 + r0
                r14.setVoteCount(r4)
            L_0x016d:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                java.lang.String r0 = "A"
                r14.mo101035a(r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                r14.mo101030a()
                return
            L_0x017a:
                r8 = 2131303289(0x7f091b79, float:1.8224688E38)
                if (r14 != r8) goto L_0x02eb
                com.ss.android.ugc.aweme.IAccountUserService r14 = com.p280ss.android.ugc.aweme.account.C21115b.m71197a()
                java.lang.String r8 = "AccountUserProxyService.get()"
                kotlin.jvm.internal.C7573i.m23582a(r14, r8)
                boolean r14 = r14.isLogin()
                if (r14 != 0) goto L_0x01b8
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                android.content.Context r14 = r14.getContext()
                if (r14 == 0) goto L_0x01b0
                android.app.Activity r14 = (android.app.Activity) r14
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.sticker.e r0 = r0.getInteractStickerParams()
                if (r0 == 0) goto L_0x01a8
                com.ss.android.ugc.aweme.sticker.d r0 = r0.f108861n
                if (r0 == 0) goto L_0x01a8
                java.lang.String r0 = r0.f108842b
                if (r0 != 0) goto L_0x01aa
            L_0x01a8:
                java.lang.String r0 = ""
            L_0x01aa:
                java.lang.String r1 = ""
                com.p280ss.android.ugc.aweme.login.C32656f.m105742a(r14, r0, r1)
                return
            L_0x01b0:
                kotlin.TypeCastException r14 = new kotlin.TypeCastException
                java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
                r14.<init>(r0)
                throw r14
            L_0x01b8:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r8 = r8.f106066j
                if (r8 == 0) goto L_0x01d3
                java.util.List r8 = r8.getOptions()
                if (r8 == 0) goto L_0x01d3
                java.lang.Object r8 = r8.get(r7)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r8 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r8
                if (r8 == 0) goto L_0x01d3
                long r8 = r8.getOptionId()
                goto L_0x01d4
            L_0x01d3:
                r8 = r4
            L_0x01d4:
                r14.f106065i = r8
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                float r14 = r14.mo101029a(r7, r7)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.f106062f
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "%.0f"
                java.lang.Object[] r11 = new java.lang.Object[r7]
                java.lang.Float r12 = java.lang.Float.valueOf(r14)
                r11[r6] = r12
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r7)
                java.lang.String r10 = com.C1642a.m8034a(r10, r11)
                java.lang.String r11 = "java.lang.String.format(format, *args)"
                kotlin.jvm.internal.C7573i.m23582a(r10, r11)
                r9.append(r10)
                java.lang.String r10 = "%"
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9
                r8.setText(r9)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.f106059c
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "%.0f"
                java.lang.Object[] r11 = new java.lang.Object[r7]
                float r3 = r3 - r14
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r11[r6] = r3
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r11, r7)
                java.lang.String r3 = com.C1642a.m8034a(r10, r3)
                java.lang.String r6 = "java.lang.String.format(format, *args)"
                kotlin.jvm.internal.C7573i.m23582a(r3, r6)
                r9.append(r3)
                java.lang.String r3 = "%"
                r9.append(r3)
                java.lang.String r3 = r9.toString()
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r8.setText(r3)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r3 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r6 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r6 = r6.f106060d
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.f106061e
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r9 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = r9.f106062f
                int r14 = (int) r14
                r3.mo101032a(r6, r8, r9, r14)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r3 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r6 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r6 = r6.f106057a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r8 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r8.f106058b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r9 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.bytedance.ies.dmt.ui.widget.DmtTextView r9 = r9.f106059c
                int r14 = 100 - r14
                r3.mo101037b(r6, r8, r9, r14)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                r3 = 2
                r14.setStatus(r3)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r3 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r3 = r3.f106066j
                if (r3 == 0) goto L_0x0288
                java.util.List r3 = r3.getOptions()
                if (r3 == 0) goto L_0x0288
                java.lang.Object r3 = r3.get(r7)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r3 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r3
                if (r3 == 0) goto L_0x0288
                long r2 = r3.getOptionId()
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
            L_0x0288:
                r14.mo101034a(r2)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r14 = r14.f106066j
                if (r14 == 0) goto L_0x02ae
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r2 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r2.f106066j
                if (r2 == 0) goto L_0x02aa
                java.util.List r2 = r2.getOptions()
                if (r2 == 0) goto L_0x02aa
                java.lang.Object r2 = r2.get(r7)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
                if (r2 == 0) goto L_0x02aa
                long r2 = r2.getOptionId()
                goto L_0x02ab
            L_0x02aa:
                r2 = r4
            L_0x02ab:
                r14.setSelectOptionId(r2)
            L_0x02ae:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r14 = r14.f106066j
                if (r14 == 0) goto L_0x02df
                java.util.List r14 = r14.getOptions()
                if (r14 == 0) goto L_0x02df
                java.lang.Object r14 = r14.get(r7)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r14 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r14
                if (r14 == 0) goto L_0x02df
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r2 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r2.f106066j
                if (r2 == 0) goto L_0x02da
                java.util.List r2 = r2.getOptions()
                if (r2 == 0) goto L_0x02da
                java.lang.Object r2 = r2.get(r7)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
                if (r2 == 0) goto L_0x02da
                long r4 = r2.getVoteCount()
            L_0x02da:
                r2 = 0
                long r4 = r4 + r0
                r14.setVoteCount(r4)
            L_0x02df:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                java.lang.String r0 = "B"
                r14.mo101035a(r0)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r14 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.this
                r14.mo101030a()
            L_0x02eb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.C40788a.mo101001a(int):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$b */
    public static final class C40789b {
        private C40789b() {
        }

        public /* synthetic */ C40789b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$c */
    public interface C40790c {
        /* renamed from: a */
        void mo101054a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$d */
    public static final class C40791d implements C40790c {

        /* renamed from: a */
        final /* synthetic */ C40787h f106083a;

        /* renamed from: a */
        public final void mo101054a() {
            String str = this.f106083a.f106063g;
            if (str == null) {
                C7573i.m23580a();
            }
            C42961az.m136380a(new C40717a(str, this.f106083a.f106065i));
        }

        C40791d(C40787h hVar) {
            this.f106083a = hVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$e */
    public static final class C40792e implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C40787h f106084a;

        /* renamed from: b */
        final /* synthetic */ boolean f106085b;

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f106085b) {
                C41844c cVar = this.f106084a.f106067k;
                if (cVar != null) {
                    cVar.mo71726b();
                }
            }
        }

        public final void onAnimationCancel(Animator animator) {
            if (this.f106085b) {
                C41844c cVar = this.f106084a.f106067k;
                if (cVar != null) {
                    cVar.mo71727c();
                }
                C40790c animEndListener = this.f106084a.getAnimEndListener();
                if (animEndListener != null) {
                    animEndListener.mo101054a();
                }
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f106085b) {
                C41844c cVar = this.f106084a.f106067k;
                if (cVar != null) {
                    cVar.mo71727c();
                }
                C40790c animEndListener = this.f106084a.getAnimEndListener();
                if (animEndListener != null) {
                    animEndListener.mo101054a();
                }
            }
        }

        C40792e(C40787h hVar, boolean z) {
            this.f106084a = hVar;
            this.f106085b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$f */
    static final class C40793f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C40787h f106086a;

        /* renamed from: b */
        final /* synthetic */ VoteStruct f106087b;

        /* renamed from: c */
        final /* synthetic */ C41844c f106088c;

        C40793f(C40787h hVar, VoteStruct voteStruct, C41844c cVar) {
            this.f106086a = hVar;
            this.f106087b = voteStruct;
            this.f106088c = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r5 = this;
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r5.f106086a
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f106058b
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r1 = r5.f106086a
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r5.f106087b
                r3 = 0
                if (r2 == 0) goto L_0x001f
                java.util.List r2 = r2.getOptions()
                if (r2 == 0) goto L_0x001f
                r4 = 0
                java.lang.Object r2 = r2.get(r4)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
                if (r2 == 0) goto L_0x001f
                java.lang.String r2 = r2.getOptionText()
                goto L_0x0020
            L_0x001f:
                r2 = r3
            L_0x0020:
                java.lang.String r1 = r1.mo101036b(r2)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r5.f106086a
                com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r0.f106061e
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r1 = r5.f106086a
                com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r5.f106087b
                if (r2 == 0) goto L_0x0046
                java.util.List r2 = r2.getOptions()
                if (r2 == 0) goto L_0x0046
                r4 = 1
                java.lang.Object r2 = r2.get(r4)
                com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
                if (r2 == 0) goto L_0x0046
                java.lang.String r3 = r2.getOptionText()
            L_0x0046:
                java.lang.String r1 = r1.mo101036b(r3)
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r0.setText(r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r5.f106086a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r0 = r0.f106057a
                if (r0 == 0) goto L_0x005a
                com.ss.android.ugc.aweme.sticker.a.c r1 = r5.f106088c
                r0.setListener(r1)
            L_0x005a:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r5.f106086a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.DispathTouchEventView r0 = r0.f106060d
                if (r0 == 0) goto L_0x0065
                com.ss.android.ugc.aweme.sticker.a.c r1 = r5.f106088c
                r0.setListener(r1)
            L_0x0065:
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r5.f106086a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r1 = r5.f106086a
                int r1 = r1.getVoteStatus()
                r0.setStatus(r1)
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h r0 = r5.f106086a
                com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$f$1 r1 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$f$1
                r1.<init>(r5)
                java.lang.Runnable r1 = (java.lang.Runnable) r1
                r0.post(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.C40793f.run():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.h$g */
    public static final class C40795g implements C7498y<VoteResponse> {

        /* renamed from: a */
        final /* synthetic */ C40787h f106090a;

        /* renamed from: a */
        private static void m130374a(VoteResponse voteResponse) {
            C7573i.m23587b(voteResponse, "t");
        }

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
        }

        C40795g(C40787h hVar) {
            this.f106090a = hVar;
        }

        public final /* synthetic */ void onNext(Object obj) {
            m130374a((VoteResponse) obj);
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
            this.f106090a.f106064h.mo119661a(cVar);
        }
    }

    public final C40790c getAnimEndListener() {
        return this.f106056B;
    }

    public final C41850e getInteractStickerParams() {
        return this.f106075t;
    }

    public final InteractStickerStruct getInteractStickerStruct() {
        return this.f106081z;
    }

    public final Path getPath() {
        return this.f106079x;
    }

    public final C40788a getPbListener() {
        return this.f106055A;
    }

    public final float[] getPoints() {
        return this.f106077v;
    }

    public final int getStatus() {
        return this.f106076u;
    }

    public final FrameLayout getVoteView() {
        return this.f106080y;
    }

    /* renamed from: a */
    public final void mo101035a(String str) {
        C41850e eVar = this.f106075t;
        Long l = null;
        CharSequence charSequence = eVar != null ? eVar.f108853f : null;
        if (!(charSequence == null || charSequence.length() == 0)) {
            Context context = getContext();
            C7573i.m23582a((Object) context, "context");
            C41850e eVar2 = this.f106075t;
            String str2 = eVar2 != null ? eVar2.f108853f : null;
            C41850e eVar3 = this.f106075t;
            String str3 = eVar3 != null ? eVar3.f108854g : null;
            C41850e eVar4 = this.f106075t;
            String valueOf = String.valueOf(eVar4 != null ? Long.valueOf(eVar4.f108855h) : null);
            C41850e eVar5 = this.f106075t;
            if (eVar5 != null) {
                l = Long.valueOf(eVar5.f108856i);
            }
            if (l == null) {
                C7573i.m23580a();
            }
            C24932ae.m81790d(context, str, str2, str3, valueOf, l.longValue());
        }
    }

    /* renamed from: a */
    public final void mo101034a(Long l) {
        if (l != null) {
            VoteStruct voteStruct = this.f106066j;
            if ((voteStruct != null ? Long.valueOf(voteStruct.getVoteId()) : null) != null) {
                VoteApi voteApi = this.f106072q;
                VoteStruct voteStruct2 = this.f106066j;
                voteApi.vote(voteStruct2 != null ? voteStruct2.getVoteId() : 0, l.longValue()).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19189a((C7498y<? super T>) new C40795g<Object>(this));
            }
        }
    }

    /* renamed from: getStatus reason: collision with other method in class */
    public final Integer m150900getStatus() {
        return Integer.valueOf(this.f106076u);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f106064h.dispose();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getVoteStatus() {
        /*
            r6 = this;
            boolean r0 = r6.f106071p
            if (r0 == 0) goto L_0x0006
            r0 = 3
            return r0
        L_0x0006:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r0 = r6.f106066j
            r1 = 0
            if (r0 == 0) goto L_0x0014
            long r2 = r0.getSelectOptionId()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r6.f106066j
            r3 = 0
            if (r2 == 0) goto L_0x0031
            java.util.List r2 = r2.getOptions()
            if (r2 == 0) goto L_0x0031
            java.lang.Object r2 = r2.get(r3)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
            if (r2 == 0) goto L_0x0031
            long r4 = r2.getOptionId()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            goto L_0x0032
        L_0x0031:
            r2 = r1
        L_0x0032:
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            r2 = 1
            if (r0 == 0) goto L_0x003a
            return r2
        L_0x003a:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r0 = r6.f106066j
            if (r0 == 0) goto L_0x0047
            long r4 = r0.getSelectOptionId()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            goto L_0x0048
        L_0x0047:
            r0 = r1
        L_0x0048:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r4 = r6.f106066j
            if (r4 == 0) goto L_0x0062
            java.util.List r4 = r4.getOptions()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r2 = r4.get(r2)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
            if (r2 == 0) goto L_0x0062
            long r1 = r2.getOptionId()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L_0x0062:
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x006a
            r0 = 2
            return r0
        L_0x006a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.getVoteStatus():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r3 == null) goto L_0x005d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101030a() {
        /*
            r5 = this;
            java.lang.String r0 = "guest_poll_click"
            com.ss.android.ugc.aweme.app.g.d r1 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r2 = "group_id"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106075t
            r4 = 0
            if (r3 == 0) goto L_0x0014
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0014
            java.lang.String r3 = r3.f108844d
            goto L_0x0015
        L_0x0014:
            r3 = r4
        L_0x0015:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "author_id"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106075t
            if (r3 == 0) goto L_0x0026
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = r3.f108843c
            goto L_0x0027
        L_0x0026:
            r3 = r4
        L_0x0027:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "log_pb"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106075t
            if (r3 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = r3.f108845e
            goto L_0x0039
        L_0x0038:
            r3 = r4
        L_0x0039:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.lang.String r2 = "enter_from"
            com.ss.android.ugc.aweme.sticker.e r3 = r5.f106075t
            if (r3 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.sticker.d r3 = r3.f108861n
            if (r3 == 0) goto L_0x0049
            java.lang.String r4 = r3.f108842b
        L_0x0049:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r4)
            java.lang.String r2 = "prop_id"
            com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct r3 = r5.f106081z
            com.ss.android.ugc.aweme.sticker.data.StickerAttrStruct r3 = com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C40707a.m130167c(r3)
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = r3.getPollStickerId()
            if (r3 != 0) goto L_0x005f
        L_0x005d:
            java.lang.String r3 = ""
        L_0x005f:
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.mo101030a():void");
    }

    public final void setInteractStickerParams(C41850e eVar) {
        this.f106075t = eVar;
    }

    public final void setInteractStickerStruct(InteractStickerStruct interactStickerStruct) {
        this.f106081z = interactStickerStruct;
    }

    public final void setPoints(float[] fArr) {
        this.f106077v = fArr;
    }

    public final void setStatus(int i) {
        this.f106076u = i;
    }

    public final void setPbListener(C40788a aVar) {
        C7573i.m23587b(aVar, "<set-?>");
        this.f106055A = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f106071p) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: b */
    public final String mo101036b(String str) {
        if (str == null) {
            return "";
        }
        Paint paint = new Paint();
        Rect rect = new Rect();
        paint.setTypeface(Typeface.DEFAULT);
        paint.setTextSize(C9738o.m28690a(getContext(), 15.0f));
        int length = str.length() - 1;
        int length2 = str.length();
        while (true) {
            length2--;
            if (length2 < 0) {
                break;
            }
            paint.getTextBounds(str, 0, length2, rect);
            if (C9738o.m28708b(getContext(), 20.0f) + ((float) rect.width()) + C9738o.m28708b(getContext(), 49.0f) < ((float) this.f106057a.getWidth())) {
                length = length2;
                break;
            }
        }
        if (length < str.length() - 1) {
            StringBuilder sb = new StringBuilder();
            String substring = str.substring(0, length);
            C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append("...");
            str = sb.toString();
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Context context = getContext();
        C7573i.m23582a((Object) context, "context");
        if (C40707a.m130163a(context) && this.f106077v != null) {
            this.f106079x.reset();
            Path path = this.f106079x;
            float[] fArr = this.f106077v;
            if (fArr == null) {
                C7573i.m23580a();
            }
            float f = fArr[0];
            float[] fArr2 = this.f106077v;
            if (fArr2 == null) {
                C7573i.m23580a();
            }
            path.moveTo(f, fArr2[1]);
            Path path2 = this.f106079x;
            float[] fArr3 = this.f106077v;
            if (fArr3 == null) {
                C7573i.m23580a();
            }
            float f2 = fArr3[2];
            float[] fArr4 = this.f106077v;
            if (fArr4 == null) {
                C7573i.m23580a();
            }
            path2.lineTo(f2, fArr4[3]);
            Path path3 = this.f106079x;
            float[] fArr5 = this.f106077v;
            if (fArr5 == null) {
                C7573i.m23580a();
            }
            float f3 = fArr5[6];
            float[] fArr6 = this.f106077v;
            if (fArr6 == null) {
                C7573i.m23580a();
            }
            path3.lineTo(f3, fArr6[7]);
            Path path4 = this.f106079x;
            float[] fArr7 = this.f106077v;
            if (fArr7 == null) {
                C7573i.m23580a();
            }
            float f4 = fArr7[4];
            float[] fArr8 = this.f106077v;
            if (fArr8 == null) {
                C7573i.m23580a();
            }
            path4.lineTo(f4, fArr8[5]);
            this.f106079x.close();
            if (canvas != null) {
                canvas.drawPath(this.f106079x, this.f106078w);
            }
        }
    }

    public C40787h(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b52, this, false);
        if (inflate != null) {
            this.f106080y = (FrameLayout) inflate;
            this.f106055A = new C40788a();
            View findViewById = this.f106080y.findViewById(R.id.eeh);
            C7573i.m23582a((Object) findViewById, "voteView.findViewById(R.id.vote_title)");
            this.f106068m = (DmtTextView) findViewById;
            View findViewById2 = this.f106080y.findViewById(R.id.cuq);
            C7573i.m23582a((Object) findViewById2, "voteView.findViewById(R.id.rl_question1)");
            this.f106069n = (ViewGroup) findViewById2;
            View findViewById3 = this.f106080y.findViewById(R.id.eeb);
            C7573i.m23582a((Object) findViewById3, "voteView.findViewById(R.id.vote_question_1)");
            this.f106057a = (DispathTouchEventView) findViewById3;
            View findViewById4 = this.f106080y.findViewById(R.id.di2);
            C7573i.m23582a((Object) findViewById4, "voteView.findViewById(R.id.text_question_1)");
            this.f106058b = (DmtTextView) findViewById4;
            View findViewById5 = this.f106080y.findViewById(R.id.caa);
            C7573i.m23582a((Object) findViewById5, "voteView.findViewById(R.id.percent_question_1)");
            this.f106059c = (DmtTextView) findViewById5;
            View findViewById6 = this.f106080y.findViewById(R.id.cur);
            C7573i.m23582a((Object) findViewById6, "voteView.findViewById(R.id.rl_question2)");
            this.f106070o = (ViewGroup) findViewById6;
            View findViewById7 = this.f106080y.findViewById(R.id.eec);
            C7573i.m23582a((Object) findViewById7, "voteView.findViewById(R.id.vote_question_2)");
            this.f106060d = (DispathTouchEventView) findViewById7;
            View findViewById8 = this.f106080y.findViewById(R.id.di3);
            C7573i.m23582a((Object) findViewById8, "voteView.findViewById(R.id.text_question_2)");
            this.f106061e = (DmtTextView) findViewById8;
            View findViewById9 = this.f106080y.findViewById(R.id.cab);
            C7573i.m23582a((Object) findViewById9, "voteView.findViewById(R.id.percent_question_2)");
            this.f106062f = (DmtTextView) findViewById9;
            this.f106059c.setAlpha(0.0f);
            this.f106062f.setAlpha(0.0f);
            C40780d dVar = this;
            this.f106057a.setStatusView(dVar);
            this.f106060d.setStatusView(dVar);
            this.f106057a.setClickListener(this.f106055A);
            this.f106060d.setClickListener(this.f106055A);
            C0991u.m4230k((View) this.f106069n, C9738o.m28708b(getContext(), 4.0f));
            C0991u.m4230k((View) this.f106070o, C9738o.m28708b(getContext(), 4.0f));
            if (C7163a.m22363a()) {
                Paint paint = this.f106078w;
                Context context2 = getContext();
                C7573i.m23582a((Object) context2, "context");
                paint.setColor(context2.getResources().getColor(R.color.a3t));
                this.f106078w.setStyle(Style.STROKE);
                this.f106078w.setStrokeWidth(10.0f);
                setWillNotDraw(false);
            }
            Typeface typefaceByFontName = ((IAVService) ServiceManager.get().getService(IAVService.class)).getTypefaceByFontName(this.f106074s);
            if (typefaceByFontName != null) {
                this.f106068m.setTypeface(typefaceByFontName);
            }
            if (VERSION.SDK_INT >= 17) {
                FrameLayout frameLayout = this.f106080y;
                if (frameLayout != null) {
                    frameLayout.setLayoutDirection(3);
                }
                if (C43127fh.m136806a(getContext())) {
                    this.f106069n.setLayoutDirection(1);
                    this.f106070o.setLayoutDirection(1);
                } else {
                    this.f106069n.setLayoutDirection(0);
                    this.f106070o.setLayoutDirection(0);
                }
            }
            addView(this.f106080y);
            this.f106056B = new C40791d(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
    }

    /* renamed from: a */
    public final void mo101031a(int i) {
        switch (i) {
            case 0:
                m130359a(this.f106057a, this.f106058b, this.f106059c);
                m130359a(this.f106060d, this.f106061e, this.f106062f);
                return;
            case 1:
                this.f106057a.setProgressDrawable(getResources().getDrawable(R.drawable.coj));
                this.f106060d.setProgressDrawable(getResources().getDrawable(R.drawable.col));
                float a = mo101029a(0, 0);
                DmtTextView dmtTextView = this.f106059c;
                StringBuilder sb = new StringBuilder();
                String a2 = C1642a.m8034a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(a)}, 1));
                C7573i.m23582a((Object) a2, "java.lang.String.format(format, *args)");
                sb.append(a2);
                sb.append("%");
                dmtTextView.setText(sb.toString());
                DmtTextView dmtTextView2 = this.f106062f;
                StringBuilder sb2 = new StringBuilder();
                String a3 = C1642a.m8034a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(100.0f - a)}, 1));
                C7573i.m23582a((Object) a3, "java.lang.String.format(format, *args)");
                sb2.append(a3);
                sb2.append("%");
                dmtTextView2.setText(sb2.toString());
                int i2 = (int) a;
                m130361c(this.f106057a, this.f106058b, this.f106059c, i2);
                m130361c(this.f106060d, this.f106061e, this.f106062f, 100 - i2);
                return;
            case 2:
                this.f106060d.setProgressDrawable(getResources().getDrawable(R.drawable.coj));
                this.f106057a.setProgressDrawable(getResources().getDrawable(R.drawable.col));
                float a4 = mo101029a(0, 0);
                DmtTextView dmtTextView3 = this.f106059c;
                StringBuilder sb3 = new StringBuilder();
                String a5 = C1642a.m8034a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(a4)}, 1));
                C7573i.m23582a((Object) a5, "java.lang.String.format(format, *args)");
                sb3.append(a5);
                sb3.append("%");
                dmtTextView3.setText(sb3.toString());
                DmtTextView dmtTextView4 = this.f106062f;
                StringBuilder sb4 = new StringBuilder();
                String a6 = C1642a.m8034a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(100.0f - a4)}, 1));
                C7573i.m23582a((Object) a6, "java.lang.String.format(format, *args)");
                sb4.append(a6);
                sb4.append("%");
                dmtTextView4.setText(sb4.toString());
                int i3 = (int) a4;
                m130361c(this.f106057a, this.f106058b, this.f106059c, i3);
                m130361c(this.f106060d, this.f106061e, this.f106062f, 100 - i3);
                return;
            case 3:
                this.f106059c.setVisibility(0);
                this.f106062f.setVisibility(0);
                this.f106060d.setProgressDrawable(getResources().getDrawable(R.drawable.col));
                this.f106057a.setProgressDrawable(getResources().getDrawable(R.drawable.col));
                float a7 = mo101029a(0, 0);
                if (a7 != this.f106073r) {
                    DmtTextView dmtTextView5 = this.f106059c;
                    StringBuilder sb5 = new StringBuilder();
                    String a8 = C1642a.m8034a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(a7)}, 1));
                    C7573i.m23582a((Object) a8, "java.lang.String.format(format, *args)");
                    sb5.append(a8);
                    sb5.append("%");
                    dmtTextView5.setText(sb5.toString());
                    DmtTextView dmtTextView6 = this.f106062f;
                    StringBuilder sb6 = new StringBuilder();
                    String a9 = C1642a.m8034a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(100.0f - a7)}, 1));
                    C7573i.m23582a((Object) a9, "java.lang.String.format(format, *args)");
                    sb6.append(a9);
                    sb6.append("%");
                    dmtTextView6.setText(sb6.toString());
                    int i4 = (int) a7;
                    m130361c(this.f106057a, this.f106058b, this.f106059c, i4);
                    m130361c(this.f106060d, this.f106061e, this.f106062f, 100 - i4);
                    break;
                } else {
                    DmtTextView dmtTextView7 = this.f106059c;
                    StringBuilder sb7 = new StringBuilder();
                    String a10 = C1642a.m8034a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
                    C7573i.m23582a((Object) a10, "java.lang.String.format(format, *args)");
                    sb7.append(a10);
                    sb7.append("%");
                    dmtTextView7.setText(sb7.toString());
                    DmtTextView dmtTextView8 = this.f106062f;
                    StringBuilder sb8 = new StringBuilder();
                    String a11 = C1642a.m8034a("%.0f", Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
                    C7573i.m23582a((Object) a11, "java.lang.String.format(format, *args)");
                    sb8.append(a11);
                    sb8.append("%");
                    dmtTextView8.setText(sb8.toString());
                    m130361c(this.f106060d, this.f106061e, this.f106062f, 0);
                    m130361c(this.f106057a, this.f106058b, this.f106059c, 0);
                    return;
                }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo101029a(int r5, int r6) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r0 = r4.f106066j
            r1 = 0
            if (r0 == 0) goto L_0x001a
            java.util.List r0 = r0.getOptions()
            if (r0 == 0) goto L_0x001a
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r0 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r0
            if (r0 == 0) goto L_0x001a
            long r2 = r0.getVoteCount()
            float r0 = (float) r2
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r4.f106066j
            if (r2 == 0) goto L_0x0034
            java.util.List r2 = r2.getOptions()
            if (r2 == 0) goto L_0x0034
            r3 = 1
            java.lang.Object r2 = r2.get(r3)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r2 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r2
            if (r2 == 0) goto L_0x0034
            long r2 = r2.getVoteCount()
            float r2 = (float) r2
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            float r0 = r0 + r2
            float r6 = (float) r6
            float r0 = r0 + r6
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x0046
            boolean r5 = r4.f106071p
            if (r5 == 0) goto L_0x0043
            float r5 = r4.f106073r
            return r5
        L_0x0043:
            r5 = 1112014848(0x42480000, float:50.0)
            return r5
        L_0x0046:
            com.ss.android.ugc.aweme.sticker.data.VoteStruct r2 = r4.f106066j
            if (r2 == 0) goto L_0x005d
            java.util.List r2 = r2.getOptions()
            if (r2 == 0) goto L_0x005d
            java.lang.Object r5 = r2.get(r5)
            com.ss.android.ugc.aweme.sticker.data.VoteStruct$OptionsBean r5 = (com.p280ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean) r5
            if (r5 == 0) goto L_0x005d
            long r1 = r5.getVoteCount()
            float r1 = (float) r1
        L_0x005d:
            float r1 = r1 + r6
            float r1 = r1 / r0
            r5 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 * r5
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.C40787h.mo101029a(int, int):float");
    }

    /* renamed from: a */
    private static void m130359a(DispathTouchEventView dispathTouchEventView, DmtTextView dmtTextView, DmtTextView dmtTextView2) {
        dispathTouchEventView.setProgress(0);
        dmtTextView2.setAlpha(0.0f);
        dmtTextView.setTranslationX(0.0f);
    }

    /* renamed from: a */
    public final void mo101032a(DispathTouchEventView dispathTouchEventView, DmtTextView dmtTextView, DmtTextView dmtTextView2, int i) {
        dispathTouchEventView.setProgressDrawable(getResources().getDrawable(R.drawable.coj));
        m130360a(dispathTouchEventView, dmtTextView, dmtTextView2, i, true);
    }

    /* renamed from: b */
    public final void mo101037b(DispathTouchEventView dispathTouchEventView, DmtTextView dmtTextView, DmtTextView dmtTextView2, int i) {
        dispathTouchEventView.setProgressDrawable(getResources().getDrawable(R.drawable.col));
        m130360a(dispathTouchEventView, dmtTextView, dmtTextView2, i, false);
    }

    /* renamed from: c */
    private final void m130361c(DispathTouchEventView dispathTouchEventView, DmtTextView dmtTextView, DmtTextView dmtTextView2, int i) {
        float width = ((float) ((dispathTouchEventView.getWidth() - dmtTextView.getWidth()) / 2)) - C9738o.m28708b(getContext(), 20.0f);
        if (C43127fh.m136806a(getContext())) {
            width = -width;
        }
        dispathTouchEventView.setProgress(i);
        dmtTextView2.setAlpha(1.0f);
        dmtTextView.setTranslationX(-width);
    }

    /* renamed from: a */
    private final void m130360a(DispathTouchEventView dispathTouchEventView, DmtTextView dmtTextView, DmtTextView dmtTextView2, int i, boolean z) {
        float width = ((float) ((dispathTouchEventView.getWidth() - dmtTextView.getWidth()) / 2)) - C9738o.m28708b(getContext(), 20.0f);
        if (C43127fh.m136806a(getContext())) {
            width = -width;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(dispathTouchEventView, "progress", new int[]{0, i});
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(dmtTextView2, "alpha", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dmtTextView, "translationX", new float[]{0.0f, -width});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofInt});
        animatorSet.setDuration(300);
        animatorSet.addListener(new C40792e(this, z));
        animatorSet.start();
    }

    /* renamed from: a */
    public final void mo101033a(VoteStruct voteStruct, boolean z, String str, C41844c cVar, InteractStickerStruct interactStickerStruct) {
        CharSequence charSequence;
        this.f106066j = voteStruct;
        this.f106071p = z;
        if (str == null) {
            str = "";
        }
        this.f106063g = str;
        this.f106067k = cVar;
        this.f106081z = interactStickerStruct;
        String str2 = null;
        if (voteStruct != null) {
            charSequence = voteStruct.getQuestion();
        } else {
            charSequence = null;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f106068m.setVisibility(8);
        } else {
            this.f106068m.setVisibility(0);
            DmtTextView dmtTextView = this.f106068m;
            if (voteStruct != null) {
                str2 = voteStruct.getQuestion();
            }
            dmtTextView.setText(str2);
        }
        this.f106058b.post(new C40793f(this, voteStruct, cVar));
    }
}
