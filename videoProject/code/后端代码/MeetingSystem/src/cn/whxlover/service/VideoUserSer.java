package cn.whxlover.service;

import java.util.List;

import cn.whxlover.pojo.Comment;
import cn.whxlover.pojo.Complaint;
import cn.whxlover.pojo.History;
import cn.whxlover.pojo.User;
import cn.whxlover.pojo.Video;

public interface VideoUserSer {



	Video searchVideo(String vid);

	int insertUser(User user);

	User searchUser(String avator);

	int insertVideo(Video video);

	User selectid(String avator);

	List<Video> searchAllvideo();


	int insertComent(Comment coment);

	
	String insertHistory(History history);



	String deleteHistory(String vid, String uid);

	String addComment(Comment comment);

	String addComplaint(Complaint complaint);

	String addReply(Comment comment);

	List<Video> showUserVideos(String uid);

	List<Comment> getAllComment(String vid);

	List<History> searchHistory(String uid);

	List<Video> searchClassVideo(String id);

	List<Video> searchByVideoName(String videoname);

	int updataUserScore(String vid, String score);
	

}
