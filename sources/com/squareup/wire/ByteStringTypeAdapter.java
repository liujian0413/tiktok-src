package com.squareup.wire;

import com.google.gson.C6715r;
import com.google.gson.stream.C6718a;
import com.google.gson.stream.C6720b;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import okio.ByteString;

class ByteStringTypeAdapter extends C6715r<ByteString> {
    ByteStringTypeAdapter() {
    }

    public ByteString read(C6718a aVar) throws IOException {
        if (aVar.mo16088f() != JsonToken.NULL) {
            return ByteString.decodeBase64(aVar.mo16090h());
        }
        aVar.mo16092j();
        return null;
    }

    public void write(C6720b bVar, ByteString byteString) throws IOException {
        if (byteString == null) {
            bVar.mo16115f();
        } else {
            bVar.mo16110b(byteString.base64());
        }
    }
}
