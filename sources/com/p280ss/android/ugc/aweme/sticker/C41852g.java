package com.p280ss.android.ugc.aweme.sticker;

import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;

/* renamed from: com.ss.android.ugc.aweme.sticker.g */
public final class C41852g implements C41845b {
    /* renamed from: a */
    public final AbsInteractStickerWidget mo102610a() {
        return new InteractStickerWidget();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102611a(com.p280ss.android.ugc.aweme.feed.model.Aweme r8, android.content.Context r9, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.String r0 = "aweme"
            kotlin.jvm.internal.C7573i.m23587b(r8, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r9, r0)
            java.lang.String r0 = r8.getStickerIDs()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00bb
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r0 = r8.getStickerIDs()
            java.lang.String r1 = "aweme.stickerIDs"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = ","
            kotlin.text.Regex r2 = new kotlin.text.Regex
            r2.<init>(r1)
            r1 = 0
            java.util.List r0 = r2.split(r0, r1)
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x0066
            int r2 = r0.size()
            java.util.ListIterator r2 = r0.listIterator(r2)
        L_0x0040:
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto L_0x0066
            java.lang.Object r3 = r2.previous()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            r4 = 1
            if (r3 != 0) goto L_0x0057
            r3 = 1
            goto L_0x0058
        L_0x0057:
            r3 = 0
        L_0x0058:
            if (r3 != 0) goto L_0x0040
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            int r2 = r2.nextIndex()
            int r2 = r2 + r4
            java.util.List r0 = kotlin.collections.C7525m.m23505c(r0, r2)
            goto L_0x006a
        L_0x0066:
            java.util.List r0 = kotlin.collections.C7525m.m23461a()
        L_0x006a:
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            if (r0 == 0) goto L_0x00b3
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
        L_0x0077:
            if (r1 >= r2) goto L_0x0087
            r3 = r0[r1]
            boolean r4 = r5.contains(r3)
            if (r4 != 0) goto L_0x0084
            r5.add(r3)
        L_0x0084:
            int r1 = r1 + 1
            goto L_0x0077
        L_0x0087:
            java.lang.String r2 = r8.getAid()
            com.ss.android.ugc.aweme.music.model.Music r0 = r8.getMusic()
            if (r0 == 0) goto L_0x00a4
            com.ss.android.ugc.aweme.shortvideo.r.c r0 = new com.ss.android.ugc.aweme.shortvideo.r.c
            r0.<init>()
            com.ss.android.ugc.aweme.music.model.Music r0 = r8.getMusic()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r0.convertToMusicModel()
            com.ss.android.ugc.aweme.shortvideo.AVMusic r0 = com.p280ss.android.ugc.aweme.shortvideo.p1588r.C40250c.m128598a(r0)
        L_0x00a2:
            r3 = r0
            goto L_0x00a6
        L_0x00a4:
            r0 = 0
            goto L_0x00a2
        L_0x00a6:
            com.ss.android.ugc.aweme.music.model.Music r8 = r8.getMusic()
            r4 = r8
            java.io.Serializable r4 = (java.io.Serializable) r4
            r1 = r9
            r6 = r10
            com.p280ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity.m133130a(r1, r2, r3, r4, r5, r6)
            goto L_0x00bb
        L_0x00b3:
            kotlin.TypeCastException r8 = new kotlin.TypeCastException
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.Array<T>"
            r8.<init>(r9)
            throw r8
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.sticker.C41852g.mo102611a(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, java.lang.String):void");
    }
}
