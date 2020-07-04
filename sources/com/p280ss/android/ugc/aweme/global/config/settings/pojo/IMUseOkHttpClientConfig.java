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
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.IMUseOkHttpClientConfig */
public final class IMUseOkHttpClientConfig extends Message<IMUseOkHttpClientConfig, Builder> {
    public static final DefaultValueProtoAdapter<IMUseOkHttpClientConfig> ADAPTER = new ProtoAdapter_IMUseOkHttpClientConfig();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean downloader_use_okhttpclient;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean gif_manager_use_okhttpclient;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 3)
    public final Boolean uploader_use_okhttpclient;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.IMUseOkHttpClientConfig$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<IMUseOkHttpClientConfig, Builder> {
        public Boolean downloader_use_okhttpclient;
        public Boolean gif_manager_use_okhttpclient;
        public Boolean uploader_use_okhttpclient;

        public final IMUseOkHttpClientConfig build() {
            return new IMUseOkHttpClientConfig(this.gif_manager_use_okhttpclient, this.downloader_use_okhttpclient, this.uploader_use_okhttpclient, super.buildUnknownFields());
        }

        public final Builder downloader_use_okhttpclient(Boolean bool) {
            this.downloader_use_okhttpclient = bool;
            return this;
        }

        public final Builder gif_manager_use_okhttpclient(Boolean bool) {
            this.gif_manager_use_okhttpclient = bool;
            return this;
        }

        public final Builder uploader_use_okhttpclient(Boolean bool) {
            this.uploader_use_okhttpclient = bool;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.IMUseOkHttpClientConfig$ProtoAdapter_IMUseOkHttpClientConfig */
    static final class ProtoAdapter_IMUseOkHttpClientConfig extends DefaultValueProtoAdapter<IMUseOkHttpClientConfig> {
        public final IMUseOkHttpClientConfig redact(IMUseOkHttpClientConfig iMUseOkHttpClientConfig) {
            return iMUseOkHttpClientConfig;
        }

        public ProtoAdapter_IMUseOkHttpClientConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, IMUseOkHttpClientConfig.class);
        }

        public final IMUseOkHttpClientConfig decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (IMUseOkHttpClientConfig) null);
        }

        public final int encodedSize(IMUseOkHttpClientConfig iMUseOkHttpClientConfig) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, iMUseOkHttpClientConfig.gif_manager_use_okhttpclient) + ProtoAdapter.BOOL.encodedSizeWithTag(2, iMUseOkHttpClientConfig.downloader_use_okhttpclient) + ProtoAdapter.BOOL.encodedSizeWithTag(3, iMUseOkHttpClientConfig.uploader_use_okhttpclient) + iMUseOkHttpClientConfig.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, IMUseOkHttpClientConfig iMUseOkHttpClientConfig) throws IOException {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, iMUseOkHttpClientConfig.gif_manager_use_okhttpclient);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, iMUseOkHttpClientConfig.downloader_use_okhttpclient);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 3, iMUseOkHttpClientConfig.uploader_use_okhttpclient);
            protoWriter.writeBytes(iMUseOkHttpClientConfig.unknownFields());
        }

        public final IMUseOkHttpClientConfig decode(ProtoReader protoReader, IMUseOkHttpClientConfig iMUseOkHttpClientConfig) throws IOException {
            Builder builder;
            IMUseOkHttpClientConfig iMUseOkHttpClientConfig2 = (IMUseOkHttpClientConfig) C10938a.m32097a().mo26425a(IMUseOkHttpClientConfig.class, iMUseOkHttpClientConfig);
            if (iMUseOkHttpClientConfig2 != null) {
                builder = iMUseOkHttpClientConfig2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.gif_manager_use_okhttpclient((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 2:
                            builder.downloader_use_okhttpclient((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 3:
                            builder.uploader_use_okhttpclient((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (iMUseOkHttpClientConfig2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final Boolean getDownloaderUseOkhttpclient() throws NullValueException {
        if (this.downloader_use_okhttpclient != null) {
            return this.downloader_use_okhttpclient;
        }
        throw new NullValueException();
    }

    public final Boolean getGifManagerUseOkhttpclient() throws NullValueException {
        if (this.gif_manager_use_okhttpclient != null) {
            return this.gif_manager_use_okhttpclient;
        }
        throw new NullValueException();
    }

    public final Boolean getUploaderUseOkhttpclient() throws NullValueException {
        if (this.uploader_use_okhttpclient != null) {
            return this.uploader_use_okhttpclient;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.gif_manager_use_okhttpclient = this.gif_manager_use_okhttpclient;
        builder.downloader_use_okhttpclient = this.downloader_use_okhttpclient;
        builder.uploader_use_okhttpclient = this.uploader_use_okhttpclient;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.gif_manager_use_okhttpclient != null) {
            i = this.gif_manager_use_okhttpclient.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.downloader_use_okhttpclient != null) {
            i2 = this.downloader_use_okhttpclient.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.uploader_use_okhttpclient != null) {
            i4 = this.uploader_use_okhttpclient.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.gif_manager_use_okhttpclient != null) {
            sb.append(", gif_manager_use_okhttpclient=");
            sb.append(this.gif_manager_use_okhttpclient);
        }
        if (this.downloader_use_okhttpclient != null) {
            sb.append(", downloader_use_okhttpclient=");
            sb.append(this.downloader_use_okhttpclient);
        }
        if (this.uploader_use_okhttpclient != null) {
            sb.append(", uploader_use_okhttpclient=");
            sb.append(this.uploader_use_okhttpclient);
        }
        StringBuilder replace = sb.replace(0, 2, "IMUseOkHttpClientConfig{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IMUseOkHttpClientConfig)) {
            return false;
        }
        IMUseOkHttpClientConfig iMUseOkHttpClientConfig = (IMUseOkHttpClientConfig) obj;
        if (!unknownFields().equals(iMUseOkHttpClientConfig.unknownFields()) || !Internal.equals(this.gif_manager_use_okhttpclient, iMUseOkHttpClientConfig.gif_manager_use_okhttpclient) || !Internal.equals(this.downloader_use_okhttpclient, iMUseOkHttpClientConfig.downloader_use_okhttpclient) || !Internal.equals(this.uploader_use_okhttpclient, iMUseOkHttpClientConfig.uploader_use_okhttpclient)) {
            return false;
        }
        return true;
    }

    public IMUseOkHttpClientConfig(Boolean bool, Boolean bool2, Boolean bool3) {
        this(bool, bool2, bool3, ByteString.EMPTY);
    }

    public IMUseOkHttpClientConfig(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.gif_manager_use_okhttpclient = bool;
        this.downloader_use_okhttpclient = bool2;
        this.uploader_use_okhttpclient = bool3;
    }
}
