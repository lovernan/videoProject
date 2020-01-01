package cn.whxlover.pojo;

public class Video {
    private Integer vid;

    private String videoname;

    private Integer uid;

    private Integer verified;

    private Integer score;

    private Integer topclass;

    private Integer subclass;

    private String url;

    private String avator;

    private String username;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname == null ? null : videoname.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getVerified() {
        return verified;
    }

    public void setVerified(Integer verified) {
        this.verified = verified;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getTopclass() {
        return topclass;
    }

    public void setTopclass(Integer topclass) {
        this.topclass = topclass;
    }

    public Integer getSubclass() {
        return subclass;
    }

    public void setSubclass(Integer subclass) {
        this.subclass = subclass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator == null ? null : avator.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}