package com.p280ss.android.ugc.aweme.servicimpl;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.festival.C29130b;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.w */
public final class C37519w implements C29130b {

    /* renamed from: a */
    public static final C37520a f97869a = new C37520a(null);

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.w$a */
    public static final class C37520a {
        private C37520a() {
        }

        public /* synthetic */ C37520a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.w$b */
    static final class C37521b<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ EditPreviewInfo f97870a;

        /* renamed from: b */
        final /* synthetic */ C27311c f97871b;

        /* renamed from: c */
        final /* synthetic */ C7561a f97872c;

        C37521b(EditPreviewInfo editPreviewInfo, C27311c cVar, C7561a aVar) {
            this.f97870a = editPreviewInfo;
            this.f97871b = cVar;
            this.f97872c = aVar;
        }

        public final /* synthetic */ Object call() {
            m120201a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m120201a() {
            boolean z;
            String str;
            String draftDir = this.f97870a.getDraftDir();
            new File(draftDir).mkdirs();
            List arrayList = new ArrayList();
            int i = 0;
            for (Object next : this.f97870a.getVideoList()) {
                int i2 = i + 1;
                if (i < 0) {
                    C7525m.m23465b();
                }
                EditVideoSegment editVideoSegment = (EditVideoSegment) next;
                StringBuilder sb = new StringBuilder();
                sb.append(draftDir);
                sb.append(i);
                sb.append("_video_copy");
                String sb2 = sb.toString();
                C7276d.m22820d(editVideoSegment.getVideoPath(), sb2);
                String audioPath = editVideoSegment.getAudioPath();
                CharSequence charSequence = audioPath;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(!z)) {
                    audioPath = null;
                }
                if (audioPath != null) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(draftDir);
                    sb3.append(i);
                    sb3.append("_audio_copy");
                    String sb4 = sb3.toString();
                    C7276d.m22820d(audioPath, sb4);
                    str = sb4;
                } else {
                    str = null;
                }
                arrayList.add(EditVideoSegment.copy$default(editVideoSegment, sb2, str, null, null, 12, null));
                i = i2;
            }
            this.f97871b.mo70237b(arrayList);
            this.f97872c.invoke();
        }
    }

    /* renamed from: a */
    public final void mo74592a(EditPreviewInfo editPreviewInfo, C27311c cVar, C7561a<C7581n> aVar) {
        C7573i.m23587b(editPreviewInfo, "previewInfo");
        C7573i.m23587b(cVar, "draft");
        C7573i.m23587b(aVar, "onUpdate");
        C1592h.m7855a((Callable<TResult>) new C37521b<TResult>(editPreviewInfo, cVar, aVar), (Executor) C7258h.m22730c());
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74591a(android.content.Context r18, java.io.File r19, com.p280ss.android.ugc.aweme.common.ShareContext r20) {
        /*
            r17 = this;
            r0 = r18
            r1 = r20
            java.lang.String r2 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r0, r2)
            java.lang.String r2 = "videoFile"
            r3 = r19
            kotlin.jvm.internal.C7573i.m23587b(r3, r2)
            java.lang.String r2 = "shareContext"
            kotlin.jvm.internal.C7573i.m23587b(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = r19.getAbsolutePath()
            com.ss.android.ugc.aweme.festival.FestivalPublishData r4 = com.p280ss.android.ugc.aweme.shortvideo.edit.C39526e.m126242a(r20)
            java.lang.String r5 = r1.mCallerPackage
            if (r5 != 0) goto L_0x0027
            goto L_0x004c
        L_0x0027:
            int r6 = r5.hashCode()
            r7 = 187439632(0xb2c1a10, float:3.3145602E-32)
            if (r6 == r7) goto L_0x0041
            r7 = 975995882(0x3a2c83ea, float:6.580936E-4)
            if (r6 == r7) goto L_0x0036
            goto L_0x004c
        L_0x0036:
            java.lang.String r6 = "com.gorgeous.lite"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x004c
            java.lang.String r5 = "miracle_game_qingyan"
            goto L_0x004e
        L_0x0041:
            java.lang.String r6 = "com.lemon.faceu"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x004c
            java.lang.String r5 = "miracle_game_jimeng"
            goto L_0x004e
        L_0x004c:
            java.lang.String r5 = "miracle_game_douyin"
        L_0x004e:
            java.lang.String r6 = "extra_edit_preview_info"
            com.ss.android.ugc.aweme.shortvideo.edit.model.d r15 = new com.ss.android.ugc.aweme.shortvideo.edit.model.d
            com.ss.android.ugc.aweme.services.video.IVideoConfigService r7 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93255r
            java.lang.String r8 = "AVEnv.IMPORT_VIDEO_CONFIG_SERVICE"
            kotlin.jvm.internal.C7573i.m23582a(r7, r8)
            int r8 = r7.getVideoWidth()
            com.ss.android.ugc.aweme.services.video.IVideoConfigService r7 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93255r
            java.lang.String r9 = "AVEnv.IMPORT_VIDEO_CONFIG_SERVICE"
            kotlin.jvm.internal.C7573i.m23582a(r7, r9)
            int r9 = r7.getVideoHeight()
            r10 = 0
            r12 = 0
            r14 = 12
            r16 = 0
            r7 = r15
            r0 = r15
            r15 = r16
            r7.<init>(r8, r9, r10, r12, r14, r15)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r7 = new com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment
            java.lang.String r8 = "videoPah"
            kotlin.jvm.internal.C7573i.m23582a(r3, r8)
            if (r4 == 0) goto L_0x0085
            java.lang.String r8 = r4.getAudioPath()
            goto L_0x0086
        L_0x0085:
            r8 = 0
        L_0x0086:
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo r9 = com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39692a.m127021a(r3)
            r7.<init>(r3, r8, r9)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r0 = r0.mo99058a(r7)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r2.putExtra(r6, r0)
            java.lang.String r0 = "shoot_way"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "content_source"
            java.lang.String r3 = "upload"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "content_type"
            java.lang.String r3 = "video"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "creation_id"
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            r2.putExtra(r0, r3)
            java.lang.String r0 = "extra_share_context"
            r3 = r1
            java.io.Serializable r3 = (java.io.Serializable) r3
            r2.putExtra(r0, r3)
            r0 = 1
            if (r4 == 0) goto L_0x00e3
            java.lang.String r3 = r4.getAudioPath()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x00d2
            int r3 = r3.length()
            if (r3 != 0) goto L_0x00d0
            goto L_0x00d2
        L_0x00d0:
            r3 = 0
            goto L_0x00d3
        L_0x00d2:
            r3 = 1
        L_0x00d3:
            if (r3 == 0) goto L_0x00da
            java.lang.String r3 = "extra_av_is_fast_import"
            r2.putExtra(r3, r0)
        L_0x00da:
            java.lang.String r3 = "extra_festival_external_challenge_id"
            java.lang.String r4 = r4.getChallengeId()
            r2.putExtra(r3, r4)
        L_0x00e3:
            java.lang.String r1 = r20.getChallengeName()
            if (r1 == 0) goto L_0x00f7
            com.ss.android.ugc.aweme.shortvideo.AVChallenge r3 = new com.ss.android.ugc.aweme.shortvideo.AVChallenge
            r3.<init>()
            r3.challengeName = r1
            java.lang.String r1 = "av_challenge"
            java.io.Serializable r3 = (java.io.Serializable) r3
            r2.putExtra(r1, r3)
        L_0x00f7:
            r1 = r18
            com.p280ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity.m125843a(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.servicimpl.C37519w.mo74591a(android.content.Context, java.io.File, com.ss.android.ugc.aweme.common.ShareContext):void");
    }
}
