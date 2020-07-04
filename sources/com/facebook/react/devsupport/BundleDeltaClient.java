package com.facebook.react.devsupport;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import okio.BufferedSource;

public class BundleDeltaClient {
    String mDeltaId;
    final LinkedHashMap<Number, byte[]> mDeltaModules = new LinkedHashMap<>();
    final LinkedHashMap<Number, byte[]> mPostModules = new LinkedHashMap<>();
    final LinkedHashMap<Number, byte[]> mPreModules = new LinkedHashMap<>();

    public void reset() {
        this.mDeltaId = null;
        this.mDeltaModules.clear();
        this.mPreModules.clear();
        this.mPostModules.clear();
    }

    static boolean isDeltaUrl(String str) {
        if (str.indexOf(".delta?") != -1) {
            return true;
        }
        return false;
    }

    public String toDeltaUrl(String str) {
        if (!isDeltaUrl(str) || this.mDeltaId == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&deltaBundleId=");
        sb.append(this.mDeltaId);
        return sb.toString();
    }

    private static int patchDelta(JsonReader jsonReader, LinkedHashMap<Number, byte[]> linkedHashMap) throws IOException {
        jsonReader.beginArray();
        int i = 0;
        while (jsonReader.hasNext()) {
            jsonReader.beginArray();
            int nextInt = jsonReader.nextInt();
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                linkedHashMap.remove(Integer.valueOf(nextInt));
            } else {
                linkedHashMap.put(Integer.valueOf(nextInt), jsonReader.nextString().getBytes());
            }
            jsonReader.endArray();
            i++;
        }
        jsonReader.endArray();
        return i;
    }

    public synchronized boolean storeDeltaInFile(BufferedSource bufferedSource, File file) throws IOException {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(bufferedSource.inputStream()));
        jsonReader.beginObject();
        int i = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                this.mDeltaId = jsonReader.nextString();
            } else if (nextName.equals("pre")) {
                i += patchDelta(jsonReader, this.mPreModules);
            } else if (nextName.equals("post")) {
                i += patchDelta(jsonReader, this.mPostModules);
            } else if (nextName.equals("delta")) {
                i += patchDelta(jsonReader, this.mDeltaModules);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        if (i == 0) {
            return false;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            for (byte[] write : this.mPreModules.values()) {
                fileOutputStream.write(write);
                fileOutputStream.write(10);
            }
            for (byte[] write2 : this.mDeltaModules.values()) {
                fileOutputStream.write(write2);
                fileOutputStream.write(10);
            }
            for (byte[] write3 : this.mPostModules.values()) {
                fileOutputStream.write(write3);
                fileOutputStream.write(10);
            }
            return true;
        } finally {
            fileOutputStream.flush();
            fileOutputStream.close();
        }
    }
}
