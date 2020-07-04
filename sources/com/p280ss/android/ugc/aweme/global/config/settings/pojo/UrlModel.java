package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel */
public final class UrlModel extends Message<UrlModel, Builder> {
    public static final DefaultValueProtoAdapter<UrlModel> ADAPTER = new ProtoAdapter_UrlModel();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 4)
    public final Integer height;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String uri;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String url_key;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 2, tag = 2)
    public final List<String> url_list;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer width;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UrlModel, Builder> {
        public Integer height;
        public String uri;
        public String url_key;
        public List<String> url_list = Internal.newMutableList();
        public Integer width;

        public final UrlModel build() {
            UrlModel urlModel = new UrlModel(this.uri, this.url_list, this.width, this.height, this.url_key, super.buildUnknownFields());
            return urlModel;
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

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel$ProtoAdapter_UrlModel */
    static final class ProtoAdapter_UrlModel extends DefaultValueProtoAdapter<UrlModel> {
        public final UrlModel redact(UrlModel urlModel) {
            return urlModel;
        }

        public ProtoAdapter_UrlModel() {
            super(FieldEncoding.LENGTH_DELIMITED, UrlModel.class);
        }

        public final UrlModel decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UrlModel) null);
        }

        public final int encodedSize(UrlModel urlModel) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, urlModel.uri) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, urlModel.url_list) + ProtoAdapter.INT32.encodedSizeWithTag(3, urlModel.width) + ProtoAdapter.INT32.encodedSizeWithTag(4, urlModel.height) + ProtoAdapter.STRING.encodedSizeWithTag(5, urlModel.url_key) + urlModel.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UrlModel urlModel) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, urlModel.uri);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, urlModel.url_list);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, urlModel.width);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 4, urlModel.height);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, urlModel.url_key);
            protoWriter.writeBytes(urlModel.unknownFields());
        }

        public final UrlModel decode(ProtoReader protoReader, UrlModel urlModel) throws IOException {
            Builder builder;
            UrlModel urlModel2 = (UrlModel) C10938a.m32097a().mo26425a(UrlModel.class, urlModel);
            if (urlModel2 != null) {
                builder = urlModel2.newBuilder();
            } else {
                builder = new Builder();
            }
            List<String> newMutableList = Internal.newMutableList();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.uri((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            newMutableList.add(ProtoAdapter.STRING.decode(protoReader));
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
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (urlModel2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    if (!newMutableList.isEmpty()) {
                        builder.url_list = newMutableList;
                    }
                    return builder.build();
                }
            }
        }
    }

    public final List<String> getUrlList() {
        return this.url_list;
    }

    public final Integer getHeight() throws NullValueException {
        if (this.height != null) {
            return this.height;
        }
        throw new NullValueException();
    }

    public final String getUri() throws NullValueException {
        if (this.uri != null) {
            return this.uri;
        }
        throw new NullValueException();
    }

    public final String getUrlKey() throws NullValueException {
        if (this.url_key != null) {
            return this.url_key;
        }
        throw new NullValueException();
    }

    public final Integer getWidth() throws NullValueException {
        if (this.width != null) {
            return this.width;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.uri = this.uri;
        builder.url_list = Internal.copyOf("url_list", this.url_list);
        builder.width = this.width;
        builder.height = this.height;
        builder.url_key = this.url_key;
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
        int i6 = (hashCode2 + i2) * 37;
        if (this.height != null) {
            i3 = this.height.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 37;
        if (this.url_key != null) {
            i5 = this.url_key.hashCode();
        }
        int i8 = i7 + i5;
        this.hashCode = i8;
        return i8;
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
        StringBuilder replace = sb.replace(0, 2, "UrlModel{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UrlModel)) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        if (!unknownFields().equals(urlModel.unknownFields()) || !Internal.equals(this.uri, urlModel.uri) || !this.url_list.equals(urlModel.url_list) || !Internal.equals(this.width, urlModel.width) || !Internal.equals(this.height, urlModel.height) || !Internal.equals(this.url_key, urlModel.url_key)) {
            return false;
        }
        return true;
    }

    public UrlModel(String str, List<String> list, Integer num, Integer num2, String str2) {
        this(str, list, num, num2, str2, ByteString.EMPTY);
    }

    public UrlModel(String str, List<String> list, Integer num, Integer num2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.uri = str;
        this.url_list = Internal.immutableCopyOf("url_list", list);
        this.width = num;
        this.height = num2;
        this.url_key = str2;
    }
}
