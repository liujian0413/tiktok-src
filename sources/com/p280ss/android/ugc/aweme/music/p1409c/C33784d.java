package com.p280ss.android.ugc.aweme.music.p1409c;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Audio.Media;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import com.C1642a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23889d;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.adapter.type.C33757h;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.music.c.d */
public class C33784d {

    /* renamed from: a */
    private static final String f88144a = "d";

    /* renamed from: b */
    private static final Uri f88145b = Uri.parse("content://media/external/audio/albumart");

    /* renamed from: c */
    private static String f88146c;

    /* renamed from: d */
    private static final boolean f88147d = C7163a.m22363a();

    /* renamed from: a */
    public static String m108920a() {
        return f88146c;
    }

    /* renamed from: a */
    public static boolean m108932a(MusicModel musicModel, Context context, boolean z, boolean z2) {
        if ((musicModel == null || !TextUtils.isEmpty(musicModel.getPath())) && (musicModel == null || musicModel.getMusicStatus() != 0)) {
            return true;
        }
        String offlineDesc = musicModel.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getString(R.string.chd);
            if (C6399b.m19945u() && musicModel.getMusicStatus() == 0 && z2) {
                offlineDesc = context.getString(R.string.e3);
            }
        }
        if (z) {
            C10761a.m31403c(context, offlineDesc).mo25750a();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m108930a(AVMusic aVMusic, Context context, boolean z) {
        if ((aVMusic == null || !TextUtils.isEmpty(aVMusic.getPath())) && (aVMusic == null || aVMusic.getMusicStatus() != 0)) {
            return true;
        }
        String offlineDesc = aVMusic.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getString(R.string.chd);
        }
        if (z) {
            C10761a.m31403c(context, offlineDesc).mo25750a();
        }
        return false;
    }

    /* renamed from: a */
    public static List<C33757h> m108925a(Map<String, List<C33757h>> map) {
        ArrayList arrayList = new ArrayList();
        for (Entry value : map.entrySet()) {
            arrayList.addAll((Collection) value.getValue());
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m108929a(String str, Fragment fragment, int i, String str2, int i2, MusicModel musicModel, boolean z, Bundle bundle, String str3, String str4) {
        SmartRoute withParam = SmartRouter.buildRoute(fragment.getContext(), str).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getChallenges().size() > 0) {
            withParam.withParam("challenge", ((AVChallenge) ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getChallenges().get(0)).cid);
        }
        withParam.withParam("title", str2).withParam("music_model", (Serializable) musicModel).withParam("music_allow_clear", z).withParam("creation_id", str4).withParam("shoot_way", str3);
        if (bundle != null) {
            withParam.withParam("arguments", bundle);
        }
        fragment.startActivityForResult(withParam.buildIntent(), i);
    }

    /* renamed from: a */
    public static void m108928a(Fragment fragment, int i, String str, int i2, MusicModel musicModel, boolean z, Bundle bundle, String str2, String str3) {
        Fragment fragment2 = fragment;
        Bundle bundle2 = bundle;
        boolean z2 = false;
        if (bundle2 != null && bundle2.getBoolean("has_lyric", false)) {
            z2 = true;
        }
        if (z2) {
            C23888c.m78209d("video_edit_page");
            m108929a("//choosemusic/home", fragment, i, fragment.getString(R.string.a3q), i2, musicModel, z, bundle, str2, str3);
            return;
        }
        C23888c.m78209d("video_shoot_page");
        if (C23889d.m78222c() || !C23889d.m78219a()) {
            m108929a("//onlinemusic/home", fragment, i, str, i2, musicModel, z, bundle, str2, str3);
            return;
        }
        m108929a("//choosemusic/home", fragment, i, fragment.getString(R.string.a3q), i2, musicModel, z, bundle, str2, str3);
    }

    /* renamed from: a */
    public static void m108927a(Activity activity, int i, int i2) {
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) activity, "//assmusic/category");
        if (i2 == 0) {
            buildRoute.withParam("music_type", 6);
        } else if (i2 == 2) {
            buildRoute.withParam("music_type", 5);
        }
        activity.startActivityForResult(buildRoute.buildIntent(), 10086);
    }

    /* renamed from: b */
    public static void m108933b() {
        JSONObject jSONObject = new JSONObject();
        try {
            String stackTraceString = Log.getStackTraceString(new Throwable());
            if (stackTraceString.length() > 1024) {
                stackTraceString = stackTraceString.substring(0, PreloadTask.BYTE_UNIT_NUMBER);
            }
            jSONObject.put("error_stack", stackTraceString);
        } catch (Exception unused) {
        }
        C6893q.m21447a("music_id_empty", jSONObject);
    }

    /* renamed from: c */
    private static boolean m108936c() {
        String d = m108937d("ro.build.display.id");
        if (TextUtils.isEmpty(d) || !d.toLowerCase().contains("flyme")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m108934b(String str) {
        f88146c = str;
    }

    /* renamed from: c */
    public static String m108935c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new URI(str).getHost();
        } catch (Exception unused) {
            C42880h.m136156a("music url illegal");
            return null;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0020 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m108918a(java.lang.String r3) {
        /*
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r0.setDataSource(r3)     // Catch:{ Exception -> 0x0020, all -> 0x001b }
            r3 = 9
            java.lang.String r3 = r0.extractMetadata(r3)     // Catch:{ Exception -> 0x0020, all -> 0x001b }
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch:{ Exception -> 0x0020, all -> 0x001b }
            float r3 = r3.floatValue()     // Catch:{ Exception -> 0x0020, all -> 0x001b }
            long r1 = (long) r3
            r0.release()     // Catch:{ Exception -> 0x001a }
        L_0x001a:
            return r1
        L_0x001b:
            r3 = move-exception
            r0.release()     // Catch:{ Exception -> 0x001f }
        L_0x001f:
            throw r3
        L_0x0020:
            r0.release()     // Catch:{ Exception -> 0x0023 }
        L_0x0023:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.music.p1409c.C33784d.m108918a(java.lang.String):long");
    }

    /* renamed from: d */
    private static String m108937d(String str) {
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getDeclaredMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m108921a(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C1642a.m8035a(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return C1642a.m8035a(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }

    /* renamed from: a */
    private static String m108922a(long j) {
        if (j <= 0) {
            return "";
        }
        long j2 = j / 1000;
        long j3 = j2 % 60;
        long j4 = j2 / 60;
        long j5 = j4 / 60;
        long j6 = j4 % 60;
        if (0 == j5) {
            return C1642a.m8035a(Locale.CHINA, "%02d:%02d", new Object[]{Long.valueOf(j6), Long.valueOf(j3)});
        }
        return C1642a.m8035a(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j3)});
    }

    /* renamed from: a */
    public static void m108926a(Activity activity, int i) {
        activity.startActivityForResult(SmartRouter.buildRoute((Context) activity, "//assmusic/category").withParam("music_type", 3).buildIntent(), 1);
    }

    /* renamed from: a */
    public static Music m108919a(List<Music> list, String str) {
        if (C6307b.m19566a((Collection<T>) list)) {
            return null;
        }
        for (Music music : list) {
            if (music != null && C6319n.m19594a(music.getMid(), str)) {
                return music;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static List<MusicModel> m108923a(Context context, List<MusicModel> list) {
        int i;
        if (context == null) {
            return new ArrayList();
        }
        list.clear();
        Cursor query = context.getContentResolver().query(Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "is_music", "title", "artist", "album", "album_id", "_data", "_display_name", "_size", "duration"}, null, null, "title_key");
        if (query == null) {
            return list;
        }
        while (query.moveToNext()) {
            int i2 = query.getInt(query.getColumnIndex("is_music"));
            if (m108936c() || i2 != 0) {
                query.getLong(query.getColumnIndex("_id"));
                String string = query.getString(query.getColumnIndex("title"));
                String string2 = query.getString(query.getColumnIndex("artist"));
                String string3 = query.getString(query.getColumnIndex("album"));
                query.getLong(query.getColumnIndex("album_id"));
                long j = query.getLong(query.getColumnIndex("duration"));
                String string4 = query.getString(query.getColumnIndex("_data"));
                query.getString(query.getColumnIndex("_display_name"));
                query.getLong(query.getColumnIndex("_size"));
                try {
                    i = ((IAVService) ServiceManager.get().getService(IAVService.class)).getSDKService().checkAudioFile(string4);
                } catch (Exception e) {
                    C6921a.m21559a((Throwable) e);
                    i = -1;
                }
                if (i >= 0 && j > 10000 && j < 600000) {
                    MusicModel musicModel = new MusicModel();
                    musicModel.setName(string);
                    musicModel.setMusicStatus(1);
                    musicModel.setAlbum(string3);
                    if (TextUtils.equals("<unknown>", string2)) {
                        string2 = "未知";
                    }
                    musicModel.setSinger(string2);
                    musicModel.setPath(string4);
                    musicModel.setCollectionType(CollectionType.NOT_COLLECTED);
                    musicModel.setMusicType(MusicType.LOCAL);
                    musicModel.setLocalMusicDuration(m108922a(j));
                    musicModel.setDataType(1);
                    list.add(musicModel);
                }
            }
        }
        query.close();
        return list;
    }

    /* renamed from: a */
    public static List<C33757h> m108924a(List<Music> list, List<C33757h> list2) {
        if (C23477d.m77081a((Collection<T>) list)) {
            return list2;
        }
        for (Music music : list) {
            if (music != null) {
                MusicModel convertToMusicModel = music.convertToMusicModel();
                convertToMusicModel.setDataType(1);
                list2.add(convertToMusicModel);
            }
        }
        return list2;
    }

    /* renamed from: a */
    public static boolean m108931a(MusicModel musicModel, Context context, boolean z) {
        return m108932a(musicModel, context, z, false);
    }
}
