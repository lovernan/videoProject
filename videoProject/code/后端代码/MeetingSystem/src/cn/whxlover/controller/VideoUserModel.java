package cn.whxlover.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;

import cn.whxlover.pojo.Comment;
import cn.whxlover.pojo.Complaint;
import cn.whxlover.pojo.History;
import cn.whxlover.pojo.User;
import cn.whxlover.pojo.Video;
import cn.whxlover.service.VideoUserSer;
import cn.whxlover.service.VideoUserSerImp;

@Controller
public class VideoUserModel {

	@Autowired
	private VideoUserSer vus;

	private static final String APPID = "wx35e2d7672cefdff8";

	private static final String SECRET = "f3c5f6ae35a84b3de0020e3710711ad5";

	// 1.注册
	@RequestMapping(value = "/login.action", produces = "application/json;charset=utf-8")
	public @ResponseBody String login(String code) {
		// 微信接口
		String url = "https://api.weixin.qq.com/sns/jscode2session?appid="
				+ APPID + "&secret=" + SECRET + "&js_code=" + code
				+ "&grant_type=authorization_code";
		RestTemplate restTemplate = new RestTemplate();
		// 进行网络请求,访问url接口
		ResponseEntity<String> responseEntity = restTemplate.exchange(url,
				HttpMethod.GET, null, String.class);
		// 根据返回值进行后续操作
		String sessionData = null;
		if (responseEntity != null
				&& responseEntity.getStatusCode() == HttpStatus.OK) {
			sessionData = responseEntity.getBody();
			Gson gson = new Gson();
			System.out.println(sessionData);
		}
		return sessionData;
	}

	
	
	// 查询用户id
	@RequestMapping(value = "/AllVideo.action", produces = "application/json;charset=utf-8")
	public @ResponseBody List<Video> AllVideo() {
		List<Video> video = vus.searchAllvideo();

		return video;
	}

	
	
	// 查询视频信息
	@RequestMapping(value = "/searchById.action", produces = "application/json;charset=utf-8")
	public @ResponseBody Video searchById(String vid) {

		Video video = vus.searchVideo(vid);

		return video;
	}

	
	
	// 获取用户个人信息
	@RequestMapping(value = "/selectuserid.action", produces = "application/json;charset=utf-8")
	public @ResponseBody User selectuserid(String avator) {
		User user = vus.selectid(avator);
		// int i = user.getUid();
		return user;
	}

	
	
	// 添加用户
	@RequestMapping(value = "/UserAdd.action", produces = "application/json;charset=utf-8")
	public @ResponseBody String UserAdd(User user) {
		user.setScore(1000);
		User us;
		// 添加用户
		int i = vus.insertUser(user);
		if (i > 0) {
			// 获取用户id
			us = vus.searchUser(user.getAvator());
		} else {
			us = null;
		}
		return us.getUid().toString();
	}

	
	
	// 查询用户id
	@RequestMapping(value = "/selectUserId.action", produces = "application/json;charset=utf-8")
	public @ResponseBody String selectUserId(User user) {
		System.out.println("ssss" + user.getAvator() + user.getUsername());
		user.setScore(1000);

		User us;
		// 添加用户
		int i = vus.insertUser(user);
		if (i > 0) {
			// 获取用户id
			us = vus.searchUser(user.getAvator());
		} else {
			us = null;
		}
		System.out.println(us.getUid());
		return us.getUid().toString();
	}

	
	
	// 2.推荐视频
	/**
	 * 
	 * @param recommend
	 * @return
	 */
	@RequestMapping(value = "/recommend.action", produces = "application/json;charset=utf-8")
	public @ResponseBody List<Video> recommend(String uid) {
		return null;
	}

	
	
	// 获取所有评论
	@RequestMapping(value = "/getAllComment.action", produces = "application/json;charset=utf-8")
	public @ResponseBody List<Comment> getAllComment(String vid) {

		List<Comment> list = vus.getAllComment(vid);

		return list;
	}

	
	
	// 3.上传视频
	/**
	 * 
	 * @param im
	 *            视频文件
	 * @param videoname
	 *            视频名字
	 * @param uid
	 *            上传用户
	 * @param TopClass
	 *            一级分类
	 * @param SubClass
	 *            二级分类
	 * @return 成功或失败 Stirng
	 * @throws IOException
	 * @throws IllegalStateException
	 */
	@RequestMapping(value = "/upload.action", produces = "application/json;charset=utf-8")
	public @ResponseBody String upload(
			@RequestParam(value = "im", required = false) MultipartFile im,
			String score, String avator, String username, String videoname,
			String uid, String topclass, String subclass)
			throws IllegalStateException, IOException {
		String result = "";

		// 设置视频名称，不能重复，可以使用uuid
		String picName = UUID.randomUUID().toString();
		// System.out.println();
		// 获取视频名
		String oriName = im.getOriginalFilename();
		// 获取图片后缀
		String extName = oriName.substring(oriName.lastIndexOf("."));

		// 开始上传
		im.transferTo(new File("/upload/mis/video/" + picName + extName));

		// 封装
		Video video = new Video();
		video.setAvator(avator);
		video.setScore(Integer.parseInt(score));
		video.setSubclass(Integer.parseInt(subclass));
		video.setTopclass(Integer.parseInt(topclass));
		video.setUid(Integer.parseInt(uid));
		video.setUsername(username);
		video.setUrl("https://www.whxlover.cn/pic/mis/video/" + picName
				+ extName);
		video.setVideoname(videoname);
		video.setVerified(0);
		int i = vus.insertVideo(video);
		if (i != 0) {
			// success
			result = "上传成功，请等待审核";
		} else {
			result = "上传失败，请重试";
		}

		return result;
	}

	
	
	// 4.下载视频
	/**
	 * 
	 * @param vid
	 *            视频id
	 * @param uid
	 *            用户id
	 * @return success or
	 */
	@RequestMapping(value = "/download.action", produces = "application/json;charset=utf-8")
	public @ResponseBody String download(String vid, String uid,
			String needscore, String score) {
		int x = Integer.valueOf(score);
		int y = Integer.valueOf(needscore);
		if (y < x) {
			// 加入数据库
			// 更新数据库
			int s = (Integer.valueOf(score)) - (Integer.valueOf(needscore));

			int i = vus.updataUserScore(uid, s + "");
			if (i > 0) {
				return "success";
			} else {
				return "fail";
			}
		} else {
			return "fail";
		}

	}

	
	
	// 7.评论和建议
	@RequestMapping(value = "/addComment.action", produces = "application/json;charset=utf-8")
	public @ResponseBody String comment(Comment coment) {
		String result = "";
		coment.setVerified(0);
		int i = vus.insertComent(coment);
		if (i > 0) {
			result = "成功，请等待审核";
		} else {
			result = "失败，请重试";
		}

		return result;
	}

	//用户上传的视频列表
	/**
	 * 
	 * @param uid 用户id
	 * @return 用户上传的视频列表
	 */
	@RequestMapping(value = "/userVideos.action", produces = "application/json;charset=utf-8")
	public @ResponseBody List<Video> userVideos(String uid) {
		List<Video> list = vus.showUserVideos(uid);
		return list;
	}

	
	
	// 查询用户---测试代码
	@RequestMapping(value = "/test.action", produces = "application/json;charset=utf-8")
	public @ResponseBody String searchUser(String username) {
		System.out.println("hahhahaha");
		return "ss";
	}

	
	
	// 5.添加历史记录
	/**
	 * 
	 * @param vid 视频id
	 *            
	 * @param uid 用户id
	 *            
	 * @return 是否加入成功
	 */
	@RequestMapping(value = "/history.action", produces = "application/json;charset=utf-8")
	public @ResponseBody String history(String vid, String uid) {
		/**
		 * 
		 */
		History history = new History();
		history.setVid(Integer.valueOf(vid));
		history.setUid(Integer.valueOf(uid));
		Video video = vus.searchVideo(vid);
		history.setSubClass(video.getSubclass());
		history.setTopClass(video.getTopclass());
		String isSuccess = vus.insertHistory(history);
		return isSuccess;
	}

	// 删除历史记录
	/**
	 * 
	 * @param vid 视频id
	 * @param uid 用户id
	 * @return
	 */
	@RequestMapping(value = "/deleteHistory.action", produces = "application/json;charset=utf-8")
	public @ResponseBody String deleteHistory(String vid, String uid) {
		String isSuccess = vus.deleteHistory(vid, uid);
		return isSuccess;
	}

	// 我的历史记录
	/**
	 * 
	 * @param uid 用户id
	 * @return 返回用户历史记录列表  倒序
	 */
	@RequestMapping(value = "/myHistory.action", produces = "application/json;charset=utf-8")
	public @ResponseBody List<Video> myHistory(String uid) {
		List<Video> videolist = new ArrayList<>();
		// 查询所有video
		List<History> list = vus.searchHistory(uid);
		// 查找video
		for (int i = 0; i < list.size(); i++) {
			Video video = vus.searchVideo(list.get(i).getVid().toString());
			videolist.add(video);
		}
		return videolist;
	}

	// 分类video查询
	/**
	 * 
	 * @param id 二级分类id
	 * @return 当前分类的video列表
	 */
	@RequestMapping(value = "/classvideo.action", produces = "application/json;charset=utf-8")
	public @ResponseBody List<Video> classvideo(String id) {

		List<Video> list = vus.searchClassVideo(id);
		return list;
	}

	// 8。投诉
	/**
	 * 
	 * @param vid 视频id
	 * @param uid 用户id
	 * @param content 投诉内容
	 * @return 成功或失败
	 */
	@RequestMapping(value = "/complain.action", produces = "application/json;charset=utf-8")
	public @ResponseBody String complain(String vid, String uid, String content) {
		Complaint complaint = new Complaint();
		complaint.setContent(content);
		complaint.setUid(Integer.valueOf(uid));
		complaint.setVid(Integer.valueOf(vid));
		complaint.setVerified(0);
		String isSuccess = vus.addComplaint(complaint);
		return isSuccess;
	}

	// 9.回复
	/**
	 * 
	 * @param vid 视频id
	 * @param username1 评论人
	 * @param username2  被评论人
	 * @param content 评论内容
	 * @return
	 */
	@RequestMapping(value = "/reply.action", produces = "application/json;charset=utf-8")
	public @ResponseBody String reply(String vid, String username1,
			String username2, String content) {
		// uid1 ������; uid2 ��������
		Comment comment = new Comment();
		comment.setVid(Integer.valueOf(vid));
		comment.setUsername1(username1);
		comment.setUsername2(username2);

		comment.setContent(content);
		String isSuccess = vus.addReply(comment);
		return isSuccess;
	}

	// 模糊查询视频
	/**
	 * 
	 * @param videoname 模糊查询内容
	 * @return 符合条件的video列表
	 */
	@RequestMapping(value = "/search.action", produces = "application/json;charset=utf-8")
	public @ResponseBody List<Video> search(String videoname) {

		List<Video> list = vus.searchByVideoName(videoname);
		return list;
	}
}
