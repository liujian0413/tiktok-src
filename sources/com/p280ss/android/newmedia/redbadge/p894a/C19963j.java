package com.p280ss.android.newmedia.redbadge.p894a;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import com.p280ss.android.newmedia.redbadge.C19953a;
import com.p280ss.android.newmedia.redbadge.RedBadgerException;
import com.p280ss.android.newmedia.redbadge.p896c.C19982b;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.newmedia.redbadge.a.j */
public class C19963j implements C19953a {

    /* renamed from: a */
    private static final String[] f54051a = {"_id", "class"};

    /* renamed from: b */
    private C19957d f54052b;

    public C19963j() {
        if (VERSION.SDK_INT >= 21) {
            this.f54052b = new C19957d();
        }
    }

    /* renamed from: a */
    public final List<String> mo53458a() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }

    /* renamed from: a */
    private static ContentValues m65818a(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    /* renamed from: a */
    public final void mo53459a(Context context, ComponentName componentName, int i) throws RedBadgerException {
        if (context != null && componentName != null) {
            if (i < 0) {
                i = 0;
            }
            if (this.f54052b == null || !C19957d.m65805a(context)) {
                Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
                ContentResolver contentResolver = context.getContentResolver();
                Cursor cursor = null;
                try {
                    ContentResolver contentResolver2 = contentResolver;
                    Uri uri = parse;
                    Cursor cursor2 = contentResolver2.query(uri, f54051a, "package=?", new String[]{componentName.getPackageName()}, null);
                    if (cursor2 != null) {
                        try {
                            String className = componentName.getClassName();
                            boolean z = false;
                            while (cursor2.moveToNext()) {
                                contentResolver.update(parse, m65818a(componentName, i, false), "_id=?", new String[]{String.valueOf(cursor2.getInt(0))});
                                if (className.equals(cursor2.getString(cursor2.getColumnIndex("class")))) {
                                    z = true;
                                }
                            }
                            if (!z) {
                                contentResolver.insert(parse, m65818a(componentName, i, true));
                            }
                        } catch (Throwable th) {
                            th = th;
                            C19982b.m65884a(cursor2);
                            throw th;
                        }
                    }
                    C19982b.m65884a(cursor2);
                } catch (Throwable th2) {
                    th = th2;
                    throw new RedBadgerException(th.getMessage());
                }
            } else {
                this.f54052b.mo53459a(context, componentName, i);
            }
        }
    }
}
