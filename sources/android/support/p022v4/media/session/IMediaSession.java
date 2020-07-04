package android.support.p022v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.p022v4.media.MediaDescriptionCompat;
import android.support.p022v4.media.MediaMetadataCompat;
import android.support.p022v4.media.RatingCompat;
import android.support.p022v4.media.session.MediaSessionCompat.QueueItem;
import android.support.p022v4.media.session.MediaSessionCompat.ResultReceiverWrapper;
import android.text.TextUtils;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: android.support.v4.media.session.IMediaSession */
public interface IMediaSession extends IInterface {

    /* renamed from: android.support.v4.media.session.IMediaSession$Stub */
    public static abstract class Stub extends Binder implements IMediaSession {

        /* renamed from: android.support.v4.media.session.IMediaSession$Stub$a */
        static class C0822a implements IMediaSession {

            /* renamed from: a */
            private IBinder f2957a;

            public final IBinder asBinder() {
                return this.f2957a;
            }

            /* renamed from: a */
            public final void mo3130a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (resultReceiverWrapper != null) {
                        obtain.writeInt(1);
                        resultReceiverWrapper.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2957a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo3133a(KeyEvent keyEvent) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = true;
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2957a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3128a(IMediaControllerCallback iMediaControllerCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(iMediaControllerCallback != null ? iMediaControllerCallback.asBinder() : null);
                    this.f2957a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo3140b(IMediaControllerCallback iMediaControllerCallback) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(iMediaControllerCallback != null ? iMediaControllerCallback.asBinder() : null);
                    this.f2957a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo3132a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = false;
                    this.f2957a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3129a(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2957a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo3141b(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2957a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3126a(RatingCompat ratingCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2957a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3127a(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (ratingCompat != null) {
                        obtain.writeInt(1);
                        ratingCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2957a.transact(51, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3131a(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(z ? 1 : 0);
                    this.f2957a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo3142b(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(z ? 1 : 0);
                    this.f2957a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final String mo3134b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final String mo3143c() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final PendingIntent mo3146d() throws RemoteException {
                PendingIntent pendingIntent;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        pendingIntent = (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2);
                    } else {
                        pendingIntent = null;
                    }
                    return pendingIntent;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final long mo3148e() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: f */
            public final ParcelableVolumeInfo mo3150f() throws RemoteException {
                ParcelableVolumeInfo parcelableVolumeInfo;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        parcelableVolumeInfo = (ParcelableVolumeInfo) ParcelableVolumeInfo.CREATOR.createFromParcel(obtain2);
                    } else {
                        parcelableVolumeInfo = null;
                    }
                    return parcelableVolumeInfo;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: g */
            public final MediaMetadataCompat mo3151g() throws RemoteException {
                MediaMetadataCompat mediaMetadataCompat;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        mediaMetadataCompat = (MediaMetadataCompat) MediaMetadataCompat.CREATOR.createFromParcel(obtain2);
                    } else {
                        mediaMetadataCompat = null;
                    }
                    return mediaMetadataCompat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: h */
            public final PlaybackStateCompat mo3152h() throws RemoteException {
                PlaybackStateCompat playbackStateCompat;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        playbackStateCompat = (PlaybackStateCompat) PlaybackStateCompat.CREATOR.createFromParcel(obtain2);
                    } else {
                        playbackStateCompat = null;
                    }
                    return playbackStateCompat;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: i */
            public final List<QueueItem> mo3153i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(QueueItem.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: j */
            public final CharSequence mo3154j() throws RemoteException {
                CharSequence charSequence;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(obtain2);
                    } else {
                        charSequence = null;
                    }
                    return charSequence;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: k */
            public final Bundle mo3155k() throws RemoteException {
                Bundle bundle;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle = null;
                    }
                    return bundle;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: l */
            public final int mo3156l() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: m */
            public final boolean mo3157m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = false;
                    this.f2957a.transact(45, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: n */
            public final int mo3158n() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: o */
            public final boolean mo3159o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    boolean z = false;
                    this.f2957a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: p */
            public final int mo3160p() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(47, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: q */
            public final void mo3161q() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: r */
            public final void mo3162r() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: s */
            public final void mo3163s() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: t */
            public final void mo3164t() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: u */
            public final void mo3165u() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: v */
            public final void mo3166v() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: w */
            public final void mo3167w() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: x */
            public final void mo3168x() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    this.f2957a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C0822a(IBinder iBinder) {
                this.f2957a = iBinder;
            }

            /* renamed from: a */
            public final void mo3120a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    this.f2957a.transact(44, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo3135b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    this.f2957a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo3144c(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    this.f2957a.transact(48, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3122a(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeLong(j);
                    this.f2957a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo3137b(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeLong(j);
                    this.f2957a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3124a(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2957a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo3139b(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2957a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: d */
            public final void mo3147d(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2957a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: e */
            public final void mo3149e(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2957a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: c */
            public final void mo3145c(String str, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2957a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3123a(Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2957a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo3138b(Uri uri, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f2957a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3125a(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (mediaDescriptionCompat != null) {
                        obtain.writeInt(1);
                        mediaDescriptionCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f2957a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo3121a(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f2957a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo3136b(int i, int i2, String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeString(str);
                    this.f2957a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        /* renamed from: a */
        public static IMediaSession m3437a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IMediaSession)) {
                return new C0822a(iBinder);
            }
            return (IMediaSession) queryLocalInterface;
        }

        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v1, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v3, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v4, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper] */
        /* JADX WARNING: type inference failed for: r1v6, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper] */
        /* JADX WARNING: type inference failed for: r1v7, types: [android.view.KeyEvent] */
        /* JADX WARNING: type inference failed for: r1v9, types: [android.view.KeyEvent] */
        /* JADX WARNING: type inference failed for: r1v10, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v12, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v13, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v15, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v16, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v18, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v19, types: [android.support.v4.media.RatingCompat] */
        /* JADX WARNING: type inference failed for: r1v21, types: [android.support.v4.media.RatingCompat] */
        /* JADX WARNING: type inference failed for: r1v22, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v24, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v25, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v27, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v28, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v30, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v31, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v33, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r1v34, types: [android.support.v4.media.MediaDescriptionCompat] */
        /* JADX WARNING: type inference failed for: r1v36, types: [android.support.v4.media.MediaDescriptionCompat] */
        /* JADX WARNING: type inference failed for: r1v37, types: [android.support.v4.media.MediaDescriptionCompat] */
        /* JADX WARNING: type inference failed for: r1v39, types: [android.support.v4.media.MediaDescriptionCompat] */
        /* JADX WARNING: type inference failed for: r1v40, types: [android.support.v4.media.MediaDescriptionCompat] */
        /* JADX WARNING: type inference failed for: r1v42, types: [android.support.v4.media.MediaDescriptionCompat] */
        /* JADX WARNING: type inference failed for: r1v43 */
        /* JADX WARNING: type inference failed for: r1v44 */
        /* JADX WARNING: type inference failed for: r1v45 */
        /* JADX WARNING: type inference failed for: r1v46 */
        /* JADX WARNING: type inference failed for: r1v47 */
        /* JADX WARNING: type inference failed for: r1v48 */
        /* JADX WARNING: type inference failed for: r1v49 */
        /* JADX WARNING: type inference failed for: r1v50 */
        /* JADX WARNING: type inference failed for: r1v51 */
        /* JADX WARNING: type inference failed for: r1v52 */
        /* JADX WARNING: type inference failed for: r1v53 */
        /* JADX WARNING: type inference failed for: r1v54 */
        /* JADX WARNING: type inference failed for: r1v55 */
        /* JADX WARNING: type inference failed for: r1v56 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, android.os.Bundle, android.view.KeyEvent, android.support.v4.media.RatingCompat, android.support.v4.media.MediaDescriptionCompat]
          uses: [android.os.Bundle, android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, android.view.KeyEvent, android.support.v4.media.RatingCompat, android.support.v4.media.MediaDescriptionCompat]
          mth insns count: 440
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 15 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                r0 = 51
                r1 = 0
                r2 = 1
                if (r4 == r0) goto L_0x042d
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r0) goto L_0x0427
                r0 = 0
                switch(r4) {
                    case 1: goto L_0x03f8;
                    case 2: goto L_0x03d9;
                    case 3: goto L_0x03c5;
                    case 4: goto L_0x03b1;
                    case 5: goto L_0x03a1;
                    case 6: goto L_0x0391;
                    case 7: goto L_0x0381;
                    case 8: goto L_0x0368;
                    case 9: goto L_0x0358;
                    case 10: goto L_0x033f;
                    case 11: goto L_0x0327;
                    case 12: goto L_0x030f;
                    case 13: goto L_0x0303;
                    case 14: goto L_0x02e4;
                    case 15: goto L_0x02c5;
                    case 16: goto L_0x029a;
                    case 17: goto L_0x028a;
                    case 18: goto L_0x027e;
                    case 19: goto L_0x0272;
                    case 20: goto L_0x0266;
                    case 21: goto L_0x025a;
                    case 22: goto L_0x024e;
                    case 23: goto L_0x0242;
                    case 24: goto L_0x0232;
                    case 25: goto L_0x0217;
                    case 26: goto L_0x01f8;
                    case 27: goto L_0x01df;
                    case 28: goto L_0x01c6;
                    case 29: goto L_0x01b6;
                    case 30: goto L_0x019d;
                    case 31: goto L_0x0184;
                    case 32: goto L_0x0174;
                    case 33: goto L_0x0168;
                    case 34: goto L_0x0149;
                    case 35: goto L_0x012a;
                    case 36: goto L_0x00ff;
                    case 37: goto L_0x00ef;
                    case 38: goto L_0x00df;
                    case 39: goto L_0x00cf;
                    case 40: goto L_0x00bc;
                    case 41: goto L_0x00a1;
                    case 42: goto L_0x0082;
                    case 43: goto L_0x0067;
                    case 44: goto L_0x0057;
                    case 45: goto L_0x0047;
                    case 46: goto L_0x0034;
                    case 47: goto L_0x0024;
                    case 48: goto L_0x0014;
                    default: goto L_0x000f;
                }
            L_0x000f:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x0014:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                r3.mo3144c(r4)
                r6.writeNoException()
                return r2
            L_0x0024:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r3.mo3160p()
                r6.writeNoException()
                r6.writeInt(r4)
                return r2
            L_0x0034:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0040
                r0 = 1
            L_0x0040:
                r3.mo3131a(r0)
                r6.writeNoException()
                return r2
            L_0x0047:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                boolean r4 = r3.mo3157m()
                r6.writeNoException()
                r6.writeInt(r4)
                return r2
            L_0x0057:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                r3.mo3120a(r4)
                r6.writeNoException()
                return r2
            L_0x0067:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x007b
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r4 = android.support.p022v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r1 = r4
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.p022v4.media.MediaDescriptionCompat) r1
            L_0x007b:
                r3.mo3139b(r1)
                r6.writeNoException()
                return r2
            L_0x0082:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0096
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r4 = android.support.p022v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r1 = r4
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.p022v4.media.MediaDescriptionCompat) r1
            L_0x0096:
                int r4 = r5.readInt()
                r3.mo3125a(r1, r4)
                r6.writeNoException()
                return r2
            L_0x00a1:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00b5
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r4 = android.support.p022v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r1 = r4
                android.support.v4.media.MediaDescriptionCompat r1 = (android.support.p022v4.media.MediaDescriptionCompat) r1
            L_0x00b5:
                r3.mo3124a(r1)
                r6.writeNoException()
                return r2
            L_0x00bc:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x00c8
                r0 = 1
            L_0x00c8:
                r3.mo3142b(r0)
                r6.writeNoException()
                return r2
            L_0x00cf:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                r3.mo3135b(r4)
                r6.writeNoException()
                return r2
            L_0x00df:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                boolean r4 = r3.mo3159o()
                r6.writeNoException()
                r6.writeInt(r4)
                return r2
            L_0x00ef:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r3.mo3158n()
                r6.writeNoException()
                r6.writeInt(r4)
                return r2
            L_0x00ff:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0113
                android.os.Parcelable$Creator r4 = android.net.Uri.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.net.Uri r4 = (android.net.Uri) r4
                goto L_0x0114
            L_0x0113:
                r4 = r1
            L_0x0114:
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x0123
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0123:
                r3.mo3123a(r4, r1)
                r6.writeNoException()
                return r2
            L_0x012a:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x0142
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0142:
                r3.mo3141b(r4, r1)
                r6.writeNoException()
                return r2
            L_0x0149:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x0161
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0161:
                r3.mo3129a(r4, r1)
                r6.writeNoException()
                return r2
            L_0x0168:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                r3.mo3161q()
                r6.writeNoException()
                return r2
            L_0x0174:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r3.mo3156l()
                r6.writeNoException()
                r6.writeInt(r4)
                return r2
            L_0x0184:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                android.os.Bundle r4 = r3.mo3155k()
                r6.writeNoException()
                if (r4 == 0) goto L_0x0199
                r6.writeInt(r2)
                r4.writeToParcel(r6, r2)
                goto L_0x019c
            L_0x0199:
                r6.writeInt(r0)
            L_0x019c:
                return r2
            L_0x019d:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.CharSequence r4 = r3.mo3154j()
                r6.writeNoException()
                if (r4 == 0) goto L_0x01b2
                r6.writeInt(r2)
                android.text.TextUtils.writeToParcel(r4, r6, r2)
                goto L_0x01b5
            L_0x01b2:
                r6.writeInt(r0)
            L_0x01b5:
                return r2
            L_0x01b6:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.util.List r4 = r3.mo3153i()
                r6.writeNoException()
                r6.writeTypedList(r4)
                return r2
            L_0x01c6:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                android.support.v4.media.session.PlaybackStateCompat r4 = r3.mo3152h()
                r6.writeNoException()
                if (r4 == 0) goto L_0x01db
                r6.writeInt(r2)
                r4.writeToParcel(r6, r2)
                goto L_0x01de
            L_0x01db:
                r6.writeInt(r0)
            L_0x01de:
                return r2
            L_0x01df:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                android.support.v4.media.MediaMetadataCompat r4 = r3.mo3151g()
                r6.writeNoException()
                if (r4 == 0) goto L_0x01f4
                r6.writeInt(r2)
                r4.writeToParcel(r6, r2)
                goto L_0x01f7
            L_0x01f4:
                r6.writeInt(r0)
            L_0x01f7:
                return r2
            L_0x01f8:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x0210
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0210:
                r3.mo3149e(r4, r1)
                r6.writeNoException()
                return r2
            L_0x0217:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x022b
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r4 = android.support.p022v4.media.RatingCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r1 = r4
                android.support.v4.media.RatingCompat r1 = (android.support.p022v4.media.RatingCompat) r1
            L_0x022b:
                r3.mo3126a(r1)
                r6.writeNoException()
                return r2
            L_0x0232:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                long r4 = r5.readLong()
                r3.mo3137b(r4)
                r6.writeNoException()
                return r2
            L_0x0242:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                r3.mo3168x()
                r6.writeNoException()
                return r2
            L_0x024e:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                r3.mo3167w()
                r6.writeNoException()
                return r2
            L_0x025a:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                r3.mo3166v()
                r6.writeNoException()
                return r2
            L_0x0266:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                r3.mo3165u()
                r6.writeNoException()
                return r2
            L_0x0272:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                r3.mo3164t()
                r6.writeNoException()
                return r2
            L_0x027e:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                r3.mo3163s()
                r6.writeNoException()
                return r2
            L_0x028a:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                long r4 = r5.readLong()
                r3.mo3122a(r4)
                r6.writeNoException()
                return r2
            L_0x029a:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x02ae
                android.os.Parcelable$Creator r4 = android.net.Uri.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.net.Uri r4 = (android.net.Uri) r4
                goto L_0x02af
            L_0x02ae:
                r4 = r1
            L_0x02af:
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x02be
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x02be:
                r3.mo3138b(r4, r1)
                r6.writeNoException()
                return r2
            L_0x02c5:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x02dd
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x02dd:
                r3.mo3147d(r4, r1)
                r6.writeNoException()
                return r2
            L_0x02e4:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x02fc
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x02fc:
                r3.mo3145c(r4, r1)
                r6.writeNoException()
                return r2
            L_0x0303:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                r3.mo3162r()
                r6.writeNoException()
                return r2
            L_0x030f:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                int r7 = r5.readInt()
                java.lang.String r5 = r5.readString()
                r3.mo3136b(r4, r7, r5)
                r6.writeNoException()
                return r2
            L_0x0327:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                int r7 = r5.readInt()
                java.lang.String r5 = r5.readString()
                r3.mo3121a(r4, r7, r5)
                r6.writeNoException()
                return r2
            L_0x033f:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                android.support.v4.media.session.ParcelableVolumeInfo r4 = r3.mo3150f()
                r6.writeNoException()
                if (r4 == 0) goto L_0x0354
                r6.writeInt(r2)
                r4.writeToParcel(r6, r2)
                goto L_0x0357
            L_0x0354:
                r6.writeInt(r0)
            L_0x0357:
                return r2
            L_0x0358:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                long r4 = r3.mo3148e()
                r6.writeNoException()
                r6.writeLong(r4)
                return r2
            L_0x0368:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                android.app.PendingIntent r4 = r3.mo3146d()
                r6.writeNoException()
                if (r4 == 0) goto L_0x037d
                r6.writeInt(r2)
                r4.writeToParcel(r6, r2)
                goto L_0x0380
            L_0x037d:
                r6.writeInt(r0)
            L_0x0380:
                return r2
            L_0x0381:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.String r4 = r3.mo3143c()
                r6.writeNoException()
                r6.writeString(r4)
                return r2
            L_0x0391:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.String r4 = r3.mo3134b()
                r6.writeNoException()
                r6.writeString(r4)
                return r2
            L_0x03a1:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                boolean r4 = r3.mo3132a()
                r6.writeNoException()
                r6.writeInt(r4)
                return r2
            L_0x03b1:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.v4.media.session.IMediaControllerCallback r4 = android.support.p022v4.media.session.IMediaControllerCallback.Stub.m3374a(r4)
                r3.mo3140b(r4)
                r6.writeNoException()
                return r2
            L_0x03c5:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.v4.media.session.IMediaControllerCallback r4 = android.support.p022v4.media.session.IMediaControllerCallback.Stub.m3374a(r4)
                r3.mo3128a(r4)
                r6.writeNoException()
                return r2
            L_0x03d9:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x03ed
                android.os.Parcelable$Creator r4 = android.view.KeyEvent.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r1 = r4
                android.view.KeyEvent r1 = (android.view.KeyEvent) r1
            L_0x03ed:
                boolean r4 = r3.mo3133a(r1)
                r6.writeNoException()
                r6.writeInt(r4)
                return r2
            L_0x03f8:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                java.lang.String r4 = r5.readString()
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x0410
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r7 = r7.createFromParcel(r5)
                android.os.Bundle r7 = (android.os.Bundle) r7
                goto L_0x0411
            L_0x0410:
                r7 = r1
            L_0x0411:
                int r0 = r5.readInt()
                if (r0 == 0) goto L_0x0420
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper> r0 = android.support.p022v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR
                java.lang.Object r5 = r0.createFromParcel(r5)
                r1 = r5
                android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r1 = (android.support.p022v4.media.session.MediaSessionCompat.ResultReceiverWrapper) r1
            L_0x0420:
                r3.mo3130a(r4, r7, r1)
                r6.writeNoException()
                return r2
            L_0x0427:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r6.writeString(r4)
                return r2
            L_0x042d:
                java.lang.String r4 = "android.support.v4.media.session.IMediaSession"
                r5.enforceInterface(r4)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0441
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r4 = android.support.p022v4.media.RatingCompat.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.support.v4.media.RatingCompat r4 = (android.support.p022v4.media.RatingCompat) r4
                goto L_0x0442
            L_0x0441:
                r4 = r1
            L_0x0442:
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x0451
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                android.os.Bundle r1 = (android.os.Bundle) r1
            L_0x0451:
                r3.mo3127a(r4, r1)
                r6.writeNoException()
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.media.session.IMediaSession.Stub.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo3120a(int i) throws RemoteException;

    /* renamed from: a */
    void mo3121a(int i, int i2, String str) throws RemoteException;

    /* renamed from: a */
    void mo3122a(long j) throws RemoteException;

    /* renamed from: a */
    void mo3123a(Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo3124a(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* renamed from: a */
    void mo3125a(MediaDescriptionCompat mediaDescriptionCompat, int i) throws RemoteException;

    /* renamed from: a */
    void mo3126a(RatingCompat ratingCompat) throws RemoteException;

    /* renamed from: a */
    void mo3127a(RatingCompat ratingCompat, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo3128a(IMediaControllerCallback iMediaControllerCallback) throws RemoteException;

    /* renamed from: a */
    void mo3129a(String str, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    void mo3130a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) throws RemoteException;

    /* renamed from: a */
    void mo3131a(boolean z) throws RemoteException;

    /* renamed from: a */
    boolean mo3132a() throws RemoteException;

    /* renamed from: a */
    boolean mo3133a(KeyEvent keyEvent) throws RemoteException;

    /* renamed from: b */
    String mo3134b() throws RemoteException;

    /* renamed from: b */
    void mo3135b(int i) throws RemoteException;

    /* renamed from: b */
    void mo3136b(int i, int i2, String str) throws RemoteException;

    /* renamed from: b */
    void mo3137b(long j) throws RemoteException;

    /* renamed from: b */
    void mo3138b(Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: b */
    void mo3139b(MediaDescriptionCompat mediaDescriptionCompat) throws RemoteException;

    /* renamed from: b */
    void mo3140b(IMediaControllerCallback iMediaControllerCallback) throws RemoteException;

    /* renamed from: b */
    void mo3141b(String str, Bundle bundle) throws RemoteException;

    /* renamed from: b */
    void mo3142b(boolean z) throws RemoteException;

    /* renamed from: c */
    String mo3143c() throws RemoteException;

    /* renamed from: c */
    void mo3144c(int i) throws RemoteException;

    /* renamed from: c */
    void mo3145c(String str, Bundle bundle) throws RemoteException;

    /* renamed from: d */
    PendingIntent mo3146d() throws RemoteException;

    /* renamed from: d */
    void mo3147d(String str, Bundle bundle) throws RemoteException;

    /* renamed from: e */
    long mo3148e() throws RemoteException;

    /* renamed from: e */
    void mo3149e(String str, Bundle bundle) throws RemoteException;

    /* renamed from: f */
    ParcelableVolumeInfo mo3150f() throws RemoteException;

    /* renamed from: g */
    MediaMetadataCompat mo3151g() throws RemoteException;

    /* renamed from: h */
    PlaybackStateCompat mo3152h() throws RemoteException;

    /* renamed from: i */
    List<QueueItem> mo3153i() throws RemoteException;

    /* renamed from: j */
    CharSequence mo3154j() throws RemoteException;

    /* renamed from: k */
    Bundle mo3155k() throws RemoteException;

    /* renamed from: l */
    int mo3156l() throws RemoteException;

    /* renamed from: m */
    boolean mo3157m() throws RemoteException;

    /* renamed from: n */
    int mo3158n() throws RemoteException;

    /* renamed from: o */
    boolean mo3159o() throws RemoteException;

    /* renamed from: p */
    int mo3160p() throws RemoteException;

    /* renamed from: q */
    void mo3161q() throws RemoteException;

    /* renamed from: r */
    void mo3162r() throws RemoteException;

    /* renamed from: s */
    void mo3163s() throws RemoteException;

    /* renamed from: t */
    void mo3164t() throws RemoteException;

    /* renamed from: u */
    void mo3165u() throws RemoteException;

    /* renamed from: v */
    void mo3166v() throws RemoteException;

    /* renamed from: w */
    void mo3167w() throws RemoteException;

    /* renamed from: x */
    void mo3168x() throws RemoteException;
}
