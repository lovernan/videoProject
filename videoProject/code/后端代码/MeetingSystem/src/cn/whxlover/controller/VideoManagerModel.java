package cn.whxlover.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.whxlover.pojo.SubClass;
import cn.whxlover.pojo.TopClass;
import cn.whxlover.pojo.User;
import cn.whxlover.pojo.Video;
import cn.whxlover.service.VideoManagerSer;

@Controller
public class VideoManagerModel {

	@Autowired
	private VideoManagerSer vms;
	
	//1.��ʾ�����û���Ϣ
		@RequestMapping(value = "/index.action",produces = "application/json;charset=utf-8")
		public String  index() {
			List<User> userList = vms.showUserList();
			return "/admin/index";
		}
	
	
	//1.��ʾ�����û���Ϣ
	@RequestMapping(value = "/getAllUser.action",produces = "application/json;charset=utf-8")
	public @ResponseBody List<User> getAllUser() {
		List<User> userList = vms.showUserList();
		return userList;
	}
	//2.δ���ͨ������Ƶ
	// verified = 0 Ϊδͨ��(�޸��˷�������ΪList)
	@RequestMapping(value = "/notVerified.action",produces = "application/json;charset=utf-8")
	public @ResponseBody List<Video> notVerified() {
		List<Video> videoList = vms.showNotVerifiedVideoList();
		return videoList;
	}
	//3.ͨ������Ƶ
	// verified = 1 Ϊͨ��(�޸��˷�������ΪList)
	@RequestMapping(value = "/passVideo.action",produces = "application/json;charset=utf-8")
	public @ResponseBody List<Video> passVideo(String vid) {
		List<Video> videoList = vms.showVerifiedVideoList();
		return videoList;
	}
	//4.�¼���Ƶ
	//�����¼��Ƿ�ɹ�
	@RequestMapping(value = "/cancelVideo.action",produces = "application/json;charset=utf-8")
	public @ResponseBody String cancelVideo(String vid) {
		String isSuccess = vms.cancelVideo(Integer.valueOf(vid));
		return isSuccess;
	}
	
	//5.�������
	@RequestMapping(value = "/passReview.action",produces = "application/json;charset=utf-8")
	public @ResponseBody String passReview(String cid) {
		String isSuccess = vms.passReview(cid);
		return isSuccess;
	}
	
	//6.һ����������
	@RequestMapping(value = "/addTopClass.action",produces = "application/json;charset=utf-8")
	public @ResponseBody String addTopClass(String classname) {
		String isSuccess = vms.addTopClass(classname);
		return isSuccess;
	}
	
	//7.һ�������ɾ��
	@RequestMapping(value = "/deleteTopClass.action",produces = "application/json;charset=utf-8")
	public @ResponseBody String deleteTopClass(String cid) {
		//ɾ��sub_class�������ж�������Ϊcid�ļ�¼
		String isSuccess = vms.deleteTopClass(cid);
		return isSuccess;
	}
	
	//8.��ʾ����һ������
	@RequestMapping(value = "/getAllTopClass.action",produces = "application/json;charset=utf-8")
	public @ResponseBody List<TopClass> getAllClass() {
		//����һ�������List(�޸��˲���)
		List<TopClass> topClassList = vms.showTopClassList();
		return topClassList;
	}
	//9.������������
	@RequestMapping(value = "/addSubClass.action",produces = "application/json;charset=utf-8")
	public @ResponseBody String addSubClass(String classname) {
		String isSuccess = vms.addSubClass(classname);
		return isSuccess;
	}
	//10.��������ɾ��
	@RequestMapping(value = "/deleteSubClass.action",produces = "application/json;charset=utf-8")
	public @ResponseBody String deleteSubClass(String cid) {
		String isSuccess = vms.deleteSubClass(cid);
		return isSuccess;
	}
	//11.����������ʾ
	@RequestMapping(value = "/getAllSubClass.action",produces = "application/json;charset=utf-8")
	public @ResponseBody List<SubClass> getAllSubClass(String TopCid) {
		List<SubClass> subClassList = vms.showSubClassList();
		return subClassList;
	}

	
	
	
}
