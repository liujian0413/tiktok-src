package com.zhihu.matisse.internal.loader;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.provider.MediaStore.Files;
import android.support.p022v4.content.CursorLoader;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.C47338d;
import com.zhihu.matisse.internal.p1855a.C47328b;

public class AlbumMediaLoader extends CursorLoader {

    /* renamed from: v */
    private static final Uri f121471v = Files.getContentUri("external");

    /* renamed from: w */
    private static final String[] f121472w = {"_id", "_display_name", "mime_type", "_size", "duration"};

    /* renamed from: x */
    private static final String[] f121473x = {"1", "3"};

    /* renamed from: y */
    private final boolean f121474y;

    /* renamed from: u */
    public final void mo2833u() {
    }

    /* renamed from: h */
    public final Cursor mo2782d() {
        Cursor h = super.mo2782d();
        if (!this.f121474y || !C47328b.m147770a(this.f2629p)) {
            return h;
        }
        MatrixCursor matrixCursor = new MatrixCursor(f121472w);
        matrixCursor.addRow(new Object[]{Long.valueOf(-1), "Capture", "", Integer.valueOf(0), Integer.valueOf(0)});
        return new MergeCursor(new Cursor[]{matrixCursor, h});
    }

    /* renamed from: a */
    private static String[] m147816a(int i) {
        return new String[]{String.valueOf(i)};
    }

    /* renamed from: a */
    private static String[] m147818a(String str) {
        return new String[]{"1", "3", str};
    }

    /* renamed from: a */
    private static String[] m147817a(int i, String str) {
        return new String[]{String.valueOf(i), str};
    }

    /* renamed from: a */
    public static CursorLoader m147815a(Context context, Album album, boolean z) {
        String str;
        String[] strArr;
        String str2;
        String[] a;
        if (!album.mo119347b()) {
            if (C47338d.m147803a().mo119365e()) {
                str2 = "media_type=? AND  bucket_id=? AND _size>0";
                a = m147817a(1, album.f121430b);
            } else if (C47338d.m147803a().mo119366f()) {
                str2 = "media_type=? AND  bucket_id=? AND _size>0";
                a = m147817a(3, album.f121430b);
            } else {
                str2 = "(media_type=? OR media_type=?) AND  bucket_id=? AND _size>0";
                a = m147818a(album.f121430b);
            }
            strArr = a;
            str = str2;
            z = false;
        } else if (C47338d.m147803a().mo119365e()) {
            str = "media_type=? AND _size>0";
            strArr = m147816a(1);
        } else if (C47338d.m147803a().mo119366f()) {
            str = "media_type=? AND _size>0";
            strArr = m147816a(3);
        } else {
            str = "(media_type=? OR media_type=?) AND _size>0";
            strArr = f121473x;
        }
        return new AlbumMediaLoader(context, str, strArr, z);
    }

    private AlbumMediaLoader(Context context, String str, String[] strArr, boolean z) {
        super(context, f121471v, f121472w, str, strArr, "datetaken DESC");
        this.f121474y = z;
    }
}
