package com.p280ss.android.download.p861b;

import android.net.Uri;
import android.provider.BaseColumns;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;

/* renamed from: com.ss.android.download.b.c */
public final class C19405c {

    /* renamed from: com.ss.android.download.b.c$a */
    public static final class C19406a implements BaseColumns {

        /* renamed from: a */
        public static final Uri f52513a = Uri.parse("content://com.ss.android.newmedia.downloads/all_downloads");

        /* renamed from: a */
        public static boolean m63753a(int i) {
            return i >= 200 && i < 300;
        }

        /* renamed from: b */
        public static boolean m63754b(int i) {
            return i >= 400 && i < 600;
        }

        /* renamed from: c */
        public static boolean m63755c(int i) {
            return (i >= 200 && i < 300) || (i >= 400 && i < 600);
        }

        /* renamed from: d */
        public static String m63756d(int i) {
            if (i == 190) {
                return "PENDING";
            }
            if (i == 400) {
                return "BAD_REQUEST";
            }
            if (i == 406) {
                return "NOT_ACCEPTABLE";
            }
            switch (i) {
                case 192:
                    return "RUNNING";
                case 193:
                    return "PAUSED_BY_APP";
                case 194:
                    return "WAITING_TO_RETRY";
                case 195:
                    return "WAITING_FOR_NETWORK";
                case 196:
                    return "QUEUED_FOR_WIFI";
                default:
                    switch (i) {
                        case 198:
                            return "INSUFFICIENT_SPACE_ERROR";
                        case 199:
                            return "DEVICE_NOT_FOUND_ERROR";
                        case C34943c.f91127w /*?: ONE_ARG  (wrap: void
  ?: SGET   com.ss.android.ugc.aweme.player.a.c.w int)*/:
                            return "SUCCESS";
                        default:
                            switch (i) {
                                case 411:
                                    return "LENGTH_REQUIRED";
                                case 412:
                                    return "PRECONDITION_FAILED";
                                default:
                                    switch (i) {
                                        case 488:
                                            return "FILE_ALREADY_EXISTS_ERROR";
                                        case 489:
                                            return "CANNOT_RESUME";
                                        case 490:
                                            return "CANCELED";
                                        case 491:
                                            return "UNKNOWN_ERROR";
                                        case 492:
                                            return "FILE_ERROR";
                                        case 493:
                                            return "UNHANDLED_REDIRECT";
                                        case 494:
                                            return "UNHANDLED_HTTP_CODE";
                                        case 495:
                                            return "HTTP_DATA_ERROR";
                                        case 496:
                                            return "HTTP_EXCEPTION";
                                        case 497:
                                            return "TOO_MANY_REDIRECTS";
                                        case 498:
                                            return "BLOCKED";
                                        default:
                                            return Integer.toString(i);
                                    }
                            }
                    }
            }
        }
    }
}
