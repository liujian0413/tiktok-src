package com.bytedance.android.livesdk.chatroom.p211d;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore.Images.Media;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.concurrent.Callable;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.d.a */
public final class C4308a {

    /* renamed from: b */
    public static final String[] f12523b = {"_id", "date_added"};

    /* renamed from: c */
    private static final String[] f12524c = {"screenshot", C3358ac.m12515a((int) R.string.fc4), "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap"};

    /* renamed from: a */
    public C4310a f12525a;

    /* renamed from: com.bytedance.android.livesdk.chatroom.d.a$a */
    public static class C4310a {

        /* renamed from: a */
        public long f12527a;

        /* renamed from: b */
        public long f12528b;

        /* renamed from: c */
        public long f12529c;

        public C4310a(long j, long j2, long j3) {
            this.f12527a = j2;
            this.f12528b = j;
            this.f12529c = j3;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.d.a$b */
    static class C4311b {

        /* renamed from: a */
        public static final C4308a f12530a = new C4308a();
    }

    private C4308a() {
    }

    /* renamed from: a */
    public static C4308a m14513a() {
        return C4311b.f12530a;
    }

    /* renamed from: a */
    public final void mo11985a(long j) {
        if (((Boolean) LiveSettingKeys.LIVE_SCREEN_SHOT_RECORD_ENABLE.mo10240a()).booleanValue() && this.f12525a != null && j != 0 && this.f12525a.f12528b == j) {
            C7492s.m23290a((Callable<? extends T>) new Callable<HashMap<String, String>>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public HashMap<String, String> call() throws Exception {
                    long j;
                    HashMap<String, String> hashMap = new HashMap<>();
                    if (C4308a.this.f12525a == null) {
                        return hashMap;
                    }
                    Uri uri = Media.EXTERNAL_CONTENT_URI;
                    try {
                        ContentResolver contentResolver = C3358ac.m12528e().getContentResolver();
                        String[] strArr = C4308a.f12523b;
                        StringBuilder sb = new StringBuilder("date_added>=");
                        sb.append(C4308a.this.f12525a.f12529c / 1000);
                        Cursor query = Media.query(contentResolver, uri, strArr, sb.toString(), "date_added DESC");
                        hashMap.put("anchor_id", String.valueOf(C4308a.this.f12525a.f12527a));
                        hashMap.put("room_id", String.valueOf(C4308a.this.f12525a.f12528b));
                        String str = "photo_num";
                        if (query != null) {
                            j = (long) query.getCount();
                        } else {
                            j = 0;
                        }
                        hashMap.put(str, String.valueOf(j));
                    } catch (Exception unused) {
                        hashMap.put("anchor_id", String.valueOf(C4308a.this.f12525a.f12527a));
                        hashMap.put("room_id", String.valueOf(C4308a.this.f12525a.f12528b));
                        hashMap.put("photo_num", "0");
                    }
                    return hashMap;
                }
            }).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19325f(C4312b.f12531a);
        }
    }
}
