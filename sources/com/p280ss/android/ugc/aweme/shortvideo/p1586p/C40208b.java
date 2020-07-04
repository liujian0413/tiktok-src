package com.p280ss.android.ugc.aweme.shortvideo.p1586p;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;
import com.p280ss.android.ugc.aweme.utils.C43072du;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.p.b */
public final class C40208b {

    /* renamed from: a */
    public final AudioManager f104503a;

    /* renamed from: b */
    private Context f104504b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.b$a */
    public interface C40209a {
        /* renamed from: a */
        void mo97913a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.b$b */
    static final class C40210b implements OnPreparedListener {

        /* renamed from: a */
        final /* synthetic */ C40208b f104505a;

        /* renamed from: b */
        final /* synthetic */ int f104506b;

        C40210b(C40208b bVar, int i) {
            this.f104505a = bVar;
            this.f104506b = i;
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            this.f104505a.f104503a.setStreamVolume(3, this.f104506b, 4);
            mediaPlayer.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.b$c */
    static final class C40211c implements OnErrorListener {

        /* renamed from: a */
        final /* synthetic */ C40208b f104507a;

        /* renamed from: b */
        final /* synthetic */ int f104508b;

        C40211c(C40208b bVar, int i) {
            this.f104507a = bVar;
            this.f104508b = i;
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C40208b.m128517a();
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            this.f104507a.f104503a.setStreamVolume(3, this.f104508b, 4);
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.p.b$d */
    static final class C40212d implements OnCompletionListener {

        /* renamed from: a */
        final /* synthetic */ C40208b f104509a;

        /* renamed from: b */
        final /* synthetic */ int f104510b;

        /* renamed from: c */
        final /* synthetic */ C40209a f104511c;

        C40212d(C40208b bVar, int i, C40209a aVar) {
            this.f104509a = bVar;
            this.f104510b = i;
            this.f104511c = aVar;
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            this.f104509a.f104503a.setStreamVolume(3, this.f104510b, 4);
            C40209a aVar = this.f104511c;
            if (aVar != null) {
                aVar.mo97913a();
            }
        }
    }

    /* renamed from: a */
    public static void m128517a() {
        C43072du.m136634a("record_error", "1", "play shutter error", null, 8, null);
    }

    /* renamed from: a */
    public final void mo100002a(C40209a aVar) {
        m128518a(R.raw.shutter_sound_shoot, this.f104503a.getStreamMaxVolume(3), this.f104503a.getStreamVolume(3), aVar);
    }

    /* renamed from: b */
    public final void mo100003b(C40209a aVar) {
        m128518a(R.raw.shutter_sound_stop, this.f104503a.getStreamMaxVolume(3), this.f104503a.getStreamVolume(3), null);
    }

    public C40208b(Context context) {
        C7573i.m23587b(context, "context");
        this.f104504b = context;
        Object systemService = this.f104504b.getSystemService("audio");
        if (systemService != null) {
            this.f104503a = (AudioManager) systemService;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.media.AudioManager");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|(2:11|12)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        m128517a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        m128517a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        m128517a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0054, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0056 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m128518a(int r8, int r9, int r10, com.p280ss.android.ugc.aweme.shortvideo.p1586p.C40208b.C40209a r11) {
        /*
            r7 = this;
            android.media.MediaPlayer r6 = new android.media.MediaPlayer
            r6.<init>()
            android.content.Context r0 = r7.f104504b
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.AssetFileDescriptor r8 = r0.openRawResourceFd(r8)
            r6.reset()     // Catch:{ IOException -> 0x0056 }
            java.lang.String r0 = "assetFileDescriptor"
            kotlin.jvm.internal.C7573i.m23582a(r8, r0)     // Catch:{ IOException -> 0x0056 }
            java.io.FileDescriptor r1 = r8.getFileDescriptor()     // Catch:{ IOException -> 0x0056 }
            long r2 = r8.getStartOffset()     // Catch:{ IOException -> 0x0056 }
            long r4 = r8.getLength()     // Catch:{ IOException -> 0x0056 }
            r0 = r6
            r0.setDataSource(r1, r2, r4)     // Catch:{ IOException -> 0x0056 }
            r0 = 3
            r6.setAudioStreamType(r0)     // Catch:{ IOException -> 0x0056 }
            r6.prepareAsync()     // Catch:{ IOException -> 0x0056 }
            com.ss.android.ugc.aweme.shortvideo.p.b$b r0 = new com.ss.android.ugc.aweme.shortvideo.p.b$b     // Catch:{ IOException -> 0x0056 }
            r0.<init>(r7, r9)     // Catch:{ IOException -> 0x0056 }
            android.media.MediaPlayer$OnPreparedListener r0 = (android.media.MediaPlayer.OnPreparedListener) r0     // Catch:{ IOException -> 0x0056 }
            r6.setOnPreparedListener(r0)     // Catch:{ IOException -> 0x0056 }
            com.ss.android.ugc.aweme.shortvideo.p.b$c r9 = new com.ss.android.ugc.aweme.shortvideo.p.b$c     // Catch:{ IOException -> 0x0056 }
            r9.<init>(r7, r10)     // Catch:{ IOException -> 0x0056 }
            android.media.MediaPlayer$OnErrorListener r9 = (android.media.MediaPlayer.OnErrorListener) r9     // Catch:{ IOException -> 0x0056 }
            r6.setOnErrorListener(r9)     // Catch:{ IOException -> 0x0056 }
            com.ss.android.ugc.aweme.shortvideo.p.b$d r9 = new com.ss.android.ugc.aweme.shortvideo.p.b$d     // Catch:{ IOException -> 0x0056 }
            r9.<init>(r7, r10, r11)     // Catch:{ IOException -> 0x0056 }
            android.media.MediaPlayer$OnCompletionListener r9 = (android.media.MediaPlayer.OnCompletionListener) r9     // Catch:{ IOException -> 0x0056 }
            r6.setOnCompletionListener(r9)     // Catch:{ IOException -> 0x0056 }
            r8.close()     // Catch:{ IOException -> 0x0050 }
            goto L_0x005c
        L_0x0050:
            m128517a()
            return
        L_0x0054:
            r9 = move-exception
            goto L_0x0061
        L_0x0056:
            m128517a()     // Catch:{ all -> 0x0054 }
            r8.close()     // Catch:{ IOException -> 0x005d }
        L_0x005c:
            return
        L_0x005d:
            m128517a()
            return
        L_0x0061:
            r8.close()     // Catch:{ IOException -> 0x0065 }
            goto L_0x0068
        L_0x0065:
            m128517a()
        L_0x0068:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1586p.C40208b.m128518a(int, int, int, com.ss.android.ugc.aweme.shortvideo.p.b$a):void");
    }
}
