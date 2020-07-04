package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.models.MediaEntity;

/* renamed from: com.twitter.sdk.android.tweetui.j */
final class C47083j extends C47085l {

    /* renamed from: a */
    final String f120820a;

    /* renamed from: b */
    final String f120821b;

    C47083j(MediaEntity mediaEntity) {
        super(mediaEntity.getStart(), mediaEntity.getEnd(), mediaEntity.displayUrl, mediaEntity.url, mediaEntity.expandedUrl);
        this.f120820a = mediaEntity.type;
        this.f120821b = mediaEntity.mediaUrlHttps;
    }
}
