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

public class AlbumLoader extends CursorLoader {

    /* renamed from: v */
    private static final Uri f121467v = Files.getContentUri("external");

    /* renamed from: w */
    private static final String[] f121468w = {"_id", "bucket_id", "bucket_display_name", "_data", "count"};

    /* renamed from: x */
    private static final String[] f121469x = {"_id", "bucket_id", "bucket_display_name", "_data", "COUNT(*) AS count"};

    /* renamed from: y */
    private static final String[] f121470y = {"1", "3"};

    /* renamed from: u */
    public final void mo2833u() {
    }

    /* renamed from: h */
    public final Cursor mo2782d() {
        int i;
        Cursor h = super.mo2782d();
        MatrixCursor matrixCursor = new MatrixCursor(f121468w);
        String str = "";
        if (h != null) {
            i = 0;
            while (h.moveToNext()) {
                i += h.getInt(h.getColumnIndex("count"));
            }
            if (h.moveToFirst()) {
                str = h.getString(h.getColumnIndex("_data"));
            }
        } else {
            i = 0;
        }
        matrixCursor.addRow(new String[]{Album.f121429a, Album.f121429a, "All", str, String.valueOf(i)});
        return new MergeCursor(new Cursor[]{matrixCursor, h});
    }

    /* renamed from: a */
    private static String[] m147811a(int i) {
        return new String[]{String.valueOf(i)};
    }

    /* renamed from: a */
    public static CursorLoader m147810a(Context context) {
        String[] strArr;
        String str;
        if (C47338d.m147803a().mo119365e()) {
            str = "media_type=? AND _size>0) GROUP BY (bucket_id";
            strArr = m147811a(1);
        } else if (C47338d.m147803a().mo119366f()) {
            str = "media_type=? AND _size>0) GROUP BY (bucket_id";
            strArr = m147811a(3);
        } else {
            str = "(media_type=? OR media_type=?) AND _size>0) GROUP BY (bucket_id";
            strArr = f121470y;
        }
        return new AlbumLoader(context, str, strArr);
    }

    private AlbumLoader(Context context, String str, String[] strArr) {
        super(context, f121467v, f121469x, str, strArr, "datetaken DESC");
    }
}
