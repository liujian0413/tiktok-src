package com.p280ss.android.ugc.aweme.p1216fe.method.p1219a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Message;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27940a.C27943a;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27996m;
import com.p280ss.android.ugc.aweme.p1216fe.method.upload.C28035a;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.p280ss.android.ugc.aweme.photo.C34729c;
import com.p280ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.a.a */
public final class C27944a implements C6310a, C28035a {

    /* renamed from: a */
    public String f73624a = "";

    /* renamed from: b */
    public C27996m f73625b;

    /* renamed from: c */
    private String f73626c = "";

    /* renamed from: d */
    private C27948c f73627d;

    /* renamed from: e */
    private WeakReference<Activity> f73628e;

    /* renamed from: f */
    private C27943a f73629f;

    /* renamed from: g */
    private Executor f73630g = C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SERIAL).mo18994a("takephoto").mo18996a());

    /* renamed from: h */
    private Executor f73631h = C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SERIAL).mo18994a("uploadphoto").mo18996a());

    /* renamed from: com.ss.android.ugc.aweme.fe.method.a.a$a */
    static class C27946a implements Runnable {

        /* renamed from: a */
        private WeakReference<C27947b> f73634a;

        /* renamed from: b */
        private WeakReference<C27996m> f73635b;

        public final void run() {
            C27947b bVar = (C27947b) this.f73634a.get();
            C27996m mVar = (C27996m) this.f73635b.get();
            if (bVar != null && mVar != null) {
                try {
                    mVar.mo71400a(m91524a(bVar));
                } catch (JSONException unused) {
                    mVar.mo71399a(0, "uploadFailed");
                }
            }
        }

        /* renamed from: a */
        private static JSONArray m91524a(C27947b bVar) throws JSONException {
            String str;
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(bVar.f73636a)) {
                jSONObject.put("url", bVar.f73636a);
            }
            if (!TextUtils.isEmpty(bVar.f73637b)) {
                jSONObject.put("uri", bVar.f73637b);
            }
            try {
                str = C42973bg.m136430b(((IAVService) ServiceManager.get().getService(IAVService.class)).photoService().compress(bVar.f73638c, new C34729c(), 216, 384).mPhotoLocalPath);
            } catch (IOException unused) {
                str = "";
            }
            jSONObject.put("base64", str);
            jSONArray.put(jSONObject);
            return jSONArray;
        }

        C27946a(C27947b bVar, C27996m mVar) {
            this.f73634a = new WeakReference<>(bVar);
            this.f73635b = new WeakReference<>(mVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.a.a$b */
    static class C27947b {

        /* renamed from: a */
        public String f73636a;

        /* renamed from: b */
        public String f73637b;

        /* renamed from: c */
        public String f73638c;

        C27947b(String str, String str2, String str3) {
            this.f73636a = str;
            this.f73637b = str2;
            this.f73638c = str3;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.a.a$c */
    static class C27948c extends AsyncTask<Void, Void, File> {

        /* renamed from: a */
        private WeakReference<Activity> f73639a;

        /* renamed from: b */
        private WeakReference<C27944a> f73640b;

        /* access modifiers changed from: protected */
        public final void onCancelled() {
            C27944a aVar = (C27944a) this.f73640b.get();
            if (aVar != null) {
                aVar.f73625b.mo71399a(0, "uploadCancel");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public File doInBackground(Void... voidArr) {
            Context context = (Context) this.f73639a.get();
            if (context == null) {
                return null;
            }
            try {
                return m91525a(context);
            } catch (IOException unused) {
                return null;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onPostExecute(File file) {
            C27944a aVar = (C27944a) this.f73640b.get();
            Activity activity = (Activity) this.f73639a.get();
            if (aVar != null && activity != null) {
                if (file == null) {
                    aVar.f73625b.mo71399a(0, "uploadFailed");
                    return;
                }
                aVar.f73624a = file.getAbsolutePath();
                Uri a = C19929d.m65754a((Context) activity, file);
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                intent.putExtra("output", a);
                intent.addFlags(3);
                activity.startActivityForResult(intent, 1);
            }
        }

        /* renamed from: a */
        private static File m91525a(Context context) throws IOException {
            String format = new SimpleDateFormat("yyyy-MMdd_HHmmss").format(new Date());
            StringBuilder sb = new StringBuilder("Dou_fsm_");
            sb.append(format);
            String sb2 = sb.toString();
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
                externalStoragePublicDirectory = context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            }
            if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
                externalStoragePublicDirectory = context.getFilesDir();
            }
            return File.createTempFile(sb2, ".jpg", externalStoragePublicDirectory);
        }

        C27948c(Activity activity, C27944a aVar) {
            this.f73639a = new WeakReference<>(activity);
            this.f73640b = new WeakReference<>(aVar);
        }
    }

    /* renamed from: a */
    public final void mo71423a() {
    }

    /* renamed from: b */
    private void m91517b(Activity activity) {
        if (C0683b.m2909b((Context) activity, "android.permission.CAMERA") == 0 && C0683b.m2909b((Context) activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            mo71424a(activity);
        } else {
            m91518c(activity);
        }
    }

    /* renamed from: c */
    private void m91518c(final Activity activity) {
        C22477b.m74364a(activity, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C22480b() {
            /* renamed from: a */
            public final void mo53549a(String[] strArr, int[] iArr) {
                int i;
                if (strArr.length > 1 && iArr[0] == 0 && iArr[1] == 0) {
                    C27944a.this.mo71424a(activity);
                    return;
                }
                if (iArr[0] != 0) {
                    i = R.string.ct3;
                } else {
                    i = R.string.ct5;
                }
                C10761a.m31392b((Context) activity, i, 0).mo25750a();
                C27944a.this.f73625b.mo71399a(-1, "uploadFailed");
            }
        });
    }

    /* renamed from: a */
    private static boolean m91516a(Context context) {
        String str;
        PackageManager packageManager = context.getPackageManager();
        if (VERSION.SDK_INT > 16) {
            str = "android.hardware.camera.any";
        } else {
            str = "android.hardware.camera";
        }
        return packageManager.hasSystemFeature(str);
    }

    /* renamed from: a */
    public final void mo71424a(Activity activity) {
        if (this.f73627d != null) {
            this.f73627d.cancel(false);
        }
        this.f73627d = new C27948c(activity, this);
        this.f73627d.executeOnExecutor(this.f73630g, new Void[0]);
    }

    public final void handleMsg(Message message) {
        Context context = (Context) this.f73628e.get();
        if (context == null) {
            this.f73625b.mo71399a(0, "uploadFailed");
            return;
        }
        if (message.obj instanceof ApiServerException) {
            C10761a.m31403c(context, ((ApiServerException) message.obj).getErrorMsg()).mo25750a();
        } else if (message.obj instanceof AvatarUri) {
            AvatarUri avatarUri = (AvatarUri) message.obj;
            if (avatarUri == null || avatarUri.urlList == null || avatarUri.urlList.isEmpty()) {
                this.f73625b.mo71399a(0, "uploadFailed");
                return;
            }
            this.f73631h.execute(new C27946a(new C27947b((String) avatarUri.urlList.get(0), avatarUri.uri, this.f73624a), this.f73625b));
        }
        this.f73625b.mo71399a(0, "uploadFailed");
    }

    /* renamed from: a */
    public final void mo71425a(JSONObject jSONObject) {
        Activity activity = (Activity) this.f73628e.get();
        if (activity == null) {
            this.f73625b.mo71399a(0, "uploadFailed");
        } else if (!m91516a((Context) activity)) {
            this.f73625b.mo71399a(0, "uploadFailed");
        } else if (new Intent("android.media.action.IMAGE_CAPTURE").resolveActivity(activity.getPackageManager()) == null) {
            this.f73625b.mo71399a(0, "uploadFailed");
        } else {
            this.f73626c = jSONObject.optString("source");
            m91517b(activity);
        }
    }

    /* renamed from: a */
    private static void m91515a(Context context, File file) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(file));
        context.sendBroadcast(intent);
        MediaScannerConnection.scanFile(context, new String[]{file.toString()}, null, null);
    }

    public C27944a(WeakReference<Activity> weakReference, C27943a aVar, C27996m mVar) {
        this.f73629f = aVar;
        this.f73625b = mVar;
        this.f73628e = weakReference;
    }

    /* renamed from: a */
    public final boolean mo71426a(int i, int i2, Intent intent) {
        if (i2 == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(Api.f60503c);
            sb.append("?uid=");
            sb.append(C21115b.m71197a().getCurUserId());
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(this.f73626c)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("&source=");
                sb3.append(this.f73626c);
                sb2 = sb3.toString();
            }
            String str = sb2;
            this.f73629f.mo71419a();
            m91515a((Context) this.f73628e.get(), new File(this.f73624a));
            this.f73629f.mo71420a((Context) this.f73628e.get());
            C21115b.m71197a().uploadAvatar(new C6309f(this), str, 8388608, this.f73624a, null);
        } else {
            this.f73625b.mo71399a(0, "uploadFailed");
        }
        return true;
    }
}
