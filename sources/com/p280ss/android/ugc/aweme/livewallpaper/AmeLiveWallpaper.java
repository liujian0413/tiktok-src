package com.p280ss.android.ugc.aweme.livewallpaper;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.service.wallpaper.WallpaperService;
import android.service.wallpaper.WallpaperService.Engine;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.livewallpaper.C32549a.C32553a;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32576d;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper */
public class AmeLiveWallpaper extends WallpaperService implements C32553a {

    /* renamed from: a */
    public static String f84859a;

    /* renamed from: b */
    public int f84860b;

    /* renamed from: c */
    public int f84861c;

    /* renamed from: d */
    public String f84862d;

    /* renamed from: e */
    public ArrayList<C32547a> f84863e = new ArrayList<>();

    /* renamed from: f */
    private ContentResolver f84864f;

    /* renamed from: g */
    private C32576d f84865g;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper$a */
    class C32547a extends Engine {

        /* renamed from: b */
        private C32549a f84867b;

        public final Bundle onCommand(String str, int i, int i2, int i3, Bundle bundle, boolean z) {
            return null;
        }

        /* renamed from: a */
        public final void mo83805a() {
            if (!TextUtils.isEmpty(AmeLiveWallpaper.this.f84862d)) {
                this.f84867b.f84878a = AmeLiveWallpaper.this.f84862d;
                this.f84867b.mo83822a(AmeLiveWallpaper.f84859a, AmeLiveWallpaper.this.f84860b, AmeLiveWallpaper.this.f84861c, true);
            }
        }

        private C32547a() {
            super(AmeLiveWallpaper.this);
            this.f84867b = new C32549a(AmeLiveWallpaper.this);
        }

        public final void onSurfaceDestroyed(SurfaceHolder surfaceHolder) {
            super.onSurfaceDestroyed(surfaceHolder);
            this.f84867b.mo83819a(surfaceHolder);
            AmeLiveWallpaper.this.f84863e.remove(this);
        }

        public final void onVisibilityChanged(boolean z) {
            super.onVisibilityChanged(z);
            this.f84867b.mo83823a(z);
        }

        public final void onSurfaceCreated(SurfaceHolder surfaceHolder) {
            super.onSurfaceCreated(surfaceHolder);
            AmeLiveWallpaper.this.mo83798a(false);
            AmeLiveWallpaper.this.mo83800b(false);
            if (C7276d.m22812b(AmeLiveWallpaper.f84859a)) {
                this.f84867b.mo83821a(surfaceHolder, AmeLiveWallpaper.f84859a, AmeLiveWallpaper.this.f84860b, AmeLiveWallpaper.this.f84861c, true);
            }
        }

        public final void onSurfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            this.f84867b.mo83820a(surfaceHolder, i, i2, i3);
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public Engine onCreateEngine() {
        C32547a aVar = new C32547a();
        this.f84863e.add(aVar);
        return aVar;
    }

    /* renamed from: b */
    private void m105398b() {
        Iterator it = this.f84863e.iterator();
        while (it.hasNext()) {
            ((C32547a) it.next()).mo83805a();
        }
    }

    public void onCreate() {
        super.onCreate();
        this.f84864f = getContentResolver();
        this.f84865g = (C32576d) C23336d.m76560a(AwemeApplication.m21341a(), C32576d.class);
    }

    /* renamed from: a */
    private void m105397a() {
        if (TextUtils.isEmpty(this.f84862d)) {
            if (this.f84864f != null) {
                this.f84862d = this.f84864f.getType(WallPaperDataProvider.f84873f);
            }
            if (TextUtils.isEmpty(this.f84862d)) {
                this.f84862d = this.f84865g.mo60451e("");
            }
        }
    }

    /* renamed from: a */
    public final void mo83798a(boolean z) {
        if (!z || !C7276d.m22812b(f84859a)) {
            if (this.f84864f != null) {
                f84859a = this.f84864f.getType(WallPaperDataProvider.f84868a);
            }
            if (TextUtils.isEmpty(f84859a)) {
                f84859a = this.f84865g.mo60448c("");
            }
            if (!C7276d.m22812b(f84859a) && this.f84864f != null) {
                f84859a = this.f84864f.getType(WallPaperDataProvider.f84871d);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002b */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030 A[Catch:{ Exception -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c A[Catch:{ Exception -> 0x0045 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83800b(boolean r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L_0x000b
            int r2 = r1.f84860b
            if (r2 <= 0) goto L_0x000b
            int r2 = r1.f84861c
            if (r2 <= 0) goto L_0x000b
            return
        L_0x000b:
            android.content.ContentResolver r2 = r1.f84864f
            if (r2 == 0) goto L_0x002b
            android.content.ContentResolver r2 = r1.f84864f     // Catch:{ NumberFormatException -> 0x001d }
            android.net.Uri r0 = com.p280ss.android.ugc.aweme.livewallpaper.WallPaperDataProvider.f84869b     // Catch:{ NumberFormatException -> 0x001d }
            java.lang.String r2 = r2.getType(r0)     // Catch:{ NumberFormatException -> 0x001d }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x001d }
            r1.f84860b = r2     // Catch:{ NumberFormatException -> 0x001d }
        L_0x001d:
            android.content.ContentResolver r2 = r1.f84864f     // Catch:{ NumberFormatException -> 0x002b }
            android.net.Uri r0 = com.p280ss.android.ugc.aweme.livewallpaper.WallPaperDataProvider.f84870c     // Catch:{ NumberFormatException -> 0x002b }
            java.lang.String r2 = r2.getType(r0)     // Catch:{ NumberFormatException -> 0x002b }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x002b }
            r1.f84861c = r2     // Catch:{ NumberFormatException -> 0x002b }
        L_0x002b:
            int r2 = r1.f84860b     // Catch:{ Exception -> 0x0045 }
            r0 = 0
            if (r2 > 0) goto L_0x0038
            com.ss.android.ugc.aweme.livewallpaper.b.d r2 = r1.f84865g     // Catch:{ Exception -> 0x0045 }
            int r2 = r2.mo60443a(r0)     // Catch:{ Exception -> 0x0045 }
            r1.f84860b = r2     // Catch:{ Exception -> 0x0045 }
        L_0x0038:
            int r2 = r1.f84861c     // Catch:{ Exception -> 0x0045 }
            if (r2 > 0) goto L_0x0044
            com.ss.android.ugc.aweme.livewallpaper.b.d r2 = r1.f84865g     // Catch:{ Exception -> 0x0045 }
            int r2 = r2.mo60447c(r0)     // Catch:{ Exception -> 0x0045 }
            r1.f84861c = r2     // Catch:{ Exception -> 0x0045 }
        L_0x0044:
            return
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper.mo83800b(boolean):void");
    }

    /* renamed from: a */
    public final void mo83799a(boolean z, String str, String str2) {
        m105399b(z, str, str2);
    }

    /* renamed from: b */
    private void m105399b(boolean z, String str, String str2) {
        if (this.f84864f != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("result", Boolean.valueOf(z));
            contentValues.put("source", str);
            contentValues.put("message", str2);
            try {
                this.f84864f.insert(WallPaperDataProvider.f84872e, contentValues);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("LiveWallPaper insert failed ");
                sb.append(e.getMessage());
                C42880h.m136156a(sb.toString());
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            String stringExtra = intent.getStringExtra("video_path");
            if (!TextUtils.isEmpty(stringExtra)) {
                f84859a = stringExtra;
            }
            this.f84860b = intent.getIntExtra("video_width", 0);
            this.f84861c = intent.getIntExtra("video_height", 0);
            this.f84862d = intent.getStringExtra("source");
        }
        mo83798a(true);
        mo83800b(true);
        m105397a();
        m105398b();
        return super.onStartCommand(intent, i, i2);
    }
}
