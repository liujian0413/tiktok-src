package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import com.p280ss.android.ugc.aweme.base.activity.C23255b;
import com.p280ss.android.ugc.aweme.p1216fe.method.upload.C28035a;
import com.p280ss.android.ugc.aweme.views.DmtLoadingDialog;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import org.json.JSONArray;

/* renamed from: com.ss.android.ugc.aweme.fe.method.a */
public abstract class C27940a implements C23255b, C27996m {

    /* renamed from: a */
    public WeakReference<Activity> f73615a;

    /* renamed from: b */
    public C27943a f73616b = new C27943a();

    /* renamed from: c */
    public C28035a f73617c;

    /* renamed from: d */
    public short[] f73618d;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.a$a */
    public static class C27943a {

        /* renamed from: a */
        private DmtLoadingDialog f73622a;

        /* renamed from: b */
        private WeakReference<C28035a> f73623b;

        /* renamed from: a */
        public final void mo71419a() {
            if (this.f73622a != null) {
                this.f73622a.dismiss();
                this.f73622a = null;
                if (this.f73623b != null) {
                    this.f73623b.clear();
                    this.f73623b = null;
                }
            }
        }

        /* renamed from: a */
        public final void mo71420a(Context context) {
            if (this.f73622a == null || !this.f73622a.isShowing()) {
                this.f73622a = new DmtLoadingDialog(context, context.getString(R.string.fl0));
                this.f73622a.show();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo71422a(DialogInterface dialogInterface) {
            if (this.f73623b.get() != null) {
                ((C28035a) this.f73623b.get()).mo71423a();
            }
        }

        /* renamed from: a */
        public final void mo71421a(Context context, C28035a aVar) {
            this.f73622a = new DmtLoadingDialog(context, context.getString(R.string.fl0));
            this.f73623b = new WeakReference<>(aVar);
            this.f73622a.setOnCancelListener(new C27950b(this));
            this.f73622a.show();
        }
    }

    /* renamed from: a */
    public final void mo71415a() {
        this.f73616b.mo71419a();
    }

    C27940a(Activity activity) {
        this.f73615a = new WeakReference<>(activity);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        if (r0.equals("camera-image") != false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo71416a(final org.json.JSONObject r6) throws org.json.JSONException {
        /*
            r5 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r5.f73615a
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r1 = r0 instanceof com.p280ss.android.ugc.aweme.base.activity.C23257d
            r2 = 0
            if (r1 != 0) goto L_0x0013
            java.lang.String r6 = "uploadFailed"
            r5.mo71399a(r2, r6)
            return
        L_0x0013:
            java.lang.String r1 = "features"
            org.json.JSONArray r1 = r6.optJSONArray(r1)
            java.lang.String r3 = "showActionSheet"
            boolean r3 = r6.optBoolean(r3)
            r4 = r0
            com.ss.android.ugc.aweme.base.activity.d r4 = (com.p280ss.android.ugc.aweme.base.activity.C23257d) r4
            r4.mo60524a(r5)
            if (r3 != 0) goto L_0x00c4
            java.lang.String r0 = r1.optString(r2)
            r1 = -1
            int r3 = r0.hashCode()
            r4 = -2031693645(0xffffffff86e6d0b3, float:-8.682304E-35)
            if (r3 == r4) goto L_0x0063
            r2 = -2019804205(0xffffffff879c3bd3, float:-2.3507433E-34)
            if (r3 == r2) goto L_0x0059
            r2 = -1903465347(0xffffffff8e8b6c7d, float:-3.4370616E-30)
            if (r3 == r2) goto L_0x004f
            r2 = -1891575907(0xffffffff8f40d79d, float:-9.5078565E-30)
            if (r3 == r2) goto L_0x0045
            goto L_0x006c
        L_0x0045:
            java.lang.String r2 = "album-video"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006c
            r2 = 3
            goto L_0x006d
        L_0x004f:
            java.lang.String r2 = "album-image"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006c
            r2 = 1
            goto L_0x006d
        L_0x0059:
            java.lang.String r2 = "camera-video"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006c
            r2 = 2
            goto L_0x006d
        L_0x0063:
            java.lang.String r3 = "camera-image"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r2 = -1
        L_0x006d:
            switch(r2) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x00a1;
                case 2: goto L_0x0089;
                case 3: goto L_0x0071;
                default: goto L_0x0070;
            }
        L_0x0070:
            goto L_0x00c3
        L_0x0071:
            java.lang.String r0 = "type"
            r1 = 700(0x2bc, float:9.81E-43)
            r6.put(r0, r1)
            com.ss.android.ugc.aweme.fe.method.upload.d r0 = new com.ss.android.ugc.aweme.fe.method.upload.d
            java.lang.ref.WeakReference<android.app.Activity> r1 = r5.f73615a
            com.ss.android.ugc.aweme.fe.method.a$a r2 = r5.f73616b
            r0.<init>(r1, r2, r5)
            r5.f73617c = r0
            com.ss.android.ugc.aweme.fe.method.upload.a r0 = r5.f73617c
            r0.mo71425a(r6)
            goto L_0x00c3
        L_0x0089:
            java.lang.String r0 = "type"
            r1 = 800(0x320, float:1.121E-42)
            r6.put(r0, r1)
            com.ss.android.ugc.aweme.fe.method.upload.d r0 = new com.ss.android.ugc.aweme.fe.method.upload.d
            java.lang.ref.WeakReference<android.app.Activity> r1 = r5.f73615a
            com.ss.android.ugc.aweme.fe.method.a$a r2 = r5.f73616b
            r0.<init>(r1, r2, r5)
            r5.f73617c = r0
            com.ss.android.ugc.aweme.fe.method.upload.a r0 = r5.f73617c
            r0.mo71425a(r6)
            return
        L_0x00a1:
            com.ss.android.ugc.aweme.fe.method.upload.c r0 = new com.ss.android.ugc.aweme.fe.method.upload.c
            java.lang.ref.WeakReference<android.app.Activity> r1 = r5.f73615a
            com.ss.android.ugc.aweme.fe.method.a$a r2 = r5.f73616b
            r0.<init>(r1, r2, r5)
            r5.f73617c = r0
            com.ss.android.ugc.aweme.fe.method.upload.a r0 = r5.f73617c
            r0.mo71425a(r6)
            return
        L_0x00b2:
            com.ss.android.ugc.aweme.fe.method.a.a r0 = new com.ss.android.ugc.aweme.fe.method.a.a
            java.lang.ref.WeakReference<android.app.Activity> r1 = r5.f73615a
            com.ss.android.ugc.aweme.fe.method.a$a r2 = r5.f73616b
            r0.<init>(r1, r2, r5)
            r5.f73617c = r0
            com.ss.android.ugc.aweme.fe.method.upload.a r0 = r5.f73617c
            r0.mo71425a(r6)
            return
        L_0x00c3:
            return
        L_0x00c4:
            android.content.res.Resources r2 = r0.getResources()
            java.lang.String[] r1 = r5.m91507a(r2, r1)
            com.bytedance.ies.uikit.dialog.b$a r2 = new com.bytedance.ies.uikit.dialog.b$a
            r2.<init>(r0)
            com.ss.android.ugc.aweme.fe.method.a$1 r0 = new com.ss.android.ugc.aweme.fe.method.a$1
            r0.<init>(r6)
            com.bytedance.ies.uikit.dialog.b$a r6 = r2.mo26643a(r1, r0)
            com.bytedance.ies.uikit.dialog.b r6 = r6.mo26644a()
            com.ss.android.ugc.aweme.fe.method.a$2 r0 = new com.ss.android.ugc.aweme.fe.method.a$2
            r0.<init>()
            r6.setOnCancelListener(r0)
            r6.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p1216fe.method.C27940a.mo71416a(org.json.JSONObject):void");
    }

    /* renamed from: a */
    private String[] m91507a(Resources resources, JSONArray jSONArray) {
        String[] strArr = {resources.getString(R.string.al6), resources.getString(R.string.akh), resources.getString(R.string.aln), resources.getString(R.string.alo), resources.getString(R.string.w_)};
        String[] strArr2 = new String[(jSONArray.length() + 1)];
        this.f73618d = new short[strArr2.length];
        for (int i = 0; i < strArr2.length; i++) {
            String optString = jSONArray.optString(i);
            char c = 65535;
            int hashCode = optString.hashCode();
            if (hashCode != -2031693645) {
                if (hashCode != -2019804205) {
                    if (hashCode != -1903465347) {
                        if (hashCode == -1891575907 && optString.equals("album-video")) {
                            c = 3;
                        }
                    } else if (optString.equals("album-image")) {
                        c = 2;
                    }
                } else if (optString.equals("camera-video")) {
                    c = 1;
                }
            } else if (optString.equals("camera-image")) {
                c = 0;
            }
            switch (c) {
                case 0:
                    this.f73618d[i] = 0;
                    strArr2[i] = strArr[0];
                    break;
                case 1:
                    this.f73618d[i] = 2;
                    strArr2[i] = strArr[2];
                    break;
                case 2:
                    this.f73618d[i] = 1;
                    strArr2[i] = strArr[1];
                    break;
                case 3:
                    this.f73618d[i] = 3;
                    strArr2[i] = strArr[3];
                    break;
                default:
                    this.f73618d[i] = 4;
                    strArr2[i] = strArr[4];
                    break;
            }
        }
        return strArr2;
    }

    /* renamed from: a */
    public final boolean mo60523a(int i, int i2, Intent intent) {
        if ((i == 1 || i == 600 || i == 700 || i == 800 || i == 900 || i == 10003) && this.f73617c != null) {
            return this.f73617c.mo71426a(i, i2, intent);
        }
        mo71399a(0, "uploadFailed");
        return true;
    }
}
