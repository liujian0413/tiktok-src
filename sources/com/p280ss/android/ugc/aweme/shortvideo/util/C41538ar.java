package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38309j;
import com.p280ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.ar */
final /* synthetic */ class C41538ar implements OnClickListener {

    /* renamed from: a */
    private final AVUploadSaveModel f108007a;

    /* renamed from: b */
    private final Activity f108008b;

    /* renamed from: c */
    private final CreateAwemeResponse f108009c;

    /* renamed from: d */
    private final C38309j f108010d;

    C41538ar(AVUploadSaveModel aVUploadSaveModel, Activity activity, CreateAwemeResponse createAwemeResponse, C38309j jVar) {
        this.f108007a = aVUploadSaveModel;
        this.f108008b = activity;
        this.f108009c = createAwemeResponse;
        this.f108010d = jVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C41537aq.m132296a(this.f108007a, this.f108008b, this.f108009c, this.f108010d, dialogInterface, i);
    }
}
