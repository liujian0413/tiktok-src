package com.p280ss.android.ugc.aweme.shortvideo.upload;

import com.p280ss.android.ugc.aweme.shortvideo.C38455ap;
import com.p280ss.android.ugc.aweme.shortvideo.C40023l;
import com.p280ss.android.ugc.aweme.shortvideo.VideoPublishException;
import java.util.ArrayList;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.PublishCallbacks */
public final class PublishCallbacks extends ArrayList<C40023l<C38455ap>> implements C40023l<C38455ap> {
    public final int getSize() {
        return super.size();
    }

    public final int size() {
        return getSize();
    }

    public final /* bridge */ boolean contains(C40023l lVar) {
        return super.contains(lVar);
    }

    public final /* bridge */ int indexOf(C40023l lVar) {
        return super.indexOf(lVar);
    }

    public final /* bridge */ int lastIndexOf(C40023l lVar) {
        return super.lastIndexOf(lVar);
    }

    public final C40023l<C38455ap> remove(int i) {
        return removeAt(i);
    }

    public final C40023l removeAt(int i) {
        return (C40023l) super.remove(i);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C40023l)) {
            return false;
        }
        return contains((C40023l) obj);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C40023l)) {
            return -1;
        }
        return indexOf((C40023l) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C40023l)) {
            return -1;
        }
        return lastIndexOf((C40023l) obj);
    }

    public final /* bridge */ boolean remove(C40023l lVar) {
        return super.remove(lVar);
    }

    public final void onError(VideoPublishException videoPublishException) {
        C7573i.m23587b(videoPublishException, "e");
        for (C40023l onError : this) {
            onError.onError(videoPublishException);
        }
    }

    public final void onSynthetiseSuccess(String str) {
        C7573i.m23587b(str, "path");
        for (C40023l onSynthetiseSuccess : this) {
            onSynthetiseSuccess.onSynthetiseSuccess(str);
        }
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof C40023l)) {
            return false;
        }
        return remove((C40023l) obj);
    }

    public final void onProgressUpdate(int i, boolean z) {
        for (C40023l onProgressUpdate : this) {
            onProgressUpdate.onProgressUpdate(i, z);
        }
    }

    public final void onSuccess(C38455ap apVar, boolean z) {
        C7573i.m23587b(apVar, "response");
        for (C40023l onSuccess : this) {
            onSuccess.onSuccess(apVar, z);
        }
    }
}
