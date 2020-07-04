package com.zhihu.matisse.internal.p1855a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.content.FileProvider;
import android.support.p022v4.p027os.C0881c;
import com.C1642a;
import com.zhihu.matisse.internal.entity.C47335a;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.zhihu.matisse.internal.a.b */
public final class C47328b {

    /* renamed from: a */
    public C47335a f121423a;

    /* renamed from: b */
    public Uri f121424b;

    /* renamed from: c */
    public String f121425c;

    /* renamed from: d */
    private final WeakReference<Activity> f121426d;

    /* renamed from: e */
    private final WeakReference<Fragment> f121427e = null;

    /* renamed from: a */
    private File m147769a() throws IOException {
        File file;
        String a = C1642a.m8034a("JPEG_%s.jpg", new Object[]{new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date())});
        if (this.f121423a.f121439a) {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            if (!file.exists()) {
                file.mkdirs();
            }
        } else {
            file = ((Activity) this.f121426d.get()).getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        }
        if (this.f121423a.f121441c != null) {
            file = new File(file, this.f121423a.f121441c);
        }
        File file2 = new File(file, a);
        if (!"mounted".equals(C0881c.m3748a(file2))) {
            return null;
        }
        return file2;
    }

    public C47328b(Activity activity) {
        this.f121426d = new WeakReference<>(activity);
    }

    /* renamed from: a */
    public static boolean m147770a(Context context) {
        return context.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.camera");
    }

    /* renamed from: a */
    public final void mo119344a(Context context, int i) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            File file = null;
            try {
                file = m147769a();
            } catch (IOException unused) {
            }
            if (file != null) {
                this.f121425c = file.getAbsolutePath();
                this.f121424b = FileProvider.getUriForFile((Context) this.f121426d.get(), this.f121423a.f121440b, file);
                intent.putExtra("output", this.f121424b);
                intent.addFlags(2);
                if (VERSION.SDK_INT < 21) {
                    for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
                        context.grantUriPermission(resolveInfo.activityInfo.packageName, this.f121424b, 3);
                    }
                }
                if (this.f121427e != null) {
                    ((Fragment) this.f121427e.get()).startActivityForResult(intent, 24);
                    return;
                }
                ((Activity) this.f121426d.get()).startActivityForResult(intent, 24);
            }
        }
    }
}
