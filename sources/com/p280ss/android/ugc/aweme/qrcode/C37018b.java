package com.p280ss.android.ugc.aweme.qrcode;

import com.p280ss.android.medialib.model.Enigma;
import com.p280ss.android.medialib.model.EnigmaResult;
import com.p280ss.android.medialib.p884qr.EnigmaScanner;
import com.p280ss.android.medialib.p884qr.EnigmaScanner.C19787a;
import com.p280ss.android.medialib.p884qr.ScanSettings;
import com.p280ss.android.p281a.p282a.p283a.C6726a;

/* renamed from: com.ss.android.ugc.aweme.qrcode.b */
public final class C37018b {

    /* renamed from: a */
    public EnigmaScanner f96954a;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.b$a */
    public interface C37021a {
        /* renamed from: a */
        void mo93456a(int i, String str);
    }

    /* renamed from: a */
    public final void mo93453a() {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                if (C37018b.this.f96954a != null) {
                    C37018b.this.f96954a.stop();
                    C37018b.this.f96954a.release();
                    C37018b.this.f96954a.setListener(null);
                    C37018b.this.f96954a = null;
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo93454a(String str, final C37021a aVar) {
        if (this.f96954a == null) {
            this.f96954a = new EnigmaScanner();
            this.f96954a.setListener(new C19787a() {
                /* renamed from: a */
                public final void mo53090a(EnigmaResult enigmaResult) {
                    if (aVar != null) {
                        if (enigmaResult == null || enigmaResult.getResult() == null || enigmaResult.getResult().length <= 0) {
                            aVar.mo93456a(0, "");
                        } else {
                            Enigma[] result = enigmaResult.getResult();
                            String text = result[0].getText();
                            C37021a aVar = aVar;
                            int type = result[0].getType();
                            if (text == null) {
                                text = "";
                            }
                            aVar.mo93456a(type, text);
                        }
                    }
                    C37018b.this.mo93453a();
                }

                /* renamed from: a */
                public final void mo53089a(int i, int i2) {
                    aVar.mo93456a(0, "");
                    C37018b.this.mo93453a();
                }
            });
        }
        ScanSettings scanSettings = new ScanSettings();
        scanSettings.width = 1280;
        scanSettings.height = 720;
        scanSettings.detectModelDir = "";
        scanSettings.buildChainFlag = 1;
        try {
            this.f96954a.startScan(str, scanSettings, 1000);
        } catch (UnsatisfiedLinkError unused) {
        }
    }
}
