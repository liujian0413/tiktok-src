package com.twitter.sdk.android.tweetui;

import com.taobao.android.dexposed.ClassUtils;
import com.twitter.sdk.android.core.models.HashtagEntity;
import com.twitter.sdk.android.core.models.MentionEntity;
import com.twitter.sdk.android.core.models.SymbolEntity;
import com.twitter.sdk.android.core.models.UrlEntity;

/* renamed from: com.twitter.sdk.android.tweetui.l */
class C47085l {

    /* renamed from: c */
    int f120828c;

    /* renamed from: d */
    int f120829d;

    /* renamed from: e */
    final String f120830e;

    /* renamed from: f */
    final String f120831f;

    /* renamed from: g */
    final String f120832g;

    /* renamed from: a */
    static C47085l m147208a(UrlEntity urlEntity) {
        C47085l lVar = new C47085l(urlEntity.getStart(), urlEntity.getEnd(), urlEntity.displayUrl, urlEntity.url, urlEntity.expandedUrl);
        return lVar;
    }

    /* renamed from: a */
    static C47085l m147205a(HashtagEntity hashtagEntity) {
        String b = C47030ar.m147050b(hashtagEntity.text);
        int start = hashtagEntity.getStart();
        int end = hashtagEntity.getEnd();
        StringBuilder sb = new StringBuilder("#");
        sb.append(hashtagEntity.text);
        C47085l lVar = new C47085l(start, end, sb.toString(), b, b);
        return lVar;
    }

    /* renamed from: a */
    static C47085l m147206a(MentionEntity mentionEntity) {
        String a = C47030ar.m147047a(mentionEntity.screenName);
        int start = mentionEntity.getStart();
        int end = mentionEntity.getEnd();
        StringBuilder sb = new StringBuilder("@");
        sb.append(mentionEntity.screenName);
        C47085l lVar = new C47085l(start, end, sb.toString(), a, a);
        return lVar;
    }

    /* renamed from: a */
    static C47085l m147207a(SymbolEntity symbolEntity) {
        String c = C47030ar.m147051c(symbolEntity.text);
        int start = symbolEntity.getStart();
        int end = symbolEntity.getEnd();
        StringBuilder sb = new StringBuilder(ClassUtils.INNER_CLASS_SEPARATOR);
        sb.append(symbolEntity.text);
        C47085l lVar = new C47085l(start, end, sb.toString(), c, c);
        return lVar;
    }

    C47085l(int i, int i2, String str, String str2, String str3) {
        this.f120828c = i;
        this.f120829d = i2;
        this.f120830e = str;
        this.f120831f = str2;
        this.f120832g = str3;
    }
}
