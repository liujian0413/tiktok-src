package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.la */
final class C15834la {

    /* renamed from: a */
    final zzyv f44584a;

    /* renamed from: b */
    final String f44585b;

    /* renamed from: c */
    final int f44586c;

    /* renamed from: a */
    static C15834la m51251a(String str) throws IOException {
        String[] split = str.split("\u0000");
        if (split.length == 3) {
            Parcel obtain = Parcel.obtain();
            try {
                String str2 = new String(Base64.decode(split[0], 0), "UTF-8");
                int parseInt = Integer.parseInt(split[1]);
                byte[] decode = Base64.decode(split[2], 0);
                obtain.unmarshall(decode, 0, decode.length);
                obtain.setDataPosition(0);
                C15834la laVar = new C15834la((zzyv) zzyv.CREATOR.createFromParcel(obtain), str2, parseInt);
                obtain.recycle();
                return laVar;
            } catch (ParseException | IllegalArgumentException | IllegalStateException e) {
                C14793ay.m42898d().mo39089a(e, "QueueSeed.decode");
                throw new IOException("Malformed QueueSeed encoding.", e);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        } else {
            throw new IOException("Incorrect field count for QueueSeed.");
        }
    }

    C15834la(C15829kw kwVar) {
        this(kwVar.f44561a, kwVar.f44562b, kwVar.f44563c);
    }

    private C15834la(zzyv zzyv, String str, int i) {
        this.f44584a = zzyv;
        this.f44585b = str;
        this.f44586c = i;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo41717a() {
        Parcel obtain = Parcel.obtain();
        try {
            String encodeToString = Base64.encodeToString(this.f44585b.getBytes("UTF-8"), 0);
            String num = Integer.toString(this.f44586c);
            this.f44584a.writeToParcel(obtain, 0);
            String encodeToString2 = Base64.encodeToString(obtain.marshall(), 0);
            StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 2 + String.valueOf(num).length() + String.valueOf(encodeToString2).length());
            sb.append(encodeToString);
            sb.append("\u0000");
            sb.append(num);
            sb.append("\u0000");
            sb.append(encodeToString2);
            String sb2 = sb.toString();
            obtain.recycle();
            return sb2;
        } catch (UnsupportedEncodingException unused) {
            acd.m45779c("QueueSeed encode failed because UTF-8 is not available.");
            obtain.recycle();
            return "";
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
