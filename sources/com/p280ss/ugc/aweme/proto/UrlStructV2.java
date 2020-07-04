package com.p280ss.ugc.aweme.proto;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.ugc.aweme.proto.UrlStructV2 */
public final class UrlStructV2 extends Message<UrlStructV2, Builder> {
    public static final ProtoAdapter<UrlStructV2> ADAPTER = new ProtoAdapter_UrlStructV2();
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public Long data_size;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public String file_cs;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public String file_hash;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public Integer height;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public String uri;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public String url_key;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REPEATED, tag = 2)
    public List<String> url_list;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public Integer width;

    /* renamed from: com.ss.ugc.aweme.proto.UrlStructV2$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UrlStructV2, Builder> {
        public Long data_size;
        public String file_cs;
        public String file_hash;
        public Integer height;
        public String uri;
        public String url_key;
        public List<String> url_list = Internal.newMutableList();
        public Integer width;

        public final UrlStructV2 build() {
            UrlStructV2 urlStructV2 = new UrlStructV2(this.uri, this.url_list, this.width, this.height, this.url_key, this.data_size, this.file_hash, this.file_cs, super.buildUnknownFields());
            return urlStructV2;
        }

        public final Builder data_size(Long l) {
            this.data_size = l;
            return this;
        }

        public final Builder file_cs(String str) {
            this.file_cs = str;
            return this;
        }

        public final Builder file_hash(String str) {
            this.file_hash = str;
            return this;
        }

        public final Builder height(Integer num) {
            this.height = num;
            return this;
        }

        public final Builder uri(String str) {
            this.uri = str;
            return this;
        }

        public final Builder url_key(String str) {
            this.url_key = str;
            return this;
        }

        public final Builder width(Integer num) {
            this.width = num;
            return this;
        }

        public final Builder url_list(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.url_list = list;
            return this;
        }
    }

    /* renamed from: com.ss.ugc.aweme.proto.UrlStructV2$ProtoAdapter_UrlStructV2 */
    static final class ProtoAdapter_UrlStructV2 extends ProtoAdapter<UrlStructV2> {
        public ProtoAdapter_UrlStructV2() {
            super(FieldEncoding.LENGTH_DELIMITED, UrlStructV2.class);
        }

        public final int encodedSize(UrlStructV2 urlStructV2) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, urlStructV2.uri) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, urlStructV2.url_list) + ProtoAdapter.INT32.encodedSizeWithTag(3, urlStructV2.width) + ProtoAdapter.INT32.encodedSizeWithTag(4, urlStructV2.height) + ProtoAdapter.STRING.encodedSizeWithTag(5, urlStructV2.url_key) + ProtoAdapter.INT64.encodedSizeWithTag(6, urlStructV2.data_size) + ProtoAdapter.STRING.encodedSizeWithTag(7, urlStructV2.file_hash) + ProtoAdapter.STRING.encodedSizeWithTag(8, urlStructV2.file_cs) + urlStructV2.unknownFields().size();
        }

        public final UrlStructV2 decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.uri((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.url_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.width((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.height((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 5:
                            builder.url_key((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.data_size((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 7:
                            builder.file_hash((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.file_cs((String) ProtoAdapter.STRING.decode(protoReader));
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

        public final void encode(ProtoWriter protoWriter, UrlStructV2 urlStructV2) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, urlStructV2.uri);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, urlStructV2.url_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, urlStructV2.width);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, urlStructV2.height);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, urlStructV2.url_key);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 6, urlStructV2.data_size);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, urlStructV2.file_hash);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, urlStructV2.file_cs);
            protoWriter.writeBytes(urlStructV2.unknownFields());
        }
    }

    public UrlStructV2() {
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.uri = this.uri;
        builder.url_list = Internal.copyOf("url_list", this.url_list);
        builder.width = this.width;
        builder.height = this.height;
        builder.url_key = this.url_key;
        builder.data_size = this.data_size;
        builder.file_hash = this.file_hash;
        builder.file_cs = this.file_cs;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = this.hashCode;
        if (i7 != 0) {
            return i7;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i8 = 0;
        if (this.uri != null) {
            i = this.uri.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 37) + this.url_list.hashCode()) * 37;
        if (this.width != null) {
            i2 = this.width.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (hashCode2 + i2) * 37;
        if (this.height != null) {
            i3 = this.height.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 37;
        if (this.url_key != null) {
            i4 = this.url_key.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 37;
        if (this.data_size != null) {
            i5 = this.data_size.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 37;
        if (this.file_hash != null) {
            i6 = this.file_hash.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 37;
        if (this.file_cs != null) {
            i8 = this.file_cs.hashCode();
        }
        int i14 = i13 + i8;
        this.hashCode = i14;
        return i14;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.uri != null) {
            sb.append(", uri=");
            sb.append(this.uri);
        }
        if (!this.url_list.isEmpty()) {
            sb.append(", url_list=");
            sb.append(this.url_list);
        }
        if (this.width != null) {
            sb.append(", width=");
            sb.append(this.width);
        }
        if (this.height != null) {
            sb.append(", height=");
            sb.append(this.height);
        }
        if (this.url_key != null) {
            sb.append(", url_key=");
            sb.append(this.url_key);
        }
        if (this.data_size != null) {
            sb.append(", data_size=");
            sb.append(this.data_size);
        }
        if (this.file_hash != null) {
            sb.append(", file_hash=");
            sb.append(this.file_hash);
        }
        if (this.file_cs != null) {
            sb.append(", file_cs=");
            sb.append(this.file_cs);
        }
        StringBuilder replace = sb.replace(0, 2, "UrlStructV2{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UrlStructV2)) {
            return false;
        }
        UrlStructV2 urlStructV2 = (UrlStructV2) obj;
        if (!unknownFields().equals(urlStructV2.unknownFields()) || !Internal.equals(this.uri, urlStructV2.uri) || !this.url_list.equals(urlStructV2.url_list) || !Internal.equals(this.width, urlStructV2.width) || !Internal.equals(this.height, urlStructV2.height) || !Internal.equals(this.url_key, urlStructV2.url_key) || !Internal.equals(this.data_size, urlStructV2.data_size) || !Internal.equals(this.file_hash, urlStructV2.file_hash) || !Internal.equals(this.file_cs, urlStructV2.file_cs)) {
            return false;
        }
        return true;
    }

    public UrlStructV2(String str, List<String> list, Integer num, Integer num2, String str2, Long l, String str3, String str4) {
        this(str, list, num, num2, str2, l, str3, str4, ByteString.EMPTY);
    }

    public UrlStructV2(String str, List<String> list, Integer num, Integer num2, String str2, Long l, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uri = str;
        this.url_list = Internal.immutableCopyOf("url_list", list);
        this.width = num;
        this.height = num2;
        this.url_key = str2;
        this.data_size = l;
        this.file_hash = str3;
        this.file_cs = str4;
    }
}
