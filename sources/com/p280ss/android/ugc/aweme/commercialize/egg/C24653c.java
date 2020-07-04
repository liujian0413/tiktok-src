package com.p280ss.android.ugc.aweme.commercialize.egg;

import com.p280ss.android.ugc.aweme.feed.model.ItemCommentEggData;
import com.p280ss.android.ugc.aweme.feed.model.ItemLikeEggData;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.c */
public final class C24653c {

    /* renamed from: f */
    public static final C24654a f65007f = new C24654a(null);

    /* renamed from: a */
    public boolean f65008a;

    /* renamed from: b */
    public C24635a f65009b;

    /* renamed from: c */
    public C24657f f65010c;

    /* renamed from: d */
    public String f65011d;

    /* renamed from: e */
    public String f65012e;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.c$a */
    public static final class C24654a {
        private C24654a() {
        }

        public /* synthetic */ C24654a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C24641b m80813a(ItemCommentEggData itemCommentEggData, boolean z, C24657f fVar) {
            boolean z2;
            if (itemCommentEggData != null) {
                CharSequence materialUrl = itemCommentEggData.getMaterialUrl();
                boolean z3 = false;
                if (materialUrl == null || materialUrl.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    CharSequence fileType = itemCommentEggData.getFileType();
                    if (fileType == null || fileType.length() == 0) {
                        z3 = true;
                    }
                    if (!z3) {
                        String materialUrl2 = itemCommentEggData.getMaterialUrl();
                        C7573i.m23582a((Object) materialUrl2, "rawData.materialUrl");
                        String fileType2 = itemCommentEggData.getFileType();
                        C7573i.m23582a((Object) fileType2, "rawData.fileType");
                        C24653c cVar = new C24653c(materialUrl2, fileType2);
                        cVar.f65009b = new C24635a(itemCommentEggData.getEggId(), itemCommentEggData.getRegex(), itemCommentEggData.getWebUrl(), itemCommentEggData.getOpenUrl());
                        cVar.f65008a = z;
                        cVar.f65010c = fVar;
                        return cVar.mo64521a();
                    }
                }
            }
            return null;
        }

        /* renamed from: a */
        public static C24641b m80814a(ItemLikeEggData itemLikeEggData, boolean z, C24657f fVar) {
            boolean z2;
            if (itemLikeEggData != null) {
                CharSequence materialUrl = itemLikeEggData.getMaterialUrl();
                boolean z3 = false;
                if (materialUrl == null || materialUrl.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    CharSequence fileType = itemLikeEggData.getFileType();
                    if (fileType == null || fileType.length() == 0) {
                        z3 = true;
                    }
                    if (!z3) {
                        String materialUrl2 = itemLikeEggData.getMaterialUrl();
                        C7573i.m23582a((Object) materialUrl2, "rawData.materialUrl");
                        String fileType2 = itemLikeEggData.getFileType();
                        C7573i.m23582a((Object) fileType2, "rawData.fileType");
                        C24653c cVar = new C24653c(materialUrl2, fileType2);
                        cVar.f65008a = z;
                        cVar.f65010c = fVar;
                        return cVar.mo64521a();
                    }
                }
            }
            return null;
        }
    }

    public C24653c() {
        this(null, null, 3, null);
    }

    /* renamed from: a */
    public final C24641b mo64521a() {
        C24641b bVar = new C24641b(this.f65011d, this.f65012e, this.f65009b, this.f65008a, null, null, this.f65010c, 48, null);
        return bVar;
    }

    public C24653c(String str, String str2) {
        C7573i.m23587b(str, "materialUrl");
        C7573i.m23587b(str2, "fileType");
        this.f65011d = str;
        this.f65012e = str2;
        this.f65008a = true;
    }

    private /* synthetic */ C24653c(String str, String str2, int i, C7571f fVar) {
        this("", "");
    }
}
