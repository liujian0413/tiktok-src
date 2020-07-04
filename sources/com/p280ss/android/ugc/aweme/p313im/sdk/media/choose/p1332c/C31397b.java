package com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.p1332c;

import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import com.C1642a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.C31403a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.choose.model.C31403a.C31404a;
import com.p280ss.android.ugc.aweme.p313im.sdk.media.model.MediaModel;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.C7519g;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.p1877a.C47886a;
import kotlin.p1884io.C47973b;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.c.b */
public final class C31397b {

    /* renamed from: a */
    public static final C31397b f82239a = new C31397b();

    /* renamed from: b */
    private static final String[] f82240b = {"_id", "_data", "date_added", "date_modified", "width", "height", "mime_type", "_data"};

    /* renamed from: c */
    private static final String[] f82241c = {"_id", "_data", "date_added", "date_modified", "width", "height", "mime_type", "duration", "_size", "_data"};

    /* renamed from: d */
    private static final Uri f82242d = Media.EXTERNAL_CONTENT_URI;

    /* renamed from: e */
    private static final Uri f82243e = Video.Media.EXTERNAL_CONTENT_URI;

    /* renamed from: f */
    private static final String[] f82244f = {"image/jpeg", "image/png", f82245g};

    /* renamed from: g */
    private static final String f82245g = f82245g;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.c.b$a */
    public static final class C31398a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(Long.valueOf(((MediaModel) t2).getDateModify()), Long.valueOf(((MediaModel) t).getDateModify()));
        }
    }

    private C31397b() {
    }

    /* renamed from: a */
    private static String m102163a(MediaModel mediaModel) {
        String filePath = mediaModel.getFilePath();
        if (filePath != null) {
            CharSequence charSequence = filePath;
            String str = File.separator;
            C7573i.m23582a((Object) str, "File.separator");
            List b = C7634n.m23768b(charSequence, new String[]{str}, false, 0);
            if (b != null) {
                if (b.size() >= 2) {
                    return (String) b.get(b.size() - 2);
                }
                return "";
            }
        }
        return "";
    }

    /* renamed from: a */
    private final List<C31403a> m102167a(List<MediaModel> list) {
        boolean z;
        if (list.isEmpty()) {
            return new ArrayList<>();
        }
        List<C31403a> arrayList = new ArrayList<>();
        Map linkedHashMap = new LinkedHashMap();
        C31403a a = C31404a.m102178a();
        linkedHashMap.put(a.f82255c, a);
        for (MediaModel mediaModel : list) {
            String a2 = m102163a(mediaModel);
            CharSequence charSequence = a2;
            if (charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !C7634n.m23713a(charSequence)) {
                C31403a aVar = (C31403a) linkedHashMap.get(a2);
                if (aVar == null) {
                    aVar = new C31403a(a2);
                }
                if (mediaModel.isVideo()) {
                    aVar.mo81982d().add(mediaModel);
                    a.mo81982d().add(mediaModel);
                } else if (mediaModel.isImage() || mediaModel.isGif()) {
                    aVar.mo81981c().add(mediaModel);
                    a.mo81981c().add(mediaModel);
                }
                linkedHashMap.put(a2, aVar);
            }
        }
        for (Entry value : linkedHashMap.entrySet()) {
            arrayList.add(value.getValue());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final List<C31403a> m102164a(C31395a aVar, int i) {
        C7573i.m23587b(aVar, "imageSettings");
        return f82239a.m102167a(m102168b(aVar, -1));
    }

    /* renamed from: a */
    private static List<MediaModel> m102166a(C31399c cVar, int i) {
        Throwable th;
        Cursor cursor;
        C31399c cVar2 = cVar;
        C7573i.m23587b(cVar2, "videoSettings");
        List<MediaModel> arrayList = new ArrayList<>();
        int i2 = 3;
        int i3 = 0;
        int i4 = 1;
        int i5 = 2;
        String[] strArr = {String.valueOf(cVar2.f82247a), String.valueOf(cVar2.f82248b), String.valueOf(cVar2.f82249c)};
        StringBuilder sb = new StringBuilder("date_modified DESC LIMIT ");
        sb.append(i);
        String sb2 = sb.toString();
        Cursor query = C6399b.m19921a().getContentResolver().query(f82243e, f82241c, "duration >= ? and duration <= ? and _size <= ?", strArr, sb2);
        if (query != null) {
            Closeable closeable = query;
            try {
                Cursor cursor2 = (Cursor) closeable;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(i3);
                    String string = cursor2.getString(i4);
                    long j2 = cursor2.getLong(i5);
                    long j3 = cursor2.getLong(i2);
                    int i6 = cursor2.getInt(4);
                    int i7 = cursor2.getInt(5);
                    String string2 = cursor2.getString(6);
                    long j4 = cursor2.getLong(7);
                    Closeable closeable2 = closeable;
                    try {
                        long j5 = cursor2.getLong(8);
                        List<MediaModel> list = arrayList;
                        String string3 = cursor2.getString(9);
                        if (C7276d.m22812b(string)) {
                            if (C7276d.m22812b(string3)) {
                                cursor = cursor2;
                                MediaModel mediaModel = new MediaModel(j);
                                mediaModel.setType(1);
                                mediaModel.setFilePath(string);
                                mediaModel.setDate(j2);
                                mediaModel.setDateModify(j3);
                                mediaModel.setWidth(i6);
                                mediaModel.setHeight(i7);
                                mediaModel.setMimeType(string2);
                                mediaModel.setDuration(j4);
                                mediaModel.setFileSize(j5);
                                mediaModel.setThumbnail(string3);
                                arrayList = list;
                                arrayList.add(mediaModel);
                                closeable = closeable2;
                                cursor2 = cursor;
                                i2 = 3;
                                i3 = 0;
                                i4 = 1;
                                i5 = 2;
                            }
                        }
                        cursor = cursor2;
                        arrayList = list;
                        closeable = closeable2;
                        cursor2 = cursor;
                        i2 = 3;
                        i3 = 0;
                        i4 = 1;
                        i5 = 2;
                    } catch (Throwable th2) {
                        th = th2;
                        closeable = closeable2;
                        th = null;
                        C47973b.m148917a(closeable, th);
                        throw th;
                    }
                }
                C47973b.m148917a(closeable, null);
            } catch (Throwable th3) {
                th = th3;
                th = null;
                C47973b.m148917a(closeable, th);
                throw th;
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static List<MediaModel> m102168b(C31395a aVar, int i) {
        Closeable closeable;
        Throwable th;
        C31395a aVar2 = aVar;
        C7573i.m23587b(aVar2, "imageSettings");
        List<MediaModel> arrayList = new ArrayList<>();
        Locale locale = Locale.getDefault();
        C7573i.m23582a((Object) locale, "Locale.getDefault()");
        int i2 = 4;
        int i3 = 0;
        int i4 = 1;
        int i5 = 2;
        int i6 = 3;
        String a = C1642a.m8035a(locale, "%s >= %d and %s >= %d", Arrays.copyOf(new Object[]{"width", Integer.valueOf(aVar2.f82236a), "height", Integer.valueOf(aVar2.f82237b)}, 4));
        C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
        StringBuilder sb = new StringBuilder("date_modified DESC LIMIT ");
        sb.append(i);
        Cursor query = C6399b.m19921a().getContentResolver().query(f82242d, f82240b, a, null, sb.toString());
        if (query != null) {
            closeable = query;
            try {
                Cursor cursor = (Cursor) closeable;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(i3);
                    String string = cursor.getString(i4);
                    long j2 = cursor.getLong(i5);
                    long j3 = cursor.getLong(i6);
                    int i7 = cursor.getInt(i2);
                    int i8 = cursor.getInt(5);
                    String string2 = cursor.getString(6);
                    String string3 = cursor.getString(7);
                    if (C7519g.m23440b((T[]) f82244f, string2)) {
                        if (i7 >= 360) {
                            if (i8 >= 360) {
                                if ((aVar2.f82238c || !C7573i.m23585a((Object) string2, (Object) f82245g)) && C7276d.m22812b(string)) {
                                    MediaModel mediaModel = new MediaModel(j);
                                    mediaModel.setType(0);
                                    mediaModel.setFilePath(string);
                                    mediaModel.setDate(j2);
                                    mediaModel.setDateModify(j3);
                                    mediaModel.setWidth(i7);
                                    mediaModel.setHeight(i8);
                                    mediaModel.setMimeType(string2);
                                    mediaModel.setThumbnail(string3);
                                    arrayList.add(mediaModel);
                                }
                            }
                        }
                    }
                    i2 = 4;
                    i3 = 0;
                    i4 = 1;
                    i5 = 2;
                    i6 = 3;
                }
                C47973b.m148917a(closeable, null);
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return arrayList;
        C47973b.m148917a(closeable, th);
        throw th;
    }

    /* renamed from: b */
    public static final List<C31403a> m102169b(C31395a aVar, C31399c cVar, int i) {
        C7573i.m23587b(aVar, "imageSettings");
        C7573i.m23587b(cVar, "videoSettings");
        List arrayList = new ArrayList();
        arrayList.addAll(m102168b(aVar, -1));
        arrayList.addAll(m102166a(cVar, -1));
        return f82239a.m102167a(arrayList);
    }

    /* renamed from: a */
    public static final List<MediaModel> m102165a(C31395a aVar, C31399c cVar, int i) {
        C7573i.m23587b(aVar, "imageSettings");
        C7573i.m23587b(cVar, "videoSettings");
        List<MediaModel> arrayList = new ArrayList<>();
        arrayList.addAll(m102168b(aVar, 50));
        arrayList.addAll(m102166a(cVar, 50));
        if (arrayList.size() > 1) {
            C7525m.m23474a(arrayList, new C31398a());
        }
        if (arrayList.size() < 50) {
            return arrayList;
        }
        return arrayList.subList(0, 50);
    }
}
