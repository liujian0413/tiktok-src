package com.p280ss.android.ugc.aweme.qrcode.p1497c;

import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.medialib.camera.C19663e;
import com.p280ss.android.medialib.model.EnigmaResult;
import com.p280ss.android.medialib.p884qr.ScanSettings;
import com.p280ss.android.ugc.asve.constant.AS_CAMERA_LENS_FACING;
import com.p280ss.android.ugc.asve.context.C15420a;
import com.p280ss.android.ugc.asve.context.C15421b;
import com.p280ss.android.ugc.asve.context.C15422c;
import com.p280ss.android.ugc.asve.context.C15432h;
import com.p280ss.android.ugc.asve.p755c.C15397b.C15399b;
import com.p280ss.android.ugc.asve.recorder.ASRecorder;
import com.p280ss.android.ugc.asve.sandbox.C21053p;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.qrcode.p1497c.C37058b.C37059a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.vesdk.VECameraSettings.CAMERA_FLASH_MODE;

/* renamed from: com.ss.android.ugc.aweme.qrcode.c.c */
public final class C37060c implements C37058b {

    /* renamed from: a */
    public ASRecorder f97016a;

    /* renamed from: b */
    public C37059a f97017b;

    /* renamed from: c */
    public final void mo93517c() {
        if (this.f97016a != null) {
            this.f97016a.mo55853g().mo38890a();
        }
    }

    /* renamed from: d */
    public final void mo93518d() {
        if (this.f97016a != null) {
            this.f97016a.mo55853g().mo38895b();
        }
    }

    /* renamed from: e */
    public final void mo93519e() {
        if (this.f97016a != null) {
            this.f97016a.mo55853g().mo38896c();
        }
    }

    /* renamed from: a */
    public final void mo93510a() {
        if (this.f97016a != null) {
            this.f97016a.mo55846b().mo55944b(CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH.ordinal());
        }
    }

    /* renamed from: b */
    public final void mo93516b() {
        if (this.f97016a != null) {
            this.f97016a.mo55846b().mo55944b(CAMERA_FLASH_MODE.CAMERA_FLASH_OFF.ordinal());
        }
    }

    /* renamed from: a */
    public final void mo93511a(float f) {
        if (this.f97016a != null) {
            this.f97016a.mo55846b().mo55954c(f);
        }
    }

    /* renamed from: a */
    public final void mo93513a(C37059a aVar) {
        this.f97017b = aVar;
        if (this.f97016a != null) {
            this.f97016a.mo55853g().mo38892a(new C15399b() {
                /* renamed from: a */
                public final void mo38897a(int i) {
                    if (C37060c.this.f97017b != null) {
                        C37060c.this.f97017b.mo93520a(i);
                    }
                }

                /* renamed from: a */
                public final void mo38898a(EnigmaResult enigmaResult) {
                    if (C37060c.this.f97017b != null) {
                        C37060c.this.f97017b.mo93521a(enigmaResult);
                    }
                }
            });
        }
    }

    public C37060c(Context context, SurfaceHolder surfaceHolder) {
        m119170a(context, surfaceHolder);
    }

    /* renamed from: a */
    private void m119170a(Context context, final SurfaceHolder surfaceHolder) {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).initASVE();
        FragmentActivity fragmentActivity = (FragmentActivity) context;
        fragmentActivity.getClass();
        this.f97016a = ASRecorder.m68441a(C37066d.m119193a(fragmentActivity), (C15432h) new C15421b() {
            /* renamed from: b */
            public final boolean mo38919b() {
                return true;
            }

            /* renamed from: c */
            public final SurfaceHolder mo38920c() {
                return surfaceHolder;
            }

            /* renamed from: n */
            public final boolean mo38931n() {
                return false;
            }

            /* renamed from: o */
            public final C21053p mo38932o() {
                return null;
            }

            /* renamed from: a */
            public final Boolean mo38918a() {
                return Boolean.valueOf(true);
            }

            /* renamed from: m */
            public final C15422c mo38930m() {
                return new C15420a() {
                    /* renamed from: a */
                    public final AS_CAMERA_LENS_FACING mo38910a() {
                        return AS_CAMERA_LENS_FACING.AS_CAMERA_LENS_BACK;
                    }

                    /* renamed from: f */
                    public final boolean mo38915f() {
                        return false;
                    }
                };
            }
        });
        this.f97016a.mo55846b().mo55933a((C19662d) new C19662d() {
            /* renamed from: a */
            public final void mo52271a(int i) {
            }

            /* renamed from: a */
            public final void mo52272a(int i, int i2, String str) {
                if (C37060c.this.f97017b != null) {
                    C37060c.this.f97017b.mo93520a(-1000);
                }
            }
        });
        surfaceHolder.addCallback(new Callback() {
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            }

            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                if (C37060c.this.f97016a != null) {
                    C37060c.this.f97016a.mo55846b().mo55945b(AS_CAMERA_LENS_FACING.AS_CAMERA_LENS_BACK.ordinal(), null);
                }
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                if (C37060c.this.f97016a != null) {
                    C37060c.this.f97016a.mo55846b().mo55965l();
                }
            }
        });
        if (surfaceHolder.getSurface() != null && surfaceHolder.getSurface().isValid() && this.f97016a != null) {
            this.f97016a.mo55846b().mo55945b(AS_CAMERA_LENS_FACING.AS_CAMERA_LENS_BACK.ordinal(), null);
        }
    }

    /* renamed from: a */
    public final void mo93515a(boolean z, long j) {
        if (this.f97016a != null) {
            this.f97016a.mo55853g().mo38894a(true, j);
        }
    }

    /* renamed from: a */
    public final void mo93514a(String str, ScanSettings scanSettings, long j) {
        if (this.f97016a != null) {
            this.f97016a.mo55853g().mo38893a(str, scanSettings, 1000);
        }
    }

    /* renamed from: a */
    public final void mo93512a(Context context, C19663e eVar, SurfaceHolder surfaceHolder, ScanSettings scanSettings) {
        if (this.f97016a != null) {
            this.f97016a.mo55853g().mo38891a(scanSettings.detectRectLeft, scanSettings.detectRectTop, scanSettings.detectRectWidth, scanSettings.detectRectHeight);
        }
    }
}
