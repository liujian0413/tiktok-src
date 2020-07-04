package com.p280ss.android.ugc.aweme.choosemusic.fragment;

import android.content.Intent;
import android.support.p022v4.app.Fragment;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.n */
public final class C23938n {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063 A[SYNTHETIC, Splitter:B:17:0x0063] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0082  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.support.p022v4.app.Fragment m78571a(android.content.Intent r10) {
        /*
            if (r10 == 0) goto L_0x0087
            java.lang.String r0 = "cid"
            java.lang.String r0 = r10.getStringExtra(r0)
            java.lang.String r1 = "name"
            java.lang.String r1 = r10.getStringExtra(r1)
            java.lang.String r2 = "is_hot"
            java.lang.String r2 = r10.getStringExtra(r2)
            java.lang.String r3 = "music_category_is_hot"
            r4 = 0
            boolean r3 = r10.getBooleanExtra(r3, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x002b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x002b }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x002b }
            r8 = r2
            goto L_0x002c
        L_0x002b:
            r8 = r3
        L_0x002c:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = "music_class_id"
            java.lang.String r2 = r10.getStringExtra(r2)
            r4 = r2
            goto L_0x003b
        L_0x003a:
            r4 = r0
        L_0x003b:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0047
            java.lang.String r1 = "music_class_name"
            java.lang.String r1 = r10.getStringExtra(r1)
        L_0x0047:
            r5 = r1
            java.lang.String r6 = "change_music_page_detail"
            java.lang.String r1 = "music_class_enter_method"
            java.lang.String r1 = r10.getStringExtra(r1)
            java.lang.String r2 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            r3 = 1
            int r2 = r10.getIntExtra(r2, r3)
            java.lang.String r3 = "musicType"
            java.lang.String r10 = r10.getStringExtra(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r10)
            if (r3 != 0) goto L_0x0070
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Exception -> 0x006d }
            int r10 = r10.intValue()     // Catch:{ Exception -> 0x006d }
            r7 = r10
            goto L_0x0071
        L_0x006d:
            r10 = 2
            r7 = 2
            goto L_0x0071
        L_0x0070:
            r7 = r2
        L_0x0071:
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 != 0) goto L_0x007b
            java.lang.String r10 = "click_banner"
            r9 = r10
            goto L_0x007c
        L_0x007b:
            r9 = r1
        L_0x007c:
            boolean r10 = android.text.TextUtils.isEmpty(r4)
            if (r10 != 0) goto L_0x0087
            com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment r10 = com.p280ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment.m78380a(r4, r5, r6, r7, r8, r9)
            return r10
        L_0x0087:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.choosemusic.fragment.C23938n.m78571a(android.content.Intent):android.support.v4.app.Fragment");
    }

    /* renamed from: a */
    public static Fragment m78570a(int i, Intent intent) {
        switch (i) {
            case 1:
                return HotMusicListFragment.m78317a(intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1));
            case 2:
                return m78571a(intent);
            case 3:
                return LocalMusicFragment.m78330a(intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1));
            case 4:
                return MusicSheetFragment.m78396a(intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1));
            case 5:
                return LocalMusicFragment.m78330a(intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 2));
            case 6:
                return LocalMusicFragment.m78330a(intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 0));
            default:
                return HotMusicListFragment.m78317a(intent.getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1));
        }
    }
}
