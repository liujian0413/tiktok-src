package com.ttnet.org.chromium.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Locale;

public class FileUtils {
    public static byte[] readStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static String getExtension(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return "";
        }
        return str.substring(lastIndexOf + 1).toLowerCase(Locale.US);
    }

    public static void batchDeleteFiles(List<String> list) {
        for (String str : list) {
            if (ContentUriUtils.isContentUri(str)) {
                ContentUriUtils.delete(str);
            } else {
                File file = new File(str);
                if (file.exists()) {
                    recursivelyDeleteFile(file);
                }
            }
        }
    }

    public static Uri getUriForFile(File file) {
        Uri uri;
        try {
            uri = ContentUriUtils.getContentUriFromFile(file);
        } catch (IllegalArgumentException e) {
            StringBuilder sb = new StringBuilder("Could not create content uri: ");
            sb.append(e);
            Log.m146394e("FileUtils", sb.toString(), new Object[0]);
            uri = null;
        }
        if (uri == null) {
            return Uri.fromFile(file);
        }
        return uri;
    }

    public static boolean recursivelyDeleteFile(File file) {
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File recursivelyDeleteFile : listFiles) {
                    recursivelyDeleteFile(recursivelyDeleteFile);
                }
            }
        }
        boolean delete = file.delete();
        if (!delete) {
            Log.m146394e("FileUtils", "Failed to delete: %s", file);
        }
        return delete;
    }

    private static /* synthetic */ void $closeResource(Throwable th, ParcelFileDescriptor parcelFileDescriptor) {
        if (th != null) {
            try {
                parcelFileDescriptor.close();
            } catch (Throwable th2) {
                C6497a.m20181a(th, th2);
            }
        } else {
            parcelFileDescriptor.close();
        }
    }

    private static /* synthetic */ void $closeResource(Throwable th, FileOutputStream fileOutputStream) {
        if (th != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C6497a.m20181a(th, th2);
            }
        } else {
            fileOutputStream.close();
        }
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    private static /* synthetic */ void $closeResource(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                C6497a.m20181a(th, th2);
            }
        } else {
            inputStream.close();
        }
    }

    public static void copyStreamToFile(InputStream inputStream, File file) throws IOException {
        Throwable th;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".tmp");
        File file2 = new File(sb.toString());
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            Log.m146395i("FileUtils", "Writing to %s", file);
            copyStream(inputStream, fileOutputStream);
            $closeResource((Throwable) null, fileOutputStream);
            if (!file2.renameTo(file)) {
                throw new IOException();
            }
        } catch (Throwable th2) {
            $closeResource(th, fileOutputStream);
            throw th2;
        }
    }

    public static Bitmap queryBitmapFromContentProvider(Context context, Uri uri) {
        Throwable th;
        Throwable th2;
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (openFileDescriptor == null) {
                String str = "FileUtils";
                try {
                    StringBuilder sb = new StringBuilder("Null ParcelFileDescriptor from uri ");
                    sb.append(uri);
                    Log.m146404w(str, sb.toString(), new Object[0]);
                    if (openFileDescriptor != null) {
                        $closeResource((Throwable) null, openFileDescriptor);
                    }
                    return null;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    th = r2;
                    th2 = th4;
                }
            } else {
                FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
                if (fileDescriptor == null) {
                    StringBuilder sb2 = new StringBuilder("Null FileDescriptor from uri ");
                    sb2.append(uri);
                    Log.m146404w("FileUtils", sb2.toString(), new Object[0]);
                    if (openFileDescriptor != null) {
                        $closeResource((Throwable) null, openFileDescriptor);
                    }
                    return null;
                }
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor);
                if (decodeFileDescriptor == null) {
                    StringBuilder sb3 = new StringBuilder("Failed to decode image from uri ");
                    sb3.append(uri);
                    Log.m146404w("FileUtils", sb3.toString(), new Object[0]);
                    if (openFileDescriptor != null) {
                        $closeResource((Throwable) null, openFileDescriptor);
                    }
                    return null;
                }
                if (openFileDescriptor != null) {
                    $closeResource((Throwable) null, openFileDescriptor);
                }
                return decodeFileDescriptor;
            }
            if (openFileDescriptor != null) {
                $closeResource(th, openFileDescriptor);
            }
            throw th2;
        } catch (IOException unused) {
            StringBuilder sb4 = new StringBuilder("IO exception when reading uri ");
            sb4.append(uri);
            Log.m146404w("FileUtils", sb4.toString(), new Object[0]);
            return null;
        }
    }

    public static boolean extractAsset(Context context, String str, File file) {
        InputStream open;
        try {
            open = context.getAssets().open(str);
            copyStreamToFile(open, file);
            if (open != null) {
                $closeResource((Throwable) null, open);
            }
            return true;
        } catch (IOException unused) {
            return false;
        } catch (Throwable th) {
            if (open != null) {
                $closeResource(r1, open);
            }
            throw th;
        }
    }
}
