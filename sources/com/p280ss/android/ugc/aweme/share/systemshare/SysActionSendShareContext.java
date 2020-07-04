package com.p280ss.android.ugc.aweme.share.systemshare;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService.C23545a;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29966f;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.opensdk.share.presenter.C34689b.C34694a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.share.systemshare.SysActionSendShareContext */
public class SysActionSendShareContext implements Parcelable {
    public static final Creator<SysActionSendShareContext> CREATOR = new Creator<SysActionSendShareContext>() {
        /* renamed from: a */
        private static SysActionSendShareContext[] m122214a(int i) {
            return new SysActionSendShareContext[i];
        }

        /* renamed from: a */
        private static SysActionSendShareContext m122213a(Parcel parcel) {
            return new SysActionSendShareContext(parcel);
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122213a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122214a(i);
        }
    };

    /* renamed from: a */
    public boolean f99411a;

    /* renamed from: b */
    public int f99412b;

    /* renamed from: c */
    public File f99413c;

    /* renamed from: d */
    public boolean f99414d;

    /* renamed from: e */
    public boolean f99415e;

    /* renamed from: f */
    public boolean f99416f;

    /* renamed from: g */
    public List<String> f99417g = new ArrayList();

    /* renamed from: h */
    private int f99418h = 360;

    /* renamed from: i */
    private float f99419i = 1.0f;

    /* renamed from: j */
    private float f99420j = 2.2f;

    public int describeContents() {
        return 0;
    }

    public SysActionSendShareContext() {
    }

    /* renamed from: b */
    public final ArrayList<MediaModel> mo95873b() {
        ArrayList<MediaModel> arrayList = new ArrayList<>();
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        long j = 0;
        int i = 0;
        for (String str : this.f99417g) {
            int[] extractVideoFileInfo = iAVService.extractVideoFileInfo(str);
            if (extractVideoFileInfo == null) {
                return null;
            }
            MediaModel mediaModel = new MediaModel((long) i);
            i++;
            mediaModel.f88156b = str;
            mediaModel.f88159e = (long) extractVideoFileInfo[3];
            mediaModel.f88163i = extractVideoFileInfo[0];
            mediaModel.f88164j = extractVideoFileInfo[1];
            mediaModel.f88165k = (double) extractVideoFileInfo[5];
            mediaModel.f88166l = (double) extractVideoFileInfo[4];
            arrayList.add(mediaModel);
            j += mediaModel.f88159e;
        }
        if (j > 3600000) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: c */
    public final boolean mo95874c() {
        if (!this.f99411a) {
            return false;
        }
        if (this.f99412b == 2 || this.f99412b == 3 || this.f99412b == 4) {
            return true;
        }
        if (this.f99413c != null && ((IAVService) ServiceManager.get().getService(IAVService.class)).photoService().isPhotoEditEnabled() && !C6399b.m19944t()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo95871a() {
        if (this.f99411a && (this.f99412b == 3 || this.f99412b == 4)) {
            return true;
        }
        if (!this.f99411a || this.f99413c == null) {
            return false;
        }
        if (this.f99412b == 2) {
            return true;
        }
        int[] imageWidthHeight = ((IAVService) ServiceManager.get().getService(IAVService.class)).photoService().getImageWidthHeight(this.f99413c.getAbsolutePath());
        int i = imageWidthHeight[0];
        int i2 = imageWidthHeight[1];
        if (i * i2 != 0 && i > this.f99418h && i2 > this.f99418h) {
            float f = (float) i2;
            float f2 = (float) i;
            if ((this.f99419i * f) / f2 >= this.f99420j || (f * this.f99419i) / f2 < this.f99419i / this.f99420j) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m122200a(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        return str.startsWith("image/");
    }

    /* renamed from: b */
    private void m122202b(final Intent intent) {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).handleOpenSdk(intent, new C23545a() {
            /* renamed from: a */
            public final void mo61466a(ArrayList<String> arrayList) {
                if (arrayList.size() > 1) {
                    SysActionSendShareContext.this.f99417g.addAll(arrayList);
                    SysActionSendShareContext.this.f99411a = true;
                    SysActionSendShareContext.this.f99412b = 4;
                    return;
                }
                if (arrayList.size() == 1) {
                    String str = (String) arrayList.get(0);
                    SysActionSendShareContext.this.f99412b = 2;
                    SysActionSendShareContext.this.f99413c = new File(str);
                    SysActionSendShareContext.this.f99411a = true;
                }
            }

            /* renamed from: b */
            public final void mo61467b(ArrayList<String> arrayList) {
                if (arrayList.size() > 1) {
                    SysActionSendShareContext.this.f99417g.addAll(arrayList);
                    SysActionSendShareContext.this.f99411a = true;
                    SysActionSendShareContext.this.f99412b = 3;
                    return;
                }
                if (arrayList.size() == 1) {
                    String str = (String) arrayList.get(0);
                    if (C42973bg.m136427a(str)) {
                        SysActionSendShareContext.this.f99412b = 1;
                        SysActionSendShareContext.this.f99413c = new File(str);
                        SysActionSendShareContext.this.f99411a = true;
                    }
                }
            }
        });
    }

    /* renamed from: b */
    private static boolean m122203b(String str) {
        if (C6319n.m19593a(str)) {
            return false;
        }
        return str.startsWith("video/");
    }

    /* renamed from: c */
    private void m122204c(Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
        if (uri != null) {
            String a = C29966f.m98250a(AwemeApplication.m21341a(), uri);
            if (C42973bg.m136427a(a)) {
                if (m122203b(intent.getType())) {
                    this.f99412b = 2;
                } else if (m122200a(intent.getType())) {
                    this.f99412b = 1;
                } else {
                    return;
                }
                this.f99413c = new File(a);
                this.f99411a = true;
            }
        }
    }

    protected SysActionSendShareContext(Parcel parcel) {
        boolean z;
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f99411a = z;
        this.f99412b = parcel.readInt();
        this.f99413c = (File) parcel.readSerializable();
        this.f99417g = parcel.createStringArrayList();
        if (parcel.readByte() != 0) {
            z2 = true;
        }
        this.f99414d = z2;
    }

    /* renamed from: d */
    private void m122205d(Intent intent) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (parcelableArrayListExtra != null && parcelableArrayListExtra.size() != 0) {
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                this.f99417g.add(C29966f.m98250a(AwemeApplication.m21341a(), (Uri) it.next()));
            }
            this.f99411a = true;
            if (m122203b(intent.getType())) {
                this.f99412b = 4;
            } else if (m122200a(intent.getType())) {
                this.f99412b = 3;
            }
        }
    }

    /* renamed from: a */
    public final void mo95870a(Intent intent) {
        this.f99411a = false;
        this.f99413c = null;
        this.f99412b = 0;
        if (intent != null) {
            if (C6319n.m19594a(intent.getAction(), "android.intent.action.SEND")) {
                m122204c(intent);
            } else if (C6319n.m19594a(intent.getAction(), "android.intent.action.SEND_MULTIPLE")) {
                m122205d(intent);
            } else {
                if (((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isFromOpenSdk(intent)) {
                    this.f99414d = true;
                    m122202b(intent);
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f99411a ? (byte) 1 : 0);
        parcel.writeInt(this.f99412b);
        parcel.writeSerializable(this.f99413c);
        parcel.writeStringList(this.f99417g);
        parcel.writeByte(this.f99414d ? (byte) 1 : 0);
    }

    /* renamed from: a */
    public final boolean mo95872a(Context context, C34694a aVar) {
        boolean z = true;
        if (this.f99411a && this.f99412b == 3) {
            return true;
        }
        if (!this.f99411a) {
            aVar.mo88020a(20001);
            return false;
        } else if (this.f99412b == 1) {
            return true;
        } else {
            IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
            if (iAVService == null || iAVService.getVideoLegalCheckerAndToastService(context) == null) {
                return true;
            }
            if (this.f99412b == 4) {
                if (this.f99417g == null) {
                    aVar.mo88020a(20001);
                    return false;
                }
                for (String isVideoLengthOrTypeSupportedAndShowErrToast : this.f99417g) {
                    if (!iAVService.getVideoLegalCheckerAndToastService(context).isVideoLengthOrTypeSupportedAndShowErrToast(isVideoLengthOrTypeSupportedAndShowErrToast, true, 3600000, -1, new C38255a(aVar))) {
                        return false;
                    }
                }
            } else if (this.f99413c == null) {
                aVar.mo88020a(20001);
                return false;
            } else {
                z = iAVService.getVideoLegalCheckerAndToastService(context).isVideoLengthOrTypeSupportedAndShowErrToast(this.f99413c.getAbsolutePath(), true, 3600000, -1, new C38256b(aVar));
            }
            return z;
        }
    }
}
