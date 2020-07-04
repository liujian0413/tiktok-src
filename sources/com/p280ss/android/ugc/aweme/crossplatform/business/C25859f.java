package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.p848c.p849a.p850a.C19226a;
import com.p280ss.android.p848c.p849a.p850a.C19229b;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.f */
final /* synthetic */ class C25859f implements OnClickListener {

    /* renamed from: a */
    private final DownloadBusiness f68396a;

    /* renamed from: b */
    private final C19229b f68397b;

    /* renamed from: c */
    private final C19226a f68398c;

    C25859f(DownloadBusiness downloadBusiness, C19229b bVar, C19226a aVar) {
        this.f68396a = downloadBusiness;
        this.f68397b = bVar;
        this.f68398c = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f68396a.mo67183a(this.f68397b, this.f68398c, dialogInterface, i);
    }
}
