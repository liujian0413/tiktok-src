package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.widget.CommonToastLayout.C5759a;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public class CommonToastWidget extends LiveWidget {

    /* renamed from: a */
    private C5759a f15773a = C5752u.f16865a;

    /* renamed from: a */
    private static String m17186a(String str) {
        if (str.length() != 9) {
            return str;
        }
        StringBuilder sb = new StringBuilder("#");
        sb.append(str.substring(7, 9));
        sb.append(str.substring(1, 7));
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x016a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13705a(com.bytedance.android.livesdk.message.model.C8686r r12) {
        /*
            r11 = this;
            com.bytedance.android.livesdkapi.message.b r0 = r12.baseMessage
            com.bytedance.android.livesdkapi.message.f r0 = r0.f26000j
            if (r0 != 0) goto L_0x000c
            com.bytedance.android.livesdk.chatroom.bl.PlatformMessageHelper r12 = com.bytedance.android.livesdk.chatroom.p209bl.PlatformMessageHelper.INSTANCE
            r12.onMessageFinish()
            return
        L_0x000c:
            java.lang.String r1 = r12.f23658d
            if (r1 != 0) goto L_0x0014
            java.lang.String r1 = "#ff9d5c"
            r12.f23658d = r1
        L_0x0014:
            java.lang.String r1 = r12.f23659e
            if (r1 != 0) goto L_0x001c
            java.lang.String r1 = "#ff5c67"
            r12.f23659e = r1
        L_0x001c:
            java.lang.String r1 = r12.f23660f
            if (r1 != 0) goto L_0x0024
            java.lang.String r1 = "#ffffff"
            r12.f23660f = r1
        L_0x0024:
            android.content.Context r1 = r11.context
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131495110(0x7f0c08c6, float:1.8613747E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            com.bytedance.android.livesdk.chatroom.widget.CommonToastLayout r1 = (com.bytedance.android.livesdk.chatroom.widget.CommonToastLayout) r1
            com.bytedance.android.livesdk.chatroom.widget.CommonToastLayout$a r2 = r11.f15773a
            r1.setOnDetachListener(r2)
            r2 = 2131297290(0x7f09040a, float:1.821252E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r3 = 2131302441(0x7f091829, float:1.8222968E38)
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r4 = 2131299136(0x7f090b40, float:1.8216265E38)
            android.view.View r4 = r1.findViewById(r4)
            com.bytedance.android.live.core.widget.HSImageView r4 = (com.bytedance.android.live.core.widget.HSImageView) r4
            java.lang.String r5 = "#ff9d5c"
            int r5 = android.graphics.Color.parseColor(r5)
            java.lang.String r6 = "#ff5c67"
            int r6 = android.graphics.Color.parseColor(r6)
            java.lang.String r7 = r12.f23658d     // Catch:{ Exception -> 0x007c }
            java.lang.String r7 = m17186a(r7)     // Catch:{ Exception -> 0x007c }
            java.lang.String r8 = r12.f23659e     // Catch:{ Exception -> 0x007c }
            java.lang.String r8 = m17186a(r8)     // Catch:{ Exception -> 0x007c }
            int r7 = android.graphics.Color.parseColor(r7)     // Catch:{ Exception -> 0x007c }
            int r5 = android.graphics.Color.parseColor(r8)     // Catch:{ Exception -> 0x0077 }
            r6 = r5
            r5 = r7
            goto L_0x0087
        L_0x0077:
            r5 = move-exception
            r10 = r7
            r7 = r5
            r5 = r10
            goto L_0x007d
        L_0x007c:
            r7 = move-exception
        L_0x007d:
            r8 = 6
            java.lang.String r9 = "CommonToastWidget"
            java.lang.StackTraceElement[] r7 = r7.getStackTrace()
            com.bytedance.android.live.core.p147c.C3166a.m11955a(r8, r9, r7)
        L_0x0087:
            r7 = 2
            int[] r8 = new int[r7]
            r9 = 0
            r8[r9] = r5
            r5 = 1
            r8[r5] = r6
            android.content.Context r5 = r11.context
            boolean r5 = com.bytedance.android.live.uikit.p176d.C3519c.m12965a(r5)
            if (r5 == 0) goto L_0x00a0
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r6 = android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT
            r5.<init>(r6, r8)
            goto L_0x00a7
        L_0x00a0:
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r6 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            r5.<init>(r6, r8)
        L_0x00a7:
            r6 = 1090519040(0x41000000, float:8.0)
            int r6 = com.bytedance.android.live.core.utils.C3358ac.m12510a(r6)
            float r6 = (float) r6
            r5.setCornerRadius(r6)
            r2.setBackgroundDrawable(r5)
            com.bytedance.android.live.base.model.ImageModel r2 = r12.f23662h
            if (r2 == 0) goto L_0x00e6
            r4.setVisibility(r9)
            int r2 = r12.f23663i
            if (r2 <= 0) goto L_0x00e0
            int r2 = r12.f23664j
            if (r2 <= 0) goto L_0x00e0
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            int r5 = r12.f23663i
            r2.width = r5
            int r5 = r12.f23664j
            r2.height = r5
            r4.requestLayout()
            com.bytedance.android.live.base.model.ImageModel r2 = r12.f23662h
            int r5 = r4.getWidth()
            int r6 = r4.getHeight()
            com.bytedance.android.livesdk.chatroom.utils.C5343e.m17032a(r4, r2, r5, r6)
            goto L_0x00eb
        L_0x00e0:
            com.bytedance.android.live.base.model.ImageModel r2 = r12.f23662h
            com.bytedance.android.livesdk.chatroom.utils.C5343e.m17030a(r4, r2)
            goto L_0x00eb
        L_0x00e6:
            r2 = 8
            r4.setVisibility(r2)
        L_0x00eb:
            java.lang.String r2 = r0.f26014b
            java.lang.String r4 = r0.f26013a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x010b
            com.bytedance.android.livesdk.i18n.b r4 = com.bytedance.android.livesdk.i18n.C8317b.m25387a()
            java.lang.String r5 = r0.f26013a
            java.lang.String r4 = r4.mo21482a(r5)
            if (r4 == 0) goto L_0x010b
            com.bytedance.android.livesdk.i18n.b r2 = com.bytedance.android.livesdk.i18n.C8317b.m25387a()
            java.lang.String r4 = r0.f26013a
            java.lang.String r2 = r2.mo21482a(r4)
        L_0x010b:
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.p212e.C4374z.m14751a(r2, r0)
            r3.setText(r0)
            int r0 = r12.f23661g
            if (r0 == 0) goto L_0x0125
            if (r0 == r7) goto L_0x011c
            r0 = 17
            r2 = 0
            goto L_0x012d
        L_0x011c:
            r0 = 80
            r2 = 1115684864(0x42800000, float:64.0)
            int r2 = com.bytedance.android.live.core.utils.C3358ac.m12510a(r2)
            goto L_0x012d
        L_0x0125:
            r0 = 48
            r2 = 1116733440(0x42900000, float:72.0)
            int r2 = com.bytedance.android.live.core.utils.C3358ac.m12510a(r2)
        L_0x012d:
            boolean r3 = r12.f23665k
            if (r3 == 0) goto L_0x016a
            com.bytedance.android.livesdk.widget.h$a r0 = new com.bytedance.android.livesdk.widget.h$a
            android.content.Context r2 = r11.context
            r0.<init>(r2)
            com.bytedance.android.livesdk.widget.h$a r0 = r0.mo22714a(r1)
            com.bytedance.android.livesdk.widget.h r0 = r0.mo22729d()
            int r1 = r12.f23657c
            if (r1 <= 0) goto L_0x0169
            int r12 = r12.f23657c
            long r1 = (long) r12
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.aa r12 = p346io.reactivex.C7319aa.m22922a(r1, r12)
            io.reactivex.z r1 = p346io.reactivex.p1865a.p1867b.C47549a.m148327a()
            io.reactivex.aa r12 = r12.mo19127a(r1)
            com.bytedance.android.live.core.rxutils.autodispose.m r1 = r11.autoDispose()
            java.lang.Object r12 = r12.mo19131a(r1)
            com.bytedance.android.live.core.rxutils.autodispose.af r12 = (com.bytedance.android.live.core.rxutils.autodispose.C3247af) r12
            com.bytedance.android.livesdk.chatroom.viewmodule.v r1 = new com.bytedance.android.livesdk.chatroom.viewmodule.v
            r1.<init>(r0)
            io.reactivex.d.g r0 = com.bytedance.android.livesdk.chatroom.viewmodule.C5754w.f16867a
            r12.mo10187a(r1, r0)
        L_0x0169:
            return
        L_0x016a:
            android.widget.Toast r3 = new android.widget.Toast
            android.content.Context r4 = r11.context
            android.content.Context r4 = r4.getApplicationContext()
            r3.<init>(r4)
            r3.setView(r1)
            r3.setGravity(r0, r9, r2)
            int r0 = r12.f23657c
            if (r0 <= 0) goto L_0x0181
            int r9 = r12.f23657c
        L_0x0181:
            r3.setDuration(r9)
            com.bytedance.android.livesdk.chatroom.viewmodule.C5755x.m18121a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.CommonToastWidget.mo13705a(com.bytedance.android.livesdk.message.model.r):void");
    }
}
