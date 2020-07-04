package com.p280ss.android.ugc.aweme.p313im.sdk.media.model;

import com.p280ss.android.ugc.aweme.p313im.sdk.media.p1329b.C31346c;
import java.io.Serializable;
import kotlin.C7581n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.model.MediaModel */
public final class MediaModel implements Serializable {
    private long date;
    private long dateModify;
    private long duration;
    private String filePath;
    private long fileSize;
    private int height;

    /* renamed from: id */
    private final long f82317id;
    private boolean isResized;
    private String mimeType;
    private String thumbnail;
    private int type;
    private int width;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.model.MediaModel$a */
    static final class C31432a extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaModel f82318a;

        /* renamed from: b */
        final /* synthetic */ C7562b f82319b;

        C31432a(MediaModel mediaModel, C7562b bVar) {
            this.f82318a = mediaModel;
            this.f82319b = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m102244a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m102244a() {
            C7562b bVar = this.f82319b;
            if (bVar != null) {
                bVar.invoke(this.f82318a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.model.MediaModel$b */
    static final class C31433b extends Lambda implements C7562b<Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MediaModel f82320a;

        /* renamed from: b */
        final /* synthetic */ C7562b f82321b;

        C31433b(MediaModel mediaModel, C7562b bVar) {
            this.f82320a = mediaModel;
            this.f82321b = bVar;
            super(1);
        }

        /* renamed from: a */
        private void m102245a(boolean z) {
            C7562b bVar = this.f82321b;
            if (bVar != null) {
                bVar.invoke(this.f82320a);
            }
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m102245a(((Boolean) obj).booleanValue());
            return C7581n.f20898a;
        }
    }

    public final long getDate() {
        return this.date;
    }

    public final long getDateModify() {
        return this.dateModify;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getId() {
        return this.f82317id;
    }

    public final String getMimeType() {
        return this.mimeType;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final int getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isResized() {
        return this.isResized;
    }

    public final boolean isImage() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    public final boolean isVideo() {
        if (this.type == 1) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.valueOf(this.f82317id).hashCode();
    }

    public final boolean isGif() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public final void setDate(long j) {
        this.date = j;
    }

    public final void setDateModify(long j) {
        this.dateModify = j;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setFilePath(String str) {
        this.filePath = str;
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setMimeType(String str) {
        this.mimeType = str;
    }

    public final void setResized(boolean z) {
        this.isResized = z;
    }

    public final void setThumbnail(String str) {
        this.thumbnail = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    public MediaModel(long j) {
        this.f82317id = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MediaModel) && this.f82317id == ((MediaModel) obj).f82317id) {
            return true;
        }
        return false;
    }

    public final void accurateSize(boolean z, C7562b<? super MediaModel, C7581n> bVar) {
        if (isVideo()) {
            accurateSizeVideo(z, bVar);
        } else if (isImage()) {
            accurateSizeImage(z, bVar);
        } else if (bVar != null) {
            bVar.invoke(this);
        }
    }

    private final void accurateSizeImage(boolean z, C7562b<? super MediaModel, C7581n> bVar) {
        if (this.isResized) {
            if (bVar != null) {
                bVar.invoke(this);
            }
        } else if (z) {
            C31346c.f82131a.mo81920c(this);
            if (bVar != null) {
                bVar.invoke(this);
            }
        } else {
            C31346c.m102059a(this, (C7561a<C7581n>) new C31432a<C7581n>(this, bVar));
        }
    }

    private final void accurateSizeVideo(boolean z, C7562b<? super MediaModel, C7581n> bVar) {
        if (this.isResized) {
            if (bVar != null) {
                bVar.invoke(this);
            }
        } else if (z) {
            C31346c.m102063b(this);
            if (bVar != null) {
                bVar.invoke(this);
            }
        } else {
            C31346c.m102062b(this, new C31433b(this, bVar));
        }
    }

    public static /* synthetic */ void accurateSize$default(MediaModel mediaModel, boolean z, C7562b bVar, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        mediaModel.accurateSize(z, bVar);
    }
}
