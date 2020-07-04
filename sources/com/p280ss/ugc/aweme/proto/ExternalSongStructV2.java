package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.ExternalSongStructV2 */
public final class ExternalSongStructV2 extends Message<ExternalSongStructV2, Builder> {
    public static final ProtoAdapter<ExternalSongStructV2> ADAPTER = new ProtoAdapter_ExternalSongStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public String external_song_key;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String h5_url;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public String partner_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public String partner_song_id;

    /* renamed from: com.ss.ugc.aweme.proto.ExternalSongStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<ExternalSongStructV2, Builder> {
        public String external_song_key;
        public String h5_url;
        public String partner_name;
        public String partner_song_id;

        public final ExternalSongStructV2 build() {
            ExternalSongStructV2 externalSongStructV2 = new ExternalSongStructV2(this.h5_url, this.partner_name, this.partner_song_id, this.external_song_key, super.buildUnknownFields());
            return externalSongStructV2;
        }

        public final Builder external_song_key(String str) {
            this.external_song_key = str;
            return this;
        }

        public final Builder h5_url(String str) {
            this.h5_url = str;
            return this;
        }

        public final Builder partner_name(String str) {
            this.partner_name = str;
            return this;
        }

        public final Builder partner_song_id(String str) {
            this.partner_song_id = str;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.ExternalSongStructV2$ProtoAdapter_ExternalSongStructV2 */
    static final class ProtoAdapter_ExternalSongStructV2 extends ProtoAdapter<ExternalSongStructV2> {
        public ProtoAdapter_ExternalSongStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, ExternalSongStructV2.class);
        }

        public final int encodedSize(ExternalSongStructV2 externalSongStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, externalSongStructV2.h5_url) + ProtoAdapter.STRING.encodedSizeWithTag(2, externalSongStructV2.partner_name) + ProtoAdapter.STRING.encodedSizeWithTag(3, externalSongStructV2.partner_song_id) + ProtoAdapter.STRING.encodedSizeWithTag(4, externalSongStructV2.external_song_key) + externalSongStructV2.unknownFields().size();
        }

        public final ExternalSongStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.h5_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.partner_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.partner_song_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.external_song_key((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ExternalSongStructV2 externalSongStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, externalSongStructV2.h5_url);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, externalSongStructV2.partner_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, externalSongStructV2.partner_song_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, externalSongStructV2.external_song_key);
            protoWriter.writeBytes(externalSongStructV2.unknownFields());
        }
    }

    public ExternalSongStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.h5_url = this.h5_url;
        builder.partner_name = this.partner_name;
        builder.partner_song_id = this.partner_song_id;
        builder.external_song_key = this.external_song_key;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i5 = 0;
        if (this.h5_url != null) {
            i = this.h5_url.hashCode();
        } else {
            i = 0;
        }
        int i6 = (hashCode + i) * 37;
        if (this.partner_name != null) {
            i2 = this.partner_name.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 37;
        if (this.partner_song_id != null) {
            i3 = this.partner_song_id.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 37;
        if (this.external_song_key != null) {
            i5 = this.external_song_key.hashCode();
        }
        int i9 = i8 + i5;
        this.hashCode = i9;
        return i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.h5_url != null) {
            sb.append(", h5_url=");
            sb.append(this.h5_url);
        }
        if (this.partner_name != null) {
            sb.append(", partner_name=");
            sb.append(this.partner_name);
        }
        if (this.partner_song_id != null) {
            sb.append(", partner_song_id=");
            sb.append(this.partner_song_id);
        }
        if (this.external_song_key != null) {
            sb.append(", external_song_key=");
            sb.append(this.external_song_key);
        }
        StringBuilder replace = sb.replace(0, 2, "ExternalSongStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ExternalSongStructV2)) {
            return false;
        }
        ExternalSongStructV2 externalSongStructV2 = (ExternalSongStructV2) obj;
        if (!unknownFields().equals(externalSongStructV2.unknownFields()) || !Internal.equals(this.h5_url, externalSongStructV2.h5_url) || !Internal.equals(this.partner_name, externalSongStructV2.partner_name) || !Internal.equals(this.partner_song_id, externalSongStructV2.partner_song_id) || !Internal.equals(this.external_song_key, externalSongStructV2.external_song_key)) {
            return false;
        }
        return true;
    }

    public ExternalSongStructV2(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public ExternalSongStructV2(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.h5_url = str;
        this.partner_name = str2;
        this.partner_song_id = str3;
        this.external_song_key = str4;
    }
}
