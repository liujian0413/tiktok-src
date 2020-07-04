package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.os.Environment;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.aweme.utils.C43170u;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.f */
public final class C43506f implements C11093e {

    /* renamed from: a */
    public C11087a f112657a;

    /* renamed from: b */
    private WeakReference<Context> f112658b;

    public C43506f(WeakReference<Context> weakReference, C11087a aVar) {
        this.f112658b = weakReference;
        this.f112657a = aVar;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        if (iVar != null && iVar.f30171d != null) {
            iVar.f30173f = false;
            float scale = this.f112657a.f30155d.getScale();
            m137987a((int) (((float) iVar.f30171d.getInt("width")) * scale), (int) (((float) iVar.f30171d.getInt("height")) * scale), (int) (((float) iVar.f30171d.getInt("left")) * scale), (int) (((float) iVar.f30171d.getInt("top")) * scale), iVar.f30171d.optInt("format", 0), iVar.f30169b);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ JSONObject m137986a(int i, C1592h hVar) throws Exception {
        String str;
        CompressFormat compressFormat;
        Object obj;
        if (hVar.mo6890e() == null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", 0);
            jSONObject.put("file_path", "");
            return jSONObject;
        }
        switch (i) {
            case 1:
                str = ".png";
                compressFormat = CompressFormat.PNG;
                break;
            case 2:
                str = ".webp";
                compressFormat = CompressFormat.WEBP;
                break;
            default:
                str = ".jpg";
                compressFormat = CompressFormat.JPEG;
                break;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath());
        sb.append(File.separator);
        sb.append("Camera");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder("share_");
        sb3.append(System.currentTimeMillis());
        sb3.append(str);
        File file = new File(sb2, sb3.toString());
        C42973bg.m136422a(file.getAbsolutePath(), true);
        boolean a = C43170u.m136919a((Bitmap) hVar.mo6890e(), file, 100, compressFormat);
        ((Bitmap) hVar.mo6890e()).recycle();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", a ? 1 : 0);
        String str2 = "file_path";
        if (a) {
            obj = file.getAbsoluteFile();
        } else {
            obj = "";
        }
        jSONObject2.put(str2, obj);
        return jSONObject2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Bitmap mo105424a(int i, int i2, int i3, int i4) throws Exception {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate((float) (-i3), (float) (-i4));
        this.f112657a.f30155d.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    private void m137987a(int i, int i2, int i3, int i4, int i5, final String str) {
        if (this.f112657a != null && this.f112657a.f30155d != null) {
            C43508g gVar = new C43508g(this, i, i2, i3, i4);
            C1592h.m7855a((Callable<TResult>) gVar, C1592h.f5958b).mo6876a((C1591g<TResult, TContinuationResult>) new C43509h<TResult,TContinuationResult>(i5), (Executor) C1592h.f5957a).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<JSONObject, Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(C1592h<JSONObject> hVar) throws Exception {
                    if (hVar.mo6890e() != null) {
                        C43506f.this.f112657a.mo27030a(str, (JSONObject) hVar.mo6890e());
                    }
                    return null;
                }
            }, C1592h.f5958b);
        }
    }
}
