package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.mediachoose.p1390a.C33153d;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39182e;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39186f.C39187a;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C39193g;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p1556c.C39173k;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.listener.C40183d;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.utils.C43142i;
import com.p280ss.android.ugc.aweme.utils.MediaType;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VEUtils;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab */
public final class C40121ab implements C40129c {

    /* renamed from: a */
    public List<? extends AVMusic> f104309a;

    /* renamed from: b */
    public final Activity f104310b;

    /* renamed from: c */
    public final long f104311c;

    /* renamed from: d */
    public final long f104312d;

    /* renamed from: e */
    private ShortVideoContext f104313e;

    /* renamed from: f */
    private C41654d f104314f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab$a */
    public static final class C40122a implements C40183d {

        /* renamed from: a */
        final /* synthetic */ C40121ab f104315a;

        /* renamed from: b */
        final /* synthetic */ List f104316b;

        /* renamed from: a */
        public final void mo99882a(boolean z) {
            this.f104315a.mo99878a();
            this.f104315a.mo99880a(this.f104316b);
        }

        C40122a(C40121ab abVar, List list) {
            this.f104315a = abVar;
            this.f104316b = list;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab$b */
    public static final class C40123b implements C40183d {

        /* renamed from: a */
        final /* synthetic */ C40121ab f104317a;

        /* renamed from: b */
        final /* synthetic */ List f104318b;

        /* renamed from: a */
        public final void mo99882a(boolean z) {
            this.f104317a.mo99878a();
            C40121ab abVar = this.f104317a;
            String str = ((MediaModel) this.f104318b.get(0)).f88156b;
            C7573i.m23582a((Object) str, "videosInfo[0].filePath");
            abVar.mo99879a(str, null);
        }

        C40123b(C40121ab abVar, List list) {
            this.f104317a = abVar;
            this.f104318b = list;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab$c */
    public static final class C40124c implements C40183d {

        /* renamed from: a */
        final /* synthetic */ C40121ab f104319a;

        /* renamed from: b */
        final /* synthetic */ int f104320b;

        /* renamed from: c */
        final /* synthetic */ StringBuilder f104321c;

        /* renamed from: d */
        final /* synthetic */ List f104322d;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab$c$a */
        public static final class C40125a implements C39173k {

            /* renamed from: a */
            final /* synthetic */ C40124c f104323a;

            C40125a(C40124c cVar) {
                this.f104323a = cVar;
            }

            /* renamed from: a */
            public final void mo97449a(List<? extends AVMusic> list) {
                this.f104323a.f104319a.f104309a = list;
            }

            /* renamed from: a */
            public final void mo97446a(AVMusic aVMusic) {
                this.f104323a.f104319a.mo99878a();
                C40121ab abVar = this.f104323a.f104319a;
                String str = ((MediaModel) this.f104323a.f104322d.get(0)).f88156b;
                C7573i.m23582a((Object) str, "videosInfo[0].filePath");
                abVar.mo99879a(str, this.f104323a.f104319a.f104309a);
            }

            /* renamed from: b */
            public final void mo97451b(Exception exc) {
                this.f104323a.f104319a.mo99878a();
                C40121ab abVar = this.f104323a.f104319a;
                String str = ((MediaModel) this.f104323a.f104322d.get(0)).f88156b;
                C7573i.m23582a((Object) str, "videosInfo[0].filePath");
                abVar.mo99879a(str, null);
            }

            /* renamed from: a */
            public final void mo97448a(Exception exc) {
                this.f104323a.f104319a.mo99878a();
                C40121ab abVar = this.f104323a.f104319a;
                String str = ((MediaModel) this.f104323a.f104322d.get(0)).f88156b;
                C7573i.m23582a((Object) str, "videosInfo[0].filePath");
                abVar.mo99879a(str, null);
            }

            /* renamed from: b */
            public final void mo97450b(AVMusic aVMusic, Exception exc) {
                this.f104323a.f104319a.mo99878a();
                C40121ab abVar = this.f104323a.f104319a;
                String str = ((MediaModel) this.f104323a.f104322d.get(0)).f88156b;
                C7573i.m23582a((Object) str, "videosInfo[0].filePath");
                abVar.mo99879a(str, this.f104323a.f104319a.f104309a);
            }

            /* renamed from: a */
            public final void mo97447a(AVMusic aVMusic, Exception exc) {
                this.f104323a.f104319a.mo99878a();
                C40121ab abVar = this.f104323a.f104319a;
                String str = ((MediaModel) this.f104323a.f104322d.get(0)).f88156b;
                C7573i.m23582a((Object) str, "videosInfo[0].filePath");
                abVar.mo99879a(str, this.f104323a.f104319a.f104309a);
            }
        }

        /* renamed from: a */
        public final void mo99882a(boolean z) {
            C39187a.m125119a().mo97474a(this.f104319a.f104310b.getApplicationContext(), this.f104320b, this.f104321c.toString(), new C40125a(this));
        }

        C40124c(C40121ab abVar, int i, StringBuilder sb, List list) {
            this.f104319a = abVar;
            this.f104320b = i;
            this.f104321c = sb;
            this.f104322d = list;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab$d */
    static final class C40126d<V> implements Callable<Integer> {

        /* renamed from: a */
        final /* synthetic */ C40121ab f104324a;

        /* renamed from: b */
        final /* synthetic */ List f104325b;

        C40126d(C40121ab abVar, List list) {
            this.f104324a = abVar;
            this.f104325b = list;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(m128278a());
        }

        /* renamed from: a */
        private int m128278a() {
            List<MediaModel> list = this.f104325b;
            if (list == null) {
                C7573i.m23580a();
            }
            for (MediaModel mediaModel : list) {
                if (mediaModel.f88158d == 4) {
                    return C40121ab.m128258a(mediaModel.f88156b);
                }
            }
            return -1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ab$e */
    static final class C40127e<TTaskResult, TContinuationResult> implements C1591g<Integer, Object> {

        /* renamed from: a */
        final /* synthetic */ C40121ab f104326a;

        /* renamed from: b */
        final /* synthetic */ List f104327b;

        /* renamed from: c */
        final /* synthetic */ int f104328c;

        /* renamed from: d */
        final /* synthetic */ int f104329d;

        C40127e(C40121ab abVar, List list, int i, int i2) {
            this.f104326a = abVar;
            this.f104327b = list;
            this.f104328c = i;
            this.f104329d = i2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<Integer> hVar) {
            if (hVar == null || hVar.mo6890e() == null) {
                this.f104326a.mo99881a(this.f104327b, this.f104328c, this.f104329d, -1);
            } else {
                C40121ab abVar = this.f104326a;
                List list = this.f104327b;
                int i = this.f104328c;
                int i2 = this.f104329d;
                Object e = hVar.mo6890e();
                C7573i.m23582a(e, "it.result");
                abVar.mo99881a(list, i, i2, ((Number) e).intValue());
            }
            return null;
        }
    }

    /* renamed from: a */
    public final void mo99881a(List<? extends MediaModel> list, int i, int i2, int i3) {
        String str;
        C22984d a = C22984d.m75611a().mo59973a("content_type", "video");
        String str2 = "upload_type";
        if (list == null) {
            C7573i.m23580a();
        }
        C22984d a2 = a.mo59973a(str2, list.size() > 1 ? "multiple_content" : "single_content").mo59970a("video_cnt", i).mo59970a("pic_cnt", list.size() - i).mo59970a("duration_ms", i2);
        String str3 = "creation_id";
        ShortVideoContext shortVideoContext = this.f104313e;
        if (shortVideoContext == null) {
            C7573i.m23583a("shortVideoContext");
        }
        C22984d a3 = a2.mo59973a(str3, shortVideoContext.f99787w);
        String str4 = "fps";
        if (i3 < 0) {
            str = "";
        } else {
            str = String.valueOf(i3);
        }
        C6907h.m21524a("upload_content_next", (Map) a3.mo59973a(str4, str).f60753a);
    }

    /* renamed from: b */
    private final void m128260b() {
        if (this.f104310b != null && !this.f104310b.isFinishing()) {
            this.f104314f = C41654d.m132586b(this.f104310b, this.f104310b.getString(R.string.dy2));
            C41654d dVar = this.f104314f;
            if (dVar != null) {
                dVar.setIndeterminate(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo99878a() {
        Boolean bool;
        if (this.f104314f != null) {
            C41654d dVar = this.f104314f;
            if (dVar != null) {
                bool = Boolean.valueOf(dVar.isShowing());
            } else {
                bool = null;
            }
            if (bool == null) {
                C7573i.m23580a();
            }
            if (bool.booleanValue()) {
                C41654d dVar2 = this.f104314f;
                if (dVar2 != null) {
                    dVar2.dismiss();
                }
            }
        }
    }

    /* renamed from: a */
    public static int m128258a(String str) {
        if (!C7276d.m22812b(str)) {
            return -1;
        }
        int[] iArr = new int[10];
        C35574k.m114859a().mo70100o();
        if (str == null) {
            C7573i.m23580a();
        }
        if (VEUtils.getVideoFileInfo(C43142i.m136842a(str, MediaType.VIDEO), iArr) == 0) {
            return iArr[7];
        }
        return -1;
    }

    /* renamed from: d */
    private final void m128263d(List<? extends MediaModel> list) {
        m128260b();
        int size = list.size();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            sb.append(((MediaModel) next).f88159e);
            if (i < size - 1) {
                sb.append(",");
            }
            i = i2;
        }
        C40173d.m128355a(list, new C40124c(this, size, sb, list));
    }

    /* renamed from: b */
    private final void m128261b(List<? extends MediaModel> list) {
        String str;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (((long) ((int) ((MediaModel) list.get(i3)).f88159e)) <= this.f104311c) {
                C9738o.m28697a(this.f104310b, this.f104310b.getString(R.string.fkq, new Object[]{Long.valueOf(this.f104311c / 1000)}));
                return;
            }
            i += (int) ((MediaModel) list.get(i3)).f88159e;
            if (((MediaModel) list.get(i3)).f88158d == 4) {
                i2++;
            }
        }
        long j = (long) i;
        if (j <= this.f104311c) {
            C9738o.m28697a(this.f104310b, this.f104310b.getString(R.string.fkq, new Object[]{Long.valueOf(this.f104311c / 1000)}));
            return;
        }
        long j2 = this.f104312d;
        if (1 <= j2 && j > j2) {
            C9738o.m28693a((Context) this.f104310b, (int) R.string.cap);
            return;
        }
        String str2 = "upload_content_next";
        C22984d a = C22984d.m75611a().mo59973a("content_type", "video");
        String str3 = "upload_type";
        if (list.size() > 1) {
            str = "multiple_content";
        } else {
            str = "single_content";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59970a("video_cnt", list.size()).mo59970a("video_cnt", i2).mo59970a("pic_cnt", list.size() - i2).mo59970a("duration_ms", i).mo59973a("creation_id", C39193g.m125126a()).f60753a);
        if (C40173d.m128359d()) {
            m128260b();
            C40173d.m128355a(list, new C40122a(this, list));
            return;
        }
        mo99880a(list);
    }

    /* renamed from: c */
    private final void m128262c(List<? extends MediaModel> list) {
        List<? extends MediaModel> list2 = list;
        Collection collection = list2;
        int size = collection.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if (((long) ((int) ((MediaModel) list2.get(i3)).f88159e)) <= this.f104311c) {
                C9738o.m28697a(this.f104310b, this.f104310b.getString(R.string.fkq, new Object[]{Long.valueOf(this.f104311c / 1000)}));
                return;
            }
            i += (int) ((MediaModel) list2.get(i3)).f88159e;
            if (((MediaModel) list2.get(i3)).f88158d == 4) {
                i2++;
            }
        }
        if (((long) i) <= this.f104311c) {
            C9738o.m28697a(this.f104310b, this.f104310b.getString(R.string.fkq, new Object[]{Long.valueOf(this.f104311c / 1000)}));
        } else if (i > 3600000) {
            C9738o.m28693a((Context) this.f104310b, (int) R.string.cap);
        } else {
            C33153d.m106972a().mo84906b();
            int size2 = collection.size();
            for (int i4 = 0; i4 < size2; i4++) {
                C33153d.m106972a().mo84905a((MediaModel) list2.get(i4));
            }
            m128259a(list2, i2, i);
            ShortVideoContext shortVideoContext = this.f104313e;
            if (shortVideoContext == null) {
                C7573i.m23583a("shortVideoContext");
            }
            String str = shortVideoContext.f99788x;
            ShortVideoContext shortVideoContext2 = this.f104313e;
            if (shortVideoContext2 == null) {
                C7573i.m23583a("shortVideoContext");
            }
            C39193g.m125128a(str, shortVideoContext2.f99787w);
            if (C39182e.m125104g() && list.size() > 1) {
                m128263d(list);
            } else if (list.size() <= 1 || !C40173d.m128359d()) {
                String str2 = ((MediaModel) list2.get(0)).f88156b;
                C7573i.m23582a((Object) str2, "videosInfo[0].filePath");
                mo99879a(str2, null);
            } else {
                m128260b();
                C40173d.m128355a(list2, new C40123b(this, list2));
            }
        }
    }

    /* renamed from: a */
    public final void mo99880a(List<? extends MediaModel> list) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("key_choose_media_data", new ArrayList(list));
        this.f104310b.setResult(-1, intent);
        if (this.f104310b instanceof MvChoosePhotoActivity) {
            ((MvChoosePhotoActivity) this.f104310b).mo99825c();
        } else {
            this.f104310b.finish();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0159  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo99879a(java.lang.String r6, java.util.List<? extends com.p280ss.android.ugc.aweme.shortvideo.AVMusic> r7) {
        /*
            r5 = this;
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r0 = "from_music_detail"
            java.lang.String r1 = "single_song"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r2 = r5.f104313e
            if (r2 != 0) goto L_0x0012
            java.lang.String r3 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0012:
            java.lang.String r2 = r2.f99788x
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
            r2 = 0
            if (r1 != 0) goto L_0x0044
            java.lang.String r1 = "task_platform"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r5.f104313e
            if (r3 != 0) goto L_0x0026
            java.lang.String r4 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0026:
            java.lang.String r3 = r3.f99717V
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)
            if (r1 != 0) goto L_0x0044
            java.lang.String r1 = "challenge"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r3 = r5.f104313e
            if (r3 != 0) goto L_0x0039
            java.lang.String r4 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r4)
        L_0x0039:
            java.lang.String r3 = r3.f99717V
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r3)
            if (r1 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r1 = 0
            goto L_0x0045
        L_0x0044:
            r1 = 1
        L_0x0045:
            r6.putExtra(r0, r1)
            java.lang.String r0 = "creation_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r5.f104313e
            if (r1 != 0) goto L_0x0053
            java.lang.String r3 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0053:
            java.lang.String r1 = r1.f99787w
            r6.putExtra(r0, r1)
            java.lang.String r0 = "shoot_way"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r5.f104313e
            if (r1 != 0) goto L_0x0063
            java.lang.String r3 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0063:
            java.lang.String r1 = r1.f99788x
            r6.putExtra(r0, r1)
            java.lang.String r0 = "task_id"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r5.f104313e
            if (r1 != 0) goto L_0x0073
            java.lang.String r3 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0073:
            java.lang.String r1 = r1.f99715T
            r6.putExtra(r0, r1)
            java.lang.String r0 = "challenge_names"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r5.f104313e
            if (r1 != 0) goto L_0x0083
            java.lang.String r3 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0083:
            java.util.ArrayList<java.lang.String> r1 = r1.f99716U
            java.io.Serializable r1 = (java.io.Serializable) r1
            r6.putExtra(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r5.f104313e
            if (r0 != 0) goto L_0x0093
            java.lang.String r1 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0093:
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r0 = r0.f99775k
            java.lang.String r1 = "shortVideoContext.mWorkspace"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.io.File r0 = r0.mo96317e()
            if (r0 == 0) goto L_0x00c2
            java.lang.String r0 = "path"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r5.f104313e
            if (r1 != 0) goto L_0x00ab
            java.lang.String r3 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x00ab:
            com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace r1 = r1.f99775k
            java.lang.String r3 = "shortVideoContext.mWorkspace"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            java.io.File r1 = r1.mo96317e()
            java.lang.String r3 = "shortVideoContext.mWorkspace.musicFile"
            kotlin.jvm.internal.C7573i.m23582a(r1, r3)
            java.lang.String r1 = r1.getAbsolutePath()
            r6.putExtra(r0, r1)
        L_0x00c2:
            com.ss.android.ugc.aweme.shortvideo.dw r0 = com.p280ss.android.ugc.aweme.shortvideo.C39360dw.m125725a()
            java.lang.String r1 = "PublishManager.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> r0 = r0.f102247b
            boolean r1 = com.bytedance.common.utility.C6311g.m19573a(r0)
            if (r1 != 0) goto L_0x00de
            java.lang.String r1 = "av_challenge"
            java.lang.Object r0 = r0.get(r2)
            java.io.Serializable r0 = (java.io.Serializable) r0
            r6.putExtra(r1, r0)
        L_0x00de:
            java.lang.String r0 = "poi_struct_in_tools_line"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r5.f104313e
            if (r1 != 0) goto L_0x00e9
            java.lang.String r2 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00e9:
            java.lang.String r1 = r1.f99704I
            r6.putExtra(r0, r1)
            java.lang.String r0 = "micro_app_info"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r5.f104313e
            if (r1 != 0) goto L_0x00f9
            java.lang.String r2 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x00f9:
            com.ss.android.ugc.aweme.shortvideo.edit.MicroAppModel r1 = r1.f99762aw
            java.io.Serializable r1 = (java.io.Serializable) r1
            r6.putExtra(r0, r1)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r5.f104313e
            if (r0 != 0) goto L_0x0109
            java.lang.String r1 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0109:
            com.ss.android.ugc.aweme.tools.extension.b r0 = com.p280ss.android.ugc.aweme.shortvideo.C40005j.m127914b(r0)
            com.ss.android.ugc.aweme.tools.extension.Scene r1 = com.p280ss.android.ugc.aweme.tools.extension.Scene.RECORD
            com.ss.android.ugc.aweme.tools.extension.Scene r2 = com.p280ss.android.ugc.aweme.tools.extension.Scene.CUT
            com.p280ss.android.ugc.aweme.tools.extension.C42311e.m134569a(r6, r0, r1, r2)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r5.f104313e
            if (r0 != 0) goto L_0x011d
            java.lang.String r1 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x011d:
            boolean r0 = r0.f99763ax
            if (r0 == 0) goto L_0x0124
            r0 = 1002(0x3ea, float:1.404E-42)
            goto L_0x0125
        L_0x0124:
            r0 = -1
        L_0x0125:
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.p280ss.android.ugc.aweme.base.utils.C23477d.m77081a(r1)
            if (r1 != 0) goto L_0x0142
            java.lang.String r1 = "extra_stickpoint_music_list"
            if (r7 == 0) goto L_0x013a
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.io.Serializable r7 = (java.io.Serializable) r7
            r6.putExtra(r1, r7)
            goto L_0x0142
        L_0x013a:
            kotlin.TypeCastException r6 = new kotlin.TypeCastException
            java.lang.String r7 = "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.AVMusic>"
            r6.<init>(r7)
            throw r6
        L_0x0142:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r7 = r5.f104313e
            if (r7 != 0) goto L_0x014b
            java.lang.String r1 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x014b:
            java.lang.String r7 = r7.f99789y
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r1 = "douplus"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r7 = android.text.TextUtils.equals(r7, r1)
            if (r7 == 0) goto L_0x0172
            java.lang.String r7 = "extra_mention_user_model"
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r5.f104313e
            if (r1 != 0) goto L_0x0164
            java.lang.String r2 = "shortVideoContext"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x0164:
            com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel r1 = r1.f99725aC
            java.io.Serializable r1 = (java.io.Serializable) r1
            r6.putExtra(r7, r1)
            java.lang.String r7 = "enter_from"
            java.lang.String r1 = "douplus"
            r6.putExtra(r7, r1)
        L_0x0172:
            android.app.Activity r7 = r5.f104310b
            android.content.Context r7 = (android.content.Context) r7
            com.p280ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity.C38648a.m123460a(r7, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C40121ab.mo99879a(java.lang.String, java.util.List):void");
    }

    public C40121ab(Activity activity, long j, long j2) {
        C7573i.m23587b(activity, "activity");
        this.f104310b = activity;
        this.f104311c = j;
        this.f104312d = j2;
    }

    /* renamed from: a */
    private final void m128259a(List<? extends MediaModel> list, int i, int i2) {
        if (!C23477d.m77081a((Collection<T>) list)) {
            C1592h.m7853a((Callable<TResult>) new C40126d<TResult>(this, list)).mo6876a((C1591g<TResult, TContinuationResult>) new C40127e<TResult,TContinuationResult>(this, list, i, i2), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public final void mo88198a(int i, int i2, Intent intent) {
        C7573i.m23587b(intent, "data");
        if (i == 1 || i == 2) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            C7573i.m23582a((Object) parcelableArrayListExtra, "data.getParcelableArrayL…ia.KEY_CHOOSE_MEDIA_DATA)");
            List list = parcelableArrayListExtra;
            if (i == 1) {
                Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
                C7573i.m23582a((Object) parcelableExtra, "data.getParcelableExtra(….KEY_SHORT_VIDEO_CONTEXT)");
                this.f104313e = (ShortVideoContext) parcelableExtra;
                m128262c(list);
                return;
            }
            if (i == 2) {
                m128261b(list);
            }
        }
    }
}
