package com.optimize.statistics;

import com.facebook.imagepipeline.common.TooManyBitmapsException;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;
import java.io.IOException;

/* renamed from: com.optimize.statistics.e */
final class C18628e {
    /* renamed from: a */
    static int m61097a(CacheChoice cacheChoice) {
        if (cacheChoice.equals(CacheChoice.DEFAULT)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    static int m61099a(Throwable th) {
        if (th != null) {
            String message = th.getMessage();
            if (!(message == null || message.length() == 0)) {
                if (message.contains("canceled") || message.contains("Canceled")) {
                    return 2;
                }
                if (message.contains("network not available")) {
                    return 3;
                }
            }
        }
        return 1;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int m61098a(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r1 = 6
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -1914072202: goto L_0x004a;
                case -1307634203: goto L_0x0040;
                case -1224383234: goto L_0x0036;
                case 656304759: goto L_0x002c;
                case 957714404: goto L_0x0022;
                case 1023071510: goto L_0x0018;
                case 2109593398: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0054
        L_0x000e:
            java.lang.String r0 = "PartialDiskCacheProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 1
            goto L_0x0055
        L_0x0018:
            java.lang.String r0 = "PostprocessedBitmapMemoryCacheProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 6
            goto L_0x0055
        L_0x0022:
            java.lang.String r0 = "BitmapMemoryCacheProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 5
            goto L_0x0055
        L_0x002c:
            java.lang.String r0 = "DiskCacheProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 2
            goto L_0x0055
        L_0x0036:
            java.lang.String r0 = "NetworkFetchProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 0
            goto L_0x0055
        L_0x0040:
            java.lang.String r0 = "EncodedMemoryCacheProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 3
            goto L_0x0055
        L_0x004a:
            java.lang.String r0 = "BitmapMemoryCacheGetProducer"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0054
            r7 = 4
            goto L_0x0055
        L_0x0054:
            r7 = -1
        L_0x0055:
            switch(r7) {
                case 0: goto L_0x0062;
                case 1: goto L_0x0060;
                case 2: goto L_0x005e;
                case 3: goto L_0x005c;
                case 4: goto L_0x005a;
                case 5: goto L_0x005a;
                case 6: goto L_0x0063;
                default: goto L_0x0058;
            }
        L_0x0058:
            r1 = 7
            goto L_0x0063
        L_0x005a:
            r1 = 5
            goto L_0x0063
        L_0x005c:
            r1 = 4
            goto L_0x0063
        L_0x005e:
            r1 = 3
            goto L_0x0063
        L_0x0060:
            r1 = 2
            goto L_0x0063
        L_0x0062:
            r1 = 1
        L_0x0063:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.optimize.statistics.C18628e.m61098a(java.lang.String):int");
    }

    /* renamed from: a */
    static int m61100a(Throwable th, boolean z) {
        int i = 700;
        if (th == null) {
            return 700;
        }
        String message = th.getMessage();
        if (z) {
            i = 100;
        } else if (th instanceof IOException) {
            i = 201;
        } else if (th instanceof InterruptedException) {
            i = 501;
        } else if (th instanceof TooManyBitmapsException) {
            i = 601;
        } else if (th instanceof IllegalArgumentException) {
            if (message.contains("ByteBuffer must be direct")) {
                i = 301;
            } else if (message.contains("Failed to create demuxer")) {
                i = 302;
            } else if (message.contains("Width or height is negative")) {
                i = 303;
            } else if (message.contains("Problem decoding into existing bitmap")) {
                i = 304;
            }
        } else if (th instanceof IllegalStateException) {
            if (message.contains("Invalid dimensions")) {
                i = 305;
            } else if (message.contains("Failed to slurp image")) {
                i = 306;
            } else if (message.contains("No fames in image")) {
                i = 307;
            } else if (message.contains("Already disposed")) {
                i = 308;
            } else if (message.contains("unable to get frame")) {
                i = 309;
            } else if (message.contains("Bad bitmap")) {
                i = 310;
            } else if (message.contains("Width or height is too small")) {
                i = 311;
            } else if (message.contains("Wrong color format")) {
                i = 312;
            } else if (message.contains("WebPInitDecoderConfig failed")) {
                i = 313;
            } else if (message.contains("WebPGetFeatures failed")) {
                i = 314;
            } else if (message.contains("Failed to decode frame. VP8StatusCode:")) {
                i = 315;
            } else if (message.contains("WebpBitmapFactory is null")) {
                i = 316;
            }
        } else if (th instanceof RuntimeException) {
            if (message.contains("Could not create WebPDemux from image. This webp might be malformed")) {
                i = 317;
            } else if (message.contains("unrecognized pixel format")) {
                i = 318;
            } else if (message.contains("Wrong pixel format for jpeg encoding")) {
                i = 401;
            } else if (message.contains("Could not write scanline")) {
                i = 402;
            } else if (message.contains("could not allocate memory")) {
                i = 602;
            }
        }
        return i;
    }
}
