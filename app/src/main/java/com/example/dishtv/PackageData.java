package com.example.dishtv;

/**
 * Created by MD Minhajul Islam on 6/12/2021.
 */
public class PackageData {
    private Integer imageUrl;
    private String packageName;
    private String channelCount;
    private String channelPrice;

    public PackageData(Integer imageUrl, String packageName, String channelCount, String channelPrice) {
        this.imageUrl = imageUrl;
        this.packageName = packageName;
        this.channelCount = channelCount;
        this.channelPrice = channelPrice;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getChannelCount() {
        return channelCount;
    }

    public void setChannelCount(String channelCount) {
        this.channelCount = channelCount;
    }

    public String getChannelPrice() {
        return channelPrice;
    }

    public void setChannelPrice(String channelPrice) {
        this.channelPrice = channelPrice;
    }

    @Override
    public String toString() {
        return "PackageData{" +
                "imageUrl='" + imageUrl + '\'' +
                ", packageName='" + packageName + '\'' +
                ", channelCount='" + channelCount + '\'' +
                ", channelPrice='" + channelPrice + '\'' +
                '}';
    }
}
