package cn.whxlover.pojo;

import java.util.Date;

public class Meeting {
    private Integer mid;

    private String title;

    private String introduce;

    private String address;

    private Date time;

    @Override
	public String toString() {
		return "Meeting [mid=" + mid + ", title=" + title + ", introduce=" + introduce + ", address=" + address
				+ ", time=" + time + ", status=" + status + ", type=" + type + ", meetingimage=" + meetingimage
				+ ", createuimage=" + createuimage + ", createusername=" + createusername + ", f1=" + f1 + ", f2=" + f2
				+ ", f3=" + f3 + ", password=" + password + ", createuid=" + createuid + "]";
	}

	private Integer status;

    private Integer type;

    private String meetingimage;

    private String createuimage;

    private String createusername;

    private String f1;

    private String f2;

    private String f3;

    private String password;

    private Integer createuid;

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getMeetingimage() {
        return meetingimage;
    }

    public void setMeetingimage(String meetingimage) {
        this.meetingimage = meetingimage == null ? null : meetingimage.trim();
    }

    public String getCreateuimage() {
        return createuimage;
    }

    public void setCreateuimage(String createuimage) {
        this.createuimage = createuimage == null ? null : createuimage.trim();
    }

    public String getCreateusername() {
        return createusername;
    }

    public void setCreateusername(String createusername) {
        this.createusername = createusername == null ? null : createusername.trim();
    }

    public String getF1() {
        return f1;
    }

    public void setF1(String f1) {
        this.f1 = f1 == null ? null : f1.trim();
    }

    public String getF2() {
        return f2;
    }

    public void setF2(String f2) {
        this.f2 = f2 == null ? null : f2.trim();
    }

    public String getF3() {
        return f3;
    }

    public void setF3(String f3) {
        this.f3 = f3 == null ? null : f3.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getCreateuid() {
        return createuid;
    }

    public void setCreateuid(Integer createuid) {
        this.createuid = createuid;
    }
}