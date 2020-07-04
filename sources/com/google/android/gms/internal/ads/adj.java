package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager.BadTokenException;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.ArrayList;
import java.util.List;

@C6505uv
public final class adj {

    /* renamed from: a */
    public String f40029a;

    /* renamed from: b */
    public String f40030b;

    /* renamed from: c */
    public String f40031c;

    /* renamed from: d */
    public String f40032d;

    /* renamed from: e */
    private final Context f40033e;

    /* renamed from: f */
    private int f40034f;

    /* renamed from: g */
    private int f40035g;

    /* renamed from: h */
    private PointF f40036h;

    /* renamed from: i */
    private PointF f40037i;

    /* renamed from: j */
    private Handler f40038j;

    /* renamed from: k */
    private Runnable f40039k;

    public adj(Context context) {
        this.f40039k = new adk(this);
        this.f40033e = context;
        this.f40035g = ViewConfiguration.get(context).getScaledTouchSlop();
        C14793ay.m42908n().mo39258a();
        this.f40038j = C14793ay.m42908n().f40103a;
    }

    public adj(Context context, String str) {
        this(context);
        this.f40029a = str;
    }

    /* renamed from: a */
    public final void mo39215a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f40034f = 0;
            this.f40036h = new PointF(motionEvent.getX(0), motionEvent.getY(0));
        } else if (this.f40034f != -1) {
            boolean z = true;
            if (this.f40034f == 0 && actionMasked == 5) {
                this.f40034f = 5;
                this.f40037i = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f40038j.postDelayed(this.f40039k, ((Long) bym.m50299d().mo41272a(C15585bw.f43907cv)).longValue());
                return;
            }
            if (this.f40034f == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z2 = false;
                        for (int i = 0; i < historySize; i++) {
                            if (!m45639a(motionEvent.getHistoricalX(0, i), motionEvent.getHistoricalY(0, i), motionEvent.getHistoricalX(1, i), motionEvent.getHistoricalY(1, i))) {
                                z2 = true;
                            }
                        }
                        if (m45639a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1))) {
                            z = z2;
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    this.f40034f = -1;
                    this.f40038j.removeCallbacks(this.f40039k);
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m45639a(float f, float f2, float f3, float f4) {
        return Math.abs(this.f40036h.x - f) < ((float) this.f40035g) && Math.abs(this.f40036h.y - f2) < ((float) this.f40035g) && Math.abs(this.f40037i.x - f3) < ((float) this.f40035g) && Math.abs(this.f40037i.y - f4) < ((float) this.f40035g);
    }

    /* renamed from: a */
    public final void mo39213a() {
        try {
            if (!(this.f40033e instanceof Activity)) {
                acd.m45781d("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(C14793ay.m42903i().mo39229a()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = C14793ay.m42903i().mo39233b() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            int a = m45638a((List<String>) arrayList, "Ad Information", true);
            int a2 = m45638a((List<String>) arrayList, str, true);
            int a3 = m45638a((List<String>) arrayList, str2, true);
            Builder builder = new Builder(this.f40033e, C14793ay.m42896b().mo39205d());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new adl(this, a, a2, a3));
            builder.create().show();
        } catch (BadTokenException unused) {
            acd.m45439a();
        }
    }

    /* renamed from: a */
    private static int m45638a(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f40029a);
        sb.append(",DebugSignal: ");
        sb.append(this.f40032d);
        sb.append(",AFMA Version: ");
        sb.append(this.f40031c);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f40030b);
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo39217b() {
        C14793ay.m42903i().mo39231a(this.f40033e, this.f40030b, this.f40031c, this.f40032d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo39218c() {
        C14793ay.m42903i().mo39230a(this.f40033e, this.f40030b, this.f40031c);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo39216a(String str, DialogInterface dialogInterface, int i) {
        acl.m45526a(this.f40033e, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006b, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x0070;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo39214a(int r1, int r2, int r3, android.content.DialogInterface r4, int r5) {
        /*
            r0 = this;
            if (r5 != r1) goto L_0x0098
            android.content.Context r1 = r0.f40033e
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 != 0) goto L_0x000e
            java.lang.String r1 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.ads.acd.m45781d(r1)
            return
        L_0x000e:
            java.lang.String r1 = r0.f40029a
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x006e
            java.lang.String r2 = "\\+"
            java.lang.String r3 = "%20"
            java.lang.String r1 = r1.replaceAll(r2, r3)
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r1 = r2.encodedQuery(r1)
            android.net.Uri r1 = r1.build()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.Map r1 = com.google.android.gms.internal.ads.acl.m45523a(r1)
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x003c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x005f
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r5 = " = "
            r2.append(r5)
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r4 = "\n\n"
            r2.append(r4)
            goto L_0x003c
        L_0x005f:
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            java.lang.String r1 = "No debug information"
        L_0x0070:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.content.Context r3 = r0.f40033e
            r2.<init>(r3)
            r2.setMessage(r1)
            java.lang.String r3 = "Ad Information"
            r2.setTitle(r3)
            java.lang.String r3 = "Share"
            com.google.android.gms.internal.ads.adm r4 = new com.google.android.gms.internal.ads.adm
            r4.<init>(r0, r1)
            r2.setPositiveButton(r3, r4)
            java.lang.String r1 = "Close"
            android.content.DialogInterface$OnClickListener r3 = com.google.android.gms.internal.ads.adn.f40047a
            r2.setNegativeButton(r1, r3)
            android.app.AlertDialog r1 = r2.create()
            r1.show()
            return
        L_0x0098:
            if (r5 != r2) goto L_0x00a8
            java.lang.String r1 = "Debug mode [Creative Preview] selected."
            com.google.android.gms.internal.ads.acd.m45777b(r1)
            com.google.android.gms.internal.ads.ado r1 = new com.google.android.gms.internal.ads.ado
            r1.<init>(r0)
            com.google.android.gms.internal.ads.acj.m45508a(r1)
            return
        L_0x00a8:
            if (r5 != r3) goto L_0x00b7
            java.lang.String r1 = "Debug mode [Troubleshooting] selected."
            com.google.android.gms.internal.ads.acd.m45777b(r1)
            com.google.android.gms.internal.ads.adp r1 = new com.google.android.gms.internal.ads.adp
            r1.<init>(r0)
            com.google.android.gms.internal.ads.acj.m45508a(r1)
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.adj.mo39214a(int, int, int, android.content.DialogInterface, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo39219d() {
        this.f40034f = 4;
        mo39213a();
    }
}
