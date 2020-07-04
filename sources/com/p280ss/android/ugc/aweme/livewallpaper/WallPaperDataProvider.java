package com.p280ss.android.ugc.aweme.livewallpaper;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32571c;
import com.p280ss.android.ugc.aweme.livewallpaper.p1369b.C32577e;
import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.WallPaperDataProvider */
public class WallPaperDataProvider extends ContentProvider {

    /* renamed from: a */
    public static final Uri f84868a = Uri.parse("content://com.zhiliaoapp.musically.wallpapercaller/video_path");

    /* renamed from: b */
    public static final Uri f84869b = Uri.parse("content://com.zhiliaoapp.musically.wallpapercaller/video_width");

    /* renamed from: c */
    public static final Uri f84870c = Uri.parse("content://com.zhiliaoapp.musically.wallpapercaller/video_height");

    /* renamed from: d */
    public static final Uri f84871d = Uri.parse("content://com.zhiliaoapp.musically.wallpapercaller/fall_back_video_path");

    /* renamed from: e */
    public static final Uri f84872e = Uri.parse("content://com.zhiliaoapp.musically.wallpapercaller/set_wp_result");

    /* renamed from: f */
    public static final Uri f84873f = Uri.parse("content://com.zhiliaoapp.musically.wallpapercaller/source");

    /* renamed from: g */
    private UriMatcher f84874g;

    /* renamed from: h */
    private Handler f84875h;

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public boolean onCreate() {
        this.f84874g = new UriMatcher(-1);
        if (!TextUtils.isEmpty("com.zhiliaoapp.musically.wallpapercaller")) {
            this.f84874g.addURI("com.zhiliaoapp.musically.wallpapercaller", "video_path", 16);
            this.f84874g.addURI("com.zhiliaoapp.musically.wallpapercaller", "fall_back_video_path", 32);
            this.f84874g.addURI("com.zhiliaoapp.musically.wallpapercaller", "set_wp_result", 48);
            this.f84874g.addURI("com.zhiliaoapp.musically.wallpapercaller", "video_width", 64);
            this.f84874g.addURI("com.zhiliaoapp.musically.wallpapercaller", "video_height", 80);
            this.f84874g.addURI("com.zhiliaoapp.musically.wallpapercaller", "source", 96);
        }
        this.f84875h = new Handler(Looper.getMainLooper());
        return false;
    }

    public String getType(Uri uri) {
        int match = this.f84874g.match(uri);
        if (match == 16) {
            return C32571c.m105458a().f84924a.getVideoPath();
        }
        if (match == 32) {
            return C32577e.m105503c();
        }
        if (match == 64) {
            return String.valueOf(C32571c.m105458a().f84924a.getWidth());
        }
        if (match == 80) {
            return String.valueOf(C32571c.m105458a().f84924a.getHeight());
        }
        if (match != 96) {
            return "";
        }
        return C32571c.m105458a().f84924a.getSource();
    }

    public Uri insert(Uri uri, final ContentValues contentValues) {
        if (!(contentValues == null || contentValues.size() == 0 || this.f84874g.match(uri) != 48)) {
            this.f84875h.post(new Runnable() {
                public final void run() {
                    boolean z;
                    if (contentValues.getAsBoolean("result") != null) {
                        z = contentValues.getAsBoolean("result").booleanValue();
                    } else {
                        z = false;
                    }
                    C32571c.m105458a().mo83857a(z, contentValues.getAsString("source"), contentValues.getAsString("message"));
                }
            });
        }
        return null;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        String str2 = "";
        int match = this.f84874g.match(uri);
        if (match == 16) {
            str2 = C32571c.m105458a().f84924a.getVideoPath();
        } else if (match == 32) {
            str2 = C32577e.m105503c();
        }
        try {
            return ParcelFileDescriptor.open(new File(str2), 268435456);
        } catch (Exception unused) {
            return null;
        }
    }
}
