package com.snapchat.kit.sdk.creative.p808a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import com.C1642a;
import com.snapchat.kit.sdk.creative.media.SnapSticker;
import com.snapchat.kit.sdk.creative.models.SnapContent;
import com.snapchat.kit.sdk.util.SnapUtils;
import java.util.ArrayList;

/* renamed from: com.snapchat.kit.sdk.creative.a.a */
public final class C18706a {

    /* renamed from: a */
    private final SnapContent f50510a;

    /* renamed from: b */
    private final String f50511b;

    /* renamed from: a */
    public final Intent mo49194a(Context context) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setDataAndType(Uri.parse(C1642a.m8034a("snapchat://%s?link=%s", new Object[]{this.f50510a.getDeeplinkUrlPath(), this.f50511b})), this.f50510a.getIntentType());
        Uri fileProviderUri = SnapUtils.getFileProviderUri(context, this.f50510a.getMediaFile());
        SnapSticker snapSticker = this.f50510a.getSnapSticker();
        if (snapSticker != null) {
            Uri fileProviderUri2 = SnapUtils.getFileProviderUri(context, snapSticker.getStickerFile());
            intent.putExtra("sticker", snapSticker.getJsonForm(fileProviderUri2).toString());
            ArrayList arrayList = new ArrayList();
            if (fileProviderUri != null) {
                arrayList.add(fileProviderUri);
            }
            arrayList.add(fileProviderUri2);
            if (arrayList.size() > 1) {
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                intent.setAction("android.intent.action.SEND_MULTIPLE");
            } else if (!arrayList.isEmpty()) {
                intent.putExtra("android.intent.extra.STREAM", (Parcelable) arrayList.get(0));
            }
        } else if (fileProviderUri != null) {
            intent.putExtra("android.intent.extra.STREAM", fileProviderUri);
        }
        String attachmentUrl = this.f50510a.getAttachmentUrl();
        if (!TextUtils.isEmpty(attachmentUrl)) {
            intent.putExtra("attachmentUrl", attachmentUrl);
        }
        String captionText = this.f50510a.getCaptionText();
        if (!TextUtils.isEmpty(captionText)) {
            intent.putExtra("captionText", captionText);
        }
        return intent;
    }

    public C18706a(String str, SnapContent snapContent) {
        this.f50511b = str;
        this.f50510a = snapContent;
    }
}
